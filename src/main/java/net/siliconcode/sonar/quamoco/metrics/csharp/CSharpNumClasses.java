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
 * CSharpNumClasses -
 *
 * @author isaac
 */
public class CSharpNumClasses extends SquidAstVisitor<Grammar> {

    private int totalNOC = 0;

    /**
     * @return
     */
    public Measure getTotalNOC()
    {
        return new Measure<Double>(CSharpMetrics.NOC, (double) totalNOC);
    }

    /*
     * (non-Javadoc)
     * @see org.sonar.squidbridge.SquidAstVisitor#init()
     */
    @Override
    public void init()
    {
        subscribeTo(CSharpGrammar.CLASS_DECLARATION, CSharpGrammar.DELEGATE_DECLARATION,
                CSharpGrammar.INTERFACE_DECLARATION, CSharpGrammar.ENUM_DECLARATION);
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
        totalNOC += 1;
        super.visitNode(astNode);
    }

}
