// Generated from csharp/CSharp6.g4 by ANTLR 4.5.1
package net.siliconcode.parsers.csharp;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSharp6Parser}.
 *
 * @param <T>
 *            The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface CSharp6Visitor<T> extends ParseTreeVisitor<T> {

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#namespace_name}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_name(CSharp6Parser.Namespace_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#type_name}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitType_name(CSharp6Parser.Type_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#identifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(CSharp6Parser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#namespace_or_type_name}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_or_type_name(CSharp6Parser.Namespace_or_type_nameContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#type_argument_list_opt}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitType_argument_list_opt(CSharp6Parser.Type_argument_list_optContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitType(CSharp6Parser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#base_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitBase_type(CSharp6Parser.Base_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#simple_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSimple_type(CSharp6Parser.Simple_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#numeric_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_type(CSharp6Parser.Numeric_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#integral_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIntegral_type(CSharp6Parser.Integral_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#floating_point_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFloating_point_type(CSharp6Parser.Floating_point_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#nullable_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNullable_type(CSharp6Parser.Nullable_typeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#non_nullable_value_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNon_nullable_value_type(CSharp6Parser.Non_nullable_value_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#reference_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitReference_type(CSharp6Parser.Reference_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#class_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitClass_type(CSharp6Parser.Class_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#interface_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_type(CSharp6Parser.Interface_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#delegate_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDelegate_type(CSharp6Parser.Delegate_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#type_argument_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitType_argument_list(CSharp6Parser.Type_argument_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#type_arguments}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitType_arguments(CSharp6Parser.Type_argumentsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#type_argument}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitType_argument(CSharp6Parser.Type_argumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#type_void}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitType_void(CSharp6Parser.Type_voidContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#variable_reference}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitVariable_reference(CSharp6Parser.Variable_referenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#argument_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(CSharp6Parser.Argument_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#argument}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitArgument(CSharp6Parser.ArgumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#argument_name}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitArgument_name(CSharp6Parser.Argument_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#argument_value}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitArgument_value(CSharp6Parser.Argument_valueContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#primary_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(CSharp6Parser.Primary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#primary_expression_start}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression_start(CSharp6Parser.Primary_expression_startContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#bracket_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitBracket_expression(CSharp6Parser.Bracket_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#simple_name}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSimple_name(CSharp6Parser.Simple_nameContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#parenthesized_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitParenthesized_expression(CSharp6Parser.Parenthesized_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#member_access}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMember_access(CSharp6Parser.Member_accessContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#predefined_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitPredefined_type(CSharp6Parser.Predefined_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#expression_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(CSharp6Parser.Expression_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#this_access}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitThis_access(CSharp6Parser.This_accessContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#base_access}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitBase_access(CSharp6Parser.Base_accessContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#object_creation_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitObject_creation_expression(CSharp6Parser.Object_creation_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#object_or_collection_initializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitObject_or_collection_initializer(CSharp6Parser.Object_or_collection_initializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#object_initializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitObject_initializer(CSharp6Parser.Object_initializerContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#member_initializer_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMember_initializer_list(CSharp6Parser.Member_initializer_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#member_initializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMember_initializer(CSharp6Parser.Member_initializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#initializer_value}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInitializer_value(CSharp6Parser.Initializer_valueContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#collection_initializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitCollection_initializer(CSharp6Parser.Collection_initializerContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#element_initializer_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitElement_initializer_list(CSharp6Parser.Element_initializer_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#element_initializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitElement_initializer(CSharp6Parser.Element_initializerContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#indexer_initializer_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIndexer_initializer_list(CSharp6Parser.Indexer_initializer_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#index_initializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIndex_initializer(CSharp6Parser.Index_initializerContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#array_creation_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitArray_creation_expression(CSharp6Parser.Array_creation_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#delegate_creation_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDelegate_creation_expression(CSharp6Parser.Delegate_creation_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#anonymous_object_creation_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_object_creation_expression(CSharp6Parser.Anonymous_object_creation_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#anonymous_object_initializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_object_initializer(CSharp6Parser.Anonymous_object_initializerContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#member_declarator_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMember_declarator_list(CSharp6Parser.Member_declarator_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#member_declarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMember_declarator(CSharp6Parser.Member_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#typeof_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitTypeof_expression(CSharp6Parser.Typeof_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#unbound_type_name}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitUnbound_type_name(CSharp6Parser.Unbound_type_nameContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#generic_dimension_specifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_dimension_specifier(CSharp6Parser.Generic_dimension_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#commas}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitCommas(CSharp6Parser.CommasContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#checked_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitChecked_expression(CSharp6Parser.Checked_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#unchecked_expression}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitUnchecked_expression(CSharp6Parser.Unchecked_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#default_value_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value_expression(CSharp6Parser.Default_value_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#unary_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(CSharp6Parser.Unary_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#scan_for_cast_generic_precedence}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitScan_for_cast_generic_precedence(CSharp6Parser.Scan_for_cast_generic_precedenceContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#cast_disambiguation_token}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitCast_disambiguation_token(CSharp6Parser.Cast_disambiguation_tokenContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#pre_increment_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitPre_increment_expression(CSharp6Parser.Pre_increment_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#pre_decrement_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitPre_decrement_expression(CSharp6Parser.Pre_decrement_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#cast_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(CSharp6Parser.Cast_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#multiplicative_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(CSharp6Parser.Multiplicative_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#additive_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(CSharp6Parser.Additive_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#shift_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(CSharp6Parser.Shift_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#relational_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(CSharp6Parser.Relational_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#scan_for_shift_generic_precedence}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitScan_for_shift_generic_precedence(CSharp6Parser.Scan_for_shift_generic_precedenceContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#shift_disambiguation_token}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitShift_disambiguation_token(CSharp6Parser.Shift_disambiguation_tokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#isType}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIsType(CSharp6Parser.IsTypeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#is_disambiguation_token}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIs_disambiguation_token(CSharp6Parser.Is_disambiguation_tokenContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#equality_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(CSharp6Parser.Equality_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#and_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(CSharp6Parser.And_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#exclusive_or_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_or_expression(CSharp6Parser.Exclusive_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#inclusive_or_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInclusive_or_expression(CSharp6Parser.Inclusive_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#conditional_and_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConditional_and_expression(CSharp6Parser.Conditional_and_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#conditional_or_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConditional_or_expression(CSharp6Parser.Conditional_or_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#null_coalescing_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNull_coalescing_expression(CSharp6Parser.Null_coalescing_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#conditional_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(CSharp6Parser.Conditional_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#lambda_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLambda_expression(CSharp6Parser.Lambda_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#anonymous_method_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_method_expression(CSharp6Parser.Anonymous_method_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#anonymous_function_signature}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_function_signature(CSharp6Parser.Anonymous_function_signatureContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#explicit_anonymous_function_signature}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_anonymous_function_signature(CSharp6Parser.Explicit_anonymous_function_signatureContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#explicit_anonymous_function_parameter_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_anonymous_function_parameter_list(
			CSharp6Parser.Explicit_anonymous_function_parameter_listContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#explicit_anonymous_function_parameter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitExplicit_anonymous_function_parameter(CSharp6Parser.Explicit_anonymous_function_parameterContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#anonymous_function_parameter_modifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_function_parameter_modifier(CSharp6Parser.Anonymous_function_parameter_modifierContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#implicit_anonymous_function_signature}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_anonymous_function_signature(CSharp6Parser.Implicit_anonymous_function_signatureContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#implicit_anonymous_function_parameter_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_anonymous_function_parameter_list(
			CSharp6Parser.Implicit_anonymous_function_parameter_listContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#implicit_anonymous_function_parameter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_anonymous_function_parameter(CSharp6Parser.Implicit_anonymous_function_parameterContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#anonymous_function_body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_function_body(CSharp6Parser.Anonymous_function_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#query_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expression(CSharp6Parser.Query_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#from_clause}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(CSharp6Parser.From_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#query_body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitQuery_body(CSharp6Parser.Query_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#query_body_clauses}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitQuery_body_clauses(CSharp6Parser.Query_body_clausesContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#query_body_clause}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitQuery_body_clause(CSharp6Parser.Query_body_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#let_clause}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLet_clause(CSharp6Parser.Let_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#where_clause}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(CSharp6Parser.Where_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#join_clause}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(CSharp6Parser.Join_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#join_into_clause}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitJoin_into_clause(CSharp6Parser.Join_into_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#combined_join_clause}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitCombined_join_clause(CSharp6Parser.Combined_join_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#orderby_clause}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_clause(CSharp6Parser.Orderby_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#orderings}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOrderings(CSharp6Parser.OrderingsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#ordering}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOrdering(CSharp6Parser.OrderingContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#ordering_direction}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_direction(CSharp6Parser.Ordering_directionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#select_or_group_clause}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_group_clause(CSharp6Parser.Select_or_group_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#select_clause}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(CSharp6Parser.Select_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#group_clause}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitGroup_clause(CSharp6Parser.Group_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#query_continuation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitQuery_continuation(CSharp6Parser.Query_continuationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#assignment}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CSharp6Parser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#assignment_operator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(CSharp6Parser.Assignment_operatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CSharp6Parser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#non_assignment_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNon_assignment_expression(CSharp6Parser.Non_assignment_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#constant_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(CSharp6Parser.Constant_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#boolean_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(CSharp6Parser.Boolean_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CSharp6Parser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#embedded_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEmbedded_statement(CSharp6Parser.Embedded_statementContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#simple_embedded_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSimple_embedded_statement(CSharp6Parser.Simple_embedded_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#block}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CSharp6Parser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#statement_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(CSharp6Parser.Statement_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#empty_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_statement(CSharp6Parser.Empty_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#labeled_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(CSharp6Parser.Labeled_statementContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#declaration_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_statement(CSharp6Parser.Declaration_statementContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#local_variable_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_declaration(CSharp6Parser.Local_variable_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#local_variable_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_type(CSharp6Parser.Local_variable_typeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#local_variable_declarators}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_declarators(CSharp6Parser.Local_variable_declaratorsContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#local_variable_declarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_declarator(CSharp6Parser.Local_variable_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#local_variable_initializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_initializer(CSharp6Parser.Local_variable_initializerContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#local_constant_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLocal_constant_declaration(CSharp6Parser.Local_constant_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#expression_statement}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(CSharp6Parser.Expression_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#statement_expression}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStatement_expression(CSharp6Parser.Statement_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#selection_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(CSharp6Parser.Selection_statementContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ifBodyBlock} labeled
	 * alternative in {@link CSharp6Parser#if_body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIfBodyBlock(CSharp6Parser.IfBodyBlockContext ctx);

	/**
	 * Visit a parse tree produced by the {@code ifBodySingle} labeled
	 * alternative in {@link CSharp6Parser#if_body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIfBodySingle(CSharp6Parser.IfBodySingleContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#if_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(CSharp6Parser.If_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#switch_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statement(CSharp6Parser.Switch_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#switch_block}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_block(CSharp6Parser.Switch_blockContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#switch_sections}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_sections(CSharp6Parser.Switch_sectionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#switch_section}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_section(CSharp6Parser.Switch_sectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#switch_labels}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_labels(CSharp6Parser.Switch_labelsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#switch_label}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_label(CSharp6Parser.Switch_labelContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#iteration_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement(CSharp6Parser.Iteration_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#while_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(CSharp6Parser.While_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#do_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement(CSharp6Parser.Do_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#for_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(CSharp6Parser.For_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#for_initializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFor_initializer(CSharp6Parser.For_initializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#for_condition}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFor_condition(CSharp6Parser.For_conditionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#for_iterator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFor_iterator(CSharp6Parser.For_iteratorContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#statement_expression_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStatement_expression_list(CSharp6Parser.Statement_expression_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#foreach_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitForeach_statement(CSharp6Parser.Foreach_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#jump_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(CSharp6Parser.Jump_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#break_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(CSharp6Parser.Break_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#continue_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(CSharp6Parser.Continue_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#goto_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(CSharp6Parser.Goto_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#return_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(CSharp6Parser.Return_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#throw_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(CSharp6Parser.Throw_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#try_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitTry_statement(CSharp6Parser.Try_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#catch_clauses}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitCatch_clauses(CSharp6Parser.Catch_clausesContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#specific_catch_clauses}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSpecific_catch_clauses(CSharp6Parser.Specific_catch_clausesContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#specific_catch_clause}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSpecific_catch_clause(CSharp6Parser.Specific_catch_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#exception_filter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitException_filter(CSharp6Parser.Exception_filterContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#general_catch_clause}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_catch_clause(CSharp6Parser.General_catch_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#finally_clause}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFinally_clause(CSharp6Parser.Finally_clauseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#checked_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitChecked_statement(CSharp6Parser.Checked_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#unchecked_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitUnchecked_statement(CSharp6Parser.Unchecked_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#lock_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLock_statement(CSharp6Parser.Lock_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#using_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitUsing_statement(CSharp6Parser.Using_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#resource_acquisition}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitResource_acquisition(CSharp6Parser.Resource_acquisitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#yield_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitYield_statement(CSharp6Parser.Yield_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#compilation_unit}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitCompilation_unit(CSharp6Parser.Compilation_unitContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#namespace_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_declaration(CSharp6Parser.Namespace_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#qualified_identifier}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitQualified_identifier(CSharp6Parser.Qualified_identifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#namespace_body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_body(CSharp6Parser.Namespace_bodyContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#extern_alias_directives}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitExtern_alias_directives(CSharp6Parser.Extern_alias_directivesContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#extern_alias_directive}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitExtern_alias_directive(CSharp6Parser.Extern_alias_directiveContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#using_directives}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitUsing_directives(CSharp6Parser.Using_directivesContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#using_directive}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitUsing_directive(CSharp6Parser.Using_directiveContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#using_alias_directive}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitUsing_alias_directive(CSharp6Parser.Using_alias_directiveContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#using_namespace_directive}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitUsing_namespace_directive(CSharp6Parser.Using_namespace_directiveContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#namespace_member_declarations}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_member_declarations(CSharp6Parser.Namespace_member_declarationsContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#namespace_member_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_member_declaration(CSharp6Parser.Namespace_member_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#type_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(CSharp6Parser.Type_declarationContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#qualified_alias_member}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitQualified_alias_member(CSharp6Parser.Qualified_alias_memberContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#class_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(CSharp6Parser.Class_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#class_modifiers}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitClass_modifiers(CSharp6Parser.Class_modifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#class_modifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitClass_modifier(CSharp6Parser.Class_modifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#type_parameter_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitType_parameter_list(CSharp6Parser.Type_parameter_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#type_parameters}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitType_parameters(CSharp6Parser.Type_parametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#type_parameter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitType_parameter(CSharp6Parser.Type_parameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#class_base}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitClass_base(CSharp6Parser.Class_baseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#interface_type_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_type_list(CSharp6Parser.Interface_type_listContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#type_parameter_constraints_clauses}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitType_parameter_constraints_clauses(CSharp6Parser.Type_parameter_constraints_clausesContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#type_parameter_constraints_clause}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitType_parameter_constraints_clause(CSharp6Parser.Type_parameter_constraints_clauseContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#type_parameter_constraints}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitType_parameter_constraints(CSharp6Parser.Type_parameter_constraintsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#primary_constraint}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_constraint(CSharp6Parser.Primary_constraintContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#secondary_constraints}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSecondary_constraints(CSharp6Parser.Secondary_constraintsContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#constructor_constraint}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_constraint(CSharp6Parser.Constructor_constraintContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#class_body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(CSharp6Parser.Class_bodyContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#class_member_declarations}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitClass_member_declarations(CSharp6Parser.Class_member_declarationsContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#class_member_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitClass_member_declaration(CSharp6Parser.Class_member_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#all_member_modifiers}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAll_member_modifiers(CSharp6Parser.All_member_modifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#all_member_modifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAll_member_modifier(CSharp6Parser.All_member_modifierContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#common_member_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitCommon_member_declaration(CSharp6Parser.Common_member_declarationContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#typed_member_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitTyped_member_declaration(CSharp6Parser.Typed_member_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#constant_declarators}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declarators(CSharp6Parser.Constant_declaratorsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#constant_declarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declarator(CSharp6Parser.Constant_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#variable_declarators}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declarators(CSharp6Parser.Variable_declaratorsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#variable_declarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declarator(CSharp6Parser.Variable_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#variable_initializer}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitVariable_initializer(CSharp6Parser.Variable_initializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#method_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(CSharp6Parser.Method_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#method_header}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMethod_header(CSharp6Parser.Method_headerContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#method_modifiers}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMethod_modifiers(CSharp6Parser.Method_modifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#method_modifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMethod_modifier(CSharp6Parser.Method_modifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#return_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(CSharp6Parser.Return_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#member_name}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMember_name(CSharp6Parser.Member_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#method_body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMethod_body(CSharp6Parser.Method_bodyContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#formal_parameter_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFormal_parameter_list(CSharp6Parser.Formal_parameter_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#fixed_parameters}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFixed_parameters(CSharp6Parser.Fixed_parametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#fixed_parameter}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFixed_parameter(CSharp6Parser.Fixed_parameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#default_argument}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDefault_argument(CSharp6Parser.Default_argumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#parameter_modifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitParameter_modifier(CSharp6Parser.Parameter_modifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#parameter_array}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitParameter_array(CSharp6Parser.Parameter_arrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#property_declaration}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitProperty_declaration(CSharp6Parser.Property_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#property_modifiers}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitProperty_modifiers(CSharp6Parser.Property_modifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#property_modifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitProperty_modifier(CSharp6Parser.Property_modifierContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#accessor_declarations}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAccessor_declarations(CSharp6Parser.Accessor_declarationsContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#get_accessor_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitGet_accessor_declaration(CSharp6Parser.Get_accessor_declarationContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#set_accessor_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSet_accessor_declaration(CSharp6Parser.Set_accessor_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#accessor_modifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAccessor_modifier(CSharp6Parser.Accessor_modifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#accessor_body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAccessor_body(CSharp6Parser.Accessor_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#event_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEvent_declaration(CSharp6Parser.Event_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#event_modifiers}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEvent_modifiers(CSharp6Parser.Event_modifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#event_modifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEvent_modifier(CSharp6Parser.Event_modifierContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#event_accessor_declarations}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEvent_accessor_declarations(CSharp6Parser.Event_accessor_declarationsContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#add_accessor_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAdd_accessor_declaration(CSharp6Parser.Add_accessor_declarationContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#remove_accessor_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitRemove_accessor_declaration(CSharp6Parser.Remove_accessor_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#indexer_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIndexer_declaration(CSharp6Parser.Indexer_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#indexer_modifiers}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIndexer_modifiers(CSharp6Parser.Indexer_modifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#indexer_modifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIndexer_modifier(CSharp6Parser.Indexer_modifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#indexer_declarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIndexer_declarator(CSharp6Parser.Indexer_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#operator_declaration}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOperator_declaration(CSharp6Parser.Operator_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#operator_modifiers}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOperator_modifiers(CSharp6Parser.Operator_modifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#operator_modifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOperator_modifier(CSharp6Parser.Operator_modifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#operator_declarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOperator_declarator(CSharp6Parser.Operator_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#unary_operator_declarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator_declarator(CSharp6Parser.Unary_operator_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#overloadable_unary_operator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOverloadable_unary_operator(CSharp6Parser.Overloadable_unary_operatorContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#binary_operator_declarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator_declarator(CSharp6Parser.Binary_operator_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#overloadable_binary_operator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOverloadable_binary_operator(CSharp6Parser.Overloadable_binary_operatorContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#overloadable_operator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOverloadable_operator(CSharp6Parser.Overloadable_operatorContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#conversion_operator_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConversion_operator_declaration(CSharp6Parser.Conversion_operator_declarationContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#conversion_operator_declarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConversion_operator_declarator(CSharp6Parser.Conversion_operator_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#operator_body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOperator_body(CSharp6Parser.Operator_bodyContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#constructor_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_declaration(CSharp6Parser.Constructor_declarationContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#constructor_modifiers}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_modifiers(CSharp6Parser.Constructor_modifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#constructor_modifier}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_modifier(CSharp6Parser.Constructor_modifierContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#constructor_declarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_declarator(CSharp6Parser.Constructor_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#constructor_initializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_initializer(CSharp6Parser.Constructor_initializerContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#constructor_body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_body(CSharp6Parser.Constructor_bodyContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#static_constructor_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStatic_constructor_declaration(CSharp6Parser.Static_constructor_declarationContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#static_constructor_modifiers}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStatic_constructor_modifiers(CSharp6Parser.Static_constructor_modifiersContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#static_constructor_body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStatic_constructor_body(CSharp6Parser.Static_constructor_bodyContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#destructor_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDestructor_declaration(CSharp6Parser.Destructor_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#destructor_body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDestructor_body(CSharp6Parser.Destructor_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitBody(CSharp6Parser.BodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#struct_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(CSharp6Parser.Struct_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#struct_modifiers}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStruct_modifiers(CSharp6Parser.Struct_modifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#struct_modifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStruct_modifier(CSharp6Parser.Struct_modifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#struct_interfaces}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStruct_interfaces(CSharp6Parser.Struct_interfacesContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#struct_body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStruct_body(CSharp6Parser.Struct_bodyContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#struct_member_declarations}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStruct_member_declarations(CSharp6Parser.Struct_member_declarationsContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#struct_member_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStruct_member_declaration(CSharp6Parser.Struct_member_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#array_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(CSharp6Parser.Array_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#non_array_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNon_array_type(CSharp6Parser.Non_array_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#rank_specifiers}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitRank_specifiers(CSharp6Parser.Rank_specifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#rank_specifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitRank_specifier(CSharp6Parser.Rank_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#dim_separators}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDim_separators(CSharp6Parser.Dim_separatorsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#array_initializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitArray_initializer(CSharp6Parser.Array_initializerContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#variable_initializer_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitVariable_initializer_list(CSharp6Parser.Variable_initializer_listContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#interface_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_declaration(CSharp6Parser.Interface_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#interface_modifiers}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_modifiers(CSharp6Parser.Interface_modifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#interface_modifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_modifier(CSharp6Parser.Interface_modifierContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#variant_type_parameter_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitVariant_type_parameter_list(CSharp6Parser.Variant_type_parameter_listContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#variant_type_parameters}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitVariant_type_parameters(CSharp6Parser.Variant_type_parametersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#variance_annotation}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitVariance_annotation(CSharp6Parser.Variance_annotationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#interface_base}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_base(CSharp6Parser.Interface_baseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#interface_body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_body(CSharp6Parser.Interface_bodyContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#interface_member_declarations}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_member_declarations(CSharp6Parser.Interface_member_declarationsContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#interface_member_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_member_declaration(CSharp6Parser.Interface_member_declarationContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#interface_method_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_method_declaration(CSharp6Parser.Interface_method_declarationContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#interface_property_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_property_declaration(CSharp6Parser.Interface_property_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#interface_accessors}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_accessors(CSharp6Parser.Interface_accessorsContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#interface_event_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_event_declaration(CSharp6Parser.Interface_event_declarationContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#interface_indexer_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_indexer_declaration(CSharp6Parser.Interface_indexer_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#enum_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEnum_declaration(CSharp6Parser.Enum_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#enum_base}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEnum_base(CSharp6Parser.Enum_baseContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#enum_body}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEnum_body(CSharp6Parser.Enum_bodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#enum_modifiers}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEnum_modifiers(CSharp6Parser.Enum_modifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#enum_modifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEnum_modifier(CSharp6Parser.Enum_modifierContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#enum_member_declarations}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEnum_member_declarations(CSharp6Parser.Enum_member_declarationsContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#enum_member_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEnum_member_declaration(CSharp6Parser.Enum_member_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#delegate_declaration}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDelegate_declaration(CSharp6Parser.Delegate_declarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#delegate_modifiers}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDelegate_modifiers(CSharp6Parser.Delegate_modifiersContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#delegate_modifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDelegate_modifier(CSharp6Parser.Delegate_modifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#global_attributes}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_attributes(CSharp6Parser.Global_attributesContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#global_attribute_sections}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_attribute_sections(CSharp6Parser.Global_attribute_sectionsContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#global_attribute_section}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_attribute_section(CSharp6Parser.Global_attribute_sectionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#global_attribute_target_specifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_attribute_target_specifier(CSharp6Parser.Global_attribute_target_specifierContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#global_attribute_target}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_attribute_target(CSharp6Parser.Global_attribute_targetContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#attributes}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(CSharp6Parser.AttributesContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#attribute_sections}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_sections(CSharp6Parser.Attribute_sectionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#attribute_section}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_section(CSharp6Parser.Attribute_sectionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#attribute_target_specifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_target_specifier(CSharp6Parser.Attribute_target_specifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#attribute_target}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_target(CSharp6Parser.Attribute_targetContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#attribute_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_list(CSharp6Parser.Attribute_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#attribute}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(CSharp6Parser.AttributeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#attribute_name}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(CSharp6Parser.Attribute_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#attribute_arguments}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_arguments(CSharp6Parser.Attribute_argumentsContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#positional_argument_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitPositional_argument_list(CSharp6Parser.Positional_argument_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#positional_argument}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitPositional_argument(CSharp6Parser.Positional_argumentContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#named_argument_list}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNamed_argument_list(CSharp6Parser.Named_argument_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#named_argument}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNamed_argument(CSharp6Parser.Named_argumentContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#attribute_argument_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_argument_expression(CSharp6Parser.Attribute_argument_expressionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#class_modifier_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitClass_modifier_unsafe(CSharp6Parser.Class_modifier_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#struct_modifier_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStruct_modifier_unsafe(CSharp6Parser.Struct_modifier_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#interface_modifier_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_modifier_unsafe(CSharp6Parser.Interface_modifier_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#delegate_modifier_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDelegate_modifier_unsafe(CSharp6Parser.Delegate_modifier_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#field_modifier_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitField_modifier_unsafe(CSharp6Parser.Field_modifier_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#method_modifier_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMethod_modifier_unsafe(CSharp6Parser.Method_modifier_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#property_modifier_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitProperty_modifier_unsafe(CSharp6Parser.Property_modifier_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#event_modifier_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEvent_modifier_unsafe(CSharp6Parser.Event_modifier_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#indexer_modifier_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIndexer_modifier_unsafe(CSharp6Parser.Indexer_modifier_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#operator_modifier_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOperator_modifier_unsafe(CSharp6Parser.Operator_modifier_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#constructor_modifier_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_modifier_unsafe(CSharp6Parser.Constructor_modifier_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#destructor_declaration_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDestructor_declaration_unsafe(CSharp6Parser.Destructor_declaration_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#static_constructor_modifiers_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStatic_constructor_modifiers_unsafe(CSharp6Parser.Static_constructor_modifiers_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#embedded_statement_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEmbedded_statement_unsafe(CSharp6Parser.Embedded_statement_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#unsafe_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitUnsafe_statement(CSharp6Parser.Unsafe_statementContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#type_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitType_unsafe(CSharp6Parser.Type_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#pointer_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitPointer_type(CSharp6Parser.Pointer_typeContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#unmanaged_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitUnmanaged_type(CSharp6Parser.Unmanaged_typeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#primary_no_array_creation_expression_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_no_array_creation_expression_unsafe(
			CSharp6Parser.Primary_no_array_creation_expression_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#unary_expression_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression_unsafe(CSharp6Parser.Unary_expression_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#pointer_indirection_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitPointer_indirection_expression(CSharp6Parser.Pointer_indirection_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#addressof_expression}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAddressof_expression(CSharp6Parser.Addressof_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#sizeof_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_expression(CSharp6Parser.Sizeof_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#nameof_expression}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitNameof_expression(CSharp6Parser.Nameof_expressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#fixed_statement}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFixed_statement(CSharp6Parser.Fixed_statementContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#fixed_pointer_declarators}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFixed_pointer_declarators(CSharp6Parser.Fixed_pointer_declaratorsContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#fixed_pointer_declarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFixed_pointer_declarator(CSharp6Parser.Fixed_pointer_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#fixed_pointer_initializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFixed_pointer_initializer(CSharp6Parser.Fixed_pointer_initializerContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#struct_member_declaration_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStruct_member_declaration_unsafe(CSharp6Parser.Struct_member_declaration_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#fixed_size_buffer_declaration}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFixed_size_buffer_declaration(CSharp6Parser.Fixed_size_buffer_declarationContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#fixed_size_buffer_modifiers}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFixed_size_buffer_modifiers(CSharp6Parser.Fixed_size_buffer_modifiersContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#fixed_size_buffer_modifier}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFixed_size_buffer_modifier(CSharp6Parser.Fixed_size_buffer_modifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#buffer_element_type}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitBuffer_element_type(CSharp6Parser.Buffer_element_typeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#fixed_size_buffer_declarators}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFixed_size_buffer_declarators(CSharp6Parser.Fixed_size_buffer_declaratorsContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#fixed_size_buffer_declarator}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFixed_size_buffer_declarator(CSharp6Parser.Fixed_size_buffer_declaratorContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#local_variable_initializer_unsafe}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLocal_variable_initializer_unsafe(CSharp6Parser.Local_variable_initializer_unsafeContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#stackalloc_initializer}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStackalloc_initializer(CSharp6Parser.Stackalloc_initializerContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#from_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitFrom_contextual_keyword(CSharp6Parser.From_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#let_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLet_contextual_keyword(CSharp6Parser.Let_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#where_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitWhere_contextual_keyword(CSharp6Parser.Where_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#join_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitJoin_contextual_keyword(CSharp6Parser.Join_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#on_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOn_contextual_keyword(CSharp6Parser.On_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#equals_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEquals_contextual_keyword(CSharp6Parser.Equals_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#into_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInto_contextual_keyword(CSharp6Parser.Into_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#orderby_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_contextual_keyword(CSharp6Parser.Orderby_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#ascending_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAscending_contextual_keyword(CSharp6Parser.Ascending_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#descending_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDescending_contextual_keyword(CSharp6Parser.Descending_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#select_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSelect_contextual_keyword(CSharp6Parser.Select_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#group_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitGroup_contextual_keyword(CSharp6Parser.Group_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#by_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitBy_contextual_keyword(CSharp6Parser.By_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#partial_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitPartial_contextual_keyword(CSharp6Parser.Partial_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#alias_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAlias_contextual_keyword(CSharp6Parser.Alias_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#yield_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitYield_contextual_keyword(CSharp6Parser.Yield_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#get_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitGet_contextual_keyword(CSharp6Parser.Get_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#set_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitSet_contextual_keyword(CSharp6Parser.Set_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#add_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitAdd_contextual_keyword(CSharp6Parser.Add_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#remove_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitRemove_contextual_keyword(CSharp6Parser.Remove_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#dynamic_contextual_keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_contextual_keyword(CSharp6Parser.Dynamic_contextual_keywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#arglist}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitArglist(CSharp6Parser.ArglistContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#right_arrow}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitRight_arrow(CSharp6Parser.Right_arrowContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#right_shift}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitRight_shift(CSharp6Parser.Right_shiftContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#right_shift_assignment}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitRight_shift_assignment(CSharp6Parser.Right_shift_assignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#literal}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CSharp6Parser.LiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#boolean_literal}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_literal(CSharp6Parser.Boolean_literalContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#keyword}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(CSharp6Parser.KeywordContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#class_definition}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitClass_definition(CSharp6Parser.Class_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#struct_definition}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitStruct_definition(CSharp6Parser.Struct_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#interface_definition}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_definition(CSharp6Parser.Interface_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#enum_definition}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEnum_definition(CSharp6Parser.Enum_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#delegate_definition}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDelegate_definition(CSharp6Parser.Delegate_definitionContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#event_declaration2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitEvent_declaration2(CSharp6Parser.Event_declaration2Context ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#field_declaration2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitField_declaration2(CSharp6Parser.Field_declaration2Context ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#property_declaration2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitProperty_declaration2(CSharp6Parser.Property_declaration2Context ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#constant_declaration2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConstant_declaration2(CSharp6Parser.Constant_declaration2Context ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#indexer_declaration2}
	 * .
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitIndexer_declaration2(CSharp6Parser.Indexer_declaration2Context ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#destructor_definition}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitDestructor_definition(CSharp6Parser.Destructor_definitionContext ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#constructor_declaration2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_declaration2(CSharp6Parser.Constructor_declaration2Context ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#method_declaration2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration2(CSharp6Parser.Method_declaration2Context ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#method_member_name}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMethod_member_name(CSharp6Parser.Method_member_nameContext ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#method_member_name2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMethod_member_name2(CSharp6Parser.Method_member_name2Context ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#operator_declaration2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitOperator_declaration2(CSharp6Parser.Operator_declaration2Context ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#interface_method_declaration2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_method_declaration2(CSharp6Parser.Interface_method_declaration2Context ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#interface_property_declaration2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_property_declaration2(CSharp6Parser.Interface_property_declaration2Context ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#interface_event_declaration2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_event_declaration2(CSharp6Parser.Interface_event_declaration2Context ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#interface_indexer_declaration2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitInterface_indexer_declaration2(CSharp6Parser.Interface_indexer_declaration2Context ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#member_access2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMember_access2(CSharp6Parser.Member_access2Context ctx);

	/**
	 * Visit a parse tree produced by {@link CSharp6Parser#method_invocation2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitMethod_invocation2(CSharp6Parser.Method_invocation2Context ctx);

	/**
	 * Visit a parse tree produced by
	 * {@link CSharp6Parser#object_creation_expression2}.
	 * 
	 * @param ctx
	 *            the parse tree
	 * @return the visitor result
	 */
	T visitObject_creation_expression2(CSharp6Parser.Object_creation_expression2Context ctx);
}