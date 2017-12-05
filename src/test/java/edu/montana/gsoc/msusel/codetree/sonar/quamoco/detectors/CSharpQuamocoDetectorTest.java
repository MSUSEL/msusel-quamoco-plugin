package edu.montana.gsoc.msusel.codetree.sonar.quamoco.detectors;

import edu.montana.gsoc.msusel.quamoco.graph.edge.Edge;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sparqline.codetree.CodeTree;
import edu.montana.gsoc.msusel.quamoco.graph.node.Node;
import edu.montana.gsoc.msusel.quamoco.processor.MetricsContext;

import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;

/**
 * The class <code>CSharpQuamocoDetectorTest</code> contains tests for the class
 * <code>{@link CSharpQuamocoDetector}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class CSharpQuamocoDetectorTest {
    /**
     * Run the CSharpQuamocoDetector(MutableNetwork
     * <Node,Edge>,MetricsContext,CodeTree) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testCSharpQuamocoDetector_1() throws Exception
    {
        final MutableNetwork<Node, Edge> graph = NetworkBuilder.directed().build();
        final MetricsContext context = MetricsContext.getInstance();
        final CodeTree tree = new CodeTree();

        final CSharpQuamocoDetector result = new CSharpQuamocoDetector(graph, context, "");

        // add additional test code here
        Assert.assertNotNull(result);
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
        // add additional set up code here
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
        new org.junit.runner.JUnitCore().run(CSharpQuamocoDetectorTest.class);
    }
}