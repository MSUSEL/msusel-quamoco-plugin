package net.siliconcode.quamoco.io;

import java.util.Map;
import org.junit.*;
import static org.junit.Assert.*;

import net.siliconcode.quamoco.distiller.Measure;
import net.siliconcode.quamoco.io.MetricPropertiesReader;

/**
 * The class <code>MetricPropertiesReaderTest</code> contains tests for the class <code>{@link MetricPropertiesReader}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:42 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class MetricPropertiesReaderTest {
    /**
     * Run the Map<String, Measure> read() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testRead_1()
        throws Exception
    {

        Map<String, Measure> result = MetricPropertiesReader.read();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(14, result.size());
        assertTrue(result.containsKey("Functional Correctness"));
        assertTrue(result.containsKey("Reusability"));
        assertTrue(result.containsKey("Testability"));
        assertTrue(result.containsKey("Performance Efficiency"));
        assertTrue(result.containsKey("Analyzability"));
        assertTrue(result.containsKey("Portability"));
        assertTrue(result.containsKey("Maintainability"));
        assertTrue(result.containsKey("Resource Utilization"));
        assertTrue(result.containsKey("Security"));
        assertTrue(result.containsKey("Time Behavior"));
        assertTrue(result.containsKey("Quality"));
        assertTrue(result.containsKey("Modifiability"));
        assertTrue(result.containsKey("Functional Suitability"));
        assertTrue(result.containsKey("Reliability"));
    }

    /**
     * Run the Map<String, Measure> read() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testRead_2()
        throws Exception
    {

        Map<String, Measure> result = MetricPropertiesReader.read();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(14, result.size());
        assertTrue(result.containsKey("Functional Correctness"));
        assertTrue(result.containsKey("Reusability"));
        assertTrue(result.containsKey("Testability"));
        assertTrue(result.containsKey("Performance Efficiency"));
        assertTrue(result.containsKey("Analyzability"));
        assertTrue(result.containsKey("Portability"));
        assertTrue(result.containsKey("Maintainability"));
        assertTrue(result.containsKey("Resource Utilization"));
        assertTrue(result.containsKey("Security"));
        assertTrue(result.containsKey("Time Behavior"));
        assertTrue(result.containsKey("Quality"));
        assertTrue(result.containsKey("Modifiability"));
        assertTrue(result.containsKey("Functional Suitability"));
        assertTrue(result.containsKey("Reliability"));
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
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
     * @generatedBy CodePro at 5/30/15 3:42 PM
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
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(MetricPropertiesReaderTest.class);
    }
}