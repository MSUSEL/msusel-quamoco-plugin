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

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * ValueNode -
 *
 * @author Isaac Griffith
 */
public class ValueNode extends Node {

    public static final String MANUAL   = "ManualInstrument";
    public static final String UNION    = "FindingsUnionMeasureAggregation";
    private String             tool;

    /**
     *
     */
    public ValueNode(DirectedSparseGraph<Node, Edge> graph, String key, String owner, String tool)
    {
        super(graph, key, owner);
        this.tool = tool;
    }

    /**
     *
     */
    public ValueNode(DirectedSparseGraph<Node, Edge> graph, String key, String owner, String tool, long id)
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

    @Override
    public double getValue()
    {
        return value;
    }

    /**
     * @param key
     *            the key to set
     */
    public void setKey(String key)
    {
        setName(key);
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public String getTool()
    {
        return tool;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.resolve.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        return String.format("<nodes name=\"%s\" id=\"%d\" owner=\"%s\" type=\"VALUE\" />", this.name, this.id,
                this.ownedBy);
    }
}
