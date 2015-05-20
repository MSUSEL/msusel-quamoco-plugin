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
 * CSharpNumMethod -
 *
 * @author isaac
 */
public class CSharpNumMethod extends SquidAstVisitor<Grammar> {

    private int totalNOM = 0;

    /**
     * @return
     */
    public Measure getTotalNOM()
    {
        return new Measure<Double>(CSharpMetrics.NOM, (double) totalNOM);
    }

    /*
     * (non-Javadoc)
     * @see org.sonar.squidbridge.SquidAstVisitor#init()
     */
    @Override
    public void init()
    {
        subscribeTo(CSharpGrammar.METHOD_DECLARATION, CSharpGrammar.GET_ACCESSOR_DECLARATION,
                CSharpGrammar.SET_ACCESSOR_DECLARATION);
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
        // Check for static methods.
        totalNOM += 1;
        super.visitNode(astNode);
    }

}
