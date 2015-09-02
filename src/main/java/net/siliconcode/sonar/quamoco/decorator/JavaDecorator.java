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

import net.siliconcode.sonar.quamoco.metrics.JavaMetrics;

import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.issue.Issue;
import org.sonar.api.measures.Measure;
import org.sonar.api.rules.Rule;
import org.sonar.api.rules.RuleFinder;

/**
 * JavaDecorator -
 * 
 * @author Isaac Griffith
 */
public class JavaDecorator extends AbstractDecoratorTemplate {

    /*
     * (non-Javadoc)
     * @see net.siliconcode.sonar.quamoco.decorator.IDecoratorTemplate#
     * collectIssueResults(org.sonar.api.rules.RuleFinder, java.lang.Iterable)
     */
    @Override
    public void collectIssueResults(final RuleFinder finder, final Iterable<Issue> issues)
    {
        if (issues == null || finder == null)
            return;

        final Iterator<Issue> issueIter = issues.iterator();

        while (issueIter.hasNext())
        {
            final Issue issue = issueIter.next();
            if (issue.ruleKey().repository().equals("findbugs") || issue.ruleKey().repository().equals("fb-contrib")
                    || issue.ruleKey().repository().equals("pmd"))
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
     * (org.sonar.api.batch.DecoratorContext)
     */
    @Override
    public void collectBaseMetrics(DecoratorContext context)
    {
        final Measure<Double> jloc = context.getMeasure(JavaMetrics.LOC);
        final Measure<Double> jnom = context.getMeasure(JavaMetrics.NOM);
        final Measure<Double> jnof = context.getMeasure(JavaMetrics.NOF);
        final Measure<Double> jnov = context.getMeasure(JavaMetrics.NOV);
        final Measure<Double> jnos = context.getMeasure(JavaMetrics.NOS);
        final Measure<Double> jnoc = context.getMeasure(JavaMetrics.NOC);
        final Measure<Double> jnot = context.getMeasure(JavaMetrics.NOT);

        updateMeasuresMap(jloc, jnom, jnof, jnov, jnos, jnoc, jnot);
    }

}
