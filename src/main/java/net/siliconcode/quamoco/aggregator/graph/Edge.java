/**
 *
 */
package net.siliconcode.quamoco.aggregator.graph;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * Edge -
 *
 * @author Isaac Griffith
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
