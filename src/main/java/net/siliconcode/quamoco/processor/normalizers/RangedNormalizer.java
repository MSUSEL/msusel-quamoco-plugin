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
package net.siliconcode.quamoco.processor.normalizers;

import java.util.Set;

import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.node.Finding;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.Extent;
import net.siliconcode.quamoco.processor.Normalizer;

/**
 * RangedNormalizer -
 * 
 * @author Isaac Griffith
 */
public class RangedNormalizer extends Normalizer {

    /**
     * 
     */
    public RangedNormalizer(Edge owner, String normMetric, NormalizationRange range)
    {
        super(owner, normMetric, range);
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.processor.Normalizer#normalize(double)
     */
    @Override
    public double normalize(double value)
    {
        return value / Extent.getInstance().findExtent(normMetric, range);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.quamoco.processor.Normalizer#normalize(java.util.Set)
     */
    @Override
    public double normalize(Set<Finding> findings)
    {
        double totalAffected = 0;
        for (Finding f : findings)
        {
            totalAffected += f.getExtent(normMetric, range);
        }

        return totalAffected / Extent.getInstance().findExtent(normMetric, range);
    }

}
