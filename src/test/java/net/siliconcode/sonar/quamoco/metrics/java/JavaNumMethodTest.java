package net.siliconcode.sonar.quamoco.metrics.java;

import org.easymock.classextension.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import org.sonar.api.measures.Measure;
import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.Token;

/**
 * The class <code>JavaNumMethodTest</code> contains tests for the class <code>{@link JavaNumMethod}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:48 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class JavaNumMethodTest {
    /**
     * Run the JavaNumMethod() constructor test.
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testJavaNumMethod_1()
        throws Exception
    {
        JavaNumMethod result = new JavaNumMethod();
        assertNotNull(result);
        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the Measure getTotalNOM() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testGetTotalNOM_1()
        throws Exception
    {
        JavaNumMethod fixture = new JavaNumMethod();

        Measure result = fixture.getTotalNOM();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getVariation5());
        assertEquals("quamoco.cs.file/CountDeclInstanceMethods", result.getMetricKey());
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
        fail("unverified");
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
        JavaNumMethod fixture = new JavaNumMethod();

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
        JavaNumMethod fixture = new JavaNumMethod();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$7922c254.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
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
        JavaNumMethod fixture = new JavaNumMethod();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$7922c254.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
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
        JavaNumMethod fixture = new JavaNumMethod();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$7922c254.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
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
        JavaNumMethod fixture = new JavaNumMethod();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$7922c254.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
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
        JavaNumMethod fixture = new JavaNumMethod();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$7922c254.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
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
        JavaNumMethod fixture = new JavaNumMethod();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$7922c254.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
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
    public void testVisitNode_7()
        throws Exception
    {
        JavaNumMethod fixture = new JavaNumMethod();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$7922c254.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
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
    public void testVisitNode_8()
        throws Exception
    {
        JavaNumMethod fixture = new JavaNumMethod();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$7922c254.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
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
    public void testVisitNode_9()
        throws Exception
    {
        JavaNumMethod fixture = new JavaNumMethod();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$7922c254.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
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
    public void testVisitNode_10()
        throws Exception
    {
        JavaNumMethod fixture = new JavaNumMethod();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$7922c254.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
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
    public void testVisitNode_11()
        throws Exception
    {
        JavaNumMethod fixture = new JavaNumMethod();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$7922c254.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
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
    public void testVisitNode_12()
        throws Exception
    {
        JavaNumMethod fixture = new JavaNumMethod();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$7922c254.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
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
    public void testVisitNode_13()
        throws Exception
    {
        JavaNumMethod fixture = new JavaNumMethod();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$7922c254.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
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
    public void testVisitNode_14()
        throws Exception
    {
        JavaNumMethod fixture = new JavaNumMethod();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$7922c254.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
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
    public void testVisitNode_15()
        throws Exception
    {
        JavaNumMethod fixture = new JavaNumMethod();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$7922c254.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
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
        new org.junit.runner.JUnitCore().run(JavaNumMethodTest.class);
    }
}