/**
 * 
 */
package net.siliconcode.quamoco.distill.graph;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * NormalizationNode -
 *
 * @author isaac
 */
public class NormalizationNode extends Node {

    /**
     * @param graph
     * @param owner
     */
    public NormalizationNode(DirectedSparseGraph<Node, String> graph, String name, String owner)
    {
        super(graph, name, owner);
    }

    /**
     * @param graph
     * @param owner
     * @param id
     */
    public NormalizationNode(DirectedSparseGraph<Node, String> graph, String name, String owner, long id)
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
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.resolve.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        return String.format("<nodes name=\"%s\" id=\"%d\" owner=\"%s\" type=\"NORMALIZATION\" />", this.name, this.id,
                this.ownedBy);
    }

}
