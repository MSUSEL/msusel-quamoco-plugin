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
package net.siliconcode.sonar.quamoco.decorator;

import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.issue.Issue;
import org.sonar.api.rules.RuleFinder;

/**
 * NullDecorator -
 * 
 * @author Isaac Griffith
 */
public class NullDecorator implements IDecoratorTemplate {

    /*
     * (non-Javadoc)
     * @see net.siliconcode.sonar.quamoco.decorator.IDecoratorTemplate#
     * collectIssueResults(java.lang.String, org.sonar.api.rules.RuleFinder,
     * java.lang.Iterable)
     */
    @Override
    public void collectIssueResults(String baseDir, RuleFinder finder, Iterable<Issue> issues)
    {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.sonar.quamoco.decorator.IDecoratorTemplate#
     * collectBaseMetrics(org.sonar.api.batch.DecoratorContext)
     */
    @Override
    public void collectBaseMetrics(DecoratorContext context)
    {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.sonar.quamoco.decorator.IDecoratorTemplate#decorate(org.
     * sonar.api.batch.fs.FileSystem, org.sonar.api.batch.DecoratorContext,
     * org.sonar.api.rules.RuleFinder, java.lang.Iterable)
     */
    @Override
    public void decorate(FileSystem fs, DecoratorContext context, RuleFinder finder, Iterable<Issue> issues)
    {
        // TODO Auto-generated method stub

    }

}
