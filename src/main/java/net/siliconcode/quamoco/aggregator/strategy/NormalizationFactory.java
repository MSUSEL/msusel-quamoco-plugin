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
import net.siliconcode.quamoco.aggregator.graph.NormalizationEdge;
import net.siliconcode.sonar.quamoco.metrics.CSharpMetrics;

import org.sonar.api.batch.DecoratorContext;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * NormalizationFactory -
 * 
 * @author Isaac Griffith
 */
public class NormalizationFactory {

    private NormalizationFactory()
    {
    }

    private static class FactoryHelper {

        private static final NormalizationFactory INSTANCE = new NormalizationFactory();
    }

    public static NormalizationFactory getInstance()
    {
        return FactoryHelper.INSTANCE;
    }

    public NormalizationStrategy getNormalizationStrategy(FactorNode factor, DecoratorContext context,
            DirectedSparseGraph<Node, Edge> graph)
    {
        for (Edge e : graph.getInEdges(factor))
        {
            if (e instanceof NormalizationEdge)
            {
                Node n = graph.getOpposite(factor, e);
                if (CSharpMetrics.getMetric(n.getName()) != null)
                    return new BasicNormalizationStrategy(CSharpMetrics.getMetric(n.getName()), context);
            }
        }
        return new NoNormalizationStrategy();
    }

    public NormalizationStrategy getNormalizationStrategy(MeasureNode measure, DecoratorContext context,
            DirectedSparseGraph<Node, Edge> graph)
    {
        for (Edge e : graph.getInEdges(measure))
        {
            if (e instanceof NormalizationEdge)
            {
                Node n = graph.getOpposite(measure, e);
                if (CSharpMetrics.getMetric(n.getName()) != null)
                    return new BasicNormalizationStrategy(CSharpMetrics.getMetric(n.getName()), context);
            }
        }
        return new NoNormalizationStrategy();
    }
}
