// Generated from csharp/CSharp5.g4 by ANTLR 4.5.1
package net.siliconcode.parsers.csharp;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link CSharp5Visitor}, which
 * can be extended to create a visitor which only needs to handle a subset of
 * the available methods.
 *
 * @param <T>
 *            The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class CSharp5BaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CSharp5Visitor<T> {

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNamespace_name(final CSharp5Parser.Namespace_nameContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_name(final CSharp5Parser.Type_nameContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIdentifier(final CSharp5Parser.IdentifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNamespace_or_type_name(final CSharp5Parser.Namespace_or_type_nameContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_argument_list_opt(final CSharp5Parser.Type_argument_list_optContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType(final CSharp5Parser.TypeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBase_type(final CSharp5Parser.Base_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSimple_type(final CSharp5Parser.Simple_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNumeric_type(final CSharp5Parser.Numeric_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIntegral_type(final CSharp5Parser.Integral_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFloating_point_type(final CSharp5Parser.Floating_point_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNullable_type(final CSharp5Parser.Nullable_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNon_nullable_value_type(final CSharp5Parser.Non_nullable_value_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitReference_type(final CSharp5Parser.Reference_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_type(final CSharp5Parser.Class_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_type(final CSharp5Parser.Interface_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDelegate_type(final CSharp5Parser.Delegate_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_argument_list(final CSharp5Parser.Type_argument_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_arguments(final CSharp5Parser.Type_argumentsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_argument(final CSharp5Parser.Type_argumentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_void(final CSharp5Parser.Type_voidContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitVariable_reference(final CSharp5Parser.Variable_referenceContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitArgument_list(final CSharp5Parser.Argument_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitArgument(final CSharp5Parser.ArgumentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitArgument_name(final CSharp5Parser.Argument_nameContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitArgument_value(final CSharp5Parser.Argument_valueContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPrimary_expression(final CSharp5Parser.Primary_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPrimary_expression_start(final CSharp5Parser.Primary_expression_startContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBracket_expression(final CSharp5Parser.Bracket_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSimple_name(final CSharp5Parser.Simple_nameContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitParenthesized_expression(final CSharp5Parser.Parenthesized_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMember_access(final CSharp5Parser.Member_accessContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPredefined_type(final CSharp5Parser.Predefined_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExpression_list(final CSharp5Parser.Expression_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitThis_access(final CSharp5Parser.This_accessContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBase_access(final CSharp5Parser.Base_accessContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitObject_creation_expression(final CSharp5Parser.Object_creation_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitObject_or_collection_initializer(final CSharp5Parser.Object_or_collection_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitObject_initializer(final CSharp5Parser.Object_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMember_initializer_list(final CSharp5Parser.Member_initializer_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMember_initializer(final CSharp5Parser.Member_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInitializer_value(final CSharp5Parser.Initializer_valueContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitCollection_initializer(final CSharp5Parser.Collection_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitElement_initializer_list(final CSharp5Parser.Element_initializer_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitElement_initializer(final CSharp5Parser.Element_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitArray_creation_expression(final CSharp5Parser.Array_creation_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDelegate_creation_expression(final CSharp5Parser.Delegate_creation_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAnonymous_object_creation_expression(
			final CSharp5Parser.Anonymous_object_creation_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAnonymous_object_initializer(final CSharp5Parser.Anonymous_object_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMember_declarator_list(final CSharp5Parser.Member_declarator_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMember_declarator(final CSharp5Parser.Member_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitTypeof_expression(final CSharp5Parser.Typeof_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUnbound_type_name(final CSharp5Parser.Unbound_type_nameContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGeneric_dimension_specifier(final CSharp5Parser.Generic_dimension_specifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitCommas(final CSharp5Parser.CommasContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitChecked_expression(final CSharp5Parser.Checked_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUnchecked_expression(final CSharp5Parser.Unchecked_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDefault_value_expression(final CSharp5Parser.Default_value_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUnary_expression(final CSharp5Parser.Unary_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitScan_for_cast_generic_precedence(final CSharp5Parser.Scan_for_cast_generic_precedenceContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitCast_disambiguation_token(final CSharp5Parser.Cast_disambiguation_tokenContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPre_increment_expression(final CSharp5Parser.Pre_increment_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPre_decrement_expression(final CSharp5Parser.Pre_decrement_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitCast_expression(final CSharp5Parser.Cast_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMultiplicative_expression(final CSharp5Parser.Multiplicative_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAdditive_expression(final CSharp5Parser.Additive_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitShift_expression(final CSharp5Parser.Shift_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitRelational_expression(final CSharp5Parser.Relational_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitScan_for_shift_generic_precedence(final CSharp5Parser.Scan_for_shift_generic_precedenceContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitShift_disambiguation_token(final CSharp5Parser.Shift_disambiguation_tokenContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIsType(final CSharp5Parser.IsTypeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIs_disambiguation_token(final CSharp5Parser.Is_disambiguation_tokenContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEquality_expression(final CSharp5Parser.Equality_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAnd_expression(final CSharp5Parser.And_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExclusive_or_expression(final CSharp5Parser.Exclusive_or_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInclusive_or_expression(final CSharp5Parser.Inclusive_or_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConditional_and_expression(final CSharp5Parser.Conditional_and_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConditional_or_expression(final CSharp5Parser.Conditional_or_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNull_coalescing_expression(final CSharp5Parser.Null_coalescing_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConditional_expression(final CSharp5Parser.Conditional_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLambda_expression(final CSharp5Parser.Lambda_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAnonymous_method_expression(final CSharp5Parser.Anonymous_method_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAnonymous_function_signature(final CSharp5Parser.Anonymous_function_signatureContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExplicit_anonymous_function_signature(
			final CSharp5Parser.Explicit_anonymous_function_signatureContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExplicit_anonymous_function_parameter_list(
			final CSharp5Parser.Explicit_anonymous_function_parameter_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExplicit_anonymous_function_parameter(
			final CSharp5Parser.Explicit_anonymous_function_parameterContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAnonymous_function_parameter_modifier(
			final CSharp5Parser.Anonymous_function_parameter_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitImplicit_anonymous_function_signature(
			final CSharp5Parser.Implicit_anonymous_function_signatureContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitImplicit_anonymous_function_parameter_list(
			final CSharp5Parser.Implicit_anonymous_function_parameter_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitImplicit_anonymous_function_parameter(
			final CSharp5Parser.Implicit_anonymous_function_parameterContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAnonymous_function_body(final CSharp5Parser.Anonymous_function_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitQuery_expression(final CSharp5Parser.Query_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFrom_clause(final CSharp5Parser.From_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitQuery_body(final CSharp5Parser.Query_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitQuery_body_clauses(final CSharp5Parser.Query_body_clausesContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitQuery_body_clause(final CSharp5Parser.Query_body_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLet_clause(final CSharp5Parser.Let_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitWhere_clause(final CSharp5Parser.Where_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitJoin_clause(final CSharp5Parser.Join_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitJoin_into_clause(final CSharp5Parser.Join_into_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitCombined_join_clause(final CSharp5Parser.Combined_join_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOrderby_clause(final CSharp5Parser.Orderby_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOrderings(final CSharp5Parser.OrderingsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOrdering(final CSharp5Parser.OrderingContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOrdering_direction(final CSharp5Parser.Ordering_directionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSelect_or_group_clause(final CSharp5Parser.Select_or_group_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSelect_clause(final CSharp5Parser.Select_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGroup_clause(final CSharp5Parser.Group_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitQuery_continuation(final CSharp5Parser.Query_continuationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAssignment(final CSharp5Parser.AssignmentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAssignment_operator(final CSharp5Parser.Assignment_operatorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExpression(final CSharp5Parser.ExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNon_assignment_expression(final CSharp5Parser.Non_assignment_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstant_expression(final CSharp5Parser.Constant_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBoolean_expression(final CSharp5Parser.Boolean_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStatement(final CSharp5Parser.StatementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEmbedded_statement(final CSharp5Parser.Embedded_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSimple_embedded_statement(final CSharp5Parser.Simple_embedded_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBlock(final CSharp5Parser.BlockContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStatement_list(final CSharp5Parser.Statement_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEmpty_statement(final CSharp5Parser.Empty_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLabeled_statement(final CSharp5Parser.Labeled_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDeclaration_statement(final CSharp5Parser.Declaration_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLocal_variable_declaration(final CSharp5Parser.Local_variable_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLocal_variable_type(final CSharp5Parser.Local_variable_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLocal_variable_declarators(final CSharp5Parser.Local_variable_declaratorsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLocal_variable_declarator(final CSharp5Parser.Local_variable_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLocal_variable_initializer(final CSharp5Parser.Local_variable_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLocal_constant_declaration(final CSharp5Parser.Local_constant_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExpression_statement(final CSharp5Parser.Expression_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStatement_expression(final CSharp5Parser.Statement_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSelection_statement(final CSharp5Parser.Selection_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIfBodyBlock(final CSharp5Parser.IfBodyBlockContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIfBodySingle(final CSharp5Parser.IfBodySingleContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIf_statement(final CSharp5Parser.If_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSwitch_statement(final CSharp5Parser.Switch_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSwitch_block(final CSharp5Parser.Switch_blockContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSwitch_sections(final CSharp5Parser.Switch_sectionsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSwitch_section(final CSharp5Parser.Switch_sectionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSwitch_labels(final CSharp5Parser.Switch_labelsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSwitch_label(final CSharp5Parser.Switch_labelContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIteration_statement(final CSharp5Parser.Iteration_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitWhile_statement(final CSharp5Parser.While_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDo_statement(final CSharp5Parser.Do_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFor_statement(final CSharp5Parser.For_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFor_initializer(final CSharp5Parser.For_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFor_condition(final CSharp5Parser.For_conditionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFor_iterator(final CSharp5Parser.For_iteratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStatement_expression_list(final CSharp5Parser.Statement_expression_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitForeach_statement(final CSharp5Parser.Foreach_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitJump_statement(final CSharp5Parser.Jump_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBreak_statement(final CSharp5Parser.Break_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitContinue_statement(final CSharp5Parser.Continue_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGoto_statement(final CSharp5Parser.Goto_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitReturn_statement(final CSharp5Parser.Return_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitThrow_statement(final CSharp5Parser.Throw_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitTry_statement(final CSharp5Parser.Try_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitCatch_clauses(final CSharp5Parser.Catch_clausesContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSpecific_catch_clauses(final CSharp5Parser.Specific_catch_clausesContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSpecific_catch_clause(final CSharp5Parser.Specific_catch_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGeneral_catch_clause(final CSharp5Parser.General_catch_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFinally_clause(final CSharp5Parser.Finally_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitChecked_statement(final CSharp5Parser.Checked_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUnchecked_statement(final CSharp5Parser.Unchecked_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLock_statement(final CSharp5Parser.Lock_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUsing_statement(final CSharp5Parser.Using_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitResource_acquisition(final CSharp5Parser.Resource_acquisitionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitYield_statement(final CSharp5Parser.Yield_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitCompilation_unit(final CSharp5Parser.Compilation_unitContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNamespace_declaration(final CSharp5Parser.Namespace_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitQualified_identifier(final CSharp5Parser.Qualified_identifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNamespace_body(final CSharp5Parser.Namespace_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExtern_alias_directives(final CSharp5Parser.Extern_alias_directivesContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitExtern_alias_directive(final CSharp5Parser.Extern_alias_directiveContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUsing_directives(final CSharp5Parser.Using_directivesContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUsing_directive(final CSharp5Parser.Using_directiveContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUsing_alias_directive(final CSharp5Parser.Using_alias_directiveContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUsing_namespace_directive(final CSharp5Parser.Using_namespace_directiveContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNamespace_member_declarations(final CSharp5Parser.Namespace_member_declarationsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNamespace_member_declaration(final CSharp5Parser.Namespace_member_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_declaration(final CSharp5Parser.Type_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitQualified_alias_member(final CSharp5Parser.Qualified_alias_memberContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_declaration(final CSharp5Parser.Class_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_modifiers(final CSharp5Parser.Class_modifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_modifier(final CSharp5Parser.Class_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_parameter_list(final CSharp5Parser.Type_parameter_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_parameters(final CSharp5Parser.Type_parametersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_parameter(final CSharp5Parser.Type_parameterContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_base(final CSharp5Parser.Class_baseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_type_list(final CSharp5Parser.Interface_type_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_parameter_constraints_clauses(
			final CSharp5Parser.Type_parameter_constraints_clausesContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_parameter_constraints_clause(final CSharp5Parser.Type_parameter_constraints_clauseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_parameter_constraints(final CSharp5Parser.Type_parameter_constraintsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPrimary_constraint(final CSharp5Parser.Primary_constraintContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSecondary_constraints(final CSharp5Parser.Secondary_constraintsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstructor_constraint(final CSharp5Parser.Constructor_constraintContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_body(final CSharp5Parser.Class_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_member_declarations(final CSharp5Parser.Class_member_declarationsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_member_declaration(final CSharp5Parser.Class_member_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAll_member_modifiers(final CSharp5Parser.All_member_modifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAll_member_modifier(final CSharp5Parser.All_member_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitCommon_member_declaration(final CSharp5Parser.Common_member_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitTyped_member_declaration(final CSharp5Parser.Typed_member_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstant_declarators(final CSharp5Parser.Constant_declaratorsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstant_declarator(final CSharp5Parser.Constant_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitVariable_declarators(final CSharp5Parser.Variable_declaratorsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitVariable_declarator(final CSharp5Parser.Variable_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitVariable_initializer(final CSharp5Parser.Variable_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMethod_declaration(final CSharp5Parser.Method_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMethod_header(final CSharp5Parser.Method_headerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMethod_modifiers(final CSharp5Parser.Method_modifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMethod_modifier(final CSharp5Parser.Method_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitReturn_type(final CSharp5Parser.Return_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMember_name(final CSharp5Parser.Member_nameContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMethod_body(final CSharp5Parser.Method_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFormal_parameter_list(final CSharp5Parser.Formal_parameter_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_parameters(final CSharp5Parser.Fixed_parametersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_parameter(final CSharp5Parser.Fixed_parameterContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDefault_argument(final CSharp5Parser.Default_argumentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitParameter_modifier(final CSharp5Parser.Parameter_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitParameter_array(final CSharp5Parser.Parameter_arrayContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitProperty_declaration(final CSharp5Parser.Property_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitProperty_modifiers(final CSharp5Parser.Property_modifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitProperty_modifier(final CSharp5Parser.Property_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAccessor_declarations(final CSharp5Parser.Accessor_declarationsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGet_accessor_declaration(final CSharp5Parser.Get_accessor_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSet_accessor_declaration(final CSharp5Parser.Set_accessor_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAccessor_modifier(final CSharp5Parser.Accessor_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAccessor_body(final CSharp5Parser.Accessor_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEvent_declaration(final CSharp5Parser.Event_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEvent_modifiers(final CSharp5Parser.Event_modifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEvent_modifier(final CSharp5Parser.Event_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEvent_accessor_declarations(final CSharp5Parser.Event_accessor_declarationsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAdd_accessor_declaration(final CSharp5Parser.Add_accessor_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitRemove_accessor_declaration(final CSharp5Parser.Remove_accessor_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIndexer_declaration(final CSharp5Parser.Indexer_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIndexer_modifiers(final CSharp5Parser.Indexer_modifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIndexer_modifier(final CSharp5Parser.Indexer_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIndexer_declarator(final CSharp5Parser.Indexer_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOperator_declaration(final CSharp5Parser.Operator_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOperator_modifiers(final CSharp5Parser.Operator_modifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOperator_modifier(final CSharp5Parser.Operator_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOperator_declarator(final CSharp5Parser.Operator_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUnary_operator_declarator(final CSharp5Parser.Unary_operator_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOverloadable_unary_operator(final CSharp5Parser.Overloadable_unary_operatorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBinary_operator_declarator(final CSharp5Parser.Binary_operator_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOverloadable_binary_operator(final CSharp5Parser.Overloadable_binary_operatorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOverloadable_operator(final CSharp5Parser.Overloadable_operatorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConversion_operator_declarator(final CSharp5Parser.Conversion_operator_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOperator_body(final CSharp5Parser.Operator_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstructor_declaration(final CSharp5Parser.Constructor_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstructor_modifiers(final CSharp5Parser.Constructor_modifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstructor_modifier(final CSharp5Parser.Constructor_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstructor_declarator(final CSharp5Parser.Constructor_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstructor_initializer(final CSharp5Parser.Constructor_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstructor_body(final CSharp5Parser.Constructor_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStatic_constructor_declaration(final CSharp5Parser.Static_constructor_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStatic_constructor_modifiers(final CSharp5Parser.Static_constructor_modifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStatic_constructor_body(final CSharp5Parser.Static_constructor_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDestructor_declaration(final CSharp5Parser.Destructor_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDestructor_body(final CSharp5Parser.Destructor_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBody(final CSharp5Parser.BodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStruct_declaration(final CSharp5Parser.Struct_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStruct_modifiers(final CSharp5Parser.Struct_modifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStruct_modifier(final CSharp5Parser.Struct_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStruct_interfaces(final CSharp5Parser.Struct_interfacesContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStruct_body(final CSharp5Parser.Struct_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStruct_member_declarations(final CSharp5Parser.Struct_member_declarationsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStruct_member_declaration(final CSharp5Parser.Struct_member_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitArray_type(final CSharp5Parser.Array_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNon_array_type(final CSharp5Parser.Non_array_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitRank_specifiers(final CSharp5Parser.Rank_specifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitRank_specifier(final CSharp5Parser.Rank_specifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDim_separators(final CSharp5Parser.Dim_separatorsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitArray_initializer(final CSharp5Parser.Array_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitVariable_initializer_list(final CSharp5Parser.Variable_initializer_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_declaration(final CSharp5Parser.Interface_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_modifiers(final CSharp5Parser.Interface_modifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_modifier(final CSharp5Parser.Interface_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitVariant_type_parameter_list(final CSharp5Parser.Variant_type_parameter_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitVariant_type_parameters(final CSharp5Parser.Variant_type_parametersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitVariance_annotation(final CSharp5Parser.Variance_annotationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_base(final CSharp5Parser.Interface_baseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_body(final CSharp5Parser.Interface_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_member_declarations(final CSharp5Parser.Interface_member_declarationsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_member_declaration(final CSharp5Parser.Interface_member_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_method_declaration(final CSharp5Parser.Interface_method_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_property_declaration(final CSharp5Parser.Interface_property_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_accessors(final CSharp5Parser.Interface_accessorsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_event_declaration(final CSharp5Parser.Interface_event_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_indexer_declaration(final CSharp5Parser.Interface_indexer_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEnum_declaration(final CSharp5Parser.Enum_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEnum_base(final CSharp5Parser.Enum_baseContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEnum_body(final CSharp5Parser.Enum_bodyContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEnum_modifiers(final CSharp5Parser.Enum_modifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEnum_modifier(final CSharp5Parser.Enum_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEnum_member_declarations(final CSharp5Parser.Enum_member_declarationsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEnum_member_declaration(final CSharp5Parser.Enum_member_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDelegate_declaration(final CSharp5Parser.Delegate_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDelegate_modifiers(final CSharp5Parser.Delegate_modifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDelegate_modifier(final CSharp5Parser.Delegate_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGlobal_attributes(final CSharp5Parser.Global_attributesContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGlobal_attribute_sections(final CSharp5Parser.Global_attribute_sectionsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGlobal_attribute_section(final CSharp5Parser.Global_attribute_sectionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGlobal_attribute_target_specifier(final CSharp5Parser.Global_attribute_target_specifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGlobal_attribute_target(final CSharp5Parser.Global_attribute_targetContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttributes(final CSharp5Parser.AttributesContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttribute_sections(final CSharp5Parser.Attribute_sectionsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttribute_section(final CSharp5Parser.Attribute_sectionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttribute_target_specifier(final CSharp5Parser.Attribute_target_specifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttribute_target(final CSharp5Parser.Attribute_targetContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttribute_list(final CSharp5Parser.Attribute_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttribute(final CSharp5Parser.AttributeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttribute_name(final CSharp5Parser.Attribute_nameContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttribute_arguments(final CSharp5Parser.Attribute_argumentsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPositional_argument_list(final CSharp5Parser.Positional_argument_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPositional_argument(final CSharp5Parser.Positional_argumentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNamed_argument_list(final CSharp5Parser.Named_argument_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitNamed_argument(final CSharp5Parser.Named_argumentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAttribute_argument_expression(final CSharp5Parser.Attribute_argument_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_modifier_unsafe(final CSharp5Parser.Class_modifier_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStruct_modifier_unsafe(final CSharp5Parser.Struct_modifier_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_modifier_unsafe(final CSharp5Parser.Interface_modifier_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDelegate_modifier_unsafe(final CSharp5Parser.Delegate_modifier_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitField_modifier_unsafe(final CSharp5Parser.Field_modifier_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMethod_modifier_unsafe(final CSharp5Parser.Method_modifier_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitProperty_modifier_unsafe(final CSharp5Parser.Property_modifier_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEvent_modifier_unsafe(final CSharp5Parser.Event_modifier_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIndexer_modifier_unsafe(final CSharp5Parser.Indexer_modifier_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOperator_modifier_unsafe(final CSharp5Parser.Operator_modifier_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstructor_modifier_unsafe(final CSharp5Parser.Constructor_modifier_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDestructor_declaration_unsafe(final CSharp5Parser.Destructor_declaration_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStatic_constructor_modifiers_unsafe(
			final CSharp5Parser.Static_constructor_modifiers_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEmbedded_statement_unsafe(final CSharp5Parser.Embedded_statement_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUnsafe_statement(final CSharp5Parser.Unsafe_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitType_unsafe(final CSharp5Parser.Type_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPointer_type(final CSharp5Parser.Pointer_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUnmanaged_type(final CSharp5Parser.Unmanaged_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPrimary_no_array_creation_expression_unsafe(
			final CSharp5Parser.Primary_no_array_creation_expression_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitUnary_expression_unsafe(final CSharp5Parser.Unary_expression_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPointer_indirection_expression(final CSharp5Parser.Pointer_indirection_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAddressof_expression(final CSharp5Parser.Addressof_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSizeof_expression(final CSharp5Parser.Sizeof_expressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_statement(final CSharp5Parser.Fixed_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_pointer_declarators(final CSharp5Parser.Fixed_pointer_declaratorsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_pointer_declarator(final CSharp5Parser.Fixed_pointer_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_pointer_initializer(final CSharp5Parser.Fixed_pointer_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStruct_member_declaration_unsafe(final CSharp5Parser.Struct_member_declaration_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_size_buffer_declaration(final CSharp5Parser.Fixed_size_buffer_declarationContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_size_buffer_modifiers(final CSharp5Parser.Fixed_size_buffer_modifiersContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_size_buffer_modifier(final CSharp5Parser.Fixed_size_buffer_modifierContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBuffer_element_type(final CSharp5Parser.Buffer_element_typeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_size_buffer_declarators(final CSharp5Parser.Fixed_size_buffer_declaratorsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFixed_size_buffer_declarator(final CSharp5Parser.Fixed_size_buffer_declaratorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLocal_variable_initializer_unsafe(final CSharp5Parser.Local_variable_initializer_unsafeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStackalloc_initializer(final CSharp5Parser.Stackalloc_initializerContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitFrom_contextual_keyword(final CSharp5Parser.From_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLet_contextual_keyword(final CSharp5Parser.Let_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitWhere_contextual_keyword(final CSharp5Parser.Where_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitJoin_contextual_keyword(final CSharp5Parser.Join_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOn_contextual_keyword(final CSharp5Parser.On_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEquals_contextual_keyword(final CSharp5Parser.Equals_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInto_contextual_keyword(final CSharp5Parser.Into_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOrderby_contextual_keyword(final CSharp5Parser.Orderby_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAscending_contextual_keyword(final CSharp5Parser.Ascending_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDescending_contextual_keyword(final CSharp5Parser.Descending_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSelect_contextual_keyword(final CSharp5Parser.Select_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGroup_contextual_keyword(final CSharp5Parser.Group_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBy_contextual_keyword(final CSharp5Parser.By_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitPartial_contextual_keyword(final CSharp5Parser.Partial_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAlias_contextual_keyword(final CSharp5Parser.Alias_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitYield_contextual_keyword(final CSharp5Parser.Yield_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitGet_contextual_keyword(final CSharp5Parser.Get_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitSet_contextual_keyword(final CSharp5Parser.Set_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitAdd_contextual_keyword(final CSharp5Parser.Add_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitRemove_contextual_keyword(final CSharp5Parser.Remove_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDynamic_contextual_keyword(final CSharp5Parser.Dynamic_contextual_keywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitArglist(final CSharp5Parser.ArglistContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitRight_arrow(final CSharp5Parser.Right_arrowContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitRight_shift(final CSharp5Parser.Right_shiftContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitRight_shift_assignment(final CSharp5Parser.Right_shift_assignmentContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitLiteral(final CSharp5Parser.LiteralContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitBoolean_literal(final CSharp5Parser.Boolean_literalContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitKeyword(final CSharp5Parser.KeywordContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitClass_definition(final CSharp5Parser.Class_definitionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitStruct_definition(final CSharp5Parser.Struct_definitionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_definition(final CSharp5Parser.Interface_definitionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEnum_definition(final CSharp5Parser.Enum_definitionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDelegate_definition(final CSharp5Parser.Delegate_definitionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitEvent_declaration2(final CSharp5Parser.Event_declaration2Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitField_declaration2(final CSharp5Parser.Field_declaration2Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitProperty_declaration2(final CSharp5Parser.Property_declaration2Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstant_declaration2(final CSharp5Parser.Constant_declaration2Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitIndexer_declaration2(final CSharp5Parser.Indexer_declaration2Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitDestructor_definition(final CSharp5Parser.Destructor_definitionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitConstructor_declaration2(final CSharp5Parser.Constructor_declaration2Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMethod_declaration2(final CSharp5Parser.Method_declaration2Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMethod_member_name(final CSharp5Parser.Method_member_nameContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMethod_member_name2(final CSharp5Parser.Method_member_name2Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitOperator_declaration2(final CSharp5Parser.Operator_declaration2Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_method_declaration2(final CSharp5Parser.Interface_method_declaration2Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_property_declaration2(final CSharp5Parser.Interface_property_declaration2Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_event_declaration2(final CSharp5Parser.Interface_event_declaration2Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitInterface_indexer_declaration2(final CSharp5Parser.Interface_indexer_declaration2Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMember_access2(final CSharp5Parser.Member_access2Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitMethod_invocation2(final CSharp5Parser.Method_invocation2Context ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public T visitObject_creation_expression2(final CSharp5Parser.Object_creation_expression2Context ctx) {
		return visitChildren(ctx);
	}
}