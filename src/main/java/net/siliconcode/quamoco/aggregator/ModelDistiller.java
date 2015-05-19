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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Stack;

import javax.swing.JFrame;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

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
import net.siliconcode.quamoco.aggregator.io.QMReader;
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
        Option help = Option.builder("h").hasArg(false).required(false).longOpt("help").desc("prints this message")
                .hasArg(false).build();
        Option view = Option.builder("v").hasArg(false).required(false).longOpt("view")
                .desc("view the quality model processing graph").hasArg(false).build();
        Option lang = Option.builder("l").required(false).longOpt("lang")
                .desc("the name of the language: java or csharp").hasArg(true).numberOfArgs(1).build();
        options = new Options();
        options.addOption(help);
        options.addOption(view);
        options.addOption(lang);
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        final ModelDistiller dqm = new ModelDistiller();
        CommandLineParser parser = new DefaultParser();
        try
        {
            CommandLine line = parser.parse(options, args);
            dqm.execute(line, options);
        }
        catch (ParseException exp)
        {
            System.err.println("Parsing failed. Reason: " + exp.getMessage());
        }
    }

    private DirectedSparseGraph<Node, Edge> graph;
    private final Map<String, QualityModel> modelMap   = new HashMap<>();
    private Map<String, Node>               factorMap  = new HashMap<>();
    private Map<String, Node>               measureMap = new HashMap<>();
    private Map<String, Node>               valuesMap  = new HashMap<>();

    private String                          language;

    /**
     *
     */
    public ModelDistiller(String... args)
    {
        graph = new DirectedSparseGraph<>();
    }

    public void execute(CommandLine line, Options options)
    {
        if (line.getOptions().length == 0 || line.hasOption('h'))
        {
            HelpFormatter formatter = new HelpFormatter();
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
        if (line.hasOption('v'))
        {
            showGraph();
        }
    }

    public void showGraph(String... args)
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

            private Shape createPolygon(int centerX, int centerY, int radius, int numSides)
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
            public Shape transform(Node entity)
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

    public void buildGraph()
    {
        String[] files = selectQMFiles();
        final List<QualityModel> models = readInQualityModels(files);

        createModelMap(modelMap, models);
        extractFactorsAndMeasures(factorMap, measureMap, models);
        extractValues(valuesMap, models);
        extractEvaluatedBy(factorMap, measureMap, models);
        addNodesToGraph(modelMap, factorMap);
        connectNodes(modelMap, factorMap, measureMap, valuesMap);
        cleanGraph();
    }

    private String[] selectQMFiles()
    {
        String[] retVal = null;
        Properties prop = new Properties();
        try
        {
            prop.load(ModelDistiller.class.getResourceAsStream("languages.properties"));

            retVal = ((String) prop.get(language)).split(",");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return retVal;
    }

    /**
     * 
     */
    private void cleanGraph()
    {
        List<Node> toRemove = new ArrayList<>();
        do
        {
            for (Node n : toRemove)
                graph.removeVertex(n);

            toRemove.clear();

            for (Node n : graph.getVertices())
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
    private void connectNodes(final Map<String, QualityModel> modelMap, Map<String, Node> factorMap,
            Map<String, Node> measureMap, Map<String, Node> valuesMap)
    {
        for (Edge edge : graph.getEdges())
        {
            if (edge instanceof InfluenceEdge)
            {
                InfluenceEdge ie = (InfluenceEdge) edge;
                Evaluation eval = getEvaluates(graph.getDest(edge));
                Factor srcFact = getFactor(graph.getSource(edge));

                if (srcFact != null && eval != null)
                {
                    for (Ranking rank : eval.getRankings())
                    {
                        if (rank.getFactor() != null)
                        {
                            if (rank.getFactor().equals(srcFact.getId()))
                            {
                                if (rank.getRank() != null)
                                    ie.setRank(Integer.parseInt(rank.getRank()));
                                if (rank.getWeight() != null)
                                    ie.setWeight(Double.parseDouble(rank.getWeight()));
                                if (rank.getFunction() != null)
                                {
                                    Function f = rank.getFunction();
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
                ParentEdge pe = (ParentEdge) edge;
                Measure srcMeasure = getMeasure(graph.getSource(pe));
                Measure destMeasure = getMeasure(graph.getDest(pe));
                if (destMeasure != null)
                {
                    Evaluation eval = getEvaluates(graph.getDest(edge));
                    if (eval != null)
                    {
                        for (Ranking rank : eval.getRankings())
                        {
                            if (rank.getMeasure() != null)
                            {
                                if (rank.getMeasure().equals(srcMeasure.getId()))
                                {
                                    if (rank.getRank() != null)
                                        pe.setRank(Integer.parseInt(rank.getRank()));
                                    if (rank.getWeight() != null)
                                        pe.setWeight(Double.parseDouble(rank.getWeight()));
                                    if (rank.getFunction() != null)
                                    {
                                        pe.setLowerBound(rank.getFunction().getLowerBound());
                                        pe.setUpperBound(rank.getFunction().getUpperBound());
                                    }
                                    if (rank.getNormalizationMeasure() != null)
                                    {
                                        Node src = measureMap.get(rank.getNormalizationMeasure());
                                        Node dest = graph.getSource(pe);
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
                    Factor destFact = getFactor(graph.getDest(pe));
                    if (destFact != null)
                    {
                        Evaluation eval = getEvaluates(graph.getDest(edge));
                        if (eval != null)
                        {
                            for (Ranking rank : eval.getRankings())
                            {
                                if (rank.getMeasure() != null)
                                {
                                    if (rank.getMeasure().equals(srcMeasure.getId()))
                                    {
                                        if (rank.getRank() != null)
                                            pe.setRank(Integer.parseInt(rank.getRank()));
                                        if (rank.getWeight() != null)
                                            pe.setWeight(Double.parseDouble(rank.getWeight()));
                                        if (rank.getFunction() != null)
                                        {
                                            pe.setLowerBound(rank.getFunction().getLowerBound());
                                            pe.setUpperBound(rank.getFunction().getUpperBound());
                                        }
                                        if (rank.getNormalizationMeasure() != null)
                                        {
                                            Node src = measureMap.get(rank.getNormalizationMeasure());
                                            Node dest = graph.getSource(pe);
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
     * @param source
     * @return
     */
    private Measure getMeasure(Node source)
    {
        AbstractEntity ent = findEntity(modelMap, source.getOwnedBy());
        if (ent != null && ent instanceof Measure)
            return (Measure) ent;
        return null;
    }

    /**
     * @param source
     * @return
     */
    private Factor getFactor(Node source)
    {
        AbstractEntity ent = findEntity(modelMap, source.getOwnedBy());
        if (ent != null && ent instanceof Factor)
            return (Factor) ent;
        return null;
    }

    /**
     * @param dest
     * @return
     */
    private Evaluation getEvaluates(Node dest)
    {
        AbstractEntity ent = findEntity(modelMap, dest.getOwnedBy());
        if (ent != null && ent instanceof Evaluation)
            return (Evaluation) ent;
        return null;
    }

    /**
     * @param modelMap
     * @param factorMap
     */
    private void addNodesToGraph(final Map<String, QualityModel> modelMap, Map<String, Node> factorMap)
    {
        for (String key : factorMap.keySet())
        {
            Factor factor = (Factor) findEntity(modelMap, key);
            Node src = factorMap.get(key);
            for (Influence inf : factor.getInfluences())
            {
                Node dest = factorMap.get(inf.getTarget());
                addEdge(graph, src, dest);
            }
            if (factor.getRefines() != null)
            {
                Node dest = factorMap.get(factor.getRefines());
                addEdge(graph, src, dest);
            }
        }

        for (String key : measureMap.keySet())
        {
            Measure measure = (Measure) findEntity(modelMap, key);
            Node src = measureMap.get(key);
            for (String parent : measure.getParents())
            {
                Node dest = measureMap.get(parent);
                if (dest == null)
                    dest = factorMap.get(parent);
                if (dest != null)
                    addEdge(graph, src, dest);
            }
            if (measure.getRefines() != null)
            {
                Node dest = measureMap.get(measure.getRefines()) != null ? measureMap.get(measure.getRefines())
                        : factorMap.get(measure.getRefines());
                addEdge(graph, src, dest);
            }
        }

        for (String key : valuesMap.keySet())
        {
            MeasurementMethod method = (MeasurementMethod) findEntity(modelMap, key);
            Node src = valuesMap.get(key);
            if (method.getDetermines() != null)
            {
                Node dest = measureMap.get(method.getDetermines()) != null ? measureMap.get(method.getDetermines())
                        : factorMap.get(method.getDetermines());
                addEdge(graph, src, dest);
            }
        }

        for (QualityModel model : modelMap.values())
        {
            for (Evaluation eval : model.getEvaluations())
            {
                for (Ranking rank : eval.getRankings())
                {
                    if (rank.getNormalizationMeasure() != null)
                    {
                        Node src = measureMap.get(rank.getNormalizationMeasure());
                        Node dest = null;
                        if (rank.getFactor() != null)
                            dest = factorMap.get(rank.getFactor());
                        else
                            dest = measureMap.get(rank.getMeasure());
                        if (dest != null)
                            graph.addEdge(new NormalizationEdge(src.getName() + ":" + dest.getName()), src, dest);
                    }
                }
            }
        }
    }

    /**
     * @param factorMap
     * @param measureMap
     * @param models
     */
    private void extractEvaluatedBy(Map<String, Node> factorMap, Map<String, Node> measureMap,
            final List<QualityModel> models)
    {
        for (final QualityModel model : models)
        {
            for (final AbstractQMEntity entity : model.getContained())
            {
                if (entity instanceof Evaluation)
                {
                    Evaluation eval = (Evaluation) entity;
                    FactorNode node = (FactorNode) factorMap.get(eval.getEvaluates());
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
                    for (Ranking rank : eval.getRankings())
                    {
                        String facId = rank.getFactor();
                        if (facId != null)
                        {
                            FactorNode subnode = (FactorNode) factorMap.get(facId);
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
                    MeasurementMethod method = (MeasurementMethod) entity;
                    MeasureNode node = (MeasureNode) measureMap.get(method.getDetermines());
                    node.addEvaluatedBy(method.getId());
                }
            }
        }

        for (Node n : graph.getVertices())
        {
            if (n instanceof FactorNode)
            {
                for (Edge edge : graph.getOutEdges(n))
                {
                    ((FactorNode) n).addParent(((FactorNode) graph.getOpposite(n, edge)).getName());
                }
            }
        }
    }

    /**
     * @return the language
     */
    public String getLanguage()
    {
        return language;
    }

    /**
     * @param language
     *            the language to set
     */
    public void setLanguage(String language)
    {
        this.language = language;
    }

    /**
     * @param modelMap
     * @param models
     */
    private void createModelMap(final Map<String, QualityModel> modelMap, final List<QualityModel> models)
    {
        for (QualityModel model : models)
        {
            modelMap.put(model.getName(), model);
        }
    }

    /**
     * @param factorMap
     * @param measureMap
     * @param models
     */
    private void extractFactorsAndMeasures(Map<String, Node> factorMap, Map<String, Node> measureMap,
            final List<QualityModel> models)
    {
        for (final QualityModel model : models)
        {
            for (final AbstractQMEntity entity : model.getContained())
            {
                if (entity instanceof Measure)
                {
                    Measure measure = (Measure) entity;
                    MeasureNode node = null;
                    if (measure.getName() == null)
                        System.out.println(measure.getId());

                    if (measure.getType() != null && measure.getType().equals("qm:NormalizationMeasure"))
                        node = new NormalizationNode(graph, measure.getName(), measure.getId());
                    else
                        node = new MeasureNode(graph, measure.getName(), measure.getId());
                    node.setDescription(measure.getDescription());
                    measureMap.put(measure.getId(), node);
                }
                else if (entity instanceof Factor)
                {
                    Factor factor = (Factor) entity;
                    FactorNode node = new FactorNode(graph, factor.getName(), factor.getId());
                    node.setDescription(factor.getDescription());
                    factorMap.put(factor.getId(), node);
                }
            }
        }
    }

    private void extractValues(Map<String, Node> valueMap, final List<QualityModel> models)
    {
        for (final QualityModel model : models)
        {
            for (final AbstractQMEntity entity : model.getContained())
            {
                if (entity instanceof MeasurementMethod)
                {
                    MeasurementMethod mm = (MeasurementMethod) entity;
                    ValueNode node = null;
                    if (mm.getType().equals("qm:ManualInstrument"))
                        node = new ValueNode(graph, mm.getName(), mm.getId(), ValueNode.MANUAL);
                    else if (mm.getType().equals("qm:ToolBasedInstrument"))
                        node = new ValueNode(graph, mm.getMetric(), mm.getId(), mm.getTool());
                    else
                        node = new ValueNode(graph, mm.getName(), mm.getId(), ValueNode.UNION);
                    valueMap.put(mm.getId(), node);
                }
            }
        }
    }

    /**
     * @param g
     * @param node
     * @param nextOpp
     */
    private void addEdge(DirectedSparseGraph<Node, Edge> g, Node src, Node dest)
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
     * @param id
     * @return
     */
    private AbstractEntity findEntity(Map<String, QualityModel> modelMap, String id)
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
     * @param args
     * @return
     */
    private List<QualityModel> readInQualityModels(String... args)
    {
        final QMReader qmread = new QMReader();
        List<QualityModel> models = new ArrayList<>();
        try
        {
            for (String arg : args)
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

    public void writeMetricFile(Path file, Map<String, QualityModel> modelMap)
    {
        try (PrintWriter pw = new PrintWriter(new FileWriter(file.toFile())))
        {
            Set<String> keys = new HashSet<>();
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
            for (Node n : graph.getVertices())
            {
                if (n instanceof FactorNode)
                {
                    String id = n.getOwnedBy();
                    String name = n.getName();
                    StringBuilder evaluators = new StringBuilder();
                    for (String e : ((FactorNode) n).getEvaluatedBy())
                        evaluators.append(e + ";");
                    String eval = evaluators.toString();
                    if (eval.endsWith(";"))
                        eval = eval.substring(0, eval.length() - 1);
                    StringBuilder parents = new StringBuilder();
                    for (String p : ((FactorNode) n).getParents())
                        parents.append(p + ";");
                    String par = parents.toString();
                    if (par.endsWith(";"))
                        par = par.substring(0, par.length() - 1);
                    String description = ((FactorNode) n).getDescription();

                    String key = name.toUpperCase().replaceAll(" ", "_");
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
            StringBuilder builder = new StringBuilder();
            for (String key : keys)
                builder.append(key + ";");
            String temp = builder.toString();
            temp = temp.substring(0, temp.length() - 1);
            pw.println("keys=" + temp);
        }
        catch (IOException e)
        {
            LOG.warn("Error reading the metrics properties file.");
        }
    }
}
