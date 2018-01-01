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
package edu.montana.gsoc.msusel.sonar.quamoco.detectors;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.montana.gsoc.msusel.CodeTree;
import edu.montana.gsoc.msusel.quamoco.graph.edge.Edge;
import edu.montana.gsoc.msusel.quamoco.graph.node.Node;
import edu.montana.gsoc.msusel.quamoco.processor.MetricsContext;
import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * The class <code>QuamocoDetectorTest</code> contains tests for the class
 * <code>{@link QuamocoDetector}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class QuamocoDetectorTest {

    private QuamocoDetector fixture;

    /**
     * Run the void execute() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testExecute_1() throws Exception
    {
        fixture.execute();

        // add additional test code here
        Assert.fail("unverified");
    }

    /**
     * Run the void nestingDepthExceeded() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testNestingDepthExceeded_1() throws Exception
    {
        fixture.nestingDepthExceeded();

        // add additional test code here
        Assert.fail("unverified");
    }

    /**
     * Run the void nestingDepthExceeded() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testNestingDepthExceeded_2() throws Exception
    {
        fixture.nestingDepthExceeded();

        // add additional test code here
        Assert.fail("unverified");
    }

    /**
     * Run the void nestingDepthExceeded() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testNestingDepthExceeded_3() throws Exception
    {
        fixture.nestingDepthExceeded();

        // add additional test code here
        Assert.fail("unverified");
    }

    /**
     * Run the void nestingDepthExceeded() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testNestingDepthExceeded_4() throws Exception
    {
        fixture.nestingDepthExceeded();

        // add additional test code here
        Assert.fail("unverified");
    }

    /**
     * Run the void overlyLongFile() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testOverlyLongFile_1() throws Exception
    {
        fixture.overlyLongFile();

        // add additional test code here
        Assert.fail("unverified");
    }

    /**
     * Run the void overlyLongFile() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testOverlyLongFile_2() throws Exception
    {
        fixture.overlyLongFile();

        // add additional test code here
        Assert.fail("unverified");
    }

    /**
     * Run the void overlyLongFile() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testOverlyLongFile_3() throws Exception
    {
        fixture.overlyLongFile();

        // add additional test code here
        Assert.fail("unverified");
    }

    /**
     * Run the void overlyLongFile() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testOverlyLongFile_4() throws Exception
    {
        fixture.overlyLongFile();

        // add additional test code here
        Assert.fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Before
    public void setUp() throws Exception
    {
        final CodeTree tree = new CodeTree();
        final MetricsContext context = MetricsContext.getInstance();
        final DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        fixture = new CSharpQuamocoDetector(graph, context, "");
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @After
    public void tearDown() throws Exception
    {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args
     *            the command line arguments
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    public static void main(final String[] args)
    {
        new org.junit.runner.JUnitCore().run(QuamocoDetectorTest.class);
    }
}