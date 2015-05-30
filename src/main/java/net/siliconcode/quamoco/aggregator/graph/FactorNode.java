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

import net.siliconcode.quamoco.aggregator.strategy.EvaluationStrategy;

import org.apache.commons.lang3.StringEscapeUtils;

import com.google.common.collect.Lists;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * FactorNode -
 *
 * @author Isaac Griffith
 */
public class FactorNode extends Node {

    public static final String ONE     = "One";
    public static final String MEAN    = "Mean";
    public static final String RANKING = "Ranking";
    // private Evaluator evaluator;
    private String             method;
    private EvaluationStrategy evaluator;

    /**
     * @param graph
     * @param name
     * @param owner
     */
    public FactorNode(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner)
    {
        super(graph, name, owner);
    }

    public FactorNode(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner, final long id)
    {
        super(graph, name, owner, id);
    }

    /**
     * @return
     */
    public EvaluationStrategy getEvaluator()
    {
        return evaluator;
    }

    /**
     * @return
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
     * @param singleMeasureEvaluationStrategy
     */
    public void setEvaluator(final EvaluationStrategy strategy)
    {
        evaluator = strategy;
    }

    /**
     * @param method
     */
    public void setMethod(final String method)
    {
        this.method = method;
    }
}
