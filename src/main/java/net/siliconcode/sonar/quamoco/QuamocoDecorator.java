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

import java.io.File;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

import net.siliconcode.quamoco.aggregator.DataExtractor;
import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.qmr.QualityModelResult;
import net.siliconcode.sonar.quamoco.metrics.CSharpMetrics;
import net.siliconcode.sonar.quamoco.metrics.JavaMetrics;

import org.sonar.api.batch.Decorator;
import org.sonar.api.batch.DecoratorBarriers;
import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.batch.DependsUpon;
import org.sonar.api.batch.fs.FilePredicates;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile.Type;
import org.sonar.api.issue.Issue;
import org.sonar.api.issue.ProjectIssues;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Measure;
import org.sonar.api.resources.Project;
import org.sonar.api.resources.Resource;
import org.sonar.api.rules.Rule;
import org.sonar.api.rules.RuleFinder;
import org.sonar.api.rules.Violation;

import com.google.common.collect.Iterables;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * QuamocoDecorator -
 * 
 * @author isaac
 */
@DependsUpon(value = DecoratorBarriers.ISSUES_TRACKED)
public class QuamocoDecorator implements Decorator {

    private FileSystem    files;
    private ProjectIssues projectIssues;
    private RuleFinder    finder;

    public QuamocoDecorator(FileSystem files, ProjectIssues projectIssues, RuleFinder finder)
    {
        this.files = files;
        this.projectIssues = projectIssues;
        this.finder = finder;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.api.batch.CheckProject#shouldExecuteOnProject(org.sonar.api
     * .resources.Project)
     */
    @Override
    public boolean shouldExecuteOnProject(Project project)
    {
        FilePredicates predicates = files.predicates();
        Iterable<File> mainFiles = files.files(predicates.and(
                predicates.or(predicates.hasLanguage(QuamocoConstants.JAVA_KEY),
                        predicates.hasLanguage(QuamocoConstants.CSHARP_KEY)), predicates.hasType(Type.MAIN)));
        return !Iterables.isEmpty(mainFiles);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.api.batch.Decorator#decorate(org.sonar.api.resources.Resource,
     * org.sonar.api.batch.DecoratorContext)
     */
    @SuppressWarnings("deprecation")
    @Override
    public void decorate(Resource resource, DecoratorContext context)
    {
        // Process:
        // 1. Collect Gendarme, PMD, and Findbugs Results
        Iterable<Violation> violations = context.getViolations();
        Iterator<Violation> iter = violations.iterator();

        while (iter.hasNext())
        {
            Violation violation = iter.next();
        }

        Iterable<Issue> issues = projectIssues.issues();
        Iterator<Issue> issueIter = issues.iterator();
        while (issueIter.hasNext())
        {
            Issue issue = issueIter.next();
            if (issue.ruleKey().repository().equals("findbugs"))
            {

            }
            else if (issue.ruleKey().repository().equals("fb-contrib"))
            {

            }
            else if (issue.ruleKey().repository().equals("pmd"))
            {

            }
            else if (issue.ruleKey().repository().equals("gendarme"))
            {

            }
            issue.ruleKey();
            issue.severity();
            Rule r = finder.findByKey(issue.ruleKey());
            r.getName();
        }

        // 2. Collect Base Metrics Results
        Measure<Double> jloc = context.getMeasure(JavaMetrics.LOC);
        Measure<Double> jnom = context.getMeasure(JavaMetrics.NOM);
        Measure<Double> jnof = context.getMeasure(JavaMetrics.NOF);
        Measure<Double> jnov = context.getMeasure(JavaMetrics.NOV);
        Measure<Double> jnos = context.getMeasure(JavaMetrics.NOS);
        Measure<Double> jnoc = context.getMeasure(JavaMetrics.NOC);
        Measure<Double> jnot = context.getMeasure(JavaMetrics.NOT);

        Measure<Double> csloc = context.getMeasure(CoreMetrics.NCLOC);
        Measure<Double> csnom = context.getMeasure(CSharpMetrics.NOM);
        Measure<Double> csnoc = context.getMeasure(CSharpMetrics.NOC);
        Measure<Double> csnof = context.getMeasure(CSharpMetrics.NOF);
        Measure<Double> csnos = context.getMeasure(CSharpMetrics.NOS);

        // 3. Instantiate Quamoco Results tree infused with the above results
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        QualityModelResult results = new QualityModelResult(dateFormat.format(cal.getTime()), context.getProject()
                .getName());

        // 4. Read in Quamoco Model files from JAR (need to move them to the
        // resources directory)
        URL csharpQM = getClass().getResource("/qm/csharp.qm");
        URL javaQM = getClass().getResource("/qm/java.qm");
        URL objectQM = getClass().getResource("/qm/object.qm");
        URL rootQM = getClass().getResource("/qm/root.qm");

        // 5. Build the Quamoco Tree
        ModelDistiller distiller = new ModelDistiller(csharpQM, javaQM, objectQM, rootQM);
        DirectedSparseGraph<Node, Edge> graph = distiller.getGraph();

        // 6. Link the results with the models
        DataExtractor extractor = new DataExtractor();

        // 7. Evaluate the results (up the tree)
        Node qual = null;
        for (Node n : graph.getVertices())
        {
            if (graph.outDegree(n) == 0 && n.getName().equals("Quality"))
            {
                qual = n;
                break;
            }
        }

        qual.getValue();

        // 8. Save the required measures.

    }
}
