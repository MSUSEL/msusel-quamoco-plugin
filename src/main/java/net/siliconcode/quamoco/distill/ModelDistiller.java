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
package net.siliconcode.quamoco.distill;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.Stroke;
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
import java.util.Set;
import java.util.Stack;

import javax.swing.JFrame;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import net.siliconcode.quamoco.distill.graph.FactorNode;
import net.siliconcode.quamoco.distill.graph.MeasureNode;
import net.siliconcode.quamoco.distill.graph.Node;
import net.siliconcode.quamoco.distill.io.QMRReader;
import net.siliconcode.quamoco.distill.io.QMReader;
import net.siliconcode.quamoco.distill.io.ResolveWriter;
import net.siliconcode.quamoco.distill.qm.AbstractQMEntity;
import net.siliconcode.quamoco.distill.qm.Evaluation;
import net.siliconcode.quamoco.distill.qm.Factor;
import net.siliconcode.quamoco.distill.qm.Influence;
import net.siliconcode.quamoco.distill.qm.Measure;
import net.siliconcode.quamoco.distill.qm.MeasurementMethod;
import net.siliconcode.quamoco.distill.qm.QualityModel;
import net.siliconcode.quamoco.distill.qm.Ranking;
import net.siliconcode.quamoco.distill.qmr.QualityModelResult;

import org.apache.commons.collections15.Transformer;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.spi.BooleanOptionHandler;
import org.kohsuke.args4j.spi.PathOptionHandler;

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

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        final ModelDistiller dqm = new ModelDistiller();
        dqm.doMain(args);
    }

    private DirectedSparseGraph<Node, String> graph;
    private Map<String, Map<String, String>>  metricMap  = new HashMap<>();
    final Map<String, QualityModel>           modelMap   = new HashMap<>();
    Map<String, Node>                         factorMap  = new HashMap<>();
    Map<String, Node>                         measureMap = new HashMap<>();

    @Option(name = "-h", help = true, handler = BooleanOptionHandler.class, usage = "Print this help page.")
    private boolean                           printHelp;
    @Option(name = "-v", handler = BooleanOptionHandler.class, usage = "Allows user to view the graph.")
    private boolean                           viewGraph;
    @Option(name = "-d", handler = PathOptionHandler.class, usage = "Set the directory where the quamoco quality model files are stored.")
    private Path                              qmFileDirectory;
    @Option(name = "-m", handler = PathOptionHandler.class, usage = "Set the name of the file to export metrics information to.", metaVar = "FILE")
    private Path                              metricFileName;
    @Option(name = "-l", usage = "Set the name of the language.", metaVar = "LANGUAGE")
    private String                            language;
    @Option(name = "-g", handler = PathOptionHandler.class, usage = "Set the name of the file for the distilled quamoco graph.")
    private Path                              graphFileName;

    /**
     *
     */
    public ModelDistiller(String... args)
    {
        graph = new DirectedSparseGraph<>();
        // buildGraph(args);
    }

    public void doMain(String args[])
    {
        CmdLineParser parser = new CmdLineParser(this);
        try
        {
            parser.parseArgument(args);
        }
        catch (CmdLineException e)
        {
            printHelp();
        }

        if (printHelp)
        {
            printHelp();
            System.exit(0);
        }
        if (qmFileDirectory == null || !Files.exists(qmFileDirectory) || !Files.isDirectory(qmFileDirectory))
        {
            System.err.println("Must specify a valid location of the quamoco quality model files.");
            System.exit(1);
        }
        if (language != null)
        {
            if (!language.equals("java") && !language.equals("csharp"))
            {
                System.out.println("Language: " + language);
                System.err.println("Must select a valid language (java or csharp).");
                System.exit(1);
            }
        }
        if (metricFileName != null)
        {
            Path parent = metricFileName.getParent();
            if (!Files.exists(parent) || !Files.isDirectory(parent) || !Files.isWritable(parent))
            {
                System.err
                        .println("The directory does not exist or you do not have sufficient permissions to write the metrics file there.");
                System.exit(1);
            }
            else
            {
                try
                {
                    if (!Files.exists(metricFileName))
                        Files.createFile(metricFileName);
                }
                catch (IOException e)
                {
                    System.err.println("There was an error when attempting to create the metric file.");
                    System.exit(1);
                }
            }
        }

        if (graphFileName != null)
        {
            Path parent = graphFileName.getParent();
            if (!Files.exists(parent) || !Files.isDirectory(parent) || !Files.isWritable(parent))
            {
                System.err
                        .println("The directory does not exist or you do not have sufficient permissions to write the graph file there.");
                System.exit(1);
            }
            else
            {
                try
                {
                    if (!Files.exists(graphFileName))
                        Files.createFile(graphFileName);
                }
                catch (IOException e)
                {
                    System.err.println("There was an error when attempting to create the graph file.");
                    System.exit(1);
                }
            }
        }

        buildGraph(getQMFiles());
        if (metricFileName != null)
            writeMetricFile(metricFileName, modelMap);
        if (graphFileName != null)
            writeGraphFile(graphFileName);
        if (viewGraph)
        {
            showGraph();
        }
    }

    private String[] getQMFiles()
    {
        DirectoryStream.Filter<Path> qmFilter = new DirectoryStream.Filter<Path>() {

            @Override
            public boolean accept(Path entry) throws IOException
            {
                if (entry.getFileName().toString().endsWith(".qm"))
                    return true;

                return false;
            }

        };
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(qmFileDirectory, qmFilter))
        {
            Iterator<Path> iter = stream.iterator();
            Map<String, Path> pathMap = new HashMap<>();
            Map<String, List<String>> requiresMap = new HashMap<>();
            while (iter.hasNext())
            {
                Path p = iter.next();
                pathMap.put(p.getFileName().toString(), p);
                XMLInputFactory factory = XMLInputFactory.newInstance();
                XMLStreamReader reader = factory.createXMLStreamReader(new FileReader(p.toFile()));
                while (reader.hasNext())
                {
                    int event = reader.next();

                    switch (event)
                    {
                    case XMLStreamConstants.START_ELEMENT:
                        switch (reader.getLocalName())
                        {
                        case "requires":
                            String href = reader.getAttributeValue(null, "href");
                            href = href.split("#")[0];
                            String fn = p.getFileName().toString();
                            if (requiresMap.containsKey(fn))
                            {
                                requiresMap.get(fn).add(href);
                            }
                            else
                            {
                                List<String> names = new ArrayList<>();
                                names.add(href);
                                requiresMap.put(fn, names);
                            }
                            pathMap.put(p.getFileName().toString(), p);
                            break;
                        }
                        break;
                    }
                }
            }

            Stack<String> names = new Stack<>();
            names.push(language + ".qm");
            boolean finished = false;
            while (!finished)
            {
                if (!requiresMap.containsKey(names.peek()))
                {
                    finished = true;
                    continue;
                }
                else
                {
                    for (String name : requiresMap.get(names.peek()))
                        names.push(name);
                }
            }

            List<String> files = new ArrayList<>();
            while (!names.isEmpty())
            {
                System.out.println(names.peek());
                files.add(pathMap.get(names.pop()).toString());
            }
            return files.toArray(new String[0]);
        }
        catch (XMLStreamException | IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    private void printHelp()
    {
        System.out.println("Command line utility to generate files for Quamoco Distillation.");
        System.out.println("");
        System.out.println("Usage: VisualQM [Options]");
        System.out.println("");
        System.out.println("     -h, Prints this help message.");
        System.out.println("     -v, Allows user to view the distilled Quamoco graph.");
        System.out.println("     -l <LANGUAGE>, Sets the language that is to be used. Possible values are:");
        System.out.println("          java     For the Java language.");
        System.out.println("          csharp   For C# language.");
        System.out.println("     -m <FILE>, Set the name of the file to export metrics information to.");
        System.out.println("     -g <FILE>, Set the name of the file for the distilled quamoco graph.");
        System.out.println("     -d <DIRECTORY>, Set the directory where the quamoco quality model files are stored.");
    }

    public void showGraph(String... args)
    {
        final Layout<Node, String> layout = new DAGLayout<>(graph);
        layout.setSize(new Dimension(700, 700));
        final BasicVisualizationServer<Node, String> vv = new BasicVisualizationServer<>(layout);
        vv.setPreferredSize(new Dimension(750, 750));

        final Transformer<Node, Paint> vertexIconTransformer = entity -> {
            if (entity instanceof FactorNode)
            {
                return Color.RED;
            }
            else if (entity instanceof MeasureNode)
            {
                return Color.GREEN;
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

        final Transformer<String, Stroke> edgeStrokeTransformer = edge -> {
            if (edge.startsWith("influences") || edge.startsWith("refines") || edge.startsWith("originatesFrom")
                    || edge.startsWith("tool"))
            {
                final float[] dash = { 10.0f };
                return new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, dash, 0.0f);
            }
            else
            {
                return new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER);
            }
        };

        vv.getRenderContext().setVertexFillPaintTransformer(vertexIconTransformer);
        vv.getRenderContext().setVertexShapeTransformer(vertexShapeTransformer);
        vv.getRenderContext().setEdgeStrokeTransformer(edgeStrokeTransformer);
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<Node>());
        vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller<String>());

        final JFrame frame = new JFrame("Quamoco Quality Model Graph Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);
    }

    public void buildGraph(String... args)
    {
        final List<QualityModel> models = readInQualityModels(args);
        // final QualityModelResult result = readInResults(args);

        createModelMap(modelMap, models);
        extractFactorsAndMeasures(factorMap, measureMap, models);
        extractEvaluatedBy(factorMap, measureMap, models);
        addNodesToGraph(modelMap, factorMap);
        connectNodes(modelMap, factorMap, measureMap);

        // ResolveReader reader = new ResolveReader();
        // try
        // {
        // reader.read("/home/isaac/bin/csharp.xml");
        // graph = reader.getGraph();
        // }
        // catch (FileNotFoundException | XMLStreamException e)
        // {
        // e.printStackTrace();
        // }

        // writeMetricFile("/home/isaac/bin/metric.properties");
    }

    /**
     * @param modelMap
     * @param factorMap
     * @param measureMap
     */
    private void connectNodes(final Map<String, QualityModel> modelMap, Map<String, Node> factorMap,
            Map<String, Node> measureMap)
    {
        for (String key : measureMap.keySet())
        {
            Measure measure = (Measure) findEntity(modelMap, key);
            Node src = measureMap.get(key);
            if (measure.getParent() != null)
            {
                Node dest = measureMap.get(measure.getParent());
                if (dest != null)
                    addEdge(graph, src, dest);
                else if (factorMap.containsKey(measure.getParent()))
                    addEdge(graph, src, factorMap.get(measure.getParent()));
            }
            if (measure.getRefines() != null)
            {
                Node dest = measureMap.get(measure.getRefines());
                if (dest != null)
                    addEdge(graph, src, dest);
                else if (factorMap.containsKey(measure.getRefines()))
                    addEdge(graph, src, factorMap.get(measure.getParent()));
            }
        }
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
                    node.addEvaluatedBy(eval.getId());
                    for (Ranking rank : eval.getRankings())
                    {
                        String facId = rank.getFactor();
                        if (facId != null)
                        {
                            if (metricMap.containsKey(facId))
                            {
                                metricMap.get(facId).put(rank.getId(), eval.getId());
                            }
                            else
                            {
                                Map<String, String> map = new HashMap<>();
                                map.put(rank.getId(), eval.getId());
                                metricMap.put(facId, map);
                            }
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
                    MeasureNode node = new MeasureNode(graph, measure.getName(), measure.getId());
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

    /**
     * @param g
     * @param node
     * @param nextOpp
     */
    private void addEdge(DirectedSparseGraph<Node, String> g, Node src, Node dest)
    {
        g.addEdge(src.getId() + "-" + dest.getId(), src, dest, EdgeType.DIRECTED);
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
        final List<String> qmfiles = new ArrayList<String>();
        for (final String arg : args)
        {
            if (arg.endsWith(".qm"))
            {
                qmfiles.add(arg);
            }
        }

        final QMReader qmread = new QMReader();
        List<QualityModel> models = new ArrayList<>();
        try
        {
            qmread.read(qmfiles.toArray(new String[0]));
            models = qmread.getModels();
        }
        catch (FileNotFoundException | XMLStreamException e)
        {
            e.printStackTrace();
        }
        return models;
    }

    /**
     * @param args
     * @return
     */
    private QualityModelResult readInResults(String... args)
    {
        final String qmrfile[] = new String[1];
        for (final String arg : args)
        {
            if (arg.endsWith(".qmr"))
            {
                qmrfile[0] = arg;
            }
        }

        final QMRReader qmrread = new QMRReader();
        QualityModelResult result = null;
        try
        {
            qmrread.read(qmrfile);
            result = qmrread.getResult();
        }
        catch (FileNotFoundException | XMLStreamException e)
        {
            e.printStackTrace();
        }
        return result;
    }

    public void writeMetricFile(Path file, Map<String, QualityModel> modelMap)
    {
        try (PrintWriter pw = new PrintWriter(new FileWriter(file.toFile())))
        {
            Set<String> keys = new HashSet<>();
            for (String facId : metricMap.keySet())
            {
                int count = 1;
                for (String rankId : metricMap.get(facId).keySet())
                {
                    Factor child = (Factor) findEntity(modelMap, facId);
                    Evaluation eval = (Evaluation) findEntity(modelMap, metricMap.get(facId).get(rankId));
                    Factor parent = (Factor) findEntity(modelMap, eval.getEvaluates());

                    String key = child.getName().replace(" ", "_") + "-" + parent.getName().replace(" ", "_");
                    if (keys.contains(key))
                        key = key + count++;
                    String name = child.getName();
                    String pair = rankId + ";" + eval.getId();
                    String description = child.getDescription();
                    String id = child.getId();

                    pw.println(String.format("%s.name=%s", key, name));
                    pw.println(String.format("%s.pair=%s", key, pair));
                    pw.println(String.format("%s.description=%s", key, description));
                    pw.println(String.format("%s.id=%s", key, id));
                    keys.add(key);
                }
            }
            for (Node n : graph.getVertices())
            {
                if (graph.outDegree(n) == 0 && n.getName().equals("Quality"))
                {
                    String id = n.getOwnedBy();
                    Factor f = (Factor) findEntity(modelMap, id);
                    String name = n.getName();
                    String pair = id + ";" + id;
                    String description = f.getDescription();
                    String key = n.getName() + "-" + n.getName();

                    pw.println(String.format("%s.name=%s", key, name));
                    pw.println(String.format("%s.pair=%s", key, pair));
                    pw.println(String.format("%s.description=%s", key, description));
                    pw.println(String.format("%s.id=%s", key, id));
                    keys.add(key);
                }
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void writeGraphFile(Path file)
    {
        ResolveWriter writer = new ResolveWriter();

        writer.write(language, file.toString(), graph);
    }
}
