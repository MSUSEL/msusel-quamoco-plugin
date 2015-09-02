package net.siliconcode.sonar.quamoco.decorator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import net.siliconcode.sonar.quamoco.metrics.CSharpMetrics;

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
        fixture.issueCounts = Maps.newHashMap();
        fixture.language = "cs";
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);

        Measure<Double> loc = EasyMock.createMock(Measure.class);
        Measure<Double> nom = EasyMock.createMock(Measure.class);
        Measure<Double> nof = EasyMock.createMock(Measure.class);
        Measure<Double> nos = EasyMock.createMock(Measure.class);
        Measure<Double> noc = EasyMock.createMock(Measure.class);
        Measure<Double> not = EasyMock.createMock(Measure.class);

        Metric metLoc = EasyMock.createMock(Metric.class);
        Metric metNom = EasyMock.createMock(Metric.class);
        Metric metNof = EasyMock.createMock(Metric.class);
        Metric metNos = EasyMock.createMock(Metric.class);
        Metric metNoc = EasyMock.createMock(Metric.class);
        Metric metNot = EasyMock.createMock(Metric.class);

        EasyMock.expect(metLoc.getName()).andReturn("TestLOC");
        EasyMock.expect(metNom.getName()).andReturn("TestNOM");
        EasyMock.expect(metNof.getName()).andReturn("TestNOF");
        EasyMock.expect(metNos.getName()).andReturn("TestNOS");
        EasyMock.expect(metNoc.getName()).andReturn("TestNOC");
        EasyMock.expect(metNot.getName()).andReturn("TestNOT");

        EasyMock.expect(loc.getMetric()).andReturn(metLoc);
        EasyMock.expect(nom.getMetric()).andReturn(metNom);
        EasyMock.expect(nof.getMetric()).andReturn(metNof);
        EasyMock.expect(nos.getMetric()).andReturn(metNos);
        EasyMock.expect(noc.getMetric()).andReturn(metNoc);
        EasyMock.expect(not.getMetric()).andReturn(metNot);

        EasyMock.expect(loc.getValue()).andReturn(1.0);
        EasyMock.expect(nom.getValue()).andReturn(1.0);
        EasyMock.expect(nof.getValue()).andReturn(1.0);
        EasyMock.expect(nos.getValue()).andReturn(1.0);
        EasyMock.expect(noc.getValue()).andReturn(1.0);
        EasyMock.expect(not.getValue()).andReturn(1.0);

        EasyMock.expect(context.getMeasure(CSharpMetrics.LOC)).andReturn(loc);
        EasyMock.expect(context.getMeasure(CSharpMetrics.NOM)).andReturn(nom);
        EasyMock.expect(context.getMeasure(CSharpMetrics.NOF)).andReturn(nof);
        EasyMock.expect(context.getMeasure(CSharpMetrics.NOS)).andReturn(nos);
        EasyMock.expect(context.getMeasure(CSharpMetrics.NOC)).andReturn(noc);
        EasyMock.expect(context.getMeasure(CSharpMetrics.NOT)).andReturn(not);

        EasyMock.replay(context, loc, nom, nof, nos, noc, not, metLoc, metNom, metNof, metNos, metNoc, metNot);

        fixture.collectBaseMetrics(context);

        EasyMock.verify(context, loc, nom, nof, nos, noc, not, metLoc, metNom, metNof, metNos, metNoc, metNot);

        assertFalse(fixture.measureValues.isEmpty());
        assertEquals(1.0, fixture.measureValues.get("TestLOC").doubleValue(), 0.0001);
        assertEquals(1.0, fixture.measureValues.get("TestNOM").doubleValue(), 0.0001);
        assertEquals(1.0, fixture.measureValues.get("TestNOF").doubleValue(), 0.0001);
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
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = Maps.newHashMap();
        fixture.issueCounts = Maps.newHashMap();
        fixture.language = "cs";
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

        fixture.collectIssueResults(finder, issues);

        // add additional test code here
        EasyMock.verify(finder, fxKey, scKey, fxRule, scRule, fxIssue, scIssue, otherKey, otherIssue, otherRule);

        assertFalse(fixture.issueCounts.isEmpty());
        assertEquals(2, fixture.issueCounts.keySet().size());
        assertEquals(1, fixture.issueCounts.get("test1").intValue());
        assertEquals(1, fixture.issueCounts.get("test2").intValue());
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
        fixture.issueCounts = Maps.newHashMap();
        fixture.language = "cs";
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
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = Maps.newHashMap();
        fixture.issueCounts = Maps.newHashMap();
        fixture.language = "cs";
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
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = Maps.newHashMap();
        fixture.issueCounts = Maps.newHashMap();
        fixture.language = "cs";
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
        new org.junit.runner.JUnitCore().run(CSharpDecoratorTest.class);
    }
}