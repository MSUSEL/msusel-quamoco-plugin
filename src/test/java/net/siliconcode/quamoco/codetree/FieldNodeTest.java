package net.siliconcode.quamoco.codetree;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>FieldNodeTest</code> contains tests for the class
 * <code>{@link FieldNode}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class FieldNodeTest {

	private FieldNode fixture;

	/**
	 * Run the FieldNode(CodeNode,String,String,int) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFieldNode_1() throws Exception {
		final CodeNode parent = new FileNode("path");
		final String identifier = "field";
		final int line = 1;

		try {
			final FieldNode result = new FieldNode(parent, identifier, line);

			// add additional test code here
			Assert.assertNotNull(result);
			Assert.assertEquals("FIELD", result.getType());
			Assert.assertEquals("path#field", result.getQIdentifier());
			Assert.assertEquals(1, result.getEnd());
			Assert.assertEquals(1, result.getStart());
		} catch (final IllegalArgumentException e) {
			Assert.fail();
		}
	}

	/**
	 * Run the FieldNode(CodeNode,String,String,int) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFieldNode_2() throws Exception {
		final CodeNode parent = new FileNode("path");
		final String identifier = "";
		final int line = 1;

		try {
			new FieldNode(parent, identifier, line);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

		}
	}

	/**
	 * Run the FieldNode(CodeNode,String,String,int) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFieldNode_3() throws Exception {
		final CodeNode parent = new FileNode("path");
		final String identifier = null;
		final int line = 1;

		try {
			new FieldNode(parent, identifier, line);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

		}
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
		Assert.assertEquals("FIELD", result);
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
		fixture = new FieldNode(new FileNode("path"), "field", 1);
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
		new org.junit.runner.JUnitCore().run(FieldNodeTest.class);
	}
}