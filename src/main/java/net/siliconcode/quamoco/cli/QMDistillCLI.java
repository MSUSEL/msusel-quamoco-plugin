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
package net.siliconcode.quamoco.cli;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Shape;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

import javax.swing.JFrame;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

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
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.common.collect.Sets;

import edu.uci.ics.jung.algorithms.layout.DAGLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import net.siliconcode.quamoco.distiller.ModelDistiller;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.FindingNode;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.NormalizationNode;
import net.siliconcode.quamoco.graph.node.ValueNode;
import net.siliconcode.quamoco.model.qm.QualityModel;
import net.siliconcode.sonar.quamoco.profiles.xml.QuamocoProfile;
import net.siliconcode.sonar.quamoco.profiles.xml.RuleRepo;

/**
 * QMDistillCLI - A Command Line Inteface to the Quamoco Model Distiller.
 *
 * @author Isaac Griffith
 */
public final class QMDistillCLI {

    /**
     * Logger associated with this class
     */
    private static final Logger  LOG = LoggerFactory.getLogger(QMDistillCLI.class);
    /**
     * Command line options object associated with this class.
     */
    private static final Options options;

    /**
     * Private constructor
     */
    private QMDistillCLI() {
    }

    /**
     * Initializes the command line options object.
     */
    static {
        final Option help = Option.builder("h").required(false).longOpt("help").desc("prints this message")
                .hasArg(false).build();
        final Option view = Option.builder("g").required(false).longOpt("graph")
                .desc("view the quality model processing graph").hasArg(false).build();
        final Option lang = Option.builder("l").required(false).longOpt("lang").argName("LANGUAGE")
                .desc("the name of the language: java or cs").hasArg(true).numberOfArgs(1).build();
        final Option validate = Option.builder("v").required(false).longOpt("validate").argName("FILE")
                .desc("the name of the file to use for findings validation").hasArg(true).numberOfArgs(1).build();
        final Option tool = Option.builder("t").required(false).longOpt("tool").argName("TOOL")
                .desc("Name of the tool to validate findings for").hasArg(true).numberOfArgs(1).build();
        final Option output = Option.builder("o").required(false).longOpt("output").argName("FOLDER")
                .desc("Name of the folder to output revised quality models to").hasArg(true).numberOfArgs(1).build();
        options = new Options();
        QMDistillCLI.options.addOption(help);
        QMDistillCLI.options.addOption(view);
        QMDistillCLI.options.addOption(lang);
        QMDistillCLI.options.addOption(validate);
        QMDistillCLI.options.addOption(tool);
        QMDistillCLI.options.addOption(output);
    }

    /**
     * Controls the execution of the provided Quamoco Model Distiller given the
     * command line object.
     *
     * @param dqm
     *            The model distiller to control.
     * @param line
     *            The parsed command line arguments.
     */
    public static void execute(final ModelDistiller dqm, final CommandLine line) {
        String language = "";
        if (line.getOptions().length == 0 || line.hasOption('h')) {
            final HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("java -jar QMModelDistiller", QMDistillCLI.options, true);
            return;
        }
        if (line.hasOption('l')) {
            language = line.getOptionValue('l');
            if (!language.equals("java") && !language.equals("cs")) {
                QMDistillCLI.LOG.warn("Must select a valid language (java or cs).");
                return;
            }
            dqm.setLanguage(language);
        }

        dqm.buildGraph(null);

        System.out.println("Vertices: " + dqm.getGraph().getVertexCount());
        System.out.println("Edges: " + dqm.getGraph().getEdgeCount());

        String toolName = "FindBugs";
        if (line.hasOption('t')) {
            toolName = line.getOptionValue('t');
        }

        if (line.hasOption('v')) {
            final String file = line.getOptionValue('v');
            QMDistillCLI.validate(dqm.getGraph(), file, toolName, language);
        }

        if (line.hasOption('o')) {
            final String folder = line.getOptionValue('o');
            QMDistillCLI.outputModels(dqm.getModelList(), folder);
        }

        if (line.hasOption('g')) {
            // Needs to be in a separate thread.
            QMDistillCLI.showGraph(dqm.getGraph());
        }
    }

    /**
     * @param modelList
     * @param folder
     */
    private static void outputModels(final List<QualityModel> modelList, final String folder) {
        for (final QualityModel model : modelList) {
            final String name = model.getName();
            if (name.contains("#")) {
                name.replaceAll("#", "Sharp");
            }

            try (PrintWriter writer = new PrintWriter(new FileWriter(folder + File.separator + name + ".qm"))) {
                writer.append(
                        "<?xml version=\"1.0\" encoding=\"UTF-8\" xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:qm=\"http://www.quamoco.de/qm/v17\"?>\n"
                                .concat(model.toXml()));
            }
            catch (final IOException e) {
                LOG.warn("Fail to export the Quality Model.");
            }
        }
    }

    /**
     * @param graph
     */
    private static void validate(final DirectedSparseGraph<Node, Edge> graph, final String file, final String toolName,
            final String language) {
        final Set<String> ruleKeys = Sets.newHashSet();

        final DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = builderFactory.newDocumentBuilder();

            final Document document = builder.parse(new FileInputStream(file));

            final XPath xPath = XPathFactory.newInstance().newXPath();

            final String rulePath = "//rule/key";
            final String ruleKeyPath = "//rule[@key]";

            final NodeList ruleList = (NodeList) xPath.compile(rulePath).evaluate(document, XPathConstants.NODESET);
            final NodeList ruleKeyList = (NodeList) xPath.compile(ruleKeyPath).evaluate(document,
                    XPathConstants.NODESET);

            if (ruleList.getLength() > 0) {
                for (int i = 0; i < ruleList.getLength(); i++) {
                    ruleKeys.add(ruleList.item(i).getFirstChild().getNodeValue());
                }
            }
            else if (ruleKeyList.getLength() > 0) {
                for (int i = 0; i < ruleKeyList.getLength(); i++) {
                    ruleKeys.add(ruleKeyList.item(i).getAttributes().getNamedItem("key").getNodeValue());
                }
            }
        }
        catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException e) {
            e.printStackTrace();
        }

        final Set<String> availableRules = Sets.newHashSet();
        final Set<String> matches = Sets.newHashSet();
        if (!ruleKeys.isEmpty()) {
            for (final Node n : graph.getVertices()) {
                if (n instanceof FindingNode) {
                    final FindingNode fn = (FindingNode) n;
                    if (fn.getToolName().equalsIgnoreCase(toolName)) {
                        availableRules.add(fn.getName());
                    }
                }
            }

            final QuamocoProfile profile = new QuamocoProfile(language);
            final RuleRepo repo = profile.addRepo(toolName);

            for (final String s : availableRules) {
                if (ruleKeys.contains(s)) {
                    System.out.println("\t" + s);
                    repo.addRule(s);
                }
            }

            ruleKeys.removeAll(availableRules);

            System.out.println("\nUnmatched:");
            for (final String s : ruleKeys) {
                System.out.println("\t" + s + " in " + toolName);
            }

            System.out.println(profile.toXml());
        }
    }

    /**
     * Starting point of execution.
     *
     * @param args
     *            Raw command line arguments.
     */
    public static void main(final String... args) {
        final ModelDistiller dqm = new ModelDistiller();
        final CommandLineParser parser = new DefaultParser();
        try {
            final CommandLine line = parser.parse(QMDistillCLI.options, args);
            QMDistillCLI.execute(dqm, line);
        }
        catch (final ParseException exp) {
            System.err.println("Parsing failed. Reason: " + exp.getMessage());
        }
    }

    /**
     * Displays the provided graph is a separate window.
     *
     * @param graph
     *            Graph to be displayed.
     */
    public static void showGraph(final DirectedSparseGraph<Node, Edge> graph) {
        final Layout<Node, Edge> layout = new DAGLayout<>(graph);
        layout.setSize(new Dimension(700, 700));
        final BasicVisualizationServer<Node, Edge> vv = new BasicVisualizationServer<>(layout);
        vv.setPreferredSize(new Dimension(750, 750));

        final Transformer<Node, Paint> vertexIconTransformer = entity -> {
            Color retVal = null;

            if (entity instanceof FactorNode && entity.getName().equals("Quality @Product"))
                retVal = Color.ORANGE;
            else if (entity instanceof FactorNode) {
                retVal = Color.BLUE;
            }
            else if (entity instanceof NormalizationNode) {
                retVal = Color.CYAN;
            }
            else if (entity instanceof MeasureNode) {
                retVal = Color.RED;
            }
            else if (entity instanceof ValueNode) {
                retVal = Color.YELLOW;
            }
            else if (entity instanceof FindingNode) {
                retVal = Color.GREEN;
            }

            return retVal;
        };

        final Transformer<Node, Shape> vertexShapeTransformer = new Transformer<Node, Shape>() {

            /**
             * Constructs a polygon Shape object with the given coordinates for
             * the center (relative within the bounds of the shape), maximum
             * radius from the center, and with the given number of sides.
             *
             * @param centerX
             *            X Location for the center of the Shape (relative
             *            within the bounds of the shape)
             * @param centerY
             *            Y Location for the center of the Shape (relative
             *            within the bounds of the shape)
             * @param radius
             *            Maximum radius for the shape.
             * @param numSides
             *            Number of sides the polygon can have (must be greater
             *            than or equal to 3).
             * @return
             * @throws PolygonCreationException
             */
            private Shape createPolygon(final int centerX, final int centerY, final int radius, final int numSides)
                    throws PolygonCreationException {
                final Polygon poly = new Polygon();
                if (numSides < 3) {
                    throw new PolygonCreationException("Polygon must have at least 3 sides.");
                }
                for (int i = 0; i < numSides; i++) {
                    poly.addPoint((int) (centerX + radius * Math.cos(i * 2 * Math.PI / numSides)),
                            (int) (centerY + radius * Math.sin(i * 2 * Math.PI / numSides)));
                }

                return poly;
            }

            /*
             * (non-Javadoc)
             * 
             * @see
             * org.apache.commons.collections15.Transformer#transform(java.lang
             * .Object)
             */
            @Override
            public Shape transform(final Node entity) {
                try {
                    return createPolygon(0, 0, 5, 5);
                }
                catch (final PolygonCreationException e) {
                    QMDistillCLI.LOG.error(e.getMessage(), e);
                    return null;
                }
            }
        };

        vv.getRenderContext().setVertexFillPaintTransformer(vertexIconTransformer);
        vv.getRenderContext().setVertexShapeTransformer(vertexShapeTransformer);
        vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller<Node>());

        final JFrame frame = new JFrame("Quamoco Quality Model Graph Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(vv);
        frame.pack();
        frame.setVisible(true);
    }
}
