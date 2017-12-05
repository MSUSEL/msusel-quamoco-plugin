/**
 * The MIT License (MIT)
 *
 * MSUSEL Sonar Quamoco Plugin
 * Copyright (c) 2015-2017 Montana State University, Gianforte School of Computing,
 * Software Engineering Laboratory
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
package edu.montana.gsoc.msusel.codetree.sonar.quamoco.sensor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import edu.montana.gsoc.msusel.codetree.sonar.quamoco.QuamocoMetrics;
import edu.montana.gsoc.msusel.codetree.sonar.quamoco.QuamocoSensor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.sonar.api.batch.fs.FileSystem;

import com.sparqline.codetree.node.FileNode;
import com.sparqline.codetree.node.ProjectNode;
import com.sparqline.parsers.JavaCodeTreeBuilder;
import com.sparqline.parsers.java8.Java8Lexer;
import com.sparqline.parsers.java8.Java8Parser;
import com.sparqline.parsers.java8.Java8Parser.CompilationUnitContext;

/**
 * Quamoco Java basic metrics and code tree extraction sensor.
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class QuamocoJavaSensor extends QuamocoSensor {

    /**
     * Constructs a new QuamocoJavaSensor.
     * 
     * @param fs
     *            Object injected by SonarQube to provide access to the file
     *            system
     * @param metrics
     *            QuamocoMetrics instance which provides details about the
     *            metrics that the Quamoco System can store
     */
    public QuamocoJavaSensor(final FileSystem fs, final QuamocoMetrics metrics)
    {
        super(metrics);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void utilizeParser(String key, final String file, final ProjectNode pnode)
    {
        try
        {
            // TODO Make this code specific to subclasses
            final FileNode node = FileNode.builder(key).create();
            int length = 0;
            try
            {
                length = Files.readAllLines(Paths.get(file)).size();
            }
            catch (IOException e)
            {
                // TODO Log this
            }
            // node.setEnd(length);
            // node.setStart(1);
            pnode.addFile(node);

            final JavaParserConstructor pt = new JavaParserConstructor();
            final Java8Parser parser = pt.loadFile(file);
            final CompilationUnitContext cuContext = parser.compilationUnit();
            final ParseTreeWalker walker = new ParseTreeWalker();
            final JavaCodeTreeBuilder listener = new JavaCodeTreeBuilder(node);
            walker.walk(listener, cuContext);
        }
        catch (final IOException e)
        {
            getLogger().warn(e.getMessage(), e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getLanguage()
    {
        return "java";
    }

    /**
     * Constructs the Java parser needed to extract code tree information
     *
     * @author Isaac Griffith
     * @version 1.1.1
     */
    private class JavaParserConstructor {

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
