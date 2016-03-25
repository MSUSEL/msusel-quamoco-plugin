package net.siliconcode.quamoco.codetree;

import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>TypeNodeTest</code> contains tests for the class
 * <code>{@link TypeNode}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class TypeNodeTest {

	private TypeNode fixture;

	/**
	 * Run the TypeNode(CodeNode,String,String,boolean,int,int) constructor
	 * test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testTypeNode_1() throws Exception {
		final CodeNode owner = new FileNode("path");
		final String identifier = "type";
		final String qIdentifier = "namespace.Type";
		final boolean isClass = true;
		final int start = 1;
		final int end = 1000;

		try {
			final TypeNode result = new TypeNode(owner, qIdentifier, identifier, isClass, start, end);

			// add additional test code here
			Assert.assertNotNull(result);
			Assert.assertEquals("TYPE", result.getType());
			Assert.assertEquals("namespace.Type", result.getQIdentifier());
			Assert.assertEquals(1000, result.getEnd());
			Assert.assertEquals(1, result.getStart());
		} catch (final IllegalArgumentException e) {
			Assert.fail();
		}
	}

	/**
	 * Run the TypeNode(CodeNode,String,String,boolean,int,int) constructor
	 * test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testTypeNode_2() throws Exception {
		final CodeNode owner = new FileNode("path");
		final String identifier = "";
		final String qIdentifier = "";
		final boolean isClass = true;
		final int start = 1;
		final int end = 1000;

		try {
			new TypeNode(owner, qIdentifier, identifier, isClass, start, end);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

		}
	}

	/**
	 * Run the TypeNode(CodeNode,String,String,boolean,int,int) constructor
	 * test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testTypeNode_3() throws Exception {
		final CodeNode owner = new FileNode("path");
		final String identifier = null;
		final String qIdentifier = "";
		final boolean isClass = true;
		final int start = 1;
		final int end = 1000;

		try {
			new TypeNode(owner, qIdentifier, identifier, isClass, start, end);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

		}
	}

	/**
	 * Run the void addMethod(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddMethod_1() throws Exception {
		final MethodNode method = new MethodNode(fixture, "method", false, 25, 100);

		fixture.addMethod(method);

		// add additional test code here
		Assert.assertEquals(1, fixture.getMethods().size());
	}

	/**
	 * Run the void addMethod(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddMethod_2() throws Exception {
		final MethodNode method = null;

		Assert.assertTrue(fixture.getMethods().isEmpty());
		fixture.addMethod(method);

		// add additional test code here
		Assert.assertTrue(fixture.getMethods().isEmpty());
	}

	/**
	 * Run the void addMethod(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddMethod_3() throws Exception {
		final MethodNode method = new MethodNode(fixture, "method", false, 25, 100);

		fixture.addMethod(method);

		// add additional test code here
		Assert.assertEquals(1, fixture.getMethods().size());
		fixture.addMethod(method);
		Assert.assertEquals(1, fixture.getMethods().size());
	}

	/**
	 * Run the void addMethod(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddMethod_4() throws Exception {
		try {
			final MethodNode method = new MethodNode(fixture, "method", false, 25, 1001);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

		}
	}

	/**
	 * Run the void addMethod(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddMethod_5() throws Exception {
		fixture.setStart(100);
		try {
			final MethodNode method = new MethodNode(fixture, "method", false, 25, 1000);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

		}
	}

	/**
	 * Run the void addField(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddField_1() throws Exception {
		final FieldNode field = new FieldNode(fixture, "field", 25);

		fixture.addField(field);

		// add additional test code here
		Assert.assertEquals(1, fixture.getFields().size());
	}

	/**
	 * Run the void addField(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddField_2() throws Exception {
		final FieldNode field = null;

		Assert.assertTrue(fixture.getFields().isEmpty());
		fixture.addField(field);

		// add additional test code here
		Assert.assertTrue(fixture.getFields().isEmpty());
	}

	/**
	 * Run the void addField(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddField_3() throws Exception {
		final FieldNode field = new FieldNode(fixture, "field", 25);

		fixture.addField(field);

		// add additional test code here
		Assert.assertEquals(1, fixture.getFields().size());
		fixture.addField(field);
		Assert.assertEquals(1, fixture.getFields().size());
	}

	/**
	 * Run the void addField(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddField_4() throws Exception {
		try {
			final FieldNode field = new FieldNode(fixture, "field", 1001);
			Assert.fail();
		} catch (final IllegalArgumentException e) {
		}
	}

	/**
	 * Run the void addField(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddField_5() throws Exception {
		fixture.setStart(25);
		try {
			final FieldNode field = new FieldNode(fixture, "field", 24);
			Assert.fail();
		} catch (final IllegalArgumentException e) {
		}
	}

	/**
	 * Run the MethodNode getMethod(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetMethod_1() throws Exception {
		final MethodNode method = new MethodNode(fixture, "method", false, 25, 100);
		fixture.addMethod(method);

		MethodNode result = fixture.getMethod(30);

		// add additional test code here
		Assert.assertEquals(method, result);

		result = fixture.getMethod(25);
		Assert.assertEquals(method, result);

		result = fixture.getMethod(100);
		Assert.assertEquals(method, result);

		result = fixture.getMethod(26);
		Assert.assertEquals(method, result);

		result = fixture.getMethod(99);
		Assert.assertEquals(method, result);
	}

	/**
	 * Run the MethodNode getMethod(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetMethod_2() throws Exception {
		final MethodNode method = new MethodNode(fixture, "method", false, 25, 100);
		fixture.addMethod(method);

		MethodNode result = fixture.getMethod(30);

		// add additional test code here
		Assert.assertEquals(method, result);

		result = fixture.getMethod(24);
		Assert.assertNull(result);

		result = fixture.getMethod(101);
		Assert.assertNull(result);

		result = fixture.getMethod(-1);
		Assert.assertNull(result);

		result = fixture.getMethod(20000);
		Assert.assertNull(result);
	}

	/**
	 * Run the MethodNode getMethod(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetMethod_3() throws Exception {
		final MethodNode method = new MethodNode(fixture, "method", false, 25, 100);

		MethodNode result = fixture.getMethod(30);

		// add additional test code here
		Assert.assertNull(result);

		result = fixture.getMethod(24);
		Assert.assertNull(result);

		result = fixture.getMethod(101);
		Assert.assertNull(result);

		result = fixture.getMethod(-1);
		Assert.assertNull(result);

		result = fixture.getMethod(20000);
		Assert.assertNull(result);
	}

	/**
	 * Run the MethodNode getMethod(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetMethod_4() throws Exception {
		Assert.assertTrue(fixture.getMethods().isEmpty());

		MethodNode result = fixture.getMethod(30);

		// add additional test code here
		Assert.assertNull(result);

		result = fixture.getMethod(24);
		Assert.assertNull(result);

		result = fixture.getMethod(101);
		Assert.assertNull(result);

		result = fixture.getMethod(-1);
		Assert.assertNull(result);

		result = fixture.getMethod(20000);
		Assert.assertNull(result);
	}

	/**
	 * Run the MethodNode getField(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetField_1() throws Exception {
		final FieldNode field = new FieldNode(fixture, "field", 25);
		fixture.addField(field);

		final FieldNode result = fixture.getField(25);

		// add additional test code here
		Assert.assertEquals(field, result);
	}

	/**
	 * Run the MethodNode getField(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetField_2() throws Exception {
		final FieldNode field = new FieldNode(fixture, "field", 25);
		fixture.addField(field);

		FieldNode result = fixture.getField(26);

		// add additional test code here
		Assert.assertNull(result);

		result = fixture.getField(24);
		Assert.assertNull(result);
	}

	/**
	 * Run the MethodNode getField(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetField_3() throws Exception {
		final FieldNode field = new FieldNode(fixture, "field", 25);

		final FieldNode result = fixture.getField(25);

		// add additional test code here
		Assert.assertNull(result);
	}

	/**
	 * Run the Set<CodeNode> getMethods() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetMethods_1() throws Exception {
		final MethodNode method = new MethodNode(fixture, "method", false, 25, 100);
		fixture.addMethod(method);
		final Set<MethodNode> result = fixture.getMethods();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(1, result.size());
	}

	/**
	 * Run the Set<CodeNode> getFields() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetFields_1() throws Exception {
		final FieldNode field = new FieldNode(fixture, "field", 25);
		fixture.addField(field);
		final Set<FieldNode> result = fixture.getFields();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(1, result.size());
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
		Assert.assertEquals("TYPE", result);
	}

	/**
	 * Run the void removeMethod(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testRemoveMethod_1() throws Exception {
		final MethodNode method = new MethodNode(fixture, "method", false, 25, 100);
		fixture.addMethod(method);

		Assert.assertEquals(1, fixture.getMethods().size());
		fixture.removeMethod(method);

		// add additional test code here
		Assert.assertTrue(fixture.getMethods().isEmpty());
	}

	/**
	 * Run the void removeMethod(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testRemoveMethod_2() throws Exception {
		final MethodNode method = new MethodNode(fixture, "method", false, 25, 100);
		fixture.addMethod(method);

		Assert.assertEquals(1, fixture.getMethods().size());
		fixture.removeMethod(null);

		// add additional test code here
		Assert.assertFalse(fixture.getMethods().isEmpty());
	}

	/**
	 * Run the void removeMethod(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testRemoveMethod_3() throws Exception {
		final MethodNode method = new MethodNode(fixture, "method", false, 25, 100);
		final MethodNode method2 = new MethodNode(fixture, "method2", false, 100, 120);
		fixture.addMethod(method);

		Assert.assertEquals(1, fixture.getMethods().size());
		fixture.removeMethod(method2);

		// add additional test code here
		Assert.assertFalse(fixture.getMethods().isEmpty());
	}

	/**
	 * Run the void removeField(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testRemoveField_1() throws Exception {
		final FieldNode field = new FieldNode(fixture, "field", 25);
		fixture.addField(field);

		Assert.assertEquals(1, fixture.getFields().size());
		fixture.removeField(field);

		// add additional test code here
		Assert.assertTrue(fixture.getFields().isEmpty());
	}

	/**
	 * Run the void removeField(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testRemoveField_2() throws Exception {
		final FieldNode field = new FieldNode(fixture, "field", 25);
		fixture.addField(field);

		Assert.assertEquals(1, fixture.getFields().size());
		fixture.removeField(null);

		// add additional test code here
		Assert.assertFalse(fixture.getFields().isEmpty());
	}

	/**
	 * Run the void removeField(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testRemoveField_3() throws Exception {
		final FieldNode field = new FieldNode(fixture, "field", 25);
		final FieldNode field2 = new FieldNode(fixture, "field2", 24);
		fixture.addField(field);

		Assert.assertEquals(1, fixture.getFields().size());
		fixture.removeField(field2);

		// add additional test code here
		Assert.assertFalse(fixture.getFields().isEmpty());
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
		fixture = new TypeNode(new FileNode("path"), "namespace.type", "type", true, 1, 1000);
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
		new org.junit.runner.JUnitCore().run(TypeNodeTest.class);
	}
}