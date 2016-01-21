/**
 * The MIT License (MIT)
 * 
 * Sonar Quamoco Plugin
 * Copyright (c) 2015 Isaac Griffith, SiliconCode, LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.siliconcode.sonar.quamoco.decorator;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.issue.Issue;
import org.sonar.api.resources.Project;
import org.sonar.api.rules.Rule;
import org.sonar.api.rules.RuleFinder;

import com.google.common.collect.Lists;

import net.siliconcode.parsers.QuamocoJavaListener;
import net.siliconcode.parsers.java.Java8Lexer;
import net.siliconcode.parsers.java.Java8Parser;
import net.siliconcode.parsers.java.Java8Parser.CompilationUnitContext;
import net.siliconcode.quamoco.codetree.CodeNode;
import net.siliconcode.quamoco.codetree.CodeTree;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.codetree.MethodNode;
import net.siliconcode.quamoco.codetree.TypeNode;
import net.siliconcode.quamoco.graph.node.FindingNode;
import net.siliconcode.sonar.quamoco.detectors.JavaQuamocoDetector;
import net.siliconcode.sonar.quamoco.detectors.QuamocoDetector;

/**
 * JavaDecorator -
 * 
 * @author Isaac Griffith
 */
public class JavaDecorator extends AbstractDecoratorTemplate {

    private static final Logger LOG = LoggerFactory.getLogger(JavaDecorator.class);

    /*
     * (non-Javadoc)
     * @see net.siliconcode.sonar.quamoco.decorator.IDecoratorTemplate#
     * collectIssueResults(org.sonar.api.rules.RuleFinder, java.lang.Iterable)
     */
    @Override
    public void collectIssueResults(String baseDir, final RuleFinder finder, final Iterable<Issue> issues)
    {
        if (issues == null || finder == null)
            return;

        final Iterator<Issue> issueIter = issues.iterator();

        while (issueIter.hasNext())
        {
            final Issue issue = issueIter.next();
            if (issue.ruleKey().repository().equals("findbugs") || issue.ruleKey().repository().equals("fb-contrib")
                    || issue.ruleKey().repository().equals("pmd"))
            {
                final Rule r = finder.findByKey(issue.ruleKey());
                String key = issue.componentKey();
                int line = issue.line();
                CodeNode location = resolveComponent(baseDir, key, line);
                if (location != null)
                {
                    FindingNode fnode = new FindingNode(graph, UUID.randomUUID().toString(), null, r.getKey(),
                            r.getName(), location);
                    if (findingsMap.containsKey(r.getName()))
                        findingsMap.get(r.getName()).add(fnode);
                    else
                    {
                        List<FindingNode> findings = new ArrayList<>();
                        findings.add(fnode);
                        findingsMap.put(r.getName(), findings);
                    }
                }
            }
        }
    }

    /**
     * @param key
     * @param line
     * @return
     */
    private CodeNode resolveComponent(String baseDir, String key, int line)
    {
        key = key.substring(key.indexOf(":") + 1);
        Path path = Paths.get(baseDir + File.separator + key);
        if (Files.exists(path) && Files.isDirectory(path))
        {
            if (path.getFileName().toString().endsWith(".java"))
            {
                FileNode fnode = tree.findFile(path.toString());
                if (line >= 1)
                {
                    TypeNode type = tree.findType(fnode, line);
                    MethodNode mnode = tree.findMethod(type, line);
                    if (mnode != null)
                        return mnode;
                    else
                        return type;
                }
                else
                    return fnode;
            }
        }
        else if (key.indexOf(".") != key.lastIndexOf("."))
        {
            TypeNode type = tree.findType(key);
            if (line >= 1 && type != null)
            {
                MethodNode mnode = tree.findMethod(type, line);
                if (mnode != null)
                    return mnode;
                if (type != null)
                    return type;
            }
        }
        return null;
    }

    public void generateProjectTree(final FileSystem fs, Project p)
    {
        ArrayList<InputFile> files = Lists.newArrayList(fs.inputFiles(fs.predicates().hasLanguage("cs")));
        ArrayList<String> fileNames = new ArrayList<>();

        files.forEach((file) -> {
            fileNames.add(file.absolutePath());
        });

        CodeTree tree = new CodeTree();
        try
        {
            ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 4);
            List<Future<?>> futures = new ArrayList<>();
            for (String file : fileNames)
            {
                futures.add(executor.submit(() -> {
                    try
                    {
                        FileNode node = new FileNode(file);
                        ParserConstructor pt = new ParserConstructor();
                        final Java8Parser parser = pt.loadFile(file);
                        final CompilationUnitContext cuContext = parser.compilationUnit();
                        final ParseTreeWalker walker = new ParseTreeWalker();
                        final QuamocoJavaListener listener = new QuamocoJavaListener(node);
                        walker.walk(listener, cuContext);

                        tree.addFile(file, node);
                    }
                    catch (IOException e)
                    {
                        LOG.warn(e.getMessage(), e);
                    }
                }));
            }
            executor.shutdown();
            for (Future<?> f : futures)
            {
                try
                {
                    f.get();
                }
                catch (InterruptedException | ExecutionException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        catch (RecognitionException e)
        {
            LOG.warn(e.getMessage(), e);
        }
    }

    private class ParserConstructor {

        private synchronized Java8Parser loadFile(final String file) throws IOException
        {
            final Java8Lexer lexer = new Java8Lexer(new ANTLRFileStream(file));
            final CommonTokenStream tokens = new CommonTokenStream(lexer);
            return new Java8Parser(tokens);
        }
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate#
     * executeQuamocoDetector()
     */
    @Override
    public void executeQuamocoDetector()
    {
        QuamocoDetector qd = new JavaQuamocoDetector(graph, metricsContext, tree);
        qd.execute();
    }

}
