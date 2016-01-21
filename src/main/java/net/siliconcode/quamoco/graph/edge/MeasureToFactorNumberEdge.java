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
package net.siliconcode.quamoco.graph.edge;

/**
 * MeasureToFactorNumberEdge -
 * 
 * @author Isaac Griffith
 */
public class MeasureToFactorNumberEdge extends WeightedRankedEdge {

    private String inf;

    /**
     * @param name
     */
    public MeasureToFactorNumberEdge(String name)
    {
        super(name);
        this.inf = InfluenceType.POS;
    }

    public double getValue()
    {
        double value = 0.0;

        if (usesLinearDist)
        {
            double proportion = src.getValue();
            if (src.getValue() <= 1.0)
                proportion = proportion * getMaxPoints();
            value = dist.calculate(getMaxPoints(), proportion);
        }
        else
        {
            if (inf != null)
            {
                if (inf.equals(InfluenceType.POS))
                {
                    value = src.getValue() * weight;
                }
                else if (inf.equals(InfluenceType.NEG))
                {
                    value = (getMaxPoints() - src.getValue()) * weight;
                }
            }
        }

        value = norm.normalize(value);

        return value;
    }

    /**
     * @return the inf
     */
    public String getInf()
    {
        return inf;
    }

    /**
     * @param inf
     *            the inf to set
     */
    public void setInf(final String inf)
    {
        this.inf = inf;
    }
}
