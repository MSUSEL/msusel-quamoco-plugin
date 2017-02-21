package com.sparqline.sonar.quamoco.profiles;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sparqline.sonar.quamoco.profiles.QuamocoProfileExporter;
import com.sparqline.sonar.quamoco.profiles.xml.QuamocoProfile;

/**
 * The class <code>QuamocoProfileExporterTest</code> contains tests for the
 * class <code>{@link QuamocoProfileExporter}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class QuamocoProfileExporterTest {
	/**
	 * Run the void exportProfile(QuamocoProfile) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testExportProfile_1() throws Exception {
		final QuamocoProfileExporter fixture = new QuamocoProfileExporter();
		final QuamocoProfile profile = new QuamocoProfile("");

		fixture.exportProfile(profile, "test.profile");

		// add additional test code here
		Assert.fail("unverified");
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
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
	 * @generatedBy CodePro at 1/26/16 6:35 PM
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
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(QuamocoProfileExporterTest.class);
	}
}