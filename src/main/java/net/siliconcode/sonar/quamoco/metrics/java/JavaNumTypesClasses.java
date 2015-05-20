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
import org.sonar.plugins.java.api.JavaFileScanner;
import org.sonar.plugins.java.api.JavaFileScannerContext;
import org.sonar.plugins.java.api.tree.BaseTreeVisitor;
import org.sonar.plugins.java.api.tree.ClassTree;
import org.sonar.plugins.java.api.tree.Tree.Kind;

/**
 * JavaNumTypesClasses - Class to count the number of types (Interfaces, Enums,
 * and Classes) and the Number of Classes (Classes and Enums) in a Java project
 *
 * @author Isaac Griffith
 */
public class JavaNumTypesClasses extends BaseTreeVisitor implements JavaFileScanner {

    private JavaFileScannerContext context;
    private int                    totalNOC = 0;
    private int                    totalNOT = 0;

    /**
     * @return
     */
    public Measure<Double> getTotalNOC()
    {
        return new Measure<Double>(JavaMetrics.NOF, (double) totalNOC);
    }

    /**
     * @return
     */
    public int getTotalNumClasses()
    {
        return totalNOC;
    }

    /**
     * @return
     */
    public int getTotalNumTypes()
    {
        return totalNOT;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.JavaFileScanner#scanFile(org.sonar.plugins
     * .java.api.JavaFileScannerContext)
     */
    @Override
    public void scanFile(final JavaFileScannerContext context)
    {
        this.context = context;
        context.getFile().toString();
        scan(context.getTree());
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.plugins.java.api.tree.BaseTreeVisitor#visitClass(org.sonar.
     * plugins.java.api.tree.ClassTree)
     */
    @Override
    public void visitClass(final ClassTree tree)
    {
        if (tree.is(Kind.INTERFACE))
        {
            totalNOT += 1;
        }
        else
        {
            totalNOC += 1;
            totalNOT += 1;
        }
    }
}
