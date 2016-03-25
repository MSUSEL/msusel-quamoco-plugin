package net.siliconcode.quamoco.codetree;

import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>FileNodeTest</code> contains tests for the class
 * <code>{@link FileNode}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class FileNodeTest {

	private FileNode fixture;

	/**
	 * Run the FileNode(String) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFileNode_1() throws Exception {
		final String fullPath = "path";

		// add additional test code here
		try {
			final FileNode result = new FileNode(fullPath);
			Assert.assertNotNull(result);
			Assert.assertEquals("FILE", result.getType());
			Assert.assertEquals("path", result.getQIdentifier());
			Assert.assertEquals(1, result.getEnd());
			Assert.assertEquals(1, result.getStart());
		} catch (final IllegalArgumentException e) {
			Assert.fail();
		}
	}

	/**
	 * Run the FileNode(String) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFileNode_2() throws Exception {
		final String fullPath = "";

		// add additional test code here
		try {
			new FileNode(fullPath);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

		}
	}

	/**
	 * Run the FileNode(String) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFileNode_3() throws Exception {
		final String fullPath = null;

		// add additional test code here
		try {
			new FileNode(fullPath);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

		}
	}

	/**
	 * Run the boolean addType(TypeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddType_1() throws Exception {
		final TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);

		final boolean result = fixture.addType(node);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean addType(TypeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddType_2() throws Exception {
		final TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);

		Assert.assertTrue(fixture.addType(node));
		final boolean result = fixture.addType(node);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean addType(TypeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddType_3() throws Exception {
		final TypeNode node = null;

		final boolean result = fixture.addType(node);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the String getMethod(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetMethod_1() throws Exception {
		final TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		final MethodNode method = new MethodNode(node, "method", false, 25, 100);
		Assert.assertTrue(node.addMethod(method));
		Assert.assertTrue(fixture.addType(node));
		final int line = 25;

		final String result = fixture.getMethod(line);

		// add additional test code here
		Assert.assertEquals(method.getQIdentifier(), result);
	}

	/**
	 * Run the String getMethod(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetMethod_2() throws Exception {
		final TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		final MethodNode method = new MethodNode(node, "method", false, 25, 100);
		Assert.assertTrue(node.addMethod(method));
		Assert.assertTrue(fixture.addType(node));

		int line = 25;
		String result = fixture.getMethod(line);

		Assert.assertEquals(method.getQIdentifier(), result);

		line = 100;
		result = fixture.getMethod(line);

		Assert.assertEquals(method.getQIdentifier(), result);
	}

	/**
	 * Run the String getMethod(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetMethod_3() throws Exception {
		final TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 20, 100);
		final MethodNode method = new MethodNode(node, "method", false, 25, 100);
		Assert.assertTrue(node.addMethod(method));
		Assert.assertTrue(fixture.addType(node));

		int line = 25;
		String result = fixture.getMethod(line);

		Assert.assertEquals("namespace.Type#method", result);

		line = 100;
		result = fixture.getMethod(line);

		Assert.assertEquals("namespace.Type#method", result);
	}

	/**
	 * Run the String getField(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetField_1() throws Exception {
		final TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		final FieldNode field = new FieldNode(node, "field", 25);
		Assert.assertTrue(node.addField(field));
		Assert.assertTrue(fixture.addType(node));
		final int line = 25;

		final String result = fixture.getField(line);

		// add additional test code here
		Assert.assertEquals(field.getQIdentifier(), result);
	}

	/**
	 * Run the String getFIeld(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetField_2() throws Exception {
		final TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 27, 99);
		final FieldNode field = new FieldNode(node, "field", 28);
		Assert.assertTrue(node.addField(field));
		Assert.assertTrue(fixture.addType(node));

		final int line = 56;
		final String result = fixture.getField(line);

		Assert.assertEquals("", result);
	}

	/**
	 * Run the String getField(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetField_3() throws Exception {
		final TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 27, 99);
		final FieldNode field = new FieldNode(node, "field", 28);
		Assert.assertTrue(node.addField(field));
		Assert.assertTrue(fixture.addType(node));

		final int line = 100;
		final String result = fixture.getField(line);

		Assert.assertEquals("", result);
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
		Assert.assertEquals("FILE", result);
	}

	/**
	 * Run the String getType(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetType_2() throws Exception {
		final TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		fixture.addType(node);
		final int line = 1;

		final String result = fixture.getType(line);

		// add additional test code here
		Assert.assertEquals("namespace.Type", result);
	}

	/**
	 * Run the String getType(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetType_3() throws Exception {
		final TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		fixture.addType(node);
		final int line = 1000;

		final String result = fixture.getType(line);

		// add additional test code here
		Assert.assertEquals("namespace.Type", result);
	}

	/**
	 * Run the String getType(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetType_4() throws Exception {
		final TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		fixture.addType(node);
		final int line = -1;

		final String result = fixture.getType(line);

		// add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the String getType(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetType_5() throws Exception {
		final TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		fixture.addType(node);
		final int line = 1001;

		final String result = fixture.getType(line);

		// add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the Set<CodeNode> getTypes() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetTypes_1() throws Exception {
		final TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		Assert.assertTrue(fixture.addType(node));
		final Set<TypeNode> result = fixture.getTypes();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(1, result.size());
	}

	/**
	 * Run the boolean removeType(TypeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testRemoveType_1() throws Exception {
		final TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		Assert.assertTrue(fixture.addType(node));
		final boolean result = fixture.removeType(node);

		// add additional test code here
		Assert.assertTrue(result);
	}

	/**
	 * Run the boolean removeType(TypeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testRemoveType_2() throws Exception {
		final TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);

		final boolean result = fixture.removeType(node);

		// add additional test code here
		Assert.assertFalse(result);
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
		fixture = new FileNode("path");
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
		new org.junit.runner.JUnitCore().run(FileNodeTest.class);
	}
}