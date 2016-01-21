// Generated from csharp/CSharp6.g4 by ANTLR 4.5.1
package net.siliconcode.parsers.csharp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSharp6Parser}.
 */
public interface CSharp6Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#namespace_name}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_name(CSharp6Parser.Namespace_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#namespace_name}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_name(CSharp6Parser.Namespace_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(CSharp6Parser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(CSharp6Parser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(CSharp6Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(CSharp6Parser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#namespace_or_type_name}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_or_type_name(CSharp6Parser.Namespace_or_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#namespace_or_type_name}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_or_type_name(CSharp6Parser.Namespace_or_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#type_argument_list_opt}.
	 * @param ctx the parse tree
	 */
	void enterType_argument_list_opt(CSharp6Parser.Type_argument_list_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#type_argument_list_opt}.
	 * @param ctx the parse tree
	 */
	void exitType_argument_list_opt(CSharp6Parser.Type_argument_list_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CSharp6Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CSharp6Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#base_type}.
	 * @param ctx the parse tree
	 */
	void enterBase_type(CSharp6Parser.Base_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#base_type}.
	 * @param ctx the parse tree
	 */
	void exitBase_type(CSharp6Parser.Base_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#simple_type}.
	 * @param ctx the parse tree
	 */
	void enterSimple_type(CSharp6Parser.Simple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#simple_type}.
	 * @param ctx the parse tree
	 */
	void exitSimple_type(CSharp6Parser.Simple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_type(CSharp6Parser.Numeric_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#numeric_type}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_type(CSharp6Parser.Numeric_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#integral_type}.
	 * @param ctx the parse tree
	 */
	void enterIntegral_type(CSharp6Parser.Integral_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#integral_type}.
	 * @param ctx the parse tree
	 */
	void exitIntegral_type(CSharp6Parser.Integral_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#floating_point_type}.
	 * @param ctx the parse tree
	 */
	void enterFloating_point_type(CSharp6Parser.Floating_point_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#floating_point_type}.
	 * @param ctx the parse tree
	 */
	void exitFloating_point_type(CSharp6Parser.Floating_point_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#nullable_type}.
	 * @param ctx the parse tree
	 */
	void enterNullable_type(CSharp6Parser.Nullable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#nullable_type}.
	 * @param ctx the parse tree
	 */
	void exitNullable_type(CSharp6Parser.Nullable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#non_nullable_value_type}.
	 * @param ctx the parse tree
	 */
	void enterNon_nullable_value_type(CSharp6Parser.Non_nullable_value_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#non_nullable_value_type}.
	 * @param ctx the parse tree
	 */
	void exitNon_nullable_value_type(CSharp6Parser.Non_nullable_value_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#reference_type}.
	 * @param ctx the parse tree
	 */
	void enterReference_type(CSharp6Parser.Reference_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#reference_type}.
	 * @param ctx the parse tree
	 */
	void exitReference_type(CSharp6Parser.Reference_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(CSharp6Parser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(CSharp6Parser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_type}.
	 * @param ctx the parse tree
	 */
	void enterInterface_type(CSharp6Parser.Interface_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_type}.
	 * @param ctx the parse tree
	 */
	void exitInterface_type(CSharp6Parser.Interface_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#delegate_type}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_type(CSharp6Parser.Delegate_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#delegate_type}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_type(CSharp6Parser.Delegate_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#type_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterType_argument_list(CSharp6Parser.Type_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#type_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitType_argument_list(CSharp6Parser.Type_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#type_arguments}.
	 * @param ctx the parse tree
	 */
	void enterType_arguments(CSharp6Parser.Type_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#type_arguments}.
	 * @param ctx the parse tree
	 */
	void exitType_arguments(CSharp6Parser.Type_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#type_argument}.
	 * @param ctx the parse tree
	 */
	void enterType_argument(CSharp6Parser.Type_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#type_argument}.
	 * @param ctx the parse tree
	 */
	void exitType_argument(CSharp6Parser.Type_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#type_void}.
	 * @param ctx the parse tree
	 */
	void enterType_void(CSharp6Parser.Type_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#type_void}.
	 * @param ctx the parse tree
	 */
	void exitType_void(CSharp6Parser.Type_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#variable_reference}.
	 * @param ctx the parse tree
	 */
	void enterVariable_reference(CSharp6Parser.Variable_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#variable_reference}.
	 * @param ctx the parse tree
	 */
	void exitVariable_reference(CSharp6Parser.Variable_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(CSharp6Parser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(CSharp6Parser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(CSharp6Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(CSharp6Parser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#argument_name}.
	 * @param ctx the parse tree
	 */
	void enterArgument_name(CSharp6Parser.Argument_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#argument_name}.
	 * @param ctx the parse tree
	 */
	void exitArgument_name(CSharp6Parser.Argument_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#argument_value}.
	 * @param ctx the parse tree
	 */
	void enterArgument_value(CSharp6Parser.Argument_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#argument_value}.
	 * @param ctx the parse tree
	 */
	void exitArgument_value(CSharp6Parser.Argument_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(CSharp6Parser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(CSharp6Parser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression_start(CSharp6Parser.Primary_expression_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#primary_expression_start}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression_start(CSharp6Parser.Primary_expression_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void enterBracket_expression(CSharp6Parser.Bracket_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void exitBracket_expression(CSharp6Parser.Bracket_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#simple_name}.
	 * @param ctx the parse tree
	 */
	void enterSimple_name(CSharp6Parser.Simple_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#simple_name}.
	 * @param ctx the parse tree
	 */
	void exitSimple_name(CSharp6Parser.Simple_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesized_expression(CSharp6Parser.Parenthesized_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#parenthesized_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesized_expression(CSharp6Parser.Parenthesized_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#member_access}.
	 * @param ctx the parse tree
	 */
	void enterMember_access(CSharp6Parser.Member_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#member_access}.
	 * @param ctx the parse tree
	 */
	void exitMember_access(CSharp6Parser.Member_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void enterPredefined_type(CSharp6Parser.Predefined_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void exitPredefined_type(CSharp6Parser.Predefined_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(CSharp6Parser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(CSharp6Parser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#this_access}.
	 * @param ctx the parse tree
	 */
	void enterThis_access(CSharp6Parser.This_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#this_access}.
	 * @param ctx the parse tree
	 */
	void exitThis_access(CSharp6Parser.This_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#base_access}.
	 * @param ctx the parse tree
	 */
	void enterBase_access(CSharp6Parser.Base_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#base_access}.
	 * @param ctx the parse tree
	 */
	void exitBase_access(CSharp6Parser.Base_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void enterObject_creation_expression(CSharp6Parser.Object_creation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void exitObject_creation_expression(CSharp6Parser.Object_creation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#object_or_collection_initializer}.
	 * @param ctx the parse tree
	 */
	void enterObject_or_collection_initializer(CSharp6Parser.Object_or_collection_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#object_or_collection_initializer}.
	 * @param ctx the parse tree
	 */
	void exitObject_or_collection_initializer(CSharp6Parser.Object_or_collection_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#object_initializer}.
	 * @param ctx the parse tree
	 */
	void enterObject_initializer(CSharp6Parser.Object_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#object_initializer}.
	 * @param ctx the parse tree
	 */
	void exitObject_initializer(CSharp6Parser.Object_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#member_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_initializer_list(CSharp6Parser.Member_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#member_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_initializer_list(CSharp6Parser.Member_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#member_initializer}.
	 * @param ctx the parse tree
	 */
	void enterMember_initializer(CSharp6Parser.Member_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#member_initializer}.
	 * @param ctx the parse tree
	 */
	void exitMember_initializer(CSharp6Parser.Member_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#initializer_value}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_value(CSharp6Parser.Initializer_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#initializer_value}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_value(CSharp6Parser.Initializer_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#collection_initializer}.
	 * @param ctx the parse tree
	 */
	void enterCollection_initializer(CSharp6Parser.Collection_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#collection_initializer}.
	 * @param ctx the parse tree
	 */
	void exitCollection_initializer(CSharp6Parser.Collection_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#element_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterElement_initializer_list(CSharp6Parser.Element_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#element_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitElement_initializer_list(CSharp6Parser.Element_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#element_initializer}.
	 * @param ctx the parse tree
	 */
	void enterElement_initializer(CSharp6Parser.Element_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#element_initializer}.
	 * @param ctx the parse tree
	 */
	void exitElement_initializer(CSharp6Parser.Element_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#indexer_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_initializer_list(CSharp6Parser.Indexer_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#indexer_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_initializer_list(CSharp6Parser.Indexer_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#index_initializer}.
	 * @param ctx the parse tree
	 */
	void enterIndex_initializer(CSharp6Parser.Index_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#index_initializer}.
	 * @param ctx the parse tree
	 */
	void exitIndex_initializer(CSharp6Parser.Index_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#array_creation_expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_creation_expression(CSharp6Parser.Array_creation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#array_creation_expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_creation_expression(CSharp6Parser.Array_creation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#delegate_creation_expression}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_creation_expression(CSharp6Parser.Delegate_creation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#delegate_creation_expression}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_creation_expression(CSharp6Parser.Delegate_creation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#anonymous_object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_object_creation_expression(CSharp6Parser.Anonymous_object_creation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#anonymous_object_creation_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_object_creation_expression(CSharp6Parser.Anonymous_object_creation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#anonymous_object_initializer}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_object_initializer(CSharp6Parser.Anonymous_object_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#anonymous_object_initializer}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_object_initializer(CSharp6Parser.Anonymous_object_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#member_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_declarator_list(CSharp6Parser.Member_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#member_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_declarator_list(CSharp6Parser.Member_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#member_declarator}.
	 * @param ctx the parse tree
	 */
	void enterMember_declarator(CSharp6Parser.Member_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#member_declarator}.
	 * @param ctx the parse tree
	 */
	void exitMember_declarator(CSharp6Parser.Member_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#typeof_expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeof_expression(CSharp6Parser.Typeof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#typeof_expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeof_expression(CSharp6Parser.Typeof_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#unbound_type_name}.
	 * @param ctx the parse tree
	 */
	void enterUnbound_type_name(CSharp6Parser.Unbound_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#unbound_type_name}.
	 * @param ctx the parse tree
	 */
	void exitUnbound_type_name(CSharp6Parser.Unbound_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#generic_dimension_specifier}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_dimension_specifier(CSharp6Parser.Generic_dimension_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#generic_dimension_specifier}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_dimension_specifier(CSharp6Parser.Generic_dimension_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#commas}.
	 * @param ctx the parse tree
	 */
	void enterCommas(CSharp6Parser.CommasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#commas}.
	 * @param ctx the parse tree
	 */
	void exitCommas(CSharp6Parser.CommasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#checked_expression}.
	 * @param ctx the parse tree
	 */
	void enterChecked_expression(CSharp6Parser.Checked_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#checked_expression}.
	 * @param ctx the parse tree
	 */
	void exitChecked_expression(CSharp6Parser.Checked_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#unchecked_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnchecked_expression(CSharp6Parser.Unchecked_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#unchecked_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnchecked_expression(CSharp6Parser.Unchecked_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#default_value_expression}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value_expression(CSharp6Parser.Default_value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#default_value_expression}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value_expression(CSharp6Parser.Default_value_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(CSharp6Parser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(CSharp6Parser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#scan_for_cast_generic_precedence}.
	 * @param ctx the parse tree
	 */
	void enterScan_for_cast_generic_precedence(CSharp6Parser.Scan_for_cast_generic_precedenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#scan_for_cast_generic_precedence}.
	 * @param ctx the parse tree
	 */
	void exitScan_for_cast_generic_precedence(CSharp6Parser.Scan_for_cast_generic_precedenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#cast_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void enterCast_disambiguation_token(CSharp6Parser.Cast_disambiguation_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#cast_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void exitCast_disambiguation_token(CSharp6Parser.Cast_disambiguation_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#pre_increment_expression}.
	 * @param ctx the parse tree
	 */
	void enterPre_increment_expression(CSharp6Parser.Pre_increment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#pre_increment_expression}.
	 * @param ctx the parse tree
	 */
	void exitPre_increment_expression(CSharp6Parser.Pre_increment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#pre_decrement_expression}.
	 * @param ctx the parse tree
	 */
	void enterPre_decrement_expression(CSharp6Parser.Pre_decrement_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#pre_decrement_expression}.
	 * @param ctx the parse tree
	 */
	void exitPre_decrement_expression(CSharp6Parser.Pre_decrement_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(CSharp6Parser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(CSharp6Parser.Cast_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(CSharp6Parser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(CSharp6Parser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(CSharp6Parser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(CSharp6Parser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(CSharp6Parser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(CSharp6Parser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(CSharp6Parser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(CSharp6Parser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#scan_for_shift_generic_precedence}.
	 * @param ctx the parse tree
	 */
	void enterScan_for_shift_generic_precedence(CSharp6Parser.Scan_for_shift_generic_precedenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#scan_for_shift_generic_precedence}.
	 * @param ctx the parse tree
	 */
	void exitScan_for_shift_generic_precedence(CSharp6Parser.Scan_for_shift_generic_precedenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#shift_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void enterShift_disambiguation_token(CSharp6Parser.Shift_disambiguation_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#shift_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void exitShift_disambiguation_token(CSharp6Parser.Shift_disambiguation_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#isType}.
	 * @param ctx the parse tree
	 */
	void enterIsType(CSharp6Parser.IsTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#isType}.
	 * @param ctx the parse tree
	 */
	void exitIsType(CSharp6Parser.IsTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#is_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void enterIs_disambiguation_token(CSharp6Parser.Is_disambiguation_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#is_disambiguation_token}.
	 * @param ctx the parse tree
	 */
	void exitIs_disambiguation_token(CSharp6Parser.Is_disambiguation_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(CSharp6Parser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(CSharp6Parser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(CSharp6Parser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(CSharp6Parser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(CSharp6Parser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(CSharp6Parser.Exclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(CSharp6Parser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(CSharp6Parser.Inclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#conditional_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_and_expression(CSharp6Parser.Conditional_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#conditional_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_and_expression(CSharp6Parser.Conditional_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#conditional_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_or_expression(CSharp6Parser.Conditional_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#conditional_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_or_expression(CSharp6Parser.Conditional_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void enterNull_coalescing_expression(CSharp6Parser.Null_coalescing_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#null_coalescing_expression}.
	 * @param ctx the parse tree
	 */
	void exitNull_coalescing_expression(CSharp6Parser.Null_coalescing_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(CSharp6Parser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(CSharp6Parser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expression(CSharp6Parser.Lambda_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#lambda_expression}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expression(CSharp6Parser.Lambda_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#anonymous_method_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_method_expression(CSharp6Parser.Anonymous_method_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#anonymous_method_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_method_expression(CSharp6Parser.Anonymous_method_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_signature(CSharp6Parser.Anonymous_function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_signature(CSharp6Parser.Anonymous_function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#explicit_anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_anonymous_function_signature(CSharp6Parser.Explicit_anonymous_function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#explicit_anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_anonymous_function_signature(CSharp6Parser.Explicit_anonymous_function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#explicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_anonymous_function_parameter_list(CSharp6Parser.Explicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#explicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_anonymous_function_parameter_list(CSharp6Parser.Explicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#explicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterExplicit_anonymous_function_parameter(CSharp6Parser.Explicit_anonymous_function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#explicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitExplicit_anonymous_function_parameter(CSharp6Parser.Explicit_anonymous_function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#anonymous_function_parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_parameter_modifier(CSharp6Parser.Anonymous_function_parameter_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#anonymous_function_parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_parameter_modifier(CSharp6Parser.Anonymous_function_parameter_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#implicit_anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_anonymous_function_signature(CSharp6Parser.Implicit_anonymous_function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#implicit_anonymous_function_signature}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_anonymous_function_signature(CSharp6Parser.Implicit_anonymous_function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#implicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_anonymous_function_parameter_list(CSharp6Parser.Implicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#implicit_anonymous_function_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_anonymous_function_parameter_list(CSharp6Parser.Implicit_anonymous_function_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#implicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_anonymous_function_parameter(CSharp6Parser.Implicit_anonymous_function_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#implicit_anonymous_function_parameter}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_anonymous_function_parameter(CSharp6Parser.Implicit_anonymous_function_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#anonymous_function_body}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_function_body(CSharp6Parser.Anonymous_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#anonymous_function_body}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_function_body(CSharp6Parser.Anonymous_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#query_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_expression(CSharp6Parser.Query_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#query_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_expression(CSharp6Parser.Query_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(CSharp6Parser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(CSharp6Parser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#query_body}.
	 * @param ctx the parse tree
	 */
	void enterQuery_body(CSharp6Parser.Query_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#query_body}.
	 * @param ctx the parse tree
	 */
	void exitQuery_body(CSharp6Parser.Query_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#query_body_clauses}.
	 * @param ctx the parse tree
	 */
	void enterQuery_body_clauses(CSharp6Parser.Query_body_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#query_body_clauses}.
	 * @param ctx the parse tree
	 */
	void exitQuery_body_clauses(CSharp6Parser.Query_body_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#query_body_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_body_clause(CSharp6Parser.Query_body_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#query_body_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_body_clause(CSharp6Parser.Query_body_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#let_clause}.
	 * @param ctx the parse tree
	 */
	void enterLet_clause(CSharp6Parser.Let_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#let_clause}.
	 * @param ctx the parse tree
	 */
	void exitLet_clause(CSharp6Parser.Let_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(CSharp6Parser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(CSharp6Parser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(CSharp6Parser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(CSharp6Parser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#join_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_into_clause(CSharp6Parser.Join_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#join_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_into_clause(CSharp6Parser.Join_into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#combined_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterCombined_join_clause(CSharp6Parser.Combined_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#combined_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitCombined_join_clause(CSharp6Parser.Combined_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(CSharp6Parser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(CSharp6Parser.Orderby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#orderings}.
	 * @param ctx the parse tree
	 */
	void enterOrderings(CSharp6Parser.OrderingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#orderings}.
	 * @param ctx the parse tree
	 */
	void exitOrderings(CSharp6Parser.OrderingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#ordering}.
	 * @param ctx the parse tree
	 */
	void enterOrdering(CSharp6Parser.OrderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#ordering}.
	 * @param ctx the parse tree
	 */
	void exitOrdering(CSharp6Parser.OrderingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#ordering_direction}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_direction(CSharp6Parser.Ordering_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#ordering_direction}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_direction(CSharp6Parser.Ordering_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#select_or_group_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_group_clause(CSharp6Parser.Select_or_group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#select_or_group_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_group_clause(CSharp6Parser.Select_or_group_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(CSharp6Parser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(CSharp6Parser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#group_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_clause(CSharp6Parser.Group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#group_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_clause(CSharp6Parser.Group_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#query_continuation}.
	 * @param ctx the parse tree
	 */
	void enterQuery_continuation(CSharp6Parser.Query_continuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#query_continuation}.
	 * @param ctx the parse tree
	 */
	void exitQuery_continuation(CSharp6Parser.Query_continuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CSharp6Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CSharp6Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(CSharp6Parser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(CSharp6Parser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CSharp6Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CSharp6Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#non_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterNon_assignment_expression(CSharp6Parser.Non_assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#non_assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitNon_assignment_expression(CSharp6Parser.Non_assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(CSharp6Parser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(CSharp6Parser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(CSharp6Parser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(CSharp6Parser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CSharp6Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CSharp6Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_statement(CSharp6Parser.Embedded_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_statement(CSharp6Parser.Embedded_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_embedded_statement(CSharp6Parser.Simple_embedded_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#simple_embedded_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_embedded_statement(CSharp6Parser.Simple_embedded_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CSharp6Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CSharp6Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(CSharp6Parser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(CSharp6Parser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_statement(CSharp6Parser.Empty_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_statement(CSharp6Parser.Empty_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(CSharp6Parser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(CSharp6Parser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_statement(CSharp6Parser.Declaration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#declaration_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_statement(CSharp6Parser.Declaration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#local_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declaration(CSharp6Parser.Local_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#local_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declaration(CSharp6Parser.Local_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#local_variable_type}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_type(CSharp6Parser.Local_variable_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#local_variable_type}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_type(CSharp6Parser.Local_variable_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#local_variable_declarators}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declarators(CSharp6Parser.Local_variable_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#local_variable_declarators}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declarators(CSharp6Parser.Local_variable_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#local_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_declarator(CSharp6Parser.Local_variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#local_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_declarator(CSharp6Parser.Local_variable_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#local_variable_initializer}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_initializer(CSharp6Parser.Local_variable_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#local_variable_initializer}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_initializer(CSharp6Parser.Local_variable_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#local_constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_constant_declaration(CSharp6Parser.Local_constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#local_constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_constant_declaration(CSharp6Parser.Local_constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(CSharp6Parser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(CSharp6Parser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#statement_expression}.
	 * @param ctx the parse tree
	 */
	void enterStatement_expression(CSharp6Parser.Statement_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#statement_expression}.
	 * @param ctx the parse tree
	 */
	void exitStatement_expression(CSharp6Parser.Statement_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(CSharp6Parser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(CSharp6Parser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifBodyBlock}
	 * labeled alternative in {@link CSharp6Parser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIfBodyBlock(CSharp6Parser.IfBodyBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifBodyBlock}
	 * labeled alternative in {@link CSharp6Parser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIfBodyBlock(CSharp6Parser.IfBodyBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifBodySingle}
	 * labeled alternative in {@link CSharp6Parser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIfBodySingle(CSharp6Parser.IfBodySingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifBodySingle}
	 * labeled alternative in {@link CSharp6Parser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIfBodySingle(CSharp6Parser.IfBodySingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(CSharp6Parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(CSharp6Parser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_statement(CSharp6Parser.Switch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#switch_statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_statement(CSharp6Parser.Switch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#switch_block}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_block(CSharp6Parser.Switch_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#switch_block}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_block(CSharp6Parser.Switch_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#switch_sections}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_sections(CSharp6Parser.Switch_sectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#switch_sections}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_sections(CSharp6Parser.Switch_sectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#switch_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_section(CSharp6Parser.Switch_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#switch_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_section(CSharp6Parser.Switch_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#switch_labels}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_labels(CSharp6Parser.Switch_labelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#switch_labels}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_labels(CSharp6Parser.Switch_labelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#switch_label}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_label(CSharp6Parser.Switch_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#switch_label}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_label(CSharp6Parser.Switch_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(CSharp6Parser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(CSharp6Parser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(CSharp6Parser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(CSharp6Parser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(CSharp6Parser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(CSharp6Parser.Do_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(CSharp6Parser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(CSharp6Parser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#for_initializer}.
	 * @param ctx the parse tree
	 */
	void enterFor_initializer(CSharp6Parser.For_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#for_initializer}.
	 * @param ctx the parse tree
	 */
	void exitFor_initializer(CSharp6Parser.For_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#for_condition}.
	 * @param ctx the parse tree
	 */
	void enterFor_condition(CSharp6Parser.For_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#for_condition}.
	 * @param ctx the parse tree
	 */
	void exitFor_condition(CSharp6Parser.For_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#for_iterator}.
	 * @param ctx the parse tree
	 */
	void enterFor_iterator(CSharp6Parser.For_iteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#for_iterator}.
	 * @param ctx the parse tree
	 */
	void exitFor_iterator(CSharp6Parser.For_iteratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_expression_list(CSharp6Parser.Statement_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#statement_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_expression_list(CSharp6Parser.Statement_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#foreach_statement}.
	 * @param ctx the parse tree
	 */
	void enterForeach_statement(CSharp6Parser.Foreach_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#foreach_statement}.
	 * @param ctx the parse tree
	 */
	void exitForeach_statement(CSharp6Parser.Foreach_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(CSharp6Parser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(CSharp6Parser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(CSharp6Parser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(CSharp6Parser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(CSharp6Parser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(CSharp6Parser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(CSharp6Parser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(CSharp6Parser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(CSharp6Parser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(CSharp6Parser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(CSharp6Parser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(CSharp6Parser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(CSharp6Parser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(CSharp6Parser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void enterCatch_clauses(CSharp6Parser.Catch_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#catch_clauses}.
	 * @param ctx the parse tree
	 */
	void exitCatch_clauses(CSharp6Parser.Catch_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#specific_catch_clauses}.
	 * @param ctx the parse tree
	 */
	void enterSpecific_catch_clauses(CSharp6Parser.Specific_catch_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#specific_catch_clauses}.
	 * @param ctx the parse tree
	 */
	void exitSpecific_catch_clauses(CSharp6Parser.Specific_catch_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#specific_catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterSpecific_catch_clause(CSharp6Parser.Specific_catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#specific_catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitSpecific_catch_clause(CSharp6Parser.Specific_catch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#exception_filter}.
	 * @param ctx the parse tree
	 */
	void enterException_filter(CSharp6Parser.Exception_filterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#exception_filter}.
	 * @param ctx the parse tree
	 */
	void exitException_filter(CSharp6Parser.Exception_filterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#general_catch_clause}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_catch_clause(CSharp6Parser.General_catch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#general_catch_clause}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_catch_clause(CSharp6Parser.General_catch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void enterFinally_clause(CSharp6Parser.Finally_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#finally_clause}.
	 * @param ctx the parse tree
	 */
	void exitFinally_clause(CSharp6Parser.Finally_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#checked_statement}.
	 * @param ctx the parse tree
	 */
	void enterChecked_statement(CSharp6Parser.Checked_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#checked_statement}.
	 * @param ctx the parse tree
	 */
	void exitChecked_statement(CSharp6Parser.Checked_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#unchecked_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnchecked_statement(CSharp6Parser.Unchecked_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#unchecked_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnchecked_statement(CSharp6Parser.Unchecked_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#lock_statement}.
	 * @param ctx the parse tree
	 */
	void enterLock_statement(CSharp6Parser.Lock_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#lock_statement}.
	 * @param ctx the parse tree
	 */
	void exitLock_statement(CSharp6Parser.Lock_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#using_statement}.
	 * @param ctx the parse tree
	 */
	void enterUsing_statement(CSharp6Parser.Using_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#using_statement}.
	 * @param ctx the parse tree
	 */
	void exitUsing_statement(CSharp6Parser.Using_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#resource_acquisition}.
	 * @param ctx the parse tree
	 */
	void enterResource_acquisition(CSharp6Parser.Resource_acquisitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#resource_acquisition}.
	 * @param ctx the parse tree
	 */
	void exitResource_acquisition(CSharp6Parser.Resource_acquisitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#yield_statement}.
	 * @param ctx the parse tree
	 */
	void enterYield_statement(CSharp6Parser.Yield_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#yield_statement}.
	 * @param ctx the parse tree
	 */
	void exitYield_statement(CSharp6Parser.Yield_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(CSharp6Parser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(CSharp6Parser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#namespace_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_declaration(CSharp6Parser.Namespace_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#namespace_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_declaration(CSharp6Parser.Namespace_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#qualified_identifier}.
	 * @param ctx the parse tree
	 */
	void enterQualified_identifier(CSharp6Parser.Qualified_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#qualified_identifier}.
	 * @param ctx the parse tree
	 */
	void exitQualified_identifier(CSharp6Parser.Qualified_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#namespace_body}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_body(CSharp6Parser.Namespace_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#namespace_body}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_body(CSharp6Parser.Namespace_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#extern_alias_directives}.
	 * @param ctx the parse tree
	 */
	void enterExtern_alias_directives(CSharp6Parser.Extern_alias_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#extern_alias_directives}.
	 * @param ctx the parse tree
	 */
	void exitExtern_alias_directives(CSharp6Parser.Extern_alias_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#extern_alias_directive}.
	 * @param ctx the parse tree
	 */
	void enterExtern_alias_directive(CSharp6Parser.Extern_alias_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#extern_alias_directive}.
	 * @param ctx the parse tree
	 */
	void exitExtern_alias_directive(CSharp6Parser.Extern_alias_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#using_directives}.
	 * @param ctx the parse tree
	 */
	void enterUsing_directives(CSharp6Parser.Using_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#using_directives}.
	 * @param ctx the parse tree
	 */
	void exitUsing_directives(CSharp6Parser.Using_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#using_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsing_directive(CSharp6Parser.Using_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#using_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsing_directive(CSharp6Parser.Using_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#using_alias_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsing_alias_directive(CSharp6Parser.Using_alias_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#using_alias_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsing_alias_directive(CSharp6Parser.Using_alias_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#using_namespace_directive}.
	 * @param ctx the parse tree
	 */
	void enterUsing_namespace_directive(CSharp6Parser.Using_namespace_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#using_namespace_directive}.
	 * @param ctx the parse tree
	 */
	void exitUsing_namespace_directive(CSharp6Parser.Using_namespace_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#namespace_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_member_declarations(CSharp6Parser.Namespace_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#namespace_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_member_declarations(CSharp6Parser.Namespace_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#namespace_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_member_declaration(CSharp6Parser.Namespace_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#namespace_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_member_declaration(CSharp6Parser.Namespace_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(CSharp6Parser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(CSharp6Parser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#qualified_alias_member}.
	 * @param ctx the parse tree
	 */
	void enterQualified_alias_member(CSharp6Parser.Qualified_alias_memberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#qualified_alias_member}.
	 * @param ctx the parse tree
	 */
	void exitQualified_alias_member(CSharp6Parser.Qualified_alias_memberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(CSharp6Parser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(CSharp6Parser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#class_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterClass_modifiers(CSharp6Parser.Class_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#class_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitClass_modifiers(CSharp6Parser.Class_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#class_modifier}.
	 * @param ctx the parse tree
	 */
	void enterClass_modifier(CSharp6Parser.Class_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#class_modifier}.
	 * @param ctx the parse tree
	 */
	void exitClass_modifier(CSharp6Parser.Class_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_list(CSharp6Parser.Type_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_list(CSharp6Parser.Type_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#type_parameters}.
	 * @param ctx the parse tree
	 */
	void enterType_parameters(CSharp6Parser.Type_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#type_parameters}.
	 * @param ctx the parse tree
	 */
	void exitType_parameters(CSharp6Parser.Type_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#type_parameter}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter(CSharp6Parser.Type_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#type_parameter}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter(CSharp6Parser.Type_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#class_base}.
	 * @param ctx the parse tree
	 */
	void enterClass_base(CSharp6Parser.Class_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#class_base}.
	 * @param ctx the parse tree
	 */
	void exitClass_base(CSharp6Parser.Class_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_type_list}.
	 * @param ctx the parse tree
	 */
	void enterInterface_type_list(CSharp6Parser.Interface_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_type_list}.
	 * @param ctx the parse tree
	 */
	void exitInterface_type_list(CSharp6Parser.Interface_type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#type_parameter_constraints_clauses}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_constraints_clauses(CSharp6Parser.Type_parameter_constraints_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#type_parameter_constraints_clauses}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_constraints_clauses(CSharp6Parser.Type_parameter_constraints_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#type_parameter_constraints_clause}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_constraints_clause(CSharp6Parser.Type_parameter_constraints_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#type_parameter_constraints_clause}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_constraints_clause(CSharp6Parser.Type_parameter_constraints_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#type_parameter_constraints}.
	 * @param ctx the parse tree
	 */
	void enterType_parameter_constraints(CSharp6Parser.Type_parameter_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#type_parameter_constraints}.
	 * @param ctx the parse tree
	 */
	void exitType_parameter_constraints(CSharp6Parser.Type_parameter_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#primary_constraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_constraint(CSharp6Parser.Primary_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#primary_constraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_constraint(CSharp6Parser.Primary_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#secondary_constraints}.
	 * @param ctx the parse tree
	 */
	void enterSecondary_constraints(CSharp6Parser.Secondary_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#secondary_constraints}.
	 * @param ctx the parse tree
	 */
	void exitSecondary_constraints(CSharp6Parser.Secondary_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#constructor_constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_constraint(CSharp6Parser.Constructor_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#constructor_constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_constraint(CSharp6Parser.Constructor_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(CSharp6Parser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(CSharp6Parser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#class_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterClass_member_declarations(CSharp6Parser.Class_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#class_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitClass_member_declarations(CSharp6Parser.Class_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#class_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_member_declaration(CSharp6Parser.Class_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#class_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_member_declaration(CSharp6Parser.Class_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#all_member_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterAll_member_modifiers(CSharp6Parser.All_member_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#all_member_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitAll_member_modifiers(CSharp6Parser.All_member_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#all_member_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAll_member_modifier(CSharp6Parser.All_member_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#all_member_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAll_member_modifier(CSharp6Parser.All_member_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#common_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCommon_member_declaration(CSharp6Parser.Common_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#common_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCommon_member_declaration(CSharp6Parser.Common_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#typed_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTyped_member_declaration(CSharp6Parser.Typed_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#typed_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTyped_member_declaration(CSharp6Parser.Typed_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#constant_declarators}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declarators(CSharp6Parser.Constant_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#constant_declarators}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declarators(CSharp6Parser.Constant_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#constant_declarator}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declarator(CSharp6Parser.Constant_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#constant_declarator}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declarator(CSharp6Parser.Constant_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#variable_declarators}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declarators(CSharp6Parser.Variable_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#variable_declarators}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declarators(CSharp6Parser.Variable_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declarator(CSharp6Parser.Variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declarator(CSharp6Parser.Variable_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#variable_initializer}.
	 * @param ctx the parse tree
	 */
	void enterVariable_initializer(CSharp6Parser.Variable_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#variable_initializer}.
	 * @param ctx the parse tree
	 */
	void exitVariable_initializer(CSharp6Parser.Variable_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(CSharp6Parser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(CSharp6Parser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#method_header}.
	 * @param ctx the parse tree
	 */
	void enterMethod_header(CSharp6Parser.Method_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#method_header}.
	 * @param ctx the parse tree
	 */
	void exitMethod_header(CSharp6Parser.Method_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#method_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterMethod_modifiers(CSharp6Parser.Method_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#method_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitMethod_modifiers(CSharp6Parser.Method_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#method_modifier}.
	 * @param ctx the parse tree
	 */
	void enterMethod_modifier(CSharp6Parser.Method_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#method_modifier}.
	 * @param ctx the parse tree
	 */
	void exitMethod_modifier(CSharp6Parser.Method_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(CSharp6Parser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(CSharp6Parser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#member_name}.
	 * @param ctx the parse tree
	 */
	void enterMember_name(CSharp6Parser.Member_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#member_name}.
	 * @param ctx the parse tree
	 */
	void exitMember_name(CSharp6Parser.Member_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#method_body}.
	 * @param ctx the parse tree
	 */
	void enterMethod_body(CSharp6Parser.Method_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#method_body}.
	 * @param ctx the parse tree
	 */
	void exitMethod_body(CSharp6Parser.Method_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterFormal_parameter_list(CSharp6Parser.Formal_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#formal_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitFormal_parameter_list(CSharp6Parser.Formal_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#fixed_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFixed_parameters(CSharp6Parser.Fixed_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#fixed_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFixed_parameters(CSharp6Parser.Fixed_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#fixed_parameter}.
	 * @param ctx the parse tree
	 */
	void enterFixed_parameter(CSharp6Parser.Fixed_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#fixed_parameter}.
	 * @param ctx the parse tree
	 */
	void exitFixed_parameter(CSharp6Parser.Fixed_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#default_argument}.
	 * @param ctx the parse tree
	 */
	void enterDefault_argument(CSharp6Parser.Default_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#default_argument}.
	 * @param ctx the parse tree
	 */
	void exitDefault_argument(CSharp6Parser.Default_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void enterParameter_modifier(CSharp6Parser.Parameter_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#parameter_modifier}.
	 * @param ctx the parse tree
	 */
	void exitParameter_modifier(CSharp6Parser.Parameter_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#parameter_array}.
	 * @param ctx the parse tree
	 */
	void enterParameter_array(CSharp6Parser.Parameter_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#parameter_array}.
	 * @param ctx the parse tree
	 */
	void exitParameter_array(CSharp6Parser.Parameter_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration(CSharp6Parser.Property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration(CSharp6Parser.Property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#property_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterProperty_modifiers(CSharp6Parser.Property_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#property_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitProperty_modifiers(CSharp6Parser.Property_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#property_modifier}.
	 * @param ctx the parse tree
	 */
	void enterProperty_modifier(CSharp6Parser.Property_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#property_modifier}.
	 * @param ctx the parse tree
	 */
	void exitProperty_modifier(CSharp6Parser.Property_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void enterAccessor_declarations(CSharp6Parser.Accessor_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void exitAccessor_declarations(CSharp6Parser.Accessor_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#get_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGet_accessor_declaration(CSharp6Parser.Get_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#get_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGet_accessor_declaration(CSharp6Parser.Get_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#set_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSet_accessor_declaration(CSharp6Parser.Set_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#set_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSet_accessor_declaration(CSharp6Parser.Set_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#accessor_modifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessor_modifier(CSharp6Parser.Accessor_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#accessor_modifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessor_modifier(CSharp6Parser.Accessor_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#accessor_body}.
	 * @param ctx the parse tree
	 */
	void enterAccessor_body(CSharp6Parser.Accessor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#accessor_body}.
	 * @param ctx the parse tree
	 */
	void exitAccessor_body(CSharp6Parser.Accessor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#event_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEvent_declaration(CSharp6Parser.Event_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#event_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEvent_declaration(CSharp6Parser.Event_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#event_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterEvent_modifiers(CSharp6Parser.Event_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#event_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitEvent_modifiers(CSharp6Parser.Event_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#event_modifier}.
	 * @param ctx the parse tree
	 */
	void enterEvent_modifier(CSharp6Parser.Event_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#event_modifier}.
	 * @param ctx the parse tree
	 */
	void exitEvent_modifier(CSharp6Parser.Event_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#event_accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void enterEvent_accessor_declarations(CSharp6Parser.Event_accessor_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#event_accessor_declarations}.
	 * @param ctx the parse tree
	 */
	void exitEvent_accessor_declarations(CSharp6Parser.Event_accessor_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#add_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAdd_accessor_declaration(CSharp6Parser.Add_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#add_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAdd_accessor_declaration(CSharp6Parser.Add_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#remove_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRemove_accessor_declaration(CSharp6Parser.Remove_accessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#remove_accessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRemove_accessor_declaration(CSharp6Parser.Remove_accessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#indexer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_declaration(CSharp6Parser.Indexer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#indexer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_declaration(CSharp6Parser.Indexer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#indexer_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_modifiers(CSharp6Parser.Indexer_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#indexer_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_modifiers(CSharp6Parser.Indexer_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#indexer_modifier}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_modifier(CSharp6Parser.Indexer_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#indexer_modifier}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_modifier(CSharp6Parser.Indexer_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#indexer_declarator}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_declarator(CSharp6Parser.Indexer_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#indexer_declarator}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_declarator(CSharp6Parser.Indexer_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declaration(CSharp6Parser.Operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declaration(CSharp6Parser.Operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#operator_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterOperator_modifiers(CSharp6Parser.Operator_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#operator_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitOperator_modifiers(CSharp6Parser.Operator_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#operator_modifier}.
	 * @param ctx the parse tree
	 */
	void enterOperator_modifier(CSharp6Parser.Operator_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#operator_modifier}.
	 * @param ctx the parse tree
	 */
	void exitOperator_modifier(CSharp6Parser.Operator_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#operator_declarator}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declarator(CSharp6Parser.Operator_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#operator_declarator}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declarator(CSharp6Parser.Operator_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#unary_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator_declarator(CSharp6Parser.Unary_operator_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#unary_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator_declarator(CSharp6Parser.Unary_operator_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#overloadable_unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterOverloadable_unary_operator(CSharp6Parser.Overloadable_unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#overloadable_unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitOverloadable_unary_operator(CSharp6Parser.Overloadable_unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#binary_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator_declarator(CSharp6Parser.Binary_operator_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#binary_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator_declarator(CSharp6Parser.Binary_operator_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#overloadable_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterOverloadable_binary_operator(CSharp6Parser.Overloadable_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#overloadable_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitOverloadable_binary_operator(CSharp6Parser.Overloadable_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#overloadable_operator}.
	 * @param ctx the parse tree
	 */
	void enterOverloadable_operator(CSharp6Parser.Overloadable_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#overloadable_operator}.
	 * @param ctx the parse tree
	 */
	void exitOverloadable_operator(CSharp6Parser.Overloadable_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#conversion_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConversion_operator_declaration(CSharp6Parser.Conversion_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#conversion_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConversion_operator_declaration(CSharp6Parser.Conversion_operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#conversion_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void enterConversion_operator_declarator(CSharp6Parser.Conversion_operator_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#conversion_operator_declarator}.
	 * @param ctx the parse tree
	 */
	void exitConversion_operator_declarator(CSharp6Parser.Conversion_operator_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#operator_body}.
	 * @param ctx the parse tree
	 */
	void enterOperator_body(CSharp6Parser.Operator_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#operator_body}.
	 * @param ctx the parse tree
	 */
	void exitOperator_body(CSharp6Parser.Operator_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(CSharp6Parser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(CSharp6Parser.Constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#constructor_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_modifiers(CSharp6Parser.Constructor_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#constructor_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_modifiers(CSharp6Parser.Constructor_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#constructor_modifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_modifier(CSharp6Parser.Constructor_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#constructor_modifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_modifier(CSharp6Parser.Constructor_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#constructor_declarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declarator(CSharp6Parser.Constructor_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#constructor_declarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declarator(CSharp6Parser.Constructor_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#constructor_initializer}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_initializer(CSharp6Parser.Constructor_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#constructor_initializer}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_initializer(CSharp6Parser.Constructor_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#constructor_body}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_body(CSharp6Parser.Constructor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#constructor_body}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_body(CSharp6Parser.Constructor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#static_constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStatic_constructor_declaration(CSharp6Parser.Static_constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#static_constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStatic_constructor_declaration(CSharp6Parser.Static_constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#static_constructor_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterStatic_constructor_modifiers(CSharp6Parser.Static_constructor_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#static_constructor_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitStatic_constructor_modifiers(CSharp6Parser.Static_constructor_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#static_constructor_body}.
	 * @param ctx the parse tree
	 */
	void enterStatic_constructor_body(CSharp6Parser.Static_constructor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#static_constructor_body}.
	 * @param ctx the parse tree
	 */
	void exitStatic_constructor_body(CSharp6Parser.Static_constructor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#destructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDestructor_declaration(CSharp6Parser.Destructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#destructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDestructor_declaration(CSharp6Parser.Destructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#destructor_body}.
	 * @param ctx the parse tree
	 */
	void enterDestructor_body(CSharp6Parser.Destructor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#destructor_body}.
	 * @param ctx the parse tree
	 */
	void exitDestructor_body(CSharp6Parser.Destructor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(CSharp6Parser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(CSharp6Parser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(CSharp6Parser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(CSharp6Parser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#struct_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterStruct_modifiers(CSharp6Parser.Struct_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#struct_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitStruct_modifiers(CSharp6Parser.Struct_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#struct_modifier}.
	 * @param ctx the parse tree
	 */
	void enterStruct_modifier(CSharp6Parser.Struct_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#struct_modifier}.
	 * @param ctx the parse tree
	 */
	void exitStruct_modifier(CSharp6Parser.Struct_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#struct_interfaces}.
	 * @param ctx the parse tree
	 */
	void enterStruct_interfaces(CSharp6Parser.Struct_interfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#struct_interfaces}.
	 * @param ctx the parse tree
	 */
	void exitStruct_interfaces(CSharp6Parser.Struct_interfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#struct_body}.
	 * @param ctx the parse tree
	 */
	void enterStruct_body(CSharp6Parser.Struct_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#struct_body}.
	 * @param ctx the parse tree
	 */
	void exitStruct_body(CSharp6Parser.Struct_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#struct_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member_declarations(CSharp6Parser.Struct_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#struct_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member_declarations(CSharp6Parser.Struct_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#struct_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member_declaration(CSharp6Parser.Struct_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#struct_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member_declaration(CSharp6Parser.Struct_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(CSharp6Parser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(CSharp6Parser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#non_array_type}.
	 * @param ctx the parse tree
	 */
	void enterNon_array_type(CSharp6Parser.Non_array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#non_array_type}.
	 * @param ctx the parse tree
	 */
	void exitNon_array_type(CSharp6Parser.Non_array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#rank_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterRank_specifiers(CSharp6Parser.Rank_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#rank_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitRank_specifiers(CSharp6Parser.Rank_specifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#rank_specifier}.
	 * @param ctx the parse tree
	 */
	void enterRank_specifier(CSharp6Parser.Rank_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#rank_specifier}.
	 * @param ctx the parse tree
	 */
	void exitRank_specifier(CSharp6Parser.Rank_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#dim_separators}.
	 * @param ctx the parse tree
	 */
	void enterDim_separators(CSharp6Parser.Dim_separatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#dim_separators}.
	 * @param ctx the parse tree
	 */
	void exitDim_separators(CSharp6Parser.Dim_separatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void enterArray_initializer(CSharp6Parser.Array_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#array_initializer}.
	 * @param ctx the parse tree
	 */
	void exitArray_initializer(CSharp6Parser.Array_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#variable_initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterVariable_initializer_list(CSharp6Parser.Variable_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#variable_initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitVariable_initializer_list(CSharp6Parser.Variable_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_declaration(CSharp6Parser.Interface_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_declaration(CSharp6Parser.Interface_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterInterface_modifiers(CSharp6Parser.Interface_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitInterface_modifiers(CSharp6Parser.Interface_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_modifier}.
	 * @param ctx the parse tree
	 */
	void enterInterface_modifier(CSharp6Parser.Interface_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_modifier}.
	 * @param ctx the parse tree
	 */
	void exitInterface_modifier(CSharp6Parser.Interface_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#variant_type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterVariant_type_parameter_list(CSharp6Parser.Variant_type_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#variant_type_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitVariant_type_parameter_list(CSharp6Parser.Variant_type_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#variant_type_parameters}.
	 * @param ctx the parse tree
	 */
	void enterVariant_type_parameters(CSharp6Parser.Variant_type_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#variant_type_parameters}.
	 * @param ctx the parse tree
	 */
	void exitVariant_type_parameters(CSharp6Parser.Variant_type_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#variance_annotation}.
	 * @param ctx the parse tree
	 */
	void enterVariance_annotation(CSharp6Parser.Variance_annotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#variance_annotation}.
	 * @param ctx the parse tree
	 */
	void exitVariance_annotation(CSharp6Parser.Variance_annotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_base}.
	 * @param ctx the parse tree
	 */
	void enterInterface_base(CSharp6Parser.Interface_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_base}.
	 * @param ctx the parse tree
	 */
	void exitInterface_base(CSharp6Parser.Interface_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_body}.
	 * @param ctx the parse tree
	 */
	void enterInterface_body(CSharp6Parser.Interface_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_body}.
	 * @param ctx the parse tree
	 */
	void exitInterface_body(CSharp6Parser.Interface_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterInterface_member_declarations(CSharp6Parser.Interface_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitInterface_member_declarations(CSharp6Parser.Interface_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_member_declaration(CSharp6Parser.Interface_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_member_declaration(CSharp6Parser.Interface_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_method_declaration(CSharp6Parser.Interface_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_method_declaration(CSharp6Parser.Interface_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_property_declaration(CSharp6Parser.Interface_property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_property_declaration(CSharp6Parser.Interface_property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_accessors}.
	 * @param ctx the parse tree
	 */
	void enterInterface_accessors(CSharp6Parser.Interface_accessorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_accessors}.
	 * @param ctx the parse tree
	 */
	void exitInterface_accessors(CSharp6Parser.Interface_accessorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_event_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_event_declaration(CSharp6Parser.Interface_event_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_event_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_event_declaration(CSharp6Parser.Interface_event_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_indexer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterface_indexer_declaration(CSharp6Parser.Interface_indexer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_indexer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterface_indexer_declaration(CSharp6Parser.Interface_indexer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_declaration(CSharp6Parser.Enum_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#enum_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_declaration(CSharp6Parser.Enum_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#enum_base}.
	 * @param ctx the parse tree
	 */
	void enterEnum_base(CSharp6Parser.Enum_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#enum_base}.
	 * @param ctx the parse tree
	 */
	void exitEnum_base(CSharp6Parser.Enum_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#enum_body}.
	 * @param ctx the parse tree
	 */
	void enterEnum_body(CSharp6Parser.Enum_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#enum_body}.
	 * @param ctx the parse tree
	 */
	void exitEnum_body(CSharp6Parser.Enum_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#enum_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterEnum_modifiers(CSharp6Parser.Enum_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#enum_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitEnum_modifiers(CSharp6Parser.Enum_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#enum_modifier}.
	 * @param ctx the parse tree
	 */
	void enterEnum_modifier(CSharp6Parser.Enum_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#enum_modifier}.
	 * @param ctx the parse tree
	 */
	void exitEnum_modifier(CSharp6Parser.Enum_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#enum_member_declarations}.
	 * @param ctx the parse tree
	 */
	void enterEnum_member_declarations(CSharp6Parser.Enum_member_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#enum_member_declarations}.
	 * @param ctx the parse tree
	 */
	void exitEnum_member_declarations(CSharp6Parser.Enum_member_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#enum_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnum_member_declaration(CSharp6Parser.Enum_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#enum_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnum_member_declaration(CSharp6Parser.Enum_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#delegate_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_declaration(CSharp6Parser.Delegate_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#delegate_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_declaration(CSharp6Parser.Delegate_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#delegate_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_modifiers(CSharp6Parser.Delegate_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#delegate_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_modifiers(CSharp6Parser.Delegate_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#delegate_modifier}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_modifier(CSharp6Parser.Delegate_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#delegate_modifier}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_modifier(CSharp6Parser.Delegate_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#global_attributes}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attributes(CSharp6Parser.Global_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#global_attributes}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attributes(CSharp6Parser.Global_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#global_attribute_sections}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_sections(CSharp6Parser.Global_attribute_sectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#global_attribute_sections}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_sections(CSharp6Parser.Global_attribute_sectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#global_attribute_section}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_section(CSharp6Parser.Global_attribute_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#global_attribute_section}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_section(CSharp6Parser.Global_attribute_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#global_attribute_target_specifier}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_target_specifier(CSharp6Parser.Global_attribute_target_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#global_attribute_target_specifier}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_target_specifier(CSharp6Parser.Global_attribute_target_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#global_attribute_target}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_attribute_target(CSharp6Parser.Global_attribute_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#global_attribute_target}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_attribute_target(CSharp6Parser.Global_attribute_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(CSharp6Parser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(CSharp6Parser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#attribute_sections}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_sections(CSharp6Parser.Attribute_sectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#attribute_sections}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_sections(CSharp6Parser.Attribute_sectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#attribute_section}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_section(CSharp6Parser.Attribute_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#attribute_section}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_section(CSharp6Parser.Attribute_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#attribute_target_specifier}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_target_specifier(CSharp6Parser.Attribute_target_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#attribute_target_specifier}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_target_specifier(CSharp6Parser.Attribute_target_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#attribute_target}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_target(CSharp6Parser.Attribute_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#attribute_target}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_target(CSharp6Parser.Attribute_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(CSharp6Parser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(CSharp6Parser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(CSharp6Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(CSharp6Parser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(CSharp6Parser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(CSharp6Parser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#attribute_arguments}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_arguments(CSharp6Parser.Attribute_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#attribute_arguments}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_arguments(CSharp6Parser.Attribute_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#positional_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterPositional_argument_list(CSharp6Parser.Positional_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#positional_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitPositional_argument_list(CSharp6Parser.Positional_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#positional_argument}.
	 * @param ctx the parse tree
	 */
	void enterPositional_argument(CSharp6Parser.Positional_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#positional_argument}.
	 * @param ctx the parse tree
	 */
	void exitPositional_argument(CSharp6Parser.Positional_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#named_argument_list}.
	 * @param ctx the parse tree
	 */
	void enterNamed_argument_list(CSharp6Parser.Named_argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#named_argument_list}.
	 * @param ctx the parse tree
	 */
	void exitNamed_argument_list(CSharp6Parser.Named_argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#named_argument}.
	 * @param ctx the parse tree
	 */
	void enterNamed_argument(CSharp6Parser.Named_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#named_argument}.
	 * @param ctx the parse tree
	 */
	void exitNamed_argument(CSharp6Parser.Named_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#attribute_argument_expression}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_argument_expression(CSharp6Parser.Attribute_argument_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#attribute_argument_expression}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_argument_expression(CSharp6Parser.Attribute_argument_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#class_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterClass_modifier_unsafe(CSharp6Parser.Class_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#class_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitClass_modifier_unsafe(CSharp6Parser.Class_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#struct_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterStruct_modifier_unsafe(CSharp6Parser.Struct_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#struct_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitStruct_modifier_unsafe(CSharp6Parser.Struct_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterInterface_modifier_unsafe(CSharp6Parser.Interface_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitInterface_modifier_unsafe(CSharp6Parser.Interface_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#delegate_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_modifier_unsafe(CSharp6Parser.Delegate_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#delegate_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_modifier_unsafe(CSharp6Parser.Delegate_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#field_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterField_modifier_unsafe(CSharp6Parser.Field_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#field_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitField_modifier_unsafe(CSharp6Parser.Field_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#method_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterMethod_modifier_unsafe(CSharp6Parser.Method_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#method_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitMethod_modifier_unsafe(CSharp6Parser.Method_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#property_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterProperty_modifier_unsafe(CSharp6Parser.Property_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#property_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitProperty_modifier_unsafe(CSharp6Parser.Property_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#event_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterEvent_modifier_unsafe(CSharp6Parser.Event_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#event_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitEvent_modifier_unsafe(CSharp6Parser.Event_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#indexer_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_modifier_unsafe(CSharp6Parser.Indexer_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#indexer_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_modifier_unsafe(CSharp6Parser.Indexer_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#operator_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterOperator_modifier_unsafe(CSharp6Parser.Operator_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#operator_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitOperator_modifier_unsafe(CSharp6Parser.Operator_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#constructor_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_modifier_unsafe(CSharp6Parser.Constructor_modifier_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#constructor_modifier_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_modifier_unsafe(CSharp6Parser.Constructor_modifier_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#destructor_declaration_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterDestructor_declaration_unsafe(CSharp6Parser.Destructor_declaration_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#destructor_declaration_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitDestructor_declaration_unsafe(CSharp6Parser.Destructor_declaration_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#static_constructor_modifiers_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterStatic_constructor_modifiers_unsafe(CSharp6Parser.Static_constructor_modifiers_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#static_constructor_modifiers_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitStatic_constructor_modifiers_unsafe(CSharp6Parser.Static_constructor_modifiers_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#embedded_statement_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_statement_unsafe(CSharp6Parser.Embedded_statement_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#embedded_statement_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_statement_unsafe(CSharp6Parser.Embedded_statement_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#unsafe_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsafe_statement(CSharp6Parser.Unsafe_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#unsafe_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsafe_statement(CSharp6Parser.Unsafe_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#type_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterType_unsafe(CSharp6Parser.Type_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#type_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitType_unsafe(CSharp6Parser.Type_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#pointer_type}.
	 * @param ctx the parse tree
	 */
	void enterPointer_type(CSharp6Parser.Pointer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#pointer_type}.
	 * @param ctx the parse tree
	 */
	void exitPointer_type(CSharp6Parser.Pointer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#unmanaged_type}.
	 * @param ctx the parse tree
	 */
	void enterUnmanaged_type(CSharp6Parser.Unmanaged_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#unmanaged_type}.
	 * @param ctx the parse tree
	 */
	void exitUnmanaged_type(CSharp6Parser.Unmanaged_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#primary_no_array_creation_expression_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_no_array_creation_expression_unsafe(CSharp6Parser.Primary_no_array_creation_expression_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#primary_no_array_creation_expression_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_no_array_creation_expression_unsafe(CSharp6Parser.Primary_no_array_creation_expression_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#unary_expression_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression_unsafe(CSharp6Parser.Unary_expression_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#unary_expression_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression_unsafe(CSharp6Parser.Unary_expression_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#pointer_indirection_expression}.
	 * @param ctx the parse tree
	 */
	void enterPointer_indirection_expression(CSharp6Parser.Pointer_indirection_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#pointer_indirection_expression}.
	 * @param ctx the parse tree
	 */
	void exitPointer_indirection_expression(CSharp6Parser.Pointer_indirection_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#addressof_expression}.
	 * @param ctx the parse tree
	 */
	void enterAddressof_expression(CSharp6Parser.Addressof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#addressof_expression}.
	 * @param ctx the parse tree
	 */
	void exitAddressof_expression(CSharp6Parser.Addressof_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_expression(CSharp6Parser.Sizeof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#sizeof_expression}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_expression(CSharp6Parser.Sizeof_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#nameof_expression}.
	 * @param ctx the parse tree
	 */
	void enterNameof_expression(CSharp6Parser.Nameof_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#nameof_expression}.
	 * @param ctx the parse tree
	 */
	void exitNameof_expression(CSharp6Parser.Nameof_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#fixed_statement}.
	 * @param ctx the parse tree
	 */
	void enterFixed_statement(CSharp6Parser.Fixed_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#fixed_statement}.
	 * @param ctx the parse tree
	 */
	void exitFixed_statement(CSharp6Parser.Fixed_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#fixed_pointer_declarators}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pointer_declarators(CSharp6Parser.Fixed_pointer_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#fixed_pointer_declarators}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pointer_declarators(CSharp6Parser.Fixed_pointer_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#fixed_pointer_declarator}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pointer_declarator(CSharp6Parser.Fixed_pointer_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#fixed_pointer_declarator}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pointer_declarator(CSharp6Parser.Fixed_pointer_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#fixed_pointer_initializer}.
	 * @param ctx the parse tree
	 */
	void enterFixed_pointer_initializer(CSharp6Parser.Fixed_pointer_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#fixed_pointer_initializer}.
	 * @param ctx the parse tree
	 */
	void exitFixed_pointer_initializer(CSharp6Parser.Fixed_pointer_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#struct_member_declaration_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterStruct_member_declaration_unsafe(CSharp6Parser.Struct_member_declaration_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#struct_member_declaration_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitStruct_member_declaration_unsafe(CSharp6Parser.Struct_member_declaration_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#fixed_size_buffer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_declaration(CSharp6Parser.Fixed_size_buffer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#fixed_size_buffer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_declaration(CSharp6Parser.Fixed_size_buffer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#fixed_size_buffer_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_modifiers(CSharp6Parser.Fixed_size_buffer_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#fixed_size_buffer_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_modifiers(CSharp6Parser.Fixed_size_buffer_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#fixed_size_buffer_modifier}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_modifier(CSharp6Parser.Fixed_size_buffer_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#fixed_size_buffer_modifier}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_modifier(CSharp6Parser.Fixed_size_buffer_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#buffer_element_type}.
	 * @param ctx the parse tree
	 */
	void enterBuffer_element_type(CSharp6Parser.Buffer_element_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#buffer_element_type}.
	 * @param ctx the parse tree
	 */
	void exitBuffer_element_type(CSharp6Parser.Buffer_element_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#fixed_size_buffer_declarators}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_declarators(CSharp6Parser.Fixed_size_buffer_declaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#fixed_size_buffer_declarators}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_declarators(CSharp6Parser.Fixed_size_buffer_declaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#fixed_size_buffer_declarator}.
	 * @param ctx the parse tree
	 */
	void enterFixed_size_buffer_declarator(CSharp6Parser.Fixed_size_buffer_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#fixed_size_buffer_declarator}.
	 * @param ctx the parse tree
	 */
	void exitFixed_size_buffer_declarator(CSharp6Parser.Fixed_size_buffer_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#local_variable_initializer_unsafe}.
	 * @param ctx the parse tree
	 */
	void enterLocal_variable_initializer_unsafe(CSharp6Parser.Local_variable_initializer_unsafeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#local_variable_initializer_unsafe}.
	 * @param ctx the parse tree
	 */
	void exitLocal_variable_initializer_unsafe(CSharp6Parser.Local_variable_initializer_unsafeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#stackalloc_initializer}.
	 * @param ctx the parse tree
	 */
	void enterStackalloc_initializer(CSharp6Parser.Stackalloc_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#stackalloc_initializer}.
	 * @param ctx the parse tree
	 */
	void exitStackalloc_initializer(CSharp6Parser.Stackalloc_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#from_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterFrom_contextual_keyword(CSharp6Parser.From_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#from_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitFrom_contextual_keyword(CSharp6Parser.From_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#let_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterLet_contextual_keyword(CSharp6Parser.Let_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#let_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitLet_contextual_keyword(CSharp6Parser.Let_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#where_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterWhere_contextual_keyword(CSharp6Parser.Where_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#where_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitWhere_contextual_keyword(CSharp6Parser.Where_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#join_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterJoin_contextual_keyword(CSharp6Parser.Join_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#join_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitJoin_contextual_keyword(CSharp6Parser.Join_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#on_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterOn_contextual_keyword(CSharp6Parser.On_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#on_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitOn_contextual_keyword(CSharp6Parser.On_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#equals_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterEquals_contextual_keyword(CSharp6Parser.Equals_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#equals_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitEquals_contextual_keyword(CSharp6Parser.Equals_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#into_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterInto_contextual_keyword(CSharp6Parser.Into_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#into_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitInto_contextual_keyword(CSharp6Parser.Into_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#orderby_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_contextual_keyword(CSharp6Parser.Orderby_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#orderby_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_contextual_keyword(CSharp6Parser.Orderby_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#ascending_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAscending_contextual_keyword(CSharp6Parser.Ascending_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#ascending_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAscending_contextual_keyword(CSharp6Parser.Ascending_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#descending_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterDescending_contextual_keyword(CSharp6Parser.Descending_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#descending_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitDescending_contextual_keyword(CSharp6Parser.Descending_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#select_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterSelect_contextual_keyword(CSharp6Parser.Select_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#select_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitSelect_contextual_keyword(CSharp6Parser.Select_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#group_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterGroup_contextual_keyword(CSharp6Parser.Group_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#group_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitGroup_contextual_keyword(CSharp6Parser.Group_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#by_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterBy_contextual_keyword(CSharp6Parser.By_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#by_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitBy_contextual_keyword(CSharp6Parser.By_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#partial_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterPartial_contextual_keyword(CSharp6Parser.Partial_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#partial_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitPartial_contextual_keyword(CSharp6Parser.Partial_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#alias_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAlias_contextual_keyword(CSharp6Parser.Alias_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#alias_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAlias_contextual_keyword(CSharp6Parser.Alias_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#yield_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterYield_contextual_keyword(CSharp6Parser.Yield_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#yield_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitYield_contextual_keyword(CSharp6Parser.Yield_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#get_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterGet_contextual_keyword(CSharp6Parser.Get_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#get_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitGet_contextual_keyword(CSharp6Parser.Get_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#set_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterSet_contextual_keyword(CSharp6Parser.Set_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#set_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitSet_contextual_keyword(CSharp6Parser.Set_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#add_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterAdd_contextual_keyword(CSharp6Parser.Add_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#add_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitAdd_contextual_keyword(CSharp6Parser.Add_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#remove_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterRemove_contextual_keyword(CSharp6Parser.Remove_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#remove_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitRemove_contextual_keyword(CSharp6Parser.Remove_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#dynamic_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_contextual_keyword(CSharp6Parser.Dynamic_contextual_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#dynamic_contextual_keyword}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_contextual_keyword(CSharp6Parser.Dynamic_contextual_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(CSharp6Parser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(CSharp6Parser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#right_arrow}.
	 * @param ctx the parse tree
	 */
	void enterRight_arrow(CSharp6Parser.Right_arrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#right_arrow}.
	 * @param ctx the parse tree
	 */
	void exitRight_arrow(CSharp6Parser.Right_arrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#right_shift}.
	 * @param ctx the parse tree
	 */
	void enterRight_shift(CSharp6Parser.Right_shiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#right_shift}.
	 * @param ctx the parse tree
	 */
	void exitRight_shift(CSharp6Parser.Right_shiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#right_shift_assignment}.
	 * @param ctx the parse tree
	 */
	void enterRight_shift_assignment(CSharp6Parser.Right_shift_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#right_shift_assignment}.
	 * @param ctx the parse tree
	 */
	void exitRight_shift_assignment(CSharp6Parser.Right_shift_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CSharp6Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CSharp6Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(CSharp6Parser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(CSharp6Parser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(CSharp6Parser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(CSharp6Parser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#class_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_definition(CSharp6Parser.Class_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#class_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_definition(CSharp6Parser.Class_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#struct_definition}.
	 * @param ctx the parse tree
	 */
	void enterStruct_definition(CSharp6Parser.Struct_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#struct_definition}.
	 * @param ctx the parse tree
	 */
	void exitStruct_definition(CSharp6Parser.Struct_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_definition}.
	 * @param ctx the parse tree
	 */
	void enterInterface_definition(CSharp6Parser.Interface_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_definition}.
	 * @param ctx the parse tree
	 */
	void exitInterface_definition(CSharp6Parser.Interface_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#enum_definition}.
	 * @param ctx the parse tree
	 */
	void enterEnum_definition(CSharp6Parser.Enum_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#enum_definition}.
	 * @param ctx the parse tree
	 */
	void exitEnum_definition(CSharp6Parser.Enum_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#delegate_definition}.
	 * @param ctx the parse tree
	 */
	void enterDelegate_definition(CSharp6Parser.Delegate_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#delegate_definition}.
	 * @param ctx the parse tree
	 */
	void exitDelegate_definition(CSharp6Parser.Delegate_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#event_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterEvent_declaration2(CSharp6Parser.Event_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#event_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitEvent_declaration2(CSharp6Parser.Event_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#field_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterField_declaration2(CSharp6Parser.Field_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#field_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitField_declaration2(CSharp6Parser.Field_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#property_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration2(CSharp6Parser.Property_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#property_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration2(CSharp6Parser.Property_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#constant_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration2(CSharp6Parser.Constant_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#constant_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration2(CSharp6Parser.Constant_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#indexer_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterIndexer_declaration2(CSharp6Parser.Indexer_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#indexer_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitIndexer_declaration2(CSharp6Parser.Indexer_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#destructor_definition}.
	 * @param ctx the parse tree
	 */
	void enterDestructor_definition(CSharp6Parser.Destructor_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#destructor_definition}.
	 * @param ctx the parse tree
	 */
	void exitDestructor_definition(CSharp6Parser.Destructor_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#constructor_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration2(CSharp6Parser.Constructor_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#constructor_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration2(CSharp6Parser.Constructor_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#method_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration2(CSharp6Parser.Method_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#method_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration2(CSharp6Parser.Method_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#method_member_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_member_name(CSharp6Parser.Method_member_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#method_member_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_member_name(CSharp6Parser.Method_member_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#method_member_name2}.
	 * @param ctx the parse tree
	 */
	void enterMethod_member_name2(CSharp6Parser.Method_member_name2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#method_member_name2}.
	 * @param ctx the parse tree
	 */
	void exitMethod_member_name2(CSharp6Parser.Method_member_name2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#operator_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterOperator_declaration2(CSharp6Parser.Operator_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#operator_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitOperator_declaration2(CSharp6Parser.Operator_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_method_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterInterface_method_declaration2(CSharp6Parser.Interface_method_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_method_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitInterface_method_declaration2(CSharp6Parser.Interface_method_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_property_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterInterface_property_declaration2(CSharp6Parser.Interface_property_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_property_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitInterface_property_declaration2(CSharp6Parser.Interface_property_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_event_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterInterface_event_declaration2(CSharp6Parser.Interface_event_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_event_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitInterface_event_declaration2(CSharp6Parser.Interface_event_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#interface_indexer_declaration2}.
	 * @param ctx the parse tree
	 */
	void enterInterface_indexer_declaration2(CSharp6Parser.Interface_indexer_declaration2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#interface_indexer_declaration2}.
	 * @param ctx the parse tree
	 */
	void exitInterface_indexer_declaration2(CSharp6Parser.Interface_indexer_declaration2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#member_access2}.
	 * @param ctx the parse tree
	 */
	void enterMember_access2(CSharp6Parser.Member_access2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#member_access2}.
	 * @param ctx the parse tree
	 */
	void exitMember_access2(CSharp6Parser.Member_access2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#method_invocation2}.
	 * @param ctx the parse tree
	 */
	void enterMethod_invocation2(CSharp6Parser.Method_invocation2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#method_invocation2}.
	 * @param ctx the parse tree
	 */
	void exitMethod_invocation2(CSharp6Parser.Method_invocation2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CSharp6Parser#object_creation_expression2}.
	 * @param ctx the parse tree
	 */
	void enterObject_creation_expression2(CSharp6Parser.Object_creation_expression2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CSharp6Parser#object_creation_expression2}.
	 * @param ctx the parse tree
	 */
	void exitObject_creation_expression2(CSharp6Parser.Object_creation_expression2Context ctx);
}