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

import java.util.List;

import com.google.common.collect.Lists;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.INode;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.processor.Processor;

/**
 * Node -
 *
 * @author Isaac Griffith
 */
public abstract class Node implements INode {

    private static long                                 NEXT_ID     = 1;
    transient protected DirectedSparseGraph<Node, Edge> graph;
    protected long                                      id          = 0;
    protected double                                    value       = 0;
    protected double                                    lowerResult = 0;
    protected double                                    upperResult = 1;
    protected String                                    ownedBy;
    protected String                                    name;
    protected String                                    description;
    protected Processor                                 processor;

    /**
     * @param graph
     * @param name
     * @param owner
     */
    public Node(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner) {
        this(graph, name, owner, Node.NEXT_ID++);
    }

    /**
     * @param graph
     * @param name
     * @param owner
     * @param id
     */
    public Node(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner, final long id) {
        if (name == null || name.isEmpty() || owner == null || owner.isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.graph = graph;
        this.id = id;
        this.name = name;
        description = "";
        ownedBy = owner;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Node other = (Node) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (ownedBy == null) {
            if (other.ownedBy != null) {
                return false;
            }
        }
        else if (!ownedBy.equals(other.ownedBy)) {
            return false;
        }
        if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value)) {
            return false;
        }
        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.siliconcode.quamoco.aggregator.graph.INode#getDescription()
     */
    @Override
    public String getDescription() {
        return description;
    }

    public DirectedSparseGraph<Node, Edge> getGraph() {
        return graph;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.siliconcode.quamoco.aggregator.graph.INode#getId()
     */
    @Override
    public long getId() {
        return id;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.siliconcode.quamoco.aggregator.graph.INode#getName()
     */
    @Override
    public String getName() {
        return name;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.siliconcode.quamoco.aggregator.graph.INode#getOwnedBy()
     */
    @Override
    public String getOwnedBy() {
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
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (ownedBy == null ? 0 : ownedBy.hashCode());
        long temp;
        temp = Double.doubleToLongBits(value);
        result = prime * result + (int) (temp ^ temp >>> 32);
        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * net.siliconcode.quamoco.aggregator.graph.INode#setDescription(java.lang.
     * String)
     */
    @Override
    public void setDescription(final String description) {
        if (description == null) {
            this.description = "";
        }
        else {
            this.description = description;
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see net.siliconcode.quamoco.aggregator.graph.INode#setId(long)
     */
    @Override
    public void setId(final long id) {
        this.id = id;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * net.siliconcode.quamoco.aggregator.graph.INode#setName(java.lang.String)
     */
    @Override
    public void setName(final String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.name = name;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.siliconcode.quamoco.aggregator.graph.INode#setOwnedBy(java.lang.
     * String)
     */
    @Override
    public void setOwnedBy(final String ownedBy) {
        if (ownedBy == null || ownedBy.isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.ownedBy = ownedBy;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return name;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.siliconcode.quamoco.aggregator.graph.INode#getProcessor()
     */
    @Override
    public Processor getProcessor() {
        return processor;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.siliconcode.quamoco.aggregator.graph.INode#setProcessor(net.
     * siliconcode.quamoco.processor.Processor)
     */
    @Override
    public void setProcessor(final Processor processor) {
        this.processor = processor;
    }

    /**
     * @return
     */
    @Override
    public List<Double> getValues() {
        final List<Double> list = Lists.newArrayList();
        list.add(getValue());

        return list;
    }
}
