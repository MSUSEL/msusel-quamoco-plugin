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

import javax.annotation.Nullable;

import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.FactorNode;
import net.siliconcode.quamoco.aggregator.graph.MeasureNode;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.qm.Evaluation;
import net.siliconcode.quamoco.aggregator.qm.Factor;
import net.siliconcode.quamoco.aggregator.qm.Measure;
import net.siliconcode.quamoco.aggregator.qm.QualityModel;
import net.siliconcode.quamoco.aggregator.strategy.EvaluatorFactory;

import org.sonar.api.batch.DecoratorContext;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * AggregatorPopulator - Modifies the graph by adding Evaluators to existing
 * Nodes.
 * 
 * @author Isaac Griffith
 */
public class AggregatorPopulator implements GraphModifier {

    private final DecoratorContext context;

    /**
     * Constructor
     * 
     * @param context
     *            The context of the Decorator from which this GraphModifier is
     *            invoked (can be null).
     */
    public AggregatorPopulator(@Nullable final DecoratorContext context)
    {
        this.context = context;
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.quamoco.aggregator.GraphModifier#modifyGraph(net.siliconcode
     * .quamoco.aggregator.DistillerData,
     * edu.uci.ics.jung.graph.DirectedSparseGraph)
     */
    @Override
    public void modifyGraph(DistillerData data, DirectedSparseGraph<Node, Edge> graph)
    {
        assignFactorAggregators(data, graph, context);
        assignRemainingAggregators(data, graph, context);
    }

    /**
     * Create and assign Value for any remaining Factor and Measure Nodes
     * 
     * @param data
     *            Data holder
     * @param graph
     *            Graph in which the nodes exist
     * @param context
     *            Decorator Context
     */
    private void assignRemainingAggregators(final DistillerData data, DirectedSparseGraph<Node, Edge> graph,
            final DecoratorContext context)
    {
        for (final Node n : graph.getVertices())
        {
            if (n instanceof FactorNode && ((FactorNode) n).getEvaluator() == null)
            {
                EvaluatorFactory.getInstance().setEvaluator((FactorNode) n,
                        (Factor) QualityModelUtils.findEntity(data.getModelMap(), n.getOwnedBy()), graph, context);
            }
            else if (n instanceof MeasureNode && ((MeasureNode) n).getEvaluator() == null)
            {
                EvaluatorFactory.getInstance().setEvaluator((MeasureNode) n,
                        (Measure) QualityModelUtils.findEntity(data.getModelMap(), n.getOwnedBy()), graph, context);
            }
        }
    }

    /**
     * Create and assign Evaluators for Factor Nodes
     * 
     * @param data
     *            Data holder
     * @param graph
     *            Graph in which the factor nodes exist
     * @param context
     *            Decorator Context
     */
    private void assignFactorAggregators(final DistillerData data, DirectedSparseGraph<Node, Edge> graph,
            final DecoratorContext context)
    {
        for (final QualityModel model : data.getModelMap().values())
        {
            for (final Evaluation eval : model.getEvaluations())
            {
                final FactorNode node = (FactorNode) data.getFactorMap().get(eval.getEvaluates());
                if (node.getEvaluator() != null)
                {
                    EvaluatorFactory.getInstance().setEvaluator(node,
                            (Factor) QualityModelUtils.findEntity(data.getModelMap(), eval.getEvaluates()), graph,
                            context);
                }
            }
        }
    }

}
