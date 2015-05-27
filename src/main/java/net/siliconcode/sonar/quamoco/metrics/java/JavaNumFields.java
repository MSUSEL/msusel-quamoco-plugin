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
package net.siliconcode.sonar.quamoco.metrics.java;

import net.siliconcode.sonar.quamoco.metrics.JavaMetrics;

import org.sonar.api.measures.Measure;
import org.sonar.java.ast.api.JavaKeyword;
import org.sonar.java.ast.parser.JavaLexer;
import org.sonar.squidbridge.SquidAstVisitor;
import org.sonar.sslr.parser.LexerlessGrammar;

import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.Token;

/**
 * JavaNumFields - Class to count the number of fields in a Java Project
 *
 * @author isaac
 */
public class JavaNumFields extends SquidAstVisitor<LexerlessGrammar> {

    private int totalNOF = 0;

    /**
     * @return
     */
    public Measure getTotalNOF()
    {
        return new Measure<Double>(JavaMetrics.NOF, (double) totalNOF);
    }

    /*
     * (non-Javadoc)
     * @see org.sonar.squidbridge.SquidAstVisitor#init()
     */
    @Override
    public void init()
    {
        subscribeTo(JavaLexer.FIELD_DECLARATION, JavaLexer.BREAK_STATEMENT, JavaLexer.CLASS_BODY,
                JavaLexer.CLASS_DECLARATION, JavaLexer.CONTINUE_STATEMENT, JavaLexer.DO_STATEMENT, JavaLexer.ENUM_BODY,
                JavaLexer.ENUM_CONSTANT, JavaLexer.ENUM_DECLARATION, JavaLexer.FIELD_DECLARATION,
                JavaLexer.FOR_STATEMENT, JavaLexer.IF_STATEMENT, JavaLexer.INTERFACE_BODY,
                JavaLexer.INTERFACE_DECLARATION, JavaLexer.INTERFACE_MEMBER_DECL, JavaLexer.MEMBER_DECL,
                JavaLexer.INTERFACE_METHOD_OR_FIELD_DECL, JavaLexer.LABELED_STATEMENT,
                JavaLexer.LOCAL_VARIABLE_DECLARATION_STATEMENT, JavaLexer.METHOD_BODY, JavaLexer.RETURN_STATEMENT,
                JavaLexer.STATEMENT, JavaLexer.STATEMENT_EXPRESSION, JavaLexer.SWITCH_BLOCK_STATEMENT_GROUP,
                JavaLexer.SWITCH_STATEMENT, JavaLexer.SYNCHRONIZED_STATEMENT, JavaLexer.THROW_STATEMENT,
                JavaLexer.TRY_STATEMENT, JavaLexer.TYPE_DECLARATION, JavaLexer.WHILE_STATEMENT);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.squidbridge.SquidAstVisitor#visitNode(com.sonar.sslr.api.AstNode
     * )
     */
    @Override
    public void visitNode(final AstNode astNode)
    {
        boolean isStatic = false;
        for (final Token sib : astNode.getTokens())
        {
            if (sib.getType().equals(JavaKeyword.STATIC))
            {
                isStatic = true;
                break;
            }
        }

        if (!isStatic)
        {
            totalNOF += 1;
        }

        super.visitNode(astNode);
    }
}
