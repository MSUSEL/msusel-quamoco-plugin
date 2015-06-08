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

import java.util.Iterator;

import net.siliconcode.sonar.quamoco.metrics.CSharpMetrics;

import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.issue.Issue;
import org.sonar.api.measures.Measure;
import org.sonar.api.rules.Rule;
import org.sonar.api.rules.RuleFinder;

/**
 * CSharpDecorator -
 * 
 * @author Isaac Griffith
 */
public class CSharpDecorator extends AbstractDecoratorTemplate {

    /*
     * (non-Javadoc)
     * @see net.siliconcode.sonar.quamoco.decorator.IDecoratorTemplate#
     * collectIssueResults(org.sonar.api.rules.RuleFinder, java.lang.Iterable)
     */
    @Override
    public void collectIssueResults(final RuleFinder finder, final Iterable<Issue> issues)
    {
        final Iterator<Issue> issueIter = issues.iterator();

        while (issueIter.hasNext())
        {
            final Issue issue = issueIter.next();
            if (issue.ruleKey().repository().equals("fxcop") || issue.ruleKey().repository().equals("stylecop"))
            {
                final Rule r = finder.findByKey(issue.ruleKey());
                incrementCount(r.getName());
            }
        }
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.sonar.quamoco.decorator.IDecoratorTemplate#collectBaseMetrics
     * ()
     */
    @Override
    public void collectBaseMetrics(DecoratorContext context)
    {
        final Measure<Double> csloc = context.getMeasure(CSharpMetrics.LOC);
        final Measure<Double> csnom = context.getMeasure(CSharpMetrics.NOM);
        final Measure<Double> csnoc = context.getMeasure(CSharpMetrics.NOC);
        final Measure<Double> csnof = context.getMeasure(CSharpMetrics.NOF);
        final Measure<Double> csnos = context.getMeasure(CSharpMetrics.NOS);
        final Measure<Double> csnot = context.getMeasure(CSharpMetrics.NOT);

        updateMeasuresMap(csloc, csnom, csnoc, csnof, csnos, csnot);
    }

}
