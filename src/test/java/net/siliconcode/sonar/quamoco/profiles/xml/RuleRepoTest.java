package net.siliconcode.sonar.quamoco.profiles.xml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>RuleRepoTest</code> contains tests for the class
 * <code>{@link RuleRepo}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class RuleRepoTest {

	private RuleRepo fixture;

	/**
	 * Run the RuleRepo(String,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testRuleRepo_1() throws Exception {
		String key = null;

		new RuleRepo(key);
	}

	/**
	 * Run the RuleRepo(String,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testRuleRepo_2() throws Exception {
		String key = "";

		new RuleRepo(key);
	}

	/**
	 * Run the RuleRepo(String,String[]) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testRuleRepo_3() throws Exception {
		String key = "repo";

		RuleRepo result = new RuleRepo(key);

		// add additional test code here
		assertNotNull(result);
		assertEquals(key, result.getKey());
	}

	/**
	 * Run the void addRule(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testAddRule_1() throws Exception {
		String rule = null;

		fixture.addRule(rule);

		// add additional test code here
		assertTrue(fixture.getRules().isEmpty());
	}

	/**
	 * Run the void addRule(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testAddRule_2() throws Exception {
		String rule = "";

		fixture.addRule(rule);

		// add additional test code here
		assertTrue(fixture.getRules().isEmpty());
	}

	/**
	 * Run the void addRule(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testAddRule_3() throws Exception {
		String rule = "Rule1";

		fixture.addRule(rule);

		// add additional test code here
		assertFalse(fixture.getRules().isEmpty());
		assertEquals(1, fixture.getRules().size());
	}

	/**
	 * Run the void addRule(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testAddRule_4() throws Exception {
		fixture.addRule("Rule1");
		String rule = "Rule1";

		fixture.addRule(rule);

		// add additional test code here
		assertFalse(fixture.getRules().isEmpty());
		assertEquals(1, fixture.getRules().size());
	}

	/**
	 * Run the String getKey() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testGetKey_1() throws Exception {
		String result = fixture.getKey();

		// add additional test code here
		assertEquals("repo", result);
	}

	/**
	 * Run the Set<String> getRules() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testGetRules_1() throws Exception {
		Set<String> result = fixture.getRules();

		// add additional test code here
		assertNotNull(result);
		assertTrue(result.isEmpty());
	}

	/**
	 * Run the void removeRule(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testRemoveRule_1() throws Exception {
		fixture.addRule("newRule");
		String rule = null;

		assertEquals(1, fixture.getRules().size());
		fixture.removeRule(rule);

		// add additional test code here
		assertFalse(fixture.getRules().isEmpty());
	}

	/**
	 * Run the void removeRule(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testRemoveRule_2() throws Exception {
		fixture.addRule("newRule");
		String rule = "";

		assertEquals(1, fixture.getRules().size());
		fixture.removeRule(rule);

		// add additional test code here
		assertFalse(fixture.getRules().isEmpty());
	}

	/**
	 * Run the void removeRule(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testRemoveRule_3() throws Exception {
		fixture.addRule("newRule");
		String rule = "newRule";

		assertEquals(1, fixture.getRules().size());
		fixture.removeRule(rule);

		// add additional test code here
		assertTrue(fixture.getRules().isEmpty());
	}

	/**
	 * Run the void removeRule(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testRemoveRule_4() throws Exception {
		fixture.addRule("newRule");
		String rule = "test";

		assertEquals(1, fixture.getRules().size());
		fixture.removeRule(rule);

		// add additional test code here
		assertFalse(fixture.getRules().isEmpty());
	}

	/**
	 * Run the void setKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testSetKey_1() throws Exception {
		String key = "newKey";

		fixture.setKey(key);

		// add additional test code here
		assertEquals(key, fixture.getKey());
	}

	/**
	 * Run the void setKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSetKey_2() throws Exception {
		String key = null;

		fixture.setKey(key);
	}

	/**
	 * Run the void setKey(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSetKey_3() throws Exception {
		String key = "";

		fixture.setKey(key);
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
		fixture = new RuleRepo("repo");
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
		new org.junit.runner.JUnitCore().run(RuleRepoTest.class);
	}
}