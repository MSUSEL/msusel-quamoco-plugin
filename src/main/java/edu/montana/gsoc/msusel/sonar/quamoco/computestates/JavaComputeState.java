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
package edu.montana.gsoc.msusel.sonar.quamoco.computestates;

import java.util.List;

import com.google.common.collect.Lists;

import edu.montana.gsoc.msusel.quamoco.graph.edge.Edge;
import edu.montana.gsoc.msusel.quamoco.graph.node.Node;
import edu.montana.gsoc.msusel.quamoco.processor.MetricsContext;
import edu.montana.gsoc.msusel.sonar.quamoco.QuamocoComputeState;
import edu.montana.gsoc.msusel.sonar.quamoco.detectors.JavaQuamocoDetector;
import edu.montana.gsoc.msusel.sonar.quamoco.detectors.QuamocoDetector;
import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * Java Language extension to the QuamocoMeasureComputer
 * 
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class JavaComputeState extends QuamocoComputeState {

    /**
     * Java language key
     */
    public static final String  LANG = "java";
    /**
     * Java file extension
     */
    private static final String EXT  = ".java";

    /**
     * Construct a new JavaComputeState
     */
    public JavaComputeState()
    {
        super();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void executeQuamocoDetector(DirectedSparseGraph<Node, Edge> graph, MetricsContext metricsContext,
            String projectID)
    {
        final QuamocoDetector qd = new JavaQuamocoDetector(graph, metricsContext, projectID);
        qd.execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getExtension()
    {
        return JavaComputeState.EXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<String> getRepoNames()
    {
        final List<String> list = Lists.newArrayList();
        list.add("findbugs");
        list.add("fb-contrib");
        list.add("pmd");
        list.add("common-java");
        list.add("findsecbugs");
        return list;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String langKey()
    {
        return JavaComputeState.LANG;
    }
}
