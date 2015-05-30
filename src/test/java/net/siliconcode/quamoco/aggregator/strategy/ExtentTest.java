package net.siliconcode.quamoco.aggregator.strategy;

import org.junit.*;
import static org.junit.Assert.*;
import net.siliconcode.sonar.quamoco.MetricsContext;

/**
 * The class <code>ExtentTest</code> contains tests for the class <code>{@link Extent}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:43 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class ExtentTest {
    /**
     * Run the Extent() constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testExtent_1()
        throws Exception
    {

        Extent result = new Extent();

        // TODO: add additional test code here
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the void findExtent(String,String,MetricsContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testFindExtent_1()
        throws Exception
    {
        Extent fixture = new Extent();
        String metric = "";
        String range = "";
        MetricsContext context = new MetricsContext();

        fixture.findExtent(metric, range, context);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
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
     * @generatedBy CodePro at 5/30/15 3:43 PM
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
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(ExtentTest.class);
    }
}