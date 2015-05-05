/**
 * 
 */
package net.siliconcode.quamoco.distill.graph;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * MeasureNode -
 *
 * @author isaac
 */
public class MeasureNode extends Node {

    private String      description;
    private Set<String> evaluatedBy;

    /**
     * @param graph
     * @param name
     * @param owner
     */
    public MeasureNode(DirectedSparseGraph<Node, String> graph, String name, String owner)
    {
        super(graph, name, owner);
        this.evaluatedBy = new HashSet<>();
    }

    public MeasureNode(DirectedSparseGraph<Node, String> graph, String name, String owner, long id)
    {
        super(graph, name, owner, id);
        this.evaluatedBy = new HashSet<>();
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
        builder.append(String.format(
                "<nodes name=\"%s\" description=\"%s\" id=\"%d\" owner=\"%s\" type=\"MEASURE\">\n",
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
