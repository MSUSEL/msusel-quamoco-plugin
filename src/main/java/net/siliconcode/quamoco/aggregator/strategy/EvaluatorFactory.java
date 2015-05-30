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
package net.siliconcode.quamoco.aggregator.strategy;

import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.FactorNode;
import net.siliconcode.quamoco.aggregator.graph.MeasureNode;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.qm.Factor;
import net.siliconcode.quamoco.aggregator.qm.Measure;

import org.sonar.api.batch.DecoratorContext;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * EvaluatorFactory -
 *
 * @author Isaac Griffith
 */
public class EvaluatorFactory {

    private static class FactoryHelper {

        private static final EvaluatorFactory INSTANCE = new EvaluatorFactory();

        private FactoryHelper()
        {
        }
    }

    public static EvaluatorFactory getInstance()
    {
        return FactoryHelper.INSTANCE;
    }

    private EvaluatorFactory()
    {
    }

    public void setEvaluator(final FactorNode node, final Factor factor, final DirectedSparseGraph<Node, Edge> graph,
            final DecoratorContext context)
    {
        final NormalizationStrategy ns = NormalizationFactory.getInstance().getNormalizationStrategy(node, context,
                graph);
        if (node != null)
        {
            if (node.getMethod().equals(FactorNode.ONE))
            {
                node.setEvaluator(new SingleMeasureEvaluationStrategy(ns));
            }
            else if (node.getMethod().equals(FactorNode.RANKING))
            {
                node.setEvaluator(new WeightedSumFactorEvaluationStrategy(ns));
            }
            else
            {
                node.setEvaluator(new MeanFactorEvaluationStrategy(ns));
            }
        }
    }

    public void setEvaluator(final MeasureNode node, final Measure measure,
            final DirectedSparseGraph<Node, Edge> graph, final DecoratorContext context)
    {
        final NormalizationStrategy ns = NormalizationFactory.getInstance().getNormalizationStrategy(node, context,
                graph);
        if (node != null)
        {
            if (node.getType().equals(MeasureNode.FINDINGS))
            {
                if (node.getMethod().equals(MeasureNode.UNION))
                {
                    node.setEvaluator(new FindingsUnionMeasureAggregationStrategy(ns));
                }
                else if (node.getMethod().equals(MeasureNode.INTERSECT))
                {
                    node.setEvaluator(new FindingsIntersectMeasureAggregationStrategy(ns));
                }
            }
            else
            {
                if (node.getMethod().equals(MeasureNode.MEAN))
                {
                    node.setEvaluator(new NumberMeanAggregationStrategy(ns));
                }
                else if (node.getMethod().equals(MeasureNode.MAX))
                {
                    node.setEvaluator(new NumberMaxAggregationStrategy(ns));
                }
                else if (node.getMethod().equals(MeasureNode.MIN))
                {
                    node.setEvaluator(new NumberMinAggregationStrategy(ns));
                }
                else if (node.getMethod().equals(MeasureNode.MEDIAN))
                {
                    node.setEvaluator(new NumberMedianAggregationStrategy(ns));
                }
            }
        }
    }
}
