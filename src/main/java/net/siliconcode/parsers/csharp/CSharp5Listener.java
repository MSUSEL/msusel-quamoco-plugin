// Generated from csharp/CSharp5.g4 by ANTLR 4.5.1
package net.siliconcode.parsers.csharp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSharp5Parser}.
 */
public interface CSharp5Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#namespace_name}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_name(CSharp5Parser.Namespace_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#namespace_name}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_name(CSharp5Parser.Namespace_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(CSharp5Parser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(CSharp5Parser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CSharp5Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CSharp5Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#namespace_or_type_name}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_or_type_name(CSharp5Parser.Namespace_or_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#namespace_or_type_name}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_or_type_name(CSharp5Parser.Namespace_or_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#type_argument_list_opt}.
	 * @param ctx the parse tree
	 */
	void enterType_argument_list_opt(CSharp5Parser.Type_argument_list_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#type_argument_list_opt}.
	 * @param ctx the parse tree
	 */
	void exitType_argument_list_opt(CSharp5Parser.Type_argument_list_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CSharp5Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CSharp5Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(CSharp5Parser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(CSharp5Parser.Base_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#simple_type}.
	 * @param ctx the parse tree
	 */
	void enterSimple_type(CSharp5Parser.Simple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#simple_type}.
	 * @param ctx the parse tree
	 */
	void exitSimple_type(CSharp5Parser.Simple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_type(CSharp5Parser.Numeric_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_type(CSharp5Parser.Numeric_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#integral_type}.
	 * @param ctx the parse tree
	 */
	void enterIntegral_type(CSharp5Parser.Integral_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#integral_type}.
	 * @param ctx the parse tree
	 */
	void exitIntegral_type(CSharp5Parser.Integral_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#floating_point_type}.
	 * @param ctx the parse tree
	 */
	void enterFloating_point_type(CSharp5Parser.Floating_point_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#floating_point_type}.
	 * @param ctx the parse tree
	 */
	void exitFloating_point_type(CSharp5Parser.Floating_point_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#nullable_type}.
	 * @param ctx the parse tree
	 */
	void enterNullable_type(CSharp5Parser.Nullable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#nullable_type}.
	 * @param ctx the parse tree
	 */
	void exitNullable_type(CSharp5Parser.Nullable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#non_nullable_value_type}.
	 * @param ctx the parse tree
	 */
	void enterNon_nullable_value_type(CSharp5Parser.Non_nullable_value_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#non_nullable_value_type}.
	 * @param ctx the parse tree
	 */
	void exitNon_nullable_value_type(CSharp5Parser.Non_nullable_value_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#reference_type}.
	 * @param ctx the parse tree
	 */
	void enterReference_type(CSharp5Parser.Reference_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#reference_type}.
	 * @param ctx the parse tree
	 */
	void exitReference_type(CSharp5Parser.Reference_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(CSharp5Parser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(CSharp5Parser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_type}.
	 * @param ctx the parse tree
	 */
	void enterInterface_type(CSharp5Parser.Interface_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_type}.
	 * @param ctx the parse tree
	 */
	void exitInterface_type(CSharp5Parser.Interface_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#delegate_type}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_type(CSharp5Parser.Delegate_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#delegate_type}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_type(CSharp5Parser.Delegate_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#type_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterType_argument_list(CSharp5Parser.Type_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#type_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitType_argument_list(CSharp5Parser.Type_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#type_arguments}.
	 * @param ctx the parse tree
	 */
	void enterType_arguments(CSharp5Parser.Type_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#type_arguments}.
	 * @param ctx the parse tree
	 */
	void exitType_arguments(CSharp5Parser.Type_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#type_argument}.
	 * @param ctx the parse tree
	 */
	void enterType_argument(CSharp5Parser.Type_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#type_argument}.
	 * @param ctx the parse tree
	 */
	void exitType_argument(CSharp5Parser.Type_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#type_void}.
	 * @param ctx the parse tree
	 */
	void enterType_void(CSharp5Parser.Type_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#type_void}.
	 * @param ctx the parse tree
	 */
	void exitType_void(CSharp5Parser.Type_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#variable_reference}.
	 * @param ctx the parse tree
	 */
	void enterVariable_reference(CSharp5Parser.Variable_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#variable_reference}.
	 * @param ctx the parse tree
	 */
	void exitVariable_reference(CSharp5Parser.Variable_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(CSharp5Parser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(CSharp5Parser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(CSharp5Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(CSharp5Parser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#argument_name}.
	 * @param ctx the parse tree
	 */
	void enterArgument_name(CSharp5Parser.Argument_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#argument_name}.
	 * @param ctx the parse tree
	 */
	void exitArgument_name(CSharp5Parser.Argument_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#argument_value}.
	 * @param ctx the parse tree
	 */
	void enterArgument_value(CSharp5Parser.Argument_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#argument_value}.
	 * @param ctx the parse tree
	 */
	void exitArgument_value(CSharp5Parser.Argument_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(CSharp5Parser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(CSharp5Parser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression_start(CSharp5Parser.Primary_expression_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression_start(CSharp5Parser.Primary_expression_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void enterBracket_expression(CSharp5Parser.Bracket_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void exitBracket_expression(CSharp5Parser.Bracket_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#simple_name}.
	 * @param ctx the parse tree
	 */
	void enterSimple_name(CSharp5Parser.Simple_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#simple_name}.
	 * @param ctx the parse tree
	 */
	void exitSimple_name(CSharp5Parser.Simple_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_expression(CSharp5Parser.Parenthesized_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_expression(CSharp5Parser.Parenthesized_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#member_access}.
	 * @param ctx the parse tree
	 */
	void enterMember_access(CSharp5Parser.Member_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#member_access}.
	 * @param ctx the parse tree
	 */
	void exitMember_access(CSharp5Parser.Member_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void enterPredefined_type(CSharp5Parser.Predefined_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void exitPredefined_type(CSharp5Parser.Predefined_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(CSharp5Parser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(CSharp5Parser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#this_access}.
	 * @param ctx the parse tree
	 */
	void enterThis_access(CSharp5Parser.This_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#this_access}.
	 * @param ctx the parse tree
	 */
	void exitThis_access(CSharp5Parser.This_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#base_access}.
	 * @param ctx the parse tree
	 */
	void enterBase_access(CSharp5Parser.Base_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#base_access}.
	 * @param ctx the parse tree
	 */
	void exitBase_access(CSharp5Parser.Base_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void enterObject_creation_expression(CSharp5Parser.Object_creation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void exitObject_creation_expression(CSharp5Parser.Object_creation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#object_or_collection_initializer}.
	 * @param ctx the parse tree
	 */
	void enterObject_or_collection_initializer(CSharp5Parser.Object_or_collection_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#object_or_collection_initializer}.
	 * @param ctx the parse tree
	 */
	void exitObject_or_collection_initializer(CSharp5Parser.Object_or_collection_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#object_initializer}.
	 * @param ctx the parse tree
	 */
	void enterObject_initializer(CSharp5Parser.Object_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#object_initializer}.
	 * @param ctx the parse tree
	 */
	void exitObject_initializer(CSharp5Parser.Object_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#member_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_initializer_list(CSharp5Parser.Member_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#member_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_initializer_list(CSharp5Parser.Member_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#member_initializer}.
	 * @param ctx the parse tree
	 */
	void enterMember_initializer(CSharp5Parser.Member_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#member_initializer}.
	 * @param ctx the parse tree
	 */
	void exitMember_initializer(CSharp5Parser.Member_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#initializer_value}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_value(CSharp5Parser.Initializer_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#initializer_value}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_value(CSharp5Parser.Initializer_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#collection_initializer}.
	 * @param ctx the parse tree
	 */
	void enterCollection_initializer(CSharp5Parser.Collection_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#collection_initializer}.
	 * @param ctx the parse tree
	 */
	void exitCollection_initializer(CSharp5Parser.Collection_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#element_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterElement_initializer_list(CSharp5Parser.Element_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#element_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitElement_initializer_list(CSharp5Parser.Element_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#element_initializer}.
	 * @param ctx the parse tree
	 */
	void enterElement_initializer(CSharp5Parser.Element_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#element_initializer}.
	 * @param ctx the parse tree
	 */
	void exitElement_initializer(CSharp5Parser.Element_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#array_creation_expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_creation_expression(CSharp5Parser.Array_creation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#array_creation_expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_creation_expression(CSharp5Parser.Array_creation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#delegate_creation_expression}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_creation_expression(CSharp5Parser.Delegate_creation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#delegate_creation_expression}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_creation_expression(CSharp5Parser.Delegate_creation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#anonymous_object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_object_creation_expression(CSharp5Parser.Anonymous_object_creation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#anonymous_object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_object_creation_expression(CSharp5Parser.Anonymous_object_creation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#anonymous_object_initializer}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_object_initializer(CSharp5Parser.Anonymous_object_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#anonymous_object_initializer}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_object_initializer(CSharp5Parser.Anonymous_object_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#member_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_declarator_list(CSharp5Parser.Member_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#member_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_declarator_list(CSharp5Parser.Member_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#member_declarator}.
	 * @param ctx the parse tree
	 */
	void enterMember_declarator(CSharp5Parser.Member_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#member_declarator}.
	 * @param ctx the parse tree
	 */
	void exitMember_declarator(CSharp5Parser.Member_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#typeof_expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeof_expression(CSharp5Parser.Typeof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#typeof_expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeof_expression(CSharp5Parser.Typeof_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#unbound_type_name}.
	 * @param ctx the parse tree
	 */
	void enterUnbound_type_name(CSharp5Parser.Unbound_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#unbound_type_name}.
	 * @param ctx the parse tree
	 */
	void exitUnbound_type_name(CSharp5Parser.Unbound_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#generic_dimension_specifier}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_dimension_specifier(CSharp5Parser.Generic_dimension_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#generic_dimension_specifier}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_dimension_specifier(CSharp5Parser.Generic_dimension_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#commas}.
	 * @param ctx the parse tree
	 */
	void enterCommas(CSharp5Parser.CommasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#commas}.
	 * @param ctx the parse tree
	 */
	void exitCommas(CSharp5Parser.CommasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#checked_expression}.
	 * @param ctx the parse tree
	 */
	void enterChecked_expression(CSharp5Parser.Checked_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#checked_expression}.
	 * @param ctx the parse tree
	 */
	void exitChecked_expression(CSharp5Parser.Checked_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#unchecked_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnchecked_expression(CSharp5Parser.Unchecked_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#unchecked_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnchecked_expression(CSharp5Parser.Unchecked_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#default_value_expression}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value_expression(CSharp5Parser.Default_value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#default_value_expression}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value_expression(CSharp5Parser.Default_value_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(CSharp5Parser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(CSharp5Parser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#scan_for_cast_generic_precedence}.
	 * @param ctx the parse tree
	 */
	void enterScan_for_cast_generic_precedence(CSharp5Parser.Scan_for_cast_generic_precedenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#scan_for_cast_generic_precedence}.
	 * @param ctx the parse tree
	 */
	void exitScan_for_cast_generic_precedence(CSharp5Parser.Scan_for_cast_generic_precedenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#cast_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void enterCast_disambiguation_token(CSharp5Parser.Cast_disambiguation_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#cast_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void exitCast_disambiguation_token(CSharp5Parser.Cast_disambiguation_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#pre_increment_expression}.
	 * @param ctx the parse tree
	 */
	void enterPre_increment_expression(CSharp5Parser.Pre_increment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#pre_increment_expression}.
	 * @param ctx the parse tree
	 */
	void exitPre_increment_expression(CSharp5Parser.Pre_increment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#pre_decrement_expression}.
	 * @param ctx the parse tree
	 */
	void enterPre_decrement_expression(CSharp5Parser.Pre_decrement_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#pre_decrement_expression}.
	 * @param ctx the parse tree
	 */
	void exitPre_decrement_expression(CSharp5Parser.Pre_decrement_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(CSharp5Parser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(CSharp5Parser.Cast_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(CSharp5Parser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(CSharp5Parser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(CSharp5Parser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(CSharp5Parser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(CSharp5Parser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(CSharp5Parser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(CSharp5Parser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(CSharp5Parser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#scan_for_shift_generic_precedence}.
	 * @param ctx the parse tree
	 */
	void enterScan_for_shift_generic_precedence(CSharp5Parser.Scan_for_shift_generic_precedenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#scan_for_shift_generic_precedence}.
	 * @param ctx the parse tree
	 */
	void exitScan_for_shift_generic_precedence(CSharp5Parser.Scan_for_shift_generic_precedenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#shift_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void enterShift_disambiguation_token(CSharp5Parser.Shift_disambiguation_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#shift_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void exitShift_disambiguation_token(CSharp5Parser.Shift_disambiguation_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#isType}.
	 * @param ctx the parse tree
	 */
	void enterIsType(CSharp5Parser.IsTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#isType}.
	 * @param ctx the parse tree
	 */
	void exitIsType(CSharp5Parser.IsTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#is_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void enterIs_disambiguation_token(CSharp5Parser.Is_disambiguation_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#is_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void exitIs_disambiguation_token(CSharp5Parser.Is_disambiguation_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(CSharp5Parser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(CSharp5Parser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(CSharp5Parser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(CSharp5Parser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(CSharp5Parser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(CSharp5Parser.Exclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(CSharp5Parser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(CSharp5Parser.Inclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#conditional_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_and_expression(CSharp5Parser.Conditional_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#conditional_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_and_expression(CSharp5Parser.Conditional_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#conditional_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_or_expression(CSharp5Parser.Conditional_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#conditional_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_or_expression(CSharp5Parser.Conditional_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void enterNull_coalescing_expression(CSharp5Parser.Null_coalescing_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void exitNull_coalescing_expression(CSharp5Parser.Null_coalescing_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(CSharp5Parser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(CSharp5Parser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expression(CSharp5Parser.Lambda_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expression(CSharp5Parser.Lambda_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#anonymous_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_method_expression(CSharp5Parser.Anonymous_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#anonymous_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_method_expression(CSharp5Parser.Anonymous_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_signature(CSharp5Parser.Anonymous_function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_signature(CSharp5Parser.Anonymous_function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#explicit_anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_anonymous_function_signature(CSharp5Parser.Explicit_anonymous_function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#explicit_anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_anonymous_function_signature(CSharp5Parser.Explicit_anonymous_function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#explicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_anonymous_function_parameter_list(CSharp5Parser.Explicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#explicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_anonymous_function_parameter_list(CSharp5Parser.Explicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#explicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_anonymous_function_parameter(CSharp5Parser.Explicit_anonymous_function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#explicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_anonymous_function_parameter(CSharp5Parser.Explicit_anonymous_function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#anonymous_function_parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_parameter_modifier(CSharp5Parser.Anonymous_function_parameter_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#anonymous_function_parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_parameter_modifier(CSharp5Parser.Anonymous_function_parameter_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#implicit_anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_anonymous_function_signature(CSharp5Parser.Implicit_anonymous_function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#implicit_anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_anonymous_function_signature(CSharp5Parser.Implicit_anonymous_function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#implicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_anonymous_function_parameter_list(CSharp5Parser.Implicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#implicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_anonymous_function_parameter_list(CSharp5Parser.Implicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#implicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_anonymous_function_parameter(CSharp5Parser.Implicit_anonymous_function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#implicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_anonymous_function_parameter(CSharp5Parser.Implicit_anonymous_function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#anonymous_function_body}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_body(CSharp5Parser.Anonymous_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#anonymous_function_body}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_body(CSharp5Parser.Anonymous_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#query_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_expression(CSharp5Parser.Query_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#query_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_expression(CSharp5Parser.Query_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(CSharp5Parser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(CSharp5Parser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#query_body}.
	 * @param ctx the parse tree
	 */
	void enterQuery_body(CSharp5Parser.Query_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#query_body}.
	 * @param ctx the parse tree
	 */
	void exitQuery_body(CSharp5Parser.Query_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#query_body_clauses}.
	 * @param ctx the parse tree
	 */
	void enterQuery_body_clauses(CSharp5Parser.Query_body_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#query_body_clauses}.
	 * @param ctx the parse tree
	 */
	void exitQuery_body_clauses(CSharp5Parser.Query_body_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#query_body_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_body_clause(CSharp5Parser.Query_body_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#query_body_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_body_clause(CSharp5Parser.Query_body_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#let_clause}.
	 * @param ctx the parse tree
	 */
	void enterLet_clause(CSharp5Parser.Let_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#let_clause}.
	 * @param ctx the parse tree
	 */
	void exitLet_clause(CSharp5Parser.Let_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(CSharp5Parser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(CSharp5Parser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(CSharp5Parser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(CSharp5Parser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#join_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_into_clause(CSharp5Parser.Join_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#join_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_into_clause(CSharp5Parser.Join_into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#combined_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterCombined_join_clause(CSharp5Parser.Combined_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#combined_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitCombined_join_clause(CSharp5Parser.Combined_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(CSharp5Parser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(CSharp5Parser.Orderby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#orderings}.
	 * @param ctx the parse tree
	 */
	void enterOrderings(CSharp5Parser.OrderingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#orderings}.
	 * @param ctx the parse tree
	 */
	void exitOrderings(CSharp5Parser.OrderingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#ordering}.
	 * @param ctx the parse tree
	 */
	void enterOrdering(CSharp5Parser.OrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#ordering}.
	 * @param ctx the parse tree
	 */
	void exitOrdering(CSharp5Parser.OrderingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#ordering_direction}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_direction(CSharp5Parser.Ordering_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#ordering_direction}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_direction(CSharp5Parser.Ordering_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#select_or_group_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_group_clause(CSharp5Parser.Select_or_group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#select_or_group_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_group_clause(CSharp5Parser.Select_or_group_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(CSharp5Parser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(CSharp5Parser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#group_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_clause(CSharp5Parser.Group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#group_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_clause(CSharp5Parser.Group_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#query_continuation}.
	 * @param ctx the parse tree
	 */
	void enterQuery_continuation(CSharp5Parser.Query_continuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#query_continuation}.
	 * @param ctx the parse tree
	 */
	void exitQuery_continuation(CSharp5Parser.Query_continuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CSharp5Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CSharp5Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(CSharp5Parser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(CSharp5Parser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CSharp5Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CSharp5Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#non_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterNon_assignment_expression(CSharp5Parser.Non_assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#non_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitNon_assignment_expression(CSharp5Parser.Non_assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(CSharp5Parser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(CSharp5Parser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(CSharp5Parser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(CSharp5Parser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CSharp5Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CSharp5Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_statement(CSharp5Parser.Embedded_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_statement(CSharp5Parser.Embedded_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_embedded_statement(CSharp5Parser.Simple_embedded_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_embedded_statement(CSharp5Parser.Simple_embedded_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CSharp5Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CSharp5Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(CSharp5Parser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(CSharp5Parser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_statement(CSharp5Parser.Empty_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_statement(CSharp5Parser.Empty_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(CSharp5Parser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(CSharp5Parser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(CSharp5Parser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(CSharp5Parser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#local_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declaration(CSharp5Parser.Local_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#local_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declaration(CSharp5Parser.Local_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#local_variable_type}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_type(CSharp5Parser.Local_variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#local_variable_type}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_type(CSharp5Parser.Local_variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#local_variable_declarators}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declarators(CSharp5Parser.Local_variable_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#local_variable_declarators}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declarators(CSharp5Parser.Local_variable_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#local_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declarator(CSharp5Parser.Local_variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#local_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declarator(CSharp5Parser.Local_variable_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#local_variable_initializer}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_initializer(CSharp5Parser.Local_variable_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#local_variable_initializer}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_initializer(CSharp5Parser.Local_variable_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#local_constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_constant_declaration(CSharp5Parser.Local_constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#local_constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_constant_declaration(CSharp5Parser.Local_constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(CSharp5Parser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(CSharp5Parser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#statement_expression}.
	 * @param ctx the parse tree
	 */
	void enterStatement_expression(CSharp5Parser.Statement_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#statement_expression}.
	 * @param ctx the parse tree
	 */
	void exitStatement_expression(CSharp5Parser.Statement_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(CSharp5Parser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(CSharp5Parser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifBodyBlock}
	 * labeled alternative in {@link CSharp5Parser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIfBodyBlock(CSharp5Parser.IfBodyBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifBodyBlock}
	 * labeled alternative in {@link CSharp5Parser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIfBodyBlock(CSharp5Parser.IfBodyBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifBodySingle}
	 * labeled alternative in {@link CSharp5Parser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIfBodySingle(CSharp5Parser.IfBodySingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifBodySingle}
	 * labeled alternative in {@link CSharp5Parser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIfBodySingle(CSharp5Parser.IfBodySingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(CSharp5Parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(CSharp5Parser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(CSharp5Parser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(CSharp5Parser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#switch_block}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_block(CSharp5Parser.Switch_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#switch_block}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_block(CSharp5Parser.Switch_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#switch_sections}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_sections(CSharp5Parser.Switch_sectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#switch_sections}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_sections(CSharp5Parser.Switch_sectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#switch_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_section(CSharp5Parser.Switch_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#switch_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_section(CSharp5Parser.Switch_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#switch_labels}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_labels(CSharp5Parser.Switch_labelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#switch_labels}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_labels(CSharp5Parser.Switch_labelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#switch_label}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_label(CSharp5Parser.Switch_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#switch_label}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_label(CSharp5Parser.Switch_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(CSharp5Parser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(CSharp5Parser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(CSharp5Parser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(CSharp5Parser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(CSharp5Parser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(CSharp5Parser.Do_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(CSharp5Parser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(CSharp5Parser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#for_initializer}.
	 * @param ctx the parse tree
	 */
	void enterFor_initializer(CSharp5Parser.For_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#for_initializer}.
	 * @param ctx the parse tree
	 */
	void exitFor_initializer(CSharp5Parser.For_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#for_condition}.
	 * @param ctx the parse tree
	 */
	void enterFor_condition(CSharp5Parser.For_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#for_condition}.
	 * @param ctx the parse tree
	 */
	void exitFor_condition(CSharp5Parser.For_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#for_iterator}.
	 * @param ctx the parse tree
	 */
	void enterFor_iterator(CSharp5Parser.For_iteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#for_iterator}.
	 * @param ctx the parse tree
	 */
	void exitFor_iterator(CSharp5Parser.For_iteratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_expression_list(CSharp5Parser.Statement_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_expression_list(CSharp5Parser.Statement_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#foreach_statement}.
	 * @param ctx the parse tree
	 */
	void enterForeach_statement(CSharp5Parser.Foreach_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#foreach_statement}.
	 * @param ctx the parse tree
	 */
	void exitForeach_statement(CSharp5Parser.Foreach_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(CSharp5Parser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(CSharp5Parser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(CSharp5Parser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(CSharp5Parser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(CSharp5Parser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(CSharp5Parser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(CSharp5Parser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(CSharp5Parser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(CSharp5Parser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(CSharp5Parser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(CSharp5Parser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(CSharp5Parser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(CSharp5Parser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(CSharp5Parser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clauses(CSharp5Parser.Catch_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clauses(CSharp5Parser.Catch_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#specific_catch_clauses}.
	 * @param ctx the parse tree
	 */
	void enterSpecific_catch_clauses(CSharp5Parser.Specific_catch_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#specific_catch_clauses}.
	 * @param ctx the parse tree
	 */
	void exitSpecific_catch_clauses(CSharp5Parser.Specific_catch_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#specific_catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterSpecific_catch_clause(CSharp5Parser.Specific_catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#specific_catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitSpecific_catch_clause(CSharp5Parser.Specific_catch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#general_catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_catch_clause(CSharp5Parser.General_catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#general_catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_catch_clause(CSharp5Parser.General_catch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void enterFinally_clause(CSharp5Parser.Finally_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void exitFinally_clause(CSharp5Parser.Finally_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#checked_statement}.
	 * @param ctx the parse tree
	 */
	void enterChecked_statement(CSharp5Parser.Checked_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#checked_statement}.
	 * @param ctx the parse tree
	 */
	void exitChecked_statement(CSharp5Parser.Checked_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#unchecked_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnchecked_statement(CSharp5Parser.Unchecked_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#unchecked_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnchecked_statement(CSharp5Parser.Unchecked_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#lock_statement}.
	 * @param ctx the parse tree
	 */
	void enterLock_statement(CSharp5Parser.Lock_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#lock_statement}.
	 * @param ctx the parse tree
	 */
	void exitLock_statement(CSharp5Parser.Lock_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#using_statement}.
	 * @param ctx the parse tree
	 */
	void enterUsing_statement(CSharp5Parser.Using_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#using_statement}.
	 * @param ctx the parse tree
	 */
	void exitUsing_statement(CSharp5Parser.Using_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#resource_acquisition}.
	 * @param ctx the parse tree
	 */
	void enterResource_acquisition(CSharp5Parser.Resource_acquisitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#resource_acquisition}.
	 * @param ctx the parse tree
	 */
	void exitResource_acquisition(CSharp5Parser.Resource_acquisitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#yield_statement}.
	 * @param ctx the parse tree
	 */
	void enterYield_statement(CSharp5Parser.Yield_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#yield_statement}.
	 * @param ctx the parse tree
	 */
	void exitYield_statement(CSharp5Parser.Yield_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(CSharp5Parser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(CSharp5Parser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#namespace_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_declaration(CSharp5Parser.Namespace_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#namespace_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_declaration(CSharp5Parser.Namespace_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#qualified_identifier}.
	 * @param ctx the parse tree
	 */
	void enterQualified_identifier(CSharp5Parser.Qualified_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#qualified_identifier}.
	 * @param ctx the parse tree
	 */
	void exitQualified_identifier(CSharp5Parser.Qualified_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#namespace_body}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_body(CSharp5Parser.Namespace_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#namespace_body}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_body(CSharp5Parser.Namespace_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#extern_alias_directives}.
	 * @param ctx the parse tree
	 */
	void enterExtern_alias_directives(CSharp5Parser.Extern_alias_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#extern_alias_directives}.
	 * @param ctx the parse tree
	 */
	void exitExtern_alias_directives(CSharp5Parser.Extern_alias_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#extern_alias_directive}.
	 * @param ctx the parse tree
	 */
	void enterExtern_alias_directive(CSharp5Parser.Extern_alias_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#extern_alias_directive}.
	 * @param ctx the parse tree
	 */
	void exitExtern_alias_directive(CSharp5Parser.Extern_alias_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#using_directives}.
	 * @param ctx the parse tree
	 */
	void enterUsing_directives(CSharp5Parser.Using_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#using_directives}.
	 * @param ctx the parse tree
	 */
	void exitUsing_directives(CSharp5Parser.Using_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#using_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsing_directive(CSharp5Parser.Using_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#using_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsing_directive(CSharp5Parser.Using_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#using_alias_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsing_alias_directive(CSharp5Parser.Using_alias_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#using_alias_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsing_alias_directive(CSharp5Parser.Using_alias_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#using_namespace_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsing_namespace_directive(CSharp5Parser.Using_namespace_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#using_namespace_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsing_namespace_directive(CSharp5Parser.Using_namespace_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#namespace_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_member_declarations(CSharp5Parser.Namespace_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#namespace_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_member_declarations(CSharp5Parser.Namespace_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#namespace_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_member_declaration(CSharp5Parser.Namespace_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#namespace_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_member_declaration(CSharp5Parser.Namespace_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(CSharp5Parser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(CSharp5Parser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#qualified_alias_member}.
	 * @param ctx the parse tree
	 */
	void enterQualified_alias_member(CSharp5Parser.Qualified_alias_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#qualified_alias_member}.
	 * @param ctx the parse tree
	 */
	void exitQualified_alias_member(CSharp5Parser.Qualified_alias_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(CSharp5Parser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(CSharp5Parser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#class_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterClass_modifiers(CSharp5Parser.Class_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#class_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitClass_modifiers(CSharp5Parser.Class_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#class_modifier}.
	 * @param ctx the parse tree
	 */
	void enterClass_modifier(CSharp5Parser.Class_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#class_modifier}.
	 * @param ctx the parse tree
	 */
	void exitClass_modifier(CSharp5Parser.Class_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_list(CSharp5Parser.Type_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_list(CSharp5Parser.Type_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#type_parameters}.
	 * @param ctx the parse tree
	 */
	void enterType_parameters(CSharp5Parser.Type_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#type_parameters}.
	 * @param ctx the parse tree
	 */
	void exitType_parameters(CSharp5Parser.Type_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#type_parameter}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter(CSharp5Parser.Type_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#type_parameter}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter(CSharp5Parser.Type_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#class_base}.
	 * @param ctx the parse tree
	 */
	void enterClass_base(CSharp5Parser.Class_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#class_base}.
	 * @param ctx the parse tree
	 */
	void exitClass_base(CSharp5Parser.Class_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_type_list}.
	 * @param ctx the parse tree
	 */
	void enterInterface_type_list(CSharp5Parser.Interface_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_type_list}.
	 * @param ctx the parse tree
	 */
	void exitInterface_type_list(CSharp5Parser.Interface_type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#type_parameter_constraints_clauses}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_constraints_clauses(CSharp5Parser.Type_parameter_constraints_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#type_parameter_constraints_clauses}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_constraints_clauses(CSharp5Parser.Type_parameter_constraints_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#type_parameter_constraints_clause}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_constraints_clause(CSharp5Parser.Type_parameter_constraints_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#type_parameter_constraints_clause}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_constraints_clause(CSharp5Parser.Type_parameter_constraints_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#type_parameter_constraints}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_constraints(CSharp5Parser.Type_parameter_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#type_parameter_constraints}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_constraints(CSharp5Parser.Type_parameter_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#primary_constraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_constraint(CSharp5Parser.Primary_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#primary_constraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_constraint(CSharp5Parser.Primary_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#secondary_constraints}.
	 * @param ctx the parse tree
	 */
	void enterSecondary_constraints(CSharp5Parser.Secondary_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#secondary_constraints}.
	 * @param ctx the parse tree
	 */
	void exitSecondary_constraints(CSharp5Parser.Secondary_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#constructor_constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_constraint(CSharp5Parser.Constructor_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#constructor_constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_constraint(CSharp5Parser.Constructor_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(CSharp5Parser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(CSharp5Parser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#class_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterClass_member_declarations(CSharp5Parser.Class_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#class_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitClass_member_declarations(CSharp5Parser.Class_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#class_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_member_declaration(CSharp5Parser.Class_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#class_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_member_declaration(CSharp5Parser.Class_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#all_member_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterAll_member_modifiers(CSharp5Parser.All_member_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#all_member_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitAll_member_modifiers(CSharp5Parser.All_member_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#all_member_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAll_member_modifier(CSharp5Parser.All_member_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#all_member_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAll_member_modifier(CSharp5Parser.All_member_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#common_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCommon_member_declaration(CSharp5Parser.Common_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#common_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCommon_member_declaration(CSharp5Parser.Common_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#typed_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTyped_member_declaration(CSharp5Parser.Typed_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#typed_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTyped_member_declaration(CSharp5Parser.Typed_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#constant_declarators}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declarators(CSharp5Parser.Constant_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#constant_declarators}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declarators(CSharp5Parser.Constant_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#constant_declarator}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declarator(CSharp5Parser.Constant_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#constant_declarator}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declarator(CSharp5Parser.Constant_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#variable_declarators}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declarators(CSharp5Parser.Variable_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#variable_declarators}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declarators(CSharp5Parser.Variable_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declarator(CSharp5Parser.Variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declarator(CSharp5Parser.Variable_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#variable_initializer}.
	 * @param ctx the parse tree
	 */
	void enterVariable_initializer(CSharp5Parser.Variable_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#variable_initializer}.
	 * @param ctx the parse tree
	 */
	void exitVariable_initializer(CSharp5Parser.Variable_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(CSharp5Parser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(CSharp5Parser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#method_header}.
	 * @param ctx the parse tree
	 */
	void enterMethod_header(CSharp5Parser.Method_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#method_header}.
	 * @param ctx the parse tree
	 */
	void exitMethod_header(CSharp5Parser.Method_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#method_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterMethod_modifiers(CSharp5Parser.Method_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#method_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitMethod_modifiers(CSharp5Parser.Method_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#method_modifier}.
	 * @param ctx the parse tree
	 */
	void enterMethod_modifier(CSharp5Parser.Method_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#method_modifier}.
	 * @param ctx the parse tree
	 */
	void exitMethod_modifier(CSharp5Parser.Method_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(CSharp5Parser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(CSharp5Parser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#member_name}.
	 * @param ctx the parse tree
	 */
	void enterMember_name(CSharp5Parser.Member_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#member_name}.
	 * @param ctx the parse tree
	 */
	void exitMember_name(CSharp5Parser.Member_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#method_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_body(CSharp5Parser.Method_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#method_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_body(CSharp5Parser.Method_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFormal_parameter_list(CSharp5Parser.Formal_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFormal_parameter_list(CSharp5Parser.Formal_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#fixed_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFixed_parameters(CSharp5Parser.Fixed_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#fixed_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFixed_parameters(CSharp5Parser.Fixed_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#fixed_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFixed_parameter(CSharp5Parser.Fixed_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#fixed_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFixed_parameter(CSharp5Parser.Fixed_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#default_argument}.
	 * @param ctx the parse tree
	 */
	void enterDefault_argument(CSharp5Parser.Default_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#default_argument}.
	 * @param ctx the parse tree
	 */
	void exitDefault_argument(CSharp5Parser.Default_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void enterParameter_modifier(CSharp5Parser.Parameter_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void exitParameter_modifier(CSharp5Parser.Parameter_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#parameter_array}.
	 * @param ctx the parse tree
	 */
	void enterParameter_array(CSharp5Parser.Parameter_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#parameter_array}.
	 * @param ctx the parse tree
	 */
	void exitParameter_array(CSharp5Parser.Parameter_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration(CSharp5Parser.Property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration(CSharp5Parser.Property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#property_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterProperty_modifiers(CSharp5Parser.Property_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#property_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitProperty_modifiers(CSharp5Parser.Property_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#property_modifier}.
	 * @param ctx the parse tree
	 */
	void enterProperty_modifier(CSharp5Parser.Property_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#property_modifier}.
	 * @param ctx the parse tree
	 */
	void exitProperty_modifier(CSharp5Parser.Property_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void enterAccessor_declarations(CSharp5Parser.Accessor_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void exitAccessor_declarations(CSharp5Parser.Accessor_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#get_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGet_accessor_declaration(CSharp5Parser.Get_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#get_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGet_accessor_declaration(CSharp5Parser.Get_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#set_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSet_accessor_declaration(CSharp5Parser.Set_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#set_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSet_accessor_declaration(CSharp5Parser.Set_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#accessor_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessor_modifier(CSharp5Parser.Accessor_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#accessor_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessor_modifier(CSharp5Parser.Accessor_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#accessor_body}.
	 * @param ctx the parse tree
	 */
	void enterAccessor_body(CSharp5Parser.Accessor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#accessor_body}.
	 * @param ctx the parse tree
	 */
	void exitAccessor_body(CSharp5Parser.Accessor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#event_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEvent_declaration(CSharp5Parser.Event_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#event_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEvent_declaration(CSharp5Parser.Event_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#event_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterEvent_modifiers(CSharp5Parser.Event_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#event_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitEvent_modifiers(CSharp5Parser.Event_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#event_modifier}.
	 * @param ctx the parse tree
	 */
	void enterEvent_modifier(CSharp5Parser.Event_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#event_modifier}.
	 * @param ctx the parse tree
	 */
	void exitEvent_modifier(CSharp5Parser.Event_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#event_accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void enterEvent_accessor_declarations(CSharp5Parser.Event_accessor_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#event_accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void exitEvent_accessor_declarations(CSharp5Parser.Event_accessor_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#add_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAdd_accessor_declaration(CSharp5Parser.Add_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#add_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAdd_accessor_declaration(CSharp5Parser.Add_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#remove_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRemove_accessor_declaration(CSharp5Parser.Remove_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#remove_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRemove_accessor_declaration(CSharp5Parser.Remove_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#indexer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_declaration(CSharp5Parser.Indexer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#indexer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_declaration(CSharp5Parser.Indexer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#indexer_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_modifiers(CSharp5Parser.Indexer_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#indexer_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_modifiers(CSharp5Parser.Indexer_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#indexer_modifier}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_modifier(CSharp5Parser.Indexer_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#indexer_modifier}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_modifier(CSharp5Parser.Indexer_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#indexer_declarator}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_declarator(CSharp5Parser.Indexer_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#indexer_declarator}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_declarator(CSharp5Parser.Indexer_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declaration(CSharp5Parser.Operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declaration(CSharp5Parser.Operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#operator_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterOperator_modifiers(CSharp5Parser.Operator_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#operator_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitOperator_modifiers(CSharp5Parser.Operator_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#operator_modifier}.
	 * @param ctx the parse tree
	 */
	void enterOperator_modifier(CSharp5Parser.Operator_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#operator_modifier}.
	 * @param ctx the parse tree
	 */
	void exitOperator_modifier(CSharp5Parser.Operator_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#operator_declarator}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declarator(CSharp5Parser.Operator_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#operator_declarator}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declarator(CSharp5Parser.Operator_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#unary_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator_declarator(CSharp5Parser.Unary_operator_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#unary_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator_declarator(CSharp5Parser.Unary_operator_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#overloadable_unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterOverloadable_unary_operator(CSharp5Parser.Overloadable_unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#overloadable_unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitOverloadable_unary_operator(CSharp5Parser.Overloadable_unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#binary_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator_declarator(CSharp5Parser.Binary_operator_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#binary_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator_declarator(CSharp5Parser.Binary_operator_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#overloadable_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterOverloadable_binary_operator(CSharp5Parser.Overloadable_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#overloadable_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitOverloadable_binary_operator(CSharp5Parser.Overloadable_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#overloadable_operator}.
	 * @param ctx the parse tree
	 */
	void enterOverloadable_operator(CSharp5Parser.Overloadable_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#overloadable_operator}.
	 * @param ctx the parse tree
	 */
	void exitOverloadable_operator(CSharp5Parser.Overloadable_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#conversion_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void enterConversion_operator_declarator(CSharp5Parser.Conversion_operator_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#conversion_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void exitConversion_operator_declarator(CSharp5Parser.Conversion_operator_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#operator_body}.
	 * @param ctx the parse tree
	 */
	void enterOperator_body(CSharp5Parser.Operator_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#operator_body}.
	 * @param ctx the parse tree
	 */
	void exitOperator_body(CSharp5Parser.Operator_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(CSharp5Parser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(CSharp5Parser.Constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#constructor_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_modifiers(CSharp5Parser.Constructor_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#constructor_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_modifiers(CSharp5Parser.Constructor_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#constructor_modifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_modifier(CSharp5Parser.Constructor_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#constructor_modifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_modifier(CSharp5Parser.Constructor_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#constructor_declarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declarator(CSharp5Parser.Constructor_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#constructor_declarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declarator(CSharp5Parser.Constructor_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#constructor_initializer}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_initializer(CSharp5Parser.Constructor_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#constructor_initializer}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_initializer(CSharp5Parser.Constructor_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#constructor_body}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_body(CSharp5Parser.Constructor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#constructor_body}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_body(CSharp5Parser.Constructor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#static_constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStatic_constructor_declaration(CSharp5Parser.Static_constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#static_constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStatic_constructor_declaration(CSharp5Parser.Static_constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#static_constructor_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterStatic_constructor_modifiers(CSharp5Parser.Static_constructor_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#static_constructor_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitStatic_constructor_modifiers(CSharp5Parser.Static_constructor_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#static_constructor_body}.
	 * @param ctx the parse tree
	 */
	void enterStatic_constructor_body(CSharp5Parser.Static_constructor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#static_constructor_body}.
	 * @param ctx the parse tree
	 */
	void exitStatic_constructor_body(CSharp5Parser.Static_constructor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#destructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDestructor_declaration(CSharp5Parser.Destructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#destructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDestructor_declaration(CSharp5Parser.Destructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#destructor_body}.
	 * @param ctx the parse tree
	 */
	void enterDestructor_body(CSharp5Parser.Destructor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#destructor_body}.
	 * @param ctx the parse tree
	 */
	void exitDestructor_body(CSharp5Parser.Destructor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CSharp5Parser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CSharp5Parser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(CSharp5Parser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(CSharp5Parser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#struct_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterStruct_modifiers(CSharp5Parser.Struct_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#struct_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitStruct_modifiers(CSharp5Parser.Struct_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#struct_modifier}.
	 * @param ctx the parse tree
	 */
	void enterStruct_modifier(CSharp5Parser.Struct_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#struct_modifier}.
	 * @param ctx the parse tree
	 */
	void exitStruct_modifier(CSharp5Parser.Struct_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#struct_interfaces}.
	 * @param ctx the parse tree
	 */
	void enterStruct_interfaces(CSharp5Parser.Struct_interfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#struct_interfaces}.
	 * @param ctx the parse tree
	 */
	void exitStruct_interfaces(CSharp5Parser.Struct_interfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#struct_body}.
	 * @param ctx the parse tree
	 */
	void enterStruct_body(CSharp5Parser.Struct_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#struct_body}.
	 * @param ctx the parse tree
	 */
	void exitStruct_body(CSharp5Parser.Struct_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#struct_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member_declarations(CSharp5Parser.Struct_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#struct_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member_declarations(CSharp5Parser.Struct_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#struct_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member_declaration(CSharp5Parser.Struct_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#struct_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member_declaration(CSharp5Parser.Struct_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(CSharp5Parser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(CSharp5Parser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#non_array_type}.
	 * @param ctx the parse tree
	 */
	void enterNon_array_type(CSharp5Parser.Non_array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#non_array_type}.
	 * @param ctx the parse tree
	 */
	void exitNon_array_type(CSharp5Parser.Non_array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#rank_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterRank_specifiers(CSharp5Parser.Rank_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#rank_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitRank_specifiers(CSharp5Parser.Rank_specifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#rank_specifier}.
	 * @param ctx the parse tree
	 */
	void enterRank_specifier(CSharp5Parser.Rank_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#rank_specifier}.
	 * @param ctx the parse tree
	 */
	void exitRank_specifier(CSharp5Parser.Rank_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#dim_separators}.
	 * @param ctx the parse tree
	 */
	void enterDim_separators(CSharp5Parser.Dim_separatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#dim_separators}.
	 * @param ctx the parse tree
	 */
	void exitDim_separators(CSharp5Parser.Dim_separatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void enterArray_initializer(CSharp5Parser.Array_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void exitArray_initializer(CSharp5Parser.Array_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#variable_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_initializer_list(CSharp5Parser.Variable_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#variable_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_initializer_list(CSharp5Parser.Variable_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_declaration(CSharp5Parser.Interface_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_declaration(CSharp5Parser.Interface_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterInterface_modifiers(CSharp5Parser.Interface_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitInterface_modifiers(CSharp5Parser.Interface_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_modifier}.
	 * @param ctx the parse tree
	 */
	void enterInterface_modifier(CSharp5Parser.Interface_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_modifier}.
	 * @param ctx the parse tree
	 */
	void exitInterface_modifier(CSharp5Parser.Interface_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#variant_type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterVariant_type_parameter_list(CSharp5Parser.Variant_type_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#variant_type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitVariant_type_parameter_list(CSharp5Parser.Variant_type_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#variant_type_parameters}.
	 * @param ctx the parse tree
	 */
	void enterVariant_type_parameters(CSharp5Parser.Variant_type_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#variant_type_parameters}.
	 * @param ctx the parse tree
	 */
	void exitVariant_type_parameters(CSharp5Parser.Variant_type_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#variance_annotation}.
	 * @param ctx the parse tree
	 */
	void enterVariance_annotation(CSharp5Parser.Variance_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#variance_annotation}.
	 * @param ctx the parse tree
	 */
	void exitVariance_annotation(CSharp5Parser.Variance_annotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_base}.
	 * @param ctx the parse tree
	 */
	void enterInterface_base(CSharp5Parser.Interface_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_base}.
	 * @param ctx the parse tree
	 */
	void exitInterface_base(CSharp5Parser.Interface_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_body}.
	 * @param ctx the parse tree
	 */
	void enterInterface_body(CSharp5Parser.Interface_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_body}.
	 * @param ctx the parse tree
	 */
	void exitInterface_body(CSharp5Parser.Interface_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterInterface_member_declarations(CSharp5Parser.Interface_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitInterface_member_declarations(CSharp5Parser.Interface_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_member_declaration(CSharp5Parser.Interface_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_member_declaration(CSharp5Parser.Interface_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_method_declaration(CSharp5Parser.Interface_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_method_declaration(CSharp5Parser.Interface_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_property_declaration(CSharp5Parser.Interface_property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_property_declaration(CSharp5Parser.Interface_property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_accessors}.
	 * @param ctx the parse tree
	 */
	void enterInterface_accessors(CSharp5Parser.Interface_accessorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_accessors}.
	 * @param ctx the parse tree
	 */
	void exitInterface_accessors(CSharp5Parser.Interface_accessorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_event_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_event_declaration(CSharp5Parser.Interface_event_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_event_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_event_declaration(CSharp5Parser.Interface_event_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_indexer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_indexer_declaration(CSharp5Parser.Interface_indexer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_indexer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_indexer_declaration(CSharp5Parser.Interface_indexer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_declaration(CSharp5Parser.Enum_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_declaration(CSharp5Parser.Enum_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#enum_base}.
	 * @param ctx the parse tree
	 */
	void enterEnum_base(CSharp5Parser.Enum_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#enum_base}.
	 * @param ctx the parse tree
	 */
	void exitEnum_base(CSharp5Parser.Enum_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#enum_body}.
	 * @param ctx the parse tree
	 */
	void enterEnum_body(CSharp5Parser.Enum_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#enum_body}.
	 * @param ctx the parse tree
	 */
	void exitEnum_body(CSharp5Parser.Enum_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#enum_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterEnum_modifiers(CSharp5Parser.Enum_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#enum_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitEnum_modifiers(CSharp5Parser.Enum_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#enum_modifier}.
	 * @param ctx the parse tree
	 */
	void enterEnum_modifier(CSharp5Parser.Enum_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#enum_modifier}.
	 * @param ctx the parse tree
	 */
	void exitEnum_modifier(CSharp5Parser.Enum_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#enum_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterEnum_member_declarations(CSharp5Parser.Enum_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#enum_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitEnum_member_declarations(CSharp5Parser.Enum_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#enum_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_member_declaration(CSharp5Parser.Enum_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#enum_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_member_declaration(CSharp5Parser.Enum_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#delegate_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_declaration(CSharp5Parser.Delegate_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#delegate_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_declaration(CSharp5Parser.Delegate_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#delegate_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_modifiers(CSharp5Parser.Delegate_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#delegate_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_modifiers(CSharp5Parser.Delegate_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#delegate_modifier}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_modifier(CSharp5Parser.Delegate_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#delegate_modifier}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_modifier(CSharp5Parser.Delegate_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#global_attributes}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attributes(CSharp5Parser.Global_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#global_attributes}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attributes(CSharp5Parser.Global_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#global_attribute_sections}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_sections(CSharp5Parser.Global_attribute_sectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#global_attribute_sections}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_sections(CSharp5Parser.Global_attribute_sectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#global_attribute_section}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_section(CSharp5Parser.Global_attribute_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#global_attribute_section}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_section(CSharp5Parser.Global_attribute_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#global_attribute_target_specifier}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_target_specifier(CSharp5Parser.Global_attribute_target_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#global_attribute_target_specifier}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_target_specifier(CSharp5Parser.Global_attribute_target_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#global_attribute_target}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_target(CSharp5Parser.Global_attribute_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#global_attribute_target}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_target(CSharp5Parser.Global_attribute_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(CSharp5Parser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(CSharp5Parser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#attribute_sections}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_sections(CSharp5Parser.Attribute_sectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#attribute_sections}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_sections(CSharp5Parser.Attribute_sectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#attribute_section}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_section(CSharp5Parser.Attribute_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#attribute_section}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_section(CSharp5Parser.Attribute_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#attribute_target_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_target_specifier(CSharp5Parser.Attribute_target_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#attribute_target_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_target_specifier(CSharp5Parser.Attribute_target_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#attribute_target}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_target(CSharp5Parser.Attribute_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#attribute_target}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_target(CSharp5Parser.Attribute_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(CSharp5Parser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(CSharp5Parser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(CSharp5Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(CSharp5Parser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(CSharp5Parser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(CSharp5Parser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#attribute_arguments}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_arguments(CSharp5Parser.Attribute_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#attribute_arguments}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_arguments(CSharp5Parser.Attribute_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#positional_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPositional_argument_list(CSharp5Parser.Positional_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#positional_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPositional_argument_list(CSharp5Parser.Positional_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#positional_argument}.
	 * @param ctx the parse tree
	 */
	void enterPositional_argument(CSharp5Parser.Positional_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#positional_argument}.
	 * @param ctx the parse tree
	 */
	void exitPositional_argument(CSharp5Parser.Positional_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#named_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterNamed_argument_list(CSharp5Parser.Named_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#named_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitNamed_argument_list(CSharp5Parser.Named_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#named_argument}.
	 * @param ctx the parse tree
	 */
	void enterNamed_argument(CSharp5Parser.Named_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#named_argument}.
	 * @param ctx the parse tree
	 */
	void exitNamed_argument(CSharp5Parser.Named_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#attribute_argument_expression}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_argument_expression(CSharp5Parser.Attribute_argument_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#attribute_argument_expression}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_argument_expression(CSharp5Parser.Attribute_argument_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#class_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterClass_modifier_unsafe(CSharp5Parser.Class_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#class_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitClass_modifier_unsafe(CSharp5Parser.Class_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#struct_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterStruct_modifier_unsafe(CSharp5Parser.Struct_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#struct_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitStruct_modifier_unsafe(CSharp5Parser.Struct_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterInterface_modifier_unsafe(CSharp5Parser.Interface_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitInterface_modifier_unsafe(CSharp5Parser.Interface_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#delegate_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_modifier_unsafe(CSharp5Parser.Delegate_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#delegate_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_modifier_unsafe(CSharp5Parser.Delegate_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#field_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterField_modifier_unsafe(CSharp5Parser.Field_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#field_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitField_modifier_unsafe(CSharp5Parser.Field_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#method_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterMethod_modifier_unsafe(CSharp5Parser.Method_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#method_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitMethod_modifier_unsafe(CSharp5Parser.Method_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#property_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterProperty_modifier_unsafe(CSharp5Parser.Property_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#property_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitProperty_modifier_unsafe(CSharp5Parser.Property_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#event_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterEvent_modifier_unsafe(CSharp5Parser.Event_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#event_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitEvent_modifier_unsafe(CSharp5Parser.Event_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#indexer_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_modifier_unsafe(CSharp5Parser.Indexer_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#indexer_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_modifier_unsafe(CSharp5Parser.Indexer_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#operator_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterOperator_modifier_unsafe(CSharp5Parser.Operator_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#operator_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitOperator_modifier_unsafe(CSharp5Parser.Operator_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#constructor_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_modifier_unsafe(CSharp5Parser.Constructor_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#constructor_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_modifier_unsafe(CSharp5Parser.Constructor_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#destructor_declaration_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterDestructor_declaration_unsafe(CSharp5Parser.Destructor_declaration_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#destructor_declaration_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitDestructor_declaration_unsafe(CSharp5Parser.Destructor_declaration_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#static_constructor_modifiers_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterStatic_constructor_modifiers_unsafe(CSharp5Parser.Static_constructor_modifiers_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#static_constructor_modifiers_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitStatic_constructor_modifiers_unsafe(CSharp5Parser.Static_constructor_modifiers_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#embedded_statement_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_statement_unsafe(CSharp5Parser.Embedded_statement_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#embedded_statement_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_statement_unsafe(CSharp5Parser.Embedded_statement_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#unsafe_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsafe_statement(CSharp5Parser.Unsafe_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#unsafe_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsafe_statement(CSharp5Parser.Unsafe_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#type_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterType_unsafe(CSharp5Parser.Type_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#type_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitType_unsafe(CSharp5Parser.Type_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#pointer_type}.
	 * @param ctx the parse tree
	 */
	void enterPointer_type(CSharp5Parser.Pointer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#pointer_type}.
	 * @param ctx the parse tree
	 */
	void exitPointer_type(CSharp5Parser.Pointer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#unmanaged_type}.
	 * @param ctx the parse tree
	 */
	void enterUnmanaged_type(CSharp5Parser.Unmanaged_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#unmanaged_type}.
	 * @param ctx the parse tree
	 */
	void exitUnmanaged_type(CSharp5Parser.Unmanaged_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#primary_no_array_creation_expression_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_no_array_creation_expression_unsafe(CSharp5Parser.Primary_no_array_creation_expression_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#primary_no_array_creation_expression_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_no_array_creation_expression_unsafe(CSharp5Parser.Primary_no_array_creation_expression_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#unary_expression_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression_unsafe(CSharp5Parser.Unary_expression_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#unary_expression_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression_unsafe(CSharp5Parser.Unary_expression_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#pointer_indirection_expression}.
	 * @param ctx the parse tree
	 */
	void enterPointer_indirection_expression(CSharp5Parser.Pointer_indirection_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#pointer_indirection_expression}.
	 * @param ctx the parse tree
	 */
	void exitPointer_indirection_expression(CSharp5Parser.Pointer_indirection_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#addressof_expression}.
	 * @param ctx the parse tree
	 */
	void enterAddressof_expression(CSharp5Parser.Addressof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#addressof_expression}.
	 * @param ctx the parse tree
	 */
	void exitAddressof_expression(CSharp5Parser.Addressof_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_expression(CSharp5Parser.Sizeof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_expression(CSharp5Parser.Sizeof_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#fixed_statement}.
	 * @param ctx the parse tree
	 */
	void enterFixed_statement(CSharp5Parser.Fixed_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#fixed_statement}.
	 * @param ctx the parse tree
	 */
	void exitFixed_statement(CSharp5Parser.Fixed_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#fixed_pointer_declarators}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pointer_declarators(CSharp5Parser.Fixed_pointer_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#fixed_pointer_declarators}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pointer_declarators(CSharp5Parser.Fixed_pointer_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#fixed_pointer_declarator}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pointer_declarator(CSharp5Parser.Fixed_pointer_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#fixed_pointer_declarator}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pointer_declarator(CSharp5Parser.Fixed_pointer_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#fixed_pointer_initializer}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pointer_initializer(CSharp5Parser.Fixed_pointer_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#fixed_pointer_initializer}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pointer_initializer(CSharp5Parser.Fixed_pointer_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#struct_member_declaration_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member_declaration_unsafe(CSharp5Parser.Struct_member_declaration_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#struct_member_declaration_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member_declaration_unsafe(CSharp5Parser.Struct_member_declaration_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#fixed_size_buffer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_declaration(CSharp5Parser.Fixed_size_buffer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#fixed_size_buffer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_declaration(CSharp5Parser.Fixed_size_buffer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#fixed_size_buffer_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_modifiers(CSharp5Parser.Fixed_size_buffer_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#fixed_size_buffer_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_modifiers(CSharp5Parser.Fixed_size_buffer_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#fixed_size_buffer_modifier}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_modifier(CSharp5Parser.Fixed_size_buffer_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#fixed_size_buffer_modifier}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_modifier(CSharp5Parser.Fixed_size_buffer_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#buffer_element_type}.
	 * @param ctx the parse tree
	 */
	void enterBuffer_element_type(CSharp5Parser.Buffer_element_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#buffer_element_type}.
	 * @param ctx the parse tree
	 */
	void exitBuffer_element_type(CSharp5Parser.Buffer_element_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#fixed_size_buffer_declarators}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_declarators(CSharp5Parser.Fixed_size_buffer_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#fixed_size_buffer_declarators}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_declarators(CSharp5Parser.Fixed_size_buffer_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#fixed_size_buffer_declarator}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_declarator(CSharp5Parser.Fixed_size_buffer_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#fixed_size_buffer_declarator}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_declarator(CSharp5Parser.Fixed_size_buffer_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#local_variable_initializer_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_initializer_unsafe(CSharp5Parser.Local_variable_initializer_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#local_variable_initializer_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_initializer_unsafe(CSharp5Parser.Local_variable_initializer_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#stackalloc_initializer}.
	 * @param ctx the parse tree
	 */
	void enterStackalloc_initializer(CSharp5Parser.Stackalloc_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#stackalloc_initializer}.
	 * @param ctx the parse tree
	 */
	void exitStackalloc_initializer(CSharp5Parser.Stackalloc_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#from_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterFrom_contextual_keyword(CSharp5Parser.From_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#from_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitFrom_contextual_keyword(CSharp5Parser.From_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#let_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterLet_contextual_keyword(CSharp5Parser.Let_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#let_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitLet_contextual_keyword(CSharp5Parser.Let_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#where_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterWhere_contextual_keyword(CSharp5Parser.Where_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#where_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitWhere_contextual_keyword(CSharp5Parser.Where_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#join_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterJoin_contextual_keyword(CSharp5Parser.Join_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#join_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitJoin_contextual_keyword(CSharp5Parser.Join_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#on_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterOn_contextual_keyword(CSharp5Parser.On_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#on_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitOn_contextual_keyword(CSharp5Parser.On_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#equals_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterEquals_contextual_keyword(CSharp5Parser.Equals_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#equals_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitEquals_contextual_keyword(CSharp5Parser.Equals_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#into_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterInto_contextual_keyword(CSharp5Parser.Into_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#into_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitInto_contextual_keyword(CSharp5Parser.Into_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#orderby_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_contextual_keyword(CSharp5Parser.Orderby_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#orderby_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_contextual_keyword(CSharp5Parser.Orderby_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#ascending_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAscending_contextual_keyword(CSharp5Parser.Ascending_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#ascending_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAscending_contextual_keyword(CSharp5Parser.Ascending_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#descending_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterDescending_contextual_keyword(CSharp5Parser.Descending_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#descending_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitDescending_contextual_keyword(CSharp5Parser.Descending_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#select_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterSelect_contextual_keyword(CSharp5Parser.Select_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#select_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitSelect_contextual_keyword(CSharp5Parser.Select_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#group_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterGroup_contextual_keyword(CSharp5Parser.Group_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#group_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitGroup_contextual_keyword(CSharp5Parser.Group_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#by_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterBy_contextual_keyword(CSharp5Parser.By_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#by_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitBy_contextual_keyword(CSharp5Parser.By_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#partial_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterPartial_contextual_keyword(CSharp5Parser.Partial_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#partial_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitPartial_contextual_keyword(CSharp5Parser.Partial_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#alias_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAlias_contextual_keyword(CSharp5Parser.Alias_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#alias_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAlias_contextual_keyword(CSharp5Parser.Alias_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#yield_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterYield_contextual_keyword(CSharp5Parser.Yield_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#yield_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitYield_contextual_keyword(CSharp5Parser.Yield_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#get_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterGet_contextual_keyword(CSharp5Parser.Get_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#get_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitGet_contextual_keyword(CSharp5Parser.Get_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#set_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterSet_contextual_keyword(CSharp5Parser.Set_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#set_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitSet_contextual_keyword(CSharp5Parser.Set_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#add_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAdd_contextual_keyword(CSharp5Parser.Add_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#add_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAdd_contextual_keyword(CSharp5Parser.Add_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#remove_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterRemove_contextual_keyword(CSharp5Parser.Remove_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#remove_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitRemove_contextual_keyword(CSharp5Parser.Remove_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#dynamic_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_contextual_keyword(CSharp5Parser.Dynamic_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#dynamic_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_contextual_keyword(CSharp5Parser.Dynamic_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(CSharp5Parser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(CSharp5Parser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#right_arrow}.
	 * @param ctx the parse tree
	 */
	void enterRight_arrow(CSharp5Parser.Right_arrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#right_arrow}.
	 * @param ctx the parse tree
	 */
	void exitRight_arrow(CSharp5Parser.Right_arrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#right_shift}.
	 * @param ctx the parse tree
	 */
	void enterRight_shift(CSharp5Parser.Right_shiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#right_shift}.
	 * @param ctx the parse tree
	 */
	void exitRight_shift(CSharp5Parser.Right_shiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#right_shift_assignment}.
	 * @param ctx the parse tree
	 */
	void enterRight_shift_assignment(CSharp5Parser.Right_shift_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#right_shift_assignment}.
	 * @param ctx the parse tree
	 */
	void exitRight_shift_assignment(CSharp5Parser.Right_shift_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CSharp5Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CSharp5Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(CSharp5Parser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(CSharp5Parser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(CSharp5Parser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(CSharp5Parser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(CSharp5Parser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(CSharp5Parser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#struct_definition}.
	 * @param ctx the parse tree
	 */
	void enterStruct_definition(CSharp5Parser.Struct_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#struct_definition}.
	 * @param ctx the parse tree
	 */
	void exitStruct_definition(CSharp5Parser.Struct_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_definition}.
	 * @param ctx the parse tree
	 */
	void enterInterface_definition(CSharp5Parser.Interface_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_definition}.
	 * @param ctx the parse tree
	 */
	void exitInterface_definition(CSharp5Parser.Interface_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#enum_definition}.
	 * @param ctx the parse tree
	 */
	void enterEnum_definition(CSharp5Parser.Enum_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#enum_definition}.
	 * @param ctx the parse tree
	 */
	void exitEnum_definition(CSharp5Parser.Enum_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#delegate_definition}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_definition(CSharp5Parser.Delegate_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#delegate_definition}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_definition(CSharp5Parser.Delegate_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#event_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterEvent_declaration2(CSharp5Parser.Event_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#event_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitEvent_declaration2(CSharp5Parser.Event_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#field_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterField_declaration2(CSharp5Parser.Field_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#field_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitField_declaration2(CSharp5Parser.Field_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#property_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration2(CSharp5Parser.Property_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#property_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration2(CSharp5Parser.Property_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#constant_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration2(CSharp5Parser.Constant_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#constant_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration2(CSharp5Parser.Constant_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#indexer_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_declaration2(CSharp5Parser.Indexer_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#indexer_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_declaration2(CSharp5Parser.Indexer_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#destructor_definition}.
	 * @param ctx the parse tree
	 */
	void enterDestructor_definition(CSharp5Parser.Destructor_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#destructor_definition}.
	 * @param ctx the parse tree
	 */
	void exitDestructor_definition(CSharp5Parser.Destructor_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#constructor_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration2(CSharp5Parser.Constructor_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#constructor_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration2(CSharp5Parser.Constructor_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#method_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration2(CSharp5Parser.Method_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#method_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration2(CSharp5Parser.Method_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#method_member_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_member_name(CSharp5Parser.Method_member_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#method_member_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_member_name(CSharp5Parser.Method_member_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#method_member_name2}.
	 * @param ctx the parse tree
	 */
	void enterMethod_member_name2(CSharp5Parser.Method_member_name2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#method_member_name2}.
	 * @param ctx the parse tree
	 */
	void exitMethod_member_name2(CSharp5Parser.Method_member_name2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#operator_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declaration2(CSharp5Parser.Operator_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#operator_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declaration2(CSharp5Parser.Operator_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_method_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterInterface_method_declaration2(CSharp5Parser.Interface_method_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_method_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitInterface_method_declaration2(CSharp5Parser.Interface_method_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_property_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterInterface_property_declaration2(CSharp5Parser.Interface_property_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_property_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitInterface_property_declaration2(CSharp5Parser.Interface_property_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_event_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterInterface_event_declaration2(CSharp5Parser.Interface_event_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_event_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitInterface_event_declaration2(CSharp5Parser.Interface_event_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#interface_indexer_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterInterface_indexer_declaration2(CSharp5Parser.Interface_indexer_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#interface_indexer_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitInterface_indexer_declaration2(CSharp5Parser.Interface_indexer_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#member_access2}.
	 * @param ctx the parse tree
	 */
	void enterMember_access2(CSharp5Parser.Member_access2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#member_access2}.
	 * @param ctx the parse tree
	 */
	void exitMember_access2(CSharp5Parser.Member_access2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#method_invocation2}.
	 * @param ctx the parse tree
	 */
	void enterMethod_invocation2(CSharp5Parser.Method_invocation2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#method_invocation2}.
	 * @param ctx the parse tree
	 */
	void exitMethod_invocation2(CSharp5Parser.Method_invocation2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp5Parser#object_creation_expression2}.
	 * @param ctx the parse tree
	 */
	void enterObject_creation_expression2(CSharp5Parser.Object_creation_expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp5Parser#object_creation_expression2}.
	 * @param ctx the parse tree
	 */
	void exitObject_creation_expression2(CSharp5Parser.Object_creation_expression2Context ctx);
}