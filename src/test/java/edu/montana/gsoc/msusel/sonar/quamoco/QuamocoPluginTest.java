package edu.montana.gsoc.msusel.sonar.quamoco;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.Extension;

/**
 * The class <code>QuamocoPluginTest</code> contains tests for the class
 * <code>{@link QuamocoPlugin}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:44 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QuamocoPluginTest {
	/**
	 * Run the List<Class<? extends Extension>> getExtensions() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/30/15 3:44 PM
	 */
	@Test
	public void testGetExtensions_1() throws Exception {
		final QuamocoPlugin fixture = new QuamocoPlugin();

		final List<Class<? extends Extension>> result = fixture.getExtensions();

		// TODO: add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(4, result.size());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/30/15 3:44 PM
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
	 * @generatedBy CodePro at 5/30/15 3:44 PM
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
	 * @generatedBy CodePro at 5/30/15 3:44 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(QuamocoPluginTest.class);
	}
}