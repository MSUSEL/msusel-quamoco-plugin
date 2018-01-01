/**
 * The MIT License (MIT)
 *
 * SparQLine Analytics Sonar Quamoco Plugin
 * Copyright (c) 2015-2017 Isaac Griffith, SparQLine Analytics, LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package edu.montana.gsoc.msusel.sonar.quamoco.profiles;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.profiles.RulesProfile;
import org.sonar.api.rules.RuleFinder;
import org.sonar.api.utils.ValidationMessages;

import edu.montana.gsoc.msusel.sonar.quamoco.profiles.QuamocoCSharpProfile;
import edu.montana.gsoc.msusel.sonar.quamoco.profiles.QuamocoProfileImporter;

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
		final QuamocoProfileImporter importer = new QuamocoProfileImporter(EasyMock.createNiceMock(RuleFinder.class));

		final QuamocoCSharpProfile result = new QuamocoCSharpProfile(importer);

		// add additional test code here
		Assert.assertNotNull(result);
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
		final QuamocoCSharpProfile fixture = new QuamocoCSharpProfile(
				new QuamocoProfileImporter(EasyMock.createNiceMock(RuleFinder.class)));
		final ValidationMessages messages = ValidationMessages.create();

		final RulesProfile result = fixture.createProfile(messages);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.NullPointerException
		// at java.io.Reader.<init>(Reader.java:78)
		// at java.io.InputStreamReader.<init>(InputStreamReader.java:72)
		// at
		// net.siliconcode.sonar.quamoco.profiles.QuamocoCSharpProfile.createProfile(QuamocoCSharpProfile.java:58)
		Assert.assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(QuamocoCSharpProfileTest.class);
	}
}