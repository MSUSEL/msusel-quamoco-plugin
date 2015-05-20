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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.siliconcode.quamoco.aggregator.Grade;
import net.siliconcode.quamoco.aggregator.ModelDistiller;
import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.FactorNode;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.graph.ValueNode;
import net.siliconcode.quamoco.aggregator.io.MetricPropertiesReader;
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
 * @author Isaac Griffith
 */
@DependsUpon(value = DecoratorBarriers.ISSUES_TRACKED)
public class QuamocoDecorator implements Decorator {

    private final FileSystem    files;
    private final ProjectIssues projectIssues;
    private final RuleFinder    finder;
    private String              language;
    Map<String, Integer>        issueCounts   = new HashMap<>();
    Map<String, Double>         measureValues = new HashMap<>();

    public QuamocoDecorator(final FileSystem files, final ProjectIssues projectIssues, final RuleFinder finder)
    {
        this.files = files;
        this.projectIssues = projectIssues;
        this.finder = finder;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.api.batch.Decorator#decorate(org.sonar.api.resources.Resource,
     * org.sonar.api.batch.DecoratorContext)
     */
    @SuppressWarnings({ "deprecation", "unchecked" })
    @Override
    public void decorate(final Resource resource, final DecoratorContext context)
    {
        // Process:
        // 1. Collect Gendarme, PMD, and Findbugs Results
        final Iterable<Violation> violations = context.getViolations();
        final Iterator<Violation> iter = violations.iterator();

        while (iter.hasNext())
        {
            final Violation violation = iter.next();
        }

        final Iterable<Issue> issues = projectIssues.issues();
        final Iterator<Issue> issueIter = issues.iterator();

        while (issueIter.hasNext())
        {
            final Issue issue = issueIter.next();
            if (issue.ruleKey().repository().equals("findbugs") || issue.ruleKey().repository().equals("fb-contrib")
                    || issue.ruleKey().repository().equals("pmd") || issue.ruleKey().repository().equals("gendarme"))
            {
                final Rule r = finder.findByKey(issue.ruleKey());
                incrementCount(r.getName());
            }
        }

        // 2. Collect Base Metrics Results
        if (language.equals(QuamocoConstants.JAVA_KEY))
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
        else if (language.equals(QuamocoConstants.CSHARP_KEY))
        {
            final Measure<Double> csloc = context.getMeasure(CoreMetrics.NCLOC);
            final Measure<Double> csnom = context.getMeasure(CSharpMetrics.NOM);
            final Measure<Double> csnoc = context.getMeasure(CSharpMetrics.NOC);
            final Measure<Double> csnof = context.getMeasure(CSharpMetrics.NOF);
            final Measure<Double> csnos = context.getMeasure(CSharpMetrics.NOS);

            updateMeasuresMap(csloc, csnom, csnoc, csnof, csnos);
        }

        // 5. Build the Quamoco Tree
        final ModelDistiller distiller = new ModelDistiller();
        distiller.setLanguage(language);
        final DirectedSparseGraph<Node, Edge> graph = distiller.getGraph();

        // 6. Link the results with the models
        linkToGraph(graph);

        // 7. Evaluate the results (up the tree)
        Node qual = null;
        for (final Node n : graph.getVertices())
        {
            if (graph.outDegree(n) == 0 && n.getName().equals("Quality"))
            {
                qual = n;
                break;
            }
        }

        qual.getValue();

        // 8. Save the required measures.
        final Map<String, net.siliconcode.quamoco.aggregator.Measure> map = MetricPropertiesReader.read();
        final Map<String, Double> valueMap = getValues(graph, map.keySet());
        final Map<String, String> gradeMap = getGrades(valueMap);
        for (final String key : valueMap.keySet())
        {
            final Measure<Double> value = new Measure<>(QuamocoConstants.PLUGIN_KEY + "."
                    + key.toUpperCase().replaceAll(" ", "_"));
            value.setValue(valueMap.get(key));
            final Measure<String> grade = new Measure<>(QuamocoConstants.PLUGIN_KEY + "."
                    + key.toUpperCase().replaceAll(" ", "_") + ".GRADE");
            grade.setData(gradeMap.get(key));
            context.saveMeasure(value);
            context.saveMeasure(grade);
        }

    }

    private String getGrade(final double value)
    {
        final List<Grade> grades = Grade.getGrades();
        for (final Grade g : grades)
        {
            if (g.evaluate(value) == 0)
            {
                return g.getName();
            }
        }

        return Grade.U.getName();
    }

    private Map<String, String> getGrades(final Map<String, Double> valueMap)
    {
        final Map<String, String> retVal = new HashMap<>();

        for (final String key : valueMap.keySet())
        {
            final String grade = getGrade(valueMap.get(key));
            retVal.put(key, grade);
        }

        return retVal;
    }

    private Map<String, Double> getValues(final DirectedSparseGraph<Node, Edge> graph, final Set<String> keys)
    {
        final Map<String, Double> retVal = new HashMap<>();

        for (final Node node : graph.getVertices())
        {
            if (node instanceof FactorNode)
            {
                if (keys.contains(node.getName()))
                {
                    retVal.put(node.getName(), node.getValue());
                }
            }
        }

        return retVal;
    }

    private void incrementCount(final String key)
    {
        if (issueCounts.containsKey(key))
        {
            issueCounts.put(key, issueCounts.get(key) + 1);
        }
        else
        {
            issueCounts.put(key, 1);
        }
    }

    private void linkToGraph(final DirectedSparseGraph<Node, Edge> graph)
    {
        final Map<String, Node> valueMap = new HashMap<>();

        for (final Node node : graph.getVertices())
        {
            if (node instanceof ValueNode)
            {
                valueMap.put(node.getName(), node);
            }
        }
        for (final String issue : issueCounts.keySet())
        {
            if (valueMap.containsKey(issue))
            {
                ((ValueNode) valueMap.get(issue)).setValue(issueCounts.get(issue));
            }
        }
        for (final String measure : measureValues.keySet())
        {
            if (valueMap.containsKey(measure))
            {
                ((ValueNode) valueMap.get(measure)).setValue(measureValues.get(measure));
            }
        }
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.api.batch.CheckProject#shouldExecuteOnProject(org.sonar.api
     * .resources.Project)
     */
    @Override
    public boolean shouldExecuteOnProject(final Project project)
    {
        final FilePredicates predicates = files.predicates();
        final Iterable<File> mainFiles = files.files(predicates.and(
                predicates.or(predicates.hasLanguage(QuamocoConstants.JAVA_KEY),
                        predicates.hasLanguage(QuamocoConstants.CSHARP_KEY)), predicates.hasType(Type.MAIN)));
        final Iterable<File> javaFiles = files.files(predicates.hasLanguage(QuamocoConstants.JAVA_KEY));
        final Iterable<File> csFiles = files.files(predicates.hasLanguage(QuamocoConstants.CSHARP_KEY));
        if (!Iterables.isEmpty(javaFiles))
        {
            language = QuamocoConstants.JAVA_KEY;
        }
        else if (!Iterables.isEmpty(csFiles))
        {
            language = QuamocoConstants.CSHARP_KEY;
        }
        return !Iterables.isEmpty(mainFiles);
    }

    private void updateMeasuresMap(final Measure<Double>... measures)
    {
        for (final Measure<Double> measure : measures)
        {
            measureValues.put(measure.getMetric().getName(), measure.getValue());
        }
    }
}
