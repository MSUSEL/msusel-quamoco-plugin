package net.siliconcode.sonar.quamoco.metrics;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.sonar.api.measures.Metric;

/**
 * The class <code>JavaMetricsTest</code> contains tests for the class <code>{@link JavaMetrics}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:45 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class JavaMetricsTest {
    /**
     * Run the JavaMetrics() constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testJavaMetrics_1()
        throws Exception
    {

        JavaMetrics result = new JavaMetrics();

        // TODO: add additional test code here
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the List<Metric> getMetrics() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testGetMetrics_1()
        throws Exception
    {
        JavaMetrics fixture = new JavaMetrics();

        List<Metric> result = fixture.getMetrics();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(6, result.size());
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
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
     * @generatedBy CodePro at 5/30/15 3:45 PM
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
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(JavaMetricsTest.class);
    }
}