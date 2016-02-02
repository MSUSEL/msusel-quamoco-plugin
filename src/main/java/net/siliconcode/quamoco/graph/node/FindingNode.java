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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.model.qm.NormalizationRange;

/**
 * FindingNode -
 * 
 * @author Isaac Griffith
 */
public class FindingNode extends Node {

    private String                           ruleName;
    private String                           toolName;
    private Set<Finding>                     findings;
    private Map<String, Map<String, Double>> extents;

    public FindingNode(final DirectedSparseGraph<Node, Edge> graph, final String key, final String owner,
            String ruleName, String toolName)
    {
        super(graph, key, owner);
        this.ruleName = ruleName;
        this.toolName = toolName;
        findings = Sets.newHashSet();
        extents = Maps.newHashMap();
    }

    public String getRuleName()
    {
        return ruleName;
    }

    public void setRuleName(String ruleName)
    {
        this.ruleName = ruleName;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.aggregator.graph.Node#getValue()
     */
    @Override
    public double getValue()
    {
        return 0;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.aggregator.graph.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.aggregator.graph.INode#getExtent(java.lang.
     * String, net.siliconcode.quamoco.aggregator.qm.NormalizationRange)
     */
    @Override
    public double getExtent(String metric, NormalizationRange range)
    {
        if (extents.containsKey(range.toString()))
        {
            if (extents.get(range.toString()).containsKey(metric))
                return extents.get(range.toString()).get(metric);
        }

        double extent = 0;

        List<Finding> temp = new ArrayList<>(findings);
        for (Finding f : temp)
        {
            extent = extent + f.getExtent(metric, range);
        }

        addExtent(range.toString(), metric, extent);

        return extent;
    }

    /**
     * @param level
     * @param metric
     * @param extent
     */
    public boolean addExtent(String level, String metric, double extent)
    {
        if ((level == null || level.isEmpty()) || (metric == null || metric.isEmpty()) || Double.isInfinite(extent))
            return false;

        if (extents.containsKey(level))
        {
            Map<String, Double> map = extents.get(level);
            map.put(metric, extent);
            return true;
        }
        else
        {
            Map<String, Double> map = Maps.newHashMap();
            map.put(metric, extent);
            extents.put(level, map);
            return true;
        }
    }

    /**
     * @return
     */
    public Set<Finding> getFindings()
    {
        return findings;
    }

    public boolean addFinding(Finding finding)
    {
        if (finding == null)
            return false;

        findings.add(finding);
        return true;
    }

    /**
     * @return
     */
    public String getToolName()
    {
        return toolName;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.graph.INode#getLowerResult()
     */
    @Override
    public double getLowerResult()
    {
        return 0;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.graph.INode#getUpperResult()
     */
    @Override
    public double getUpperResult()
    {
        return 1.0;
    }
}
