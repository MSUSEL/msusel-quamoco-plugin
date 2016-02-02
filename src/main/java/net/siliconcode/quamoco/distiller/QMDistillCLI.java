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

import javax.swing.JFrame;

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
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.NormalizationNode;
import net.siliconcode.quamoco.graph.node.ValueNode;

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
    private QMDistillCLI()
    {
    }

    /**
     * Initializes the command line options object.
     */
    static
    {
        final Option help = Option.builder("h").hasArg(false).required(false).longOpt("help")
                .desc("prints this message").hasArg(false).build();
        final Option view = Option.builder("g").hasArg(false).required(false).longOpt("graph")
                .desc("view the quality model processing graph").hasArg(false).build();
        final Option lang = Option.builder("l").required(false).longOpt("lang").argName("LANGUAGE")
                .desc("the name of the language: java or cs").hasArg(true).numberOfArgs(1).build();
        options = new Options();
        options.addOption(help);
        options.addOption(view);
        options.addOption(lang);
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
    public static void execute(final ModelDistiller dqm, final CommandLine line)
    {
        if (line.getOptions().length == 0 || line.hasOption('h'))
        {
            final HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("java -jar QMModelDistiller", options, true);
            return;
        }
        if (line.hasOption('l'))
        {
            final String language = line.getOptionValue('l');
            if (!language.equals("java") && !language.equals("cs"))
            {
                LOG.warn("Must select a valid language (java or cs).");
                return;
            }
            dqm.setLanguage(language);
        }

        dqm.buildGraph(null);
        if (line.hasOption('g'))
        {
            showGraph(dqm.getGraph());
        }
    }

    /**
     * Starting point of execution.
     * 
     * @param args
     *            Raw command line arguments.
     */
    public static void main(final String... args)
    {
        final ModelDistiller dqm = new ModelDistiller();
        final CommandLineParser parser = new DefaultParser();
        try
        {
            final CommandLine line = parser.parse(options, args);
            execute(dqm, line);
        }
        catch (final ParseException exp)
        {
            System.err.println("Parsing failed. Reason: " + exp.getMessage());
        }
    }

    /**
     * Displays the provided graph is a separate window.
     * 
     * @param graph
     *            Graph to be displayed.
     */
    public static void showGraph(final DirectedSparseGraph<Node, Edge> graph)
    {
        final Layout<Node, Edge> layout = new DAGLayout<>(graph);
        layout.setSize(new Dimension(700, 700));
        final BasicVisualizationServer<Node, Edge> vv = new BasicVisualizationServer<>(layout);
        vv.setPreferredSize(new Dimension(750, 750));

        final Transformer<Node, Paint> vertexIconTransformer = entity -> {
            Color retVal = null;

            if (entity instanceof FactorNode)
            {
                retVal = Color.BLUE;
            }
            else if (entity instanceof NormalizationNode)
            {
                retVal = Color.CYAN;
            }
            else if (entity instanceof MeasureNode)
            {
                retVal = Color.RED;
            }
            else if (entity instanceof ValueNode)
            {
                retVal = Color.YELLOW;
            }

            return retVal;
        };

        final Transformer<Node, Shape> vertexShapeTransformer = new Transformer<Node, Shape>() {

            /**
             * Constructs a polygon Shap object with the given coordinates for
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
                    throws PolygonCreationException
            {
                final Polygon poly = new Polygon();
                if (numSides < 3)
                    throw new PolygonCreationException("Polygon must have at least 3 sides.");
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
                try
                {
                    return createPolygon(0, 0, 5, 5);
                }
                catch (PolygonCreationException e)
                {
                    LOG.error(e.getMessage(), e);
                    return null;
                }
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
}
