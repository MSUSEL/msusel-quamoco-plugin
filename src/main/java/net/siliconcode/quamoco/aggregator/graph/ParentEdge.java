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
 * ParentEdge -
 *
 * @author isaac
 */
public class ParentEdge extends AbstractEdge {

    double weight     = 1;
    double lowerBound = 0;
    double upperBound = 0;
    int    rank       = 1;

    /**
     * @param name
     * @param id
     */
    public ParentEdge(final String name)
    {
        super(name);
    }

    /**
     * @return the lowerBound
     */
    public double getLowerBound()
    {
        return lowerBound;
    }

    /**
     * @return the upperBound
     */
    public double getUpperBound()
    {
        return upperBound;
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.quamoco.aggregator.graph.AbstractEdge#getValue(edu.uci
     * .ics.jung.graph.DirectedSparseGraph,
     * net.siliconcode.quamoco.aggregator.graph.Node)
     */
    @Override
    public double getValue(final DirectedSparseGraph<Node, Edge> graph, final Node caller)
    {
        final Node opp = graph.getOpposite(caller, this);
        double value = 0.0;

        value = opp.getValue() * weight;

        if (Double.compare(value, lowerBound) < 0)
        {
            value = lowerBound;
        }
        if (Double.compare(value, upperBound) > 0)
        {
            value = upperBound;
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
     * @param lowerBound
     *            the lowerBound to set
     */
    public void setLowerBound(final double lowerBound)
    {
        if (Double.compare(upperBound, lowerBound) < 0)
        {
            throw new IllegalArgumentException("Value of upperbound: " + upperBound
                    + " cannot be less than value of lowerbound: " + lowerBound);
        }
        this.lowerBound = lowerBound;
    }

    /**
     * @param rank
     */
    public void setRank(final int rank)
    {
        this.rank = rank;
    }

    /**
     * @param upperBound
     *            the upperBound to set
     */
    public void setUpperBound(final double upperBound)
    {
        if (Double.compare(upperBound, lowerBound) < 0)
        {
            throw new IllegalArgumentException("Value of upperbound: " + upperBound
                    + " cannot be less than value of lowerbound: " + lowerBound);
        }
        this.upperBound = upperBound;
    }

    /**
     * @param weight
     *            the weight to set
     */
    public void setWeight(final double weight)
    {
        if (Double.compare(weight, 0.0) < 0)
        {
            throw new IllegalArgumentException("Value of weight cannot be less than 0.0.");
        }
        if (Double.compare(weight, 1.0) > 1)
        {
            throw new IllegalArgumentException("Value of weight cannot be greater than 1.0.");
        }
        this.weight = weight;
    }
}
