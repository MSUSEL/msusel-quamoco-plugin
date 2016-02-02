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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
import org.sonar.api.resources.Project;

import com.google.common.collect.Lists;

import net.siliconcode.parsers.QuamocoJavaListener;
import net.siliconcode.parsers.java.Java8Lexer;
import net.siliconcode.parsers.java.Java8Parser;
import net.siliconcode.parsers.java.Java8Parser.CompilationUnitContext;
import net.siliconcode.quamoco.codetree.CodeTree;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.sonar.quamoco.detectors.JavaQuamocoDetector;
import net.siliconcode.sonar.quamoco.detectors.QuamocoDetector;

/**
 * JavaDecorator -
 * 
 * @author Isaac Griffith
 */
public class JavaDecorator extends AbstractDecoratorTemplate {

    private static final Logger LOG  = LoggerFactory.getLogger(JavaDecorator.class);
    private static final String LANG = "java";
    private static final String EXT  = ".java";

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

    /*
     * (non-Javadoc)
     * @see net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate#
     * getExtension()
     */
    @Override
    protected String getExtension()
    {
        return EXT;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate#
     * getRepoNames()
     */
    @Override
    protected List<String> getRepoNames()
    {
        List<String> list = Lists.newArrayList();
        list.add("findbugs");
        list.add("fb-contrib");
        list.add("pmd");
        return list;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate#
     * getLanguage()
     */
    @Override
    protected String getLanguage()
    {
        return LANG;
    }

    /**
     * @return
     */
    @Override
    protected Logger getLogger()
    {
        return LOG;
    }

    /**
     * @param fs
     * @param p
     */
    @Override
    public void generateProjectTree(final FileSystem fs, Project p)
    {
        ArrayList<InputFile> files = Lists.newArrayList(fs.inputFiles(fs.predicates().hasLanguage(getLanguage())));
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
                        // TODO Make this code specific to subclasses
                        FileNode node = new FileNode(file);
                        tree.addFile(node);

                        ParserConstructor pt = new ParserConstructor();
                        final Java8Parser parser = pt.loadFile(file);
                        final CompilationUnitContext cuContext = parser.compilationUnit();
                        final ParseTreeWalker walker = new ParseTreeWalker();
                        final QuamocoJavaListener listener = new QuamocoJavaListener(node);
                        walker.walk(listener, cuContext);
                    }
                    catch (IOException e)
                    {
                        getLogger().warn(e.getMessage(), e);
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
            getLogger().warn(e.getMessage(), e);
        }
    }

    /**
     * ParserConstructor
     * 
     * @author Isaac Griffith
     */
    private class ParserConstructor {

        /**
         * @param file
         * @return
         * @throws IOException
         */
        private synchronized Java8Parser loadFile(final String file) throws IOException
        {
            final Java8Lexer lexer = new Java8Lexer(new ANTLRFileStream(file));
            final CommonTokenStream tokens = new CommonTokenStream(lexer);
            return new Java8Parser(tokens);
        }
    }
}
