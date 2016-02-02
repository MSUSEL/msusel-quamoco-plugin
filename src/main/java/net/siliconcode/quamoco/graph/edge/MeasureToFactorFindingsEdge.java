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

import java.util.Set;

import net.siliconcode.quamoco.graph.node.Finding;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.processor.Extent;

/**
 * MeasureToFactorFindingsEdge -
 * 
 * @author Isaac Griffith
 */
public class MeasureToFactorFindingsEdge extends AbstractEdge {

    /**
     * @param name
     */
    public MeasureToFactorFindingsEdge(String name)
    {
        super(name);
        // TODO Auto-generated constructor stub
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.aggregator.graph.edge.Edge#getValue()
     */
    @Override
    public double getValue()
    {
        if (src instanceof MeasureNode)
        {
            MeasureNode mnode = (MeasureNode) src;

            Set<Finding> findings = mnode.getFindings();

            Extent ex = Extent.getInstance();

            double value = norm.normalize(findings);

            return value;
        }

        return 0;
    }
}