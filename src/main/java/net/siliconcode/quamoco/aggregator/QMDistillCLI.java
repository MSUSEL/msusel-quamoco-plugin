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

import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.FactorNode;
import net.siliconcode.quamoco.aggregator.graph.MeasureNode;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.graph.NormalizationNode;
import net.siliconcode.quamoco.aggregator.graph.ValueNode;

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

/**
 * QMDistillCLI -
 * 
 * @author Isaac Griffith
 */
public class QMDistillCLI {

    private static final Logger  LOG = LoggerFactory.getLogger(QMDistillCLI.class);
    private static final Options options;

    static
    {
        final Option help = Option.builder("h").hasArg(false).required(false).longOpt("help")
                .desc("prints this message").hasArg(false).build();
        final Option view = Option.builder("g").hasArg(false).required(false).longOpt("graph")
                .desc("view the quality model processing graph").hasArg(false).build();
        final Option lang = Option.builder("l").required(false).longOpt("lang").argName("LANGUAGE")
                .desc("the name of the language: java or cs").hasArg(true).numberOfArgs(1).build();
        final Option metfile = Option.builder("m").required(false).longOpt("metrics-file").argName("FILE")
                .desc("the name of the metrics properties file").hasArg(true).numberOfArgs(1).build();
        final Option verbose = Option.builder("v").required(false).longOpt("verbose").hasArg(false).build();
        options = new Options();
        options.addOption(help);
        options.addOption(view);
        options.addOption(metfile);
        options.addOption(lang);
        options.addOption(verbose);
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
            execute(dqm, line, options);
        }
        catch (final ParseException exp)
        {
            System.err.println("Parsing failed. Reason: " + exp.getMessage());
        }
    }

    public static void execute(ModelDistiller dqm, final CommandLine line, final Options options)
    {
        if (line.getOptions().length == 0 || line.hasOption('h'))
        {
            final HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("java -jar QMModelDistiller", options, true);
            System.exit(0);
        }
        if (line.hasOption('l'))
        {
            String language = line.getOptionValue('l');
            if (!language.equals("java") && !language.equals("cs"))
            {
                LOG.warn("Must select a valid language (java or csharp).");
                System.exit(1);
            }
            dqm.setLanguage(language);
        }
        if (line.hasOption('v'))
        {
            dqm.setVerbose(true);
        }

        dqm.buildGraph(null);
        if (line.hasOption('m'))
        {
            dqm.writeMetrics(line.getOptionValue('m'));
        }
        if (line.hasOption('g'))
        {
            showGraph(dqm.getGraph());
        }
    }

    public static void showGraph(DirectedSparseGraph<Node, Edge> graph)
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
}
