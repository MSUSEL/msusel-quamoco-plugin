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
package net.siliconcode.quamoco.processor;

import net.siliconcode.quamoco.graph.INode;
import net.siliconcode.quamoco.graph.node.MeasureMethod;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.MeasureType;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.processor.aggregators.FindingsIntersectAggregator;
import net.siliconcode.quamoco.processor.aggregators.FindingsUnionAggregator;
import net.siliconcode.quamoco.processor.aggregators.NumberMaxAggregator;
import net.siliconcode.quamoco.processor.aggregators.NumberMeanAggregator;
import net.siliconcode.quamoco.processor.aggregators.NumberMedianAggregator;
import net.siliconcode.quamoco.processor.aggregators.NumberMinAggregator;

/**
 * AggregatorFactory -
 *
 * @author Isaac Griffith
 */
public class AggregatorFactory extends ProcessorFactory {

	/**
	 *
	 */
	private AggregatorFactory() {
	}

	private static class FactoryHelper {

		private static final AggregatorFactory INSTANCE = new AggregatorFactory();
	}

	/**
	 * @return
	 */
	public static ProcessorFactory getInstance() {
		return FactoryHelper.INSTANCE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.siliconcode.quamoco.processor.NodeProcessFactory#createProcessor(net.
	 * siliconcode.quamoco.aggregator.graph.Node)
	 */
	@Override
	public Processor createProcessor(final INode node) {
		if (node instanceof MeasureNode) {
			final MeasureNode mnode = (MeasureNode) node;

			if (mnode.getType().equals(MeasureType.FINDINGS)) {
				if (mnode.getMethod().equals(MeasureMethod.UNION)) {
					return new FindingsUnionAggregator(mnode);
				} else if (mnode.getMethod().equals(MeasureMethod.INTERSECT)) {
					return new FindingsIntersectAggregator(mnode);
				}
			} else if (mnode.getType().equals(MeasureType.NUMBER)) {
				if (mnode.getMethod().equals(MeasureMethod.MEAN)) {
					return new NumberMeanAggregator(mnode);
				} else if (mnode.getMethod().equals(MeasureMethod.MAX)) {
					return new NumberMaxAggregator(mnode);
				} else if (mnode.getMethod().equals(MeasureMethod.MIN)) {
					return new NumberMinAggregator(mnode);
				} else if (mnode.getMethod().equals(MeasureMethod.MEDIAN)) {
					return new NumberMedianAggregator(mnode);
				}
			}
		}

		return new NullProcessor((Node) node);
	}
}
