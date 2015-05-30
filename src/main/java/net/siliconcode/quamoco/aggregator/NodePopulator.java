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

import java.util.List;
import java.util.Map;

import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.FactorNode;
import net.siliconcode.quamoco.aggregator.graph.MeasureNode;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.graph.NormalizationNode;
import net.siliconcode.quamoco.aggregator.graph.ValueNode;
import net.siliconcode.quamoco.aggregator.qm.AbstractQMEntity;
import net.siliconcode.quamoco.aggregator.qm.Factor;
import net.siliconcode.quamoco.aggregator.qm.Measure;
import net.siliconcode.quamoco.aggregator.qm.MeasurementMethod;
import net.siliconcode.quamoco.aggregator.qm.QualityModel;
import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * NodePopulator -
 *
 * @author Isaac Griffith
 */
public class NodePopulator implements GraphModifier {

    public NodePopulator()
    {

    }

    /**
     * @param data
     * @param graph
     * @param entity
     * @param node
     * @param map
     */
    private void addNode(final DirectedSparseGraph<Node, Edge> graph, final AbstractQMEntity entity, final Node node,
            final Map<String, Node> map)
    {
        node.setDescription(entity.getDescription());
        map.put(entity.getId(), node);
        graph.addVertex(node);
    }

    /**
     * @param factorMap
     * @param measureMap
     * @param models
     */
    private void extractFactorsAndMeasures(final DistillerData data, final List<QualityModel> models,
            final DirectedSparseGraph<Node, Edge> graph)
    {
        for (final QualityModel model : models)
        {
            for (final AbstractQMEntity entity : model.getContained())
            {
                if (entity instanceof Measure)
                {
                    final Measure measure = (Measure) entity;
                    MeasureNode node = null;
                    if (measure.getType() != null && measure.getType().equals("qm:NormalizationMeasure"))
                    {
                        node = new NormalizationNode(graph, measure.getName(), measure.getId());
                        setMeasureNodeProperties(measure, node);
                    }
                    else
                    {
                        node = new MeasureNode(graph, measure.getName(), measure.getId());
                        setMeasureNodeProperties(measure, node);
                    }
                    addNode(graph, measure, node, data.getMeasureMap());
                }
                else if (entity instanceof Factor)
                {
                    final Factor factor = (Factor) entity;
                    final FactorNode node = new FactorNode(graph, factor.getName(), factor.getId());
                    if (factor.getAnnotation() != null && factor.getAnnotation().getKey().equals("aggregation"))
                    {
                        node.setMethod(factor.getAnnotation().getValue());
                    }
                    else
                    {
                        node.setMethod(FactorNode.MEAN);
                    }
                    addNode(graph, factor, node, data.getFactorMap());
                }
            }
        }
    }

    private void extractValues(final DistillerData data, final List<QualityModel> models,
            final DirectedSparseGraph<Node, Edge> graph)
    {
        final List<MeasurementMethod> mmlist = QualityModelUtils.getAllMeasurementMethods(models);
        for (final MeasurementMethod method : mmlist)
        {
            ValueNode node = null;
            if (method.getType().equals("qm:ManualInstrument"))
            {
                node = new ValueNode(graph, method.getName(), method.getId(), ValueNode.MANUAL);
            }
            else if (method.getType().equals("qm:ToolBasedInstrument"))
            {
                node = new ValueNode(graph, method.getMetric(), method.getId(), method.getTool());
            }
            else
            {
                node = new ValueNode(graph, method.getName(), method.getId(), ValueNode.UNION);
            }
            data.getValuesMap().put(method.getId(), node);
            graph.addVertex(node);
        }
    }

    /**
     * @param modelMap
     * @param factorMap
     * @param measureMap
     * @param valuesMap
     * @param graph
     */
    @Override
    public void modifyGraph(final DistillerData data, final DirectedSparseGraph<Node, Edge> graph)
    {
        extractFactorsAndMeasures(data, data.getModels(), graph);
        extractValues(data, data.getModels(), graph);
    }

    /**
     * @param measure
     * @param node
     */
    private void setMeasureNodeProperties(final Measure measure, final MeasureNode node)
    {
        node.setType(measure.getType());
        node.setMethod(MeasureNode.MEAN);
    }
}
