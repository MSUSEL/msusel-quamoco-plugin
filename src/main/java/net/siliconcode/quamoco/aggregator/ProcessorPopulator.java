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
package net.siliconcode.quamoco.aggregator;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.INode;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.processor.ProcessorFactory;

/**
 * ProcessorPopulator - Modifies the graph by adding Evaluators to existing
 * Nodes.
 * 
 * @author Isaac Griffith
 */
public class ProcessorPopulator implements GraphModifier {

    /**
     * Constructor
     * 
     * @param context
     *            The context of the Decorator from which this GraphModifier is
     *            invoked (can be null).
     */
    public ProcessorPopulator()
    {
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.aggregator.GraphModifier#modifyGraph(net.
     * siliconcode .quamoco.aggregator.DistillerData,
     * edu.uci.ics.jung.graph.DirectedSparseGraph)
     */
    @Override
    public void modifyGraph(DistillerData data, DirectedSparseGraph<Node, Edge> graph)
    {
        assignProcessors(graph);
    }

    /**
     * Create and assign Value for any remaining Factor and Measure Nodes
     * 
     * @param graph
     *            Graph in which the nodes exist
     */
    private void assignProcessors(DirectedSparseGraph<Node, Edge> graph)
    {
        for (final INode n : graph.getVertices())
        {
            n.setProcessor(ProcessorFactory.getInstance(n).createProcessor(n));
        }
    }
}
