package net.siliconcode.sonar.quamoco.decorator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import net.siliconcode.sonar.quamoco.metrics.JavaMetrics;

import org.easymock.classextension.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.issue.Issue;
import org.sonar.api.measures.Measure;
import org.sonar.api.measures.Metric;
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
        JavaDecorator fixture = new JavaDecorator();
        fixture.issueCounts = Maps.newHashMap();
        fixture.language = "java";
        fixture.measureValues = Maps.newHashMap();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);

        Measure<Double> loc = EasyMock.createMock(Measure.class);
        Measure<Double> nom = EasyMock.createMock(Measure.class);
        Measure<Double> nof = EasyMock.createMock(Measure.class);
        Measure<Double> nov = EasyMock.createMock(Measure.class);
        Measure<Double> nos = EasyMock.createMock(Measure.class);
        Measure<Double> noc = EasyMock.createMock(Measure.class);
        Measure<Double> not = EasyMock.createMock(Measure.class);

        Metric metLoc = EasyMock.createMock(Metric.class);
        Metric metNom = EasyMock.createMock(Metric.class);
        Metric metNof = EasyMock.createMock(Metric.class);
        Metric metNov = EasyMock.createMock(Metric.class);
        Metric metNos = EasyMock.createMock(Metric.class);
        Metric metNoc = EasyMock.createMock(Metric.class);
        Metric metNot = EasyMock.createMock(Metric.class);

        EasyMock.expect(metLoc.getName()).andReturn("TestLOC");
        EasyMock.expect(metNom.getName()).andReturn("TestNOM");
        EasyMock.expect(metNof.getName()).andReturn("TestNOF");
        EasyMock.expect(metNov.getName()).andReturn("TestNOV");
        EasyMock.expect(metNos.getName()).andReturn("TestNOS");
        EasyMock.expect(metNoc.getName()).andReturn("TestNOC");
        EasyMock.expect(metNot.getName()).andReturn("TestNOT");

        EasyMock.expect(loc.getMetric()).andReturn(metLoc);
        EasyMock.expect(nom.getMetric()).andReturn(metNom);
        EasyMock.expect(nof.getMetric()).andReturn(metNof);
        EasyMock.expect(nov.getMetric()).andReturn(metNov);
        EasyMock.expect(nos.getMetric()).andReturn(metNos);
        EasyMock.expect(noc.getMetric()).andReturn(metNoc);
        EasyMock.expect(not.getMetric()).andReturn(metNot);

        EasyMock.expect(loc.getValue()).andReturn(1.0);
        EasyMock.expect(nom.getValue()).andReturn(1.0);
        EasyMock.expect(nof.getValue()).andReturn(1.0);
        EasyMock.expect(nov.getValue()).andReturn(1.0);
        EasyMock.expect(nos.getValue()).andReturn(1.0);
        EasyMock.expect(noc.getValue()).andReturn(1.0);
        EasyMock.expect(not.getValue()).andReturn(1.0);

        EasyMock.expect(context.getMeasure(JavaMetrics.LOC)).andReturn(loc);
        EasyMock.expect(context.getMeasure(JavaMetrics.NOM)).andReturn(nom);
        EasyMock.expect(context.getMeasure(JavaMetrics.NOF)).andReturn(nof);
        EasyMock.expect(context.getMeasure(JavaMetrics.NOV)).andReturn(nov);
        EasyMock.expect(context.getMeasure(JavaMetrics.NOS)).andReturn(nos);
        EasyMock.expect(context.getMeasure(JavaMetrics.NOC)).andReturn(noc);
        EasyMock.expect(context.getMeasure(JavaMetrics.NOT)).andReturn(not);

        EasyMock.replay(context, loc, nom, nof, nov, nos, noc, not, metLoc, metNom, metNov, metNof, metNos, metNoc,
                metNot);

        fixture.collectBaseMetrics(context);

        EasyMock.verify(context, loc, nom, nof, nov, nos, noc, not, metLoc, metNom, metNov, metNof, metNos, metNoc,
                metNot);

        assertFalse(fixture.measureValues.isEmpty());
        assertEquals(1.0, fixture.measureValues.get("TestLOC").doubleValue(), 0.0001);
        assertEquals(1.0, fixture.measureValues.get("TestNOM").doubleValue(), 0.0001);
        assertEquals(1.0, fixture.measureValues.get("TestNOF").doubleValue(), 0.0001);
        assertEquals(1.0, fixture.measureValues.get("TestNOV").doubleValue(), 0.0001);
        assertEquals(1.0, fixture.measureValues.get("TestNOS").doubleValue(), 0.0001);
        assertEquals(1.0, fixture.measureValues.get("TestNOC").doubleValue(), 0.0001);
        assertEquals(1.0, fixture.measureValues.get("TestNOT").doubleValue(), 0.0001);
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
        JavaDecorator fixture = new JavaDecorator();
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
        JavaDecorator fixture = new JavaDecorator();
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
        JavaDecorator fixture = new JavaDecorator();
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
        JavaDecorator fixture = new JavaDecorator();
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