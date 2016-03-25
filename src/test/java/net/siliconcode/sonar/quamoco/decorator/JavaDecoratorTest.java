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
	public void testCollectBaseMetrics_1() throws Exception {
		final AbstractDecoratorTemplate fixture = new JavaDecorator();
		fixture.measureValues = Maps.newHashMap();
		final DecoratorContext context = org.easymock.EasyMock.createMock(DecoratorContext.class);

		org.easymock.EasyMock.replay(context);

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
		final AbstractDecoratorTemplate fixture = new JavaDecorator();
		fixture.measureValues = Maps.newHashMap();
		final RuleFinder finder = org.easymock.EasyMock.createMock(RuleFinder.class);
		final List<Issue> issues = Lists.newArrayList();

		final RuleKey fbKey = org.easymock.EasyMock.createMock(RuleKey.class);
		org.easymock.EasyMock.expect(fbKey.repository()).andReturn("findbugs").atLeastOnce();

		final RuleKey fbcKey = org.easymock.EasyMock.createMock(RuleKey.class);
		org.easymock.EasyMock.expect(fbcKey.repository()).andReturn("fb-contrib").atLeastOnce();

		final RuleKey pmdKey = org.easymock.EasyMock.createMock(RuleKey.class);
		org.easymock.EasyMock.expect(pmdKey.repository()).andReturn("pmd").atLeastOnce();

		final RuleKey otherKey = org.easymock.EasyMock.createMock(RuleKey.class);
		org.easymock.EasyMock.expect(otherKey.repository()).andReturn("other").atLeastOnce();

		final Rule fbRule = org.easymock.EasyMock.createMock(Rule.class);
		final Rule fbcRule = org.easymock.EasyMock.createMock(Rule.class);
		final Rule pmdRule = org.easymock.EasyMock.createMock(Rule.class);
		final Rule otherRule = org.easymock.EasyMock.createMock(Rule.class);

		org.easymock.EasyMock.expect(fbRule.getName()).andReturn("test1");
		org.easymock.EasyMock.expect(fbcRule.getName()).andReturn("test2");
		org.easymock.EasyMock.expect(pmdRule.getName()).andReturn("test3");

		org.easymock.EasyMock.replay(fbKey, fbcKey, pmdKey, fbRule, fbcRule, pmdRule, otherKey, otherRule);

		final Issue fbIssue = org.easymock.EasyMock.createNiceMock(Issue.class);
		org.easymock.EasyMock.expect(fbIssue.ruleKey()).andReturn(fbKey).atLeastOnce();

		final Issue fbcIssue = org.easymock.EasyMock.createNiceMock(Issue.class);
		org.easymock.EasyMock.expect(fbcIssue.ruleKey()).andReturn(fbcKey).atLeastOnce();

		final Issue pmdIssue = org.easymock.EasyMock.createNiceMock(Issue.class);
		org.easymock.EasyMock.expect(pmdIssue.ruleKey()).andReturn(pmdKey).atLeastOnce();

		final Issue otherIssue = org.easymock.EasyMock.createNiceMock(Issue.class);
		org.easymock.EasyMock.expect(otherIssue.ruleKey()).andReturn(otherKey).atLeastOnce();

		org.easymock.EasyMock.replay(fbIssue, fbcIssue, pmdIssue, otherIssue);
		issues.add(fbIssue);
		issues.add(fbcIssue);
		issues.add(pmdIssue);
		issues.add(otherIssue);

		org.easymock.EasyMock.expect(finder.findByKey(fbKey)).andReturn(fbRule).atLeastOnce();
		org.easymock.EasyMock.expect(finder.findByKey(fbcKey)).andReturn(fbcRule).atLeastOnce();
		org.easymock.EasyMock.expect(finder.findByKey(pmdKey)).andReturn(pmdRule).atLeastOnce();

		org.easymock.EasyMock.replay(finder);

		final String baseDir = "";
		fixture.collectIssueResults(baseDir, finder, issues);

		// add additional test code here
		org.easymock.EasyMock.verify(finder, fbKey, fbcKey, pmdKey, fbRule, fbcRule, pmdRule, fbIssue, fbcIssue,
				pmdIssue, otherKey, otherIssue, otherRule);

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
		final AbstractDecoratorTemplate fixture = new JavaDecorator();
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
		final AbstractDecoratorTemplate fixture = new JavaDecorator();
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
		final AbstractDecoratorTemplate fixture = new JavaDecorator();
		fixture.measureValues = Maps.newHashMap();
		final RuleFinder finder = null;
		final Iterable<Issue> issues = Lists.newArrayList();
		final String basedir = "";

		try {
			fixture.collectIssueResults(basedir, finder, issues);
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
		new org.junit.runner.JUnitCore().run(JavaDecoratorTest.class);
	}
}