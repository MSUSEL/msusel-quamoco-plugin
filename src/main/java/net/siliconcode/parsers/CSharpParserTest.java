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
package net.siliconcode.parsers;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
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

import net.siliconcode.parsers.csharp.CSharp6Lexer;
import net.siliconcode.parsers.csharp.CSharp6Parser;
import net.siliconcode.parsers.csharp.CSharp6PreProcessor;
import net.siliconcode.parsers.csharp.CSharp6Parser.Compilation_unitContext;
import net.siliconcode.quamoco.codetree.CodeTree;
import net.siliconcode.quamoco.codetree.FileNode;

/**
 * ParserTest -
 *
 * @author Isaac Griffith
 */
public class CSharpParserTest {

    private static final Logger LOG = LoggerFactory.getLogger(CSharpParserTest.class);

    private CSharpParserTest()
    {
    }

    private synchronized CSharp6Parser loadFile(final String file) throws IOException
    {
        final CSharp6Lexer lexer = new CSharp6Lexer(new ANTLRFileStream(file));
        final CSharp6PreProcessor pre = new CSharp6PreProcessor(new ANTLRFileStream(file));
        final CommonTokenStream tokens = new CommonTokenStream(pre);
        return new CSharp6Parser(tokens);
    }

    public static List<String> fileList(String root)
    {
        List<String> fileNames = new ArrayList<>();
        Stack<String> directories = new Stack<>();
        directories.push(root);

        DirectoryStream.Filter<Path> filter = (Path f) -> {
            return ((Files.isDirectory(f) && !f.getFileName().toString().endsWith(".UnitTests"))
                    || f.getFileName().toString().endsWith(".cs"));
        };

        while (!directories.isEmpty())
        {
            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directories.pop()), filter))
            {
                for (Path p : directoryStream)
                {
                    if (Files.isDirectory(p))
                        directories.add(p.toAbsolutePath().toString());
                    else
                    {
                        fileNames.add(p.toAbsolutePath().toString());
                    }
                }
            }
            catch (IOException ex)
            {
                LOG.warn(ex.getMessage());
            }
        }
        return fileNames;
    }

    /**
     * @param args
     */
    public static void main(final String... args)
    {
        long start = System.currentTimeMillis();
        List<String> fileNames = fileList("/home/git/sms/FUELER");

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
                        CSharpParserTest pt = new CSharpParserTest();
                        final CSharp6Parser parser = pt.loadFile(file);
                        final Compilation_unitContext cuContext = parser.compilation_unit();
                        final ParseTreeWalker walker = new ParseTreeWalker();
                        final QuamocoCSharpListener listener = new QuamocoCSharpListener(node);
                        walker.walk(listener, cuContext);

                        tree.addFile(node);
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
        long end = System.currentTimeMillis();
        tree.printTree();

        System.out.println("\nParse took: " + (end - start) + " ms");
    }
}
