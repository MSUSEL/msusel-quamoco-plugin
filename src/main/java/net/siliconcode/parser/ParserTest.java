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
package net.siliconcode.parser;

import java.io.IOException;

import net.siliconcode.parser.CSharp4Parser.Compilation_unitContext;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ParserTest -
 *
 * @author Isaac Griffith
 */
public class ParserTest {

    private static final Logger LOG = LoggerFactory.getLogger(ParserTest.class);

    private ParserTest()
    {
    }

    private static CSharp4Parser loadFile(final String file) throws IOException
    {
        final CSharp4Lexer lexer = new CSharp4Lexer(new ANTLRFileStream(file));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new CSharp4Parser(tokens);
    }

    public static void main(final String... args)
    {
        try
        {
            final CSharp4Parser parser = loadFile("/home/isaac/git/tester-c-sharp/TESTER/Core/UseCase.cs");
            final Compilation_unitContext cuContext = parser.compilation_unit();
            final ParseTreeWalker walker = new ParseTreeWalker();
            final QuamocoCSharpListener listener = new QuamocoCSharpListener();
            walker.walk(listener, cuContext);
        }
        catch (RecognitionException | IOException e)
        {
            LOG.warn(e.getMessage(), e);
        }
    }
}
