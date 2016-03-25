package net.siliconcode.quamoco.codetree;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>CodeTreeTest</code> contains tests for the class
 * <code>{@link CodeTree}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class CodeTreeTest {

	CodeTree fixture;

	/**
	 * Run the CodeTree() constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testCodeTree_1() throws Exception {

		final CodeTree result = new CodeTree();

		// add additional test code here
		Assert.assertNotNull(result);
	}

	/**
	 * Run the void addFile(String,FileNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddFile_1() throws Exception {
		final FileNode node = new FileNode("path3");

		fixture.addFile(node);

		// add additional test code here
		Assert.assertNotNull(fixture.getFile("path3"));
		Assert.assertEquals(node, fixture.getFile("path3"));
	}

	/**
	 * Run the void addFile(String,FileNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddFile_2() throws Exception {
		final FileNode node = null;

		Assert.assertEquals(2, fixture.getFiles().size());
		fixture.addFile(node);

		// add additional test code here
		Assert.assertEquals(2, fixture.getFiles().size());
	}

	/**
	 * Run the String findClass(String,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindClass_1() throws Exception {
		final String file = null;
		final int line = 1;

		final String result = fixture.findClass(file, line);

		// add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the String findClass(String,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindClass_2() throws Exception {
		final String file = "path1";
		final int line = 1;

		final String result = fixture.findClass(file, line);

		// add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the String findClass(String,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindClass_3() throws Exception {
		final String file = "path1";
		final int line = -1;

		final String result = fixture.findClass(file, line);

		// add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the String findClass(String,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindClass_4() throws Exception {
		final String file = "path1";
		final int line = 100;

		final String result = fixture.findClass(file, line);

		// add additional test code here
		Assert.assertEquals("namespace.Type1", result);
	}

	/**
	 * Run the String findClass(String,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindClass_5() throws Exception {
		final String file = "path1";
		final int line = 1000;

		final String result = fixture.findClass(file, line);

		// add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the FileNode findFile(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindFile_1() throws Exception {
		final String string = null;

		final FileNode result = fixture.findFile(string);

		// add additional test code here
		Assert.assertEquals(null, result);
	}

	/**
	 * Run the FileNode findFile(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindFile_2() throws Exception {

		final String string = "";

		final FileNode result = fixture.findFile(string);

		// add additional test code here
		Assert.assertEquals(null, result);
	}

	/**
	 * Run the FileNode findFile(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindFile_3() throws Exception {
		final String key = "path1";

		final FileNode result = fixture.findFile(key);

		// add additional test code here
		Assert.assertNotNull(result);
	}

	/**
	 * Run the String findMethod(String,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindMethod_1() throws Exception {
		final String file = null;
		final int line = 1;

		final String result = fixture.findMethod(file, line);

		// add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the String findMethod(String,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindMethod_2() throws Exception {
		final String file = "";
		final int line = 1;

		final String result = fixture.findMethod(file, line);

		// add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the String findMethod(String,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindMethod_3() throws Exception {
		final String file = "path1";
		final int line = -1;

		final String result = fixture.findMethod(file, line);

		// add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the String findMethod(String,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindMethod_4() throws Exception {
		final String file = "path1";
		final int line = 110;

		final String result = fixture.findMethod(file, line);

		// add additional test code here
		Assert.assertEquals("namespace.Type1#method1", result);
	}

	/**
	 * Run the String findMethod(String,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindMethod_5() throws Exception {
		final String file = "path1";
		final int line = 200;

		final String result = fixture.findMethod(file, line);

		// add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the MethodNode findMethod(TypeNode,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindMethod_6() throws Exception {
		final int line = 110;
		final TypeNode type = fixture.findType(fixture.getFile("path1"), line);

		final MethodNode result = fixture.findMethod(type, line);

		// add additional test code here
		Assert.assertNotNull(result);
	}

	/**
	 * Run the MethodNode findMethod(TypeNode,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindMethod_7() throws Exception {
		final int line = 100;
		final TypeNode type = fixture.findType(fixture.getFile("path1"), line);

		final MethodNode result = fixture.findMethod(type, line);

		// add additional test code here
		Assert.assertNull(result);
	}

	/**
	 * Run the MethodNode findMethod(TypeNode,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindMethod_8() throws Exception {
		final int line = 200;
		final TypeNode type = fixture.findType(fixture.getFile("path1"), line);

		final MethodNode result = fixture.findMethod(type, line);

		// add additional test code here
		Assert.assertNull(result);
	}

	/**
	 * Run the MethodNode findMethod(TypeNode,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindMethod_9() throws Exception {
		final int line = 200;
		final TypeNode type = fixture.findType(null, line);

		final MethodNode result = fixture.findMethod(type, line);

		// add additional test code here
		Assert.assertNull(result);
	}

	/**
	 * Run the TypeNode findType(FileNode,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindType_1() throws Exception {
		final FileNode fnode = fixture.findFile("path1");
		final int line = 100;

		final TypeNode result = fixture.findType(fnode, line);

		// add additional test code here
		Assert.assertNotNull(result);
	}

	/**
	 * Run the TypeNode findType(FileNode,int) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFindType_2() throws Exception {
		final FileNode fnode = fixture.findFile("path1");
		final int line = 20;

		final TypeNode result = fixture.findType(fnode, line);

		// add additional test code here
		Assert.assertNull(result);
	}

	/**
	 * Run the FileNode getFile(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetFile_1() throws Exception {
		final String file = null;

		final FileNode result = fixture.getFile(file);

		// add additional test code here
		Assert.assertEquals(null, result);
	}

	/**
	 * Run the FileNode getFile(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetFile_2() throws Exception {
		final String file = "";

		final FileNode result = fixture.getFile(file);

		// add additional test code here
		Assert.assertEquals(null, result);
	}

	/**
	 * Run the FileNode getFile(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetFile_3() throws Exception {
		final String file = "path1";

		final FileNode result = fixture.getFile(file);

		// add additional test code here
		Assert.assertNotNull(result);
	}

	/**
	 * Run the FileNode getFile(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetFile_4() throws Exception {
		final String file = "path2";

		final FileNode result = fixture.getFile(file);

		// add additional test code here
		Assert.assertNotNull(result);
	}

	/**
	 * Run the Set<String> getFiles() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetFiles_1() throws Exception {
		final Set<String> result = fixture.getFiles();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(2, result.size());
	}

	/**
	 * Run the Set<String> getMethods() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetMethods_1() throws Exception {
		final Set<String> result = fixture.getMethods();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(2, result.size());
	}

	/**
	 * Run the Set<String> getTypes() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetTypes_1() throws Exception {
		final Set<String> result = fixture.getTypes();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(2, result.size());
	}

	/**
	 * Run the void printTree() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testPrintTree_1() throws Exception {
		final StringBuilder builder = new StringBuilder();
		builder.append("path1\n");
		builder.append("\t" + "Type1\n");
		builder.append("\t\t" + "method1\n");
		builder.append("path2\n");
		builder.append("\t" + "Type2\n");
		builder.append("\t\t" + "method2\n");

		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		final PrintStream ps = new PrintStream(baos);

		final PrintStream old = System.out;
		System.setOut(ps);

		fixture.printTree();

		System.out.flush();
		System.setOut(old);

		// add additional test code here
		Assert.assertEquals(builder.toString(), baos.toString());
	}

	/**
	 * Run the void removeChild(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testRemoveChild_1() throws Exception {
		final String file = null;

		fixture.removeFile(file);

		Assert.assertEquals(2, fixture.getFiles().size());
	}

	/**
	 * Run the void removeChild(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testRemoveChild_2() throws Exception {

		final String file = "";

		fixture.removeFile(file);

		Assert.assertEquals(2, fixture.getFiles().size());
	}

	/**
	 * Run the void removeChild(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testRemoveChild_3() throws Exception {

		final String file = "path1";

		fixture.removeFile(file);

		// add additional test code here
		Assert.assertEquals(1, fixture.getFiles().size());
	}

	/**
	 * Run the void removeChild(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testRemoveChild_4() throws Exception {
		final String file = "path3";

		fixture.removeFile(file);

		// add additional test code here
		Assert.assertEquals(2, fixture.getFiles().size());
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
		fixture = new CodeTree();
		final FileNode file1 = new FileNode("path1");
		final FileNode file2 = new FileNode("path2");
		fixture.addFile(file1);
		fixture.addFile(file2);

		final TypeNode type1 = new TypeNode(file1, "namespace.Type1", "Type1", true, 100, 150);
		final MethodNode method1 = new MethodNode(type1, "method1", false, 110, 150);
		type1.addMethod(method1);
		file1.addType(type1);

		final TypeNode type2 = new TypeNode(file2, "namespace.Type2", "Type2", true, 100, 150);
		final MethodNode method2 = new MethodNode(type2, "method2", false, 110, 150);
		type2.addMethod(method2);
		file2.addType(type2);
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
		new org.junit.runner.JUnitCore().run(CodeTreeTest.class);
	}
}