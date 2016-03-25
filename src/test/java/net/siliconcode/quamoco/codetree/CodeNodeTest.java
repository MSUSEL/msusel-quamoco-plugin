package net.siliconcode.quamoco.codetree;

import org.junit.After;
import org.junit.Assert;
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
		final CodeNode other = new TypeNode(new FileNode("path"), "namespace.Type", "Type", true, 1, 100);

		final int result = fixture.compareTo(other);

		// add additional test code here
		Assert.assertEquals(1, result);
	}

	/**
	 * Run the int compareTo(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testCompareTo_2() throws Exception {
		final CodeNode other = new TypeNode(new FileNode("path"), "namespace.Type", "Type", true, 100, 1000);

		final int result = fixture.compareTo(other);

		// add additional test code here
		Assert.assertEquals(0, result);
	}

	/**
	 * Run the int compareTo(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testCompareTo_3() throws Exception {
		final CodeNode other = new TypeNode(new FileNode("path"), "namespace.Type", "Type", true, 200, 1000);

		final int result = fixture.compareTo(other);

		// add additional test code here
		Assert.assertEquals(-1, result);
	}

	/**
	 * Run the boolean containsLine(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testContainsLine_1() throws Exception {
		final int line = 100;

		final boolean result = fixture.containsLine(line);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean containsLine(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testContainsLine_2() throws Exception {
		final int line = 99;

		final boolean result = fixture.containsLine(line);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean containsLine(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testContainsLine_3() throws Exception {
		final int line = 1000;

		final boolean result = fixture.containsLine(line);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean containsLine(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testContainsLine_4() throws Exception {
		final int line = 1001;

		final boolean result = fixture.containsLine(line);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_1() throws Exception {
		final CodeNode obj = new TypeNode(new FileNode("path"), "namespace.Type", "Type", true, 100, 1000);

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_2() throws Exception {
		final Object obj = null;

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_3() throws Exception {
		final Object obj = new Object();

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_4() throws Exception {
		final CodeNode obj = new TypeNode(new FileNode("other"), "namespace.Type", "Type", true, 100, 1000);

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_5() throws Exception {
		final CodeNode obj = new TypeNode(new FileNode("path"), "namespace.NewType", "NewType", true, 100, 1000);

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_6() throws Exception {
		final FileNode obj = new FileNode("path");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_7() throws Exception {
		final CodeNode obj = new TypeNode(new FileNode("path"), "namespace.Type", "Type", true, 125, 1000);

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_8() throws Exception {
		final CodeNode obj = new TypeNode(new FileNode("path"), "namespace.Type", "Type", true, 100, 900);

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the int getEnd() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetEnd_1() throws Exception {
		final int result = fixture.getEnd();

		// add additional test code here
		Assert.assertEquals(1000, result);
	}

	/**
	 * Run the FlyweightKey getIdentifier() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetIdentifier_1() throws Exception {
		final FlyweightKey result = fixture.getIdentifier();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals("Type", result.getShortKey());
		Assert.assertEquals("namespace.Type", result.getKey());
	}

	/**
	 * Run the CodeNode getOwner() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetOwner_1() throws Exception {
		final CodeNode result = fixture.getOwner();

		// add additional test code here
		Assert.assertNotNull(result);
	}

	/**
	 * Run the String getQIdentifier() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetQIdentifier_1() throws Exception {
		final String result = fixture.getQIdentifier();

		// add additional test code here
		Assert.assertEquals("namespace.Type", result);
	}

	/**
	 * Run the int getStart() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetStart_1() throws Exception {
		final int result = fixture.getStart();

		// add additional test code here
		Assert.assertEquals(100, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testHashCode_1() throws Exception {
		final int result = fixture.hashCode();

		// add additional test code here
		Assert.assertEquals(-714525763, result);
	}

	/**
	 * Run the void setEnd(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetEnd_1() throws Exception {
		final int end = 150;

		try {
			fixture.setEnd(end);
			Assert.assertEquals(end, fixture.getEnd());
		} catch (final IllegalArgumentException e) {
			Assert.fail();
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
		final int end = 1;

		try {
			fixture.setEnd(end);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

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
		final CodeNode owner = fixture;
		fixture = new FieldNode(owner, "field", 150);
		final int end = 1001;

		try {
			fixture.setEnd(end);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

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
		final String identifier = "";

		try {
			fixture.setIdentifier(identifier);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

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
		final String identifier = null;

		try {
			fixture.setIdentifier(identifier);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

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
		final String identifier = "NewType";

		try {
			fixture.setIdentifier(identifier);
			Assert.assertEquals("namespace.NewType", fixture.getQIdentifier());
		} catch (final IllegalArgumentException e) {
			Assert.fail();
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
		final CodeNode owner = new FileNode("newPath");

		fixture.setOwner(owner);

		Assert.assertEquals(owner, fixture.getOwner());
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

		Assert.assertNull(fixture.getOwner());
	}

	/**
	 * Run the void setStart(int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetStart_1() throws Exception {
		final int start = 1001;

		try {
			fixture.setStart(start);
			Assert.fail();
		} catch (final IllegalArgumentException e) {
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
		final int start = -1;

		try {
			fixture.setStart(start);
			Assert.fail();
		} catch (final IllegalArgumentException e) {
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
		final int start = 250;

		try {
			fixture.setStart(start);
			Assert.assertEquals(start, fixture.getStart());
		} catch (final IllegalArgumentException e) {
			Assert.fail();
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
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(CodeNodeTest.class);
	}
}