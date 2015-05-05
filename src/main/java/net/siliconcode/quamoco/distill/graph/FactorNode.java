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
package net.siliconcode.quamoco.distill.graph;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringEscapeUtils;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * FactorNode -
 *
 * @author Isaac Griffith
 */
public class FactorNode extends Node {

    private String      description;
    private Set<String> evaluatedBy;

    /**
     * @param graph
     * @param name
     * @param owner
     */
    public FactorNode(DirectedSparseGraph<Node, String> graph, String name, String owner)
    {
        super(graph, name, owner);
        evaluatedBy = new HashSet<>();
    }

    public FactorNode(DirectedSparseGraph<Node, String> graph, String name, String owner, long id)
    {
        super(graph, name, owner, id);
        evaluatedBy = new HashSet<>();
    }

    public Set<String> getEvaluatedBy()
    {
        return evaluatedBy;
    }

    public void addEvaluatedBy(String evaluated)
    {
        if (evaluated == null || this.evaluatedBy.contains(evaluated))
            return;

        this.evaluatedBy.add(evaluated);
    }

    public void removeEvaluatedBy(String evaluated)
    {
        if (evaluated == null || !this.evaluatedBy.contains(evaluated))
            return;

        this.evaluatedBy.remove(evaluated);
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(String description)
    {
        if (description == null)
            this.description = "";
        else
            this.description = description;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.distiller.Node#getValue()
     */
    @Override
    public double getValue()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.distiller.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("<nodes name=\"%s\" description=\"%s\" id=\"%d\" owner=\"%s\" type=\"FACTOR\">\n",
                StringEscapeUtils.escapeXml10(this.name), StringEscapeUtils.escapeXml10(this.description), this.id,
                this.ownedBy));
        for (String eval : evaluatedBy)
        {
            builder.append(String.format("\t\t<evaluatedBy id=\"%s\" />\n", eval));
        }
        builder.append("\t</nodes>");
        return builder.toString();
    }
}
