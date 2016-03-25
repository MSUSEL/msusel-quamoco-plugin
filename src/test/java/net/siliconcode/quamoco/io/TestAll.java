package net.siliconcode.quamoco.io;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all of
 * the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 5/30/15 3:42 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ QMRReaderTest.class, QMReaderTest.class, MetricPropertiesReaderTest.class,
		RootNotFoundExceptionTest.class, AbstractQuamocoReaderTest.class, GradeSchemePropertiesReaderTest.class, })
public class TestAll {

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 *
	 * @generatedBy CodePro at 5/30/15 3:42 PM
	 */
	public static void main(final String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
