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

import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.model.qm.InfluenceEffect;

/**
 * MeasureToFactorFindingsEdge -
 * 
 * @author Isaac Griffith
 */
public class MeasureToFactorFindingsEdge extends WeightedRankedEdge implements InfluenceEdge {

    private String inf;

    /**
     * @param name
     */
    public MeasureToFactorFindingsEdge(String name, Node src, Node dest, final InfluenceEffect effect)
    {
        super(name, src, dest);
        inf = effect == null ? InfluenceType.POS : effect.toString();
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.aggregator.graph.edge.Edge#getValue()
     */
    @Override
    public double getValue()
    {
        double value = 0.0;

        if (src instanceof MeasureNode)
        {
            value = norm.normalize(((MeasureNode) src).getFindings());
            if (usesLinearDist)
            {
                value = getDist().calculate(getMaxPoints(), value);
                value = value * weight;
            }
            else
            {
                if (inf != null)
                {
                    if (inf.equals(InfluenceType.POS))
                    {
                        value = value * weight;
                    }
                    else if (inf.equals(InfluenceType.NEG))
                    {
                        value = (getMaxPoints() - (getMaxPoints() * value)) * weight;
                    }
                }
            }
        }

        return value;
    }

    /**
     * @return the inf
     */
    @Override
    public String getInf()
    {
        return inf;
    }

    /**
     * @param inf
     *            the inf to set
     */
    @Override
    public void setInf(final String inf)
    {
        this.inf = inf;
    }
}
