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

    private JavaParserTest()
    {
    }

    private static Java8Parser loadFile(final String file) throws IOException
    {
        final Java8Lexer lexer = new Java8Lexer(new ANTLRFileStream(file));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new Java8Parser(tokens);
    }

    public static void main(final String[] args)
    {
        long start = System.currentTimeMillis();
        try
        {
            String fileName = "/home/git/sonar plugins/sonar-quamoco-plugin/src/main/java/net/siliconcode/parsers/java/Java8Parser.java";
            final Java8Parser parser = loadFile(fileName);
            final CompilationUnitContext cuContext = parser.compilationUnit();
            final ParseTreeWalker walker = new ParseTreeWalker();
            CodeTree tree = new CodeTree();
            FileNode root = new FileNode(fileName);
            tree.addFile(fileName, root);
            final QuamocoJavaListener listener = new QuamocoJavaListener(root);
            walker.walk(listener, cuContext);

            tree.printTree();
            System.out.println();
        }
        catch (RecognitionException | IOException e)
        {
            LOG.warn(e.getMessage(), e);
        }
        long end = System.currentTimeMillis();

        LOG.info("Took: " + (end - start) + " ms");
    }
}
