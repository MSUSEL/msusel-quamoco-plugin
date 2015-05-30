package net.siliconcode.quamoco.aggregator.graph;

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.aggregator.strategy.EvaluationStrategy;
import net.siliconcode.quamoco.aggregator.strategy.MeanFactorEvaluationStrategy;
import net.siliconcode.quamoco.aggregator.strategy.NoNormalizationStrategy;
import net.siliconcode.quamoco.aggregator.strategy.NormalizationStrategy;

/**
 * The class <code>FactorNodeTest</code> contains tests for the class <code>{@link FactorNode}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class FactorNodeTest {
    /**
     * Run the FactorNode(DirectedSparseGraph<Node,Edge>,String,String) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testFactorNode_1()
        throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        String name = "";
        String owner = "";

        FactorNode result = new FactorNode(graph, name, owner);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getEvaluator());
        assertEquals("<nodes name=\"\" description=\"null\" id=\"1\" owner=\"\" type=\"FACTOR\">\n\t</nodes>", result.getXMLTag());
        assertEquals(null, result.getMethod());
        assertEquals("", result.getOwnedBy());
        assertEquals(null, result.getDescription());
        assertEquals("", result.toString());
        assertEquals("", result.getName());
        assertEquals(1L, result.getId());
        fail("unverified");
    }

    /**
     * Run the FactorNode(DirectedSparseGraph<Node,Edge>,String,String,long) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testFactorNode_2()
        throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        String name = "";
        String owner = "";
        long id = 1L;

        FactorNode result = new FactorNode(graph, name, owner, id);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getEvaluator());
        assertEquals("<nodes name=\"\" description=\"null\" id=\"1\" owner=\"\" type=\"FACTOR\">\n\t</nodes>", result.getXMLTag());
        assertEquals(null, result.getMethod());
        assertEquals("", result.getOwnedBy());
        assertEquals(null, result.getDescription());
        assertEquals("", result.toString());
        assertEquals("", result.getName());
        assertEquals(1L, result.getId());
        fail("unverified");
    }

    /**
     * Run the EvaluationStrategy getEvaluator() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetEvaluator_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.setEvaluator(new MeanFactorEvaluationStrategy(EasyMock.createNiceMock(NormalizationStrategy.class)));
        fixture.setMethod("");
        fixture.value = 1.0;
        fixture.name = "";
        fixture.description = "";
        fixture.ownedBy = "";
        fixture.id = 1L;
        fixture.graph = new DirectedSparseGraph();

        EvaluationStrategy result = fixture.getEvaluator();

        // TODO: add additional test code here
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the String getMethod() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetMethod_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.setEvaluator(new MeanFactorEvaluationStrategy(EasyMock.createNiceMock(NormalizationStrategy.class)));
        fixture.setMethod("");
        fixture.value = 1.0;
        fixture.name = "";
        fixture.description = "";
        fixture.ownedBy = "";
        fixture.id = 1L;
        fixture.graph = new DirectedSparseGraph();

        String result = fixture.getMethod();

        // TODO: add additional test code here
        assertEquals("", result);
        fail("unverified");
    }

    /**
     * Run the double getValue() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetValue_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.setEvaluator(new MeanFactorEvaluationStrategy(EasyMock.createNiceMock(NormalizationStrategy.class)));
        fixture.setMethod("");
        fixture.value = 1.0;
        fixture.name = "";
        fixture.description = "";
        fixture.ownedBy = "";
        fixture.id = 1L;
        fixture.graph = new DirectedSparseGraph();

        double result = fixture.getValue();

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.graph.FactorNode.getValue(FactorNode.java:90)
        assertEquals(0.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Run the double getValue() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetValue_2()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.setEvaluator(new MeanFactorEvaluationStrategy(EasyMock.createNiceMock(NormalizationStrategy.class)));
        fixture.setMethod("");
        fixture.value = 1.0;
        fixture.name = "";
        fixture.description = "";
        fixture.ownedBy = "";
        fixture.id = 1L;
        fixture.graph = new DirectedSparseGraph();

        double result = fixture.getValue();

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.graph.FactorNode.getValue(FactorNode.java:90)
        assertEquals(0.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Run the double getValue() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetValue_3()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.setEvaluator(new MeanFactorEvaluationStrategy(EasyMock.createNiceMock(NormalizationStrategy.class)));
        fixture.setMethod("");
        fixture.value = 1.0;
        fixture.name = "";
        fixture.description = "";
        fixture.ownedBy = "";
        fixture.id = 1L;
        fixture.graph = new DirectedSparseGraph();

        double result = fixture.getValue();

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.graph.FactorNode.getValue(FactorNode.java:90)
        assertEquals(0.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Run the String getXMLTag() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetXMLTag_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.setEvaluator(new MeanFactorEvaluationStrategy(EasyMock.createNiceMock(NormalizationStrategy.class)));
        fixture.setMethod("");
        fixture.value = 1.0;
        fixture.name = "";
        fixture.description = "";
        fixture.ownedBy = "";
        fixture.id = 1L;
        fixture.graph = new DirectedSparseGraph();

        String result = fixture.getXMLTag();

        // TODO: add additional test code here
        assertEquals("<nodes name=\"\" description=\"\" id=\"1\" owner=\"\" type=\"FACTOR\">\n\t</nodes>", result);
        fail("unverified");
    }

    /**
     * Run the void setEvaluator(EvaluationStrategy) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetEvaluator_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.setEvaluator(new MeanFactorEvaluationStrategy(EasyMock.createNiceMock(NormalizationStrategy.class)));
        fixture.setMethod("");
        fixture.value = 1.0;
        fixture.name = "";
        fixture.description = "";
        fixture.ownedBy = "";
        fixture.id = 1L;
        fixture.graph = new DirectedSparseGraph();
        EvaluationStrategy strategy = new MeanFactorEvaluationStrategy(EasyMock.createNiceMock(NormalizationStrategy.class));

        fixture.setEvaluator(strategy);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setMethod(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetMethod_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.setEvaluator(new MeanFactorEvaluationStrategy(EasyMock.createNiceMock(NormalizationStrategy.class)));
        fixture.setMethod("");
        fixture.value = 1.0;
        fixture.name = "";
        fixture.description = "";
        fixture.ownedBy = "";
        fixture.id = 1L;
        fixture.graph = new DirectedSparseGraph();
        String method = "";

        fixture.setMethod(method);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
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
     * @generatedBy CodePro at 5/30/15 3:38 PM
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
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(FactorNodeTest.class);
    }
}