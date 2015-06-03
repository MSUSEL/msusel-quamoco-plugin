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
package net.siliconcode.parser;

import java.util.Stack;

import net.siliconcode.parser.CSharp4Parser.All_member_modifierContext;
import net.siliconcode.parser.CSharp4Parser.All_member_modifiersContext;
import net.siliconcode.parser.CSharp4Parser.Class_bodyContext;
import net.siliconcode.parser.CSharp4Parser.Class_definitionContext;
import net.siliconcode.parser.CSharp4Parser.Constructor_declaration2Context;
import net.siliconcode.parser.CSharp4Parser.Delegate_definitionContext;
import net.siliconcode.parser.CSharp4Parser.Enum_bodyContext;
import net.siliconcode.parser.CSharp4Parser.Enum_definitionContext;
import net.siliconcode.parser.CSharp4Parser.Event_declaration2Context;
import net.siliconcode.parser.CSharp4Parser.Field_declaration2Context;
import net.siliconcode.parser.CSharp4Parser.Fixed_parameterContext;
import net.siliconcode.parser.CSharp4Parser.Fixed_parametersContext;
import net.siliconcode.parser.CSharp4Parser.Formal_parameter_listContext;
import net.siliconcode.parser.CSharp4Parser.IdentifierContext;
import net.siliconcode.parser.CSharp4Parser.Interface_bodyContext;
import net.siliconcode.parser.CSharp4Parser.Interface_definitionContext;
import net.siliconcode.parser.CSharp4Parser.Interface_method_declaration2Context;
import net.siliconcode.parser.CSharp4Parser.Interface_property_declaration2Context;
import net.siliconcode.parser.CSharp4Parser.Member_nameContext;
import net.siliconcode.parser.CSharp4Parser.Method_bodyContext;
import net.siliconcode.parser.CSharp4Parser.Method_declaration2Context;
import net.siliconcode.parser.CSharp4Parser.Method_member_nameContext;
import net.siliconcode.parser.CSharp4Parser.Operator_bodyContext;
import net.siliconcode.parser.CSharp4Parser.Operator_declaration2Context;
import net.siliconcode.parser.CSharp4Parser.Parameter_arrayContext;
import net.siliconcode.parser.CSharp4Parser.Property_declaration2Context;
import net.siliconcode.parser.CSharp4Parser.Property_declarationContext;
import net.siliconcode.parser.CSharp4Parser.StatementContext;
import net.siliconcode.parser.CSharp4Parser.Struct_bodyContext;
import net.siliconcode.parser.CSharp4Parser.Struct_definitionContext;
import net.siliconcode.parser.CSharp4Parser.Variable_declaratorContext;
import net.siliconcode.parser.CSharp4Parser.Variable_declaratorsContext;
import net.siliconcode.sonar.quamoco.code.CodeEntity;
import net.siliconcode.sonar.quamoco.code.CodeEntityType;
import net.siliconcode.sonar.quamoco.code.CodeTree;

/**
 * QuamocoListener -
 *
 * @author Isaac Griffith
 */
public class QuamocoCSharpListener extends CSharp4BaseListener {

    transient private final Stack<CodeEntity> stack;
    private final CodeTree                    tree;
    transient private final Stack<CodeEntity> methods;

    public QuamocoCSharpListener()
    {
        tree = new CodeTree();
        stack = new Stack<>();
        methods = new Stack<>();
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterClass_body(net.siliconcode
     * .parser.CSharp4Parser.Class_bodyContext)
     */
    @Override
    public void enterClass_body(final Class_bodyContext ctx)
    {
        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();
        stack.peek().setStart(start);
        stack.peek().setEnd(end);

        super.enterClass_body(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterClass_definition(net.
     * siliconcode.parser.CSharp4Parser.Class_definitionContext)
     */
    @Override
    public void enterClass_definition(final Class_definitionContext ctx)
    {
        final IdentifierContext itx = ctx.identifier();
        final String name = itx.getText();

        final CodeEntity ent = new CodeEntity(name, CodeEntityType.CLASS, 0, 0);
        tree.addRoot(ent);
        stack.push(ent);

        super.enterClass_definition(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterConstructor_declaration2
     * (net.siliconcode.parser.CSharp4Parser.Constructor_declaration2Context)
     */
    @Override
    public void enterConstructor_declaration2(final Constructor_declaration2Context ctx)
    {
        final IdentifierContext ictx = ctx.identifier();
        String name = ictx.getText();

        name += "(" + getParams(ctx.formal_parameter_list()) + ")";

        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();

        final CodeEntity ent = new CodeEntity(name, CodeEntityType.CONSTRUCTOR, start, end);
        stack.peek().addChild(ent);
        methods.push(ent);

        super.enterConstructor_declaration2(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterDelegate_definition(net
     * .siliconcode.parser.CSharp4Parser.Delegate_definitionContext)
     */
    @Override
    public void enterDelegate_definition(final Delegate_definitionContext ctx)
    {
        final String name = ctx.identifier().getText();
        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();

        final CodeEntity ent = new CodeEntity(name, CodeEntityType.DELEGATE, start, end);
        ent.setLoc(end - start + 1);
        stack.peek().addChild(ent);

        super.enterDelegate_definition(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterEnum_body(net.siliconcode
     * .parser.CSharp4Parser.Enum_bodyContext)
     */
    @Override
    public void enterEnum_body(final Enum_bodyContext ctx)
    {
        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();
        stack.peek().setStart(start);
        stack.peek().setEnd(end);

        super.enterEnum_body(ctx);
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.parser.CSharp4BaseListener#enterEnum_definition(net.
     * siliconcode.parser.CSharp4Parser.Enum_definitionContext)
     */
    @Override
    public void enterEnum_definition(final Enum_definitionContext ctx)
    {
        final String name = ctx.identifier().getText();

        final CodeEntity ent = new CodeEntity(name, CodeEntityType.ENUM, 0, 0);
        tree.addRoot(ent);
        stack.push(ent);

        super.enterEnum_definition(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterEvent_declaration2(net
     * .siliconcode.parser.CSharp4Parser.Event_declaration2Context)
     */
    @Override
    public void enterEvent_declaration2(final Event_declaration2Context ctx)
    {
        final String name = ctx.member_name().getText();
        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();

        final CodeEntity ent = new CodeEntity(name, CodeEntityType.EVENT, start, end);

        super.enterEvent_declaration2(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterField_declaration2(net
     * .siliconcode.parser.CSharp4Parser.Field_declaration2Context)
     */
    @Override
    public void enterField_declaration2(final Field_declaration2Context ctx)
    {
        final Variable_declaratorsContext vdctx = ctx.variable_declarators();
        String name = null;
        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();

        final All_member_modifiersContext ammctx = ctx.getParent().getParent()
                .getChild(All_member_modifiersContext.class, 0);
        boolean isStatic = false;
        if (ammctx != null)
        {
            for (final All_member_modifierContext amm : ammctx.all_member_modifier())
            {
                if (amm.STATIC() != null)
                {
                    isStatic = true;
                    break;
                }
            }
        }

        for (final Variable_declaratorContext v : vdctx.variable_declarator())
        {
            final IdentifierContext itx = v.identifier();
            name = itx.getText();
            final CodeEntity ent = new CodeEntity(name, CodeEntityType.FIELD, start, end);
            ent.setLoc(end - start + 1);
            stack.peek().addChild(ent);
        }

        super.enterField_declaration2(ctx);
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.parser.CSharp4BaseListener#enterInterface_body(net.
     * siliconcode.parser.CSharp4Parser.Interface_bodyContext)
     */
    @Override
    public void enterInterface_body(final Interface_bodyContext ctx)
    {
        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();

        stack.peek().setStart(start);
        stack.peek().setEnd(end);

        super.enterInterface_body(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterInterface_definition(
     * net.siliconcode.parser.CSharp4Parser.Interface_definitionContext)
     */
    @Override
    public void enterInterface_definition(final Interface_definitionContext ctx)
    {
        final String name = ctx.identifier().getText();

        final CodeEntity ent = new CodeEntity(name, CodeEntityType.INTERFACE, 0, 0);
        stack.push(ent);
        tree.addRoot(ent);

        super.enterInterface_definition(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterInterface_method_declaration2
     * (
     * net.siliconcode.parser.CSharp4Parser.Interface_method_declaration2Context
     * )
     */
    @Override
    public void enterInterface_method_declaration2(final Interface_method_declaration2Context ctx)
    {
        String name = ctx.identifier().getText();
        name = name + " (" + getParams(ctx.formal_parameter_list()) + ")";
        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();
        final CodeEntity ent = new CodeEntity(name, CodeEntityType.METHOD, start, end);
        ent.setLoc(end - start + 1);
        stack.peek().addChild(ent);

        super.enterInterface_method_declaration2(ctx);
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.parser.CSharp4BaseListener#
     * enterInterface_property_declaration2
     * (net.siliconcode.parser.CSharp4Parser.
     * Interface_property_declaration2Context)
     */
    @Override
    public void enterInterface_property_declaration2(final Interface_property_declaration2Context ctx)
    {
        final String name = ctx.identifier().getText();
        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();
        final CodeEntity ent = new CodeEntity(name, CodeEntityType.PROPERTY, start, end);
        ent.setLoc(end - start + 1);
        stack.peek().addChild(ent);

        super.enterInterface_property_declaration2(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterMethod_body(net.siliconcode
     * .parser.CSharp4Parser.Method_bodyContext)
     */
    @Override
    public void enterMethod_body(final Method_bodyContext ctx)
    {
        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();
        methods.peek().setStart(start);
        methods.peek().setEnd(end);
        super.enterMethod_body(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterMethod_declaration2(net
     * .siliconcode.parser.CSharp4Parser.Method_declaration2Context)
     */
    @Override
    public void enterMethod_declaration2(final Method_declaration2Context ctx)
    {
        final Method_member_nameContext mmctx = ctx.method_member_name();
        String name = mmctx.getText();

        name += "(" + getParams(ctx.formal_parameter_list()) + ")";

        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();

        final CodeEntity ent = new CodeEntity(name, CodeEntityType.METHOD, start, end);
        stack.peek().addChild(ent);
        methods.push(ent);

        final All_member_modifiersContext ammctx = ctx.getParent().getParent()
                .getChild(All_member_modifiersContext.class, 0);
        if (ammctx != null)
        {
            for (final All_member_modifierContext amm : ammctx.all_member_modifier())
            {
                if (amm.STATIC() != null)
                {
                    ent.setStatic(true);
                    break;
                }
            }
        }

        super.enterMethod_declaration2(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterOperator_body(net.siliconcode
     * .parser.CSharp4Parser.Operator_bodyContext)
     */
    @Override
    public void enterOperator_body(final Operator_bodyContext ctx)
    {
        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();
        methods.peek().setStart(start);
        methods.peek().setEnd(end);

        super.enterOperator_body(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterOperator_declaration2
     * (net.siliconcode.parser.CSharp4Parser.Operator_declaration2Context)
     */
    @Override
    public void enterOperator_declaration2(final Operator_declaration2Context ctx)
    {
        final String op = ctx.overloadable_operator().getText();

        final CodeEntity ent = new CodeEntity(op, CodeEntityType.OPERATOR, 0, 0);
        methods.push(ent);
        stack.peek().addChild(ent);

        super.enterOperator_declaration2(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterProperty_declaration(
     * net.siliconcode.parser.CSharp4Parser.Property_declarationContext)
     */
    @Override
    public void enterProperty_declaration(final Property_declarationContext ctx)
    {
        final Member_nameContext itx = ctx.member_name();
        super.enterProperty_declaration(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterProperty_declaration2
     * (net.siliconcode.parser.CSharp4Parser.Property_declaration2Context)
     */
    @Override
    public void enterProperty_declaration2(final Property_declaration2Context ctx)
    {
        final Member_nameContext itx = ctx.member_name();
        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();
        final CodeEntity ent = new CodeEntity(itx.getText(), CodeEntityType.PROPERTY, start, end);
        ent.setLoc(end - start + 1);
        stack.peek().addChild(ent);
        super.enterProperty_declaration2(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterStatement(net.siliconcode
     * .parser.CSharp4Parser.StatementContext)
     */
    @Override
    public void enterStatement(final StatementContext ctx)
    {
        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();
        final int length = end - start + 1;

        final CodeEntity ent = new CodeEntity("STATEMENT", CodeEntityType.STATEMENT, start, end);
        ent.setLoc(length);
        if (methods.isEmpty())
        {
            stack.peek().addChild(ent);
        }
        else
        {
            methods.peek().addChild(ent);
        }

        super.enterStatement(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterStruct_body(net.siliconcode
     * .parser.CSharp4Parser.Struct_bodyContext)
     */
    @Override
    public void enterStruct_body(final Struct_bodyContext ctx)
    {
        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();
        stack.peek().setStart(start);
        stack.peek().setEnd(end);

        super.enterStruct_body(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterStruct_definition(net
     * .siliconcode.parser.CSharp4Parser.Struct_definitionContext)
     */
    @Override
    public void enterStruct_definition(final Struct_definitionContext ctx)
    {
        final String name = ctx.identifier().getText();
        final int start = ctx.getStart().getLine();
        final int end = ctx.getStop().getLine();

        final CodeEntity ent = new CodeEntity(name, CodeEntityType.STRUCT, start, end);
        stack.push(ent);

        super.enterStruct_definition(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterClass_body(net.siliconcode
     * .parser.CSharp4Parser.Class_bodyContext)
     */
    @Override
    public void exitClass_body(final Class_bodyContext ctx)
    {
        super.exitClass_body(ctx);

        stack.pop();
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterEnum_body(net.siliconcode
     * .parser.CSharp4Parser.Enum_bodyContext)
     */
    @Override
    public void exitEnum_body(final Enum_bodyContext ctx)
    {
        super.exitEnum_body(ctx);

        stack.pop();
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.parser.CSharp4BaseListener#enterInterface_body(net.
     * siliconcode.parser.CSharp4Parser.Interface_bodyContext)
     */
    @Override
    public void exitInterface_body(final Interface_bodyContext ctx)
    {
        super.exitInterface_body(ctx);
        stack.pop();
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterMethod_body(net.siliconcode
     * .parser.CSharp4Parser.Method_bodyContext)
     */
    @Override
    public void exitMethod_body(final Method_bodyContext ctx)
    {
        super.exitMethod_body(ctx);
        methods.pop();
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterOperator_body(net.siliconcode
     * .parser.CSharp4Parser.Operator_bodyContext)
     */
    @Override
    public void exitOperator_body(final Operator_bodyContext ctx)
    {
        super.exitOperator_body(ctx);
        methods.pop();
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterStruct_body(net.siliconcode
     * .parser.CSharp4Parser.Struct_bodyContext)
     */
    @Override
    public void exitStruct_body(final Struct_bodyContext ctx)
    {
        super.exitStruct_body(ctx);
        stack.pop();
    }

    /**
     * @param ctx
     * @return
     */
    private String getParams(final Formal_parameter_listContext ctx)
    {
        String retVal = "";
        if (ctx != null)
        {
            final Fixed_parametersContext fpc = ctx.fixed_parameters();
            if (fpc != null)
            {
                final StringBuilder builder = new StringBuilder();
                String name = null;
                String type = null;
                for (final Fixed_parameterContext pc : fpc.fixed_parameter())
                {
                    type = pc.type().getText();
                    name = pc.identifier().getText();
                    builder.append(type + " " + name + ", ");
                }
                retVal = builder.toString();
            }
            final Parameter_arrayContext pac = ctx.parameter_array();
            if (pac != null)
            {
                final String name = pac.identifier().getText();
                final String type = pac.array_type().base_type().getText();
                retVal += type + " " + name;
            }
            if (retVal.endsWith(", "))
            {
                retVal = retVal.substring(0, retVal.length() - 2);
            }
        }
        return retVal;
    }

    /**
     * @return the tree
     */
    public CodeTree getTree()
    {
        return tree;
    }

}
