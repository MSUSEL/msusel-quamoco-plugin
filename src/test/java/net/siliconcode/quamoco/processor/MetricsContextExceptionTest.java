package net.siliconcode.quamoco.processor;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * The class <code>MetricsContextExceptionTest</code> contains tests for the
 * class <code>{@link MetricsContextException}</code>.
 *
 * @generatedBy CodePro at 1/26/16 8:05 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class MetricsContextExceptionTest {
	/**
	 * Run the MetricsContextException() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 8:05 PM
	 */
	@Test
	public void testMetricsContextException_1() throws Exception {

		MetricsContextException result = new MetricsContextException();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("net.siliconcode.quamoco.processor.MetricsContextException", result.toString());
		assertEquals(null, result.getMessage());
		assertEquals(null, result.getLocalizedMessage());
	}

	/**
	 * Run the MetricsContextException(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 8:05 PM
	 */
	@Test
	public void testMetricsContextException_2() throws Exception {
		String message = "";

		MetricsContextException result = new MetricsContextException(message);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getCause());
		assertEquals("net.siliconcode.quamoco.processor.MetricsContextException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the MetricsContextException(Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 8:05 PM
	 */
	@Test
	public void testMetricsContextException_3() throws Exception {
		Throwable cause = new Throwable();

		MetricsContextException result = new MetricsContextException(cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.siliconcode.quamoco.processor.MetricsContextException: java.lang.Throwable",
				result.toString());
		assertEquals("java.lang.Throwable", result.getMessage());
		assertEquals("java.lang.Throwable", result.getLocalizedMessage());
	}

	/**
	 * Run the MetricsContextException(String,Throwable) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 8:05 PM
	 */
	@Test
	public void testMetricsContextException_4() throws Exception {
		String message = "";
		Throwable cause = new Throwable();

		MetricsContextException result = new MetricsContextException(message, cause);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.siliconcode.quamoco.processor.MetricsContextException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Run the MetricsContextException(String,Throwable,boolean,boolean)
	 * constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 8:05 PM
	 */
	@Test
	public void testMetricsContextException_5() throws Exception {
		String message = "";
		Throwable cause = new Throwable();
		boolean enableSuppression = true;
		boolean writableStackTrace = true;

		MetricsContextException result = new MetricsContextException(message, cause, enableSuppression,
				writableStackTrace);

		// add additional test code here
		assertNotNull(result);
		assertEquals("net.siliconcode.quamoco.processor.MetricsContextException: ", result.toString());
		assertEquals("", result.getMessage());
		assertEquals("", result.getLocalizedMessage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/26/16 8:05 PM
	 */
	@Before
	public void setUp() throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 1/26/16 8:05 PM
	 */
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 *
	 * @generatedBy CodePro at 1/26/16 8:05 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MetricsContextExceptionTest.class);
	}
}