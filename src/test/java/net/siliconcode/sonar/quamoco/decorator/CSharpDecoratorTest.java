package net.siliconcode.sonar.quamoco.decorator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import java.util.List;

import org.easymock.classextension.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.issue.Issue;
import org.sonar.api.rule.RuleKey;
import org.sonar.api.rules.Rule;
import org.sonar.api.rules.RuleFinder;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * The class <code>CSharpDecoratorTest</code> contains tests for the class
 * <code>{@link CSharpDecorator}</code>.
 *
 * @generatedBy CodePro at 6/6/15 1:22 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class CSharpDecoratorTest {

    /**
     * Run the void collectBaseMetrics(DecoratorContext) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testCollectBaseMetrics_1() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = Maps.newHashMap();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);

        fixture.collectBaseMetrics(context);

        EasyMock.verify(context);

        assertFalse(fixture.measureValues.isEmpty());
    }

    /**
     * Run the void collectIssueResults(RuleFinder,Iterable<Issue>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testCollectIssueResults_1() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = Maps.newHashMap();
        RuleFinder finder = EasyMock.createMock(RuleFinder.class);
        List<Issue> issues = Lists.newArrayList();

        RuleKey fxKey = EasyMock.createMock(RuleKey.class);
        EasyMock.expect(fxKey.repository()).andReturn("fxcop").atLeastOnce();

        RuleKey scKey = EasyMock.createMock(RuleKey.class);
        EasyMock.expect(scKey.repository()).andReturn("stylecop").atLeastOnce();

        RuleKey otherKey = EasyMock.createMock(RuleKey.class);
        EasyMock.expect(otherKey.repository()).andReturn("other").atLeastOnce();

        Rule fxRule = EasyMock.createMock(Rule.class);
        Rule scRule = EasyMock.createMock(Rule.class);
        Rule otherRule = EasyMock.createMock(Rule.class);

        EasyMock.expect(fxRule.getName()).andReturn("test1");
        EasyMock.expect(scRule.getName()).andReturn("test2");

        EasyMock.replay(fxKey, scKey, fxRule, scRule, otherKey, otherRule);

        Issue fxIssue = EasyMock.createNiceMock(Issue.class);
        EasyMock.expect(fxIssue.ruleKey()).andReturn(fxKey).atLeastOnce();

        Issue scIssue = EasyMock.createNiceMock(Issue.class);
        EasyMock.expect(scIssue.ruleKey()).andReturn(scKey).atLeastOnce();

        Issue otherIssue = EasyMock.createNiceMock(Issue.class);
        EasyMock.expect(otherIssue.ruleKey()).andReturn(otherKey).atLeastOnce();

        EasyMock.replay(fxIssue, scIssue, otherIssue);
        issues.add(fxIssue);
        issues.add(scIssue);
        issues.add(otherIssue);

        EasyMock.expect(finder.findByKey(fxKey)).andReturn(fxRule).atLeastOnce();
        EasyMock.expect(finder.findByKey(scKey)).andReturn(scRule).atLeastOnce();

        EasyMock.replay(finder);

        String baseDir = "";
        fixture.collectIssueResults(baseDir, finder, issues);

        // add additional test code here
        EasyMock.verify(finder, fxKey, scKey, fxRule, scRule, fxIssue, scIssue, otherKey, otherIssue, otherRule);

        fail();
    }

    /**
     * Run the void collectIssueResults(RuleFinder,Iterable<Issue>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testCollectIssueResults_2() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = Maps.newHashMap();
        RuleFinder finder = EasyMock.createMock(RuleFinder.class);
        Iterable<Issue> issues = Lists.newArrayList();
        // add mock object expectations here

        EasyMock.replay(finder);

        String baseDir = "";
        fixture.collectIssueResults(baseDir, finder, issues);

        // add additional test code here
        EasyMock.verify(finder);

        fail();
    }

    /**
     * Run the void collectIssueResults(RuleFinder,Iterable<Issue>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testCollectIssueResults_3() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = Maps.newHashMap();
        RuleFinder finder = EasyMock.createMock(RuleFinder.class);
        Iterable<Issue> issues = null;

        EasyMock.replay(finder);

        EasyMock.verify(finder);

        try
        {
            String baseDir = "";
            fixture.collectIssueResults(baseDir, finder, issues);
            fail();
        }
        catch (NullPointerException npe)
        {
            fail();
        }
    }

    /**
     * Run the void collectIssueResults(RuleFinder,Iterable<Issue>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testCollectIssueResults_4() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = Maps.newHashMap();
        RuleFinder finder = null;
        Iterable<Issue> issues = Lists.newArrayList();

        try
        {
            String baseDir = "";
            fixture.collectIssueResults(baseDir, finder, issues);
            fail();
        }
        catch (NullPointerException npe)
        {
            fail();
        }
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Before
    public void setUp() throws Exception
    {
        // add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @After
    public void tearDown() throws Exception
    {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args
     *            the command line arguments
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(CSharpDecoratorTest.class);
    }
}