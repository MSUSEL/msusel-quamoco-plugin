/**
 *
 */
package net.siliconcode.sonar.quamoco.metrics.csharp;

import net.siliconcode.sonar.quamoco.metrics.CSharpMetrics;

import org.sonar.api.measures.Measure;
import org.sonar.squidbridge.SquidAstVisitor;

import com.sonar.csharp.squid.parser.CSharpGrammar;
import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.Grammar;

/**
 * CSharpNumStmts -
 *
 * @author isaac
 */
public class CSharpNumStmts extends SquidAstVisitor<Grammar> {

    private int totalNOS = 0;

    /**
     * @return
     */
    public Measure getTotalNOS()
    {
        return new Measure<Double>(CSharpMetrics.NOS, (double) totalNOS);
    }

    @Override
    public void init()
    {
        subscribeTo(CSharpGrammar.STATEMENT, CSharpGrammar.EMBEDDED_STATEMENT, CSharpGrammar.BLOCK,
                CSharpGrammar.LABELED_STATEMENT, CSharpGrammar.DECLARATION_STATEMENT,
                CSharpGrammar.LOCAL_VARIABLE_DECLARATION, CSharpGrammar.LOCAL_VARIABLE_DECLARATOR,
                CSharpGrammar.LOCAL_VARIABLE_INITIALIZER, CSharpGrammar.LOCAL_CONSTANT_DECLARATION,
                CSharpGrammar.CONSTANT_DECLARATOR, CSharpGrammar.EXPRESSION_STATEMENT,
                CSharpGrammar.STATEMENT_EXPRESSION, CSharpGrammar.SELECTION_STATEMENT, CSharpGrammar.IF_STATEMENT,
                CSharpGrammar.SWITCH_STATEMENT, CSharpGrammar.SWITCH_SECTION, CSharpGrammar.SWITCH_LABEL,
                CSharpGrammar.ITERATION_STATEMENT, CSharpGrammar.WHILE_STATEMENT, CSharpGrammar.DO_STATEMENT,
                CSharpGrammar.FOR_STATEMENT, CSharpGrammar.FOR_INITIALIZER, CSharpGrammar.FOR_CONDITION,
                CSharpGrammar.FOR_ITERATOR, CSharpGrammar.STATEMENT_EXPRESSION_LIST, CSharpGrammar.FOREACH_STATEMENT,
                CSharpGrammar.JUMP_STATEMENT, CSharpGrammar.BREAK_STATEMENT, CSharpGrammar.CONTINUE_STATEMENT,
                CSharpGrammar.GOTO_STATEMENT, CSharpGrammar.RETURN_STATEMENT, CSharpGrammar.THROW_STATEMENT,
                CSharpGrammar.TRY_STATEMENT, CSharpGrammar.CATCH_CLAUSES, CSharpGrammar.SPECIFIC_CATCH_CLAUSE,
                CSharpGrammar.GENERAL_CATCH_CLAUSE, CSharpGrammar.FINALLY_CLAUSE, CSharpGrammar.CHECKED_STATEMENT,
                CSharpGrammar.UNCHECKED_STATEMENT, CSharpGrammar.LOCK_STATEMENT, CSharpGrammar.USING_STATEMENT,
                CSharpGrammar.RESOURCE_ACQUISITION, CSharpGrammar.YIELD_STATEMENT, CSharpGrammar.NAMESPACE_DECLARATION,
                CSharpGrammar.QUALIFIED_IDENTIFIER, CSharpGrammar.NAMESPACE_BODY, CSharpGrammar.EXTERN_ALIAS_DIRECTIVE,
                CSharpGrammar.USING_DIRECTIVE, CSharpGrammar.USING_ALIAS_DIRECTIVE,
                CSharpGrammar.USING_NAMESPACE_DIRECTIVE, CSharpGrammar.NAMESPACE_MEMBER_DECLARATION,
                CSharpGrammar.TYPE_DECLARATION, CSharpGrammar.QUALIFIED_ALIAS_MEMBER);
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.squidbridge.SquidAstVisitor#visitNode(com.sonar.sslr.api.AstNode
     * )
     */
    @Override
    public void visitNode(final AstNode astNode)
    {
        totalNOS += 1;

        super.visitNode(astNode);
    }
}
