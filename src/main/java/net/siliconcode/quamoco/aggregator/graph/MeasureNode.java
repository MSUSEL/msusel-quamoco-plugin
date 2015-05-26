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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.siliconcode.quamoco.aggregator.strategy.Evaluator;

import org.apache.commons.lang3.StringEscapeUtils;

import com.google.common.collect.Lists;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * MeasureNode -
 *
 * @author Isaac Griffith
 */
public class MeasureNode extends Node {

    public static final String NUMBER    = "Number";
    public static final String FINDINGS  = "Findings";
    public static final String UNION     = "Union";
    public static final String INTERSECT = "Intersect";
    public static final String MEAN      = "Mean";
    public static final String MIN       = "Min";
    public static final String MAX       = "Max";
    public static final String MEDIAN    = "Median";
    private String             description;
    private boolean            normalized;
    private final Set<String>  evaluatedBy;
    private String             type;
    private String             method;
    private Evaluator          evaluator;

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * @param graph
     * @param name
     * @param owner
     */
    public MeasureNode(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner)
    {
        super(graph, name, owner);
        evaluatedBy = new HashSet<>();
    }

    public MeasureNode(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner, final long id)
    {
        super(graph, name, owner, id);
        evaluatedBy = new HashSet<>();
    }

    /**
     * @param id
     */
    public void addEvaluatedBy(final String id)
    {
        if (id == null)
        {
            return;
        }

        evaluatedBy.add(id);
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.distiller.Node#getValue()
     */
    @Override
    public double getValue()
    {
        List<Double> values = Lists.newArrayList();
        for (final Edge e : graph.getInEdges(this))
        {
            final Node n = graph.getOpposite(this, e);
            if (n instanceof ValueNode)
            {
                values.add(n.getValue());
            }
        }
        return evaluator.evaluate(values.toArray(new Double[0]));
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.distiller.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        final StringBuilder builder = new StringBuilder();
        builder.append(String.format(
                "<nodes name=\"%s\" description=\"%s\" id=\"%d\" owner=\"%s\" type=\"MEASURE\">\n",
                StringEscapeUtils.escapeXml10(name), StringEscapeUtils.escapeXml10(description), id, ownedBy));
        builder.append("\t</nodes>");
        return builder.toString();
    }

    /**
     * @return the normalized
     */
    public boolean isNormalized()
    {
        return normalized;
    }

    public void removeEvaluatedBy(final String id)
    {
        if (id == null)
        {
            return;
        }

        evaluatedBy.remove(id);
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(final String description)
    {
        if (description == null)
        {
            this.description = "";
        }
        else
        {
            this.description = description;
        }
    }

    /**
     * @param normalized
     *            the normalized to set
     */
    public void setNormalized(final boolean normalized)
    {
        this.normalized = normalized;
    }

    /**
     * @return the type
     */
    public String getType()
    {
        return type;
    }

    /**
     * @return
     */
    public String getMethod()
    {
        return this.method;
    }

    /**
     * @param method
     *            the method to set
     */
    public void setMethod(String method)
    {
        this.method = method;
    }

    /**
     * @return
     */
    public Evaluator getEvaluator()
    {
        return this.evaluator;
    }

    /**
     * @param evaluator
     */
    public void setEvaluator(Evaluator evaluator)
    {
        this.evaluator = evaluator;
    }
}
