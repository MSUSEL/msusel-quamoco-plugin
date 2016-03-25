package net.siliconcode.sonar.quamoco.decorator;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
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
	public void testCollectBaseMetrics_1() throws Exception {
		final CSharpDecorator fixture = new CSharpDecorator();
		fixture.measureValues = Maps.newHashMap();
		final DecoratorContext context = org.easymock.EasyMock.createMock(DecoratorContext.class);

		fixture.collectBaseMetrics(context);

		org.easymock.EasyMock.verify(context);

		Assert.assertFalse(fixture.measureValues.isEmpty());
	}

	/**
	 * Run the void collectIssueResults(RuleFinder,Iterable<Issue>) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:22 PM
	 */
	@Test
	public void testCollectIssueResults_1() throws Exception {
		final CSharpDecorator fixture = new CSharpDecorator();
		fixture.measureValues = Maps.newHashMap();
		final RuleFinder finder = org.easymock.EasyMock.createMock(RuleFinder.class);
		final List<Issue> issues = Lists.newArrayList();

		final RuleKey fxKey = org.easymock.EasyMock.createMock(RuleKey.class);
		org.easymock.EasyMock.expect(fxKey.repository()).andReturn("fxcop").atLeastOnce();

		final RuleKey scKey = org.easymock.EasyMock.createMock(RuleKey.class);
		org.easymock.EasyMock.expect(scKey.repository()).andReturn("stylecop").atLeastOnce();

		final RuleKey otherKey = org.easymock.EasyMock.createMock(RuleKey.class);
		org.easymock.EasyMock.expect(otherKey.repository()).andReturn("other").atLeastOnce();

		final Rule fxRule = org.easymock.EasyMock.createMock(Rule.class);
		final Rule scRule = org.easymock.EasyMock.createMock(Rule.class);
		final Rule otherRule = org.easymock.EasyMock.createMock(Rule.class);

		org.easymock.EasyMock.expect(fxRule.getName()).andReturn("test1");
		org.easymock.EasyMock.expect(scRule.getName()).andReturn("test2");

		org.easymock.EasyMock.replay(fxKey, scKey, fxRule, scRule, otherKey, otherRule);

		final Issue fxIssue = org.easymock.EasyMock.createNiceMock(Issue.class);
		org.easymock.EasyMock.expect(fxIssue.ruleKey()).andReturn(fxKey).atLeastOnce();

		final Issue scIssue = org.easymock.EasyMock.createNiceMock(Issue.class);
		org.easymock.EasyMock.expect(scIssue.ruleKey()).andReturn(scKey).atLeastOnce();

		final Issue otherIssue = org.easymock.EasyMock.createNiceMock(Issue.class);
		org.easymock.EasyMock.expect(otherIssue.ruleKey()).andReturn(otherKey).atLeastOnce();

		org.easymock.EasyMock.replay(fxIssue, scIssue, otherIssue);
		issues.add(fxIssue);
		issues.add(scIssue);
		issues.add(otherIssue);

		org.easymock.EasyMock.expect(finder.findByKey(fxKey)).andReturn(fxRule).atLeastOnce();
		org.easymock.EasyMock.expect(finder.findByKey(scKey)).andReturn(scRule).atLeastOnce();

		org.easymock.EasyMock.replay(finder);

		final String baseDir = "";
		fixture.collectIssueResults(baseDir, finder, issues);

		// add additional test code here
		org.easymock.EasyMock.verify(finder, fxKey, scKey, fxRule, scRule, fxIssue, scIssue, otherKey, otherIssue,
				otherRule);

		Assert.fail();
	}

	/**
	 * Run the void collectIssueResults(RuleFinder,Iterable<Issue>) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:22 PM
	 */
	@Test
	public void testCollectIssueResults_2() throws Exception {
		final CSharpDecorator fixture = new CSharpDecorator();
		fixture.measureValues = Maps.newHashMap();
		final RuleFinder finder = org.easymock.EasyMock.createMock(RuleFinder.class);
		final Iterable<Issue> issues = Lists.newArrayList();
		// add mock object expectations here

		org.easymock.EasyMock.replay(finder);

		final String baseDir = "";
		fixture.collectIssueResults(baseDir, finder, issues);

		// add additional test code here
		org.easymock.EasyMock.verify(finder);

		Assert.fail();
	}

	/**
	 * Run the void collectIssueResults(RuleFinder,Iterable<Issue>) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:22 PM
	 */
	@Test
	public void testCollectIssueResults_3() throws Exception {
		final CSharpDecorator fixture = new CSharpDecorator();
		fixture.measureValues = Maps.newHashMap();
		final RuleFinder finder = org.easymock.EasyMock.createMock(RuleFinder.class);
		final Iterable<Issue> issues = null;

		org.easymock.EasyMock.replay(finder);

		org.easymock.EasyMock.verify(finder);

		try {
			final String baseDir = "";
			fixture.collectIssueResults(baseDir, finder, issues);
			Assert.fail();
		} catch (final NullPointerException npe) {
			Assert.fail();
		}
	}

	/**
	 * Run the void collectIssueResults(RuleFinder,Iterable<Issue>) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 6/6/15 1:22 PM
	 */
	@Test
	public void testCollectIssueResults_4() throws Exception {
		final CSharpDecorator fixture = new CSharpDecorator();
		fixture.measureValues = Maps.newHashMap();
		final RuleFinder finder = null;
		final Iterable<Issue> issues = Lists.newArrayList();

		try {
			final String baseDir = "";
			fixture.collectIssueResults(baseDir, finder, issues);
			Assert.fail();
		} catch (final NullPointerException npe) {
			Assert.fail();
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
	public void setUp() throws Exception {
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
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 * @generatedBy CodePro at 6/6/15 1:22 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(CSharpDecoratorTest.class);
	}
}