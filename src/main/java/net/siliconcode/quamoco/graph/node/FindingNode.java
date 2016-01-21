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

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.codetree.CodeNode;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.model.qm.NormalizationRange;

/**
 * FindingNode -
 * 
 * @author Isaac Griffith
 */
public class FindingNode extends Node {

    private String   ruleId;
    private CodeNode location;
    private Finding  finding;
    private String   ruleName;

    public FindingNode(final DirectedSparseGraph<Node, Edge> graph, final String key, final String owner, String ruleId,
            String ruleName, CodeNode location)
    {
        super(graph, key, owner);
        this.ruleId = ruleId;
        this.ruleName = ruleName;
        this.location = location;
    }

    public String getRuleName()
    {
        return ruleName;
    }

    public void setRuleName(String ruleName)
    {
        this.ruleName = ruleName;
    }

    public String getRuleId()
    {
        return ruleId;
    }

    public void setRuleId(String ruleId)
    {
        this.ruleId = ruleId;
    }

    public CodeNode getLocation()
    {
        return location;
    }

    public void setLocation(CodeNode location)
    {
        this.location = location;
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
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * @return
     */
    public Finding getFinding()
    {
        if (finding == null)
        {
            finding = new Finding(location.getIdentifier(), location.getType(), ruleId, ruleName);
        }

        return finding;
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
        return 0;
    }
}
