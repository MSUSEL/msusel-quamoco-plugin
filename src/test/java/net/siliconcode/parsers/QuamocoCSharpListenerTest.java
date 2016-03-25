package net.siliconcode.parsers;

import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.codetree.FileNode;

/**
 * The class <code>QuamocoCSharpListenerTest</code> contains tests for the class
 * <code>{@link QuamocoCSharpListener}</code>.
 *
 * @generatedBy CodePro at 1/31/16 10:24 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class QuamocoCSharpListenerTest {
	/**
	 * Run the QuamocoCSharpListener(FileNode) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testQuamocoCSharpListener_1() throws Exception {
		final FileNode file = new FileNode("");

		final QuamocoCSharpListener result = new QuamocoCSharpListener(file);

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
	 * Run the void enterClass_definition(Class_definitionContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterClass_definition_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Class_definitionContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Class_definitionContext(
				new ParserRuleContext(), 1);

		fixture.enterClass_definition(ctx);

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
	 * Run the void enterClass_definition(Class_definitionContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterClass_definition_2() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Class_definitionContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Class_definitionContext(
				new ParserRuleContext(), 1);

		fixture.enterClass_definition(ctx);

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
	 * Run the void
	 * enterConstructor_declaration2(Constructor_declaration2Context) method
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterConstructor_declaration2_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Constructor_declaration2Context ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Constructor_declaration2Context(
				new ParserRuleContext(), 1);

		fixture.enterConstructor_declaration2(ctx);

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
	 * Run the void enterDelegate_definition(Delegate_definitionContext) method
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterDelegate_definition_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Delegate_definitionContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Delegate_definitionContext(
				new ParserRuleContext(), 1);

		fixture.enterDelegate_definition(ctx);

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
	 * Run the void enterEnum_definition(Enum_definitionContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterEnum_definition_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Enum_definitionContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Enum_definitionContext(
				new ParserRuleContext(), 1);

		fixture.enterEnum_definition(ctx);

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
	 * Run the void enterEnum_definition(Enum_definitionContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterEnum_definition_2() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Enum_definitionContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Enum_definitionContext(
				new ParserRuleContext(), 1);

		fixture.enterEnum_definition(ctx);

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
	 * Run the void enterInterface_definition(Interface_definitionContext)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterInterface_definition_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Interface_definitionContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Interface_definitionContext(
				new ParserRuleContext(), 1);

		fixture.enterInterface_definition(ctx);

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
	 * Run the void enterInterface_definition(Interface_definitionContext)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterInterface_definition_2() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Interface_definitionContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Interface_definitionContext(
				new ParserRuleContext(), 1);

		fixture.enterInterface_definition(ctx);

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
	 * Run the void
	 * enterInterface_method_declaration2(Interface_method_declaration2Context)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterInterface_method_declaration2_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Interface_method_declaration2Context ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Interface_method_declaration2Context(
				new ParserRuleContext(), 1);

		fixture.enterInterface_method_declaration2(ctx);

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
	 * Run the void enterMethod_declaration2(Method_declaration2Context) method
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterMethod_declaration2_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Method_declaration2Context ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Method_declaration2Context(
				new ParserRuleContext(), 1);

		fixture.enterMethod_declaration2(ctx);

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
	 * Run the void enterNamespace_declaration(Namespace_declarationContext)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterNamespace_declaration_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_declarationContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_declarationContext(
				new ParserRuleContext(), 1);

		fixture.enterNamespace_declaration(ctx);

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
	 * Run the void enterNamespace_declaration(Namespace_declarationContext)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterNamespace_declaration_2() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_declarationContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_declarationContext(
				new ParserRuleContext(), 1);

		fixture.enterNamespace_declaration(ctx);

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
	 * Run the void enterNamespace_declaration(Namespace_declarationContext)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterNamespace_declaration_3() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_declarationContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_declarationContext(
				new ParserRuleContext(), 1);

		fixture.enterNamespace_declaration(ctx);

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
	 * Run the void enterNamespace_declaration(Namespace_declarationContext)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterNamespace_declaration_4() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_declarationContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_declarationContext(
				new ParserRuleContext(), 1);

		fixture.enterNamespace_declaration(ctx);

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
	 * Run the void enterNamespace_declaration(Namespace_declarationContext)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterNamespace_declaration_5() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_declarationContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_declarationContext(
				new ParserRuleContext(), 1);

		fixture.enterNamespace_declaration(ctx);

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
	 * Run the void enterNamespace_declaration(Namespace_declarationContext)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterNamespace_declaration_6() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_declarationContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_declarationContext(
				new ParserRuleContext(), 1);

		fixture.enterNamespace_declaration(ctx);

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
	 * Run the void enterOperator_declaration2(Operator_declaration2Context)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterOperator_declaration2_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Operator_declaration2Context ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Operator_declaration2Context(
				new ParserRuleContext(), 1);

		fixture.enterOperator_declaration2(ctx);

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
	 * Run the void enterStruct_definition(Struct_definitionContext) method
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterStruct_definition_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Struct_definitionContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Struct_definitionContext(
				new ParserRuleContext(), 1);

		fixture.enterStruct_definition(ctx);

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
	 * Run the void enterStruct_definition(Struct_definitionContext) method
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testEnterStruct_definition_2() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Struct_definitionContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Struct_definitionContext(
				new ParserRuleContext(), 1);

		fixture.enterStruct_definition(ctx);

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
	 * Run the void exitClass_body(Class_bodyContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testExitClass_body_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Class_bodyContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Class_bodyContext(
				new ParserRuleContext(), 1);

		fixture.exitClass_body(ctx);

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
	 * Run the void exitEnum_body(Enum_bodyContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testExitEnum_body_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Enum_bodyContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Enum_bodyContext(
				new ParserRuleContext(), 1);

		fixture.exitEnum_body(ctx);

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
	 * Run the void exitInterface_body(Interface_bodyContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testExitInterface_body_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Interface_bodyContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Interface_bodyContext(
				new ParserRuleContext(), 1);

		fixture.exitInterface_body(ctx);

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
	 * Run the void exitMethod_body(Method_bodyContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testExitMethod_body_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Method_bodyContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Method_bodyContext(
				new ParserRuleContext(), 1);

		fixture.exitMethod_body(ctx);

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
	 * Run the void exitNamespace_body(Namespace_bodyContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testExitNamespace_body_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_bodyContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_bodyContext(
				new ParserRuleContext(), 1);

		fixture.exitNamespace_body(ctx);

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
	 * Run the void exitOperator_body(Operator_bodyContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testExitOperator_body_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Operator_bodyContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Operator_bodyContext(
				new ParserRuleContext(), 1);

		fixture.exitOperator_body(ctx);

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
	 * Run the void exitStruct_body(Struct_bodyContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	@Test
	public void testExitStruct_body_1() throws Exception {
		final QuamocoCSharpListener fixture = new QuamocoCSharpListener(new FileNode(""));
		final net.siliconcode.parsers.csharp.CSharp6Parser.Struct_bodyContext ctx = new net.siliconcode.parsers.csharp.CSharp6Parser.Struct_bodyContext(
				new ParserRuleContext(), 1);

		fixture.exitStruct_body(ctx);

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
	 * @generatedBy CodePro at 1/31/16 10:24 PM
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
	 * @generatedBy CodePro at 1/31/16 10:24 PM
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
	 * @generatedBy CodePro at 1/31/16 10:24 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(QuamocoCSharpListenerTest.class);
	}
}