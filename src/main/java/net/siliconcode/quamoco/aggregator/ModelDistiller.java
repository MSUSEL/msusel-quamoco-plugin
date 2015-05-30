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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.annotation.Nullable;
import javax.xml.stream.XMLStreamException;

import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.MeasureNode;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.graph.ValueNode;
import net.siliconcode.quamoco.aggregator.io.MetricsFileWriter;
import net.siliconcode.quamoco.aggregator.io.QMReader;
import net.siliconcode.quamoco.aggregator.io.RootNotFoundException;
import net.siliconcode.quamoco.aggregator.qm.QualityModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.batch.DecoratorContext;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * ModelDistiller -
 *
 * @author Isaac Griffith
 */
public class ModelDistiller {

    private static final Logger             LOG     = LoggerFactory.getLogger(ModelDistiller.class);
    private DirectedSparseGraph<Node, Edge> graph;
    private String                          language;
    private boolean                         verbose = false;

    /**
     *
     */
    public ModelDistiller()
    {
        graph = new DirectedSparseGraph<>();
    }

    public void buildGraph(@Nullable final DecoratorContext context)
    {
        final String[] files = selectQMFiles();
        final List<QualityModel> models = readInQualityModels(files);
        final DistilledGraphCreator creator = new DistilledGraphCreator();
        graph = creator.buildGraph(models, context);

        if (verbose)
        {
            showMeasures();
        }

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
            LOG.warn(e.getMessage(), e);
        }
        return models;
    }

    private String[] selectQMFiles()
    {
        String[] retVal = null;
        final Properties prop = new Properties();
        try
        {
            final InputStream stream = this.getClass().getResourceAsStream("languages.properties");
            prop.load(stream);
            stream.close();

            retVal = ((String) prop.get(language)).split(",");
        }
        catch (final IOException e)
        {
            LOG.warn(e.getMessage(), e);
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

    /**
     * @param b
     */
    public void setVerbose(final boolean b)
    {
        verbose = b;
    }

    private void showMeasures()
    {
        for (final Node n : graph.getVertices())
        {
            if (n instanceof MeasureNode)
            {
                System.out.println(n.getName());
            }
        }
    }

    /**
     * @param file
     */
    public void writeMetrics(final String file)
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
