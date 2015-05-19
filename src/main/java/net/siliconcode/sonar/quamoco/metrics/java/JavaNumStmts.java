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

import java.util.Map;
import java.util.Stack;

import net.siliconcode.sonar.quamoco.metrics.JavaMetrics;

import org.sonar.api.measures.Measure;
import org.sonar.plugins.java.api.JavaFileScanner;
import org.sonar.plugins.java.api.JavaFileScannerContext;
import org.sonar.plugins.java.api.tree.AssertStatementTree;
import org.sonar.plugins.java.api.tree.BaseTreeVisitor;
import org.sonar.plugins.java.api.tree.BreakStatementTree;
import org.sonar.plugins.java.api.tree.ClassTree;
import org.sonar.plugins.java.api.tree.ContinueStatementTree;
import org.sonar.plugins.java.api.tree.DoWhileStatementTree;
import org.sonar.plugins.java.api.tree.EmptyStatementTree;
import org.sonar.plugins.java.api.tree.ExpressionStatementTree;
import org.sonar.plugins.java.api.tree.ForEachStatement;
import org.sonar.plugins.java.api.tree.ForStatementTree;
import org.sonar.plugins.java.api.tree.IfStatementTree;
import org.sonar.plugins.java.api.tree.LabeledStatementTree;
import org.sonar.plugins.java.api.tree.MethodTree;
import org.sonar.plugins.java.api.tree.NewClassTree;
import org.sonar.plugins.java.api.tree.ReturnStatementTree;
import org.sonar.plugins.java.api.tree.SwitchStatementTree;
import org.sonar.plugins.java.api.tree.SynchronizedStatementTree;
import org.sonar.plugins.java.api.tree.ThrowStatementTree;
import org.sonar.plugins.java.api.tree.TryStatementTree;
import org.sonar.plugins.java.api.tree.WhileStatementTree;

/**
 * JavaNumStmts - Class to count the number of statements in a Java Project.
 * 
 * @author Isaac Griffith
 */
public class JavaNumStmts extends BaseTreeVisitor implements JavaFileScanner {

    private JavaFileScannerContext context;
    private int                    totalNOS = 0;
    private Map<String, Integer>   map;
    private Stack<String>          classStack;
    private String                 currentClass;
    private boolean                inMethod = false;

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.JavaFileScanner#scanFile(org.sonar.plugins
     * .java.api.JavaFileScannerContext)
     */
    @Override
    public void scanFile(JavaFileScannerContext context)
    {
        this.context = context;
        scan(context.getTree());
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitClass(org.sonar.
     * plugins.java.api.tree.ClassTree)
     */
    @Override
    public void visitClass(ClassTree tree)
    {
        // TODO Auto-generated method stub
        super.visitClass(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitNewClass(org.sonar
     * .plugins.java.api.tree.NewClassTree)
     */
    @Override
    public void visitNewClass(NewClassTree tree)
    {
        // TODO Auto-generated method stub
        super.visitNewClass(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitMethod(org.sonar
     * .plugins.java.api.tree.MethodTree)
     */
    @Override
    public void visitMethod(MethodTree tree)
    {
        // TODO Auto-generated method stub
        super.visitMethod(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitEmptyStatement(org
     * .sonar.plugins.java.api.tree.EmptyStatementTree)
     */
    @Override
    public void visitEmptyStatement(EmptyStatementTree tree)
    {
        // TODO Auto-generated method stub
        super.visitEmptyStatement(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitLabeledStatement
     * (org.sonar.plugins.java.api.tree.LabeledStatementTree)
     */
    @Override
    public void visitLabeledStatement(LabeledStatementTree tree)
    {
        // TODO Auto-generated method stub
        super.visitLabeledStatement(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitExpressionStatement
     * (org.sonar.plugins.java.api.tree.ExpressionStatementTree)
     */
    @Override
    public void visitExpressionStatement(ExpressionStatementTree tree)
    {
        // TODO Auto-generated method stub
        super.visitExpressionStatement(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitIfStatement(org.
     * sonar.plugins.java.api.tree.IfStatementTree)
     */
    @Override
    public void visitIfStatement(IfStatementTree tree)
    {
        // TODO Auto-generated method stub
        super.visitIfStatement(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitAssertStatement(
     * org.sonar.plugins.java.api.tree.AssertStatementTree)
     */
    @Override
    public void visitAssertStatement(AssertStatementTree tree)
    {
        // TODO Auto-generated method stub
        super.visitAssertStatement(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitSwitchStatement(
     * org.sonar.plugins.java.api.tree.SwitchStatementTree)
     */
    @Override
    public void visitSwitchStatement(SwitchStatementTree tree)
    {
        // TODO Auto-generated method stub
        super.visitSwitchStatement(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitWhileStatement(org
     * .sonar.plugins.java.api.tree.WhileStatementTree)
     */
    @Override
    public void visitWhileStatement(WhileStatementTree tree)
    {
        // TODO Auto-generated method stub
        super.visitWhileStatement(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitDoWhileStatement
     * (org.sonar.plugins.java.api.tree.DoWhileStatementTree)
     */
    @Override
    public void visitDoWhileStatement(DoWhileStatementTree tree)
    {
        // TODO Auto-generated method stub
        super.visitDoWhileStatement(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitForStatement(org
     * .sonar.plugins.java.api.tree.ForStatementTree)
     */
    @Override
    public void visitForStatement(ForStatementTree tree)
    {
        // TODO Auto-generated method stub
        super.visitForStatement(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitForEachStatement
     * (org.sonar.plugins.java.api.tree.ForEachStatement)
     */
    @Override
    public void visitForEachStatement(ForEachStatement tree)
    {
        // TODO Auto-generated method stub
        super.visitForEachStatement(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitBreakStatement(org
     * .sonar.plugins.java.api.tree.BreakStatementTree)
     */
    @Override
    public void visitBreakStatement(BreakStatementTree tree)
    {
        // TODO Auto-generated method stub
        super.visitBreakStatement(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitContinueStatement
     * (org.sonar.plugins.java.api.tree.ContinueStatementTree)
     */
    @Override
    public void visitContinueStatement(ContinueStatementTree tree)
    {
        // TODO Auto-generated method stub
        super.visitContinueStatement(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitReturnStatement(
     * org.sonar.plugins.java.api.tree.ReturnStatementTree)
     */
    @Override
    public void visitReturnStatement(ReturnStatementTree tree)
    {
        // TODO Auto-generated method stub
        super.visitReturnStatement(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitThrowStatement(org
     * .sonar.plugins.java.api.tree.ThrowStatementTree)
     */
    @Override
    public void visitThrowStatement(ThrowStatementTree tree)
    {
        // TODO Auto-generated method stub
        super.visitThrowStatement(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitSynchronizedStatement
     * (org.sonar.plugins.java.api.tree.SynchronizedStatementTree)
     */
    @Override
    public void visitSynchronizedStatement(SynchronizedStatementTree tree)
    {
        // TODO Auto-generated method stub
        super.visitSynchronizedStatement(tree);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitTryStatement(org
     * .sonar.plugins.java.api.tree.TryStatementTree)
     */
    @Override
    public void visitTryStatement(TryStatementTree tree)
    {
        // TODO Auto-generated method stub
        super.visitTryStatement(tree);
    }

    /**
     * @return
     */
    public Measure<Double> getTotalNOS()
    {
        return new Measure<Double>(JavaMetrics.NOS, (double) totalNOS);
    }

}
