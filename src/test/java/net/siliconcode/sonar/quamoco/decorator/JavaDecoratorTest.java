package net.siliconcode.sonar.quamoco.decorator;

import java.util.Map;
import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.issue.Issue;
import org.sonar.api.rules.RuleFinder;

/**
 * The class <code>JavaDecoratorTest</code> contains tests for the class <code>{@link JavaDecorator}</code>.
 *
 * @generatedBy CodePro at 6/6/15 1:22 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class JavaDecoratorTest {
    /**
     * Run the void collectBaseMetrics(DecoratorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testCollectBaseMetrics_1()
        throws Exception
    {
        JavaDecorator fixture = new JavaDecorator();
        fixture.issueCounts = EasyMock.createNiceMock(Map.class);
        fixture.language = "";
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        // add mock object expectations here

        EasyMock.replay(context);

        fixture.collectBaseMetrics(context);

        // add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call getMeasure(Metric[id=<null>,key=quamoco.java.NCLOC,description=<null>,type=FLOAT,direction=1,domain=General,name=Non Comment Lines of Code,qualitative=false,userManaged=false,enabled=true,origin=JAV,worstValue=<null>,bestValue=<null>,optimizedBestValue=false,hidden=false,deleteHistoricalData=false])
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy103.getMeasure(Unknown Source)
        //       at net.siliconcode.sonar.quamoco.decorator.JavaDecorator.collectBaseMetrics(JavaDecorator.java:76)
        fail("unverified");
    }

    /**
     * Run the void collectIssueResults(RuleFinder,Iterable<Issue>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testCollectIssueResults_1()
        throws Exception
    {
        JavaDecorator fixture = new JavaDecorator();
        fixture.issueCounts = EasyMock.createNiceMock(Map.class);
        fixture.language = "";
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        RuleFinder finder = EasyMock.createMock(RuleFinder.class);
        Iterable<Issue> issues = EasyMock.createMock(Iterable.class);
        // add mock object expectations here

        EasyMock.replay(finder);
        EasyMock.replay(issues);

        fixture.collectIssueResults(finder, issues);

        // add additional test code here
        EasyMock.verify(finder);
        EasyMock.verify(issues);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.sonar.quamoco.decorator.JavaDecorator.collectIssueResults(JavaDecorator.java:54)
        fail("unverified");
    }

    /**
     * Run the void collectIssueResults(RuleFinder,Iterable<Issue>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testCollectIssueResults_2()
        throws Exception
    {
        JavaDecorator fixture = new JavaDecorator();
        fixture.issueCounts = EasyMock.createNiceMock(Map.class);
        fixture.language = "";
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        RuleFinder finder = EasyMock.createMock(RuleFinder.class);
        Iterable<Issue> issues = EasyMock.createMock(Iterable.class);
        // add mock object expectations here

        EasyMock.replay(finder);
        EasyMock.replay(issues);

        fixture.collectIssueResults(finder, issues);

        // add additional test code here
        EasyMock.verify(finder);
        EasyMock.verify(issues);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.sonar.quamoco.decorator.JavaDecorator.collectIssueResults(JavaDecorator.java:54)
        fail("unverified");
    }

    /**
     * Run the void collectIssueResults(RuleFinder,Iterable<Issue>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testCollectIssueResults_3()
        throws Exception
    {
        JavaDecorator fixture = new JavaDecorator();
        fixture.issueCounts = EasyMock.createNiceMock(Map.class);
        fixture.language = "";
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        RuleFinder finder = EasyMock.createMock(RuleFinder.class);
        Iterable<Issue> issues = EasyMock.createMock(Iterable.class);
        // add mock object expectations here

        EasyMock.replay(finder);
        EasyMock.replay(issues);

        fixture.collectIssueResults(finder, issues);

        // add additional test code here
        EasyMock.verify(finder);
        EasyMock.verify(issues);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.sonar.quamoco.decorator.JavaDecorator.collectIssueResults(JavaDecorator.java:54)
        fail("unverified");
    }

    /**
     * Run the void collectIssueResults(RuleFinder,Iterable<Issue>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testCollectIssueResults_4()
        throws Exception
    {
        JavaDecorator fixture = new JavaDecorator();
        fixture.issueCounts = EasyMock.createNiceMock(Map.class);
        fixture.language = "";
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        RuleFinder finder = EasyMock.createMock(RuleFinder.class);
        Iterable<Issue> issues = EasyMock.createMock(Iterable.class);
        // add mock object expectations here

        EasyMock.replay(finder);
        EasyMock.replay(issues);

        fixture.collectIssueResults(finder, issues);

        // add additional test code here
        EasyMock.verify(finder);
        EasyMock.verify(issues);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.sonar.quamoco.decorator.JavaDecorator.collectIssueResults(JavaDecorator.java:54)
        fail("unverified");
    }

    /**
     * Run the void collectIssueResults(RuleFinder,Iterable<Issue>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testCollectIssueResults_5()
        throws Exception
    {
        JavaDecorator fixture = new JavaDecorator();
        fixture.issueCounts = EasyMock.createNiceMock(Map.class);
        fixture.language = "";
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        RuleFinder finder = EasyMock.createMock(RuleFinder.class);
        Iterable<Issue> issues = EasyMock.createMock(Iterable.class);
        // add mock object expectations here

        EasyMock.replay(finder);
        EasyMock.replay(issues);

        fixture.collectIssueResults(finder, issues);

        // add additional test code here
        EasyMock.verify(finder);
        EasyMock.verify(issues);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.sonar.quamoco.decorator.JavaDecorator.collectIssueResults(JavaDecorator.java:54)
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Before
    public void setUp()
        throws Exception
    {
        // add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     *
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @After
    public void tearDown()
        throws Exception
    {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(JavaDecoratorTest.class);
    }
}