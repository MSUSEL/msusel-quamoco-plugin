/**
 *
 */
package net.siliconcode.quamoco.distill.graph;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * Node -
 *
 * @author Isaac Griffith
 */
public abstract class Node {

    private static long                         NEXT_ID = 1;
    protected DirectedSparseGraph<Node, String> graph;
    protected long                              id      = 0;
    protected double                            value   = -1.0;
    protected String                            ownedBy;
    protected String                            name;

    /**
     * @param graph
     * @param name
     * @param owner
     */
    public Node(DirectedSparseGraph<Node, String> graph, String name, String owner)
    {
        this(graph, name, owner, NEXT_ID++);
    }

    /**
     * @param graph
     * @param name
     * @param owner
     * @param id
     */
    public Node(DirectedSparseGraph<Node, String> graph, String name, String owner, long id)
    {
        this.graph = graph;
        this.id = id;
        this.name = name;
        this.ownedBy = owner;
    }

    /**
     * @return the id
     */
    public long getId()
    {
        return id;
    }

    /**
     * @return
     */
    public abstract double getValue();

    /**
     * @return
     */
    public abstract String getXMLTag();

    /**
     * @param id
     *            the id to set
     */
    public void setId(long id)
    {
        this.id = id;
    }

    /**
     * @return the ownedBy
     */
    public String getOwnedBy()
    {
        return ownedBy;
    }

    /**
     * @param ownedBy
     *            the ownedBy to set
     */
    public void setOwnedBy(String ownedBy)
    {
        this.ownedBy = ownedBy;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((ownedBy == null) ? 0 : ownedBy.hashCode());
        long temp;
        temp = Double.doubleToLongBits(value);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node other = (Node) obj;
        if (id != other.id)
            return false;
        if (ownedBy == null)
        {
            if (other.ownedBy != null)
                return false;
        }
        else if (!ownedBy.equals(other.ownedBy))
            return false;
        if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
            return false;
        return true;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return name;
    }
}
