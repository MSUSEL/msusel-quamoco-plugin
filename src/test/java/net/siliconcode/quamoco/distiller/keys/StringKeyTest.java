package net.siliconcode.quamoco.distiller.keys;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>StringKeyTest</code> contains tests for the class
 * <code>{@link StringKey}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class StringKeyTest {

	/**
	 * Run the StringKey(String,String) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testStringKey_1() throws Exception {
		final String key = "key";
		final String name = "name";

		final StringKey result = new StringKey(key, name);

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(name, result.getShortKey());
		Assert.assertEquals("StringKey [key=key, name=name]", result.toString());
		Assert.assertEquals(key, result.getKey());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_1() throws Exception {
		final StringKey fixture = new StringKey("key", "name");
		final Object obj = new StringKey("key", "name");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_2() throws Exception {
		final StringKey fixture = new StringKey("key", "name");
		final Object obj = null;

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertFalse(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_3() throws Exception {
		final StringKey fixture = new StringKey("key", "name");
		final Object obj = new Object();

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertFalse(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_4() throws Exception {
		final StringKey fixture = new StringKey("", "");
		final Object obj = new StringKey("", "");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_5() throws Exception {
		final StringKey fixture = new StringKey(null, null);
		final Object obj = new StringKey(null, null);

		final boolean result = fixture.equals(obj);

		Assert.assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_6() throws Exception {
		final StringKey fixture = new StringKey(null, "");
		final Object obj = new StringKey(null, "");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertTrue(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_7() throws Exception {
		final StringKey fixture = new StringKey("", null);
		final Object obj = new StringKey("", null);

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertTrue(result);
	}

	/**
	 * Run the String getKey() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetKey_1() throws Exception {
		final StringKey fixture = new StringKey("key", "name");
		final StringKey fixture2 = new StringKey("key", null);
		final StringKey fixture3 = new StringKey(null, "name");
		final StringKey fixture4 = new StringKey("", "");

		final String result = fixture.getKey();
		final String result2 = fixture2.getKey();
		final String result3 = fixture3.getKey();
		final String result4 = fixture4.getKey();

		// add additional test code here
		Assert.assertEquals("key", result);
		Assert.assertNull(result3);
		Assert.assertEquals("key", result2);
		Assert.assertEquals("", result4);
	}

	/**
	 * Run the String getShortKey() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetShortKey_1() throws Exception {
		final StringKey fixture = new StringKey("key", "name");
		final StringKey fixture2 = new StringKey("key", null);
		final StringKey fixture3 = new StringKey(null, "name");
		final StringKey fixture4 = new StringKey("", "");

		final String result = fixture.getShortKey();
		final String result2 = fixture2.getShortKey();
		final String result3 = fixture3.getShortKey();
		final String result4 = fixture4.getShortKey();

		// add additional test code here
		Assert.assertEquals("name", result);
		Assert.assertNull(result2);
		Assert.assertEquals("name", result3);
		Assert.assertEquals("", result4);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testHashCode_1() throws Exception {
		final StringKey fixture = new StringKey((String) null, "");

		final int result = fixture.hashCode();

		// add additional test code here
		Assert.assertEquals(961, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testHashCode_2() throws Exception {
		final StringKey fixture = new StringKey("", (String) null);

		final int result = fixture.hashCode();

		// add additional test code here
		Assert.assertEquals(961, result);
	}

	/**
	 * @throws Exception
	 */
	@Test
	public void testHashCode_3() throws Exception {
		final StringKey fixture = new StringKey("key", "name");

		final int result = fixture.hashCode();

		Assert.assertEquals(6663117, result);
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testToString_1() throws Exception {
		final StringKey fixture = new StringKey("key", "name");
		final StringKey fixture2 = new StringKey("key", null);
		final StringKey fixture3 = new StringKey(null, "name");
		final StringKey fixture4 = new StringKey("", "");

		final String result = fixture.toString();
		final String result2 = fixture2.toString();
		final String result3 = fixture3.toString();
		final String result4 = fixture4.toString();

		// add additional test code here
		Assert.assertEquals("StringKey [key=key, name=name]", result);
		Assert.assertEquals("StringKey [key=key, name=null]", result2);
		Assert.assertEquals("StringKey [key=null, name=name]", result3);
		Assert.assertEquals("StringKey [key=, name=]", result4);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 * @generatedBy CodePro at 1/26/16 6:38 PM
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
	 * @generatedBy CodePro at 1/26/16 6:38 PM
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
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(StringKeyTest.class);
	}
}