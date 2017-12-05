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
package edu.montana.gsoc.msusel.codetree.sonar.quamoco.computestates;

import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.graph.MutableNetwork;
import edu.montana.gsoc.msusel.codetree.sonar.quamoco.detectors.QuamocoDetector;
import edu.montana.gsoc.msusel.codetree.sonar.quamoco.detectors.CSharpQuamocoDetector;
import edu.montana.gsoc.msusel.quamoco.graph.edge.Edge;
import edu.montana.gsoc.msusel.quamoco.processor.MetricsContext;
import edu.montana.gsoc.msusel.quamoco.graph.node.Node;
import com.sparqline.sonar.base.BaseComputeState;

/**
 * C# Langauge extension to the QuamocoMeasureComputer
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class CSharpComputeState extends BaseComputeState {

    /**
     * Language key constant
     */
    public static final String  LANG = "cs";
    /**
     * Language file extension constant
     */
    private static final String EXT  = ".cs";

    /**
     * Construct a new CSharpComputeState
     */
    public CSharpComputeState()
    {
        super();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void executeDetector(MutableNetwork<Node, Edge> graph, MetricsContext metricsContext, String projectID)
    {
        final QuamocoDetector qd = new CSharpQuamocoDetector(graph, metricsContext, projectID);
        qd.execute();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getExtension()
    {
        return CSharpComputeState.EXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected List<String> getRepoNames()
    {
        final List<String> list = Lists.newArrayList();
        list.add("fxcop");
        list.add("stylecop");
        list.add("common-cs");
        list.add("csharpsquid");
        return list;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String langKey()
    {
        return CSharpComputeState.LANG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<Class, String> qmFileLocs()
    {
        Map<Class, String> map = ImmutableMap.<Class, String> builder()
                .put(this.getClass(), "root.qm")
                .put(this.getClass(), "object.qm")
                .put(this.getClass(), "csharp.qm")
                .build();

        return map;
    }
}
