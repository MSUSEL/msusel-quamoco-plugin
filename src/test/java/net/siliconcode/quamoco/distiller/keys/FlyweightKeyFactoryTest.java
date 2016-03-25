package net.siliconcode.quamoco.distiller.keys;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>FlyweightKeyFactoryTest</code> contains tests for the class
 * <code>{@link FlyweightKeyFactory}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class FlyweightKeyFactoryTest {

	/**
	 * Run the FlyweightKeyFactory getInstance() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetInstance_1() throws Exception {

		final FlyweightKeyFactory result = FlyweightKeyFactory.getInstance();
		final FlyweightKeyFactory result2 = FlyweightKeyFactory.getInstance();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertNotNull(result2);
		Assert.assertSame(result, result2);
	}

	/**
	 * Run the FlyweightKey getKey(String,String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetKey_1() throws Exception {
		final FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
		final String key1 = "key1";
		final String name1 = "name1";

		final String key2 = "key2";
		final String name2 = "name2";

		final String key3 = "key3";
		final String name3 = "name3";

		final FlyweightKey result1 = fixture.getKey(key1, name1);
		final FlyweightKey result2 = fixture.getKey(key2, name2);
		final FlyweightKey result3 = fixture.getKey(key3, name3);

		Assert.assertNotNull(result1);
		Assert.assertNotNull(result2);
		Assert.assertNotNull(result3);

		Assert.assertNotSame(result1, result2);
		Assert.assertNotSame(result1, result3);
		Assert.assertNotSame(result2, result3);

		Assert.assertSame(result1, fixture.getKey("key1", "name1"));
		Assert.assertSame(result2, fixture.getKey("key2", "name2"));
		Assert.assertSame(result3, fixture.getKey("key3", "name3"));
	}

	/**
	 * Run the FlyweightKey getKey(String,String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetKey_2() throws Exception {
		final FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
		final String key = "";
		final String name = "";

		final FlyweightKey result = fixture.getKey(key, name);

		Assert.assertNull(result);
	}

	/**
	 * Run the FlyweightKey getKey(String,String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetKey_3() throws Exception {
		final FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
		final String key = null;
		final String name = "";

		final FlyweightKey result = fixture.getKey(key, name);

		Assert.assertNull(result);
	}

	/**
	 * Run the FlyweightKey getKey(String,String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetKey_4() throws Exception {
		final FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
		final String key = "";
		final String name = null;

		final FlyweightKey result = fixture.getKey(key, name);

		Assert.assertNull(result);
	}

	/**
	 * Run the FlyweightKey getKey(String,String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetKey_5() throws Exception {
		final FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
		final String key = null;
		final String name = null;

		final FlyweightKey result = fixture.getKey(key, name);

		Assert.assertNull(result);
	}

	/**
	 * Run the FlyweightKey getKey(String,String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetKey_6() throws Exception {
		final FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
		final String key = "something";
		final String name = "";

		final FlyweightKey result = fixture.getKey(key, name);

		Assert.assertNull(result);
	}

	/**
	 * Run the FlyweightKey getKey(String,String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetKey_7() throws Exception {
		final FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
		final String key = "something";
		final String name = null;

		final FlyweightKey result = fixture.getKey(key, name);

		Assert.assertNull(result);
	}

	/**
	 * Run the FlyweightKey getKey(String,String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetKey_8() throws Exception {
		final FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
		final String key = "";
		final String name = "something";

		final FlyweightKey result = fixture.getKey(key, name);

		Assert.assertNull(result);
	}

	/**
	 * Run the FlyweightKey getKey(String,String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetKey_9() throws Exception {
		final FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
		final String key = "something";
		final String name = null;

		final FlyweightKey result = fixture.getKey(key, name);

		Assert.assertNull(result);
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
		new org.junit.runner.JUnitCore().run(FlyweightKeyFactoryTest.class);
	}
}