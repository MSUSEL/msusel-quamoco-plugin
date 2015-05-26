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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Nullable;
import javax.xml.stream.XMLStreamException;

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
import net.siliconcode.quamoco.aggregator.io.MetricsFileWriter;
import net.siliconcode.quamoco.aggregator.io.QMReader;
import net.siliconcode.quamoco.aggregator.io.RootNotFoundException;
import net.siliconcode.quamoco.aggregator.qm.AbstractQMEntity;
import net.siliconcode.quamoco.aggregator.qm.Evaluation;
import net.siliconcode.quamoco.aggregator.qm.Factor;
import net.siliconcode.quamoco.aggregator.qm.Function;
import net.siliconcode.quamoco.aggregator.qm.Influence;
import net.siliconcode.quamoco.aggregator.qm.Measure;
import net.siliconcode.quamoco.aggregator.qm.MeasurementMethod;
import net.siliconcode.quamoco.aggregator.qm.QualityModel;
import net.siliconcode.quamoco.aggregator.qm.Ranking;
import net.siliconcode.quamoco.aggregator.strategy.EvaluatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.batch.DecoratorContext;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;

/**
 * ModelDistiller -
 *
 * @author Isaac Griffith
 */
public class ModelDistiller {

    private static final Logger                   LOG        = LoggerFactory.getLogger(ModelDistiller.class);
    private final DirectedSparseGraph<Node, Edge> graph;
    private final Map<String, QualityModel>       modelMap   = new HashMap<>();
    private final Map<String, Node>               factorMap  = new HashMap<>();
    private final Map<String, Node>               measureMap = new HashMap<>();
    private final Map<String, Node>               valuesMap  = new HashMap<>();
    private String                                language;
    private boolean                               verbose    = false;

    /**
     *
     */
    public ModelDistiller(final String... args)
    {
        graph = new DirectedSparseGraph<>();
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
     * @param modelMap
     * @param factorMap
     */
    private void addNodesToGraph(final Map<String, QualityModel> modelMap, final Map<String, Node> factorMap)
    {
        for (final String key : factorMap.keySet())
        {
            final Factor factor = (Factor) findEntity(modelMap, key);
            final Node src = factorMap.get(key);
            for (final Influence inf : factor.getInfluences())
            {
                final Node dest = factorMap.get(inf.getTarget());
                addEdge(graph, src, dest);
            }
            if (factor.getRefines() != null)
            {
                final Node dest = factorMap.get(factor.getRefines());
                addEdge(graph, src, dest);
            }
        }

        for (final String key : measureMap.keySet())
        {
            final Measure measure = (Measure) findEntity(modelMap, key);
            final Node src = measureMap.get(key);
            for (final String parent : measure.getParents())
            {
                Node dest = measureMap.get(parent);
                if (dest == null)
                {
                    dest = factorMap.get(parent);
                }
                if (dest != null)
                {
                    addEdge(graph, src, dest);
                }
            }
            if (measure.getRefines() != null)
            {
                final Node dest = measureMap.get(measure.getRefines()) != null ? measureMap.get(measure.getRefines())
                        : factorMap.get(measure.getRefines());
                addEdge(graph, src, dest);
            }
        }

        for (final String key : valuesMap.keySet())
        {
            final MeasurementMethod method = (MeasurementMethod) findEntity(modelMap, key);
            final Node src = valuesMap.get(key);
            if (method.getDetermines() != null)
            {
                final Node dest = measureMap.get(method.getDetermines()) != null ? measureMap.get(method
                        .getDetermines()) : factorMap.get(method.getDetermines());
                addEdge(graph, src, dest);
            }
        }

        for (final QualityModel model : modelMap.values())
        {
            for (final Evaluation eval : model.getEvaluations())
            {
                for (final Ranking rank : eval.getRankings())
                {
                    if (rank.getNormalizationMeasure() != null)
                    {
                        final Node src = measureMap.get(rank.getNormalizationMeasure());
                        Node dest = null;
                        if (rank.getFactor() != null)
                        {
                            dest = factorMap.get(rank.getFactor());
                        }
                        else
                        {
                            dest = measureMap.get(rank.getMeasure());
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

    public void buildGraph(@Nullable DecoratorContext context)
    {
        final String[] files = selectQMFiles();
        final List<QualityModel> models = readInQualityModels(files);

        createModelMap(modelMap, models);
        extractFactorsAndMeasures(factorMap, measureMap, models);
        extractValues(valuesMap, models);
        extractEvaluatedBy(factorMap, measureMap, models);
        addNodesToGraph(modelMap, factorMap);
        connectNodes(modelMap, factorMap, measureMap, valuesMap);

        if (context != null)
            assignAggregators(context);
        if (verbose)
            showMeasures();

        cleanGraph();
    }

    private void showMeasures()
    {
        for (Node n : graph.getVertices())
        {
            if (n instanceof MeasureNode)
            {
                System.out.println(n.getName());
            }
        }
    }

    private void assignAggregators(@Nullable DecoratorContext context)
    {
        for (QualityModel model : modelMap.values())
        {
            for (Evaluation eval : model.getEvaluations())
            {
                FactorNode node = (FactorNode) factorMap.get(eval.getEvaluates());
                if (node.getEvaluator() != null)
                    EvaluatorFactory.getInstance().setEvaluator(node,
                            (Factor) findEntity(modelMap, eval.getEvaluates()), graph, context);
            }
        }

        for (Node n : graph.getVertices())
        {
            if (n instanceof FactorNode && ((FactorNode) n).getEvaluator() == null)
            {
                EvaluatorFactory.getInstance().setEvaluator((FactorNode) n,
                        (Factor) findEntity(modelMap, n.getOwnedBy()), graph, context);
            }
            else if (n instanceof MeasureNode && ((MeasureNode) n).getEvaluator() == null)
            {
                EvaluatorFactory.getInstance().setEvaluator((MeasureNode) n,
                        (Measure) findEntity(modelMap, n.getOwnedBy()), graph, context);
            }
        }
    }

    /**
     *
     */
    private void cleanGraph()
    {
        final List<Node> toRemove = new ArrayList<>();
        do
        {
            for (final Node n : toRemove)
            {
                graph.removeVertex(n);
            }

            toRemove.clear();

            for (final Node n : graph.getVertices())
            {
                if (graph.inDegree(n) < 1 && !(n instanceof ValueNode))
                {
                    toRemove.add(n);
                }
            }
        }
        while (!toRemove.isEmpty());
    }

    /**
     * @param modelMap
     * @param factorMap
     * @param measureMap
     */
    private void connectNodes(final Map<String, QualityModel> modelMap, final Map<String, Node> factorMap,
            final Map<String, Node> measureMap, final Map<String, Node> valuesMap)
    {
        for (final Edge edge : graph.getEdges())
        {
            if (edge instanceof InfluenceEdge)
            {
                final InfluenceEdge ie = (InfluenceEdge) edge;
                final Evaluation eval = getEvaluates(graph.getDest(edge));
                final Factor srcFact = getFactor(graph.getSource(edge));

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
            else if (edge instanceof NormalizationEdge)
            {

            }
            else if (edge instanceof ParentEdge)
            {
                final ParentEdge pe = (ParentEdge) edge;
                final Measure srcMeasure = getMeasure(graph.getSource(pe));
                final Measure destMeasure = getMeasure(graph.getDest(pe));
                if (destMeasure != null)
                {
                    final Evaluation eval = getEvaluates(graph.getDest(edge));
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
                                        final Node src = measureMap.get(rank.getNormalizationMeasure());
                                        final Node dest = graph.getSource(pe);
                                        graph.addEdge(new NormalizationEdge(src.getName() + ":" + dest.getName()), src,
                                                dest);
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                else
                {
                    final Factor destFact = getFactor(graph.getDest(pe));
                    if (destFact != null)
                    {
                        final Evaluation eval = getEvaluates(graph.getDest(edge));
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
                                            final Node src = measureMap.get(rank.getNormalizationMeasure());
                                            final Node dest = graph.getSource(pe);
                                            graph.addEdge(new NormalizationEdge(src.getName() + ":" + dest.getName()),
                                                    src, dest);
                                        }
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (edge instanceof ValueEdge)
            {

            }
        }
    }

    /**
     * @param modelMap
     * @param models
     */
    private void createModelMap(final Map<String, QualityModel> modelMap, final List<QualityModel> models)
    {
        for (final QualityModel model : models)
        {
            modelMap.put(model.getName(), model);
        }
    }

    /**
     * @param factorMap
     * @param measureMap
     * @param models
     */
    private void extractEvaluatedBy(final Map<String, Node> factorMap, final Map<String, Node> measureMap,
            final List<QualityModel> models)
    {
        for (final QualityModel model : models)
        {
            for (final AbstractQMEntity entity : model.getContained())
            {
                if (entity instanceof Evaluation)
                {
                    final Evaluation eval = (Evaluation) entity;
                    final FactorNode node = (FactorNode) factorMap.get(eval.getEvaluates());
                    node.setOwnedBy(eval.getId());
                    node.addEvaluatedBy(eval.getId());

                    for (final Ranking rank : eval.getRankings())
                    {
                        final String facId = rank.getFactor();
                        if (facId != null)
                        {
                            final FactorNode subnode = (FactorNode) factorMap.get(facId);
                            subnode.addEvaluatedBy(rank.getId());
                            subnode.addParent(node.getName());
                        }
                    }
                }
                else if (entity instanceof MeasurementMethod)
                {
                    final MeasurementMethod method = (MeasurementMethod) entity;
                    final MeasureNode node = (MeasureNode) measureMap.get(method.getDetermines());
                    if (node != null && method != null)
                        node.addEvaluatedBy(method.getId());
                }
            }
        }

        for (final Node n : graph.getVertices())
        {
            if (n instanceof FactorNode)
            {
                for (final Edge edge : graph.getOutEdges(n))
                {
                    ((FactorNode) n).addParent(((FactorNode) graph.getOpposite(n, edge)).getName());
                }
            }
        }
    }

    /**
     * @param factorMap
     * @param measureMap
     * @param models
     */
    private void extractFactorsAndMeasures(final Map<String, Node> factorMap, final Map<String, Node> measureMap,
            final List<QualityModel> models)
    {
        for (final QualityModel model : models)
        {
            for (final AbstractQMEntity entity : model.getContained())
            {
                if (entity instanceof Measure)
                {
                    final Measure measure = (Measure) entity;
                    MeasureNode node = null;
                    if (measure.getName() == null)
                    {
                        System.out.println(measure.getId());
                    }

                    if (measure.getType() != null && measure.getType().equals("qm:NormalizationMeasure"))
                    {
                        node = new NormalizationNode(graph, measure.getName(), measure.getId());
                    }
                    else
                    {
                        node = new MeasureNode(graph, measure.getName(), measure.getId());
                    }
                    node.setDescription(measure.getDescription());
                    measureMap.put(measure.getId(), node);
                }
                else if (entity instanceof Factor)
                {
                    final Factor factor = (Factor) entity;
                    final FactorNode node = new FactorNode(graph, factor.getName(), factor.getId());
                    node.setDescription(factor.getDescription());
                    factorMap.put(factor.getId(), node);
                }
            }
        }
    }

    private void extractValues(final Map<String, Node> valueMap, final List<QualityModel> models)
    {
        for (final QualityModel model : models)
        {
            for (final AbstractQMEntity entity : model.getContained())
            {
                if (entity instanceof MeasurementMethod)
                {
                    final MeasurementMethod mm = (MeasurementMethod) entity;
                    ValueNode node = null;
                    if (mm.getType().equals("qm:ManualInstrument"))
                    {
                        node = new ValueNode(graph, mm.getName(), mm.getId(), ValueNode.MANUAL);
                    }
                    else if (mm.getType().equals("qm:ToolBasedInstrument"))
                    {
                        node = new ValueNode(graph, mm.getMetric(), mm.getId(), mm.getTool());
                    }
                    else
                    {
                        node = new ValueNode(graph, mm.getName(), mm.getId(), ValueNode.UNION);
                    }
                    valueMap.put(mm.getId(), node);
                }
            }
        }
    }

    /**
     * @param modelMap
     * @param id
     * @return
     */
    private AbstractEntity findEntity(final Map<String, QualityModel> modelMap, final String id)
    {
        if (modelMap.isEmpty() || id == null)
        {
            return null;
        }

        AbstractEntity entity = null;

        if (id.contains("#"))
        {
            final String[] keys = id.split(".qm#");
            final String model = keys[0];
            entity = modelMap.get(model).find(id);
        }
        else
        {
            for (final QualityModel model : modelMap.values())
            {
                if (model.hasKey(id))
                {
                    entity = model.find(id);
                    break;
                }
            }
        }

        return entity;
    }

    /**
     * @param dest
     * @return
     */
    private Evaluation getEvaluates(final Node dest)
    {
        final AbstractEntity ent = findEntity(modelMap, dest.getOwnedBy());
        if (ent != null && ent instanceof Evaluation)
        {
            return (Evaluation) ent;
        }
        return null;
    }

    /**
     * @param source
     * @return
     */
    private Factor getFactor(final Node source)
    {
        final AbstractEntity ent = findEntity(modelMap, source.getOwnedBy());
        if (ent != null && ent instanceof Factor)
        {
            return (Factor) ent;
        }
        return null;
    }

    /**
     * @return
     */
    public DirectedSparseGraph<Node, Edge> getGraph()
    {
        return graph;
    }

    /**
     * @return the language
     */
    public String getLanguage()
    {
        return language;
    }

    /**
     * @param source
     * @return
     */
    private Measure getMeasure(final Node source)
    {
        final AbstractEntity ent = findEntity(modelMap, source.getOwnedBy());
        if (ent != null && ent instanceof Measure)
        {
            return (Measure) ent;
        }
        return null;
    }

    /**
     * @param args
     * @return
     */
    private List<QualityModel> readInQualityModels(final String... args)
    {
        final QMReader qmread = new QMReader();
        final List<QualityModel> models = new ArrayList<>();
        try
        {
            for (final String arg : args)
            {
                qmread.read(arg);
                models.add(qmread.getModel());
            }
        }
        catch (FileNotFoundException | XMLStreamException e)
        {
            e.printStackTrace();
        }
        return models;
    }

    private String[] selectQMFiles()
    {
        String[] retVal = null;
        Properties prop = new Properties();
        try
        {
            InputStream stream = this.getClass().getResourceAsStream("languages.properties");
            prop.load(stream);
            stream.close();

            retVal = ((String) prop.get(language)).split(",");
        }
        catch (final IOException e)
        {
            e.printStackTrace();
        }

        return retVal;
    }

    /**
     * @param language
     *            the language to set
     */
    public void setLanguage(final String language)
    {
        this.language = language;
    }

    /**
     * @param file
     */
    public void writeMetrics(final String file)
    {
        final Path path = Paths.get(file);
        try
        {
            MetricsFileWriter.write(graph, "Quality", path);
        }
        catch (final RootNotFoundException rnfe)
        {
            LOG.warn(rnfe.getMessage(), rnfe);
        }
    }

    /**
     * @param b
     */
    public void setVerbose(boolean b)
    {
        this.verbose = b;
    }
}
