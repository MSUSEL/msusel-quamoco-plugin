package net.siliconcode.quamoco.aggregator.graph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>NormalizationEdgeTest</code> contains tests for the class
 * <code>{@link NormalizationEdge}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class NormalizationEdgeTest {

    /**
     * Run the NormalizationEdge(String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testNormalizationEdge_1() throws Exception
    {
        String name = "";

        NormalizationEdge result = new NormalizationEdge(name);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("", result.getName());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Before
    public void setUp() throws Exception
    {
        // TODO: add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @After
    public void tearDown() throws Exception
    {
        // TODO: add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args
     *            the command line arguments
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(NormalizationEdgeTest.class);
    }
}