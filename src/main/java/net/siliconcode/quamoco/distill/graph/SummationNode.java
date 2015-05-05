/**
 *
 */
package net.siliconcode.quamoco.distill.graph;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * SummationNode -
 *
 * @author isaac
 */
public class SummationNode extends Node {

    private String description;

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
        this.description = description;
    }

    /**
     *
     */
    public SummationNode(DirectedSparseGraph<Node, String> graph, String name, String owner)
    {
        super(graph, name, owner);
    }

    /**
     *
     */
    public SummationNode(DirectedSparseGraph<Node, String> graph, String name, String owner, long id)
    {
        super(graph, name, owner, id);
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.resolve.Node#getValue()
     */
    @Override
    public double getValue()
    {
        if (Double.compare(value, Double.NEGATIVE_INFINITY) == 0)
        {
            double value = 0;

            for (final String edge : graph.getInEdges(this))
            {
                final Node n = graph.getOpposite(this, edge);
                value += n.getValue();
            }
            this.value = value;
        }

        return value;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.resolve.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        return String.format("<nodes name=\"%s\" id=\"%d\" owner=\"%s\" type=\"SUMMATION\" />", this.name, this.id,
                this.ownedBy);
    }

}
