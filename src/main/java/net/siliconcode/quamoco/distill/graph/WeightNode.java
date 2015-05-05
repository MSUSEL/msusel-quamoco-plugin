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
package net.siliconcode.quamoco.distill.graph;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * WeightNode -
 *
 * @author Isaac Griffith
 */
public class WeightNode extends Node {

    private double weight;
    private double upperBound;
    private double lowerBound;
    private int    rank;

    /**
     *
     */
    public WeightNode(DirectedSparseGraph<Node, String> graph, String name, String owner, double weight)
    {
        super(graph, name, owner);
        this.weight = weight;
    }

    public WeightNode(DirectedSparseGraph<Node, String> graph, String name, String owner, double weight, long id)
    {
        super(graph, name, owner, id);
        this.weight = weight;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.resolve.Node#getValue()
     */
    @Override
    public double getValue()
    {
        if (Double.compare(value, Double.NEGATIVE_INFINITY) == 0)
        {
            double value = weight;

            for (final String edge : graph.getInEdges(this))
            {
                final Node n = graph.getOpposite(this, edge);
                value *= n.getValue();
            }

            this.value = value;
        }
        return value;
    }

    /**
     * @return the weight
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * @param weight
     *            the weight to set
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.resolve.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        return String
                .format("<nodes name=\"%s\" weight=\"%f\" id=\"%d\" owner=\"%s\" type=\"WEIGHT\" lowerBound=\"%f\" upperBound=\"%f\" rank=\"%d\" />",
                        this.name, this.weight, this.id, this.ownedBy, this.lowerBound, this.upperBound, this.rank);
    }

    /**
     * @param upperBound
     */
    public void setUpper(double upperBound)
    {
        this.upperBound = upperBound;
    }

    /**
     * @param lowerBound
     */
    public void setLower(double lowerBound)
    {
        this.lowerBound = lowerBound;
    }

    /**
     * @param rank
     */
    public void setRank(int rank)
    {
        this.rank = rank;
    }
}
