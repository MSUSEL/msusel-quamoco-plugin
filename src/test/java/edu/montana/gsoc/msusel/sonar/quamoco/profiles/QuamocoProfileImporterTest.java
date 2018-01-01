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

import java.io.PipedReader;
import java.io.Reader;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.profiles.RulesProfile;
import org.sonar.api.rules.RuleFinder;
import org.sonar.api.utils.ValidationMessages;

import edu.montana.gsoc.msusel.sonar.quamoco.profiles.QuamocoProfileImporter;

/**
 * The class <code>QuamocoProfileImporterTest</code> contains tests for the
 * class <code>{@link QuamocoProfileImporter}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class QuamocoProfileImporterTest {
	/**
	 * Run the QuamocoProfileImporter(RuleFinder) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testQuamocoProfileImporter_1() throws Exception {
		final RuleFinder ruleFinder = EasyMock.createMock(RuleFinder.class);
		// add mock object expectations here

		EasyMock.replay(ruleFinder);

		final QuamocoProfileImporter result = new QuamocoProfileImporter(ruleFinder);

		// add additional test code here
		EasyMock.verify(ruleFinder);
		Assert.assertNotNull(result);
		Assert.assertEquals("QuamocoProfileImporter[key=quamoco,name=Quamoco,languages={java,cs}]", result.toString());
		Assert.assertEquals("Quamoco", result.getName());
		Assert.assertEquals("quamoco", result.getKey());
		Assert.fail("unverified");
	}

	/**
	 * Run the RulesProfile importProfile(Reader,ValidationMessages) method
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testImportProfile_1() throws Exception {
		final QuamocoProfileImporter fixture = new QuamocoProfileImporter(EasyMock.createNiceMock(RuleFinder.class));
		final Reader findbugsConf = new PipedReader();
		final ValidationMessages messages = ValidationMessages.create();

		final RulesProfile result = fixture.importProfile(findbugsConf, messages);

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(null, result.getParentName());
		Assert.assertEquals(null, result.getUsed());
		Assert.assertEquals(-1, result.getVersion());
		Assert.assertEquals(Boolean.FALSE, result.getDefaultProfile());
		Assert.assertEquals("[name=null,language=null]", result.toString());
		Assert.assertEquals(null, result.getName());
		Assert.assertEquals(null, result.getLanguage());
		Assert.assertEquals(null, result.getId());
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
		new org.junit.runner.JUnitCore().run(QuamocoProfileImporterTest.class);
	}
}