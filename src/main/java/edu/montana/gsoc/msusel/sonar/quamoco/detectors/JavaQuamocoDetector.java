/**
 * The MIT License (MIT)
 *
 * MSUSEL Sonar Quamoco Plugin
 * Copyright (c) 2015-2017 Montana State University, Gianforte School of Computing,
 * Software Engineering Laboratory
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
package edu.montana.gsoc.msusel.sonar.quamoco.detectors;

import edu.montana.gsoc.msusel.quamoco.graph.edge.Edge;
import edu.montana.gsoc.msusel.quamoco.graph.node.Node;
import edu.montana.gsoc.msusel.quamoco.processor.MetricsContext;
import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * Quamoco Issue detector for the Java language.
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class JavaQuamocoDetector extends QuamocoDetector {

    /**
     * Constructs a new CSharpQuamocoDetector which can be used to detect
     * Quamoco issues for C# language files.
     * 
     * @param graph
     *            The Quamoco execution graph
     * @param context
     *            The MetricsContext which will be used to provide the code tree
     * @param projectID
     *            The current Project's ID
     */
    public JavaQuamocoDetector(final DirectedSparseGraph<Node, Edge> graph, final MetricsContext context,
            final String projectID)
    {
        super(graph, context, projectID);
    }

    /**
     * Initiates a detector for insufficient comments for Java Methods
     */
    public void insufficientComment()
    {

    }

    /**
     * Initiates a detector for missing documentation of Java Methods, Classes,
     * and Files
     */
    public void missingDocumentation()
    {

    }

    /**
     * Initiates a detector for clones in Java Source Files
     */
    public void cloneDetection()
    {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute()
    {
        super.execute();

        insufficientComment();
        missingDocumentation();
        cloneDetection();
    }
}
