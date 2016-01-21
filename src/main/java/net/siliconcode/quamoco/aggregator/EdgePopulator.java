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
import edu.uci.ics.jung.graph.util.EdgeType;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.FactorToFactorEdge;
import net.siliconcode.quamoco.graph.edge.MeasureToFactorFindingsEdge;
import net.siliconcode.quamoco.graph.edge.MeasureToFactorNumberEdge;
import net.siliconcode.quamoco.graph.edge.MeasureToMeasureFindingsEdge;
import net.siliconcode.quamoco.graph.edge.MeasureToMeasureFindingsNumberEdge;
import net.siliconcode.quamoco.graph.edge.MeasureToMeasureNumberEdge;
import net.siliconcode.quamoco.graph.edge.RankedEdge;
import net.siliconcode.quamoco.graph.edge.ValueToMeasureEdge;
import net.siliconcode.quamoco.graph.node.FactorMethod;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.MeasureType;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.ValueNode;
import net.siliconcode.quamoco.model.qm.AbstractQMEntity;
import net.siliconcode.quamoco.model.qm.Evaluation;
import net.siliconcode.quamoco.model.qm.Factor;
import net.siliconcode.quamoco.model.qm.Function;
import net.siliconcode.quamoco.model.qm.Influence;
import net.siliconcode.quamoco.model.qm.Measure;
import net.siliconcode.quamoco.model.qm.MeasurementMethod;
import net.siliconcode.quamoco.model.qm.Ranking;
import net.siliconcode.quamoco.processor.NormalizerFactory;

/**
 * EdgePopulator - Connects the nodes in the Quamoco Processing graph.
 *
 * @author Isaac Griffith
 */
public class EdgePopulator implements GraphModifier {

    /**
     * Constructor
     */
    public EdgePopulator()
    {

    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.aggregator.GraphModifier#modifyGraph(net.
     * siliconcode .quamoco.aggregator.DistillerData,
     * edu.uci.ics.jung.graph.DirectedSparseGraph)
     */
    @Override
    public void modifyGraph(final DistillerData data, final DirectedSparseGraph<Node, Edge> graph)
    {
        handleFactors(data, graph);
        handleMeasures(data, graph);
        handleData(data, graph);
        updateEdges(data, graph);
    }

    /**
     * Adds an edge between the two provided nodes in the provided graph.
     * 
     * @param graph
     *            Graph in which to add the edge.
     * @param src
     *            Source side of the edge.
     * @param dest
     *            Destination side of the edge.
     * @param infEffect
     *            The influence effect, can be POS or NEG (if null POS is
     *            assumed)
     */
    private void addEdge(final DirectedSparseGraph<Node, Edge> graph, final Node src, final Node dest,
            final String infEffect)
    {
        if (src == null || dest == null)
            return;

        if (src instanceof ValueNode)
        {
            graph.addEdge(new ValueToMeasureEdge(src.getName() + ":" + dest.getName()), src, dest, EdgeType.DIRECTED);
        }
        else if (src instanceof MeasureNode && dest instanceof MeasureNode)
        {
            MeasureNode sm = (MeasureNode) src;
            MeasureNode dm = (MeasureNode) dest;
            if (sm.getType().equals(MeasureType.FINDINGS) && dm.getType().equals(MeasureType.FINDINGS))
            {
                graph.addEdge(new MeasureToMeasureFindingsEdge(src.getName() + ":" + dest.getName()), src, dest,
                        EdgeType.DIRECTED);
            }
            else if (sm.getType().equals(MeasureType.NUMBER) && dm.getType().equals(MeasureType.NUMBER))
            {
                graph.addEdge(new MeasureToMeasureNumberEdge(src.getName() + ":" + dest.getName()), src, dest,
                        EdgeType.DIRECTED);
            }
            else
            {
                graph.addEdge(new MeasureToMeasureFindingsNumberEdge(src.getName() + ":" + dest.getName()), src, dest,
                        EdgeType.DIRECTED);
            }
        }
        else if (src instanceof MeasureNode && dest instanceof FactorNode)
        {
            MeasureNode sn = (MeasureNode) src;
            FactorMethod fn = (FactorMethod) dest;

            if (sn.getType().equals(MeasureType.FINDINGS))
            {
                graph.addEdge(new MeasureToFactorFindingsEdge(src.getName() + ":" + dest.getName()), src, dest,
                        EdgeType.DIRECTED);
            }
            else
            {
                graph.addEdge(new MeasureToFactorNumberEdge(src.getName() + ":" + dest.getName()), src, dest,
                        EdgeType.DIRECTED);
            }
        }
        // else if (src instanceof NormalizationNode)
        // {
        // graph.addEdge(new NormalizationEdge(src.getName() + ":" +
        // dest.getName()), src, dest, EdgeType.DIRECTED);
        // }
        else if (src instanceof FactorNode && dest instanceof FactorNode)
        {
            graph.addEdge(new FactorToFactorEdge(src.getName() + ":" + dest.getName(), infEffect), src, dest,
                    EdgeType.DIRECTED);
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
        addEdge(graph, src, dest, null);
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
                addEdge(graph, src, dest, inf.getEffect());
            }
            if (factor.getRefines() != null)
            {
                final Node dest = data.getFactorMap().get(factor.getRefines());
                addEdge(graph, src, dest, null);
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
                    addEdge(graph, src, dest, null);
                }
            }
            if (measure.getRefines() != null)
            {
                getDestNode(data, graph, measure.getRefines(), src);
            }
        }
    }

    /**
     * Updates all edges in the graph with information required to facilitate
     * processing.
     * 
     * @param data
     *            Data object
     * @param graph
     *            The graph containing the edges.
     */
    private void updateEdges(final DistillerData data, final DirectedSparseGraph<Node, Edge> graph)
    {
        for (final Edge edge : graph.getEdges())
        {
            final Evaluation eval = QualityModelUtils.getEvaluates(graph.getDest(edge), data.getModelMap());

            RankedEdge re = null;
            if (edge instanceof RankedEdge)
                re = (RankedEdge) edge;
            AbstractQMEntity srcEntity = null;

            if (graph.getSource(edge) instanceof FactorNode)
            {
                srcEntity = QualityModelUtils.getFactor(graph.getSource(edge), data.getModelMap());
            }
            else if (graph.getSource(edge) instanceof MeasureNode)
            {
                srcEntity = QualityModelUtils.getMeasure(graph.getSource(edge), data.getModelMap());
            }

            if (re != null && srcEntity != null && eval != null)
                updateEdge(re, eval, srcEntity, data);
        }
    }

    /**
     * Updates edges with rank information and sets the normalizer for the edge.
     * 
     * @param redge
     *            The edge to be update
     * @param eval
     *            The evaluation object containing ranking information.
     * @param srcEntity
     *            The Entity on the source side of the Edge.
     */
    private void updateEdge(final RankedEdge redge, final Evaluation eval, final AbstractQMEntity srcEntity,
            final DistillerData data)
    {
        if (srcEntity != null && eval != null)
        {
            for (final Ranking rank : eval.getRankings())
            {
                if (rank.getFactor().equals(srcEntity.getId()) || rank.getMeasure().equals(srcEntity.getId()))
                {
                    if (rank.getWeight() != null)
                    {
                        redge.setWeight(Double.parseDouble(rank.getWeight()));
                    }
                    if (rank.getFunction() != null)
                    {
                        final Function f = rank.getFunction();
                        redge.setMaxPoints(eval.getMaximumPoints());
                        redge.setLowerBound(f.getLowerBound());
                        redge.setUpperBound(f.getUpperBound());
                    }
                    if (rank.getNormalizationMeasure() != null)
                    {
                        final Node norm = data.getMeasureMap().get(rank.getNormalizationMeasure());
                        redge.setNormalizer(NormalizerFactory.getInstance().createNormalizer((Edge) redge,
                                norm.getName(), rank.getRange()));
                    }
                    break;
                }
            }
        }
    }

}
