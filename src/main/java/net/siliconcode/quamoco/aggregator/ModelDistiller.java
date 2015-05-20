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
package net.siliconcode.quamoco.aggregator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Shape;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.swing.JFrame;
import javax.xml.stream.XMLStreamException;

import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.FactorNode;
import net.siliconcode.quamoco.aggregator.graph.InfluenceEdge;
import net.siliconcode.quamoco.aggregator.graph.MeasureNode;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.graph.NormalizationEdge;
import net.siliconcode.quamoco.aggregator.graph.NormalizationNode;
import net.siliconcode.quamoco.aggregator.graph.ParentEdge;
import net.siliconcode.quamoco.aggregator.graph.ValueEdge;
import net.siliconcode.quamoco.aggregator.graph.ValueNode;
import net.siliconcode.quamoco.aggregator.io.MetricsFileWriter;
import net.siliconcode.quamoco.aggregator.io.QMReader;
import net.siliconcode.quamoco.aggregator.io.RootNotFoundException;
import net.siliconcode.quamoco.aggregator.qm.AbstractQMEntity;
import net.siliconcode.quamoco.aggregator.qm.Evaluation;
import net.siliconcode.quamoco.aggregator.qm.Factor;
import net.siliconcode.quamoco.aggregator.qm.Function;
import net.siliconcode.quamoco.aggregator.qm.Influence;
import net.siliconcode.quamoco.aggregator.qm.Measure;
import net.siliconcode.quamoco.aggregator.qm.MeasurementMethod;
import net.siliconcode.quamoco.aggregator.qm.QualityModel;
import net.siliconcode.quamoco.aggregator.qm.Ranking;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.collections15.Transformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.uci.ics.jung.algorithms.layout.DAGLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;

/**
 * ModelDistiller -
 *
 * @author Isaac Griffith
 */
public class ModelDistiller {

    private static final Logger  LOG = LoggerFactory.getLogger(ModelDistiller.class);
    private static final Options options;

    static
    {
        final Option help = Option.builder("h").hasArg(false).required(false).longOpt("help")
                .desc("prints this message").hasArg(false).build();
        final Option view = Option.builder("v").hasArg(false).required(false).longOpt("view")
                .desc("view the quality model processing graph").hasArg(false).build();
        final Option lang = Option.builder("l").required(false).longOpt("lang").argName("LANGUAGE")
                .desc("the name of the language: java or csharp").hasArg(true).numberOfArgs(1).build();
        final Option metfile = Option.builder("m").required(false).longOpt("metrics-file").argName("FILE")
                .desc("the name of the metrics properties file").hasArg(true).numberOfArgs(1).build();
        options = new Options();
        options.addOption(help);
        options.addOption(view);
        options.addOption(metfile);
        options.addOption(lang);
    }

    /**
     * @param args
     */
    public static void main(final String[] args)
    {
        final ModelDistiller dqm = new ModelDistiller();
        final CommandLineParser parser = new DefaultParser();
        try
        {
            final CommandLine line = parser.parse(options, args);
            dqm.execute(line, options);
        }
        catch (final ParseException exp)
        {
            System.err.println("Parsing failed. Reason: " + exp.getMessage());
        }
    }

    private final DirectedSparseGraph<Node, Edge> graph;
    private final Map<String, QualityModel>       modelMap   = new HashMap<>();
    private final Map<String, Node>               factorMap  = new HashMap<>();
    private final Map<String, Node>               measureMap = new HashMap<>();
    private final Map<String, Node>               valuesMap  = new HashMap<>();

    private String                                language;

    /**
     *
     */
    public ModelDistiller(final String... args)
    {
        graph = new DirectedSparseGraph<>();
    }

    /**
     * @param g
     * @param node
     * @param nextOpp
     */
    private void addEdge(final DirectedSparseGraph<Node, Edge> g, final Node src, final Node dest)
    {
        if (src instanceof ValueNode)
        {
            g.addEdge(new ValueEdge(src.getName() + ":" + dest.getName()), src, dest, EdgeType.DIRECTED);
        }
        else if (src instanceof MeasureNode)
        {
            g.addEdge(new ParentEdge(src.getName() + ":" + dest.getName()), src, dest, EdgeType.DIRECTED);
        }
        else if (src instanceof NormalizationNode)
        {
            g.addEdge(new NormalizationEdge(src.getName() + ":" + dest.getName()), src, dest, EdgeType.DIRECTED);
        }
        else if (src instanceof FactorNode)
        {
            g.addEdge(new InfluenceEdge(src.getName() + ":" + dest.getName()), src, dest, EdgeType.DIRECTED);
        }
    }

    /**
     * @param modelMap
     * @param factorMap
     */
    private void addNodesToGraph(final Map<String, QualityModel> modelMap, final Map<String, Node> factorMap)
    {
        for (final String key : factorMap.keySet())
        {
            final Factor factor = (Factor) findEntity(modelMap, key);
            final Node src = factorMap.get(key);
            for (final Influence inf : factor.getInfluences())
            {
                final Node dest = factorMap.get(inf.getTarget());
                addEdge(graph, src, dest);
            }
            if (factor.getRefines() != null)
            {
                final Node dest = factorMap.get(factor.getRefines());
                addEdge(graph, src, dest);
            }
        }

        for (final String key : measureMap.keySet())
        {
            final Measure measure = (Measure) findEntity(modelMap, key);
            final Node src = measureMap.get(key);
            for (final String parent : measure.getParents())
            {
                Node dest = measureMap.get(parent);
                if (dest == null)
                {
                    dest = factorMap.get(parent);
                }
                if (dest != null)
                {
                    addEdge(graph, src, dest);
                }
            }
            if (measure.getRefines() != null)
            {
                final Node dest = measureMap.get(measure.getRefines()) != null ? measureMap.get(measure.getRefines())
                        : factorMap.get(measure.getRefines());
                addEdge(graph, src, dest);
            }
        }

        for (final String key : valuesMap.keySet())
        {
            final MeasurementMethod method = (MeasurementMethod) findEntity(modelMap, key);
            final Node src = valuesMap.get(key);
            if (method.getDetermines() != null)
            {
                final Node dest = measureMap.get(method.getDetermines()) != null ? measureMap.get(method
                        .getDetermines()) : factorMap.get(method.getDetermines());
                addEdge(graph, src, dest);
            }
        }

        for (final QualityModel model : modelMap.values())
        {
            for (final Evaluation eval : model.getEvaluations())
            {
                for (final Ranking rank : eval.getRankings())
                {
                    if (rank.getNormalizationMeasure() != null)
                    {
                        final Node src = measureMap.get(rank.getNormalizationMeasure());
                        Node dest = null;
                        if (rank.getFactor() != null)
                        {
                            dest = factorMap.get(rank.getFactor());
                        }
                        else
                        {
                            dest = measureMap.get(rank.getMeasure());
                        }
                        if (dest != null)
                        {
                            graph.addEdge(new NormalizationEdge(src.getName() + ":" + dest.getName()), src, dest);
                        }
                    }
                }
            }
        }
    }

    public void buildGraph()
    {
        final String[] files = selectQMFiles();
        final List<QualityModel> models = readInQualityModels(files);

        createModelMap(modelMap, models);
        extractFactorsAndMeasures(factorMap, measureMap, models);
        extractValues(valuesMap, models);
        extractEvaluatedBy(factorMap, measureMap, models);
        addNodesToGraph(modelMap, factorMap);
        connectNodes(modelMap, factorMap, measureMap, valuesMap);
        cleanGraph();
    }

    /**
     *
     */
    private void cleanGraph()
    {
        final List<Node> toRemove = new ArrayList<>();
        do
        {
            for (final Node n : toRemove)
            {
                graph.removeVertex(n);
            }

            toRemove.clear();

            for (final Node n : graph.getVertices())
            {
                if (graph.inDegree(n) < 1 && !(n instanceof ValueNode))
                {
                    toRemove.add(n);
                }
            }
        }
        while (!toRemove.isEmpty());
    }

    /**
     * @param modelMap
     * @param factorMap
     * @param measureMap
     */
    private void connectNodes(final Map<String, QualityModel> modelMap, final Map<String, Node> factorMap,
            final Map<String, Node> measureMap, final Map<String, Node> valuesMap)
    {
        for (final Edge edge : graph.getEdges())
        {
            if (edge instanceof InfluenceEdge)
            {
                final InfluenceEdge ie = (InfluenceEdge) edge;
                final Evaluation eval = getEvaluates(graph.getDest(edge));
                final Factor srcFact = getFactor(graph.getSource(edge));

                if (srcFact != null && eval != null)
                {
                    for (final Ranking rank : eval.getRankings())
                    {
                        if (rank.getFactor() != null)
                        {
                            if (rank.getFactor().equals(srcFact.getId()))
                            {
                                if (rank.getRank() != null)
                                {
                                    ie.setRank(Integer.parseInt(rank.getRank()));
                                }
                                if (rank.getWeight() != null)
                                {
                                    ie.setWeight(Double.parseDouble(rank.getWeight()));
                                }
                                if (rank.getFunction() != null)
                                {
                                    final Function f = rank.getFunction();
                                    ie.setLowerBound(f.getLowerBound());
                                    ie.setUpperBound(f.getUpperBound());
                                }
                                break;
                            }
                        }
                    }
                }
            }
            else if (edge instanceof NormalizationEdge)
            {

            }
            else if (edge instanceof ParentEdge)
            {
                final ParentEdge pe = (ParentEdge) edge;
                final Measure srcMeasure = getMeasure(graph.getSource(pe));
                final Measure destMeasure = getMeasure(graph.getDest(pe));
                if (destMeasure != null)
                {
                    final Evaluation eval = getEvaluates(graph.getDest(edge));
                    if (eval != null)
                    {
                        for (final Ranking rank : eval.getRankings())
                        {
                            if (rank.getMeasure() != null)
                            {
                                if (rank.getMeasure().equals(srcMeasure.getId()))
                                {
                                    if (rank.getRank() != null)
                                    {
                                        pe.setRank(Integer.parseInt(rank.getRank()));
                                    }
                                    if (rank.getWeight() != null)
                                    {
                                        pe.setWeight(Double.parseDouble(rank.getWeight()));
                                    }
                                    if (rank.getFunction() != null)
                                    {
                                        pe.setLowerBound(rank.getFunction().getLowerBound());
                                        pe.setUpperBound(rank.getFunction().getUpperBound());
                                    }
                                    if (rank.getNormalizationMeasure() != null)
                                    {
                                        final Node src = measureMap.get(rank.getNormalizationMeasure());
                                        final Node dest = graph.getSource(pe);
                                        graph.addEdge(new NormalizationEdge(src.getName() + ":" + dest.getName()), src,
                                                dest);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                else
                {
                    final Factor destFact = getFactor(graph.getDest(pe));
                    if (destFact != null)
                    {
                        final Evaluation eval = getEvaluates(graph.getDest(edge));
                        if (eval != null)
                        {
                            for (final Ranking rank : eval.getRankings())
                            {
                                if (rank.getMeasure() != null)
                                {
                                    if (rank.getMeasure().equals(srcMeasure.getId()))
                                    {
                                        if (rank.getRank() != null)
                                        {
                                            pe.setRank(Integer.parseInt(rank.getRank()));
                                        }
                                        if (rank.getWeight() != null)
                                        {
                                            pe.setWeight(Double.parseDouble(rank.getWeight()));
                                        }
                                        if (rank.getFunction() != null)
                                        {
                                            pe.setLowerBound(rank.getFunction().getLowerBound());
                                            pe.setUpperBound(rank.getFunction().getUpperBound());
                                        }
                                        if (rank.getNormalizationMeasure() != null)
                                        {
                                            final Node src = measureMap.get(rank.getNormalizationMeasure());
                                            final Node dest = graph.getSource(pe);
                                            graph.addEdge(new NormalizationEdge(src.getName() + ":" + dest.getName()),
                                                    src, dest);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (edge instanceof ValueEdge)
            {

            }
        }
    }

    /**
     * @param modelMap
     * @param models
     */
    private void createModelMap(final Map<String, QualityModel> modelMap, final List<QualityModel> models)
    {
        for (final QualityModel model : models)
        {
            modelMap.put(model.getName(), model);
        }
    }

    public void execute(final CommandLine line, final Options options)
    {
        if (line.getOptions().length == 0 || line.hasOption('h'))
        {
            final HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("java -jar QMModelDistiller", options, true);
            System.exit(0);
        }
        if (line.hasOption('l'))
        {
            language = line.getOptionValue('l');
            if (!language.equals("java") && !language.equals("csharp"))
            {
                LOG.warn("Must select a valid language (java or csharp).");
                System.exit(1);
            }
        }

        buildGraph();
        if (line.hasOption('m'))
        {
            writeMetrics(line.getOptionValue('m'));
        }
        if (line.hasOption('v'))
        {
            showGraph();
        }
    }

    /**
     * @param factorMap
     * @param measureMap
     * @param models
     */
    private void extractEvaluatedBy(final Map<String, Node> factorMap, final Map<String, Node> measureMap,
            final List<QualityModel> models)
    {
        for (final QualityModel model : models)
        {
            for (final AbstractQMEntity entity : model.getContained())
            {
                if (entity instanceof Evaluation)
                {
                    final Evaluation eval = (Evaluation) entity;
                    final FactorNode node = (FactorNode) factorMap.get(eval.getEvaluates());
                    node.setOwnedBy(eval.getId());
                    node.addEvaluatedBy(eval.getId());
                    // if (metricMap.containsKey(eval.getEvaluates()))
                    // {
                    // metricMap.get(eval.getEvaluates()).put(eval.getId(),
                    // eval.getId());
                    // }
                    // else
                    // {
                    // Map<String, String> map = new HashMap<>();
                    // map.put(eval.getId(), eval.getId());
                    // metricMap.put(eval.getEvaluates(), map);
                    // }
                    for (final Ranking rank : eval.getRankings())
                    {
                        final String facId = rank.getFactor();
                        if (facId != null)
                        {
                            final FactorNode subnode = (FactorNode) factorMap.get(facId);
                            subnode.addEvaluatedBy(rank.getId());
                            subnode.addParent(node.getName());
                            // if (metricMap.containsKey(facId))
                            // {
                            // metricMap.get(facId).put(rank.getId(),
                            // eval.getId());
                            // }
                            // else
                            // {
                            // Map<String, String> map = new HashMap<>();
                            // map.put(rank.getId(), eval.getId());
                            // metricMap.put(facId, map);
                            // }
                        }
                    }
                }
                else if (entity instanceof MeasurementMethod)
                {
                    final MeasurementMethod method = (MeasurementMethod) entity;
                    final MeasureNode node = (MeasureNode) measureMap.get(method.getDetermines());
                    node.addEvaluatedBy(method.getId());
                }
            }
        }

        for (final Node n : graph.getVertices())
        {
            if (n instanceof FactorNode)
            {
                for (final Edge edge : graph.getOutEdges(n))
                {
                    ((FactorNode) n).addParent(((FactorNode) graph.getOpposite(n, edge)).getName());
                }
            }
        }
    }

    /**
     * @param factorMap
     * @param measureMap
     * @param models
     */
    private void extractFactorsAndMeasures(final Map<String, Node> factorMap, final Map<String, Node> measureMap,
            final List<QualityModel> models)
    {
        for (final QualityModel model : models)
        {
            for (final AbstractQMEntity entity : model.getContained())
            {
                if (entity instanceof Measure)
                {
                    final Measure measure = (Measure) entity;
                    MeasureNode node = null;
                    if (measure.getName() == null)
                    {
                        System.out.println(measure.getId());
                    }

                    if (measure.getType() != null && measure.getType().equals("qm:NormalizationMeasure"))
                    {
                        node = new NormalizationNode(graph, measure.getName(), measure.getId());
                    }
                    else
                    {
                        node = new MeasureNode(graph, measure.getName(), measure.getId());
                    }
                    node.setDescription(measure.getDescription());
                    measureMap.put(measure.getId(), node);
                }
                else if (entity instanceof Factor)
                {
                    final Factor factor = (Factor) entity;
                    final FactorNode node = new FactorNode(graph, factor.getName(), factor.getId());
                    node.setDescription(factor.getDescription());
                    factorMap.put(factor.getId(), node);
                }
            }
        }
    }

    private void extractValues(final Map<String, Node> valueMap, final List<QualityModel> models)
    {
        for (final QualityModel model : models)
        {
            for (final AbstractQMEntity entity : model.getContained())
            {
                if (entity instanceof MeasurementMethod)
                {
                    final MeasurementMethod mm = (MeasurementMethod) entity;
                    ValueNode node = null;
                    if (mm.getType().equals("qm:ManualInstrument"))
                    {
                        node = new ValueNode(graph, mm.getName(), mm.getId(), ValueNode.MANUAL);
                    }
                    else if (mm.getType().equals("qm:ToolBasedInstrument"))
                    {
                        node = new ValueNode(graph, mm.getMetric(), mm.getId(), mm.getTool());
                    }
                    else
                    {
                        node = new ValueNode(graph, mm.getName(), mm.getId(), ValueNode.UNION);
                    }
                    valueMap.put(mm.getId(), node);
                }
            }
        }
    }

    /**
     * @param modelMap
     * @param id
     * @return
     */
    private AbstractEntity findEntity(final Map<String, QualityModel> modelMap, final String id)
    {
        if (modelMap.isEmpty() || id == null)
        {
            return null;
        }

        AbstractEntity entity = null;

        if (id.contains("#"))
        {
            final String[] keys = id.split(".qm#");
            final String model = keys[0];
            entity = modelMap.get(model).find(id);
        }
        else
        {
            for (final QualityModel model : modelMap.values())
            {
                if (model.hasKey(id))
                {
                    entity = model.find(id);
                    break;
                }
            }
        }

        return entity;
    }

    /**
     * @param dest
     * @return
     */
    private Evaluation getEvaluates(final Node dest)
    {
        final AbstractEntity ent = findEntity(modelMap, dest.getOwnedBy());
        if (ent != null && ent instanceof Evaluation)
        {
            return (Evaluation) ent;
        }
        return null;
    }

    /**
     * @param source
     * @return
     */
    private Factor getFactor(final Node source)
    {
        final AbstractEntity ent = findEntity(modelMap, source.getOwnedBy());
        if (ent != null && ent instanceof Factor)
        {
            return (Factor) ent;
        }
        return null;
    }

    /**
     * @return
     */
    public DirectedSparseGraph<Node, Edge> getGraph()
    {
        return graph;
    }

    /**
     * @return the language
     */
    public String getLanguage()
    {
        return language;
    }

    /**
     * @param source
     * @return
     */
    private Measure getMeasure(final Node source)
    {
        final AbstractEntity ent = findEntity(modelMap, source.getOwnedBy());
        if (ent != null && ent instanceof Measure)
        {
            return (Measure) ent;
        }
        return null;
    }

    /**
     * @param args
     * @return
     */
    private List<QualityModel> readInQualityModels(final String... args)
    {
        final QMReader qmread = new QMReader();
        final List<QualityModel> models = new ArrayList<>();
        try
        {
            for (final String arg : args)
            {
                qmread.read(arg);
                models.add(qmread.getModel());
            }
        }
        catch (FileNotFoundException | XMLStreamException e)
        {
            e.printStackTrace();
        }
        return models;
    }

    private String[] selectQMFiles()
    {
        String[] retVal = null;
        final Properties prop = new Properties();
        try
        {
            prop.load(ModelDistiller.class.getResourceAsStream("languages.properties"));

            retVal = ((String) prop.get(language)).split(",");
        }
        catch (final IOException e)
        {
            e.printStackTrace();
        }

        return retVal;
    }

    /**
     * @param language
     *            the language to set
     */
    public void setLanguage(final String language)
    {
        this.language = language;
    }

    public void showGraph(final String... args)
    {
        final Layout<Node, Edge> layout = new DAGLayout<>(graph);
        layout.setSize(new Dimension(700, 700));
        final BasicVisualizationServer<Node, Edge> vv = new BasicVisualizationServer<>(layout);
        vv.setPreferredSize(new Dimension(750, 750));

        final Transformer<Node, Paint> vertexIconTransformer = entity -> {
            if (entity instanceof FactorNode)
            {
                return Color.BLUE;
            }
            else if (entity instanceof NormalizationNode)
            {
                return Color.CYAN;
            }
            else if (entity instanceof MeasureNode)
            {
                return Color.RED;
            }
            else if (entity instanceof ValueNode)
            {
                return Color.YELLOW;
            }

            return null;
        };

        final Transformer<Node, Shape> vertexShapeTransformer = new Transformer<Node, Shape>() {

            private Shape createPolygon(final int centerX, final int centerY, final int radius, final int numSides)
            {
                final Polygon poly = new Polygon();
                for (int i = 0; i < numSides; i++)
                {
                    poly.addPoint((int) (centerX + radius * Math.cos(i * 2 * Math.PI / numSides)),
                            (int) (centerY + radius * Math.sin(i * 2 * Math.PI / numSides)));
                }

                return poly;
            }

            /*
             * (non-Javadoc)
             * @see
             * org.apache.commons.collections15.Transformer#transform(java.lang
             * .Object)
             */
            @Override
            public Shape transform(final Node entity)
            {
                return createPolygon(0, 0, 5, 5);
            }
        };

        vv.getRenderContext().setVertexFillPaintTransformer(vertexIconTransformer);
        vv.getRenderContext().setVertexShapeTransformer(vertexShapeTransformer);
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<Node>());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<Edge>());

        final JFrame frame = new JFrame("Quamoco Quality Model Graph Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);
    }

    public void writeMetricFile(final Path file, final Map<String, QualityModel> modelMap)
    {
        try (PrintWriter pw = new PrintWriter(new FileWriter(file.toFile())))
        {
            final Set<String> keys = new HashSet<>();
            // Map<String, List<String>> parentMap = new HashMap<>();
            // Map<String, List<String>> evalIds = new HashMap<>();

            // for (String facId : metricMap.keySet())
            // {
            // int count = 1;
            // for (String rankId : metricMap.get(facId).keySet())
            // {
            // Factor child = (Factor) findEntity(modelMap, facId);
            // Evaluation eval = (Evaluation) findEntity(modelMap,
            // metricMap.get(facId).get(rankId));
            // Factor parent = (Factor) findEntity(modelMap,
            // eval.getEvaluates());
            //
            // String key = child.getName().replace(" ", "_") + "-" +
            // parent.getName().replace(" ", "_");
            // if (keys.contains(key))
            // key = key + count++;
            // String name = child.getName();
            // String pair = eval.getId() + ";" + rankId;
            // String description = child.getDescription();
            // String id = child.getId();
            //
            // pw.println(String.format("%s.name=%s", key, name));
            // pw.println(String.format("%s.pair=%s", key, pair));
            // pw.println(String.format("%s.description=%s", key, description));
            // pw.println(String.format("%s.id=%s", key, id));
            // pw.println(String.format("%s.key=%s", key, key));
            // keys.add(key);
            // }
            // }
            for (final Node n : graph.getVertices())
            {
                if (n instanceof FactorNode)
                {
                    final String id = n.getOwnedBy();
                    final String name = n.getName();
                    final StringBuilder evaluators = new StringBuilder();
                    for (final String e : ((FactorNode) n).getEvaluatedBy())
                    {
                        evaluators.append(e + ";");
                    }
                    String eval = evaluators.toString();
                    if (eval.endsWith(";"))
                    {
                        eval = eval.substring(0, eval.length() - 1);
                    }
                    final StringBuilder parents = new StringBuilder();
                    for (final String p : ((FactorNode) n).getParents())
                    {
                        parents.append(p + ";");
                    }
                    String par = parents.toString();
                    if (par.endsWith(";"))
                    {
                        par = par.substring(0, par.length() - 1);
                    }
                    final String description = ((FactorNode) n).getDescription();

                    final String key = name.toUpperCase().replaceAll(" ", "_");
                    pw.println(String.format("%s.name=%s", key, name));
                    pw.println(String.format("%s.parents=%s", key, par));
                    pw.println(String.format("%s.evaluators=%s", key, eval));
                    pw.println(String.format("%s.description=%s", key, description));
                    pw.println(String.format("%s.id=%s", key, id));
                    pw.println(String.format("%s.key=%s", key, key));
                    keys.add(key);
                }
                // if (graph.outDegree(n) == 0 && n.getName().equals("Quality"))
                // {
                // String id = n.getOwnedBy();
                // Evaluation e = (Evaluation) findEntity(modelMap, id);
                // String name = n.getName();
                // String pair = id + ";" + id;
                // String description = ((Factor) findEntity(modelMap,
                // e.getEvaluates())).getDescription();
                // String key = n.getName() + "-" + n.getName();
                //
                // pw.println(String.format("%s.name=%s", key, name));
                // pw.println(String.format("%s.pair=%s", key, pair));
                // pw.println(String.format("%s.description=%s", key,
                // description));
                // pw.println(String.format("%s.id=%s", key, id));
                // pw.println(String.format("%s.key=%s", key, key));
                // keys.add(key);
                // }
            }
            final StringBuilder builder = new StringBuilder();
            for (final String key : keys)
            {
                builder.append(key + ";");
            }
            String temp = builder.toString();
            temp = temp.substring(0, temp.length() - 1);
            pw.println("keys=" + temp);
        }
        catch (final IOException e)
        {
            LOG.warn("Error reading the metrics properties file.");
        }
    }

    /**
     * @param file
     */
    private void writeMetrics(final String file)
    {
        final Path path = Paths.get(file);
        try
        {
            MetricsFileWriter.write(graph, "Quality", path);
        }
        catch (final RootNotFoundException rnfe)
        {
            LOG.warn(rnfe.getMessage(), rnfe);
        }
    }
}
