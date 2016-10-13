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

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.ce.measure.Component;
import org.sonar.api.ce.measure.Issue;
import org.sonar.api.ce.measure.Measure;
import org.sonar.api.ce.measure.MeasureComputer;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.sparqline.quamoco.MetricNames;
import com.sparqline.quamoco.codetree.CodeNode;
import com.sparqline.quamoco.codetree.CodeTree;
import com.sparqline.quamoco.codetree.FileNode;
import com.sparqline.quamoco.codetree.MethodNode;
import com.sparqline.quamoco.codetree.ProjectNode;
import com.sparqline.quamoco.codetree.TypeNode;
import com.sparqline.quamoco.distiller.Grade;
import com.sparqline.quamoco.distiller.ModelDistiller;
import com.sparqline.quamoco.graph.edge.Edge;
import com.sparqline.quamoco.graph.node.FactorNode;
import com.sparqline.quamoco.graph.node.Finding;
import com.sparqline.quamoco.graph.node.FindingNode;
import com.sparqline.quamoco.graph.node.MeasureNode;
import com.sparqline.quamoco.graph.node.Node;
import com.sparqline.quamoco.graph.node.ValueNode;
import com.sparqline.quamoco.io.MetricPropertiesReader;
import com.sparqline.quamoco.processor.MetricsContext;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * QuamocoMeasureComputer -
 * 
 * @author Isaac Griffith
 *
 */
public abstract class QuamocoMeasureComputer implements MeasureComputer {

    private static final Logger               LOG             = LoggerFactory.getLogger(QuamocoMeasureComputer.class);

    protected Map<String, String>             gradeMap;
    protected Map<String, Double>             measureValues;
    protected MetricsContext                  metricsContext;
    protected DirectedSparseGraph<Node, Edge> graph;
    protected Map<String, List<Issue>>        issueMap;
    protected Map<String, List<FileNode>>     files;
    protected String                          projectID;
    protected CodeTree                        mainTree;

    private static final String[]             QUALITY_ASPECTS = { "functional correctness",
            "reusability",
            "performance efficiency",
            "testability",
            "analyzability",
            "portability",
            "maintainability",
            "resource utilization",
            "security",
            "time behavior",
            "modifiability",
            "Quality @Product",
            "functional suitability",
            "reliability" };
    // private FileSystem fs;
    // private ActiveRules active;

    /**
     * 
     */
    public QuamocoMeasureComputer(/* FileSystem fs, ActiveRules ar */) {
        issueMap = Maps.newHashMap();
        measureValues = Maps.newHashMap();
        gradeMap = Maps.newHashMap();
        files = Maps.newHashMap();
        metricsContext = MetricsContext.getCleanInstance();
        mainTree = new CodeTree();
        // this.fs = fs;
        // this.active = ar;
    }

    /**
     * 
     */
    protected abstract void executeQuamocoDetector();

    /**
     * @return
     */
    protected abstract String getLanguage();

    /**
     * @return
     */
    protected abstract List<String> getRepoNames();

    /**
     * @return
     */
    protected abstract String getExtension();

    /**
     * @return
     */
    protected abstract List<String> getOutputMetrics();

    /*
     * (non-Javadoc)
     * 
     * @see org.sonar.api.ce.measure.MeasureComputer#define(org.sonar.api.ce.measure.MeasureComputer.
     * MeasureComputerDefinitionContext)
     */
    @Override
    public MeasureComputerDefinition define(MeasureComputerDefinitionContext defContext) {
        return defContext.newDefinitionBuilder()
                .setInputMetrics("sc_understand_file",
                        QuamocoConstants.PLUGIN_KEY + "." + QuamocoConstants.CODE_TREE)
                .setOutputMetrics(getOutputMetrics().toArray(new String[0]))
                .build();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.sonar.api.ce.measure.MeasureComputer#compute(org.sonar.api.ce.measure.MeasureComputer.MeasureComputerContext)
     */
    @Override
    public void compute(MeasureComputerContext context) {
        Component comp = context.getComponent();
        List<Issue> issues;
        // LOG.info(String.format("%s of %s", m.getType().toString(), m.getKey()));

        switch (comp.getType()) {
            case PROJECT:
                metricsContext.merge(mainTree);

                LOG.info("Project Key: " + comp.getKey() + " Tree Root Key: "
                        + metricsContext.getTree().getProject().getQIdentifier());
                if (metricsContext.getTree().getProject().getQIdentifier().equals(comp.getKey())) {
                    // collectBaseMetrics(context);
                    // metricsContext.merge(mainTree);
                    // LOG.info("Project Data after metrics: \n" + metricsContext.getTree().toJSON());

                    graph = buildGraph(context);
                    linkToGraph();

                    for (String file : issueMap.keySet()) {
                        issues = issueMap.get(file);
                        linkIssues(file, issues);
                    }
                    executeQuamocoDetector();
                    evaluateResults();

                    final String[] map = MetricPropertiesReader.read();
                    final Map<String, Double> valueMap = getValues(graph, map);
                    final Map<String, String> gradeMap = getGrades(valueMap);

                    for (Node n : graph.getVertices()) {
                        if (n instanceof MeasureNode || n instanceof FactorNode) {
                            LOG.info("@" + n.getClass().getSimpleName() + " Value of " + n.getName() + " is "
                                    + n.getValue());
                        }
                    }

                    saveMeasures(context, valueMap);
                }
                break;
            case FILE:
                collectCodeTree(context);
                collectBaseMetrics(context);

                issues = Lists.newArrayList();
                issues.addAll(context.getIssues());
                issueMap.put(comp.getKey(), issues);
                break;
            default:
                issues = Lists.newArrayList();
                issues.addAll(context.getIssues());
                issueMap.put(comp.getKey(), issues); // TODO sync this key
                break;
        }
    }

    /**
     * @param context
     */
    @VisibleForTesting
    void collectCodeTree(MeasureComputerContext context) {
        Measure treeMeasure = context.getMeasure(QuamocoConstants.PLUGIN_KEY + "." + QuamocoConstants.CODE_TREE);
        if (treeMeasure != null) {
            CodeTree temp = CodeTree.createFromJson(treeMeasure.getStringValue());
            LOG.info("Merging main tree");
            mainTree.merge(temp);
        }
    }

    /**
     * @param context
     */
    @VisibleForTesting
    void collectBaseMetrics(final MeasureComputerContext context) {
        ProjectNode node = null;
        CodeTree tree = null;

        switch (context.getComponent().getType()) {
            case FILE:
                final Measure fileMetric = context.getMeasure("sc_understand_file");
                if (fileMetric != null) {
                    final String fileJson = fileMetric.getStringValue();
                    CodeTree filetree = CodeTree.createFromJson(fileJson);

                    mainTree.merge(filetree);
                }
                else {
                    LOG.warn("FileNode was Null");
                }
                break;
            // case PROJECT:
            // projectID = context.getComponent().getKey();
            //
            // final Measure projectMetrics = context.getMeasure("sc_understand_project");
            // LOG.info("Project ID: " + projectID);
            // //if (projectMetrics != null) {
            // final String projJson = projectMetrics.getStringValue();
            // LOG.info(projJson);
            // tree = CodeTree.createFromJson(projJson);
            // LOG.info("Merging Project Tree");
            // mainTree.merge(tree);
            // //}

            // node = mainTree.findProject(projectID);
            // if (node != null && files.containsKey(projectID)) {
            // for (FileNode fn : files.get(projectID)) {
            // FileNode toUpdate = node.getFile(fn.getQIdentifier());
            // if (toUpdate != null)
            // toUpdate.update(fn);
            // }
            // }
            // break;
            default:
                break;
        }
    }

    /**
     * @param context
     * @return
     */
    @VisibleForTesting
    DirectedSparseGraph<Node, Edge> buildGraph(final MeasureComputerContext context) {
        final ModelDistiller distiller = new ModelDistiller();
        distiller.setLanguage(getLanguage());
        distiller.buildGraph();
        final DirectedSparseGraph<Node, Edge> graph = distiller.getGraph();
        return graph;
    }

    /**
     * @param context
     * @param valueMap
     */
    @VisibleForTesting
    void saveMeasures(final MeasureComputerContext context, final Map<String, Double> valueMap) {
        for (final String key : valueMap.keySet()) {
            if (valueMap.get(key).isNaN()) {
                LOG.warn("Found NaN so skipping");
                continue;
            }
            else if (valueMap.get(key).isInfinite()) {
                LOG.warn("Found Infinite so skipping");
                continue;
            }

            Double value = valueMap.get(key);
            LOG.info(QuamocoConstants.PLUGIN_KEY + "." + key.toUpperCase().replaceAll(" ", "_") + " = "
                    + value);
            context.addMeasure(QuamocoConstants.PLUGIN_KEY + "." + key.toUpperCase().replaceAll(" ", "_"),
                    value);
            // context.addMeasure(QuamocoConstants.PLUGIN_KEY + "." + key.toUpperCase().replaceAll(" ", "_") + ".GRADE",
            // gradeMap.get(key));
        }
    }

    /**
     * @param graph
     */
    @VisibleForTesting
    void evaluateResults() {
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
     * 
     */
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

    /**
     * @param value
     * @return
     */
    protected String getGrade(final double value) {
        final List<Grade> grades = Grade.getGrades();
        for (final Grade g : grades) {
            if (g.evaluate(value) == 0) {
                return g.getName();
            }
        }

        return Grade.U.getName();
    }

    /**
     * @param valueMap
     * @return
     */
    protected Map<String, String> getGrades(final Map<String, Double> valueMap) {
        final Map<String, String> retVal = new HashMap<>();

        for (final String key : valueMap.keySet()) {
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
    protected Map<String, Double> getValues(final DirectedSparseGraph<Node, Edge> graph, final String[] keys) {
        final Map<String, Double> retVal = new HashMap<>();

        for (final Node node : graph.getVertices()) {
            if (node instanceof FactorNode) {
                for (String key : keys) {
                    if (node.getName().toLowerCase().contains(key.toLowerCase())
                            && !node.getName().toLowerCase().contains("concern")) {
                        retVal.put(key, node.getValue());
                    }
                }
            }
        }

        return retVal;
    }

    /**
     * @param issues
     * @param baseDir
     */
    protected void linkIssues(String compKey, List<? extends Issue> issues) {
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
            String ruleName = issue.ruleKey().rule();
            final String repo = issue.ruleKey().repository();

            boolean found = getRepoNames().contains(issue.ruleKey().repository().toLowerCase());

            if (getRepoNames().contains(repo.toLowerCase())) {
                int line = 0;

                Class c = issue.getClass();
                try {
                    Method getLine = c.getMethod("getLine");
                    if (getLine != null) {
                        line = (Integer) getLine.invoke(issue);
                    }
                }
                catch (Exception e) {
                    LOG.warn(e.getClass().getSimpleName());
                }

                String key = compKey.split(":")[2];
                final CodeNode location = resolveComponent(compKey, line);
                if (location != null) {
                    final Finding finding = new Finding(location, issue.ruleKey().toString(), ruleName);

                    if (toolFindingMap.containsKey(repo)) {
                        if (toolFindingMap.get(repo).containsKey(issue.ruleKey().rule())) {
                            toolFindingMap.get(repo).get(issue.ruleKey().rule()).addFinding(finding);
                        }
                    }
                }
            }
        }

        int count = 0;
        for (final Node n : graph.getVertices()) {
            if (n instanceof FindingNode) {
                final FindingNode fnode = (FindingNode) n;

                count += fnode.getFindings().size();
            }
        }
    }

    /**
     * @param compKey
     * @param line
     * @return
     */
    @VisibleForTesting
    CodeNode resolveComponent(String compKey, final int line) {
        String key = compKey.split(":")[2];

        CodeTree tree = metricsContext.getTree();

        final FileNode fnode = tree.findFile(compKey.toString());
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

    public void updateProjectData(CodeTree tree) {
        System.out.println("Updating Project Data");
        ProjectNode root = tree.getProject();

        Stack<ProjectNode> stack = new Stack<>();
        ProjectNode current = root;
        stack.push(root);

        stackBuilder(stack, current);

        while (!stack.isEmpty()) {
            current = stack.pop();

            for (FileNode fn : current.getFiles()) {
                current.incrementMetric(MetricNames.NOM, fn.getMetric(MetricNames.NOM));
                current.incrementMetric(MetricNames.NIV, fn.getMetric(MetricNames.NIV));
                current.incrementMetric(MetricNames.NOS, fn.getMetric(MetricNames.NOS));
                current.incrementMetric(MetricNames.NCV, fn.getMetric(MetricNames.NCV));
                current.incrementMetric(MetricNames.NOF, fn.getMetric(MetricNames.NOF));
                current.incrementMetric(MetricNames.LOC, fn.getMetric(MetricNames.LOC));
                current.incrementMetric(MetricNames.NC, fn.getMetric(MetricNames.NC));

                if (current.hasMetric(MetricNames.MAXNESTING)) {
                    double projMN = current.getMetric(MetricNames.MAXNESTING);
                    current.addMetric(MetricNames.MAXNESTING, Math.max(projMN, fn.getMetric(MetricNames.MAXNESTING)));
                }
                else {
                    current.addMetric(MetricNames.MAXNESTING, fn.getMetric(MetricNames.MAXNESTING));
                }
            }

            for (ProjectNode pn : current.getSubProjects()) {
                current.incrementMetric(MetricNames.NOM, pn.getMetric(MetricNames.NOM));
                current.incrementMetric(MetricNames.NIV, pn.getMetric(MetricNames.NIV));
                current.incrementMetric(MetricNames.NOS, pn.getMetric(MetricNames.NOS));
                current.incrementMetric(MetricNames.NCV, pn.getMetric(MetricNames.NCV));
                current.incrementMetric(MetricNames.LOC, pn.getMetric(MetricNames.LOC));
                current.incrementMetric(MetricNames.NOF, pn.getMetric(MetricNames.NOF));
                current.incrementMetric(MetricNames.NC, pn.getMetric(MetricNames.NC));
                if (current.hasMetric(MetricNames.MAXNESTING)) {
                    double projMN = current.getMetric(MetricNames.MAXNESTING);
                    current.addMetric(MetricNames.MAXNESTING, Math.max(projMN, pn.getMetric(MetricNames.MAXNESTING)));
                }
                else {
                    current.addMetric(MetricNames.MAXNESTING, pn.getMetric(MetricNames.MAXNESTING));
                }
            }
        }
    }

    private void stackBuilder(Stack<ProjectNode> nodes, ProjectNode current) {
        for (ProjectNode pnode : current.getSubProjects()) {
            nodes.push(pnode);
            stackBuilder(nodes, pnode);
        }
    }
}
