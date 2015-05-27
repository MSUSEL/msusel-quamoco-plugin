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

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import net.siliconcode.sonar.quamoco.code.CodeEntity;
import net.siliconcode.sonar.quamoco.code.CodeEntityType;
import net.siliconcode.sonar.quamoco.code.CodeTree;

import org.sonar.java.ast.parser.JavaLexer;
import org.sonar.squidbridge.SquidAstVisitor;
import org.sonar.sslr.parser.LexerlessGrammar;

import com.google.common.collect.Sets;
import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.AstNodeType;
import com.sonar.sslr.api.GenericTokenType;
import com.sonar.sslr.api.Token;

/**
 * JavaMemberExtractor -
 *
 * @author Isaac Griffith
 */
public class JavaMemberExtractor extends SquidAstVisitor<LexerlessGrammar> {

    Stack<CodeEntity> stack = new Stack<>();
    private CodeTree  tree;

    public JavaMemberExtractor()
    {
    }

    public int getLinesOfCode(final AstNode astNode)
    {
        final Queue<Token> tokens = new LinkedList<>();
        final Queue<AstNode> nodeQ = new LinkedList<>();
        final Set<Integer> linesOfCode = Sets.newHashSet();

        nodeQ.offer(astNode);
        while (!nodeQ.isEmpty())
        {
            final AstNode node = nodeQ.poll();
            nodeQ.addAll(node.getChildren());
            tokens.offer(astNode.getToken());
        }

        while (!tokens.isEmpty())
        {
            final Token token = tokens.poll();
            if (token.getType().equals(GenericTokenType.EOF))
            {
                break;
            }

            linesOfCode.add(token.getLine());
            // List<Trivia> trivias = token.getTrivia();
            // for (Trivia trivia : trivias)
            // {
            // if (trivia.isComment())
            // {
            // int baseLine = trivia.getToken().getLine();
            // String[] lines =
            // trivia.getToken().getOriginalValue().split("(\r)?\n|\r", -1);
            // for (int i = 0; i < lines.length; i++)
            // {
            // linesOfComments.add(baseLine + i);
            // }
            // }
            // }
        }

        return linesOfCode.size();
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
        super.init();
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.squidbridge.SquidAstVisitor#leaveFile(com.sonar.sslr.api.AstNode
     * )
     */
    @Override
    public void leaveFile(final AstNode astNode)
    {
        // TODO Auto-generated method stub
        super.leaveFile(astNode);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.squidbridge.SquidAstVisitor#leaveNode(com.sonar.sslr.api.AstNode
     * )
     */
    @Override
    public void leaveNode(final AstNode astNode)
    {
        // TODO Auto-generated method stub
        super.leaveNode(astNode);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.squidbridge.SquidAstVisitor#visitFile(com.sonar.sslr.api.AstNode
     * )
     */
    @Override
    public void visitFile(final AstNode astNode)
    {
        // TODO Auto-generated method stub
        super.visitFile(astNode);
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
        final AstNodeType type = astNode.getType();
        System.out.println(type);
        if (astNode.is(JavaLexer.CLASS_DECLARATION))
        {
            final String name = astNode.getChildren(JavaLexer.IDENTIFIER_OR_METHOD_INVOCATION).get(0).getTokenValue();
            System.out.println("Found class: " + name);
            System.out.println("It has a body: " + astNode.hasDescendant(JavaLexer.CLASS_BODY_DECLARATION));
            final CodeEntity ce = new CodeEntity(name, CodeEntityType.CLASS, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
            if (stack.isEmpty())
            {
                stack.push(ce);
            }
        }
        else if (astNode.is(JavaLexer.CLASS_BODY))
        {
        }
        else if (astNode.is(JavaLexer.INTERFACE_DECLARATION))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.INTERFACE, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.INTERFACE_BODY))
        {

        }
        else if (astNode.is(JavaLexer.ENUM_DECLARATION))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.ENUM, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.ENUM_BODY))
        {
        }
        else if (astNode.is(JavaLexer.ENUM_CONSTANT))
        {
        }
        else if (astNode.is(JavaLexer.FIELD_DECLARATION))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.FIELD, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.INTERFACE_MEMBER_DECL))
        {
        }
        else if (astNode.is(JavaLexer.MEMBER_DECL))
        {

        }
        else if (astNode.is(JavaLexer.INTERFACE_METHOD_OR_FIELD_DECL))
        {
        }
        else if (astNode.is(JavaLexer.METHOD_BODY))
        {
        }
        else if (astNode.is(JavaLexer.STATEMENT))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.CATCH_CLAUSE))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.BREAK_STATEMENT))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.RETURN_STATEMENT))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.LABELED_STATEMENT))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.SWITCH_STATEMENT))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.THROW_STATEMENT))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.TRY_STATEMENT))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.WHILE_STATEMENT))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.SYNCHRONIZED_STATEMENT))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.STATEMENT_EXPRESSION))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.SWITCH_BLOCK_STATEMENT_GROUP))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.LOCAL_VARIABLE_DECLARATION_STATEMENT))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.CONTINUE_STATEMENT))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.DO_STATEMENT))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.FOR_STATEMENT))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.IF_STATEMENT))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        else if (astNode.is(JavaLexer.FINALLY_))
        {
            final CodeEntity ce = new CodeEntity(null, CodeEntityType.STATEMENT, astNode.getTokenLine(), astNode
                    .getLastToken().getLine());
        }
        super.visitNode(astNode);
    }
}
