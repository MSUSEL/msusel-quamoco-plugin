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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.issue.Issue;
import org.sonar.api.measures.Measure;
import org.sonar.api.measures.MeasuresFilters;
import org.sonar.api.rules.RuleFinder;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.aggregator.Grade;
import net.siliconcode.quamoco.aggregator.ModelDistiller;
import net.siliconcode.quamoco.codetree.CodeTree;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.FindingToMeasureEdge;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.FindingNode;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.ValueNode;
import net.siliconcode.quamoco.io.MetricPropertiesReader;
import net.siliconcode.sonar.quamoco.MetricsContext;
import net.siliconcode.sonar.quamoco.QuamocoConstants;

/**
 * AbstractDecoratorTemplate -
 * 
 * @author Isaac Griffith
 */
public abstract class AbstractDecoratorTemplate implements IDecoratorTemplate {

    protected String                           language;
    protected Map<String, Double>              measureValues  = new HashMap<>();
    protected Map<String, Map<String, Number>> classMetrics   = new HashMap<>();
    protected Map<String, Map<String, Number>> fileMetrics    = new HashMap<>();;
    protected Map<String, Map<String, Number>> methodMetrics  = new HashMap<>();
    protected Map<String, Number>              projectMetrics = new HashMap<>();
    protected Map<String, List<FindingNode>>   findingsMap    = new HashMap<>();
    protected CodeTree                         tree;
    protected MetricsContext                   metricsContext;
    protected DirectedSparseGraph<Node, Edge>  graph;

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.sonar.quamoco.decorator.IDecoratorTemplate#decorate(org.
     * sonar.api.batch.DecoratorContext, org.sonar.api.rules.RuleFinder,
     * java.lang.Iterable)
     */
    @Override
    public void decorate(FileSystem fs, DecoratorContext context, final RuleFinder finder, final Iterable<Issue> issues)
    {
        collectIssueResults(fs.baseDir().toString(), finder, issues);
        collectBaseMetrics(context);

        graph = buildGraph(context);

        linkToGraph();
        executeQuamocoDetector();
        evaluateResults();

        final Map<String, net.siliconcode.quamoco.aggregator.Measure> map = MetricPropertiesReader.read();
        final Map<String, Double> valueMap = getValues(graph, map.keySet());
        final Map<String, String> gradeMap = getGrades(valueMap);
        saveMeasures(context, valueMap);
    }

    /**
     * @param context
     * @param valueMap
     */
    private void saveMeasures(DecoratorContext context, final Map<String, Double> valueMap)
    {
        for (final String key : valueMap.keySet())
        {
            final Measure<Double> value = new Measure<>(
                    QuamocoConstants.PLUGIN_KEY + "." + key.toUpperCase().replaceAll(" ", "_"));
            value.setValue(valueMap.get(key));
            System.out.println(key.toUpperCase() + ": " + valueMap.get(key));
            // final Measure<String> grade = new
            // Measure<>(QuamocoConstants.PLUGIN_KEY + "."
            // + key.toUpperCase().replaceAll(" ", "_") + ".GRADE");
            // grade.setData(gradeMap.get(key));
            context.saveMeasure(value);
            // context.saveMeasure(grade);
        }
    }

    /**
     * @param graph
     */
    private void evaluateResults()
    {
        Node qual = null;
        for (final Node n : graph.getVertices())
        {
            if (n != null && n instanceof FactorNode && graph.outDegree(n) == 0 && n.getName().equals("Quality"))
            {
                qual = n;
                break;
            }
        }
        qual.getValue();
    }

    /**
     * @param context
     * @return
     */
    private DirectedSparseGraph<Node, Edge> buildGraph(DecoratorContext context)
    {
        final ModelDistiller distiller = new ModelDistiller();
        distiller.setLanguage(language);
        distiller.buildGraph(context);
        final DirectedSparseGraph<Node, Edge> graph = distiller.getGraph();
        return graph;
    }

    protected void linkToGraph()
    {
        final Map<String, Node> valueMap = new HashMap<>();

        for (final Node node : graph.getVertices())
        {
            if (node instanceof ValueNode)
            {
                valueMap.put(node.getName(), node);
            }
        }
        for (final String issue : findingsMap.keySet())
        {
            List<FindingNode> findings = findingsMap.get(issue);

            if (valueMap.containsKey(issue))
            {
                for (FindingNode fnode : findings)
                    graph.addEdge(new FindingToMeasureEdge("Issue: " + findings.indexOf(fnode)), fnode, valueMap.get(issue));
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

    protected String getGrade(final double value)
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

    protected Map<String, String> getGrades(final Map<String, Double> valueMap)
    {
        final Map<String, String> retVal = new HashMap<>();

        for (final String key : valueMap.keySet())
        {
            final String grade = getGrade(valueMap.get(key));
            retVal.put(key, grade);
        }

        return retVal;
    }

    protected Map<String, Double> getValues(final DirectedSparseGraph<Node, Edge> graph, final Set<String> keys)
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

    @SuppressWarnings("unchecked")
    protected void updateMeasuresMap(final Measure<Double>... measures)
    {
        for (final Measure<Double> measure : measures)
        {
            measureValues.put(measure.getMetric().getName(), measure.getValue());
        }
    }

    @Override
    public void collectBaseMetrics(DecoratorContext context)
    {
        final Measure<String> fileMetrics = context.getMeasures(MeasuresFilters.<Measure> metric("sc_understand_file"));
        final Measure<String> classMetrics = context
                .getMeasures(MeasuresFilters.<Measure> metric("sc_understand_class"));
        final Measure<String> projectMetrics = context
                .getMeasures(MeasuresFilters.<Measure> metric("sc_understand_project"));
        final Measure<String> methodMetrics = context
                .getMeasures(MeasuresFilters.<Measure> metric("sc_understand_method"));
        String projJson = projectMetrics.getData();
        String clsJson = classMetrics.getData();
        String fileJson = fileMetrics.getData();
        String methodJson = methodMetrics.getData();

        Type collectionType = new TypeToken<HashMap<String, HashMap<String, Number>>>() {
        }.getType();
        Type hashMapType = new TypeToken<HashMap<String, Number>>() {
        }.getType();

        Gson gson = new Gson();
        this.fileMetrics = gson.fromJson(fileJson, collectionType);
        this.classMetrics = gson.fromJson(clsJson, collectionType);
        this.methodMetrics = gson.fromJson(methodJson, collectionType);
        this.projectMetrics = gson.fromJson(projJson, hashMapType);
    }

    public abstract void executeQuamocoDetector();
}
