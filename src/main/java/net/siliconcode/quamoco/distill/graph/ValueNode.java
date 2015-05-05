/**
 *
 */
package net.siliconcode.quamoco.distill.graph;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * ValueNode -
 *
 * @author isaac
 */
public class ValueNode extends Node {

    /**
     *
     */
    public ValueNode(DirectedSparseGraph<Node, String> graph, String key, String owner)
    {
        super(graph, key, owner);
    }

    /**
     *
     */
    public ValueNode(DirectedSparseGraph<Node, String> graph, String key, String owner, long id)
    {
        super(graph, key, owner, id);
    }

    /**
     * @return the key
     */
    public String getKey()
    {
        return getName();
    }

    @Override
    public double getValue()
    {
        return value;
    }

    /**
     * @param key
     *            the key to set
     */
    public void setKey(String key)
    {
        setName(key);
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.resolve.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        return String.format("<nodes name=\"%s\" id=\"%d\" owner=\"%s\" type=\"VALUE\" />", this.name, this.id,
                this.ownedBy);
    }
}
