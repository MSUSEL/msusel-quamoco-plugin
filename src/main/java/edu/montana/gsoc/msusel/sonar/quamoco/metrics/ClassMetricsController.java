/**
 * The MIT License (MIT)
 *
 * SparQLine Analytics Sonar Quamoco Plugin
 * Copyright (c) 2015-2017 Isaac Griffith, SparQLine Analytics, LLC
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
package edu.montana.gsoc.msusel.sonar.quamoco.metrics;

import java.util.HashSet;
import java.util.Set;

import edu.montana.gsoc.msusel.CodeTree;
import edu.montana.gsoc.msusel.INode;
import edu.montana.gsoc.msusel.metrics.Metric;
import edu.montana.gsoc.msusel.metrics.type.NOF;
import edu.montana.gsoc.msusel.metrics.type.NOM;
import edu.montana.gsoc.msusel.metrics.type.NOV;
import edu.montana.gsoc.msusel.node.TypeNode;
import edu.montana.gsoc.msusel.sonar.quamoco.QuamocoMetricsController;

/**
 * A MetricsController used to measure metrics on a TypeNode entity.
 * 
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class ClassMetricsController extends QuamocoMetricsController {

    /**
     * {@inheritDoc}
     */
    @Override
    public void measure(INode node, CodeTree tree)
    {
        if (!(node instanceof TypeNode))
        {
            return;
        }

        Set<Metric> metrics = new HashSet<>();
        metrics.add(NOF.getInstance());
        metrics.add(NOM.getInstance());
        metrics.add(NOV.getInstance());

        metrics.forEach((metric) -> {
            node.addMetric(metric.getAcronym(), metric.measure(node, tree));
        });
    }

}
