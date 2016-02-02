package net.siliconcode.quamoco.processor;

import org.junit.*;
import net.siliconcode.quamoco.graph.INode;
import static org.junit.Assert.*;

/**
 * The class <code>AggregatorFactoryTest</code> contains tests for the class <code>{@link AggregatorFactory}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class AggregatorFactoryTest {
    /**
     * Run the ProcessorFactory getInstance() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testGetInstance_1()
        throws Exception
    {
        ProcessorFactory result = AggregatorFactory.getInstance();
        ProcessorFactory result2 = AggregatorFactory.getInstance();

        // add additional test code here
        assertNotNull(result);
        assertNotNull(result2);
        assertSame(result, result2);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Before
    public void setUp()
        throws Exception
    {
        // add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @After
    public void tearDown()
        throws Exception
    {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(AggregatorFactoryTest.class);
    }
}