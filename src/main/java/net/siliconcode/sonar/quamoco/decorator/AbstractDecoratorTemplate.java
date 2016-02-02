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

import java.io.File;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.issue.Issue;
import org.sonar.api.measures.Measure;
import org.sonar.api.measures.MeasuresFilters;
import org.sonar.api.resources.Project;
import org.sonar.api.rules.Rule;
import org.sonar.api.rules.RuleFinder;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.codetree.CodeNode;
import net.siliconcode.quamoco.codetree.CodeTree;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.codetree.MethodNode;
import net.siliconcode.quamoco.codetree.TypeNode;
import net.siliconcode.quamoco.distiller.Grade;
import net.siliconcode.quamoco.distiller.ModelDistiller;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.Finding;
import net.siliconcode.quamoco.graph.node.FindingNode;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.ValueNode;
import net.siliconcode.quamoco.io.MetricPropertiesReader;
import net.siliconcode.quamoco.processor.MetricsContext;
import net.siliconcode.sonar.quamoco.QuamocoConstants;

/**
 * AbstractDecoratorTemplate -
 * 
 * @author Isaac Griffith
 */
public abstract class AbstractDecoratorTemplate implements IDecoratorTemplate {

    protected Map<String, Double>             measureValues = new HashMap<>();
    protected CodeTree                        tree;
    protected MetricsContext                  metricsContext;
    protected DirectedSparseGraph<Node, Edge> graph;

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

        final Map<String, net.siliconcode.quamoco.distiller.Measure> map = MetricPropertiesReader.read();
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
        distiller.setLanguage(getLanguage());
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
        for (final String measure : measureValues.keySet())
        {
            if (valueMap.containsKey(measure))
            {
                ((ValueNode) valueMap.get(measure)).addValue(measureValues.get(measure));
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
        Map<String, Map<String, Double>> fileMetricsMap = gson.fromJson(fileJson, collectionType);
        Map<String, Map<String, Double>> classMetricsMap = gson.fromJson(clsJson, collectionType);
        Map<String, Map<String, Double>> methodMetricsMap = gson.fromJson(methodJson, collectionType);
        Map<String, Double> projectMetricsMap = gson.fromJson(projJson, hashMapType);

        metricsContext = MetricsContext.getInstance();
        metricsContext.setMetrics(projectMetricsMap, fileMetricsMap, classMetricsMap, methodMetricsMap);
    }

    public abstract void executeQuamocoDetector();

    protected abstract String getExtension();

    protected abstract List<String> getRepoNames();

    protected abstract String getLanguage();

    protected abstract Logger getLogger();

    /*
     * (non-Javadoc)
     * @see net.siliconcode.sonar.quamoco.decorator.IDecoratorTemplate#
     * collectIssueResults(org.sonar.api.rules.RuleFinder, java.lang.Iterable)
     */
    @Override
    public void collectIssueResults(String baseDir, final RuleFinder finder, final Iterable<Issue> issues)
    {
        if (issues == null || finder == null)
            return;

        Map<String, Map<String, FindingNode>> toolFindingMap = Maps.newHashMap();
        for (Node n : graph.getVertices())
        {
            if (n instanceof FindingNode)
            {
                FindingNode fnode = (FindingNode) n;
                String tool = fnode.getToolName().toLowerCase();
                String rule = fnode.getRuleName();

                if (!toolFindingMap.containsKey(tool))
                {
                    toolFindingMap.put(tool, Maps.newHashMap());
                }

                toolFindingMap.get(tool).put(rule, fnode);
            }
        }

        final Iterator<Issue> issueIter = issues.iterator();

        while (issueIter.hasNext())
        {
            final Issue issue = issueIter.next();
            if (getRepoNames().contains(issue.ruleKey().repository()))
            {
                final Rule r = finder.findByKey(issue.ruleKey());
                String key = issue.componentKey();
                String repo = issue.ruleKey().repository();
                int line = issue.line();
                CodeNode location = resolveComponent(baseDir, key, line);
                if (location != null)
                {
                    Finding finding = new Finding(location, issue.ruleKey().toString(), r.getName());
                    if (toolFindingMap.containsKey(repo))
                    {
                        if (toolFindingMap.get(repo).containsKey(r.getName()))
                        {
                            toolFindingMap.get(repo).get(r.getName()).addFinding(finding);
                        }
                    }
                }
            }
        }
    }

    /**
     * @param key
     * @param line
     * @return
     */
    private CodeNode resolveComponent(String baseDir, String key, int line)
    {
        key = key.substring(key.indexOf(":") + 1);
        Path path = Paths.get(baseDir + File.separator + key);
        if (Files.exists(path) && Files.isDirectory(path))
        {
            if (path.getFileName().toString().endsWith(getExtension()))
            {
                FileNode fnode = tree.findFile(path.toString());
                if (line >= 1)
                {
                    TypeNode type = tree.findType(fnode, line);
                    MethodNode mnode = tree.findMethod(type, line);
                    if (mnode != null)
                        return mnode;
                    else
                        return type;
                }
                else
                    return fnode;
            }
        }
        else if (key.indexOf(".") != key.lastIndexOf("."))
        {
            TypeNode type = tree.findType(key);
            if (line >= 1 && type != null)
            {
                MethodNode mnode = tree.findMethod(type, line);
                if (mnode != null)
                    return mnode;
                if (type != null)
                    return type;
            }
        }
        return null;
    }

    /**
     * @param fs
     * @param p
     */
    public abstract void generateProjectTree(final FileSystem fs, Project p);
}
