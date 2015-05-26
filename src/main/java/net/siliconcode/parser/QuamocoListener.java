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
public class QuamocoListener extends CSharp4BaseListener {

    /**
     * @return the tree
     */
    public CodeTree getTree()
    {
        return tree;
    }

    private Stack<CodeEntity> stack;
    private CodeTree          tree;
    private Stack<CodeEntity> methods;

    public QuamocoListener()
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
    public void enterClass_body(Class_bodyContext ctx)
    {
        int start = ctx.getStart().getLine();
        int end = ctx.getStop().getLine();
        stack.peek().setStart(start);
        stack.peek().setEnd(end);

        super.enterClass_body(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterClass_body(net.siliconcode
     * .parser.CSharp4Parser.Class_bodyContext)
     */
    @Override
    public void exitClass_body(Class_bodyContext ctx)
    {
        super.exitClass_body(ctx);

        stack.pop();
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterClass_definition(net.
     * siliconcode.parser.CSharp4Parser.Class_definitionContext)
     */
    @Override
    public void enterClass_definition(Class_definitionContext ctx)
    {
        IdentifierContext itx = ctx.identifier();
        String name = itx.getText();

        CodeEntity ent = new CodeEntity(name, CodeEntityType.CLASS, 0, 0);
        tree.addRoot(ent);
        stack.push(ent);

        super.enterClass_definition(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterEnum_body(net.siliconcode
     * .parser.CSharp4Parser.Enum_bodyContext)
     */
    @Override
    public void enterEnum_body(Enum_bodyContext ctx)
    {
        int start = ctx.getStart().getLine();
        int end = ctx.getStop().getLine();
        stack.peek().setStart(start);
        stack.peek().setEnd(end);

        super.enterEnum_body(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterEnum_body(net.siliconcode
     * .parser.CSharp4Parser.Enum_bodyContext)
     */
    @Override
    public void exitEnum_body(Enum_bodyContext ctx)
    {
        super.exitEnum_body(ctx);

        stack.pop();
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.parser.CSharp4BaseListener#enterEnum_definition(net.
     * siliconcode.parser.CSharp4Parser.Enum_definitionContext)
     */
    @Override
    public void enterEnum_definition(Enum_definitionContext ctx)
    {
        String name = ctx.identifier().getText();

        CodeEntity ent = new CodeEntity(name, CodeEntityType.ENUM, 0, 0);
        tree.addRoot(ent);
        stack.push(ent);

        super.enterEnum_definition(ctx);
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.parser.CSharp4BaseListener#enterInterface_body(net.
     * siliconcode.parser.CSharp4Parser.Interface_bodyContext)
     */
    @Override
    public void enterInterface_body(Interface_bodyContext ctx)
    {
        int start = ctx.getStart().getLine();
        int end = ctx.getStop().getLine();

        stack.peek().setStart(start);
        stack.peek().setEnd(end);

        super.enterInterface_body(ctx);
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.parser.CSharp4BaseListener#enterInterface_body(net.
     * siliconcode.parser.CSharp4Parser.Interface_bodyContext)
     */
    @Override
    public void exitInterface_body(Interface_bodyContext ctx)
    {
        super.exitInterface_body(ctx);
        stack.pop();
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterInterface_definition(
     * net.siliconcode.parser.CSharp4Parser.Interface_definitionContext)
     */
    @Override
    public void enterInterface_definition(Interface_definitionContext ctx)
    {
        String name = ctx.identifier().getText();

        CodeEntity ent = new CodeEntity(name, CodeEntityType.INTERFACE, 0, 0);
        stack.push(ent);
        tree.addRoot(ent);

        super.enterInterface_definition(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterStatement(net.siliconcode
     * .parser.CSharp4Parser.StatementContext)
     */
    @Override
    public void enterStatement(StatementContext ctx)
    {
        int start = ctx.getStart().getLine();
        int end = ctx.getStop().getLine();
        int length = end - start + 1;

        CodeEntity ent = new CodeEntity("STATEMENT", CodeEntityType.STATEMENT, start, end);
        ent.setLoc(length);
        methods.peek().addChild(ent);

        super.enterStatement(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterField_declaration2(net
     * .siliconcode.parser.CSharp4Parser.Field_declaration2Context)
     */
    @Override
    public void enterField_declaration2(Field_declaration2Context ctx)
    {
        Variable_declaratorsContext vdctx = ctx.variable_declarators();
        String name = null;
        int start = ctx.getStart().getLine();
        int end = ctx.getStop().getLine();
        for (Variable_declaratorContext v : vdctx.variable_declarator())
        {
            IdentifierContext itx = v.identifier();
            if (itx != null)
            {
                name = itx.getText();
                System.out.println("Field  identifier: " + itx.getText());
            }
        }

        CodeEntity ent = new CodeEntity(name, CodeEntityType.FIELD, start, end);
        ent.setLoc(end - start + 1);
        All_member_modifiersContext ammctx = ctx.getParent().getParent().getChild(All_member_modifiersContext.class, 0);
        if (ammctx != null)
        {
            for (All_member_modifierContext amm : ammctx.all_member_modifier())
            {
                if (amm.STATIC() != null)
                {
                    ent.setStatic(true);
                    break;
                }
            }
        }

        stack.peek().addChild(ent);

        super.enterField_declaration2(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterMethod_body(net.siliconcode
     * .parser.CSharp4Parser.Method_bodyContext)
     */
    @Override
    public void enterMethod_body(Method_bodyContext ctx)
    {
        int start = ctx.getStart().getLine();
        int end = ctx.getStop().getLine();
        methods.peek().setStart(start);
        methods.peek().setEnd(end);
        super.enterMethod_body(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterMethod_body(net.siliconcode
     * .parser.CSharp4Parser.Method_bodyContext)
     */
    @Override
    public void exitMethod_body(Method_bodyContext ctx)
    {
        super.exitMethod_body(ctx);
        methods.pop();
    }

    /**
     * @param ctx
     * @return
     */
    private String getParams(Formal_parameter_listContext ctx)
    {
        String retVal = "";
        if (ctx != null)
        {
            Fixed_parametersContext fpc = ctx.fixed_parameters();
            if (fpc != null)
            {
                StringBuilder builder = new StringBuilder();
                String name = null;
                String type = null;
                for (Fixed_parameterContext pc : fpc.fixed_parameter())
                {
                    type = pc.type().getText();
                    name = pc.identifier().getText();
                    builder.append(type + " " + name + ", ");
                }
                retVal = builder.toString();
            }
            Parameter_arrayContext pac = ctx.parameter_array();
            if (pac != null)
            {
                String name = pac.identifier().getText();
                String type = pac.array_type().base_type().getText();
                retVal += type + " " + name;
            }
            if (retVal.endsWith(", "))
                retVal = retVal.substring(0, retVal.length() - 2);
        }
        return retVal;
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterMethod_declaration2(net
     * .siliconcode.parser.CSharp4Parser.Method_declaration2Context)
     */
    @Override
    public void enterMethod_declaration2(Method_declaration2Context ctx)
    {
        Method_member_nameContext mmctx = ctx.method_member_name();
        String name = mmctx.getText();

        name += "(" + getParams(ctx.formal_parameter_list()) + ")";
        System.out.println("Method Name: " + name);

        int start = ctx.getStart().getLine();
        int end = ctx.getStop().getLine();

        CodeEntity ent = new CodeEntity(name, CodeEntityType.METHOD, start, end);
        stack.peek().addChild(ent);
        methods.push(ent);

        All_member_modifiersContext ammctx = ctx.getParent().getParent().getChild(All_member_modifiersContext.class, 0);
        if (ammctx != null)
        {
            for (All_member_modifierContext amm : ammctx.all_member_modifier())
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
     * net.siliconcode.parser.CSharp4BaseListener#enterConstructor_declaration2
     * (net.siliconcode.parser.CSharp4Parser.Constructor_declaration2Context)
     */
    @Override
    public void enterConstructor_declaration2(Constructor_declaration2Context ctx)
    {
        IdentifierContext ictx = ctx.identifier();
        String name = ictx.getText();

        name += "(" + getParams(ctx.formal_parameter_list()) + ")";
        System.out.println("Constructor Name: " + name);

        int start = ctx.getStart().getLine();
        int end = ctx.getStop().getLine();

        CodeEntity ent = new CodeEntity(name, CodeEntityType.CONSTRUCTOR, start, end);
        stack.peek().addChild(ent);
        methods.push(ent);

        super.enterConstructor_declaration2(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterProperty_declaration(
     * net.siliconcode.parser.CSharp4Parser.Property_declarationContext)
     */
    @Override
    public void enterProperty_declaration(Property_declarationContext ctx)
    {
        System.out.println("Property");
        Member_nameContext itx = ctx.member_name();
        if (itx != null)
            System.out.println("Prop2  identifier: " + itx.getText());
        super.enterProperty_declaration(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterProperty_declaration2
     * (net.siliconcode.parser.CSharp4Parser.Property_declaration2Context)
     */
    @Override
    public void enterProperty_declaration2(Property_declaration2Context ctx)
    {
        System.out.println("Property2");
        Member_nameContext itx = ctx.member_name();
        if (itx != null)
            System.out.println("Prop2  identifier: " + itx.getText());
        super.enterProperty_declaration2(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterDelegate_definition(net
     * .siliconcode.parser.CSharp4Parser.Delegate_definitionContext)
     */
    @Override
    public void enterDelegate_definition(Delegate_definitionContext ctx)
    {
        String name = ctx.identifier().getText();
        int start = ctx.getStart().getLine();
        int end = ctx.getStop().getLine();

        CodeEntity ent = new CodeEntity(name, CodeEntityType.DELEGATE, start, end);
        ent.setLoc(end - start + 1);
        stack.peek().addChild(ent);

        super.enterDelegate_definition(ctx);
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
    public void enterInterface_method_declaration2(Interface_method_declaration2Context ctx)
    {
        String name = ctx.identifier().getText();
        name = name + " (" + getParams(ctx.formal_parameter_list()) + ")";
        int start = ctx.getStart().getLine();
        int end = ctx.getStop().getLine();
        CodeEntity ent = new CodeEntity(name, CodeEntityType.METHOD, start, end);
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
    public void enterInterface_property_declaration2(Interface_property_declaration2Context ctx)
    {
        String name = ctx.identifier().getText();
        int start = ctx.getStart().getLine();
        int end = ctx.getStop().getLine();
        CodeEntity ent = new CodeEntity(name, CodeEntityType.PROPERTY, start, end);
        ent.setLoc(end - start + 1);
        stack.peek().addChild(ent);

        super.enterInterface_property_declaration2(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterStruct_body(net.siliconcode
     * .parser.CSharp4Parser.Struct_bodyContext)
     */
    @Override
    public void enterStruct_body(Struct_bodyContext ctx)
    {
        int start = ctx.getStart().getLine();
        int end = ctx.getStop().getLine();
        stack.peek().setStart(start);
        stack.peek().setEnd(end);

        super.enterStruct_body(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterStruct_body(net.siliconcode
     * .parser.CSharp4Parser.Struct_bodyContext)
     */
    @Override
    public void exitStruct_body(Struct_bodyContext ctx)
    {
        super.exitStruct_body(ctx);
        stack.pop();
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterStruct_definition(net
     * .siliconcode.parser.CSharp4Parser.Struct_definitionContext)
     */
    @Override
    public void enterStruct_definition(Struct_definitionContext ctx)
    {
        String name = ctx.identifier().getText();
        int start = ctx.getStart().getLine();
        int end = ctx.getStop().getLine();

        CodeEntity ent = new CodeEntity(name, CodeEntityType.STRUCT, start, end);
        stack.push(ent);

        super.enterStruct_definition(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterEvent_declaration2(net
     * .siliconcode.parser.CSharp4Parser.Event_declaration2Context)
     */
    @Override
    public void enterEvent_declaration2(Event_declaration2Context ctx)
    {
        String name = ctx.member_name().getText();
        int start = ctx.getStart().getLine();
        int end = ctx.getStop().getLine();

        CodeEntity ent = new CodeEntity(name, CodeEntityType.EVENT, start, end);

        super.enterEvent_declaration2(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterOperator_body(net.siliconcode
     * .parser.CSharp4Parser.Operator_bodyContext)
     */
    @Override
    public void enterOperator_body(Operator_bodyContext ctx)
    {
        int start = ctx.getStart().getLine();
        int end = ctx.getStop().getLine();
        methods.peek().setStart(start);
        methods.peek().setEnd(end);

        super.enterOperator_body(ctx);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterOperator_body(net.siliconcode
     * .parser.CSharp4Parser.Operator_bodyContext)
     */
    @Override
    public void exitOperator_body(Operator_bodyContext ctx)
    {
        super.exitOperator_body(ctx);
        methods.pop();
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.parser.CSharp4BaseListener#enterOperator_declaration2
     * (net.siliconcode.parser.CSharp4Parser.Operator_declaration2Context)
     */
    @Override
    public void enterOperator_declaration2(Operator_declaration2Context ctx)
    {
        String op = ctx.overloadable_operator().getText();

        CodeEntity ent = new CodeEntity(op, CodeEntityType.OPERATOR, 0, 0);
        methods.push(ent);
        stack.peek().addChild(ent);

        super.enterOperator_declaration2(ctx);
    }

}
