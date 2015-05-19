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
 * NormalizationNode -
 *
 * @author Isaac Griffith
 */
public class NormalizationNode extends MeasureNode {

    /**
     * @param graph
     * @param owner
     */
    public NormalizationNode(DirectedSparseGraph<Node, Edge> graph, String name, String owner)
    {
        super(graph, name, owner);
    }

    /**
     * @param graph
     * @param owner
     * @param id
     */
    public NormalizationNode(DirectedSparseGraph<Node, Edge> graph, String name, String owner, long id)
    {
        super(graph, name, owner, id);
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.resolve.Node#getValue()
     */
    @Override
    public double getValue()
    {
        for (Edge e : graph.getInEdges(this))
        {
            Node n = graph.getOpposite(this, e);
            if (n instanceof ValueNode)
                value = n.getValue();
        }

        return value;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.resolve.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        return String.format("<nodes name=\"%s\" id=\"%d\" owner=\"%s\" type=\"NORMALIZATION\" />", this.name, this.id,
                this.ownedBy);
    }

}
