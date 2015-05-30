package net.siliconcode.quamoco.aggregator.strategy;

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import org.sonar.api.batch.DecoratorContext;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.FactorNode;
import net.siliconcode.quamoco.aggregator.graph.MeasureNode;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.qm.Factor;
import net.siliconcode.quamoco.aggregator.qm.Measure;

/**
 * The class <code>EvaluatorFactoryTest</code> contains tests for the class <code>{@link EvaluatorFactory}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:43 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class EvaluatorFactoryTest {
    /**
     * Run the EvaluatorFactory getInstance() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testGetInstance_1()
        throws Exception
    {

        EvaluatorFactory result = EvaluatorFactory.getInstance();

        // TODO: add additional test code here
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the void setEvaluator(FactorNode,Factor,DirectedSparseGraph<Node,Edge>,DecoratorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testSetEvaluator_1()
        throws Exception
    {
        EvaluatorFactory fixture = EvaluatorFactory.getInstance();
        FactorNode node = new FactorNode(new DirectedSparseGraph(), "", "");
        node.setMethod("");
        Factor factor = new Factor("", "", "", "", "", "", "");
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.setEvaluator(node, factor, graph, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:61)
        //       at net.siliconcode.quamoco.aggregator.strategy.EvaluatorFactory.setEvaluator(EvaluatorFactory.java:66)
        fail("unverified");
    }

    /**
     * Run the void setEvaluator(FactorNode,Factor,DirectedSparseGraph<Node,Edge>,DecoratorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testSetEvaluator_2()
        throws Exception
    {
        EvaluatorFactory fixture = EvaluatorFactory.getInstance();
        FactorNode node = new FactorNode(new DirectedSparseGraph(), "", "");
        node.setMethod("Ranking");
        Factor factor = new Factor("", "", "", "", "", "", "");
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.setEvaluator(node, factor, graph, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:61)
        //       at net.siliconcode.quamoco.aggregator.strategy.EvaluatorFactory.setEvaluator(EvaluatorFactory.java:66)
        fail("unverified");
    }

    /**
     * Run the void setEvaluator(FactorNode,Factor,DirectedSparseGraph<Node,Edge>,DecoratorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testSetEvaluator_3()
        throws Exception
    {
        EvaluatorFactory fixture = EvaluatorFactory.getInstance();
        FactorNode node = new FactorNode(new DirectedSparseGraph(), "", "");
        node.setMethod("One");
        Factor factor = new Factor("", "", "", "", "", "", "");
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.setEvaluator(node, factor, graph, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:61)
        //       at net.siliconcode.quamoco.aggregator.strategy.EvaluatorFactory.setEvaluator(EvaluatorFactory.java:66)
        fail("unverified");
    }

    /**
     * Run the void setEvaluator(FactorNode,Factor,DirectedSparseGraph<Node,Edge>,DecoratorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testSetEvaluator_4()
        throws Exception
    {
        EvaluatorFactory fixture = EvaluatorFactory.getInstance();
        FactorNode node = null;
        Factor factor = new Factor("", "", "", "", "", "", "");
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.setEvaluator(node, factor, graph, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:61)
        //       at net.siliconcode.quamoco.aggregator.strategy.EvaluatorFactory.setEvaluator(EvaluatorFactory.java:66)
        fail("unverified");
    }

    /**
     * Run the void setEvaluator(MeasureNode,Measure,DirectedSparseGraph<Node,Edge>,DecoratorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testSetEvaluator_5()
        throws Exception
    {
        EvaluatorFactory fixture = EvaluatorFactory.getInstance();
        MeasureNode node = new MeasureNode(new DirectedSparseGraph(), "", "");
        node.setType("");
        node.setMethod("Median");
        Measure measure = new Measure("", "", "", "", "", "", "", "", "");
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.setEvaluator(node, measure, graph, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:78)
        //       at net.siliconcode.quamoco.aggregator.strategy.EvaluatorFactory.setEvaluator(EvaluatorFactory.java:88)
        fail("unverified");
    }

    /**
     * Run the void setEvaluator(MeasureNode,Measure,DirectedSparseGraph<Node,Edge>,DecoratorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testSetEvaluator_6()
        throws Exception
    {
        EvaluatorFactory fixture = EvaluatorFactory.getInstance();
        MeasureNode node = new MeasureNode(new DirectedSparseGraph(), "", "");
        node.setType("");
        node.setMethod("");
        Measure measure = new Measure("", "", "", "", "", "", "", "", "");
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.setEvaluator(node, measure, graph, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:78)
        //       at net.siliconcode.quamoco.aggregator.strategy.EvaluatorFactory.setEvaluator(EvaluatorFactory.java:88)
        fail("unverified");
    }

    /**
     * Run the void setEvaluator(MeasureNode,Measure,DirectedSparseGraph<Node,Edge>,DecoratorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testSetEvaluator_7()
        throws Exception
    {
        EvaluatorFactory fixture = EvaluatorFactory.getInstance();
        MeasureNode node = new MeasureNode(new DirectedSparseGraph(), "", "");
        node.setType("");
        node.setMethod("Min");
        Measure measure = new Measure("", "", "", "", "", "", "", "", "");
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.setEvaluator(node, measure, graph, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:78)
        //       at net.siliconcode.quamoco.aggregator.strategy.EvaluatorFactory.setEvaluator(EvaluatorFactory.java:88)
        fail("unverified");
    }

    /**
     * Run the void setEvaluator(MeasureNode,Measure,DirectedSparseGraph<Node,Edge>,DecoratorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testSetEvaluator_8()
        throws Exception
    {
        EvaluatorFactory fixture = EvaluatorFactory.getInstance();
        MeasureNode node = new MeasureNode(new DirectedSparseGraph(), "", "");
        node.setType("");
        node.setMethod("Max");
        Measure measure = new Measure("", "", "", "", "", "", "", "", "");
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.setEvaluator(node, measure, graph, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:78)
        //       at net.siliconcode.quamoco.aggregator.strategy.EvaluatorFactory.setEvaluator(EvaluatorFactory.java:88)
        fail("unverified");
    }

    /**
     * Run the void setEvaluator(MeasureNode,Measure,DirectedSparseGraph<Node,Edge>,DecoratorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testSetEvaluator_9()
        throws Exception
    {
        EvaluatorFactory fixture = EvaluatorFactory.getInstance();
        MeasureNode node = new MeasureNode(new DirectedSparseGraph(), "", "");
        node.setType("");
        node.setMethod("Mean");
        Measure measure = new Measure("", "", "", "", "", "", "", "", "");
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.setEvaluator(node, measure, graph, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:78)
        //       at net.siliconcode.quamoco.aggregator.strategy.EvaluatorFactory.setEvaluator(EvaluatorFactory.java:88)
        fail("unverified");
    }

    /**
     * Run the void setEvaluator(MeasureNode,Measure,DirectedSparseGraph<Node,Edge>,DecoratorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testSetEvaluator_10()
        throws Exception
    {
        EvaluatorFactory fixture = EvaluatorFactory.getInstance();
        MeasureNode node = new MeasureNode(new DirectedSparseGraph(), "", "");
        node.setType("Findings");
        node.setMethod("Intersect");
        Measure measure = new Measure("", "", "", "", "", "", "", "", "");
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.setEvaluator(node, measure, graph, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:78)
        //       at net.siliconcode.quamoco.aggregator.strategy.EvaluatorFactory.setEvaluator(EvaluatorFactory.java:88)
        fail("unverified");
    }

    /**
     * Run the void setEvaluator(MeasureNode,Measure,DirectedSparseGraph<Node,Edge>,DecoratorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testSetEvaluator_11()
        throws Exception
    {
        EvaluatorFactory fixture = EvaluatorFactory.getInstance();
        MeasureNode node = new MeasureNode(new DirectedSparseGraph(), "", "");
        node.setType("Findings");
        node.setMethod("");
        Measure measure = new Measure("", "", "", "", "", "", "", "", "");
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.setEvaluator(node, measure, graph, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:78)
        //       at net.siliconcode.quamoco.aggregator.strategy.EvaluatorFactory.setEvaluator(EvaluatorFactory.java:88)
        fail("unverified");
    }

    /**
     * Run the void setEvaluator(MeasureNode,Measure,DirectedSparseGraph<Node,Edge>,DecoratorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testSetEvaluator_12()
        throws Exception
    {
        EvaluatorFactory fixture = EvaluatorFactory.getInstance();
        MeasureNode node = new MeasureNode(new DirectedSparseGraph(), "", "");
        node.setType("Findings");
        node.setMethod("Union");
        Measure measure = new Measure("", "", "", "", "", "", "", "", "");
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.setEvaluator(node, measure, graph, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:78)
        //       at net.siliconcode.quamoco.aggregator.strategy.EvaluatorFactory.setEvaluator(EvaluatorFactory.java:88)
        fail("unverified");
    }

    /**
     * Run the void setEvaluator(MeasureNode,Measure,DirectedSparseGraph<Node,Edge>,DecoratorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testSetEvaluator_13()
        throws Exception
    {
        EvaluatorFactory fixture = EvaluatorFactory.getInstance();
        MeasureNode node = null;
        Measure measure = new Measure("", "", "", "", "", "", "", "", "");
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.setEvaluator(node, measure, graph, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:78)
        //       at net.siliconcode.quamoco.aggregator.strategy.EvaluatorFactory.setEvaluator(EvaluatorFactory.java:88)
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
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
     * @generatedBy CodePro at 5/30/15 3:43 PM
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
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(EvaluatorFactoryTest.class);
    }
}