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
package net.siliconcode.quamoco.processor.aggregators;

import java.util.HashSet;
import java.util.Set;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.FindingsEdge;
import net.siliconcode.quamoco.graph.node.Finding;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.processor.FindingsAggregator;

/**
 * FindingsIntersectAggregator -
 *
 * @author Isaac Griffith
 */
public class FindingsIntersectAggregator extends FindingsAggregator {

	/**
	 *
	 */
	public FindingsIntersectAggregator(final Node owner) {
		super(owner);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see net.siliconcode.quamoco.processor.FindingsAggregator#aggregate()
	 */
	@Override
	protected Set<Finding> aggregate() {
		final DirectedSparseGraph<Node, Edge> graph = owner.getGraph();

		Set<Finding> retVal = new HashSet<>();

		boolean first = true;
		for (final Edge edge : graph.getInEdges(owner)) {
			if (edge instanceof FindingsEdge) {
				final Set<Finding> findings = ((FindingsEdge) edge).getFindings();

				if (first) {
					retVal = findings;
					first = false;
				} else {

					final Set<Finding> tmp = new HashSet<>();
					for (final Finding f : findings) {
						if (retVal.contains(f)) {
							tmp.add(f);
						}
					}

					retVal = tmp;
				}
			}
		}

		return retVal;
	}
}
