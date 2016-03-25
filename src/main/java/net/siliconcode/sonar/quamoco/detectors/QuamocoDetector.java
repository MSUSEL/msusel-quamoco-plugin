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
package net.siliconcode.sonar.quamoco.detectors;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.codetree.CodeTree;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.processor.MetricsContext;

/**
 * QuamocoDetector -
 *
 * @author Isaac Griffith
 */
public abstract class QuamocoDetector {

	protected DirectedSparseGraph<Node, Edge> graph;
	protected MetricsContext context;
	protected CodeTree tree;

	/**
	 * @param graph
	 * @param context
	 * @param tree
	 */
	public QuamocoDetector(final DirectedSparseGraph<Node, Edge> graph, final MetricsContext context,
			final CodeTree tree) {
		this.graph = graph;
		this.context = context;
		this.tree = tree;
	}

	/**
	 *
	 */
	public void overlyLongFile() {
		for (final String file : tree.getFiles()) {
			if (context.getFileMetric(file, MetricsContext.LOC) > 300) {
				// create new findings node
			}
		}
	}

	/**
	 *
	 */
	public void nestingDepthExceeded() {
		for (final String method : tree.getMethods()) {
			if (context.getMethodMetric(method, MetricsContext.MAXNESTING) > 3) {
				// create new findings node
			}
		}
	}

	/**
	 *
	 */
	public void execute() {
		overlyLongFile();
		nestingDepthExceeded();
	}
}
