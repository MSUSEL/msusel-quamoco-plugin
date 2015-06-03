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
package net.siliconcode.quamoco.aggregator.graph;

import java.util.List;

import net.siliconcode.quamoco.aggregator.strategy.Evaluator;

import org.apache.commons.lang3.StringEscapeUtils;

import com.google.common.collect.Lists;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * FactorNode - Node representing a factor in the Quamoco processing graph. A
 * Factor can be a quality characteristic, sub-characteristic or intermediary,
 * but it is not a direct measure related to the product.
 *
 * @author Isaac Griffith
 */
public class FactorNode extends Node {

    /**
     * Indicates that a single item is being evaluated by this factor.
     */
    public static final String ONE     = "One";
    /**
     * Indicates that the value of this factor is based on the mean of incoming
     * values.
     */
    public static final String MEAN    = "Mean";
    /**
     * Indicates that the value of this factor is based on a ranked weighted sum
     * of incoming values.
     */
    public static final String RANKING = "Ranking";
    /**
     * The method associated with aggregation.
     */
    private String             method;
    /**
     * The actual evaluation strategy used to compute the value.
     */
    private Evaluator          evaluator;

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
    }

    /**
     * @return The aggregation strategy of this node.
     */
    public Evaluator getEvaluator()
    {
        return evaluator;
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
        final List<Double> values = Lists.newArrayList();
        for (final Edge e : graph.getInEdges(this))
        {
            final Node n = graph.getOpposite(this, e);
            if (n instanceof ValueNode)
            {
                values.add(n.getValue());
            }
        }

        final double value = evaluator.evaluate(values.toArray(new Double[0]));
        if (Double.compare(value, 1.0) > 0)
        {
            return 1.0;
        }
        else if (Double.compare(value, 0.0) < 0)
        {
            return 0.0;
        }
        else
        {
            return value;
        }
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
     * Sets the strategy used to compute the aggregated value.
     * 
     * @param strategy
     *            The aggregation strategy.
     */
    public void setEvaluator(final Evaluator strategy)
    {
        evaluator = strategy;
    }

    /**
     * Sets the method indicating how aggregation is performed.
     * 
     * @param method
     *            The new method.
     */
    public void setMethod(final String method)
    {
        this.method = method;
    }
}
