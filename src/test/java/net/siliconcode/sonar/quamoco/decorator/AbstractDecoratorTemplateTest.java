package net.siliconcode.sonar.quamoco.decorator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Map;
import java.util.Set;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.issue.Issue;
import org.sonar.api.rules.RuleFinder;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.node.Node;

/**
 * The class <code>AbstractDecoratorTemplateTest</code> contains tests for the
 * class <code>{@link AbstractDecoratorTemplate}</code>.
 *
 * @generatedBy CodePro at 6/6/15 1:22 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class AbstractDecoratorTemplateTest {

    /**
     * Run the void decorate(DecoratorContext,RuleFinder,Iterable<Issue>) method
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testDecorate_1() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        RuleFinder finder = EasyMock.createMock(RuleFinder.class);
        FileSystem fs = EasyMock.createMock(FileSystem.class);
        Iterable<Issue> issues = EasyMock.createMock(Iterable.class);
        // add mock object expectations here

        EasyMock.replay(context);
        EasyMock.replay(finder);
        EasyMock.replay(issues);
        EasyMock.replay(fs);

        fixture.decorate(fs, context, finder, issues);

        // add additional test code here
        EasyMock.verify(context);
        EasyMock.verify(finder);
        EasyMock.verify(issues);
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.CSharpDecorator.collectIssueResults(CSharpDecorator.java:54)
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.decorate(AbstractDecoratorTemplate.java:65)
        fail("unverified");
    }

    /**
     * Run the String getGrade(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testGetGrade_1() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);

        double value = 1.0;

        String result = fixture.getGrade(value);

        // add additional test code here
        assertEquals("A", result);
        fail("unverified");
    }

    /**
     * Run the String getGrade(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testGetGrade_2() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        double value = 1.0;

        String result = fixture.getGrade(value);

        // add additional test code here
        assertEquals("A", result);
        fail("unverified");
    }

    /**
     * Run the String getGrade(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testGetGrade_3() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        double value = 1.0;

        String result = fixture.getGrade(value);

        // add additional test code here
        assertEquals("A", result);
        fail("unverified");
    }

    /**
     * Run the Map<String, String> getGrades(Map<String,Double>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testGetGrades_1() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        Map<String, Double> valueMap = EasyMock.createMock(Map.class);
        // add mock object expectations here

        EasyMock.replay(valueMap);

        Map<String, String> result = fixture.getGrades(valueMap);

        // add additional test code here
        EasyMock.verify(valueMap);
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.getGrades(AbstractDecoratorTemplate.java:187)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the Map<String, String> getGrades(Map<String,Double>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testGetGrades_2() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        Map<String, Double> valueMap = EasyMock.createMock(Map.class);
        // add mock object expectations here

        EasyMock.replay(valueMap);

        Map<String, String> result = fixture.getGrades(valueMap);

        // add additional test code here
        EasyMock.verify(valueMap);
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.getGrades(AbstractDecoratorTemplate.java:187)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the Map<String, Double> getValues(DirectedSparseGraph<Node,Edge>,Set
     * <String>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testGetValues_1() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        Set<String> keys = EasyMock.createMock(Set.class);
        // add mock object expectations here

        EasyMock.replay(keys);

        Map<String, Double> result = fixture.getValues(graph, keys);

        // add additional test code here
        EasyMock.verify(keys);
        assertNotNull(result);
        assertEquals(0, result.size());
        fail("unverified");
    }

    /**
     * Run the Map<String, Double> getValues(DirectedSparseGraph<Node,Edge>,Set
     * <String>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testGetValues_2() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        Set<String> keys = EasyMock.createMock(Set.class);
        // add mock object expectations here

        EasyMock.replay(keys);

        Map<String, Double> result = fixture.getValues(graph, keys);

        // add additional test code here
        EasyMock.verify(keys);
        assertNotNull(result);
        assertEquals(0, result.size());
        fail("unverified");
    }

    /**
     * Run the Map<String, Double> getValues(DirectedSparseGraph<Node,Edge>,Set
     * <String>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testGetValues_3() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        Set<String> keys = EasyMock.createMock(Set.class);
        // add mock object expectations here

        EasyMock.replay(keys);

        Map<String, Double> result = fixture.getValues(graph, keys);

        // add additional test code here
        EasyMock.verify(keys);
        assertNotNull(result);
        assertEquals(0, result.size());
        fail("unverified");
    }

    /**
     * Run the Map<String, Double> getValues(DirectedSparseGraph<Node,Edge>,Set
     * <String>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testGetValues_4() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        Set<String> keys = EasyMock.createMock(Set.class);
        // add mock object expectations here

        EasyMock.replay(keys);

        Map<String, Double> result = fixture.getValues(graph, keys);

        // add additional test code here
        EasyMock.verify(keys);
        assertNotNull(result);
        assertEquals(0, result.size());
        fail("unverified");
    }

    /**
     * Run the void incrementCount(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testIncrementCount_1() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        String key = "";

        // fixture.incrementCount(key);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.IllegalStateException: missing behavior definition for the
        // preceding method call containsKey("")
        // at
        // org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        // at
        // org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        // at com.sun.proxy.$Proxy101.put(Unknown Source)
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.incrementCount(AbstractDecoratorTemplate.java:138)
        fail("unverified");
    }

    /**
     * Run the void incrementCount(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testIncrementCount_2() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        String key = "";

        // fixture.incrementCount(key);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.IllegalStateException: missing behavior definition for the
        // preceding method call containsKey("")
        // at
        // org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        // at
        // org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        // at com.sun.proxy.$Proxy101.put(Unknown Source)
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.incrementCount(AbstractDecoratorTemplate.java:138)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_1() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_2() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);

        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_3() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_4() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_5() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_6() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_7() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_8() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_9() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_10() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_11() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_12() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_13() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_14() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_15() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void linkToGraph(DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testLinkToGraph_16() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        // fixture.linkToGraph(graph);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate.linkToGraph(AbstractDecoratorTemplate.java:153)
        fail("unverified");
    }

    /**
     * Run the void updateMeasuresMap(Measure<Double>[]) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testUpdateMeasuresMap_1() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);

        fixture.updateMeasuresMap();

        // add additional test code here
        fail("unverified");
    }

    /**
     * Run the void updateMeasuresMap(Measure<Double>[]) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testUpdateMeasuresMap_2() throws Exception
    {
        CSharpDecorator fixture = new CSharpDecorator();
        fixture.measureValues = EasyMock.createNiceMock(Map.class);

        fixture.updateMeasuresMap();

        // add additional test code here
        fail("unverified");
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
        new org.junit.runner.JUnitCore().run(AbstractDecoratorTemplateTest.class);
    }
}