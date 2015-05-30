package net.siliconcode.sonar.quamoco.metrics;

import org.junit.*;
import static org.junit.Assert.*;
import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.Token;

/**
 * The class <code>CSharpPrintVisitorTest</code> contains tests for the class <code>{@link CSharpPrintVisitor}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:45 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class CSharpPrintVisitorTest {
    /**
     * Run the void visitFile(AstNode) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testVisitFile_1()
        throws Exception
    {
        CSharpPrintVisitor fixture = new CSharpPrintVisitor();
        AstNode astNode = new AstNode((Token) null);

        fixture.visitFile(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Before
    public void setUp()
        throws Exception
    {
        // TODO: add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @After
    public void tearDown()
        throws Exception
    {
        // TODO: add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(CSharpPrintVisitorTest.class);
    }
}