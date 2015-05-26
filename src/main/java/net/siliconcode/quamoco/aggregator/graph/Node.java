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
package net.siliconcode.quamoco.aggregator.graph;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * Node -
 *
 * @author Isaac Griffith
 */
public abstract class Node {

    private static long                       NEXT_ID = 1;
    protected DirectedSparseGraph<Node, Edge> graph;
    protected long                            id      = 0;
    protected double                          value   = -1.0;
    protected String                          ownedBy;
    protected String                          name;

    /**
     * @param graph
     * @param name
     * @param owner
     */
    public Node(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner)
    {
        this(graph, name, owner, NEXT_ID++);
    }

    /**
     * @param graph
     * @param name
     * @param owner
     * @param id
     */
    public Node(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner, final long id)
    {
        this.graph = graph;
        this.id = id;
        this.name = name;
        ownedBy = owner;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Node other = (Node) obj;
        if (id != other.id)
        {
            return false;
        }
        if (ownedBy == null)
        {
            if (other.ownedBy != null)
            {
                return false;
            }
        }
        else if (!ownedBy.equals(other.ownedBy))
        {
            return false;
        }
        if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
        {
            return false;
        }
        return true;
    }

    /**
     * @return the id
     */
    public long getId()
    {
        return id;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return the ownedBy
     */
    public String getOwnedBy()
    {
        return ownedBy;
    }

    /**
     * @return
     */
    public abstract double getValue();

    /**
     * @return
     */
    public abstract String getXMLTag();

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ id >>> 32);
        result = prime * result + (ownedBy == null ? 0 : ownedBy.hashCode());
        long temp;
        temp = Double.doubleToLongBits(value);
        result = prime * result + (int) (temp ^ temp >>> 32);
        return result;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(final long id)
    {
        this.id = id;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(final String name)
    {
        this.name = name;
    }

    /**
     * @param ownedBy
     *            the ownedBy to set
     */
    public void setOwnedBy(final String ownedBy)
    {
        this.ownedBy = ownedBy;
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

    public DirectedSparseGraph<Node, Edge> getGraph()
    {
        return graph;
    }
}
