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

import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.FactorNode;
import net.siliconcode.quamoco.aggregator.graph.InfluenceEdge;
import net.siliconcode.quamoco.aggregator.graph.MeasureNode;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.graph.NormalizationEdge;
import net.siliconcode.quamoco.aggregator.graph.NormalizationNode;
import net.siliconcode.quamoco.aggregator.graph.ParentEdge;
import net.siliconcode.quamoco.aggregator.graph.ValueEdge;
import net.siliconcode.quamoco.aggregator.graph.ValueNode;
import net.siliconcode.quamoco.aggregator.qm.Evaluation;
import net.siliconcode.quamoco.aggregator.qm.Factor;
import net.siliconcode.quamoco.aggregator.qm.Function;
import net.siliconcode.quamoco.aggregator.qm.Influence;
import net.siliconcode.quamoco.aggregator.qm.Measure;
import net.siliconcode.quamoco.aggregator.qm.MeasurementMethod;
import net.siliconcode.quamoco.aggregator.qm.QualityModel;
import net.siliconcode.quamoco.aggregator.qm.Ranking;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;

/**
 * EdgePopulator -
 *
 * @author Isaac Griffith
 */
public class EdgePopulator implements GraphModifier {

    public EdgePopulator()
    {

    }

    /**
     * @param g
     * @param node
     * @param nextOpp
     */
    private void addEdge(final DirectedSparseGraph<Node, Edge> g, final Node src, final Node dest)
    {
        if (src instanceof ValueNode)
        {
            g.addEdge(new ValueEdge(src.getName() + ":" + dest.getName()), src, dest, EdgeType.DIRECTED);
        }
        else if (src instanceof MeasureNode)
        {
            g.addEdge(new ParentEdge(src.getName() + ":" + dest.getName()), src, dest, EdgeType.DIRECTED);
        }
        else if (src instanceof NormalizationNode)
        {
            g.addEdge(new NormalizationEdge(src.getName() + ":" + dest.getName()), src, dest, EdgeType.DIRECTED);
        }
        else if (src instanceof FactorNode)
        {
            g.addEdge(new InfluenceEdge(src.getName() + ":" + dest.getName()), src, dest, EdgeType.DIRECTED);
        }
    }

    /**
     * @param data
     * @param graph
     * @param method
     * @param src
     */
    private void getDestNode(final DistillerData data, final DirectedSparseGraph<Node, Edge> graph,
            final String measureKey, final Node src)
    {
        Node dest = null;
        if (data.getMeasureMap().get(measureKey) == null)
        {
            dest = data.getFactorMap().get(measureKey);
        }
        else
        {
            dest = data.getMeasureMap().get(measureKey);
        }
        addEdge(graph, src, dest);
    }

    /**
     * @param data
     * @param graph
     */
    private void handleData(final DistillerData data, final DirectedSparseGraph<Node, Edge> graph)
    {
        for (final String key : data.getValuesMap().keySet())
        {
            final MeasurementMethod method = (MeasurementMethod) QualityModelUtils.findEntity(data.getModelMap(), key);
            final Node src = data.getValuesMap().get(key);
            if (method.getDetermines() != null)
            {
                getDestNode(data, graph, method.getDetermines(), src);
            }
        }
    }

    /**
     * @param data
     * @param graph
     */
    private void handleFactors(final DistillerData data, final DirectedSparseGraph<Node, Edge> graph)
    {
        for (final String key : data.getFactorMap().keySet())
        {
            final Factor factor = (Factor) QualityModelUtils.findEntity(data.getModelMap(), key);
            final Node src = data.getFactorMap().get(key);
            for (final Influence inf : factor.getInfluences())
            {
                final Node dest = data.getFactorMap().get(inf.getTarget());
                addEdge(graph, src, dest);
            }
            if (factor.getRefines() != null)
            {
                final Node dest = data.getFactorMap().get(factor.getRefines());
                addEdge(graph, src, dest);
            }
        }
    }

    /**
     * @param data
     * @param graph
     */
    private void handleMeasures(final DistillerData data, final DirectedSparseGraph<Node, Edge> graph)
    {
        for (final String key : data.getMeasureMap().keySet())
        {
            final Measure measure = (Measure) QualityModelUtils.findEntity(data.getModelMap(), key);
            final Node src = data.getMeasureMap().get(key);
            for (final String parent : measure.getParents())
            {
                Node dest = data.getMeasureMap().get(parent);
                if (dest == null)
                {
                    dest = data.getFactorMap().get(parent);
                }
                if (dest != null)
                {
                    addEdge(graph, src, dest);
                }
            }
            if (measure.getRefines() != null)
            {
                getDestNode(data, graph, measure.getRefines(), src);
            }
        }
    }

    /**
     * @param data
     * @param graph
     */
    private void handleRankings(final DistillerData data, final DirectedSparseGraph<Node, Edge> graph)
    {
        for (final QualityModel model : data.getModelMap().values())
        {
            for (final Evaluation eval : model.getEvaluations())
            {
                for (final Ranking rank : eval.getRankings())
                {
                    if (rank.getNormalizationMeasure() != null)
                    {
                        final Node src = data.getMeasureMap().get(rank.getNormalizationMeasure());
                        Node dest = null;
                        if (rank.getFactor() == null)
                        {
                            dest = data.getMeasureMap().get(rank.getMeasure());
                        }
                        else
                        {
                            dest = data.getFactorMap().get(rank.getFactor());
                        }
                        if (dest != null)
                        {
                            graph.addEdge(new NormalizationEdge(src.getName() + ":" + dest.getName()), src, dest);
                        }
                    }
                }
            }
        }
    }

    /**
     * @param modelMap
     * @param factorMap
     * @param measureMap
     */
    @Override
    public void modifyGraph(final DistillerData data, final DirectedSparseGraph<Node, Edge> graph)
    {
        handleFactors(data, graph);
        handleMeasures(data, graph);
        handleData(data, graph);
        handleRankings(data, graph);
        updateEdges(data, graph);
    }

    /**
     * @param data
     * @param graph
     */
    private void updateEdges(final DistillerData data, final DirectedSparseGraph<Node, Edge> graph)
    {
        for (final Edge edge : graph.getEdges())
        {
            if (edge instanceof InfluenceEdge)
            {
                final InfluenceEdge ie = (InfluenceEdge) edge;
                final Evaluation eval = QualityModelUtils.getEvaluates(graph.getDest(edge), data.getModelMap());
                final Factor srcFact = QualityModelUtils.getFactor(graph.getSource(edge), data.getModelMap());

                updateInfluenceEdge(ie, eval, srcFact);
            }
            else if (edge instanceof ParentEdge)
            {
                final ParentEdge pe = (ParentEdge) edge;
                final Measure srcMeasure = QualityModelUtils.getMeasure(graph.getSource(pe), data.getModelMap());
                final Measure destMeasure = QualityModelUtils.getMeasure(graph.getDest(pe), data.getModelMap());
                if (destMeasure == null)
                {
                    final Factor destFact = QualityModelUtils.getFactor(graph.getDest(pe), data.getModelMap());
                    if (destFact != null)
                    {
                        updateParentEdge(data, graph, edge, pe, srcMeasure);
                    }
                }
                else
                {
                    updateParentEdge(data, graph, edge, pe, srcMeasure);
                }
            }
        }
    }

    /**
     * @param ie
     * @param eval
     * @param srcFact
     */
    private void updateInfluenceEdge(final InfluenceEdge ie, final Evaluation eval, final Factor srcFact)
    {
        if (srcFact != null && eval != null)
        {
            for (final Ranking rank : eval.getRankings())
            {
                if (rank.getFactor() != null)
                {
                    if (rank.getFactor().equals(srcFact.getId()))
                    {
                        if (rank.getRank() != null)
                        {
                            ie.setRank(Integer.parseInt(rank.getRank()));
                        }
                        if (rank.getWeight() != null)
                        {
                            ie.setWeight(Double.parseDouble(rank.getWeight()));
                        }
                        if (rank.getFunction() != null)
                        {
                            final Function f = rank.getFunction();
                            ie.setLowerBound(f.getLowerBound());
                            ie.setUpperBound(f.getUpperBound());
                        }
                        break;
                    }
                }
            }
        }
    }

    /**
     * @param data
     * @param graph
     * @param edge
     * @param pe
     * @param srcMeasure
     */
    private void updateParentEdge(final DistillerData data, final DirectedSparseGraph<Node, Edge> graph,
            final Edge edge, final ParentEdge pe, final Measure srcMeasure)
    {
        final Evaluation eval = QualityModelUtils.getEvaluates(graph.getDest(edge), data.getModelMap());
        if (eval != null)
        {
            for (final Ranking rank : eval.getRankings())
            {
                if (rank.getMeasure() != null)
                {
                    if (rank.getMeasure().equals(srcMeasure.getId()))
                    {
                        if (rank.getRank() != null)
                        {
                            pe.setRank(Integer.parseInt(rank.getRank()));
                        }
                        if (rank.getWeight() != null)
                        {
                            pe.setWeight(Double.parseDouble(rank.getWeight()));
                        }
                        if (rank.getFunction() != null)
                        {
                            pe.setLowerBound(rank.getFunction().getLowerBound());
                            pe.setUpperBound(rank.getFunction().getUpperBound());
                        }
                        if (rank.getNormalizationMeasure() != null)
                        {
                            final Node src = data.getMeasureMap().get(rank.getNormalizationMeasure());
                            final Node dest = graph.getSource(pe);
                            graph.addEdge(new NormalizationEdge(src.getName() + ":" + dest.getName()), src, dest);
                        }
                        break;
                    }
                }
            }
        }
    }
}
