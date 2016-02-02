package net.siliconcode.quamoco.codetree;

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
		String fullPath = "path";

		// add additional test code here
		try {
			FileNode result = new FileNode(fullPath);
			assertNotNull(result);
			assertEquals("FILE", result.getType());
			assertEquals("path", result.getQIdentifier());
			assertEquals(1, result.getEnd());
			assertEquals(1, result.getStart());
		} catch (IllegalArgumentException e) {
			fail();
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
		String fullPath = "";

		// add additional test code here
		try {
			new FileNode(fullPath);
			fail();
		} catch (IllegalArgumentException e) {

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
		String fullPath = null;

		// add additional test code here
		try {
			new FileNode(fullPath);
			fail();
		} catch (IllegalArgumentException e) {

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
		TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);

		boolean result = fixture.addType(node);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addType(TypeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddType_2() throws Exception {
		TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);

		assertTrue(fixture.addType(node));
		boolean result = fixture.addType(node);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addType(TypeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddType_3() throws Exception {
		TypeNode node = null;

		boolean result = fixture.addType(node);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getMethod(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetMethod_1() throws Exception {
		TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		MethodNode method = new MethodNode(node, "method", false, 25, 100);
		assertTrue(node.addMethod(method));
		assertTrue(fixture.addType(node));
		int line = 25;

		String result = fixture.getMethod(line);

		// add additional test code here
		assertEquals(method.getQIdentifier(), result);
	}

	/**
	 * Run the String getMethod(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetMethod_2() throws Exception {
		TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		MethodNode method = new MethodNode(node, "method", false, 25, 100);
		assertTrue(node.addMethod(method));
		assertTrue(fixture.addType(node));

		int line = 25;
		String result = fixture.getMethod(line);

		assertEquals(method.getQIdentifier(), result);

		line = 100;
		result = fixture.getMethod(line);

		assertEquals(method.getQIdentifier(), result);
	}

	/**
	 * Run the String getMethod(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetMethod_3() throws Exception {
		TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 20, 100);
		MethodNode method = new MethodNode(node, "method", false, 25, 100);
		assertTrue(node.addMethod(method));
		assertTrue(fixture.addType(node));

		int line = 25;
		String result = fixture.getMethod(line);

		assertEquals("namespace.Type#method", result);

		line = 100;
		result = fixture.getMethod(line);

		assertEquals("namespace.Type#method", result);
	}

	/**
	 * Run the String getField(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetField_1() throws Exception {
		TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		FieldNode field = new FieldNode(node, "field", 25);
		assertTrue(node.addField(field));
		assertTrue(fixture.addType(node));
		int line = 25;

		String result = fixture.getField(line);

		// add additional test code here
		assertEquals(field.getQIdentifier(), result);
	}

	/**
	 * Run the String getFIeld(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetField_2() throws Exception {
		TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 27, 99);
		FieldNode field = new FieldNode(node, "field", 28);
		assertTrue(node.addField(field));
		assertTrue(fixture.addType(node));

		int line = 56;
		String result = fixture.getField(line);

		assertEquals("", result);
	}

	/**
	 * Run the String getField(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetField_3() throws Exception {
		TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 27, 99);
		FieldNode field = new FieldNode(node, "field", 28);
		assertTrue(node.addField(field));
		assertTrue(fixture.addType(node));

		int line = 100;
		String result = fixture.getField(line);

		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetType_1() throws Exception {
		String result = fixture.getType();

		// add additional test code here
		assertEquals("FILE", result);
	}

	/**
	 * Run the String getType(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetType_2() throws Exception {
		TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		fixture.addType(node);
		int line = 1;

		String result = fixture.getType(line);

		// add additional test code here
		assertEquals("namespace.Type", result);
	}

	/**
	 * Run the String getType(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetType_3() throws Exception {
		TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		fixture.addType(node);
		int line = 1000;

		String result = fixture.getType(line);

		// add additional test code here
		assertEquals("namespace.Type", result);
	}

	/**
	 * Run the String getType(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetType_4() throws Exception {
		TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		fixture.addType(node);
		int line = -1;

		String result = fixture.getType(line);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetType_5() throws Exception {
		TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		fixture.addType(node);
		int line = 1001;

		String result = fixture.getType(line);

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Set<CodeNode> getTypes() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetTypes_1() throws Exception {
		TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		assertTrue(fixture.addType(node));
		Set<TypeNode> result = fixture.getTypes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.size());
	}

	/**
	 * Run the boolean removeType(TypeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testRemoveType_1() throws Exception {
		TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);
		assertTrue(fixture.addType(node));
		boolean result = fixture.removeType(node);

		// add additional test code here
		assertTrue(result);
	}

	/**
	 * Run the boolean removeType(TypeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testRemoveType_2() throws Exception {
		TypeNode node = new TypeNode(fixture, "namespace.Type", "type", true, 1, 1000);

		boolean result = fixture.removeType(node);

		// add additional test code here
		assertFalse(result);
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
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FileNodeTest.class);
	}
}