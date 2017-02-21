/**
 * The MIT License (MIT)
 *
 * SparQLine Analytics Sonar Quamoco Plugin
 * Copyright (c) 2015-2017 Isaac Griffith, SparQLine Analytics, LLC
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
package com.sparqline.sonar.quamoco.detectors;

import com.sparqline.codetree.node.ProjectNode;
import com.sparqline.quamoco.graph.edge.Edge;
import com.sparqline.quamoco.graph.node.Node;
import com.sparqline.quamoco.processor.MetricsContext;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * Quamoco issue detector class.
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
public abstract class QuamocoDetector {

    /**
     * The Quamoco execution graph in which the issues are to be attached
     */
    protected DirectedSparseGraph<Node, Edge> graph;
    /**
     * The metrics context providing access to the CodeTree
     */
    protected MetricsContext                  context;
    /**
     * The project ID of the current project
     */
    protected String                          projectID;

    /**
     * Constructs a new QuamocoDetector which can be used to detect
     * Quamoco issues.
     * 
     * @param graph
     *            The Quamoco execution graph
     * @param context
     *            The MetricsContext which will be used to provide the code tree
     * @param projectID
     *            The current Project's ID
     */
    public QuamocoDetector(final DirectedSparseGraph<Node, Edge> graph, final MetricsContext context,
            final String projectID)
    {
        this.graph = graph;
        this.context = context;
        this.projectID = projectID;
    }

    /**
     * Detects an Overly Long File based on LOC and a threshold.
     */
    public void overlyLongFile()
    {
        ProjectNode pn = context.getTree().getUtils().findProject(projectID);
        if (pn != null)
        {
            // for (final FileNode file : pn.getFiles())
            // {
            // if (file.getMetric(SLOC.getInstance(null, null).getAcronym())
            // > 300)
            // {
            // // create new findings node
            // }
            // }
        }
    }

    /**
     * Detects when a method has exceeded a threshold of nesting depth
     */
    public void nestingDepthExceeded()
    {
        ProjectNode pn = context.getTree().getUtils().findProject(projectID);

        // for (final MethodNode method : pn.getMethods())
        // {
        // if (method.getMetric(MetricNames.MAXNESTING) > 3)
        // {
        // // create new findings node
        // }
        // }
    }

    /**
     * Executes the methods comprising the detectors. This method should be
     * called by all overriding methods in language specific subclasses.
     */
    public void execute()
    {
        // overlyLongFile();
        // nestingDepthExceeded();
    }
}
