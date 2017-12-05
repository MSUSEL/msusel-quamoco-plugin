package edu.montana.gsoc.msusel.codetree.sonar.quamoco.detectors;

import edu.montana.gsoc.msusel.quamoco.graph.edge.Edge;
import edu.montana.gsoc.msusel.quamoco.processor.MetricsContext;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;
import com.sparqline.codetree.CodeTree;
import edu.montana.gsoc.msusel.quamoco.graph.node.Node;

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
        final MutableNetwork<Node, Edge> graph = NetworkBuilder.directed().build();
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