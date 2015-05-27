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
package net.siliconcode.quamoco.aggregator.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import net.siliconcode.quamoco.aggregator.strategy.EvaluationStrategy;

import org.apache.commons.lang3.StringEscapeUtils;

import com.google.common.collect.Lists;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * FactorNode -
 *
 * @author Isaac Griffith
 */
public class FactorNode extends Node {

    public static final String ONE     = "One";
    public static final String MEAN    = "Mean";
    public static final String RANKING = "Ranking";
    private String             description;
    private final Set<String>  evaluatedBy;
    private final Set<String>  parents;
    // private Evaluator evaluator;
    private String             method;
    private EvaluationStrategy strategy;

    /**
     * @param graph
     * @param name
     * @param owner
     */
    public FactorNode(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner)
    {
        super(graph, name, owner);
        evaluatedBy = new HashSet<>();
        parents = new HashSet<>();
    }

    public FactorNode(final DirectedSparseGraph<Node, Edge> graph, final String name, final String owner, final long id)
    {
        super(graph, name, owner, id);
        evaluatedBy = new HashSet<>();
        parents = new HashSet<>();
    }

    public void addEvaluatedBy(final String evaluated)
    {
        if (evaluated == null || evaluatedBy.contains(evaluated))
        {
            return;
        }

        evaluatedBy.add(evaluated);
    }

    public void addParent(final String parent)
    {
        if (parent == null)
        {
            return;
        }

        parents.add(parent);
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    public Set<String> getEvaluatedBy()
    {
        return evaluatedBy;
    }

    /**
     * @return
     */
    public EvaluationStrategy getEvaluator()
    {
        return strategy;
    }

    /**
     * @return
     */
    public String getMethod()
    {
        return method;
    }

    public Set<String> getParents()
    {
        return parents;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.distiller.Node#getValue()
     */
    @Override
    public double getValue()
    {
        final List<Double> values = Lists.newArrayList();
        for (final Edge e : graph.getInEdges(this))
        {
            final Node n = graph.getOpposite(this, e);
            if (n instanceof ValueNode)
            {
                values.add(n.getValue());
            }
        }
        final double value = strategy.evaluate(values.toArray(new Double[0]));
        if (Double.compare(value, 1.0) > 0)
        {
            return 1.0;
        }
        else if (Double.compare(value, 0.0) < 0)
        {
            return 0.0;
        }
        else
        {
            return value;
        }
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.distiller.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        final StringBuilder builder = new StringBuilder();
        builder.append(String.format("<nodes name=\"%s\" description=\"%s\" id=\"%d\" owner=\"%s\" type=\"FACTOR\">\n",
                StringEscapeUtils.escapeXml10(name), StringEscapeUtils.escapeXml10(description), id, ownedBy));
        for (final String eval : evaluatedBy)
        {
            builder.append(String.format("\t\t<evaluatedBy id=\"%s\" />\n", eval));
        }
        builder.append("\t</nodes>");
        return builder.toString();
    }

    public void removeEvaluatedBy(final String evaluated)
    {
        if (evaluated == null || !evaluatedBy.contains(evaluated))
        {
            return;
        }

        evaluatedBy.remove(evaluated);
    }

    // /**
    // * @param eval
    // */
    // public void setEvaluator(Evaluator eval)
    // {
    // // TODO Auto-generated method stub
    //
    // }

    public void removeParent(final String parent)
    {
        if (parent == null || !parents.contains(parent))
        {
            return;
        }

        parents.remove(parent);
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(final String description)
    {
        if (description == null)
        {
            this.description = "";
        }
        else
        {
            this.description = description;
        }
    }

    /**
     * @param singleMeasureEvaluationStrategy
     */
    public void setEvaluator(final EvaluationStrategy strategy)
    {
        this.strategy = strategy;
    }

    /**
     * @param method
     */
    public void setMethod(final String method)
    {
        this.method = method;
    }

    // /**
    // * @return
    // */
    // public Evaluator getEvaluator()
    // {
    // return evaluator;
    // }
}
