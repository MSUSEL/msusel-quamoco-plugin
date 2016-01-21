package net.siliconcode.sonar.quamoco.decorator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
 * The class <code>JavaDecoratorTest</code> contains tests for the class
 * <code>{@link JavaDecorator}</code>.
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
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testCollectBaseMetrics_1() throws Exception
    {
        AbstractDecoratorTemplate fixture = new JavaDecorator();
        fixture.issueCounts = Maps.newHashMap();
        fixture.language = "java";
        fixture.measureValues = Maps.newHashMap();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);

        EasyMock.replay(context);

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
        AbstractDecoratorTemplate fixture = new JavaDecorator();
        fixture.issueCounts = Maps.newHashMap();
        fixture.language = "java";
        fixture.measureValues = Maps.newHashMap();
        RuleFinder finder = EasyMock.createMock(RuleFinder.class);
        List<Issue> issues = Lists.newArrayList();

        RuleKey fbKey = EasyMock.createMock(RuleKey.class);
        EasyMock.expect(fbKey.repository()).andReturn("findbugs").atLeastOnce();

        RuleKey fbcKey = EasyMock.createMock(RuleKey.class);
        EasyMock.expect(fbcKey.repository()).andReturn("fb-contrib").atLeastOnce();

        RuleKey pmdKey = EasyMock.createMock(RuleKey.class);
        EasyMock.expect(pmdKey.repository()).andReturn("pmd").atLeastOnce();

        RuleKey otherKey = EasyMock.createMock(RuleKey.class);
        EasyMock.expect(otherKey.repository()).andReturn("other").atLeastOnce();

        Rule fbRule = EasyMock.createMock(Rule.class);
        Rule fbcRule = EasyMock.createMock(Rule.class);
        Rule pmdRule = EasyMock.createMock(Rule.class);
        Rule otherRule = EasyMock.createMock(Rule.class);

        EasyMock.expect(fbRule.getName()).andReturn("test1");
        EasyMock.expect(fbcRule.getName()).andReturn("test2");
        EasyMock.expect(pmdRule.getName()).andReturn("test3");

        EasyMock.replay(fbKey, fbcKey, pmdKey, fbRule, fbcRule, pmdRule, otherKey, otherRule);

        Issue fbIssue = EasyMock.createNiceMock(Issue.class);
        EasyMock.expect(fbIssue.ruleKey()).andReturn(fbKey).atLeastOnce();

        Issue fbcIssue = EasyMock.createNiceMock(Issue.class);
        EasyMock.expect(fbcIssue.ruleKey()).andReturn(fbcKey).atLeastOnce();

        Issue pmdIssue = EasyMock.createNiceMock(Issue.class);
        EasyMock.expect(pmdIssue.ruleKey()).andReturn(pmdKey).atLeastOnce();

        Issue otherIssue = EasyMock.createNiceMock(Issue.class);
        EasyMock.expect(otherIssue.ruleKey()).andReturn(otherKey).atLeastOnce();

        EasyMock.replay(fbIssue, fbcIssue, pmdIssue, otherIssue);
        issues.add(fbIssue);
        issues.add(fbcIssue);
        issues.add(pmdIssue);
        issues.add(otherIssue);

        EasyMock.expect(finder.findByKey(fbKey)).andReturn(fbRule).atLeastOnce();
        EasyMock.expect(finder.findByKey(fbcKey)).andReturn(fbcRule).atLeastOnce();
        EasyMock.expect(finder.findByKey(pmdKey)).andReturn(pmdRule).atLeastOnce();

        EasyMock.replay(finder);

        fixture.collectIssueResults(finder, issues);

        // add additional test code here
        EasyMock.verify(finder, fbKey, fbcKey, pmdKey, fbRule, fbcRule, pmdRule, fbIssue, fbcIssue, pmdIssue, otherKey,
                otherIssue, otherRule);

        assertFalse(fixture.issueCounts.isEmpty());
        assertEquals(3, fixture.issueCounts.keySet().size());
        assertEquals(1, fixture.issueCounts.get("test1").intValue());
        assertEquals(1, fixture.issueCounts.get("test2").intValue());
        assertEquals(1, fixture.issueCounts.get("test3").intValue());
        assertFalse(fixture.issueCounts.containsKey("test4"));
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
        AbstractDecoratorTemplate fixture = new JavaDecorator();
        fixture.issueCounts = Maps.newHashMap();
        fixture.language = "java";
        fixture.measureValues = Maps.newHashMap();
        RuleFinder finder = EasyMock.createMock(RuleFinder.class);
        Iterable<Issue> issues = Lists.newArrayList();
        // add mock object expectations here

        EasyMock.replay(finder);

        fixture.collectIssueResults(finder, issues);

        // add additional test code here
        EasyMock.verify(finder);

        assertTrue(fixture.issueCounts.isEmpty());
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
        AbstractDecoratorTemplate fixture = new JavaDecorator();
        fixture.issueCounts = Maps.newHashMap();
        fixture.language = "java";
        fixture.measureValues = Maps.newHashMap();
        RuleFinder finder = EasyMock.createMock(RuleFinder.class);
        Iterable<Issue> issues = null;

        EasyMock.replay(finder);

        EasyMock.verify(finder);

        try
        {
            fixture.collectIssueResults(finder, issues);
            assertTrue(fixture.issueCounts.isEmpty());
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
        AbstractDecoratorTemplate fixture = new JavaDecorator();
        fixture.issueCounts = Maps.newHashMap();
        fixture.language = "java";
        fixture.measureValues = Maps.newHashMap();
        RuleFinder finder = null;
        Iterable<Issue> issues = Lists.newArrayList();

        try
        {
            fixture.collectIssueResults(finder, issues);
            assertTrue(fixture.issueCounts.isEmpty());
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
        new org.junit.runner.JUnitCore().run(JavaDecoratorTest.class);
    }
}