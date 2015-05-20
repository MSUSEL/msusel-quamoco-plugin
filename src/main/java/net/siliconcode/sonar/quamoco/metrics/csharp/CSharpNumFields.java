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
 * CSharpNumFields -
 *
 * @author isaac
 */
public class CSharpNumFields extends SquidAstVisitor<Grammar> {

    private int totalNOF = 0;

    /**
     * @return
     */
    public Measure getTotalNOF()
    {
        return new Measure<Double>(CSharpMetrics.NOS, (double) totalNOF);
    }

    /*
     * (non-Javadoc)
     * @see org.sonar.squidbridge.SquidAstVisitor#init()
     */
    @Override
    public void init()
    {
        subscribeTo(CSharpGrammar.FIELD_DECLARATION, CSharpGrammar.PROPERTY_DECLARATION);
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
        totalNOF += 1;
        super.visitNode(astNode);
    }

}
