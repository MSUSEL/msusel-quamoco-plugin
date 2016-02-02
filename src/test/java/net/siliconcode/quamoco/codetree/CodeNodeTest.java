package net.siliconcode.quamoco.codetree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.distiller.keys.FlyweightKey;

/**
 * The class <code>CodeNodeTest</code> contains tests for the class
 * <code>{@link CodeNode}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class CodeNodeTest {

	private CodeNode fixture;

	/**
	 * Run the int compareTo(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testCompareTo_1() throws Exception {
		CodeNode other = new TypeNode(new FileNode("path"), "namespace.Type", "Type", true, 1, 100);

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int compareTo(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testCompareTo_2() throws Exception {
		CodeNode other = new TypeNode(new FileNode("path"), "namespace.Type", "Type", true, 100, 1000);

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int compareTo(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testCompareTo_3() throws Exception {
		CodeNode other = new TypeNode(new FileNode("path"), "namespace.Type", "Type", true, 200, 1000);

		int result = fixture.compareTo(other);

		// add additional test code here
		assertEquals(-1, result);
	}

	/**
	 * Run the boolean containsLine(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testContainsLine_1() throws Exception {
		int line = 100;

		boolean result = fixture.containsLine(line);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean containsLine(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testContainsLine_2() throws Exception {
		int line = 99;

		boolean result = fixture.containsLine(line);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean containsLine(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testContainsLine_3() throws Exception {
		int line = 1000;

		boolean result = fixture.containsLine(line);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean containsLine(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testContainsLine_4() throws Exception {
		int line = 1001;

		boolean result = fixture.containsLine(line);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_1() throws Exception {
		CodeNode obj = new TypeNode(new FileNode("path"), "namespace.Type", "Type", true, 100, 1000);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_2() throws Exception {
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_3() throws Exception {
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_4() throws Exception {
		CodeNode obj = new TypeNode(new FileNode("other"), "namespace.Type", "Type", true, 100, 1000);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_5() throws Exception {
		CodeNode obj = new TypeNode(new FileNode("path"), "namespace.NewType", "NewType", true, 100, 1000);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_6() throws Exception {
		FileNode obj = new FileNode("path");

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_7() throws Exception {
		CodeNode obj = new TypeNode(new FileNode("path"), "namespace.Type", "Type", true, 125, 1000);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_8() throws Exception {
		CodeNode obj = new TypeNode(new FileNode("path"), "namespace.Type", "Type", true, 100, 900);

		boolean result = fixture.equals(obj);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int getEnd() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetEnd_1() throws Exception {
		int result = fixture.getEnd();

		// add additional test code here
		assertEquals(1000, result);
	}

	/**
	 * Run the FlyweightKey getIdentifier() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetIdentifier_1() throws Exception {
		FlyweightKey result = fixture.getIdentifier();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Type", result.getShortKey());
		assertEquals("namespace.Type", result.getKey());
	}

	/**
	 * Run the CodeNode getOwner() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetOwner_1() throws Exception {
		CodeNode result = fixture.getOwner();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the String getQIdentifier() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetQIdentifier_1() throws Exception {
		String result = fixture.getQIdentifier();

		// add additional test code here
		assertEquals("namespace.Type", result);
	}

	/**
	 * Run the int getStart() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetStart_1() throws Exception {
		int result = fixture.getStart();

		// add additional test code here
		assertEquals(100, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testHashCode_1() throws Exception {
		int result = fixture.hashCode();

		// add additional test code here
		assertEquals(-714525763, result);
	}

	/**
	 * Run the void setEnd(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetEnd_1() throws Exception {
		int end = 150;

		try {
			fixture.setEnd(end);
			assertEquals(end, fixture.getEnd());
		} catch (IllegalArgumentException e) {
			fail();
		}
	}

	/**
	 * Run the void setEnd(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetEnd_2() throws Exception {
		int end = 1;

		try {
			fixture.setEnd(end);
			fail();
		} catch (IllegalArgumentException e) {

		}
	}

	/**
	 * Run the void setEnd(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetEnd_3() throws Exception {
		CodeNode owner = fixture;
		fixture = new FieldNode(owner, "field", 150);
		int end = 1001;

		try {
			fixture.setEnd(end);
			fail();
		} catch (IllegalArgumentException e) {

		}
	}

	/**
	 * Run the void setIdentifier(FlyweightKey) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetIdentifier_1() throws Exception {
		String identifier = "";

		try {
			fixture.setIdentifier(identifier);
			fail();
		} catch (IllegalArgumentException e) {

		}
	}

	/**
	 * Run the void setIdentifier(FlyweightKey) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetIdentifier_2() throws Exception {
		String identifier = null;

		try {
			fixture.setIdentifier(identifier);
			fail();
		} catch (IllegalArgumentException e) {

		}
	}

	/**
	 * Run the void setIdentifier(FlyweightKey) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetIdentifier_3() throws Exception {
		String identifier = "NewType";

		try {
			fixture.setIdentifier(identifier);
			assertEquals("namespace.NewType", fixture.getQIdentifier());
		} catch (IllegalArgumentException e) {
			fail();
		}
	}

	/**
	 * Run the void setOwner(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetOwner_1() throws Exception {
		CodeNode owner = new FileNode("newPath");

		fixture.setOwner(owner);

		assertEquals(owner, fixture.getOwner());
	}

	/**
	 * Run the void setOwner(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetOwner_2() throws Exception {
		fixture.setOwner(null);

		assertNull(fixture.getOwner());
	}

	/**
	 * Run the void setStart(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetStart_1() throws Exception {
		int start = 1001;

		try {
			fixture.setStart(start);
			fail();
		} catch (IllegalArgumentException e) {
		}
	}

	/**
	 * Run the void setStart(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetStart_2() throws Exception {
		int start = -1;

		try {
			fixture.setStart(start);
			fail();
		} catch (IllegalArgumentException e) {
		}
	}

	/**
	 * Run the void setStart(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetStart_3() throws Exception {
		int start = 250;

		try {
			fixture.setStart(start);
			assertEquals(start, fixture.getStart());
		} catch (IllegalArgumentException e) {
			fail();
		}
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
		fixture = new TypeNode(new FileNode("path"), "namespace.Type", "Type", true, 100, 1000);
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
		new org.junit.runner.JUnitCore().run(CodeNodeTest.class);
	}
}