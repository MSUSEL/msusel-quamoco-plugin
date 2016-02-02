package net.siliconcode.sonar.quamoco.profiles;

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import org.sonar.api.profiles.RulesProfile;
import org.sonar.api.rules.RuleFinder;
import org.sonar.api.utils.ValidationMessages;

/**
 * The class <code>QuamocoCSharpProfileTest</code> contains tests for the class
 * <code>{@link QuamocoCSharpProfile}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class QuamocoCSharpProfileTest {
	/**
	 * Run the QuamocoCSharpProfile(QuamocoProfileImporter) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testQuamocoCSharpProfile_1() throws Exception {
		QuamocoProfileImporter importer = new QuamocoProfileImporter(EasyMock.createNiceMock(RuleFinder.class));

		QuamocoCSharpProfile result = new QuamocoCSharpProfile(importer);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the RulesProfile createProfile(ValidationMessages) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testCreateProfile_1() throws Exception {
		QuamocoCSharpProfile fixture = new QuamocoCSharpProfile(
				new QuamocoProfileImporter(EasyMock.createNiceMock(RuleFinder.class)));
		ValidationMessages messages = ValidationMessages.create();

		RulesProfile result = fixture.createProfile(messages);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at java.io.Reader.<init>(Reader.java:78)
		// at java.io.InputStreamReader.<init>(InputStreamReader.java:72)
		// at
		// net.siliconcode.sonar.quamoco.profiles.QuamocoCSharpProfile.createProfile(QuamocoCSharpProfile.java:58)
		assertNotNull(result);
		fail("unverified");
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
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(QuamocoCSharpProfileTest.class);
	}
}