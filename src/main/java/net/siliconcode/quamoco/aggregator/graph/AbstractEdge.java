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
 * AbstractEdge -
 *
 * @author Isaac Griffith
 */
public abstract class AbstractEdge implements Edge {

    private static long  NEXT_ID = 0;
    private final String name;
    private long         id;

    public AbstractEdge(final String name)
    {
        this.name = name;
        id = NEXT_ID++;
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
        final AbstractEdge other = (AbstractEdge) obj;
        if (id != other.id)
        {
            return false;
        }
        if (name == null)
        {
            if (other.name != null)
            {
                return false;
            }
        }
        else if (!name.equals(other.name))
        {
            return false;
        }
        return true;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.distill.graph.Edge#getId()
     */
    @Override
    public long getId()
    {
        return id;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.distill.graph.Edge#getName()
     */
    @Override
    public String getName()
    {
        return name;
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.quamoco.aggregator.graph.Edge#getValue(edu.uci.ics.jung
     * .graph.DirectedSparseGraph,
     * net.siliconcode.quamoco.aggregator.graph.Node)
     */
    @Override
    public double getValue(final DirectedSparseGraph<Node, Edge> graph, final Node caller)
    {
        return graph.getOpposite(caller, this).getValue();
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
        result = prime * result + (int) (id ^ id >>> 32);
        result = prime * result + (name == null ? 0 : name.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Edge: " + id;
    }

    /**
     * @param id
     */
    public void setId(long id)
    {
        this.id = id;
    }
}
