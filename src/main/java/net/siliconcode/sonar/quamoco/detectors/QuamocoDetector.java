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
package net.siliconcode.sonar.quamoco.detectors;

import com.sparqline.quamoco.MetricNames;
import com.sparqline.quamoco.codetree.FileNode;
import com.sparqline.quamoco.codetree.MethodNode;
import com.sparqline.quamoco.codetree.ProjectNode;
import com.sparqline.quamoco.graph.edge.Edge;
import com.sparqline.quamoco.graph.node.Node;
import com.sparqline.quamoco.processor.MetricsContext;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * QuamocoDetector -
 *
 * @author Isaac Griffith
 */
public abstract class QuamocoDetector {

    protected DirectedSparseGraph<Node, Edge> graph;
    protected MetricsContext                  context;
    protected String                          projectID;

    /**
     * @param graph
     * @param context
     * @param tree
     */
    public QuamocoDetector(final DirectedSparseGraph<Node, Edge> graph, final MetricsContext context,
            final String projectID) {
        this.graph = graph;
        this.context = context;
        this.projectID = projectID;
    }

    /**
     *
     */
    public void overlyLongFile() {
        ProjectNode pn = context.getTree().findProject(projectID);
        if (pn != null) {
            for (final FileNode file : pn.getFiles()) {
                if (file.getMetric(MetricNames.LOC) > 300) {
                    // create new findings node
                }
            }
        }
    }

    /**
     *
     */
    public void nestingDepthExceeded() {
        ProjectNode pn = context.getTree().findProject(projectID);

        for (final MethodNode method : pn.getMethods()) {
            if (method.getMetric(MetricNames.MAXNESTING) > 3) {
                // create new findings node
            }
        }
    }

    /**
     *
     */
    public void execute() {
        //overlyLongFile();
        //nestingDepthExceeded();
    }
}
