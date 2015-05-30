package net.siliconcode.quamoco.aggregator.graph;

import org.junit.*;
import static org.junit.Assert.*;
import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * The class <code>NormalizationNodeTest</code> contains tests for the class <code>{@link NormalizationNode}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class NormalizationNodeTest {
    /**
     * Run the NormalizationNode(DirectedSparseGraph<Node,Edge>,String,String) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testNormalizationNode_1()
        throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        String name = "";
        String owner = "";

        NormalizationNode result = new NormalizationNode(graph, name, owner);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("<nodes name=\"\" id=\"1\" owner=\"\" type=\"NORMALIZATION\" />", result.getXMLTag());
        assertEquals(null, result.getEvaluator());
        assertEquals(false, result.isNormalized());
        assertEquals(null, result.getMethod());
        assertEquals(null, result.getType());
        assertEquals("", result.getOwnedBy());
        assertEquals(null, result.getDescription());
        assertEquals("", result.toString());
        assertEquals("", result.getName());
        assertEquals(1L, result.getId());
        fail("unverified");
    }

    /**
     * Run the NormalizationNode(DirectedSparseGraph<Node,Edge>,String,String,long) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testNormalizationNode_2()
        throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        String name = "";
        String owner = "";
        long id = 1L;

        NormalizationNode result = new NormalizationNode(graph, name, owner, id);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("<nodes name=\"\" id=\"1\" owner=\"\" type=\"NORMALIZATION\" />", result.getXMLTag());
        assertEquals(null, result.getEvaluator());
        assertEquals(false, result.isNormalized());
        assertEquals(null, result.getMethod());
        assertEquals(null, result.getType());
        assertEquals("", result.getOwnedBy());
        assertEquals(null, result.getDescription());
        assertEquals("", result.toString());
        assertEquals("", result.getName());
        assertEquals(1L, result.getId());
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
        NormalizationNode fixture = new NormalizationNode(new DirectedSparseGraph(), "", "");
        fixture.id = 1L;
        fixture.description = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.name = "";

        double result = fixture.getValue();

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.graph.NormalizationNode.getValue(NormalizationNode.java:63)
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
        NormalizationNode fixture = new NormalizationNode(new DirectedSparseGraph(), "", "");
        fixture.id = 1L;
        fixture.description = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.name = "";

        double result = fixture.getValue();

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.graph.NormalizationNode.getValue(NormalizationNode.java:63)
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
        NormalizationNode fixture = new NormalizationNode(new DirectedSparseGraph(), "", "");
        fixture.id = 1L;
        fixture.description = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.name = "";

        double result = fixture.getValue();

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.graph.NormalizationNode.getValue(NormalizationNode.java:63)
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
        NormalizationNode fixture = new NormalizationNode(new DirectedSparseGraph(), "", "");
        fixture.id = 1L;
        fixture.description = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.name = "";

        String result = fixture.getXMLTag();

        // TODO: add additional test code here
        assertEquals("<nodes name=\"\" id=\"1\" owner=\"\" type=\"NORMALIZATION\" />", result);
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
        new org.junit.runner.JUnitCore().run(NormalizationNodeTest.class);
    }
}