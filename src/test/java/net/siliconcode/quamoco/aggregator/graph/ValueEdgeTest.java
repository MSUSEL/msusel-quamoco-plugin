package net.siliconcode.quamoco.aggregator.graph;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ValueEdgeTest</code> contains tests for the class <code>{@link ValueEdge}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class ValueEdgeTest {
    /**
     * Run the ValueEdge(String) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testValueEdge_1()
        throws Exception
    {
        String name = "";

        ValueEdge result = new ValueEdge(name);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("Edge: 0", result.toString());
        assertEquals("", result.getName());
        assertEquals(0L, result.getId());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Before
    public void setUp()
        throws Exception
    {
        // TODO: add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @After
    public void tearDown()
        throws Exception
    {
        // TODO: add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(ValueEdgeTest.class);
    }
}