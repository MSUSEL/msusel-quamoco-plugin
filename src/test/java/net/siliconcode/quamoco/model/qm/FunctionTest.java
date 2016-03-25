package net.siliconcode.quamoco.model.qm;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>FunctionTest</code> contains tests for the class
 * <code>{@link Function}</code>.
 *
 * @generatedBy CodePro at 6/6/15 1:35 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class FunctionTest {

	/**
	 * Run the Function(double,double,String,String) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testFunction_1() throws Exception {
		final double lowerBound = 1.0;
		final double upperBound = 1.0;
		final String type = "";
		final String id = "";

		final Function result = new Function(lowerBound, upperBound, type, id);

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(1.0, result.getUpperBound(), 1.0);
		Assert.assertEquals(1.0, result.getLowerBound(), 1.0);
		Assert.assertEquals("", result.getId());
		Assert.assertEquals("", result.getType());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testEquals_1() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", "");
		final Object obj = new Function(1.0, 1.0, "", "");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testEquals_2() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", "");
		final Object obj = null;

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testEquals_3() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", "");
		final Object obj = new Object();

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testEquals_4() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", "");
		final Object obj = new Function(1.0, 1.0, "", "");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testEquals_5() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", "");
		final Object obj = new Function(1.0, 1.0, "", "");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testEquals_6() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", (String) null);
		final Object obj = new Function(1.0, 1.0, "", (String) null);

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testEquals_7() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", "");
		final Object obj = new Function(1.0, 1.0, "", "");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testGetId_1() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", "");

		final String result = fixture.getId();

		// add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the double getLowerBound() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testGetLowerBound_1() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", "");

		final double result = fixture.getLowerBound();

		// add additional test code here
		Assert.assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testGetType_1() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", "");

		final String result = fixture.getType();

		// add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the double getUpperBound() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testGetUpperBound_1() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", "");

		final double result = fixture.getUpperBound();

		// add additional test code here
		Assert.assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testHashCode_1() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", "");

		final int result = fixture.hashCode();

		// add additional test code here
		Assert.assertEquals(-33524641, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testHashCode_2() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", (String) null);

		final int result = fixture.hashCode();

		// add additional test code here
		Assert.assertEquals(-33524641, result);
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testSetId_1() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", "");
		final String id = "";

		fixture.setId(id);

		Assert.assertEquals(id, fixture.getId());
	}

	/**
	 * Run the void setLowerBound(double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testSetLowerBound_1() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", "");
		final double lowerBound = 1.0;

		fixture.setLowerBound(lowerBound);

		Assert.assertEquals(lowerBound, fixture.getLowerBound(), 0.01);
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testSetType_1() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", "");
		final String type = "";

		fixture.setType(type);

		Assert.assertEquals(type, fixture.getType());
	}

	/**
	 * Run the void setUpperBound(double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	@Test
	public void testSetUpperBound_1() throws Exception {
		final Function fixture = new Function(1.0, 1.0, "", "");
		final double upperBound = 1.0;

		fixture.setUpperBound(upperBound);

		Assert.assertEquals(upperBound, fixture.getUpperBound(), 0.01);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 * @generatedBy CodePro at 6/6/15 1:35 PM
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
	 * @generatedBy CodePro at 6/6/15 1:35 PM
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
	 * @generatedBy CodePro at 6/6/15 1:35 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(FunctionTest.class);
	}
}