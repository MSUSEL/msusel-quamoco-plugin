package net.siliconcode.parsers;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.codetree.FileNode;

/**
 * The class <code>QuamocoJavaListenerTest</code> contains tests for the class
 * <code>{@link QuamocoJavaListener}</code>.
 *
 * @generatedBy CodePro at 1/31/16 10:25 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class QuamocoJavaListenerTest {
	/**
	 * Run the QuamocoJavaListener(FileNode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testQuamocoJavaListener_1() throws Exception {
		final FileNode file = new FileNode("");

		final QuamocoJavaListener result = new QuamocoJavaListener(file);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
		Assert.assertNotNull(result);
	}

	/**
	 * Run the void enterClassDeclaration(ClassDeclarationContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testEnterClassDeclaration_1() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.ClassDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.ClassDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.enterClassDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void enterClassDeclaration(ClassDeclarationContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testEnterClassDeclaration_2() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.ClassDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.ClassDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.enterClassDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void enterConstructorDeclaration(ConstructorDeclarationContext)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testEnterConstructorDeclaration_1() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.ConstructorDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.ConstructorDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.enterConstructorDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void enterEnumDeclaration(EnumDeclarationContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testEnterEnumDeclaration_1() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.EnumDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.EnumDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.enterEnumDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void enterEnumDeclaration(EnumDeclarationContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testEnterEnumDeclaration_2() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.EnumDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.EnumDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.enterEnumDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void enterInterfaceDeclaration(InterfaceDeclarationContext)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testEnterInterfaceDeclaration_1() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.InterfaceDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.InterfaceDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.enterInterfaceDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void enterInterfaceDeclaration(InterfaceDeclarationContext)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testEnterInterfaceDeclaration_2() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.InterfaceDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.InterfaceDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.enterInterfaceDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void enterMethodDeclarator(MethodDeclaratorContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testEnterMethodDeclarator_1() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.MethodDeclaratorContext ctx = new net.siliconcode.parsers.java.Java8Parser.MethodDeclaratorContext(
				new ParserRuleContext(), 1);

		fixture.enterMethodDeclarator(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void enterPackageDeclaration(PackageDeclarationContext) method
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testEnterPackageDeclaration_1() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.PackageDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.PackageDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.enterPackageDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void enterPackageDeclaration(PackageDeclarationContext) method
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testEnterPackageDeclaration_2() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.PackageDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.PackageDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.enterPackageDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void enterPackageDeclaration(PackageDeclarationContext) method
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testEnterPackageDeclaration_3() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.PackageDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.PackageDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.enterPackageDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void enterUnannType(UnannTypeContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testEnterUnannType_1() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.UnannTypeContext ctx = new net.siliconcode.parsers.java.Java8Parser.UnannTypeContext(
				new ParserRuleContext(), 1);

		fixture.enterUnannType(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void exitClassDeclaration(ClassDeclarationContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testExitClassDeclaration_1() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.ClassDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.ClassDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.exitClassDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void exitConstructorDeclaration(ConstructorDeclarationContext)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testExitConstructorDeclaration_1() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.ConstructorDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.ConstructorDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.exitConstructorDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void exitConstructorDeclaration(ConstructorDeclarationContext)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testExitConstructorDeclaration_2() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.ConstructorDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.ConstructorDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.exitConstructorDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void exitConstructorDeclaration(ConstructorDeclarationContext)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testExitConstructorDeclaration_3() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.ConstructorDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.ConstructorDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.exitConstructorDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void exitEnumDeclaration(EnumDeclarationContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testExitEnumDeclaration_1() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.EnumDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.EnumDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.exitEnumDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void exitInterfaceDeclaration(InterfaceDeclarationContext) method
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testExitInterfaceDeclaration_1() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.InterfaceDeclarationContext ctx = new net.siliconcode.parsers.java.Java8Parser.InterfaceDeclarationContext(
				new ParserRuleContext(), 1);

		fixture.exitInterfaceDeclaration(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void exitMethodDeclarator(MethodDeclaratorContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testExitMethodDeclarator_1() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.MethodDeclaratorContext ctx = new net.siliconcode.parsers.java.Java8Parser.MethodDeclaratorContext(
				new ParserRuleContext(), 1);

		fixture.exitMethodDeclarator(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void exitMethodDeclarator(MethodDeclaratorContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testExitMethodDeclarator_2() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.MethodDeclaratorContext ctx = new net.siliconcode.parsers.java.Java8Parser.MethodDeclaratorContext(
				new ParserRuleContext(), 1);

		fixture.exitMethodDeclarator(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Run the void exitMethodDeclarator(MethodDeclaratorContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	@Test
	public void testExitMethodDeclarator_3() throws Exception {
		final QuamocoJavaListener fixture = new QuamocoJavaListener(new FileNode(""));
		fixture.params = EasyMock.createNiceMock(List.class);
		final net.siliconcode.parsers.java.Java8Parser.MethodDeclaratorContext ctx = new net.siliconcode.parsers.java.Java8Parser.MethodDeclaratorContext(
				new ParserRuleContext(), 1);

		fixture.exitMethodDeclarator(ctx);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this
		// test:
		// java.lang.IllegalArgumentException
		// at
		// net.siliconcode.quamoco.codetree.CodeNode.setIdentifier(CodeNode.java:72)
		// at net.siliconcode.quamoco.codetree.CodeNode.<init>(CodeNode.java:53)
		// at net.siliconcode.quamoco.codetree.FileNode.<init>(FileNode.java:43)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
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
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
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
	 *
	 * @generatedBy CodePro at 1/31/16 10:25 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(QuamocoJavaListenerTest.class);
	}
}