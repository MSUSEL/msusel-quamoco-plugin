package net.siliconcode.quamoco.io;

import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.distiller.Measure;

/**
 * The class <code>MetricPropertiesReaderTest</code> contains tests for the
 * class <code>{@link MetricPropertiesReader}</code>.
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
	public void testRead_1() throws Exception {

		final Map<String, Measure> result = MetricPropertiesReader.read();

		// TODO: add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(14, result.size());
		Assert.assertTrue(result.containsKey("Functional Correctness"));
		Assert.assertTrue(result.containsKey("Reusability"));
		Assert.assertTrue(result.containsKey("Testability"));
		Assert.assertTrue(result.containsKey("Performance Efficiency"));
		Assert.assertTrue(result.containsKey("Analyzability"));
		Assert.assertTrue(result.containsKey("Portability"));
		Assert.assertTrue(result.containsKey("Maintainability"));
		Assert.assertTrue(result.containsKey("Resource Utilization"));
		Assert.assertTrue(result.containsKey("Security"));
		Assert.assertTrue(result.containsKey("Time Behavior"));
		Assert.assertTrue(result.containsKey("Quality"));
		Assert.assertTrue(result.containsKey("Modifiability"));
		Assert.assertTrue(result.containsKey("Functional Suitability"));
		Assert.assertTrue(result.containsKey("Reliability"));
	}

	/**
	 * Run the Map<String, Measure> read() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/30/15 3:42 PM
	 */
	@Test
	public void testRead_2() throws Exception {

		final Map<String, Measure> result = MetricPropertiesReader.read();

		// TODO: add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(14, result.size());
		Assert.assertTrue(result.containsKey("Functional Correctness"));
		Assert.assertTrue(result.containsKey("Reusability"));
		Assert.assertTrue(result.containsKey("Testability"));
		Assert.assertTrue(result.containsKey("Performance Efficiency"));
		Assert.assertTrue(result.containsKey("Analyzability"));
		Assert.assertTrue(result.containsKey("Portability"));
		Assert.assertTrue(result.containsKey("Maintainability"));
		Assert.assertTrue(result.containsKey("Resource Utilization"));
		Assert.assertTrue(result.containsKey("Security"));
		Assert.assertTrue(result.containsKey("Time Behavior"));
		Assert.assertTrue(result.containsKey("Quality"));
		Assert.assertTrue(result.containsKey("Modifiability"));
		Assert.assertTrue(result.containsKey("Functional Suitability"));
		Assert.assertTrue(result.containsKey("Reliability"));
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/30/15 3:42 PM
	 */
	@Before
	public void setUp() throws Exception {
		// TODO: add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/30/15 3:42 PM
	 */
	@After
	public void tearDown() throws Exception {
		// TODO: add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 *
	 * @generatedBy CodePro at 5/30/15 3:42 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(MetricPropertiesReaderTest.class);
	}
}