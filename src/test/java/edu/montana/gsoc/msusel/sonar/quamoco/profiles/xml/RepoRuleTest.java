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
package edu.montana.gsoc.msusel.sonar.quamoco.profiles.xml;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.montana.gsoc.msusel.sonar.quamoco.profiles.xml.RepoRule;

/**
 * The class <code>RepoRuleTest</code> contains tests for the class
 * <code>{@link RepoRule}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class RepoRuleTest {

	private RepoRule fixture;

	/**
	 * Run the RepoRule(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testRepoRule_1() throws Exception {
		final String ruleKey = "";

		new RepoRule(ruleKey);
	}

	/**
	 * Run the RepoRule(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testRepoRule_2() throws Exception {
		final String ruleKey = "";

		new RepoRule(ruleKey);
	}

	/**
	 * Run the RepoRule(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testRepoRule_3() throws Exception {
		final String ruleKey = "rule";

		final RepoRule result = new RepoRule(ruleKey);

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals("rule", result.getRuleKey());
	}

	/**
	 * Run the String getRuleKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testGetRuleKey_1() throws Exception {
		final String result = fixture.getRuleKey();

		// add additional test code here
		Assert.assertEquals("rule", result);
	}

	/**
	 * Run the void setRuleKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSetRuleKey_1() throws Exception {
		final String ruleKey = null;

		fixture.setRuleKey(ruleKey);
	}

	/**
	 * Run the void setRuleKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSetRuleKey_2() throws Exception {
		final String ruleKey = "";

		fixture.setRuleKey(ruleKey);
	}

	/**
	 * Run the void setRuleKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testSetRuleKey_3() throws Exception {
		final String ruleKey = "newRule";

		fixture.setRuleKey(ruleKey);

		// add additional test code here
		Assert.assertEquals(ruleKey, fixture.getRuleKey());
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
		fixture = new RepoRule("rule");
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
		new org.junit.runner.JUnitCore().run(RepoRuleTest.class);
	}
}