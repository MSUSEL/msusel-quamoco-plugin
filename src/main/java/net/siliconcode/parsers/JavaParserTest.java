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

import net.siliconcode.parsers.java.Java8Lexer;
import net.siliconcode.parsers.java.Java8Parser;
import net.siliconcode.parsers.java.Java8Parser.CompilationUnitContext;
import net.siliconcode.quamoco.codetree.CodeTree;
import net.siliconcode.quamoco.codetree.FileNode;

/**
 * ParserTest -
 *
 * @author Isaac Griffith
 */
public class JavaParserTest {

    private static final Logger LOG = LoggerFactory.getLogger(JavaParserTest.class);

    private JavaParserTest() {
    }

    private static Java8Parser loadFile(final String file) throws IOException {
        final Java8Lexer lexer = new Java8Lexer(new ANTLRFileStream(file));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new Java8Parser(tokens);
    }

    public static List<String> fileList(final String root) {
        final List<String> fileNames = new ArrayList<>();
        final Stack<String> directories = new Stack<>();
        directories.push(root);

        final DirectoryStream.Filter<Path> filter = (final Path f) -> {
            return Files.isDirectory(f) || f.getFileName().toString().endsWith(".java");
        };

        while (!directories.isEmpty()) {
            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directories.pop()),
                    filter)) {
                for (final Path p : directoryStream) {
                    System.out.println(p.toAbsolutePath().toString());
                    if (Files.isDirectory(p)) {
                        directories.add(p.toAbsolutePath().toString());
                    }
                    else {
                        fileNames.add(p.toAbsolutePath().toString());
                    }
                }
            }
            catch (final IOException ex) {
                JavaParserTest.LOG.warn(ex.getMessage());
            }
        }
        return fileNames;
    }

    public static void main(final String[] args) {
        final long start = System.currentTimeMillis();
        final List<String> fileNames = JavaParserTest.fileList("/home/git/research/TrueRefactor/src");

        System.out.println(fileNames.size());

        final CodeTree tree = new CodeTree();

        try {
            final ExecutorService executor = Executors
                    .newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 4);
            final List<Future<?>> futures = new ArrayList<>();
            for (final String file : fileNames) {
                futures.add(executor.submit(() -> {
                    utilizeParser(file, tree);
                    ;
                }));
            }
            executor.shutdown();
            for (final Future<?> f : futures) {
                try {
                    f.get();
                }
                catch (InterruptedException | ExecutionException e) {
                    JavaParserTest.LOG.warn(e.getMessage(), e);
                    continue;
                }
            }
        }
        catch (final RecognitionException e) {
            JavaParserTest.LOG.warn(e.getMessage(), e);
        }
        final long end = System.currentTimeMillis();
        tree.printTree();

        JavaParserTest.LOG.info("Took: " + (end - start) + " ms");
    }

    public static void utilizeParser(final String file, final CodeTree tree) {
        try {
            // TODO Make this code specific to subclasses
            final FileNode node = new FileNode(file);
            tree.addFile(node);

            final Java8Parser parser = JavaParserTest.loadFile(file);
            final CompilationUnitContext cuContext = parser.compilationUnit();
            final ParseTreeWalker walker = new ParseTreeWalker();
            tree.addFile(node);
            final QuamocoJavaListener listener = new QuamocoJavaListener(node);
            walker.walk(listener, cuContext);
            walker.walk(listener, cuContext);
        }
        catch (final IOException e) {
            LOG.warn(e.getMessage(), e);
        }
    }
}
