package net.siliconcode.parser;
// Generated from /home/isaac/git/grammars-v4/csharp/CSharp4.g4 by ANTLR 4.5
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSharp4Parser}.
 *
 * @param <T>
 *            The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface CSharp4Visitor<T> extends ParseTreeVisitor<T> {

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#accessor_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAccessor_body(CSharp4Parser.Accessor_bodyContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#accessor_declarations}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAccessor_declarations(CSharp4Parser.Accessor_declarationsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#accessor_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAccessor_modifier(CSharp4Parser.Accessor_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#add_accessor_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAdd_accessor_declaration(CSharp4Parser.Add_accessor_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#add_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAdd_contextual_keyword(CSharp4Parser.Add_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#additive_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAdditive_expression(CSharp4Parser.Additive_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#addressof_expression}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAddressof_expression(CSharp4Parser.Addressof_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#alias_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAlias_contextual_keyword(CSharp4Parser.Alias_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#all_member_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAll_member_modifier(CSharp4Parser.All_member_modifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#all_member_modifiers}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAll_member_modifiers(CSharp4Parser.All_member_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#and_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAnd_expression(CSharp4Parser.And_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#anonymous_function_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAnonymous_function_body(CSharp4Parser.Anonymous_function_bodyContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#anonymous_function_parameter_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAnonymous_function_parameter_modifier(CSharp4Parser.Anonymous_function_parameter_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#anonymous_function_signature}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAnonymous_function_signature(CSharp4Parser.Anonymous_function_signatureContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#anonymous_method_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAnonymous_method_expression(CSharp4Parser.Anonymous_method_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#anonymous_object_creation_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAnonymous_object_creation_expression(CSharp4Parser.Anonymous_object_creation_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#anonymous_object_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAnonymous_object_initializer(CSharp4Parser.Anonymous_object_initializerContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#arglist}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArglist(CSharp4Parser.ArglistContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#argument}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArgument(CSharp4Parser.ArgumentContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#argument_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArgument_list(CSharp4Parser.Argument_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#argument_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArgument_name(CSharp4Parser.Argument_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#argument_value}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArgument_value(CSharp4Parser.Argument_valueContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#array_creation_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArray_creation_expression(CSharp4Parser.Array_creation_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#array_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArray_initializer(CSharp4Parser.Array_initializerContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#array_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitArray_type(CSharp4Parser.Array_typeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#ascending_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAscending_contextual_keyword(CSharp4Parser.Ascending_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#assignment}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAssignment(CSharp4Parser.AssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#assignment_operator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAssignment_operator(CSharp4Parser.Assignment_operatorContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#attribute}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute(CSharp4Parser.AttributeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#attribute_argument_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_argument_expression(CSharp4Parser.Attribute_argument_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#attribute_arguments}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_arguments(CSharp4Parser.Attribute_argumentsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#attribute_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_list(CSharp4Parser.Attribute_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#attribute_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_name(CSharp4Parser.Attribute_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#attribute_section}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_section(CSharp4Parser.Attribute_sectionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#attribute_sections}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_sections(CSharp4Parser.Attribute_sectionsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#attribute_target}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_target(CSharp4Parser.Attribute_targetContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#attribute_target_specifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttribute_target_specifier(CSharp4Parser.Attribute_target_specifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#attributes}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitAttributes(CSharp4Parser.AttributesContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#base_access}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBase_access(CSharp4Parser.Base_accessContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#base_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBase_type(CSharp4Parser.Base_typeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#binary_operator_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBinary_operator_declarator(CSharp4Parser.Binary_operator_declaratorContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#block}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBlock(CSharp4Parser.BlockContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBody(CSharp4Parser.BodyContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#boolean_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBoolean_expression(CSharp4Parser.Boolean_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#boolean_literal}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBoolean_literal(CSharp4Parser.Boolean_literalContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#bracket_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBracket_expression(CSharp4Parser.Bracket_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#break_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBreak_statement(CSharp4Parser.Break_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#buffer_element_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBuffer_element_type(CSharp4Parser.Buffer_element_typeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#by_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitBy_contextual_keyword(CSharp4Parser.By_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#cast_disambiguation_token}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCast_disambiguation_token(CSharp4Parser.Cast_disambiguation_tokenContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#cast_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCast_expression(CSharp4Parser.Cast_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#catch_clauses}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCatch_clauses(CSharp4Parser.Catch_clausesContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#checked_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitChecked_expression(CSharp4Parser.Checked_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#checked_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitChecked_statement(CSharp4Parser.Checked_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#class_base}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_base(CSharp4Parser.Class_baseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#class_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_body(CSharp4Parser.Class_bodyContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#class_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_declaration(CSharp4Parser.Class_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#class_definition}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_definition(CSharp4Parser.Class_definitionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#class_member_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_member_declaration(CSharp4Parser.Class_member_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#class_member_declarations}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_member_declarations(CSharp4Parser.Class_member_declarationsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#class_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_modifier(CSharp4Parser.Class_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#class_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_modifier_unsafe(CSharp4Parser.Class_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#class_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_modifiers(CSharp4Parser.Class_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#class_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitClass_type(CSharp4Parser.Class_typeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#collection_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCollection_initializer(CSharp4Parser.Collection_initializerContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#combined_join_clause}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCombined_join_clause(CSharp4Parser.Combined_join_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#commas}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCommas(CSharp4Parser.CommasContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#common_member_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCommon_member_declaration(CSharp4Parser.Common_member_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#compilation_unit}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitCompilation_unit(CSharp4Parser.Compilation_unitContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#conditional_and_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConditional_and_expression(CSharp4Parser.Conditional_and_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#conditional_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConditional_expression(CSharp4Parser.Conditional_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#conditional_or_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConditional_or_expression(CSharp4Parser.Conditional_or_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#constant_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstant_declaration2(CSharp4Parser.Constant_declaration2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#constant_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstant_declarator(CSharp4Parser.Constant_declaratorContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#constant_declarators}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstant_declarators(CSharp4Parser.Constant_declaratorsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#constant_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstant_expression(CSharp4Parser.Constant_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#constructor_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_body(CSharp4Parser.Constructor_bodyContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#constructor_constraint}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_constraint(CSharp4Parser.Constructor_constraintContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#constructor_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_declaration(CSharp4Parser.Constructor_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#constructor_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_declaration2(CSharp4Parser.Constructor_declaration2Context ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#constructor_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_declarator(CSharp4Parser.Constructor_declaratorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#constructor_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_initializer(CSharp4Parser.Constructor_initializerContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#constructor_modifier}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_modifier(CSharp4Parser.Constructor_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#constructor_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_modifier_unsafe(CSharp4Parser.Constructor_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#constructor_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConstructor_modifiers(CSharp4Parser.Constructor_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#continue_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitContinue_statement(CSharp4Parser.Continue_statementContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#conversion_operator_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitConversion_operator_declarator(CSharp4Parser.Conversion_operator_declaratorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#declaration_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDeclaration_statement(CSharp4Parser.Declaration_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#default_argument}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDefault_argument(CSharp4Parser.Default_argumentContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#default_value_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDefault_value_expression(CSharp4Parser.Default_value_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#delegate_creation_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDelegate_creation_expression(CSharp4Parser.Delegate_creation_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#delegate_declaration}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDelegate_declaration(CSharp4Parser.Delegate_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#delegate_definition}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDelegate_definition(CSharp4Parser.Delegate_definitionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#delegate_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDelegate_modifier(CSharp4Parser.Delegate_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#delegate_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDelegate_modifier_unsafe(CSharp4Parser.Delegate_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#delegate_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDelegate_modifiers(CSharp4Parser.Delegate_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#delegate_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDelegate_type(CSharp4Parser.Delegate_typeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#descending_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDescending_contextual_keyword(CSharp4Parser.Descending_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#destructor_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDestructor_body(CSharp4Parser.Destructor_bodyContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#destructor_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDestructor_declaration(CSharp4Parser.Destructor_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#destructor_declaration_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDestructor_declaration_unsafe(CSharp4Parser.Destructor_declaration_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#destructor_definition}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDestructor_definition(CSharp4Parser.Destructor_definitionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#dim_separators}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDim_separators(CSharp4Parser.Dim_separatorsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#do_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDo_statement(CSharp4Parser.Do_statementContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#dynamic_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitDynamic_contextual_keyword(CSharp4Parser.Dynamic_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#element_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitElement_initializer(CSharp4Parser.Element_initializerContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#element_initializer_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitElement_initializer_list(CSharp4Parser.Element_initializer_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#embedded_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEmbedded_statement(CSharp4Parser.Embedded_statementContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#embedded_statement_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEmbedded_statement_unsafe(CSharp4Parser.Embedded_statement_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#empty_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEmpty_statement(CSharp4Parser.Empty_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#enum_base}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_base(CSharp4Parser.Enum_baseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#enum_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_body(CSharp4Parser.Enum_bodyContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#enum_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_declaration(CSharp4Parser.Enum_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#enum_definition}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_definition(CSharp4Parser.Enum_definitionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#enum_member_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_member_declaration(CSharp4Parser.Enum_member_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#enum_member_declarations}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_member_declarations(CSharp4Parser.Enum_member_declarationsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#enum_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_modifier(CSharp4Parser.Enum_modifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#enum_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEnum_modifiers(CSharp4Parser.Enum_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#equality_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEquality_expression(CSharp4Parser.Equality_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#equals_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEquals_contextual_keyword(CSharp4Parser.Equals_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#event_accessor_declarations}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEvent_accessor_declarations(CSharp4Parser.Event_accessor_declarationsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#event_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEvent_declaration(CSharp4Parser.Event_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#event_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEvent_declaration2(CSharp4Parser.Event_declaration2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#event_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEvent_modifier(CSharp4Parser.Event_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#event_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEvent_modifier_unsafe(CSharp4Parser.Event_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#event_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitEvent_modifiers(CSharp4Parser.Event_modifiersContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#exclusive_or_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExclusive_or_expression(CSharp4Parser.Exclusive_or_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#explicit_anonymous_function_parameter}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExplicit_anonymous_function_parameter(CSharp4Parser.Explicit_anonymous_function_parameterContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#explicit_anonymous_function_parameter_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExplicit_anonymous_function_parameter_list(
            CSharp4Parser.Explicit_anonymous_function_parameter_listContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#explicit_anonymous_function_signature}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExplicit_anonymous_function_signature(CSharp4Parser.Explicit_anonymous_function_signatureContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExpression(CSharp4Parser.ExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#expression_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExpression_list(CSharp4Parser.Expression_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#expression_statement}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExpression_statement(CSharp4Parser.Expression_statementContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#extern_alias_directive}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExtern_alias_directive(CSharp4Parser.Extern_alias_directiveContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#extern_alias_directives}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitExtern_alias_directives(CSharp4Parser.Extern_alias_directivesContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#field_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitField_declaration2(CSharp4Parser.Field_declaration2Context ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#field_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitField_modifier_unsafe(CSharp4Parser.Field_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#finally_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFinally_clause(CSharp4Parser.Finally_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#fixed_parameter}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_parameter(CSharp4Parser.Fixed_parameterContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#fixed_parameters}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_parameters(CSharp4Parser.Fixed_parametersContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#fixed_pointer_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_pointer_declarator(CSharp4Parser.Fixed_pointer_declaratorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#fixed_pointer_declarators}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_pointer_declarators(CSharp4Parser.Fixed_pointer_declaratorsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#fixed_pointer_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_pointer_initializer(CSharp4Parser.Fixed_pointer_initializerContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#fixed_size_buffer_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_size_buffer_declaration(CSharp4Parser.Fixed_size_buffer_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#fixed_size_buffer_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_size_buffer_declarator(CSharp4Parser.Fixed_size_buffer_declaratorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#fixed_size_buffer_declarators}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_size_buffer_declarators(CSharp4Parser.Fixed_size_buffer_declaratorsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#fixed_size_buffer_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_size_buffer_modifier(CSharp4Parser.Fixed_size_buffer_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#fixed_size_buffer_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_size_buffer_modifiers(CSharp4Parser.Fixed_size_buffer_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#fixed_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFixed_statement(CSharp4Parser.Fixed_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#floating_point_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFloating_point_type(CSharp4Parser.Floating_point_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#for_condition}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFor_condition(CSharp4Parser.For_conditionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#for_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFor_initializer(CSharp4Parser.For_initializerContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#for_iterator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFor_iterator(CSharp4Parser.For_iteratorContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#for_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFor_statement(CSharp4Parser.For_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#foreach_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitForeach_statement(CSharp4Parser.Foreach_statementContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#formal_parameter_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFormal_parameter_list(CSharp4Parser.Formal_parameter_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#from_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFrom_clause(CSharp4Parser.From_clauseContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#from_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitFrom_contextual_keyword(CSharp4Parser.From_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#general_catch_clause}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGeneral_catch_clause(CSharp4Parser.General_catch_clauseContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#generic_dimension_specifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGeneric_dimension_specifier(CSharp4Parser.Generic_dimension_specifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#get_accessor_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGet_accessor_declaration(CSharp4Parser.Get_accessor_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#get_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGet_contextual_keyword(CSharp4Parser.Get_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#global_attribute_section}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGlobal_attribute_section(CSharp4Parser.Global_attribute_sectionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#global_attribute_sections}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGlobal_attribute_sections(CSharp4Parser.Global_attribute_sectionsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#global_attribute_target}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGlobal_attribute_target(CSharp4Parser.Global_attribute_targetContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#global_attribute_target_specifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGlobal_attribute_target_specifier(CSharp4Parser.Global_attribute_target_specifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#global_attributes}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGlobal_attributes(CSharp4Parser.Global_attributesContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#goto_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGoto_statement(CSharp4Parser.Goto_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#group_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGroup_clause(CSharp4Parser.Group_clauseContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#group_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitGroup_contextual_keyword(CSharp4Parser.Group_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#identifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIdentifier(CSharp4Parser.IdentifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#if_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIf_statement(CSharp4Parser.If_statementContext ctx);

    /**
     * Visit a parse tree produced by the {@code ifBodyBlock} labeled
     * alternative in {@link CSharp4Parser#if_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIfBodyBlock(CSharp4Parser.IfBodyBlockContext ctx);

    /**
     * Visit a parse tree produced by the {@code ifBodySingle} labeled
     * alternative in {@link CSharp4Parser#if_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIfBodySingle(CSharp4Parser.IfBodySingleContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#implicit_anonymous_function_parameter}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitImplicit_anonymous_function_parameter(CSharp4Parser.Implicit_anonymous_function_parameterContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#implicit_anonymous_function_parameter_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitImplicit_anonymous_function_parameter_list(
            CSharp4Parser.Implicit_anonymous_function_parameter_listContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#implicit_anonymous_function_signature}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitImplicit_anonymous_function_signature(CSharp4Parser.Implicit_anonymous_function_signatureContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#inclusive_or_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInclusive_or_expression(CSharp4Parser.Inclusive_or_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#indexer_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIndexer_declaration(CSharp4Parser.Indexer_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#indexer_declaration2}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIndexer_declaration2(CSharp4Parser.Indexer_declaration2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#indexer_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIndexer_declarator(CSharp4Parser.Indexer_declaratorContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#indexer_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIndexer_modifier(CSharp4Parser.Indexer_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#indexer_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIndexer_modifier_unsafe(CSharp4Parser.Indexer_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#indexer_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIndexer_modifiers(CSharp4Parser.Indexer_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#initializer_value}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInitializer_value(CSharp4Parser.Initializer_valueContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#integral_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIntegral_type(CSharp4Parser.Integral_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#interface_accessors}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_accessors(CSharp4Parser.Interface_accessorsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#interface_base}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_base(CSharp4Parser.Interface_baseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#interface_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_body(CSharp4Parser.Interface_bodyContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#interface_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_declaration(CSharp4Parser.Interface_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#interface_definition}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_definition(CSharp4Parser.Interface_definitionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#interface_event_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_event_declaration(CSharp4Parser.Interface_event_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#interface_event_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_event_declaration2(CSharp4Parser.Interface_event_declaration2Context ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#interface_indexer_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_indexer_declaration(CSharp4Parser.Interface_indexer_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#interface_indexer_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_indexer_declaration2(CSharp4Parser.Interface_indexer_declaration2Context ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#interface_member_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_member_declaration(CSharp4Parser.Interface_member_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#interface_member_declarations}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_member_declarations(CSharp4Parser.Interface_member_declarationsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#interface_method_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_method_declaration(CSharp4Parser.Interface_method_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#interface_method_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_method_declaration2(CSharp4Parser.Interface_method_declaration2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#interface_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_modifier(CSharp4Parser.Interface_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#interface_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_modifier_unsafe(CSharp4Parser.Interface_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#interface_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_modifiers(CSharp4Parser.Interface_modifiersContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#interface_property_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_property_declaration(CSharp4Parser.Interface_property_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#interface_property_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_property_declaration2(CSharp4Parser.Interface_property_declaration2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#interface_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_type(CSharp4Parser.Interface_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#interface_type_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInterface_type_list(CSharp4Parser.Interface_type_listContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#into_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitInto_contextual_keyword(CSharp4Parser.Into_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#is_disambiguation_token}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIs_disambiguation_token(CSharp4Parser.Is_disambiguation_tokenContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#isType}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIsType(CSharp4Parser.IsTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#iteration_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitIteration_statement(CSharp4Parser.Iteration_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#join_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitJoin_clause(CSharp4Parser.Join_clauseContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#join_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitJoin_contextual_keyword(CSharp4Parser.Join_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#join_into_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitJoin_into_clause(CSharp4Parser.Join_into_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#jump_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitJump_statement(CSharp4Parser.Jump_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitKeyword(CSharp4Parser.KeywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#labeled_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLabeled_statement(CSharp4Parser.Labeled_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#lambda_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLambda_expression(CSharp4Parser.Lambda_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#let_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLet_clause(CSharp4Parser.Let_clauseContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#let_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLet_contextual_keyword(CSharp4Parser.Let_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#literal}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLiteral(CSharp4Parser.LiteralContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#local_constant_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLocal_constant_declaration(CSharp4Parser.Local_constant_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#local_variable_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLocal_variable_declaration(CSharp4Parser.Local_variable_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#local_variable_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLocal_variable_declarator(CSharp4Parser.Local_variable_declaratorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#local_variable_declarators}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLocal_variable_declarators(CSharp4Parser.Local_variable_declaratorsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#local_variable_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLocal_variable_initializer(CSharp4Parser.Local_variable_initializerContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#local_variable_initializer_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLocal_variable_initializer_unsafe(CSharp4Parser.Local_variable_initializer_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#local_variable_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLocal_variable_type(CSharp4Parser.Local_variable_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#lock_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitLock_statement(CSharp4Parser.Lock_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#member_access}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMember_access(CSharp4Parser.Member_accessContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#member_access2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMember_access2(CSharp4Parser.Member_access2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#member_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMember_declarator(CSharp4Parser.Member_declaratorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#member_declarator_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMember_declarator_list(CSharp4Parser.Member_declarator_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#member_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMember_initializer(CSharp4Parser.Member_initializerContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#member_initializer_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMember_initializer_list(CSharp4Parser.Member_initializer_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#member_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMember_name(CSharp4Parser.Member_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#method_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_body(CSharp4Parser.Method_bodyContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#method_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_declaration(CSharp4Parser.Method_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#method_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_declaration2(CSharp4Parser.Method_declaration2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#method_header}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_header(CSharp4Parser.Method_headerContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#method_invocation2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_invocation2(CSharp4Parser.Method_invocation2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#method_member_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_member_name(CSharp4Parser.Method_member_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#method_member_name2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_member_name2(CSharp4Parser.Method_member_name2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#method_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_modifier(CSharp4Parser.Method_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#method_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_modifier_unsafe(CSharp4Parser.Method_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#method_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMethod_modifiers(CSharp4Parser.Method_modifiersContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#multiplicative_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitMultiplicative_expression(CSharp4Parser.Multiplicative_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#named_argument}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamed_argument(CSharp4Parser.Named_argumentContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#named_argument_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamed_argument_list(CSharp4Parser.Named_argument_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#namespace_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamespace_body(CSharp4Parser.Namespace_bodyContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#namespace_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamespace_declaration(CSharp4Parser.Namespace_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#namespace_member_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamespace_member_declaration(CSharp4Parser.Namespace_member_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#namespace_member_declarations}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamespace_member_declarations(CSharp4Parser.Namespace_member_declarationsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#namespace_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamespace_name(CSharp4Parser.Namespace_nameContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#namespace_or_type_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNamespace_or_type_name(CSharp4Parser.Namespace_or_type_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#non_array_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNon_array_type(CSharp4Parser.Non_array_typeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#non_assignment_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNon_assignment_expression(CSharp4Parser.Non_assignment_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#non_nullable_value_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNon_nullable_value_type(CSharp4Parser.Non_nullable_value_typeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#null_coalescing_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNull_coalescing_expression(CSharp4Parser.Null_coalescing_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#nullable_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNullable_type(CSharp4Parser.Nullable_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#numeric_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitNumeric_type(CSharp4Parser.Numeric_typeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#object_creation_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitObject_creation_expression(CSharp4Parser.Object_creation_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#object_creation_expression2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitObject_creation_expression2(CSharp4Parser.Object_creation_expression2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#object_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitObject_initializer(CSharp4Parser.Object_initializerContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#object_or_collection_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitObject_or_collection_initializer(CSharp4Parser.Object_or_collection_initializerContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#on_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOn_contextual_keyword(CSharp4Parser.On_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#operator_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOperator_body(CSharp4Parser.Operator_bodyContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#operator_declaration}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOperator_declaration(CSharp4Parser.Operator_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#operator_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOperator_declaration2(CSharp4Parser.Operator_declaration2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#operator_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOperator_declarator(CSharp4Parser.Operator_declaratorContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#operator_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOperator_modifier(CSharp4Parser.Operator_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#operator_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOperator_modifier_unsafe(CSharp4Parser.Operator_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#operator_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOperator_modifiers(CSharp4Parser.Operator_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#orderby_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOrderby_clause(CSharp4Parser.Orderby_clauseContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#orderby_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOrderby_contextual_keyword(CSharp4Parser.Orderby_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#ordering}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOrdering(CSharp4Parser.OrderingContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#ordering_direction}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOrdering_direction(CSharp4Parser.Ordering_directionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#orderings}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOrderings(CSharp4Parser.OrderingsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#overloadable_binary_operator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOverloadable_binary_operator(CSharp4Parser.Overloadable_binary_operatorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#overloadable_operator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOverloadable_operator(CSharp4Parser.Overloadable_operatorContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#overloadable_unary_operator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitOverloadable_unary_operator(CSharp4Parser.Overloadable_unary_operatorContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#parameter_array}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitParameter_array(CSharp4Parser.Parameter_arrayContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#parameter_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitParameter_modifier(CSharp4Parser.Parameter_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#parenthesized_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitParenthesized_expression(CSharp4Parser.Parenthesized_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#partial_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPartial_contextual_keyword(CSharp4Parser.Partial_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#pointer_indirection_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPointer_indirection_expression(CSharp4Parser.Pointer_indirection_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#pointer_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPointer_type(CSharp4Parser.Pointer_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#positional_argument}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPositional_argument(CSharp4Parser.Positional_argumentContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#positional_argument_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPositional_argument_list(CSharp4Parser.Positional_argument_listContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#pre_decrement_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPre_decrement_expression(CSharp4Parser.Pre_decrement_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#pre_increment_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPre_increment_expression(CSharp4Parser.Pre_increment_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#predefined_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPredefined_type(CSharp4Parser.Predefined_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#primary_constraint}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPrimary_constraint(CSharp4Parser.Primary_constraintContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#primary_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPrimary_expression(CSharp4Parser.Primary_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#primary_expression_start}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPrimary_expression_start(CSharp4Parser.Primary_expression_startContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#primary_no_array_creation_expression_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitPrimary_no_array_creation_expression_unsafe(
            CSharp4Parser.Primary_no_array_creation_expression_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#property_declaration}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitProperty_declaration(CSharp4Parser.Property_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#property_declaration2}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitProperty_declaration2(CSharp4Parser.Property_declaration2Context ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#property_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitProperty_modifier(CSharp4Parser.Property_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#property_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitProperty_modifier_unsafe(CSharp4Parser.Property_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#property_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitProperty_modifiers(CSharp4Parser.Property_modifiersContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#qualified_alias_member}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitQualified_alias_member(CSharp4Parser.Qualified_alias_memberContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#qualified_identifier}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitQualified_identifier(CSharp4Parser.Qualified_identifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#query_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitQuery_body(CSharp4Parser.Query_bodyContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#query_body_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitQuery_body_clause(CSharp4Parser.Query_body_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#query_body_clauses}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitQuery_body_clauses(CSharp4Parser.Query_body_clausesContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#query_continuation}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitQuery_continuation(CSharp4Parser.Query_continuationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#query_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitQuery_expression(CSharp4Parser.Query_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#rank_specifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRank_specifier(CSharp4Parser.Rank_specifierContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#rank_specifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRank_specifiers(CSharp4Parser.Rank_specifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#reference_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitReference_type(CSharp4Parser.Reference_typeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#relational_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRelational_expression(CSharp4Parser.Relational_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#remove_accessor_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRemove_accessor_declaration(CSharp4Parser.Remove_accessor_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#remove_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRemove_contextual_keyword(CSharp4Parser.Remove_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#resource_acquisition}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitResource_acquisition(CSharp4Parser.Resource_acquisitionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#return_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitReturn_statement(CSharp4Parser.Return_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#return_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitReturn_type(CSharp4Parser.Return_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#right_arrow}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRight_arrow(CSharp4Parser.Right_arrowContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#right_shift}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRight_shift(CSharp4Parser.Right_shiftContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#right_shift_assignment}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitRight_shift_assignment(CSharp4Parser.Right_shift_assignmentContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#scan_for_cast_generic_precedence}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitScan_for_cast_generic_precedence(CSharp4Parser.Scan_for_cast_generic_precedenceContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#scan_for_shift_generic_precedence}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitScan_for_shift_generic_precedence(CSharp4Parser.Scan_for_shift_generic_precedenceContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#secondary_constraints}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSecondary_constraints(CSharp4Parser.Secondary_constraintsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#select_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSelect_clause(CSharp4Parser.Select_clauseContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#select_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSelect_contextual_keyword(CSharp4Parser.Select_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#select_or_group_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSelect_or_group_clause(CSharp4Parser.Select_or_group_clauseContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#selection_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSelection_statement(CSharp4Parser.Selection_statementContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#set_accessor_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSet_accessor_declaration(CSharp4Parser.Set_accessor_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#set_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSet_contextual_keyword(CSharp4Parser.Set_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#shift_disambiguation_token}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitShift_disambiguation_token(CSharp4Parser.Shift_disambiguation_tokenContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#shift_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitShift_expression(CSharp4Parser.Shift_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#simple_embedded_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSimple_embedded_statement(CSharp4Parser.Simple_embedded_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#simple_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSimple_name(CSharp4Parser.Simple_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#simple_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSimple_type(CSharp4Parser.Simple_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#sizeof_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSizeof_expression(CSharp4Parser.Sizeof_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#specific_catch_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSpecific_catch_clause(CSharp4Parser.Specific_catch_clauseContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#specific_catch_clauses}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSpecific_catch_clauses(CSharp4Parser.Specific_catch_clausesContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#stackalloc_initializer}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStackalloc_initializer(CSharp4Parser.Stackalloc_initializerContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatement(CSharp4Parser.StatementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#statement_expression}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatement_expression(CSharp4Parser.Statement_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#statement_expression_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatement_expression_list(CSharp4Parser.Statement_expression_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#statement_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatement_list(CSharp4Parser.Statement_listContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#static_constructor_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatic_constructor_body(CSharp4Parser.Static_constructor_bodyContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#static_constructor_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatic_constructor_declaration(CSharp4Parser.Static_constructor_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#static_constructor_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatic_constructor_modifiers(CSharp4Parser.Static_constructor_modifiersContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#static_constructor_modifiers_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStatic_constructor_modifiers_unsafe(CSharp4Parser.Static_constructor_modifiers_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#struct_body}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_body(CSharp4Parser.Struct_bodyContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#struct_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_declaration(CSharp4Parser.Struct_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#struct_definition}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_definition(CSharp4Parser.Struct_definitionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#struct_interfaces}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_interfaces(CSharp4Parser.Struct_interfacesContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#struct_member_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_member_declaration(CSharp4Parser.Struct_member_declarationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#struct_member_declaration_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_member_declaration_unsafe(CSharp4Parser.Struct_member_declaration_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#struct_member_declarations}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_member_declarations(CSharp4Parser.Struct_member_declarationsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#struct_modifier}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_modifier(CSharp4Parser.Struct_modifierContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#struct_modifier_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_modifier_unsafe(CSharp4Parser.Struct_modifier_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#struct_modifiers}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitStruct_modifiers(CSharp4Parser.Struct_modifiersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#switch_block}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSwitch_block(CSharp4Parser.Switch_blockContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#switch_label}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSwitch_label(CSharp4Parser.Switch_labelContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#switch_labels}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSwitch_labels(CSharp4Parser.Switch_labelsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#switch_section}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSwitch_section(CSharp4Parser.Switch_sectionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#switch_sections}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSwitch_sections(CSharp4Parser.Switch_sectionsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#switch_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitSwitch_statement(CSharp4Parser.Switch_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#this_access}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitThis_access(CSharp4Parser.This_accessContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#throw_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitThrow_statement(CSharp4Parser.Throw_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#try_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitTry_statement(CSharp4Parser.Try_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType(CSharp4Parser.TypeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#type_argument}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_argument(CSharp4Parser.Type_argumentContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#type_argument_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_argument_list(CSharp4Parser.Type_argument_listContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#type_argument_list_opt}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_argument_list_opt(CSharp4Parser.Type_argument_list_optContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#type_arguments}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_arguments(CSharp4Parser.Type_argumentsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#type_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_declaration(CSharp4Parser.Type_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#type_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_name(CSharp4Parser.Type_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#type_parameter}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_parameter(CSharp4Parser.Type_parameterContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#type_parameter_constraints}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_parameter_constraints(CSharp4Parser.Type_parameter_constraintsContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#type_parameter_constraints_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_parameter_constraints_clause(CSharp4Parser.Type_parameter_constraints_clauseContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#type_parameter_constraints_clauses}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_parameter_constraints_clauses(CSharp4Parser.Type_parameter_constraints_clausesContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#type_parameter_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_parameter_list(CSharp4Parser.Type_parameter_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#type_parameters}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_parameters(CSharp4Parser.Type_parametersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#type_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_unsafe(CSharp4Parser.Type_unsafeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#type_void}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitType_void(CSharp4Parser.Type_voidContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#typed_member_declaration}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitTyped_member_declaration(CSharp4Parser.Typed_member_declarationContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#typeof_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitTypeof_expression(CSharp4Parser.Typeof_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#unary_expression}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnary_expression(CSharp4Parser.Unary_expressionContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#unary_expression_unsafe}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnary_expression_unsafe(CSharp4Parser.Unary_expression_unsafeContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#unary_operator_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnary_operator_declarator(CSharp4Parser.Unary_operator_declaratorContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#unbound_type_name}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnbound_type_name(CSharp4Parser.Unbound_type_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#unchecked_expression}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnchecked_expression(CSharp4Parser.Unchecked_expressionContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#unchecked_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnchecked_statement(CSharp4Parser.Unchecked_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#unmanaged_type}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnmanaged_type(CSharp4Parser.Unmanaged_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#unsafe_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUnsafe_statement(CSharp4Parser.Unsafe_statementContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#using_alias_directive}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUsing_alias_directive(CSharp4Parser.Using_alias_directiveContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#using_directive}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUsing_directive(CSharp4Parser.Using_directiveContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#using_directives}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUsing_directives(CSharp4Parser.Using_directivesContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#using_namespace_directive}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUsing_namespace_directive(CSharp4Parser.Using_namespace_directiveContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#using_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitUsing_statement(CSharp4Parser.Using_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#variable_declarator}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariable_declarator(CSharp4Parser.Variable_declaratorContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#variable_declarators}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariable_declarators(CSharp4Parser.Variable_declaratorsContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#variable_initializer}
     * .
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariable_initializer(CSharp4Parser.Variable_initializerContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#variable_initializer_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariable_initializer_list(CSharp4Parser.Variable_initializer_listContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#variable_reference}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariable_reference(CSharp4Parser.Variable_referenceContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#variance_annotation}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariance_annotation(CSharp4Parser.Variance_annotationContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#variant_type_parameter_list}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariant_type_parameter_list(CSharp4Parser.Variant_type_parameter_listContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#variant_type_parameters}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitVariant_type_parameters(CSharp4Parser.Variant_type_parametersContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#where_clause}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitWhere_clause(CSharp4Parser.Where_clauseContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#where_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitWhere_contextual_keyword(CSharp4Parser.Where_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#while_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitWhile_statement(CSharp4Parser.While_statementContext ctx);

    /**
     * Visit a parse tree produced by
     * {@link CSharp4Parser#yield_contextual_keyword}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitYield_contextual_keyword(CSharp4Parser.Yield_contextual_keywordContext ctx);

    /**
     * Visit a parse tree produced by {@link CSharp4Parser#yield_statement}.
     * 
     * @param ctx
     *            the parse tree
     * @return the visitor result
     */
    T visitYield_statement(CSharp4Parser.Yield_statementContext ctx);
}