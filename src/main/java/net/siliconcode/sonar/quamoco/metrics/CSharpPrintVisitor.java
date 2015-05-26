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
package net.siliconcode.sonar.quamoco.metrics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import org.sonar.check.Rule;
import org.sonar.squidbridge.SquidAstVisitor;

import com.google.common.collect.Sets;
import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.GenericTokenType;
import com.sonar.sslr.api.Grammar;
import com.sonar.sslr.api.Token;

/**
 * CSharpPrintVisitor -
 * 
 * @author Isaac Griffith
 */
@Rule(key = "PrintTree", name = "Prints Syntax Tree", description = "This rule prints the syntax tree", tags = { "print" })
public class CSharpPrintVisitor extends SquidAstVisitor<Grammar> {

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.squidbridge.SquidAstVisitor#visitFile(com.sonar.sslr.api.AstNode
     * )
     */
    @Override
    public void visitFile(AstNode astNode)
    {
        print(astNode);
        super.visitFile(astNode);
    }

    private void print(AstNode astNode)
    {
        Queue<Token> tokens = new LinkedList<>();
        Queue<AstNode> nodeQ = new LinkedList<>();
        Set<Integer> linesOfCode = Sets.newHashSet();

        nodeQ.offer(astNode);
        while (!nodeQ.isEmpty())
        {
            AstNode node = nodeQ.poll();
            nodeQ.addAll(node.getChildren());
            tokens.offer(astNode.getToken());
        }

        while (!tokens.isEmpty())
        {
            Token token = tokens.poll();
            if (token.getType().equals(GenericTokenType.EOF))
            {
                break;
            }

            System.out.println(token.getType());
            // linesOfCode.add(token.getLine());
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
    }

}
