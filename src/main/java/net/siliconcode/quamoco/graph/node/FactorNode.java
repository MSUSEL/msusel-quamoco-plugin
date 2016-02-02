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
package net.siliconcode.quamoco.graph.node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringEscapeUtils;

import com.google.common.collect.Lists;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.model.qm.NormalizationRange;

/**
 * FactorNode - Node representing a factor in the Quamoco processing graph. A
 * Factor can be a quality characteristic, sub-characteristic or intermediary,
 * but it is not a direct measure related to the product.
 *
 * @author Isaac Griffith
 */
public class FactorNode extends Node {

    /**
     * The method associated with aggregation.
     */
    private String method;

    /**
     * Constructs a new Factor node in the given graph, with the given name, and
     * associated with the owner id in a Quality Model.
     * 
     * @param graph
     *            Graph in which this factor will be located.
     * @param name
     *            Name of the factor
     * @param owner
     *            Id of the entity in a quality model this node represents.
     */
    public FactorNode(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner)
    {
        super(graph, name, owner);
        method = FactorMethod.MEAN;
    }

    /**
     * Constructs a new Factor node in the given graph, with the given name, and
     * associated with the owner id in a Quality Model.
     * 
     * @param graph
     *            Graph in which this factor will be located.
     * @param name
     *            Name of the factor
     * @param owner
     *            Id of the entity in a quality model this node represents.
     * @param id
     *            The unique identification number of this node in the given
     *            graph.
     */
    public FactorNode(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner, final long id)
    {
        super(graph, name, owner, id);
        method = FactorMethod.MEAN;
    }

    /**
     * @return The indication of the method for aggregation.
     */
    public String getMethod()
    {
        return method;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.distiller.Node#getValue()
     */
    @Override
    public double getValue()
    {
        if (Double.isInfinite(value))
        {
            value = processor.process();
        }

        return value;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.distiller.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        final StringBuilder builder = new StringBuilder();
        builder.append(String.format("<nodes name=\"%s\" description=\"%s\" id=\"%d\" owner=\"%s\" type=\"FACTOR\">%n",
                StringEscapeUtils.escapeXml10(name), StringEscapeUtils.escapeXml10(description), id, ownedBy));
        builder.append("\t</nodes>");
        return builder.toString();
    }

    /**
     * Sets the method indicating how aggregation is performed.
     * 
     * @param method
     *            The new method.
     */
    public void setMethod(final String method)
    {
        List<String> methods = new ArrayList<>();
        methods.add(FactorMethod.MANUAL);
        methods.add(FactorMethod.MEAN);
        methods.add(FactorMethod.ONE);
        methods.add(FactorMethod.RANKING);

        System.out.println("Method: " + method);
        if (method == null || method.isEmpty() || !methods.contains(method))
            throw new IllegalArgumentException();

        this.method = method;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.aggregator.graph.INode#getExtent(java.lang.
     * String, net.siliconcode.quamoco.aggregator.qm.NormalizationRange)
     */
    @Override
    public double getExtent(String metric, NormalizationRange range)
    {
        return getValue();
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.graph.INode#getLowerResult()
     */
    @Override
    public double getLowerResult()
    {
        List<Double> values = Lists.newArrayList();
        for (Edge e : graph.getInEdges(this))
        {
            Node n = graph.getOpposite(this, e);
            values.add(n.getValue());
        }

        return values.isEmpty() ? 0 : Collections.min(values);
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.graph.INode#getUpperResult()
     */
    @Override
    public double getUpperResult()
    {
        List<Double> values = Lists.newArrayList();
        for (Edge e : graph.getInEdges(this))
        {
            Node n = graph.getOpposite(this, e);
            values.add(n.getValue());
        }

        return values.isEmpty() ? 0 : Collections.max(values);
    }
}
