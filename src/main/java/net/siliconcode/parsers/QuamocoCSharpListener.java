/**
 * The MIT License (MIT)
 *
 * Sonar Quamoco Plugin
 * Copyright (c) 2015 Isaac Griffith, SiliconCode, LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.siliconcode.parsers;

import java.util.List;
import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.siliconcode.parsers.csharp.CSharp6BaseListener;
import net.siliconcode.parsers.csharp.CSharp6Parser.Class_bodyContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Class_definitionContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Constructor_declaration2Context;
import net.siliconcode.parsers.csharp.CSharp6Parser.Delegate_definitionContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Enum_bodyContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Enum_definitionContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Fixed_parameterContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Fixed_parametersContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Formal_parameter_listContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.IdentifierContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Interface_bodyContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Interface_definitionContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Interface_method_declaration2Context;
import net.siliconcode.parsers.csharp.CSharp6Parser.Method_bodyContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Method_declaration2Context;
import net.siliconcode.parsers.csharp.CSharp6Parser.Method_member_nameContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_bodyContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Namespace_declarationContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Operator_bodyContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Operator_declaration2Context;
import net.siliconcode.parsers.csharp.CSharp6Parser.Parameter_arrayContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Struct_bodyContext;
import net.siliconcode.parsers.csharp.CSharp6Parser.Struct_definitionContext;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.codetree.MethodNode;
import net.siliconcode.quamoco.codetree.TypeNode;
import net.siliconcode.sonar.quamoco.QuamocoSensor;

/**
 * QuamocoListener -
 *
 * @author Isaac Griffith
 */
public class QuamocoCSharpListener extends CSharp6BaseListener {

    private static final Logger    LOG = LoggerFactory.getLogger(QuamocoSensor.class);
    
	transient private final Stack<TypeNode> stack;
	transient private final Stack<MethodNode> methods;
	transient private final Stack<String> namespaces;
	private final FileNode file;

	public QuamocoCSharpListener(final FileNode file) {
		stack = new Stack<>();
		methods = new Stack<>();
		namespaces = new Stack<>();
		this.file = file;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see net.siliconcode.parsers.csharp.CSharp6BaseListener#
	 * enterNamespace_declaration(net.siliconcode.parsers.csharp.CSharp6Parser.
	 * Namespace_declarationContext)
	 */
	@Override
	public void enterNamespace_declaration(final Namespace_declarationContext ctx) {
		final List<IdentifierContext> ids = ctx.qualified_identifier().identifier();
		final StringBuilder builder = new StringBuilder();

		boolean first = true;
		for (final IdentifierContext idx : ids) {
			if (!first) {
				builder.append(".");
			}
			builder.append(idx.IDENTIFIER().getText());
			first = false;
		}
		String name = builder.toString();
		if (!namespaces.isEmpty()) {
			name = namespaces.peek() + "." + name;
		}
		namespaces.push(name);

		super.enterNamespace_declaration(ctx);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * net.siliconcode.parsers.csharp.CSharp6BaseListener#exitNamespace_body(net
	 * .siliconcode.parsers.csharp.CSharp6Parser.Namespace_bodyContext)
	 */
	@Override
	public void exitNamespace_body(final Namespace_bodyContext ctx) {
		super.exitNamespace_body(ctx);
		namespaces.pop();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * net.siliconcode.parser.CSharp4BaseListener#enterClass_definition(net.
	 * siliconcode.parser.CSharp4Parser.Class_definitionContext)
	 */
	@Override
	public void enterClass_definition(final Class_definitionContext ctx) {
		final IdentifierContext itx = ctx.identifier();
		ctx.identifier().IDENTIFIER().getText();
		final String name = itx.getText();
		final String fullName = namespaces.isEmpty() ? name : namespaces.peek() + "." + name;
		final int start = ctx.getStart().getLine();
		final int end = ctx.getStop().getLine();
		
		LOG.info("Name: " + name + " " + "FullName: " + fullName);
		
		final TypeNode ent = new TypeNode(file, fullName == null ? name : fullName, name, true, start, end);
		file.addType(ent);
		stack.push(ent);

		super.enterClass_definition(ctx);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * net.siliconcode.parser.CSharp4BaseListener#enterConstructor_declaration2
	 * (net.siliconcode.parser.CSharp4Parser.Constructor_declaration2Context)
	 */
	@Override
	public void enterConstructor_declaration2(final Constructor_declaration2Context ctx) {
		final IdentifierContext ictx = ctx.identifier();
		String name = ictx.getText();

		name += "(" + getParams(ctx.formal_parameter_list()) + ")";
		final String fullName = stack.peek().getQIdentifier() + "." + name;

		final int start = ctx.getStart().getLine();
		final int end = ctx.getStop().getLine();

		final MethodNode ent = new MethodNode(stack.peek(), name, true, start, end);
		stack.peek().addMethod(ent);
		methods.push(ent);

		super.enterConstructor_declaration2(ctx);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * net.siliconcode.parser.CSharp4BaseListener#enterDelegate_definition(net
	 * .siliconcode.parser.CSharp4Parser.Delegate_definitionContext)
	 */
	@Override
	public void enterDelegate_definition(final Delegate_definitionContext ctx) {
		final String name = ctx.identifier().getText();
		final int start = ctx.getStart().getLine();
		final int end = ctx.getStop().getLine();
		final String fullName = stack.peek().getQIdentifier() + "." + name;
		final MethodNode ent = new MethodNode(stack.peek(), name, false, start, end);
		stack.peek().addMethod(ent);

		super.enterDelegate_definition(ctx);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see net.siliconcode.parser.CSharp4BaseListener#enterEnum_definition(net.
	 * siliconcode.parser.CSharp4Parser.Enum_definitionContext)
	 */
	@Override
	public void enterEnum_definition(final Enum_definitionContext ctx) {
		final String name = ctx.identifier().getText();
		final String fullName = namespaces.isEmpty() ? name : namespaces.peek() + "." + name;
		final int start = ctx.getStart().getLine();
		final int end = ctx.getStop().getLine();
		final TypeNode ent = new TypeNode(file, fullName, name, true, start, end);

		file.addType(ent);
		stack.push(ent);

		super.enterEnum_definition(ctx);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * net.siliconcode.parser.CSharp4BaseListener#enterInterface_definition(
	 * net.siliconcode.parser.CSharp4Parser.Interface_definitionContext)
	 */
	@Override
	public void enterInterface_definition(final Interface_definitionContext ctx) {
		final String name = ctx.identifier().getText();
		final String fullName = namespaces.isEmpty() ? name : namespaces.peek() + "." + name;
		final int start = ctx.getStart().getLine();
		final int end = ctx.getStop().getLine();

		final TypeNode ent = new TypeNode(file, fullName, name, false, start, end);

		stack.push(ent);
		file.addType(ent);

		super.enterInterface_definition(ctx);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see net.siliconcode.parser.CSharp4BaseListener#
	 * enterInterface_method_declaration2 (
	 * net.siliconcode.parser.CSharp4Parser.Interface_method_declaration2Context
	 * )
	 */
	@Override
	public void enterInterface_method_declaration2(final Interface_method_declaration2Context ctx) {
		String name = ctx.identifier().getText();
		name = name + " (" + getParams(ctx.formal_parameter_list()) + ")";
		final String fullName = stack.peek().getQIdentifier() + "." + name;
		final int start = ctx.getStart().getLine();
		final int end = ctx.getStop().getLine();
		final MethodNode ent = new MethodNode(stack.peek(), name, false, start, end);

		stack.peek().addMethod(ent);

		super.enterInterface_method_declaration2(ctx);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * net.siliconcode.parser.CSharp4BaseListener#enterMethod_declaration2(net
	 * .siliconcode.parser.CSharp4Parser.Method_declaration2Context)
	 */
	@Override
	public void enterMethod_declaration2(final Method_declaration2Context ctx) {
		final Method_member_nameContext mmctx = ctx.method_member_name();
		String name = mmctx.getText();

		name += "(" + getParams(ctx.formal_parameter_list()) + ")";
		final String fullName = stack.peek().getQIdentifier() + "." + name;

		final int start = ctx.getStart().getLine();
		final int end = ctx.getStop().getLine();

		final MethodNode ent = new MethodNode(stack.peek(), name, false, start, end);
		stack.peek().addMethod(ent);
		methods.push(ent);

		super.enterMethod_declaration2(ctx);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * net.siliconcode.parser.CSharp4BaseListener#enterOperator_declaration2
	 * (net.siliconcode.parser.CSharp4Parser.Operator_declaration2Context)
	 */
	@Override
	public void enterOperator_declaration2(final Operator_declaration2Context ctx) {
		final String op = ctx.overloadable_operator().getText();
		final int start = ctx.getStart().getLine();
		final int end = ctx.getStop().getLine();
		final String fullName = stack.peek().getQIdentifier() + "." + op;
		final MethodNode ent = new MethodNode(stack.peek(), op, false, start, end);

		methods.push(ent);
		stack.peek().addMethod(ent);

		super.enterOperator_declaration2(ctx);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * net.siliconcode.parser.CSharp4BaseListener#enterStruct_definition(net
	 * .siliconcode.parser.CSharp4Parser.Struct_definitionContext)
	 */
	@Override
	public void enterStruct_definition(final Struct_definitionContext ctx) {
		final String name = ctx.identifier().getText();
		final int start = ctx.getStart().getLine();
		final int end = ctx.getStop().getLine();

		final String fullName = namespaces.isEmpty() ? name : namespaces.peek() + "." + name;
		final TypeNode ent = new TypeNode(file, fullName, name, true, start, end);
		stack.push(ent);
		file.addType(ent);

		super.enterStruct_definition(ctx);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see net.siliconcode.parser.CSharp4BaseListener#enterClass_body(net.
	 * siliconcode .parser.CSharp4Parser.Class_bodyContext)
	 */
	@Override
	public void exitClass_body(final Class_bodyContext ctx) {
		super.exitClass_body(ctx);
		stack.pop();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * net.siliconcode.parser.CSharp4BaseListener#enterEnum_body(net.siliconcode
	 * .parser.CSharp4Parser.Enum_bodyContext)
	 */
	@Override
	public void exitEnum_body(final Enum_bodyContext ctx) {
		super.exitEnum_body(ctx);
		stack.pop();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see net.siliconcode.parser.CSharp4BaseListener#enterInterface_body(net.
	 * siliconcode.parser.CSharp4Parser.Interface_bodyContext)
	 */
	@Override
	public void exitInterface_body(final Interface_bodyContext ctx) {
		super.exitInterface_body(ctx);
		stack.pop();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see net.siliconcode.parser.CSharp4BaseListener#enterMethod_body(net.
	 * siliconcode .parser.CSharp4Parser.Method_bodyContext)
	 */
	@Override
	public void exitMethod_body(final Method_bodyContext ctx) {
		super.exitMethod_body(ctx);
		methods.pop();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see net.siliconcode.parser.CSharp4BaseListener#enterOperator_body(net.
	 * siliconcode .parser.CSharp4Parser.Operator_bodyContext)
	 */
	@Override
	public void exitOperator_body(final Operator_bodyContext ctx) {
		super.exitOperator_body(ctx);
		methods.pop();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see net.siliconcode.parser.CSharp4BaseListener#enterStruct_body(net.
	 * siliconcode .parser.CSharp4Parser.Struct_bodyContext)
	 */
	@Override
	public void exitStruct_body(final Struct_bodyContext ctx) {
		super.exitStruct_body(ctx);
		stack.pop();
	}

	/**
	 * @param ctx
	 * @return
	 */
	private String getParams(final Formal_parameter_listContext ctx) {
		String retVal = "";
		if (ctx != null) {
			final Fixed_parametersContext fpc = ctx.fixed_parameters();
			if (fpc != null) {
				final StringBuilder builder = new StringBuilder();
				String type = null;
				for (final Fixed_parameterContext pc : fpc.fixed_parameter()) {
					type = pc.type().getText();
					builder.append(type + ", ");
				}
				retVal = builder.toString();
			}
			final Parameter_arrayContext pac = ctx.parameter_array();
			if (pac != null) {
				final String type = pac.array_type().base_type().getText();
				retVal += type;
			}
			if (retVal.endsWith(", ")) {
				retVal = retVal.substring(0, retVal.length() - 2);
			}
		}
		return retVal;
	}

}
