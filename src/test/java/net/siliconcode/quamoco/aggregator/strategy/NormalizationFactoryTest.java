package net.siliconcode.quamoco.aggregator.strategy;

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import org.sonar.api.batch.DecoratorContext;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.FactorNode;
import net.siliconcode.quamoco.aggregator.graph.Node;

/**
 * The class <code>NormalizationFactoryTest</code> contains tests for the class <code>{@link NormalizationFactory}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:43 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class NormalizationFactoryTest {
    /**
     * Run the NormalizationFactory getInstance() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testGetInstance_1()
        throws Exception
    {

        NormalizationFactory result = NormalizationFactory.getInstance();

        // TODO: add additional test code here
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the NormalizationStrategy getNormalizationStrategy(FactorNode,DecoratorContext,DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testGetNormalizationStrategy_1()
        throws Exception
    {
        NormalizationFactory fixture = NormalizationFactory.getInstance();
        FactorNode factor = new FactorNode(new DirectedSparseGraph(), "", "");
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        NormalizationStrategy result = fixture.getNormalizationStrategy(factor, context, graph);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:61)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the NormalizationStrategy getNormalizationStrategy(FactorNode,DecoratorContext,DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testGetNormalizationStrategy_2()
        throws Exception
    {
        NormalizationFactory fixture = NormalizationFactory.getInstance();
        FactorNode factor = new FactorNode(new DirectedSparseGraph(), "", "");
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        NormalizationStrategy result = fixture.getNormalizationStrategy(factor, context, graph);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:61)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the NormalizationStrategy getNormalizationStrategy(FactorNode,DecoratorContext,DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testGetNormalizationStrategy_3()
        throws Exception
    {
        NormalizationFactory fixture = NormalizationFactory.getInstance();
        FactorNode factor = new FactorNode(new DirectedSparseGraph(), "", "");
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        NormalizationStrategy result = fixture.getNormalizationStrategy(factor, context, graph);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:61)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the NormalizationStrategy getNormalizationStrategy(FactorNode,DecoratorContext,DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testGetNormalizationStrategy_4()
        throws Exception
    {
        NormalizationFactory fixture = NormalizationFactory.getInstance();
        FactorNode factor = new FactorNode(new DirectedSparseGraph(), "", "");
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        NormalizationStrategy result = fixture.getNormalizationStrategy(factor, context, graph);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:61)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the NormalizationStrategy getNormalizationStrategy(Node,DecoratorContext,DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testGetNormalizationStrategy_5()
        throws Exception
    {
        NormalizationFactory fixture = NormalizationFactory.getInstance();
        Node measure = new FactorNode(new DirectedSparseGraph(), "", "");
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        NormalizationStrategy result = fixture.getNormalizationStrategy(measure, context, graph);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:78)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the NormalizationStrategy getNormalizationStrategy(Node,DecoratorContext,DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testGetNormalizationStrategy_6()
        throws Exception
    {
        NormalizationFactory fixture = NormalizationFactory.getInstance();
        Node measure = new FactorNode(new DirectedSparseGraph(), "", "");
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        NormalizationStrategy result = fixture.getNormalizationStrategy(measure, context, graph);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:78)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the NormalizationStrategy getNormalizationStrategy(Node,DecoratorContext,DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testGetNormalizationStrategy_7()
        throws Exception
    {
        NormalizationFactory fixture = NormalizationFactory.getInstance();
        Node measure = new FactorNode(new DirectedSparseGraph(), "", "");
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        NormalizationStrategy result = fixture.getNormalizationStrategy(measure, context, graph);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:78)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the NormalizationStrategy getNormalizationStrategy(Node,DecoratorContext,DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testGetNormalizationStrategy_8()
        throws Exception
    {
        NormalizationFactory fixture = NormalizationFactory.getInstance();
        Node measure = new FactorNode(new DirectedSparseGraph(), "", "");
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        NormalizationStrategy result = fixture.getNormalizationStrategy(measure, context, graph);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.NormalizationFactory.getNormalizationStrategy(NormalizationFactory.java:78)
        assertNotNull(result);
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
        new org.junit.runner.JUnitCore().run(NormalizationFactoryTest.class);
    }
}