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

/**
 * ParentEdge -
 * 
 * @author isaac
 */
public class ParentEdge extends AbstractEdge {

    /**
     * @param name
     * @param id
     */
    public ParentEdge(String name)
    {
        super(name);
    }

    double weight     = 0;
    double lowerBound = 0;
    double upperBound = 0;
    int    rank       = 0;

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

    /**
     * @return the lowerBound
     */
    public double getLowerBound()
    {
        return lowerBound;
    }

    /**
     * @param lowerBound
     *            the lowerBound to set
     */
    public void setLowerBound(double lowerBound)
    {
        this.lowerBound = lowerBound;
    }

    /**
     * @return the upperBound
     */
    public double getUpperBound()
    {
        return upperBound;
    }

    /**
     * @param upperBound
     *            the upperBound to set
     */
    public void setUpperBound(double upperBound)
    {
        this.upperBound = upperBound;
    }

    /**
     * @param rank
     */
    public void setRank(int rank)
    {
        this.rank = rank;
    }
}
