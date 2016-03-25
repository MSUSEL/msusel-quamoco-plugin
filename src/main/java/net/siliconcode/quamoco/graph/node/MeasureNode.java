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

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringEscapeUtils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.RankedEdge;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.Extent;
import net.siliconcode.quamoco.processor.FindingsAggregator;
import net.siliconcode.quamoco.processor.Normalizer;

/**
 * MeasureNode -
 *
 * @author Isaac Griffith
 */
public class MeasureNode extends Node {

    private boolean                                normalized;
    private String                                 type;
    private String                                 method;
    private Set<Finding>                           findings;
    private final Map<String, Map<String, Double>> extents;

    /**
     * @param graph
     * @param name
     * @param owner
     */
    public MeasureNode(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner) {
        super(graph, name, owner);
        extents = Maps.newHashMap();
        type = MeasureType.FINDINGS;
    }

    public MeasureNode(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner,
            final long id) {
        super(graph, name, owner, id);
        extents = Maps.newHashMap();
        type = MeasureType.FINDINGS;
    }

    /**
     * @return
     */
    public String getMethod() {
        return method;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.siliconcode.quamoco.swing.distiller.Node#getValue()
     */
    @Override
    public double getValue() {
        if (type.equals(MeasureType.NUMBER)) {
            if (Double.isInfinite(value)) {
                value = processor.process();
            }

            return value;
        }

        return Double.NEGATIVE_INFINITY;
    }

    /*
     * (non-Javadoc)
     *
     * @see net.siliconcode.quamoco.swing.distiller.Node#getXMLTag()
     */
    @Override
    public String getXMLTag() {
        final StringBuilder builder = new StringBuilder();
        builder.append(String.format("<nodes name=\"%s\" description=\"%s\" id=\"%d\" owner=\"%s\" type=\"MEASURE\">\n",
                StringEscapeUtils.escapeXml10(name), StringEscapeUtils.escapeXml10(description), id, ownedBy));
        builder.append("\t</nodes>");
        return builder.toString();
    }

    /**
     * @return the normalized
     */
    public boolean isNormalized() {
        return normalized;
    }

    /**
     * @param method
     *            the method to set
     */
    public void setMethod(final String method) {
        this.method = method;
    }

    /**
     * @param normalized
     *            the normalized to set
     */
    public void setNormalized(final boolean normalized) {
        this.normalized = normalized;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * @return
     */
    public Set<Finding> aggregateFindings() {
        if (type.equals(MeasureType.FINDINGS)) {
            return ((FindingsAggregator) processor).processFindings();
        }

        return new HashSet<Finding>();
    }

    /**
     * @return
     */
    public Set<Finding> getFindings() {
        if (findings == null) {
            findings = aggregateFindings();
        }

        return findings;
    }

    /**
     * @param metric
     * @param range
     * @return
     */
    @Override
    public double getExtent(final String metric, final NormalizationRange range) {
        if (extents.containsKey(range.toString())) {
            if (extents.get(range.toString()).containsKey(metric)) {
                return extents.get(range.toString()).get(metric);
            }
        }

        final double extent = Extent.getInstance().findMeasureExtent(metric, range, this);
        addExtent(range.toString(), metric, extent);

        return extent;
    }

    /**
     * @param string
     * @param metric
     * @param extent
     */
    public void addExtent(final String level, final String metric, final double extent) {
        if (level == null || level.isEmpty() || metric == null || metric.isEmpty() || Double.isInfinite(value)) {
            return;
        }

        if (extents.containsKey(level)) {
            final Map<String, Double> map = extents.get(level);
            map.put(metric, value);
        }
        else {
            final Map<String, Double> map = Maps.newHashMap();
            map.put(metric, value);
            extents.put(level, map);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see net.siliconcode.quamoco.graph.INode#getLowerResult()
     */
    @Override
    public double getLowerResult() {
        final List<Double> values = Lists.newArrayList();

        if (type.equals(MeasureType.FINDINGS)) {
            for (final Edge e : graph.getInEdges(this)) {
                final Node n = graph.getOpposite(this, e);
                if (e instanceof RankedEdge) {
                    final RankedEdge we = (RankedEdge) e;
                    final Normalizer norm = we.getNormalizer();

                    values.add(n.getExtent(norm.getMetric(), norm.getNormalizationRange()));
                }
            }
        }
        else {
            for (final Edge e : graph.getInEdges(this)) {
                final Node n = graph.getOpposite(this, e);
                n.getValue();
            }
        }

        return values.isEmpty() ? 0 : Collections.min(values);
    }

    /*
     * (non-Javadoc)
     *
     * @see net.siliconcode.quamoco.graph.INode#getUpperResult()
     */
    @Override
    public double getUpperResult() {
        final List<Double> values = Lists.newArrayList();

        if (type.equals(MeasureType.FINDINGS)) {
            for (final Edge e : graph.getInEdges(this)) {
                final Node n = graph.getOpposite(this, e);
                if (e instanceof RankedEdge) {
                    final RankedEdge we = (RankedEdge) e;
                    final Normalizer norm = we.getNormalizer();

                    values.add(n.getExtent(norm.getMetric(), norm.getNormalizationRange()));
                }
            }
        }
        else {
            for (final Edge e : graph.getInEdges(this)) {
                final Node n = graph.getOpposite(this, e);
                n.getValue();
            }
        }

        return values.isEmpty() ? 0 : Collections.max(values);
    }
}
