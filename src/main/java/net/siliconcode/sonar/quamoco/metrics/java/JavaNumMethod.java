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

import net.siliconcode.sonar.quamoco.metrics.CSharpMetrics;

import org.sonar.api.measures.Measure;
import org.sonar.java.ast.api.JavaKeyword;
import org.sonar.java.ast.parser.JavaLexer;
import org.sonar.squidbridge.SquidAstVisitor;
import org.sonar.sslr.parser.LexerlessGrammar;

import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.Token;

/**
 * JavaNumMethods -
 *
 * @author isaac
 */
public class JavaNumMethod extends SquidAstVisitor<LexerlessGrammar> { // BaseTreeVisitor

    // implements
    // JavaFileScanner
    // {

    // private JavaFileScannerContext context;
    // private Map<String, Integer> map = new TreeMap<>();
    // private Stack<String> classStack = new Stack<String>();
    // private String currentClass;
    // private int totalNOM = 0;
    //
    // /*
    // * (non-Javadoc)
    // * @see
    // * org.sonar.plugins.java.api.JavaFileScanner#scanFile(org.sonar.plugins
    // * .java.api.JavaFileScannerContext)
    // */
    // @Override
    // public void scanFile(JavaFileScannerContext context)
    // {
    // this.context = context;
    // scan(context.getTree());
    // }
    //
    // /*
    // * (non-Javadoc)
    // * @see
    // * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitClass(org.sonar.
    // * plugins.java.api.tree.ClassTree)
    // */
    // @Override
    // public void visitClass(ClassTree tree)
    // {
    // super.visitClass(tree);
    // }
    //
    // /*
    // * (non-Javadoc)
    // * @see
    // * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitNewClass(org.sonar
    // * .plugins.java.api.tree.NewClassTree)
    // */
    // @Override
    // public void visitNewClass(NewClassTree tree)
    // {
    // String name = tree.identifier().toString();
    // classStack.push(name);
    // currentClass = name;
    // map.put(name, 0);
    //
    // super.visitNewClass(tree);
    //
    // classStack.pop();
    // currentClass = classStack.peek();
    // }
    //
    // /*
    // * (non-Javadoc)
    // * @see
    // * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitMethod(org.sonar
    // * .plugins.java.api.tree.MethodTree)
    // */
    // @Override
    // public void visitMethod(MethodTree tree)
    // {
    // map.put(currentClass, map.get(currentClass) + 1);
    // totalNOM += 1;
    // super.visitMethod(tree);
    // }
    //
    // /**
    // * @return
    // */
    // public Measure getTotalNOM()
    // {
    // return new Measure<Double>(JavaMetrics.NOM, (double) totalNOM);
    // }
    private int totalNOM = 0;

    /**
     * @return
     */
    public Measure getTotalNOM()
    {
        return new Measure<Double>(CSharpMetrics.NOM, (double) totalNOM);
    }

    /*
     * (non-Javadoc)
     * @see org.sonar.squidbridge.SquidAstVisitor#init()
     */
    @Override
    public void init()
    {
        subscribeTo(JavaLexer.MEMBER_DECL);
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
            for (final AstNode child : astNode.getChildren())
            {
                if (child.is(JavaLexer.METHOD_BODY) || child.is(JavaLexer.METHOD_DECLARATOR_REST))
                {
                    totalNOM += 1;
                    break;
                }
            }
        }
        super.visitNode(astNode);
    }
}
