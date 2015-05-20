/**
 *
 */
package net.siliconcode.quamoco.aggregator.graph;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * Edge -
 *
 * @author isaac
 */
public interface Edge {

    long getID();

    String getName();

    /**
     * @param graph
     * @param caller
     * @return
     */
    double getValue(DirectedSparseGraph<Node, Edge> graph, Node caller);
}
