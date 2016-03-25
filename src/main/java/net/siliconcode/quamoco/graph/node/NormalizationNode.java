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

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.model.qm.NormalizationRange;

/**
 * NormalizationNode -
 *
 * @author Isaac Griffith
 */
public class NormalizationNode extends MeasureNode {

	private NormalizationRange range;

	/**
	 * @param graph
	 * @param owner
	 */
	public NormalizationNode(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner) {
		super(graph, name, owner);
		range = NormalizationRange.NA;
	}

	/**
	 * @param graph
	 * @param owner
	 * @param id
	 */
	public NormalizationNode(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner,
			final long id) {
		super(graph, name, owner, id);
		range = NormalizationRange.NA;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.siliconcode.quamoco.swing.resolve.Node#getValue()
	 */
	@Override
	public double getValue() {
		return 0;
	}

	public NormalizationRange getRange() {
		return range;
	}

	public void setRange(final NormalizationRange range) {
		this.range = range;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.siliconcode.quamoco.swing.resolve.Node#getXMLTag()
	 */
	@Override
	public String getXMLTag() {
		return String.format("<nodes name=\"%s\" id=\"%d\" owner=\"%s\" type=\"NORMALIZATION\" />", name, id, ownedBy);
	}

}
