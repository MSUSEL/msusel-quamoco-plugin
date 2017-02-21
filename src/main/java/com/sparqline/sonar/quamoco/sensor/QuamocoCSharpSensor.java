/**
 * The MIT License (MIT)
 *
 * SparQLine Analytics Sonar Quamoco Plugin
 * Copyright (c) 2015-2017 Isaac Griffith, SparQLine Analytics, LLC
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
package com.sparqline.sonar.quamoco.sensor;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.sparqline.codetree.node.FileNode;
import com.sparqline.codetree.node.ProjectNode;
import com.sparqline.parsers.QuamocoCSharpListener;
import com.sparqline.parsers.csharp.CSharp6Lexer;
import com.sparqline.parsers.csharp.CSharp6Parser;
import com.sparqline.parsers.csharp.CSharp6Parser.Compilation_unitContext;
import com.sparqline.parsers.csharp.CSharp6PreProcessor;
import com.sparqline.sonar.quamoco.QuamocoMetrics;
import com.sparqline.sonar.quamoco.QuamocoSensor;

/**
 * Quamoco C# basic metrics and code tree extraction sensor.
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class QuamocoCSharpSensor extends QuamocoSensor {

    /**
     * Constructs a new QuamocoCSharpSensor.
     * 
     * @param fs
     *            Object injected by SonarQube to provide access to the file
     *            system
     * @param metrics
     *            QuamocoMetrics instance which provides details about the
     *            metrics that the Quamoco System can store
     */
    public QuamocoCSharpSensor(final QuamocoMetrics metrics)
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
            final FileNode node = new FileNode(key);
            pnode.addFile(node);

            final CSharpParserConstructor pt = new CSharpParserConstructor();
            final CSharp6Parser parser = pt.loadFile(file);
            final Compilation_unitContext cuContext = parser.compilation_unit();
            final ParseTreeWalker walker = new ParseTreeWalker();
            final QuamocoCSharpListener listener = new QuamocoCSharpListener(node);
            walker.walk(listener, cuContext);
        }
        catch (final IOException e)
        {
            getLogger().warn(e.getMessage(), e);
        }
    }

    /**
     * ParserConstructor -
     *
     * @author Isaac Griffith
     */
    private class CSharpParserConstructor {

        /**
         * @param file
         * @return
         * @throws IOException
         */
        private synchronized CSharp6Parser loadFile(final String file) throws IOException
        {
            final CSharp6Lexer lexer = new CSharp6Lexer(new ANTLRFileStream(file));
            final CSharp6PreProcessor pre = new CSharp6PreProcessor(new ANTLRFileStream(file));
            final CommonTokenStream tokens = new CommonTokenStream(pre);
            return new CSharp6Parser(tokens);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getLanguage()
    {
        return "cs";
    }
}
