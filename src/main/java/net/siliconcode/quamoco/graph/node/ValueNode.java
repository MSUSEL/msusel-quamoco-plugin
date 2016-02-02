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

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.model.qm.NormalizationRange;

/**
 * ValueNode -
 *
 * @author Isaac Griffith
 */
public class ValueNode extends Node {

    public static final String MANUAL = "ManualInstrument";
    public static final String UNION  = "FindingsUnionMeasureAggregation";
    private final String       tool;

    /**
     *
     */
    public ValueNode(final DirectedSparseGraph<Node, Edge> graph, final String key, final String owner,
            final String tool)
    {
        super(graph, key, owner);
        this.tool = tool;
    }

    /**
     *
     */
    public ValueNode(final DirectedSparseGraph<Node, Edge> graph, final String key, final String owner,
            final String tool, final long id)
    {
        super(graph, key, owner, id);
        this.tool = tool;
    }

    /**
     * @return the key
     */
    public String getKey()
    {
        return getName();
    }

    public String getTool()
    {
        return tool;
    }

    @Override
    public double getValue()
    {
        return value;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.resolve.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        return String.format("<nodes name=\"%s\" id=\"%d\" owner=\"%s\" type=\"VALUE\" />", name, id, ownedBy);
    }

    /**
     * @param key
     *            the key to set
     */
    public void setKey(final String key)
    {
        setName(key);
    }

    public void setValue(final double value)
    {
        this.value = value;
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

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.aggregator.graph.INode#getLowerResult()
     */
    @Override
    public double getLowerResult()
    {
        return this.getValue();
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.aggregator.graph.INode#getUpperResult()
     */
    @Override
    public double getUpperResult()
    {
        return this.getValue();
    }
}