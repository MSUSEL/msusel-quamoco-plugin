package net.siliconcode.sonar.quamoco.metrics.java;

import java.util.Stack;
import org.easymock.classextension.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.Token;
import net.siliconcode.sonar.quamoco.code.CodeEntity;

/**
 * The class <code>JavaMemberExtractorTest</code> contains tests for the class <code>{@link JavaMemberExtractor}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:48 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class JavaMemberExtractorTest {
    /**
     * Run the JavaMemberExtractor() constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testJavaMemberExtractor_1()
        throws Exception
    {

        JavaMemberExtractor result = new JavaMemberExtractor();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getContext());
        fail("unverified");
    }

    /**
     * Run the int getLinesOfCode(AstNode) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testGetLinesOfCode_1()
        throws Exception
    {
        JavaMemberExtractor fixture = new JavaMemberExtractor();
        fixture.stack = new Stack();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        int result = fixture.getLinesOfCode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$28d358d1.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the int getLinesOfCode(AstNode) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testGetLinesOfCode_2()
        throws Exception
    {
        JavaMemberExtractor fixture = new JavaMemberExtractor();
        fixture.stack = new Stack();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        int result = fixture.getLinesOfCode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$28d358d1.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the int getLinesOfCode(AstNode) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testGetLinesOfCode_3()
        throws Exception
    {
        JavaMemberExtractor fixture = new JavaMemberExtractor();
        fixture.stack = new Stack();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        int result = fixture.getLinesOfCode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$28d358d1.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
        assertEquals(0, result);
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
        JavaMemberExtractor fixture = new JavaMemberExtractor();
        fixture.stack = new Stack();

        fixture.init();

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void leaveFile(AstNode) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testLeaveFile_1()
        throws Exception
    {
        JavaMemberExtractor fixture = new JavaMemberExtractor();
        fixture.stack = new Stack();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.leaveFile(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$28d358d1.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
        fail("unverified");
    }

    /**
     * Run the void leaveNode(AstNode) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testLeaveNode_1()
        throws Exception
    {
        JavaMemberExtractor fixture = new JavaMemberExtractor();
        fixture.stack = new Stack();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.leaveNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$28d358d1.getType(<generated>)
        //       at com.sonar.sslr.api.AstNode.<init>(AstNode.java:53)
        fail("unverified");
    }

    /**
     * Run the void visitFile(AstNode) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    @Test
    public void testVisitFile_1()
        throws Exception
    {
        JavaMemberExtractor fixture = new JavaMemberExtractor();
        fixture.stack = new Stack();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitFile(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$28d358d1.getType(<generated>)
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
    public void testVisitNode_1()
        throws Exception
    {
        JavaMemberExtractor fixture = new JavaMemberExtractor();
        fixture.stack = new Stack();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$28d358d1.getType(<generated>)
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
        JavaMemberExtractor fixture = new JavaMemberExtractor();
        fixture.stack = new Stack();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$28d358d1.getType(<generated>)
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
        JavaMemberExtractor fixture = new JavaMemberExtractor();
        fixture.stack = new Stack();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$28d358d1.getType(<generated>)
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
        JavaMemberExtractor fixture = new JavaMemberExtractor();
        fixture.stack = new Stack();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$28d358d1.getType(<generated>)
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
        JavaMemberExtractor fixture = new JavaMemberExtractor();
        fixture.stack = new Stack();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$28d358d1.getType(<generated>)
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
        JavaMemberExtractor fixture = new JavaMemberExtractor();
        fixture.stack = new Stack();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$28d358d1.getType(<generated>)
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
        JavaMemberExtractor fixture = new JavaMemberExtractor();
        fixture.stack = new Stack();
        AstNode astNode = new AstNode(EasyMock.createNiceMock(Token.class));

        fixture.visitNode(astNode);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getType()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at org.easymock.classextension.internal.ClassProxyFactory$1.intercept(ClassProxyFactory.java:79)
        //       at com.sonar.sslr.api.Token$$EnhancerByCGLIB$$28d358d1.getType(<generated>)
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
        new org.junit.runner.JUnitCore().run(JavaMemberExtractorTest.class);
    }
}