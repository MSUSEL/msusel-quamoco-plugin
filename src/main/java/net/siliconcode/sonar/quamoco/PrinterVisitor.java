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
package net.siliconcode.sonar.quamoco;

import java.util.List;

import javax.annotation.Nullable;

import org.apache.commons.lang.StringUtils;
import org.sonar.plugins.java.api.tree.BaseTreeVisitor;
import org.sonar.plugins.java.api.tree.Tree;

/**
 * PrinterVisitor -
 *
 * @author Isaac Griffith
 */
public class PrinterVisitor extends BaseTreeVisitor {

    private static final int INDENT_SPACES = 2;

    public static String print(final Tree tree)
    {
        final PrinterVisitor pv = new PrinterVisitor();
        pv.scan(tree);
        return pv.sb.toString();
    }

    private final StringBuilder sb;

    private int                 indentLevel;

    public PrinterVisitor()
    {
        sb = new StringBuilder();
        indentLevel = 0;
    }

    private StringBuilder indent()
    {
        return sb.append(StringUtils.leftPad("", INDENT_SPACES * indentLevel));
    }

    @Override
    protected void scan(final List<? extends Tree> trees)
    {
        if (!trees.isEmpty())
        {
            sb.deleteCharAt(sb.length() - 1);
            sb.append(" : [\n");
            super.scan(trees);
            indent().append("]\n");
        }
    }

    @Override
    protected void scan(@Nullable final Tree tree)
    {
        if (tree != null)
        {
            final String nodeName = tree.getClass().getInterfaces()[0].getSimpleName();
            indent().append(nodeName).append("\n");
        }
        indentLevel++;
        super.scan(tree);
        indentLevel--;
    }
}
