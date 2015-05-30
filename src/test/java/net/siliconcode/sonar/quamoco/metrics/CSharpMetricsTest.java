package net.siliconcode.sonar.quamoco.metrics;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.sonar.api.measures.Metric;

/**
 * The class <code>CSharpMetricsTest</code> contains tests for the class <code>{@link CSharpMetrics}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:45 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class CSharpMetricsTest {
    /**
     * Run the CSharpMetrics() constructor test.
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testCSharpMetrics_1()
        throws Exception
    {
        CSharpMetrics result = new CSharpMetrics();
        assertNotNull(result);
        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the Metric getMetric(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testGetMetric_1()
        throws Exception
    {
        String name = "";

        Metric result = CSharpMetrics.getMetric(name);

        // TODO: add additional test code here
        assertEquals(null, result);
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
        CSharpMetrics fixture = new CSharpMetrics();

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
        new org.junit.runner.JUnitCore().run(CSharpMetricsTest.class);
    }
}