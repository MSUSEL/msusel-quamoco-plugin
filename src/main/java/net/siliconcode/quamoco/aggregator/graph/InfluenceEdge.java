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
 * InfluenceEdge -
 *
 * @author Isaac Griffith
 */
public class InfluenceEdge extends AbstractEdge {

    public static final String POS = "POSITIVE";
    public static final String NEG = "NEGATIVE";
    private double             weight;
    private String             inf;
    private double             lowerBound;
    private double             upperBound;
    private transient int      rank;

    /**
     * @param name
     * @param id
     */
    public InfluenceEdge(final String name)
    {
        super(name);
        weight = 1.0;
        inf = POS;
        lowerBound = 0;
        upperBound = 0;
        rank = 1;
    }

    /**
     * @return the inf
     */
    public String getInf()
    {
        return inf;
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

    @Override
    public double getValue(final DirectedSparseGraph<Node, Edge> graph, final Node caller)
    {
        final Node opp = graph.getOpposite(caller, this);
        double value = 0.0;

        if (inf != null)
        {
            if (inf.equals(POS))
            {
                value = opp.getValue() * weight;
            }
            else if (inf.equals(NEG))
            {
                value = 1 - opp.getValue() * weight;
            }
        }

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
     * @param inf
     *            the inf to set
     */
    public void setInf(final String inf)
    {
        this.inf = inf;
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
