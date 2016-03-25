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
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.component.ResourcePerspectives;
import org.sonar.api.issue.Issue;
import org.sonar.api.measures.Measure;
import org.sonar.api.measures.MetricFinder;
import org.sonar.api.resources.Resource;
import org.sonar.api.resources.ResourceUtils;
import org.sonar.api.rules.Rule;
import org.sonar.api.rules.RuleFinder;

import com.google.common.collect.Lists;
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
import net.siliconcode.quamoco.graph.node.MeasureNode;
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

    private static final Logger               LOG           = LoggerFactory.getLogger(AbstractDecoratorTemplate.class);

    protected Map<String, Double>             measureValues = new HashMap<>();
    protected CodeTree                        tree;
    protected MetricsContext                  metricsContext;
    protected DirectedSparseGraph<Node, Edge> graph;
    protected DecoratorContext                context;
    protected FileSystem                      fs;
    protected ResourcePerspectives            perspectives;
    protected List<Issue>                     issues;

    /*
     * (non-Javadoc)
     *
     * @see
     * net.siliconcode.sonar.quamoco.decorator.IDecoratorTemplate#decorate(org.
     * sonar.api.batch.DecoratorContext, org.sonar.api.rules.RuleFinder,
     * java.lang.Iterable)
     */
    @Override
    public void decorate(final FileSystem fs, final Resource resource, final DecoratorContext context,
            final RuleFinder finder, final List<Issue> issues, final ResourcePerspectives perspectives,
            final MetricFinder metricFinder) {

        if (this.fs == null)
            this.fs = fs;

        this.context = context;

        // collectIssueResults(fs.baseDir().toString(), finder, issues);

        if (ResourceUtils.isProject(resource)) {

            collectCodeTree(metricFinder);

            collectBaseMetrics(context, metricFinder);
            // createIssues(context);

            graph = buildGraph(context);

            linkIssues(issues, fs.baseDir().getAbsolutePath(), finder);
            linkToGraph();
            executeQuamocoDetector();
            evaluateResults();

            final Map<String, net.siliconcode.quamoco.distiller.Measure> map = MetricPropertiesReader.read();
            final Map<String, Double> valueMap = getValues(graph, map.keySet());
            final Map<String, String> gradeMap = getGrades(valueMap);

            for (Node n : graph.getVertices()) {
                if (n instanceof MeasureNode || n instanceof FactorNode) {
                    LOG.info("Value of " + n.getName() + " is " + n.getValue());
                }
            }

            saveMeasures(context, valueMap);
        }
    }

    public void collectCodeTree(MetricFinder finder) {
        final Measure treeData = context
                .getMeasure(finder.findByKey(QuamocoConstants.PLUGIN_KEY + "." + QuamocoConstants.CODE_TREE));

        final String treeJson = treeData.getData();

        final Gson gson = new Gson();
        tree = gson.fromJson(treeJson, CodeTree.class);
    }

    /**
     * @param context
     * @param valueMap
     */
    private void saveMeasures(final DecoratorContext context, final Map<String, Double> valueMap) {
        for (final String key : valueMap.keySet()) {
            LOG.info("Saving data for Metric: " + QuamocoConstants.PLUGIN_KEY + "."
                    + key.toUpperCase().replaceAll(" ", "_") + " with value " + valueMap.get(key));
            if (valueMap.get(key).isNaN()) {
                LOG.warn("Found NaN so skipping");
                continue;
            }
            else if (valueMap.get(key).isInfinite()) {
                LOG.warn("Found Infinite so skipping");
                continue;
            }

            final Measure<Double> value = new Measure<>(
                    QuamocoConstants.PLUGIN_KEY + "." + key.toUpperCase().replaceAll(" ", "_"));
            value.setValue(valueMap.get(key));

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
    private void evaluateResults() {
        Node qual = null;
        for (final Node n : graph.getVertices()) {
            if (n != null && n instanceof FactorNode && n.getName().equals("Quality @Product")) {
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
    private DirectedSparseGraph<Node, Edge> buildGraph(final DecoratorContext context) {
        final ModelDistiller distiller = new ModelDistiller();
        distiller.setLanguage(getLanguage());
        distiller.buildGraph(context);
        final DirectedSparseGraph<Node, Edge> graph = distiller.getGraph();
        return graph;
    }

    protected void linkToGraph() {
        final Map<String, Node> valueMap = new HashMap<>();

        for (final Node node : graph.getVertices()) {
            if (node instanceof ValueNode) {
                valueMap.put(node.getName(), node);
            }
        }
        for (final String measure : measureValues.keySet()) {
            if (valueMap.containsKey(measure)) {
                ((ValueNode) valueMap.get(measure)).addValue(measureValues.get(measure));
            }
        }
    }

    protected String getGrade(final double value) {
        final List<Grade> grades = Grade.getGrades();
        for (final Grade g : grades) {
            if (g.evaluate(value) == 0) {
                return g.getName();
            }
        }

        return Grade.U.getName();
    }

    protected Map<String, String> getGrades(final Map<String, Double> valueMap) {
        final Map<String, String> retVal = new HashMap<>();

        for (final String key : valueMap.keySet()) {
            final String grade = getGrade(valueMap.get(key));
            retVal.put(key, grade);
        }

        return retVal;
    }

    protected Map<String, Double> getValues(final DirectedSparseGraph<Node, Edge> graph, final Set<String> keys) {
        final Map<String, Double> retVal = new HashMap<>();

        for (final Node node : graph.getVertices()) {
            if (node instanceof FactorNode) {
                if (keys.contains(node.getName())) {
                    retVal.put(node.getName(), node.getValue());
                }
            }
        }

        return retVal;
    }

    @SuppressWarnings("unchecked")
    protected void updateMeasuresMap(final Measure<Double>... measures) {
        for (final Measure<Double> measure : measures) {
            measureValues.put(measure.getMetric().getName(), measure.getValue());
        }
    }

    @Override
    public void collectBaseMetrics(final DecoratorContext context, MetricFinder finder) {
        final Measure fileMetrics = context.getMeasure(finder.findByKey("sc_understand_file"));
        final Measure classMetrics = context
                .getMeasure(finder.findByKey("sc_understand_class"));
        final Measure projectMetrics = context
                .getMeasure(finder.findByKey("sc_understand_project"));
        final Measure methodMetrics = context
                .getMeasure(finder.findByKey("sc_understand_method"));

        final String projJson = projectMetrics.getData();
        final String clsJson = classMetrics.getData();
        final String fileJson = fileMetrics.getData();
        final String methodJson = methodMetrics.getData();

        final Type collectionType = new TypeToken<HashMap<String, HashMap<String, Double>>>() {
        }.getType();
        final Type hashMapType = new TypeToken<HashMap<String, Double>>() {
        }.getType();

        final Gson gson = new Gson();
        final Map<String, Map<String, Double>> fileMetricsMap = gson.fromJson(fileJson, collectionType);
        final Map<String, Map<String, Double>> classMetricsMap = gson.fromJson(clsJson, collectionType);
        final Map<String, Map<String, Double>> methodMetricsMap = gson.fromJson(methodJson, collectionType);
        final Map<String, Double> projectMetricsMap = gson.fromJson(projJson, hashMapType);

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
     *
     * @see net.siliconcode.sonar.quamoco.decorator.IDecoratorTemplate#
     * collectIssueResults(org.sonar.api.rules.RuleFinder, java.lang.Iterable)
     */
    @Override
    public void collectIssueResults(final String baseDir, final RuleFinder finder, final Iterable<Issue> issueIter) {
        if (issues == null || finder == null) {
            LOG.warn("Issues: " + issues + " Finder: " + finder);
            return;
        }

        for (Issue issue : issueIter) {
            if (issues == null)
                issues = Lists.newArrayList();

            if (issue != null)
                issues.add(issue);
        }
    }

    public void linkIssues(List<Issue> issues, final String baseDir, final RuleFinder finder) {
        final Map<String, Map<String, FindingNode>> toolFindingMap = Maps.newHashMap();
        for (final Node n : graph.getVertices()) {
            if (n instanceof FindingNode) {
                final FindingNode fnode = (FindingNode) n;
                final String tool = fnode.getToolName().toLowerCase();
                final String rule = fnode.getRuleName();

                if (!toolFindingMap.containsKey(tool)) {
                    toolFindingMap.put(tool, Maps.newHashMap());
                }

                toolFindingMap.get(tool).put(rule, fnode);
            }
        }

        for (Issue issue : issues) {
            final Rule r = finder.findByKey(issue.ruleKey());
            final String key = issue.componentKey();
            final String repo = issue.ruleKey().repository();

            LOG.info("Rule Key: " + r.getKey() + "@" + repo);
            if (getRepoNames().contains(issue.ruleKey().repository().toLowerCase())) {
                final int line = issue.line();

                final CodeNode location = resolveComponent(baseDir, key, line);
                if (location != null) {
                    final Finding finding = new Finding(location, issue.ruleKey().toString(), r.getName());

                    if (toolFindingMap.containsKey(repo)) {
                        if (toolFindingMap.get(repo).containsKey(r.getKey())) {
                            toolFindingMap.get(repo).get(r.getKey()).addFinding(finding);
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
    private CodeNode resolveComponent(final String baseDir, String key, final int line) {
        key = key.substring(key.indexOf(":") + 1);
        final Path path = Paths.get(baseDir + File.separator + key);
        if (Files.exists(path) && Files.isDirectory(path)) {
            if (path.getFileName().toString().endsWith(getExtension())) {
                final FileNode fnode = tree.findFile(path.toString());
                if (line >= 1) {
                    final TypeNode type = tree.findType(fnode, line);
                    final MethodNode mnode = tree.findMethod(type, line);
                    if (mnode != null) {
                        return mnode;
                    }
                    else {
                        return type;
                    }
                }
                else {
                    return fnode;
                }
            }
        }
        else if (key.indexOf(".") != key.lastIndexOf(".")) {
            final TypeNode type = tree.findType(key);
            if (line >= 1 && type != null) {
                final MethodNode mnode = tree.findMethod(type, line);
                if (mnode != null) {
                    return mnode;
                }
                if (type != null) {
                    return type;
                }
            }
        }
        return null;
    }
}
