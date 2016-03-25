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
 * UnrangedNormalizer -
 *
 * @author Isaac Griffith
 */
public class UnrangedNormalizer extends Normalizer {

    /**
     * 
     */
    public UnrangedNormalizer(final Edge owner, final String normMetric, final NormalizationRange range) {
        super(owner, normMetric, range);
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.siliconcode.quamoco.processor.Normalizer#normalize(double)
     */
    @Override
    public double normalize(final double value) {
        double extent = Extent.getInstance().findExtent(normMetric, range);
        if (Double.compare(0, extent) == 0 && Double.compare(extent, value) == 0)
            return 0;
        else
            return value / Extent.getInstance().findExtent(normMetric, range);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * net.siliconcode.quamoco.processor.Normalizer#normalize(java.util.Set)
     */
    @Override
    public double normalize(final Set<Finding> findings) {
        double totalAffected = 0;
        for (final Finding f : findings) {
            totalAffected += f.getExtent(normMetric, range);
        }

        double extent = Extent.getInstance().findExtent(normMetric, range);
        if (Double.compare(0, extent) == 0 && Double.compare(extent, totalAffected) == 0)
            return 0;
        else
            return totalAffected / Extent.getInstance().findExtent(normMetric, range);
    }

}
