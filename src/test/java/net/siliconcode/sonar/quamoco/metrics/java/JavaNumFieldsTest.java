package net.siliconcode.sonar.quamoco.metrics.java;

import org.easymock.classextension.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import org.sonar.api.measures.Measure;
import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.Token;

/**
 * The class <code>JavaNumFieldsTest</code> contains tests for the class <code>{@link JavaNumFields}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:48 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class JavaNumFieldsTest {
    /**
     * Run the JavaNumFields() constructor test.
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testJavaNumFields_1()
        throws Exception
    {
        JavaNumFields result = new JavaNumFields();
        assertNotNull(result);
    }

    /**
     * Run the Measure getTotalNOF() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testGetTotalNOF_1()
        throws Exception
    {
        JavaNumFields fixture = new JavaNumFields();

        Measure result = fixture.getTotalNOF();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getVariation5());
        assertEquals("quamoco.java.NOF", result.getMetricKey());
        assertEquals(null, result.getTendency());
        assertEquals(null, result.getAlertStatus());
        assertEquals(null, result.getVariation4());
        assertEquals(null, result.getDataAsLevel());
        assertEquals(null, result.getVariation3());
        assertEquals(null, result.getAlertText());
        assertEquals(false, result.isFromCore());
        assertEquals(null, result.getVariation2());
        assertEquals(null, result.getPersonId());
        assertEquals(null, result.getVariation1());
        assertEquals(false, result.isBestValue());
        assertEquals(null, result.getCharacteristic());
        assertEquals(new Integer(0), result.getIntValue());
        assertEquals(null, result.getDate());
        assertEquals(null, result.getData());
        assertEquals(null, result.getRequirement());
        assertEquals(null, result.getDescription());
        assertEquals(false, result.hasData());
        assertEquals(null, result.getUrl());
        assertEquals(new Double(0.0), result.value());
        assertEquals(new Double(0.0), result.getValue());
    }

    /**
     * Run the void init() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testInit_1()
        throws Exception
    {
        JavaNumFields fixture = new JavaNumFields();

        fixture.init();

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void visitNode(AstNode) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testVisitNode_1()
        throws Exception
    {
        fail("unverified");
    }

    /**
     * Run the void visitNode(AstNode) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testVisitNode_2()
        throws Exception
    {
        fail("unverified");
    }

    /**
     * Run the void visitNode(AstNode) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testVisitNode_3()
        throws Exception
    {
        fail("unverified");
    }

    /**
     * Run the void visitNode(AstNode) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testVisitNode_4()
        throws Exception
    {
        fail("unverified");
    }

    /**
     * Run the void visitNode(AstNode) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testVisitNode_5()
        throws Exception
    {
        fail("unverified");
    }

    /**
     * Run the void visitNode(AstNode) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testVisitNode_6()
        throws Exception
    {
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
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
     * @generatedBy CodePro at 5/30/15 3:48 PM
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
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(JavaNumFieldsTest.class);
    }
}