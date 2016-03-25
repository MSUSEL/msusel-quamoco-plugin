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
import net.siliconcode.quamoco.graph.node.FactorMethod;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.processor.evaluators.ManualEvaluator;
import net.siliconcode.quamoco.processor.evaluators.MeanEvaluator;
import net.siliconcode.quamoco.processor.evaluators.SingleMeasureEvaluator;
import net.siliconcode.quamoco.processor.evaluators.WeightedSumEvaluator;

/**
 * EvaluatorFactory -
 *
 * @author Isaac Griffith
 */
public class EvaluatorFactory extends ProcessorFactory {

	/**
	 *
	 */
	private EvaluatorFactory() {
	}

	private static class FactoryHelper {

		private static final EvaluatorFactory INSTANCE = new EvaluatorFactory();
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
		if (node instanceof FactorNode) {
			final FactorNode fnode = (FactorNode) node;

			if (fnode.getMethod().equals(FactorMethod.ONE)) {
				return new SingleMeasureEvaluator(fnode);
			} else if (fnode.getMethod().equals(FactorMethod.RANKING)) {
				return new WeightedSumEvaluator(fnode);
			} else if (fnode.getMethod().equals(FactorMethod.MANUAL)) {
				return new ManualEvaluator(fnode);
			} else {
				return new MeanEvaluator(fnode);
			}
		}

		return null;
	}
}
