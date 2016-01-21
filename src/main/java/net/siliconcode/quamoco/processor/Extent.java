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
package net.siliconcode.quamoco.processor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.siliconcode.quamoco.codetree.CodeNode;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.codetree.MethodNode;
import net.siliconcode.quamoco.codetree.TypeNode;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.FindingNode;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.sonar.quamoco.MetricsContext;
import net.siliconcode.sonar.quamoco.MetricsContextException;

/**
 * Extent -
 *
 * @author Isaac Griffith
 */
public class Extent {

    /**
     * Map of project-wide metric extents: key = range, value = (key = metric
     * name, value = metric) extent value
     */
    private Map<NormalizationRange, Map<String, Double>> totalMetricExtents;
    private MetricsContext                               context;
    private static final Logger                          LOG = LoggerFactory.getLogger(Extent.class);

    private static class ExtentHelper {

        private static final Extent INSTANCE = new Extent();
    }

    private Extent()
    {
        totalMetricExtents = new HashMap<>();
        for (NormalizationRange range : NormalizationRange.values())
            totalMetricExtents.put(range, new HashMap<String, Double>());
    }

    public static Extent getInstance()
    {
        return ExtentHelper.INSTANCE;
    }

    /**
     * @param metric
     * @param range
     * @param findings
     * @return
     */
    public double findFindingExtent(final String metric, final NormalizationRange range, List<FindingNode> findings)
    {
        List<String> locations = new ArrayList<>();
        for (FindingNode node : findings)
        {
            CodeNode cnode = node.getLocation();
            switch (range)
            {
            case CLASS:
                if (cnode instanceof TypeNode)
                {
                    locations.add(cnode.getQIdentifier());
                }
                else if (cnode instanceof FileNode)
                {
                    for (CodeNode tnode : ((FileNode) cnode).getTypes())
                    {
                        locations.add(tnode.getQIdentifier());
                    }
                }
                else if (cnode instanceof MethodNode)
                {
                    locations.add(cnode.getParent().getQIdentifier());
                }
                break;
            case FILE:
                if (cnode instanceof TypeNode)
                {
                    locations.add(cnode.getParent().getQIdentifier());
                }
                else if (cnode instanceof FileNode)
                {
                    locations.add(cnode.getQIdentifier());
                }
                else if (cnode instanceof MethodNode)
                {
                    locations.add(cnode.getParent().getParent().getQIdentifier());
                }
                break;
            case METHOD:
                if (cnode instanceof TypeNode)
                {
                    for (CodeNode mnode : ((TypeNode) cnode).getMethods())
                    {
                        locations.add(mnode.getQIdentifier());
                    }
                }
                else if (cnode instanceof FileNode)
                {
                    for (CodeNode tnode : ((FileNode) cnode).getTypes())
                    {
                        for (CodeNode mnode : ((TypeNode) tnode).getMethods())
                        {
                            locations.add(mnode.getQIdentifier());
                        }
                    }
                }
                else if (cnode instanceof MethodNode)
                {
                    locations.add(cnode.getQIdentifier());
                }
                break;
            case NA:
            }
        }

        double affected = 0;
        double total = findExtent(metric, range);
        for (String location : locations)
        {
            try
            {
                switch (range)
                {
                case CLASS:
                    affected += context.getTypeMetric(location, metric);
                    break;
                case FILE:
                    affected += context.getFileMetric(location, metric);
                    break;
                case METHOD:
                    affected += context.getMethodMetric(location, metric);
                    break;
                case NA:
                    break;
                }
            }
            catch (MetricsContextException e)
            {
                LOG.warn(e.getMessage());
            }
        }

        return affected / total;
    }

    /**
     * @param metric
     * @param range
     * @param measures
     * @return
     */
    public double findMeasureExtent(final String metric, final NormalizationRange range, List<MeasureNode> measures)
    {
        switch (range)
        {
        case CLASS:
        case FILE:
        case METHOD:
        case NA:
        }
    }

    /**
     * @param metric
     * @param range
     * @param factors
     * @return
     */
    public double findFactorExtent(final String metric, final NormalizationRange range, List<FactorNode> factors)
    {
        double affected = 0;
        double total = findExtent(metric, range);
        for (FactorNode node : factors)
        {
            affected += node.getExtent(metric, range);
        }

        return affected / total;
    }

    /**
     * @param metric
     * @param range
     * @return
     */
    public double findExtent(final String metric, final NormalizationRange range)
    {
        if (totalMetricExtents.get(range).containsKey(metric))
            return totalMetricExtents.get(range).get(metric);

        double total = 0;
        List<Double> values = null;
        switch (range)
        {
        case CLASS:
            values = context.getAllClassValues(metric);
            for (double val : values)
                total += val;
            totalMetricExtents.get(range).put(metric, total);
            break;
        case FILE:
            values = context.getAllFileValues(metric);
            for (double val : values)
                total += val;
            totalMetricExtents.get(range).put(metric, total);
            break;
        case METHOD:
            values = context.getAllMethodValues(metric);
            for (double val : values)
                total += val;
            totalMetricExtents.get(range).put(metric, total);
        case NA:
            try
            {
                totalMetricExtents.get(range).put(metric, (double) context.getProjectMetric(metric));
            }
            catch (MetricsContextException e)
            {
                LOG.warn(e.getMessage());
            }
        }

        return total;
    }

    private NormalizationRange determineRange(String metric)
    {

    }
}
