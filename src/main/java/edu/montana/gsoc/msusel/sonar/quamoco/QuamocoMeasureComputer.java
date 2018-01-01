/**
 * The MIT License (MIT)
 *
 * SparQLine Analytics Sonar Quamoco Plugin
 * Copyright (c) 2015-2017 Isaac Griffith, SparQLine Analytics, LLC
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
package edu.montana.gsoc.msusel.sonar.quamoco;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.jdt.annotation.NonNull;
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

import edu.montana.gsoc.msusel.CodeTree;
import edu.montana.gsoc.msusel.INode;
import edu.montana.gsoc.msusel.metrics.MetricsAggregator;
import edu.montana.gsoc.msusel.metrics.Register;
import edu.montana.gsoc.msusel.metrics.aggregators.ClassMetricsAggregator;
import edu.montana.gsoc.msusel.metrics.aggregators.FileMetricsAggregator;
import edu.montana.gsoc.msusel.metrics.aggregators.MethodMetricsAggregator;
import edu.montana.gsoc.msusel.metrics.aggregators.SystemMetricsAggregator;
import edu.montana.gsoc.msusel.node.FileNode;
import edu.montana.gsoc.msusel.node.MethodNode;
import edu.montana.gsoc.msusel.node.ProjectNode;
import edu.montana.gsoc.msusel.node.TypeNode;
import edu.montana.gsoc.msusel.quamoco.distiller.ModelDistiller;
import edu.montana.gsoc.msusel.quamoco.graph.edge.Edge;
import edu.montana.gsoc.msusel.quamoco.graph.node.FactorNode;
import edu.montana.gsoc.msusel.quamoco.graph.node.Finding;
import edu.montana.gsoc.msusel.quamoco.graph.node.FindingNode;
import edu.montana.gsoc.msusel.quamoco.graph.node.Node;
import edu.montana.gsoc.msusel.quamoco.graph.node.ValueNode;
import edu.montana.gsoc.msusel.quamoco.processor.MetricsContext;
import edu.montana.gsoc.msusel.sonar.quamoco.computestates.CSharpComputeState;
import edu.montana.gsoc.msusel.sonar.quamoco.computestates.JavaComputeState;
import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * Class used by SonarQube to evaluate identified quality aspects and store
 * their results via the SonarQube Compute Engine.
 * 
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class QuamocoMeasureComputer implements MeasureComputer {

    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(QuamocoMeasureComputer.class);

    /**
     * Map to hold the measure values indexed by the measure identifier
     */
    protected Map<String, BigDecimal>         measureValues;
    /**
     * Context which contains the main CodeTree and metrics
     */
    protected MetricsContext                  metricsContext;
    /**
     * Distilled quality model graph
     */
    protected DirectedSparseGraph<Node, Edge> graph;
    /**
     * Lists of issues indexed by the component key of the affected component
     */
    protected Map<String, List<Issue>>        issueMap;
    /**
     * The language specific compute state
     */
    protected QuamocoComputeState             state;
    /**
     * List of file nodes used to bottom-up construct the codetree
     */
    private List<FileNode>                    fileNodes;
    /**
     * List of subprojects used to bottom-up construct the codetree - Note this
     * will soon be changed to ModuleNodes
     */
    private List<ProjectNode>                 moduleNodes;
    /**
     * List of upper-level projects used to bottom-up construct the codetree
     */
    private List<ProjectNode>                 projectNodes;

    /**
     * Constructs a new QuamocoMeasureComputer
     */
    public QuamocoMeasureComputer()
    {
        issueMap = Maps.newHashMap();
        measureValues = Maps.newHashMap();
        Register.register();
        metricsContext = MetricsContext.getCleanInstance();
        fileNodes = Lists.newArrayList();
        projectNodes = Lists.newArrayList();
        moduleNodes = Lists.newArrayList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeasureComputerDefinition define(MeasureComputerDefinitionContext defContext)
    {
        return defContext.newDefinitionBuilder()
                .setInputMetrics(QuamocoConstants.PLUGIN_KEY + "." + QuamocoConstants.CODE_TREE)
                .setOutputMetrics(getOutputMetrics().toArray(new String[0]))
                .build();
    }

    /**
     * @return returns a list of output metric names
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

        switch (comp.getType())
        {
        case PROJECT:
            handleProject(context, comp);
            break;
        case FILE:
            handleFile(context, comp);
            break;
        case MODULE:
            handleModule(comp.getKey());
            break;
        case DIRECTORY:
        case SUBVIEW:
        case VIEW:
            break;
        }
    }

    /**
     * Handles the evaluation of a SonarQube project
     * 
     * @param context
     *            The current measure computer context
     * @param comp
     *            The project component
     */
    @VisibleForTesting
    void handleProject(MeasureComputerContext context, Component comp)
    {
        List<Issue> issues;
        ProjectNode.Builder builder = ProjectNode.builder(comp.getKey());
        moduleNodes.forEach((module) -> builder.project(module));
        fileNodes.forEach((file) -> builder.file(file));
        moduleNodes.clear();
        fileNodes.clear();

        List<ProjectNode> toRemove = Lists.newArrayList();
        for (ProjectNode pn : projectNodes)
        {
            if (pn.getQIdentifier().startsWith(comp.getKey()) && pn.getQIdentifier().length() > comp.getKey().length())
            {
                toRemove.add(pn);
                builder.project(pn);
            }
        }
        projectNodes.removeAll(toRemove);

        ProjectNode proj = builder.create();
        projectNodes.add(proj);

        CodeTree tree = new CodeTree();
        tree.setProject(proj);
        metricsContext.setTree(tree);

        aggregateProjectMetrics(tree);
        graph = buildGraph(context);
        linkToGraph();

        for (String file : issueMap.keySet())
        {
            issues = issueMap.get(file);
            linkIssues(file, issues);
        }
        logFindings();
        state.executeQuamocoDetector(graph, metricsContext, proj.getQIdentifier());
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

    /**
     * Handles the computation on File level components
     * 
     * @param context
     *            The associated context for this measure computer
     * @param comp
     *            The file component
     */
    @VisibleForTesting
    void handleFile(MeasureComputerContext context, Component comp)
    {
        List<Issue> issues;
        if (state == null)
        {
            state = selectState(comp);
        }
        CodeTree tree = collectCodeTree(context);

        if (tree != null)
        {
            issues = Lists.newArrayList();
            issues.addAll(context.getIssues());
            LOG.info("Issues @" + comp.getKey() + ": " + issues.size());
            issueMap.put(comp.getKey(), Lists.newArrayList(issues));
            @NonNull
            FileNode f = tree.getUtils().findFile(comp.getKey());
            if (f != null)
                fileNodes.add(f);
            else
                LOG.warn("Couldn't find file: " + comp.getKey());
        }
    }

    /**
     * Handles the computation on Module level components
     * 
     * @param compKey
     *            The key of the component to handle
     */
    @VisibleForTesting
    void handleModule(String compKey)
    {
        LOG.info("MODULE = " + compKey);
        ProjectNode.Builder builder = ProjectNode.builder(compKey);
        fileNodes.forEach((file) -> builder.file(file));
        final List<ProjectNode> toRemove = Lists.newArrayList();
        moduleNodes.forEach((mod) -> {
            if (mod.getQIdentifier().startsWith(compKey) && !mod.getQIdentifier().equals(compKey))
            {
                builder.project(mod);
                toRemove.add(mod);
            }
        });
        moduleNodes.removeAll(toRemove);
        moduleNodes.add(builder.create());
        fileNodes.clear();
    }

    /**
     * @param tree
     *            The tree on which to aggregate metrics
     */
    @VisibleForTesting
    void aggregateProjectMetrics(CodeTree tree)
    {
        LOG.info("Aggregating Quamoco Base Measures");

        MetricsAggregator ma = new MethodMetricsAggregator();
        ma.addExcludedMetric("LOC");
        ma.aggregate(tree);

        ma = new ClassMetricsAggregator();
        ma.addExcludedMetric("LOC");
        ma.aggregate(tree);

        ma = new FileMetricsAggregator();
        // ma.addExcludedMetric("LOC");
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
     * Given a file level component, this method will select the correct
     * language specific compute state.
     * 
     * @param comp
     *            File level component to be used to identify the component
     *            state
     * @return Language specific compute state
     */
    @VisibleForTesting
    QuamocoComputeState selectState(Component comp)
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

    /**
     * Logs the findings found for each factor in the distilled quality model
     * graph
     */
    @VisibleForTesting
    void logFindings()
    {
        for (String name : QuamocoMetrics.QUALITY_ASPECTS)
        {
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
    }

    /**
     * Collects the code tree for the given context
     * 
     * @param context
     *            MeasureComputer context
     */
    @VisibleForTesting
    CodeTree collectCodeTree(MeasureComputerContext context)
    {
        Measure treeMeasure = context.getMeasure(QuamocoConstants.PLUGIN_KEY + "." + QuamocoConstants.CODE_TREE);
        if (treeMeasure != null)
        {
            CodeTree temp = CodeTree.createFromJson(treeMeasure.getStringValue());
            return temp;
        }

        return null;
    }

    /**
     * Controls the distillation of a quamoco quality model and returns the
     * generated graph.
     * 
     * @param context
     *            MeasureComputer context
     * @return Distilled quality model graph
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
     * Saves the collect measures at the project level for the current quality
     * models
     * 
     * @param context
     *            MeasureComputer used to save the measures
     * @param valueMap
     *            Map of measure values indexed by the measure name
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
     * Executes the evaluation of the quality factors in the distilled quality
     * model graph.
     * 
     * @param graph
     *            Graph whose factors are to be evaluated.
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
     * Links measurement values to ValueNodes in the distilled quality model
     * graph.
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
     * Extracts the values of all factors, provided in the list of keys, in the
     * quality model
     * 
     * @param graph
     *            Distilled graph of the quality model
     * @param keys
     *            List of factor identifiers for which values are to be
     *            extracted
     * @return Map of quality factor values indexed by the factor identifiers
     */
    @VisibleForTesting
    Map<String, BigDecimal> getValues(final DirectedSparseGraph<Node, Edge> graph, final List<String> keys)
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
     * Links found issues to the associated FindingNode in the distilled quality
     * model graph
     * 
     * @param compKey
     *            component key to which the issues are associated
     * @param issues
     *            List of issues found
     */
    @VisibleForTesting
    void linkIssues(String compKey, List<? extends Issue> issues)
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
                int line = 1;

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
     * Resolves a component to its node in the CodeTree using the line at which
     * the issue was found and the component key of the component the issue
     * affects.
     * 
     * @param compKey
     *            Key of the component which is affected by an issue
     * @param line
     *            Line of the item which has been affected.
     * @return The lowest level node in the code tree which can be associated
     *         with the given line in a node with the same key as the affected
     *         component.
     */
    @VisibleForTesting
    INode resolveComponent(String compKey, final int line)
    {
        CodeTree tree = metricsContext.getTree();

        final FileNode fnode = tree.getUtils().findFile(compKey);
        if (line >= 1 && fnode != null)
        {
            final TypeNode type = fnode.findType(line);
            if (type != null)
            {
                final MethodNode mnode = type.findMethod(line);
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
        else
        {
            return fnode;
        }
    }
}
