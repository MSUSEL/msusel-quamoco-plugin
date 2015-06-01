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

import javax.annotation.Nullable;

import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.qm.QualityModel;

import org.sonar.api.batch.DecoratorContext;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * DistilledGraphCreator - builds the Quamoco processing graph.
 *
 * @author Isaac Griffith
 */
public class DistilledGraphCreator {

    /**
     * Constructor
     */
    public DistilledGraphCreator()
    {
    }

    /**
     * Builder method to initialize and modify the graph based on data from the
     * known quality models.
     * 
     * @param models
     *            List of known quality models.
     * @param context
     *            Decorator context.
     * @return Graph constructed from information contained within the provided
     *         QualityModels and DecoratorContext.
     */
    public DirectedSparseGraph<Node, Edge> buildGraph(final List<QualityModel> models,
            @Nullable final DecoratorContext context)
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        final GraphModifier nodepop = new NodePopulator(); // TODO replace with
        // injection
        final GraphModifier edgepop = new EdgePopulator(); // TODO replace with
        // injection
        final GraphModifier aggrpop = new AggregatorPopulator(context);

        final DistillerData data = new DistillerData(models);
        nodepop.modifyGraph(data, graph);
        edgepop.modifyGraph(data, graph);
        aggrpop.modifyGraph(data, graph);

        return graph;
    }
}
