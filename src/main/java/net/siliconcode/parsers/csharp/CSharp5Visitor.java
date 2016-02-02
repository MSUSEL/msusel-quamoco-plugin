// Generated from csharp/CSharp5.g4 by ANTLR 4.5.1
package net.siliconcode.parsers.csharp;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSharp5Parser}.
 *
 * @param <T>
 *            The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface CSharp5Visitor<T> extends ParseTreeVisitor<T> {

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#namespace_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamespace_name(CSharp5Parser.Namespace_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#type_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_name(CSharp5Parser.Type_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#identifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIdentifier(CSharp5Parser.IdentifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#namespace_or_type_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamespace_or_type_name(CSharp5Parser.Namespace_or_type_nameContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#type_argument_list_opt}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_argument_list_opt(CSharp5Parser.Type_argument_list_optContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType(CSharp5Parser.TypeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#base_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBase_type(CSharp5Parser.Base_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#simple_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSimple_type(CSharp5Parser.Simple_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#numeric_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNumeric_type(CSharp5Parser.Numeric_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#integral_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIntegral_type(CSharp5Parser.Integral_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#floating_point_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFloating_point_type(CSharp5Parser.Floating_point_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#nullable_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNullable_type(CSharp5Parser.Nullable_typeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#non_nullable_value_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNon_nullable_value_type(CSharp5Parser.Non_nullable_value_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#reference_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitReference_type(CSharp5Parser.Reference_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#class_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_type(CSharp5Parser.Class_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#interface_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_type(CSharp5Parser.Interface_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#delegate_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDelegate_type(CSharp5Parser.Delegate_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#type_argument_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_argument_list(CSharp5Parser.Type_argument_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#type_arguments}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_arguments(CSharp5Parser.Type_argumentsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#type_argument}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_argument(CSharp5Parser.Type_argumentContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#type_void}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_void(CSharp5Parser.Type_voidContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#variable_reference}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariable_reference(CSharp5Parser.Variable_referenceContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#argument_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArgument_list(CSharp5Parser.Argument_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#argument}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArgument(CSharp5Parser.ArgumentContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#argument_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArgument_name(CSharp5Parser.Argument_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#argument_value}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArgument_value(CSharp5Parser.Argument_valueContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#primary_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPrimary_expression(CSharp5Parser.Primary_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#primary_expression_start}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPrimary_expression_start(CSharp5Parser.Primary_expression_startContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#bracket_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBracket_expression(CSharp5Parser.Bracket_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#simple_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSimple_name(CSharp5Parser.Simple_nameContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#parenthesized_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitParenthesized_expression(CSharp5Parser.Parenthesized_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#member_access}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMember_access(CSharp5Parser.Member_accessContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#predefined_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPredefined_type(CSharp5Parser.Predefined_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#expression_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExpression_list(CSharp5Parser.Expression_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#this_access}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitThis_access(CSharp5Parser.This_accessContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#base_access}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBase_access(CSharp5Parser.Base_accessContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#object_creation_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitObject_creation_expression(CSharp5Parser.Object_creation_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#object_or_collection_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitObject_or_collection_initializer(CSharp5Parser.Object_or_collection_initializerContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#object_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitObject_initializer(CSharp5Parser.Object_initializerContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#member_initializer_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMember_initializer_list(CSharp5Parser.Member_initializer_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#member_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMember_initializer(CSharp5Parser.Member_initializerContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#initializer_value}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInitializer_value(CSharp5Parser.Initializer_valueContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#collection_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCollection_initializer(CSharp5Parser.Collection_initializerContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#element_initializer_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitElement_initializer_list(CSharp5Parser.Element_initializer_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#element_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitElement_initializer(CSharp5Parser.Element_initializerContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#array_creation_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArray_creation_expression(CSharp5Parser.Array_creation_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#delegate_creation_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDelegate_creation_expression(CSharp5Parser.Delegate_creation_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#anonymous_object_creation_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAnonymous_object_creation_expression(CSharp5Parser.Anonymous_object_creation_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#anonymous_object_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAnonymous_object_initializer(CSharp5Parser.Anonymous_object_initializerContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#member_declarator_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMember_declarator_list(CSharp5Parser.Member_declarator_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#member_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMember_declarator(CSharp5Parser.Member_declaratorContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#typeof_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitTypeof_expression(CSharp5Parser.Typeof_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#unbound_type_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnbound_type_name(CSharp5Parser.Unbound_type_nameContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#generic_dimension_specifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGeneric_dimension_specifier(CSharp5Parser.Generic_dimension_specifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#commas}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCommas(CSharp5Parser.CommasContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#checked_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitChecked_expression(CSharp5Parser.Checked_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#unchecked_expression}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnchecked_expression(CSharp5Parser.Unchecked_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#default_value_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDefault_value_expression(CSharp5Parser.Default_value_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#unary_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnary_expression(CSharp5Parser.Unary_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#scan_for_cast_generic_precedence}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitScan_for_cast_generic_precedence(CSharp5Parser.Scan_for_cast_generic_precedenceContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#cast_disambiguation_token}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCast_disambiguation_token(CSharp5Parser.Cast_disambiguation_tokenContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#pre_increment_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPre_increment_expression(CSharp5Parser.Pre_increment_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#pre_decrement_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPre_decrement_expression(CSharp5Parser.Pre_decrement_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#cast_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCast_expression(CSharp5Parser.Cast_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#multiplicative_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMultiplicative_expression(CSharp5Parser.Multiplicative_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#additive_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAdditive_expression(CSharp5Parser.Additive_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#shift_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitShift_expression(CSharp5Parser.Shift_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#relational_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRelational_expression(CSharp5Parser.Relational_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#scan_for_shift_generic_precedence}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitScan_for_shift_generic_precedence(CSharp5Parser.Scan_for_shift_generic_precedenceContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#shift_disambiguation_token}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitShift_disambiguation_token(CSharp5Parser.Shift_disambiguation_tokenContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#isType}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIsType(CSharp5Parser.IsTypeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#is_disambiguation_token}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIs_disambiguation_token(CSharp5Parser.Is_disambiguation_tokenContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#equality_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEquality_expression(CSharp5Parser.Equality_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#and_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAnd_expression(CSharp5Parser.And_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#exclusive_or_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExclusive_or_expression(CSharp5Parser.Exclusive_or_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#inclusive_or_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInclusive_or_expression(CSharp5Parser.Inclusive_or_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#conditional_and_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConditional_and_expression(CSharp5Parser.Conditional_and_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#conditional_or_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConditional_or_expression(CSharp5Parser.Conditional_or_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#null_coalescing_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNull_coalescing_expression(CSharp5Parser.Null_coalescing_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#conditional_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConditional_expression(CSharp5Parser.Conditional_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#lambda_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLambda_expression(CSharp5Parser.Lambda_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#anonymous_method_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAnonymous_method_expression(CSharp5Parser.Anonymous_method_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#anonymous_function_signature}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAnonymous_function_signature(CSharp5Parser.Anonymous_function_signatureContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#explicit_anonymous_function_signature}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExplicit_anonymous_function_signature(CSharp5Parser.Explicit_anonymous_function_signatureContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#explicit_anonymous_function_parameter_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExplicit_anonymous_function_parameter_list(
            CSharp5Parser.Explicit_anonymous_function_parameter_listContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#explicit_anonymous_function_parameter}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExplicit_anonymous_function_parameter(CSharp5Parser.Explicit_anonymous_function_parameterContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#anonymous_function_parameter_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAnonymous_function_parameter_modifier(CSharp5Parser.Anonymous_function_parameter_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#implicit_anonymous_function_signature}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitImplicit_anonymous_function_signature(CSharp5Parser.Implicit_anonymous_function_signatureContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#implicit_anonymous_function_parameter_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitImplicit_anonymous_function_parameter_list(
            CSharp5Parser.Implicit_anonymous_function_parameter_listContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#implicit_anonymous_function_parameter}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitImplicit_anonymous_function_parameter(CSharp5Parser.Implicit_anonymous_function_parameterContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#anonymous_function_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAnonymous_function_body(CSharp5Parser.Anonymous_function_bodyContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#query_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitQuery_expression(CSharp5Parser.Query_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#from_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFrom_clause(CSharp5Parser.From_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#query_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitQuery_body(CSharp5Parser.Query_bodyContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#query_body_clauses}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitQuery_body_clauses(CSharp5Parser.Query_body_clausesContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#query_body_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitQuery_body_clause(CSharp5Parser.Query_body_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#let_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLet_clause(CSharp5Parser.Let_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#where_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitWhere_clause(CSharp5Parser.Where_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#join_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitJoin_clause(CSharp5Parser.Join_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#join_into_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitJoin_into_clause(CSharp5Parser.Join_into_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#combined_join_clause}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCombined_join_clause(CSharp5Parser.Combined_join_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#orderby_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOrderby_clause(CSharp5Parser.Orderby_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#orderings}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOrderings(CSharp5Parser.OrderingsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#ordering}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOrdering(CSharp5Parser.OrderingContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#ordering_direction}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOrdering_direction(CSharp5Parser.Ordering_directionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#select_or_group_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSelect_or_group_clause(CSharp5Parser.Select_or_group_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#select_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSelect_clause(CSharp5Parser.Select_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#group_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGroup_clause(CSharp5Parser.Group_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#query_continuation}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitQuery_continuation(CSharp5Parser.Query_continuationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#assignment}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAssignment(CSharp5Parser.AssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#assignment_operator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAssignment_operator(CSharp5Parser.Assignment_operatorContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExpression(CSharp5Parser.ExpressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#non_assignment_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNon_assignment_expression(CSharp5Parser.Non_assignment_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#constant_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstant_expression(CSharp5Parser.Constant_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#boolean_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBoolean_expression(CSharp5Parser.Boolean_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatement(CSharp5Parser.StatementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#embedded_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEmbedded_statement(CSharp5Parser.Embedded_statementContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#simple_embedded_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSimple_embedded_statement(CSharp5Parser.Simple_embedded_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#block}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBlock(CSharp5Parser.BlockContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#statement_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatement_list(CSharp5Parser.Statement_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#empty_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEmpty_statement(CSharp5Parser.Empty_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#labeled_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLabeled_statement(CSharp5Parser.Labeled_statementContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#declaration_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDeclaration_statement(CSharp5Parser.Declaration_statementContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#local_variable_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLocal_variable_declaration(CSharp5Parser.Local_variable_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#local_variable_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLocal_variable_type(CSharp5Parser.Local_variable_typeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#local_variable_declarators}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLocal_variable_declarators(CSharp5Parser.Local_variable_declaratorsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#local_variable_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLocal_variable_declarator(CSharp5Parser.Local_variable_declaratorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#local_variable_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLocal_variable_initializer(CSharp5Parser.Local_variable_initializerContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#local_constant_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLocal_constant_declaration(CSharp5Parser.Local_constant_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#expression_statement}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExpression_statement(CSharp5Parser.Expression_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#statement_expression}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatement_expression(CSharp5Parser.Statement_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#selection_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSelection_statement(CSharp5Parser.Selection_statementContext ctx);

    /**
     * Visit a parse tree produced by the {@code ifBodyBlock} labeled
     * alternative in {@link CSharp5Parser#if_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIfBodyBlock(CSharp5Parser.IfBodyBlockContext ctx);

    /**
     * Visit a parse tree produced by the {@code ifBodySingle} labeled
     * alternative in {@link CSharp5Parser#if_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIfBodySingle(CSharp5Parser.IfBodySingleContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#if_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIf_statement(CSharp5Parser.If_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#switch_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSwitch_statement(CSharp5Parser.Switch_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#switch_block}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSwitch_block(CSharp5Parser.Switch_blockContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#switch_sections}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSwitch_sections(CSharp5Parser.Switch_sectionsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#switch_section}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSwitch_section(CSharp5Parser.Switch_sectionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#switch_labels}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSwitch_labels(CSharp5Parser.Switch_labelsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#switch_label}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSwitch_label(CSharp5Parser.Switch_labelContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#iteration_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIteration_statement(CSharp5Parser.Iteration_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#while_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitWhile_statement(CSharp5Parser.While_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#do_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDo_statement(CSharp5Parser.Do_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#for_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFor_statement(CSharp5Parser.For_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#for_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFor_initializer(CSharp5Parser.For_initializerContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#for_condition}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFor_condition(CSharp5Parser.For_conditionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#for_iterator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFor_iterator(CSharp5Parser.For_iteratorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#statement_expression_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatement_expression_list(CSharp5Parser.Statement_expression_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#foreach_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitForeach_statement(CSharp5Parser.Foreach_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#jump_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitJump_statement(CSharp5Parser.Jump_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#break_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBreak_statement(CSharp5Parser.Break_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#continue_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitContinue_statement(CSharp5Parser.Continue_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#goto_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGoto_statement(CSharp5Parser.Goto_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#return_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitReturn_statement(CSharp5Parser.Return_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#throw_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitThrow_statement(CSharp5Parser.Throw_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#try_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitTry_statement(CSharp5Parser.Try_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#catch_clauses}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCatch_clauses(CSharp5Parser.Catch_clausesContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#specific_catch_clauses}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSpecific_catch_clauses(CSharp5Parser.Specific_catch_clausesContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#specific_catch_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSpecific_catch_clause(CSharp5Parser.Specific_catch_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#general_catch_clause}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGeneral_catch_clause(CSharp5Parser.General_catch_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#finally_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFinally_clause(CSharp5Parser.Finally_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#checked_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitChecked_statement(CSharp5Parser.Checked_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#unchecked_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnchecked_statement(CSharp5Parser.Unchecked_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#lock_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLock_statement(CSharp5Parser.Lock_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#using_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUsing_statement(CSharp5Parser.Using_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#resource_acquisition}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitResource_acquisition(CSharp5Parser.Resource_acquisitionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#yield_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitYield_statement(CSharp5Parser.Yield_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#compilation_unit}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCompilation_unit(CSharp5Parser.Compilation_unitContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#namespace_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamespace_declaration(CSharp5Parser.Namespace_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#qualified_identifier}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitQualified_identifier(CSharp5Parser.Qualified_identifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#namespace_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamespace_body(CSharp5Parser.Namespace_bodyContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#extern_alias_directives}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExtern_alias_directives(CSharp5Parser.Extern_alias_directivesContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#extern_alias_directive}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExtern_alias_directive(CSharp5Parser.Extern_alias_directiveContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#using_directives}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUsing_directives(CSharp5Parser.Using_directivesContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#using_directive}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUsing_directive(CSharp5Parser.Using_directiveContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#using_alias_directive}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUsing_alias_directive(CSharp5Parser.Using_alias_directiveContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#using_namespace_directive}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUsing_namespace_directive(CSharp5Parser.Using_namespace_directiveContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#namespace_member_declarations}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamespace_member_declarations(CSharp5Parser.Namespace_member_declarationsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#namespace_member_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamespace_member_declaration(CSharp5Parser.Namespace_member_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#type_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_declaration(CSharp5Parser.Type_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#qualified_alias_member}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitQualified_alias_member(CSharp5Parser.Qualified_alias_memberContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#class_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_declaration(CSharp5Parser.Class_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#class_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_modifiers(CSharp5Parser.Class_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#class_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_modifier(CSharp5Parser.Class_modifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#type_parameter_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_parameter_list(CSharp5Parser.Type_parameter_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#type_parameters}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_parameters(CSharp5Parser.Type_parametersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#type_parameter}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_parameter(CSharp5Parser.Type_parameterContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#class_base}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_base(CSharp5Parser.Class_baseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#interface_type_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_type_list(CSharp5Parser.Interface_type_listContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#type_parameter_constraints_clauses}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_parameter_constraints_clauses(CSharp5Parser.Type_parameter_constraints_clausesContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#type_parameter_constraints_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_parameter_constraints_clause(CSharp5Parser.Type_parameter_constraints_clauseContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#type_parameter_constraints}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_parameter_constraints(CSharp5Parser.Type_parameter_constraintsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#primary_constraint}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPrimary_constraint(CSharp5Parser.Primary_constraintContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#secondary_constraints}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSecondary_constraints(CSharp5Parser.Secondary_constraintsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#constructor_constraint}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_constraint(CSharp5Parser.Constructor_constraintContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#class_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_body(CSharp5Parser.Class_bodyContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#class_member_declarations}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_member_declarations(CSharp5Parser.Class_member_declarationsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#class_member_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_member_declaration(CSharp5Parser.Class_member_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#all_member_modifiers}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAll_member_modifiers(CSharp5Parser.All_member_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#all_member_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAll_member_modifier(CSharp5Parser.All_member_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#common_member_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCommon_member_declaration(CSharp5Parser.Common_member_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#typed_member_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitTyped_member_declaration(CSharp5Parser.Typed_member_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#constant_declarators}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstant_declarators(CSharp5Parser.Constant_declaratorsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#constant_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstant_declarator(CSharp5Parser.Constant_declaratorContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#variable_declarators}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariable_declarators(CSharp5Parser.Variable_declaratorsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#variable_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariable_declarator(CSharp5Parser.Variable_declaratorContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#variable_initializer}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariable_initializer(CSharp5Parser.Variable_initializerContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#method_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_declaration(CSharp5Parser.Method_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#method_header}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_header(CSharp5Parser.Method_headerContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#method_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_modifiers(CSharp5Parser.Method_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#method_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_modifier(CSharp5Parser.Method_modifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#return_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitReturn_type(CSharp5Parser.Return_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#member_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMember_name(CSharp5Parser.Member_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#method_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_body(CSharp5Parser.Method_bodyContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#formal_parameter_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFormal_parameter_list(CSharp5Parser.Formal_parameter_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#fixed_parameters}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_parameters(CSharp5Parser.Fixed_parametersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#fixed_parameter}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_parameter(CSharp5Parser.Fixed_parameterContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#default_argument}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDefault_argument(CSharp5Parser.Default_argumentContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#parameter_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitParameter_modifier(CSharp5Parser.Parameter_modifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#parameter_array}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitParameter_array(CSharp5Parser.Parameter_arrayContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#property_declaration}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitProperty_declaration(CSharp5Parser.Property_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#property_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitProperty_modifiers(CSharp5Parser.Property_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#property_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitProperty_modifier(CSharp5Parser.Property_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#accessor_declarations}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAccessor_declarations(CSharp5Parser.Accessor_declarationsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#get_accessor_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGet_accessor_declaration(CSharp5Parser.Get_accessor_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#set_accessor_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSet_accessor_declaration(CSharp5Parser.Set_accessor_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#accessor_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAccessor_modifier(CSharp5Parser.Accessor_modifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#accessor_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAccessor_body(CSharp5Parser.Accessor_bodyContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#event_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEvent_declaration(CSharp5Parser.Event_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#event_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEvent_modifiers(CSharp5Parser.Event_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#event_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEvent_modifier(CSharp5Parser.Event_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#event_accessor_declarations}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEvent_accessor_declarations(CSharp5Parser.Event_accessor_declarationsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#add_accessor_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAdd_accessor_declaration(CSharp5Parser.Add_accessor_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#remove_accessor_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRemove_accessor_declaration(CSharp5Parser.Remove_accessor_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#indexer_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIndexer_declaration(CSharp5Parser.Indexer_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#indexer_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIndexer_modifiers(CSharp5Parser.Indexer_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#indexer_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIndexer_modifier(CSharp5Parser.Indexer_modifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#indexer_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIndexer_declarator(CSharp5Parser.Indexer_declaratorContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#operator_declaration}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOperator_declaration(CSharp5Parser.Operator_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#operator_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOperator_modifiers(CSharp5Parser.Operator_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#operator_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOperator_modifier(CSharp5Parser.Operator_modifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#operator_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOperator_declarator(CSharp5Parser.Operator_declaratorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#unary_operator_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnary_operator_declarator(CSharp5Parser.Unary_operator_declaratorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#overloadable_unary_operator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOverloadable_unary_operator(CSharp5Parser.Overloadable_unary_operatorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#binary_operator_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBinary_operator_declarator(CSharp5Parser.Binary_operator_declaratorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#overloadable_binary_operator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOverloadable_binary_operator(CSharp5Parser.Overloadable_binary_operatorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#overloadable_operator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOverloadable_operator(CSharp5Parser.Overloadable_operatorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#conversion_operator_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConversion_operator_declarator(CSharp5Parser.Conversion_operator_declaratorContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#operator_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOperator_body(CSharp5Parser.Operator_bodyContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#constructor_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_declaration(CSharp5Parser.Constructor_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#constructor_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_modifiers(CSharp5Parser.Constructor_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#constructor_modifier}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_modifier(CSharp5Parser.Constructor_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#constructor_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_declarator(CSharp5Parser.Constructor_declaratorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#constructor_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_initializer(CSharp5Parser.Constructor_initializerContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#constructor_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_body(CSharp5Parser.Constructor_bodyContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#static_constructor_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatic_constructor_declaration(CSharp5Parser.Static_constructor_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#static_constructor_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatic_constructor_modifiers(CSharp5Parser.Static_constructor_modifiersContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#static_constructor_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatic_constructor_body(CSharp5Parser.Static_constructor_bodyContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#destructor_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDestructor_declaration(CSharp5Parser.Destructor_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#destructor_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDestructor_body(CSharp5Parser.Destructor_bodyContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBody(CSharp5Parser.BodyContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#struct_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_declaration(CSharp5Parser.Struct_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#struct_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_modifiers(CSharp5Parser.Struct_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#struct_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_modifier(CSharp5Parser.Struct_modifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#struct_interfaces}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_interfaces(CSharp5Parser.Struct_interfacesContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#struct_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_body(CSharp5Parser.Struct_bodyContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#struct_member_declarations}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_member_declarations(CSharp5Parser.Struct_member_declarationsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#struct_member_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_member_declaration(CSharp5Parser.Struct_member_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#array_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArray_type(CSharp5Parser.Array_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#non_array_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNon_array_type(CSharp5Parser.Non_array_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#rank_specifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRank_specifiers(CSharp5Parser.Rank_specifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#rank_specifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRank_specifier(CSharp5Parser.Rank_specifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#dim_separators}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDim_separators(CSharp5Parser.Dim_separatorsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#array_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArray_initializer(CSharp5Parser.Array_initializerContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#variable_initializer_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariable_initializer_list(CSharp5Parser.Variable_initializer_listContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#interface_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_declaration(CSharp5Parser.Interface_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#interface_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_modifiers(CSharp5Parser.Interface_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#interface_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_modifier(CSharp5Parser.Interface_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#variant_type_parameter_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariant_type_parameter_list(CSharp5Parser.Variant_type_parameter_listContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#variant_type_parameters}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariant_type_parameters(CSharp5Parser.Variant_type_parametersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#variance_annotation}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariance_annotation(CSharp5Parser.Variance_annotationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#interface_base}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_base(CSharp5Parser.Interface_baseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#interface_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_body(CSharp5Parser.Interface_bodyContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#interface_member_declarations}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_member_declarations(CSharp5Parser.Interface_member_declarationsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#interface_member_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_member_declaration(CSharp5Parser.Interface_member_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#interface_method_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_method_declaration(CSharp5Parser.Interface_method_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#interface_property_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_property_declaration(CSharp5Parser.Interface_property_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#interface_accessors}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_accessors(CSharp5Parser.Interface_accessorsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#interface_event_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_event_declaration(CSharp5Parser.Interface_event_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#interface_indexer_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_indexer_declaration(CSharp5Parser.Interface_indexer_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#enum_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_declaration(CSharp5Parser.Enum_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#enum_base}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_base(CSharp5Parser.Enum_baseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#enum_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_body(CSharp5Parser.Enum_bodyContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#enum_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_modifiers(CSharp5Parser.Enum_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#enum_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_modifier(CSharp5Parser.Enum_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#enum_member_declarations}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_member_declarations(CSharp5Parser.Enum_member_declarationsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#enum_member_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_member_declaration(CSharp5Parser.Enum_member_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#delegate_declaration}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDelegate_declaration(CSharp5Parser.Delegate_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#delegate_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDelegate_modifiers(CSharp5Parser.Delegate_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#delegate_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDelegate_modifier(CSharp5Parser.Delegate_modifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#global_attributes}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGlobal_attributes(CSharp5Parser.Global_attributesContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#global_attribute_sections}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGlobal_attribute_sections(CSharp5Parser.Global_attribute_sectionsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#global_attribute_section}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGlobal_attribute_section(CSharp5Parser.Global_attribute_sectionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#global_attribute_target_specifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGlobal_attribute_target_specifier(CSharp5Parser.Global_attribute_target_specifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#global_attribute_target}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGlobal_attribute_target(CSharp5Parser.Global_attribute_targetContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#attributes}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttributes(CSharp5Parser.AttributesContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#attribute_sections}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_sections(CSharp5Parser.Attribute_sectionsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#attribute_section}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_section(CSharp5Parser.Attribute_sectionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#attribute_target_specifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_target_specifier(CSharp5Parser.Attribute_target_specifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#attribute_target}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_target(CSharp5Parser.Attribute_targetContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#attribute_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_list(CSharp5Parser.Attribute_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#attribute}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute(CSharp5Parser.AttributeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#attribute_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_name(CSharp5Parser.Attribute_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#attribute_arguments}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_arguments(CSharp5Parser.Attribute_argumentsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#positional_argument_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPositional_argument_list(CSharp5Parser.Positional_argument_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#positional_argument}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPositional_argument(CSharp5Parser.Positional_argumentContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#named_argument_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamed_argument_list(CSharp5Parser.Named_argument_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#named_argument}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamed_argument(CSharp5Parser.Named_argumentContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#attribute_argument_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_argument_expression(CSharp5Parser.Attribute_argument_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#class_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_modifier_unsafe(CSharp5Parser.Class_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#struct_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_modifier_unsafe(CSharp5Parser.Struct_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#interface_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_modifier_unsafe(CSharp5Parser.Interface_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#delegate_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDelegate_modifier_unsafe(CSharp5Parser.Delegate_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#field_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitField_modifier_unsafe(CSharp5Parser.Field_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#method_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_modifier_unsafe(CSharp5Parser.Method_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#property_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitProperty_modifier_unsafe(CSharp5Parser.Property_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#event_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEvent_modifier_unsafe(CSharp5Parser.Event_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#indexer_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIndexer_modifier_unsafe(CSharp5Parser.Indexer_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#operator_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOperator_modifier_unsafe(CSharp5Parser.Operator_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#constructor_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_modifier_unsafe(CSharp5Parser.Constructor_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#destructor_declaration_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDestructor_declaration_unsafe(CSharp5Parser.Destructor_declaration_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#static_constructor_modifiers_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatic_constructor_modifiers_unsafe(CSharp5Parser.Static_constructor_modifiers_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#embedded_statement_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEmbedded_statement_unsafe(CSharp5Parser.Embedded_statement_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#unsafe_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnsafe_statement(CSharp5Parser.Unsafe_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#type_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_unsafe(CSharp5Parser.Type_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#pointer_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPointer_type(CSharp5Parser.Pointer_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#unmanaged_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnmanaged_type(CSharp5Parser.Unmanaged_typeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#primary_no_array_creation_expression_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPrimary_no_array_creation_expression_unsafe(
            CSharp5Parser.Primary_no_array_creation_expression_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#unary_expression_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnary_expression_unsafe(CSharp5Parser.Unary_expression_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#pointer_indirection_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPointer_indirection_expression(CSharp5Parser.Pointer_indirection_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#addressof_expression}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAddressof_expression(CSharp5Parser.Addressof_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#sizeof_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSizeof_expression(CSharp5Parser.Sizeof_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#fixed_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_statement(CSharp5Parser.Fixed_statementContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#fixed_pointer_declarators}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_pointer_declarators(CSharp5Parser.Fixed_pointer_declaratorsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#fixed_pointer_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_pointer_declarator(CSharp5Parser.Fixed_pointer_declaratorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#fixed_pointer_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_pointer_initializer(CSharp5Parser.Fixed_pointer_initializerContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#struct_member_declaration_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_member_declaration_unsafe(CSharp5Parser.Struct_member_declaration_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#fixed_size_buffer_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_size_buffer_declaration(CSharp5Parser.Fixed_size_buffer_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#fixed_size_buffer_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_size_buffer_modifiers(CSharp5Parser.Fixed_size_buffer_modifiersContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#fixed_size_buffer_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_size_buffer_modifier(CSharp5Parser.Fixed_size_buffer_modifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#buffer_element_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBuffer_element_type(CSharp5Parser.Buffer_element_typeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#fixed_size_buffer_declarators}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_size_buffer_declarators(CSharp5Parser.Fixed_size_buffer_declaratorsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#fixed_size_buffer_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_size_buffer_declarator(CSharp5Parser.Fixed_size_buffer_declaratorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#local_variable_initializer_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLocal_variable_initializer_unsafe(CSharp5Parser.Local_variable_initializer_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#stackalloc_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStackalloc_initializer(CSharp5Parser.Stackalloc_initializerContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#from_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFrom_contextual_keyword(CSharp5Parser.From_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#let_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLet_contextual_keyword(CSharp5Parser.Let_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#where_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitWhere_contextual_keyword(CSharp5Parser.Where_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#join_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitJoin_contextual_keyword(CSharp5Parser.Join_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#on_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOn_contextual_keyword(CSharp5Parser.On_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#equals_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEquals_contextual_keyword(CSharp5Parser.Equals_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#into_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInto_contextual_keyword(CSharp5Parser.Into_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#orderby_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOrderby_contextual_keyword(CSharp5Parser.Orderby_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#ascending_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAscending_contextual_keyword(CSharp5Parser.Ascending_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#descending_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDescending_contextual_keyword(CSharp5Parser.Descending_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#select_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSelect_contextual_keyword(CSharp5Parser.Select_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#group_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGroup_contextual_keyword(CSharp5Parser.Group_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#by_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBy_contextual_keyword(CSharp5Parser.By_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#partial_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPartial_contextual_keyword(CSharp5Parser.Partial_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#alias_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAlias_contextual_keyword(CSharp5Parser.Alias_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#yield_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitYield_contextual_keyword(CSharp5Parser.Yield_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#get_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGet_contextual_keyword(CSharp5Parser.Get_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#set_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSet_contextual_keyword(CSharp5Parser.Set_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#add_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAdd_contextual_keyword(CSharp5Parser.Add_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#remove_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRemove_contextual_keyword(CSharp5Parser.Remove_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#dynamic_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDynamic_contextual_keyword(CSharp5Parser.Dynamic_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#arglist}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArglist(CSharp5Parser.ArglistContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#right_arrow}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRight_arrow(CSharp5Parser.Right_arrowContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#right_shift}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRight_shift(CSharp5Parser.Right_shiftContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#right_shift_assignment}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRight_shift_assignment(CSharp5Parser.Right_shift_assignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#literal}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLiteral(CSharp5Parser.LiteralContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#boolean_literal}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBoolean_literal(CSharp5Parser.Boolean_literalContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitKeyword(CSharp5Parser.KeywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#class_definition}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_definition(CSharp5Parser.Class_definitionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#struct_definition}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_definition(CSharp5Parser.Struct_definitionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#interface_definition}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_definition(CSharp5Parser.Interface_definitionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#enum_definition}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_definition(CSharp5Parser.Enum_definitionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#delegate_definition}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDelegate_definition(CSharp5Parser.Delegate_definitionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#event_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEvent_declaration2(CSharp5Parser.Event_declaration2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#field_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitField_declaration2(CSharp5Parser.Field_declaration2Context ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#property_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitProperty_declaration2(CSharp5Parser.Property_declaration2Context ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#constant_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstant_declaration2(CSharp5Parser.Constant_declaration2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#indexer_declaration2}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIndexer_declaration2(CSharp5Parser.Indexer_declaration2Context ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#destructor_definition}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDestructor_definition(CSharp5Parser.Destructor_definitionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#constructor_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_declaration2(CSharp5Parser.Constructor_declaration2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#method_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_declaration2(CSharp5Parser.Method_declaration2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#method_member_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_member_name(CSharp5Parser.Method_member_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#method_member_name2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_member_name2(CSharp5Parser.Method_member_name2Context ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#operator_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOperator_declaration2(CSharp5Parser.Operator_declaration2Context ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#interface_method_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_method_declaration2(CSharp5Parser.Interface_method_declaration2Context ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#interface_property_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_property_declaration2(CSharp5Parser.Interface_property_declaration2Context ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#interface_event_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_event_declaration2(CSharp5Parser.Interface_event_declaration2Context ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#interface_indexer_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_indexer_declaration2(CSharp5Parser.Interface_indexer_declaration2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#member_access2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMember_access2(CSharp5Parser.Member_access2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp5Parser#method_invocation2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_invocation2(CSharp5Parser.Method_invocation2Context ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp5Parser#object_creation_expression2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitObject_creation_expression2(CSharp5Parser.Object_creation_expression2Context ctx);
}