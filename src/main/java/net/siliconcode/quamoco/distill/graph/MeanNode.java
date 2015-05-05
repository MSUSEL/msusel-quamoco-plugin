/**
 * 
 */
package net.siliconcode.quamoco.distill.graph;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * MeanNode -
 *
 * @author isaac
 */
public class MeanNode extends Node {

    /**
     * @param graph
     */
    public MeanNode(DirectedSparseGraph<Node, String> graph, String name, String owner)
    {
        super(graph, name, owner);
    }

    /**
     * @param graph
     * @param id
     */
    public MeanNode(DirectedSparseGraph<Node, String> graph, String name, String owner, long id)
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
        double retVal = 0;
        for (String edge : graph.getInEdges(this))
        {
            retVal += graph.getOpposite(this, edge).getValue();
        }
        return retVal / graph.getPredecessorCount(this);
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.resolve.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        return String.format("<nodes name=\"%s\" id=\"%d\" owner=\"%s\" type=\"MEAN\" />", this.name, this.id,
                this.ownedBy);
    }

}
