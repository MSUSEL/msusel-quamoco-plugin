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
package com.sparqline.sonar.quamoco;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.ce.measure.Component;
import org.sonar.api.ce.measure.Component.Type;
import org.sonar.api.ce.measure.Issue;
import org.sonar.api.ce.measure.Measure;
import org.sonar.api.ce.measure.MeasureComputer;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sparqline.codetree.CodeTree;
import com.sparqline.codetree.INode;
import com.sparqline.codetree.node.FileNode;
import com.sparqline.codetree.node.MethodNode;
import com.sparqline.codetree.node.ProjectNode;
import com.sparqline.codetree.node.TypeNode;
import com.sparqline.metrics.MetricsAggregator;
import com.sparqline.metrics.Register;
import com.sparqline.metrics.aggregators.ClassMetricsAggregator;
import com.sparqline.metrics.aggregators.FileMetricsAggregator;
import com.sparqline.metrics.aggregators.MethodMetricsAggregator;
import com.sparqline.metrics.aggregators.SystemMetricsAggregator;
import com.sparqline.quamoco.distiller.Grade;
import com.sparqline.quamoco.distiller.ModelDistiller;
import com.sparqline.quamoco.graph.edge.Edge;
import com.sparqline.quamoco.graph.node.FactorNode;
import com.sparqline.quamoco.graph.node.Finding;
import com.sparqline.quamoco.graph.node.FindingNode;
import com.sparqline.quamoco.graph.node.Node;
import com.sparqline.quamoco.graph.node.ValueNode;
import com.sparqline.quamoco.processor.MetricsContext;
import com.sparqline.sonar.quamoco.computestates.CSharpComputeState;
import com.sparqline.sonar.quamoco.computestates.JavaComputeState;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * QuamocoMeasureComputer -
 * 
 * @author Isaac Griffith
 */
public class QuamocoMeasureComputer implements MeasureComputer {

    private static final Logger LOG = LoggerFactory.getLogger(QuamocoMeasureComputer.class);

    protected Map<String, String>             gradeMap;
    protected Map<String, BigDecimal>         measureValues;
    protected MetricsContext                  metricsContext;
    protected DirectedSparseGraph<Node, Edge> graph;
    protected Map<String, List<Issue>>        issueMap;
    protected Map<String, List<FileNode>>     files;
    protected String                          projectID;
    protected CodeTree                        mainTree;
    protected QuamocoComputeState             state;

    /**
     * 
     */
    public QuamocoMeasureComputer()
    {
        issueMap = Maps.newHashMap();
        measureValues = Maps.newHashMap();
        gradeMap = Maps.newHashMap();
        files = Maps.newHashMap();
        metricsContext = MetricsContext.getCleanInstance();
        mainTree = new CodeTree();
        Register.register();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeasureComputerDefinition define(MeasureComputerDefinitionContext defContext)
    {
        return defContext
                .newDefinitionBuilder()
                .setInputMetrics(QuamocoConstants.PLUGIN_KEY + "." + QuamocoConstants.CODE_TREE)
                .setOutputMetrics(getOutputMetrics().toArray(new String[0]))
                .build();
    }

    /**
     * @return
     */
    protected List<String> getOutputMetrics()
    {
        List<String> ret = Lists.newLinkedList();
        for (final String key : QuamocoMetrics.QUALITY_ASPECTS)
        {
            ret.add(QuamocoConstants.PLUGIN_KEY + "." + key.toUpperCase().replaceAll(" ", "_"));
        }

        return ret;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void compute(MeasureComputerContext context)
    {
        Component comp = context.getComponent();
        List<Issue> issues;
        // LOG.info(String.format("%s of %s", m.getType().toString(),
        // m.getKey()));

        switch (comp.getType())
        {
        case PROJECT:
            metricsContext.merge(mainTree);

            if (metricsContext.getTree().getProject().getQIdentifier().equals(comp.getKey()))
            {
                Register.register();
                aggregateProjectMetrics(metricsContext.getTree());
                graph = buildGraph(context);
                linkToGraph();

                for (String file : issueMap.keySet())
                {
                    issues = issueMap.get(file);
                    linkIssues(file, issues);
                }
                logFindings();
                state.executeQuamocoDetector(graph, metricsContext, projectID);
                evaluateResults();

                // final String[] map = MetricPropertiesReader.read();
                final Map<String, BigDecimal> valueMap = getValues(graph, QuamocoMetrics.QUALITY_ASPECTS);

                // for (Node n : graph.getVertices())
                // {
                // if (n instanceof MeasureNode || n instanceof FactorNode)
                // {
                // LOG.info("@" + n.getClass().getSimpleName() + " Value of " +
                // n.getName() + " is "
                // + n.getValue());
                // }
                // }

                saveMeasures(context, valueMap);
            }
            break;
        case FILE:
            if (state == null)
            {
                state = selectState(comp);
            }
            collectCodeTree(context);

            issues = Lists.newArrayList();
            issues.addAll(context.getIssues());
            LOG.info("Issues @" + comp.getKey() + ": " + issues.size());
            issueMap.put(comp.getKey(), Lists.newArrayList(issues));
            break;
        default:
            issues = Lists.newArrayList();
            issues.addAll(context.getIssues());
            issueMap.put(comp.getKey(), Lists.newArrayList(issues));
            break;
        }
    }

    /**
     * 
     */
    private void aggregateProjectMetrics(CodeTree tree)
    {
        LOG.info("Aggregating Quamoco Base Measures");

        MetricsAggregator ma = new MethodMetricsAggregator();
        ma.addExcludedMetric("LOC");
        ma.aggregate(tree);

        ma = new ClassMetricsAggregator();
        ma.addExcludedMetric("LOC");
        ma.aggregate(tree);

        ma = new FileMetricsAggregator();
        ma.addExcludedMetric("LOC");
        ma.aggregate(tree);

        ma = new SystemMetricsAggregator();
        ma.aggregate(tree);

        for (String key : tree.getProject().getMetricNames())
        {
            LOG.info("Project Metric - " + key + " = " + tree.getProject().getMetric(key));
        }

        ProjectNode pn = tree.getProject();
        LOG.info("Project SubProjects - " + pn.getSubProjects().size());
        LOG.info("Project Files - " + pn.getFiles().size());
        LOG.info("Project Modules - " + pn.getModules().size());
    }

    /**
     * @param comp
     * @return
     */
    private QuamocoComputeState selectState(Component comp)
    {
        if (comp.getType().equals(Type.FILE))
        {
            String langKey = comp.getFileAttributes().getLanguageKey();
            if (langKey.equals(CSharpComputeState.LANG))
            {
                return new CSharpComputeState();
            }
            else if (langKey.equals(JavaComputeState.LANG))
            {
                return new JavaComputeState();
            }
        }

        return null;
    }

    @VisibleForTesting
    void logFindings()
    {
        for (String name : QuamocoMetrics.QUALITY_ASPECTS)
            for (Node n : graph.getVertices())
            {
                if (n instanceof FactorNode && n.getName().equals(name))
                {
                    Set<Finding> set = n.getFindings();
                    LOG.info("Total number of " + name + " findings: " + set.size());
                    break;
                }
            }
    }

    /**
     * @param context
     */
    @VisibleForTesting
    void collectCodeTree(MeasureComputerContext context)
    {
        Measure treeMeasure = context.getMeasure(QuamocoConstants.PLUGIN_KEY + "." + QuamocoConstants.CODE_TREE);
        if (treeMeasure != null)
        {
            CodeTree temp = CodeTree.createFromJson(treeMeasure.getStringValue());
            LOG.info("Merging main tree");
            mainTree.getUtils().merge(temp);
        }
    }

    /**
     * @param context
     * @return
     */
    @VisibleForTesting
    DirectedSparseGraph<Node, Edge> buildGraph(final MeasureComputerContext context)
    {
        final ModelDistiller distiller = new ModelDistiller();
        distiller.setLanguage(state.langKey());
        distiller.buildGraph();
        final DirectedSparseGraph<Node, Edge> graph = distiller.getGraph();
        return graph;
    }

    /**
     * @param context
     * @param valueMap
     */
    @VisibleForTesting
    void saveMeasures(final MeasureComputerContext context, final Map<String, BigDecimal> valueMap)
    {
        for (final String key : valueMap.keySet())
        {
            Double value = valueMap.get(key).doubleValue();
            LOG.info(QuamocoConstants.PLUGIN_KEY + "." + key.toUpperCase().replaceAll(" ", "_") + " = " + value);
            context.addMeasure(QuamocoConstants.PLUGIN_KEY + "." + key.toUpperCase().replaceAll(" ", "_"), value);
        }
    }

    /**
     * @param graph
     */
    @VisibleForTesting
    void evaluateResults()
    {
        Node qual = null;
        for (final Node n : graph.getVertices())
        {
            if (n != null && n instanceof FactorNode && n.getName().equals("Quality @Product"))
            {
                qual = n;
                break;
            }
        }
        qual.getValue();
    }

    /**
     * 
     */
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

    /**
     * @param value
     * @return
     */
    protected String getGrade(final BigDecimal value)
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

    /**
     * @param valueMap
     * @return
     */
    protected Map<String, String> getGrades(final Map<String, BigDecimal> valueMap)
    {
        final Map<String, String> retVal = new HashMap<>();

        for (final String key : valueMap.keySet())
        {
            final String grade = getGrade(valueMap.get(key));
            retVal.put(key, grade);
        }

        return retVal;
    }

    /**
     * @param graph
     * @param keys
     * @return
     */
    protected Map<String, BigDecimal> getValues(final DirectedSparseGraph<Node, Edge> graph, final List<String> keys)
    {
        final Map<String, BigDecimal> retVal = new HashMap<>();

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

    /**
     * @param issues
     * @param baseDir
     */
    protected void linkIssues(String compKey, List<? extends Issue> issues)
    {
        final Map<String, Map<String, FindingNode>> toolFindingMap = Maps.newHashMap();

        for (final Node n : graph.getVertices())
        {
            if (n instanceof FindingNode)
            {
                final FindingNode fnode = (FindingNode) n;
                final String tool = fnode.getToolName().toLowerCase();
                final String rule = fnode.getRuleName();

                if (!toolFindingMap.containsKey(tool))
                {
                    toolFindingMap.put(tool, Maps.newHashMap());
                }

                toolFindingMap.get(tool).put(rule, fnode);
            }
        }

        for (Issue issue : issues)
        {
            LOG.info("Attempting to Link Issue: " + issue.ruleKey().rule() + " - " + issue.ruleKey().toString());
            final String repo = issue.ruleKey().repository();

            if (state.getRepoNames().contains(repo.toLowerCase()))
            {
                int line = 0;

                Class c = issue.getClass();
                try
                {
                    Method getLine = c.getMethod("getLine");
                    if (getLine != null)
                    {
                        line = (Integer) getLine.invoke(issue);
                    }
                }
                catch (Exception e)
                {
                    LOG.warn(e.getClass().getSimpleName());
                }

                final INode location = resolveComponent(compKey, line);

                if (location != null)
                {
                    final Finding finding = new Finding(
                            location, issue.ruleKey().toString(), issue.ruleKey().toString());

                    if (toolFindingMap.containsKey(repo))
                    {
                        if (toolFindingMap.get(repo).containsKey(issue.ruleKey().toString()))
                        {
                            toolFindingMap.get(repo).get(issue.ruleKey().toString()).addFinding(finding);
                        }
                    }
                }
            }
        }
    }

    /**
     * @param compKey
     * @param line
     * @return
     */
    @VisibleForTesting
    INode resolveComponent(String compKey, final int line)
    {
        CodeTree tree = metricsContext.getTree();

        final FileNode fnode = tree.getUtils().findFile(compKey.toString());
        if (line >= 1)
        {
            final TypeNode type = tree.getUtils().findType(fnode, line);
            final MethodNode mnode = tree.getUtils().findMethod(type, line);
            if (mnode != null)
            {
                return mnode;
            }
            else
            {
                return type;
            }
        }
        else
        {
            return fnode;
        }
    }
}
