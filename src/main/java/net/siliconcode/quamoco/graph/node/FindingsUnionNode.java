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
package net.siliconcode.quamoco.graph.node;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.FindingsEdge;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.Extent;

/**
 * FindingsUnionNode -
 * 
 * @author Isaac Griffith
 */
public class FindingsUnionNode extends Node {

    private Set<Finding>                     findings;
    /**
     * Map containing extens for each level, Key = FILE, TYPE, or METHOD, Value
     * = (Map holding extent values for the finding. Key = Metric, Value =
     * Extent (unnormalized))
     */
    private Map<String, Map<String, Double>> extents;

    /**
     * @param graph
     * @param name
     * @param owner
     */
    public FindingsUnionNode(DirectedSparseGraph<Node, Edge> graph, String name, String owner)
    {
        super(graph, name, owner);
        findings = Sets.newHashSet();
        extents = Maps.newHashMap();
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.graph.INode#getExtent(java.lang.String,
     * net.siliconcode.quamoco.model.qm.NormalizationRange)
     */
    @Override
    public double getExtent(String metric, NormalizationRange range)
    {
        if (extents.containsKey(range.toString()))
        {
            if (extents.get(range.toString()).containsKey(metric))
                return extents.get(range.toString()).get(metric);
        }

        if (findings.isEmpty())
        {
            for (Edge e : graph.getInEdges(this))
            {
                if (e instanceof FindingsEdge)
                {
                    findings.addAll(((FindingsEdge) e).getFindings());
                }
            }
        }

        double extent = 0;
        for (Finding f : findings)
            extent = Extent.getInstance().findFindingExtent(metric, range, f);

        addExtent(range.toString(), metric, extent);

        return extent;
    }

    public boolean addExtent(String level, String metric, double value)
    {
        if ((level == null || level.isEmpty()) || (metric == null || metric.isEmpty()) || Double.isInfinite(value))
            return false;

        if (extents.containsKey(level))
        {
            Map<String, Double> map = extents.get(level);
            map.put(metric, value);
            return true;
        }
        else
        {
            Map<String, Double> map = Maps.newHashMap();
            map.put(metric, value);
            extents.put(level, map);

            return true;
        }
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.graph.INode#getLowerResult()
     */
    @Override
    public double getLowerResult()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.graph.INode#getUpperResult()
     */
    @Override
    public double getUpperResult()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.graph.node.Node#getValue()
     */
    @Override
    public double getValue()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.graph.node.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        // TODO Auto-generated method stub
        return null;
    }

    public Set<Finding> getFindings()
    {
        if (findings.isEmpty())
        {
            for (Edge e : graph.getInEdges(this))
            {
                if (e instanceof FindingsEdge)
                {
                    findings.addAll(((FindingsEdge) e).getFindings());
                }
            }
        }

        return findings;
    }
}
