package net.siliconcode.quamoco.codetree;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>MethodNodeTest</code> contains tests for the class
 * <code>{@link MethodNode}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class MethodNodeTest {

	private MethodNode fixture;

	/**
	 * Run the MethodNode(CodeNode,String,String,boolean,int,int) constructor
	 * test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testMethodNode_1() throws Exception {
		final CodeNode owner = new FileNode("path");
		final String identifier = "method";
		final boolean constructor = true;
		final int start = 1;
		final int end = 1;

		final MethodNode result = new MethodNode(owner, identifier, constructor, start, end);

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(true, result.isConstructor());
		Assert.assertEquals("METHOD", result.getType());
		Assert.assertEquals("path#method", result.getQIdentifier());
		Assert.assertEquals(1, result.getEnd());
		Assert.assertEquals(1, result.getStart());
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetType_1() throws Exception {
		final String result = fixture.getType();

		// add additional test code here
		Assert.assertEquals("METHOD", result);
	}

	/**
	 * Run the boolean isConstructor() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testIsConstructor_1() throws Exception {
		final boolean result = fixture.isConstructor();

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean isConstructor() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testIsConstructor_2() throws Exception {
		fixture.setConstructor(false);
		final boolean result = fixture.isConstructor();

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	@Test
	public void testSetConstructor_1() throws Exception {
		Assert.assertTrue(fixture.isConstructor());

		fixture.setConstructor(false);

		Assert.assertFalse(fixture.isConstructor());
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
		fixture = new MethodNode(new FileNode("path"), "method", true, 1, 1);
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
		new org.junit.runner.JUnitCore().run(MethodNodeTest.class);
	}
}