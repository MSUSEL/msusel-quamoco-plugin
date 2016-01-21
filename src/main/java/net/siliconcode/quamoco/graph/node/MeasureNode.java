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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringEscapeUtils;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.FindingsAggregator;

/**
 * MeasureNode -
 *
 * @author Isaac Griffith
 */
public class MeasureNode extends Node {

    private boolean      normalized;
    private String       type;
    private String       method;
    private Set<Finding> findings;

    /**
     * @param graph
     * @param name
     * @param owner
     */
    public MeasureNode(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner)
    {
        super(graph, name, owner);
    }

    public MeasureNode(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner,
            final long id)
    {
        super(graph, name, owner, id);
    }

    /**
     * @return
     */
    public String getMethod()
    {
        return method;
    }

    /**
     * @return the type
     */
    public String getType()
    {
        return type;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.distiller.Node#getValue()
     */
    @Override
    public double getValue()
    {
        if (type.equals(MeasureType.NUMBER))
        {
            if (Double.isInfinite(value))
            {
                value = processor.process();
            }

            return value;
        }

        return Double.NEGATIVE_INFINITY;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.distiller.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        final StringBuilder builder = new StringBuilder();
        builder.append(String.format("<nodes name=\"%s\" description=\"%s\" id=\"%d\" owner=\"%s\" type=\"MEASURE\">\n",
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

    /**
     * @param method
     *            the method to set
     */
    public void setMethod(final String method)
    {
        this.method = method;
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
     * @param type
     *            the type to set
     */
    public void setType(final String type)
    {
        this.type = type;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.aggregator.graph.INode#getExtent(java.lang.
     * String, net.siliconcode.quamoco.aggregator.qm.NormalizationRange)
     */
    @Override
    public double getExtent(String metric, NormalizationRange range)
    {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * @return
     */
    public Set<Finding> aggregateFindings()
    {
        if (this.type.equals(MeasureType.FINDINGS))
        {
            return ((FindingsAggregator) processor).processFindings();
        }

        return new HashSet<Finding>();
    }

    /**
     * @return
     */
    public Set<Finding> getFindings()
    {
        if (findings == null)
        {
            findings = aggregateFindings();
        }

        return findings;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.aggregator.graph.INode#getLowerResult()
     */
    @Override
    public double getLowerResult()
    {
        List<Double> values = new ArrayList<>();
        if (type.equals(MeasureType.FINDINGS))
        {

        }
        else if (type.equals(MeasureType.NUMBER))
        {
            for (Edge e : graph.getInEdges(this))
            {
                Node opp = graph.getOpposite(this, e);
                if (opp instanceof MeasureNode)
                {
                    MeasureNode mnOpp = (MeasureNode) opp;
                    if (mnOpp.getType().equals(MeasureType.FINDINGS))
                    {

                    }
                    else
                    {
                        values.add(mnOpp.getValue());
                    }
                }
                else if (opp instanceof ValueNode)
                {
                    values.add(opp.getValue());
                }
            }
        }

        if (!values.isEmpty())
            return Collections.min(values);
        else
            return 0;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.aggregator.graph.INode#getUpperResult()
     */
    @Override
    public double getUpperResult()
    {
        List<Double> values = new ArrayList<>();
        if (type.equals(MeasureType.FINDINGS))
        {

        }
        else if (type.equals(MeasureType.NUMBER))
        {
            for (Edge e : graph.getInEdges(this))
            {
                Node opp = graph.getOpposite(this, e);
                if (opp instanceof MeasureNode)
                {
                    MeasureNode mnOpp = (MeasureNode) opp;
                    if (mnOpp.getType().equals(MeasureType.FINDINGS))
                    {

                    }
                    else
                    {
                        values.add(mnOpp.getValue());
                    }
                }
                else if (opp instanceof ValueNode)
                {
                    values.add(opp.getValue());
                }
            }
        }

        if (!values.isEmpty())
            return Collections.max(values);
        else
            return 100;
    }
}
