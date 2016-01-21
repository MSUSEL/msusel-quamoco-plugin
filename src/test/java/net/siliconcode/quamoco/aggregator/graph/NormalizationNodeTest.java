package net.siliconcode.quamoco.aggregator.graph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.ValueToMeasureEdge;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.NormalizationNode;
import net.siliconcode.quamoco.graph.node.ValueNode;

/**
 * The class <code>NormalizationNodeTest</code> contains tests for the class
 * <code>{@link NormalizationNode}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class NormalizationNodeTest {

    /**
     * Run the NormalizationNode(DirectedSparseGraph<Node,Edge>,String,String)
     * constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testNormalizationNode_1() throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        String name = "";
        String owner = "";

        NormalizationNode result = new NormalizationNode(graph, name, owner);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getEvaluator());
        assertEquals(false, result.isNormalized());
        assertEquals(null, result.getMethod());
        assertEquals(null, result.getType());
        assertEquals("", result.getOwnedBy());
        assertEquals(null, result.getDescription());
        assertEquals("", result.toString());
        assertEquals("", result.getName());
    }

    /**
     * Run the
     * NormalizationNode(DirectedSparseGraph<Node,Edge>,String,String,long)
     * constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testNormalizationNode_2() throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        String name = "";
        String owner = "";
        long id = 1L;

        NormalizationNode result = new NormalizationNode(graph, name, owner, id);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getEvaluator());
        assertEquals(false, result.isNormalized());
        assertEquals(null, result.getMethod());
        assertEquals(null, result.getType());
        assertEquals("", result.getOwnedBy());
        assertEquals(null, result.getDescription());
        assertEquals("", result.toString());
        assertEquals("", result.getName());
    }

    /**
     * Run the double getValue() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetValue_1() throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        NormalizationNode fixture = new NormalizationNode(graph, "norm", "norm");
        ValueNode node = new ValueNode(graph, "value", "value", "");
        node.setValue(1.0);

        graph.addEdge(new ValueToMeasureEdge("edge"), node, fixture);

        double result = fixture.getValue();
        assertEquals(1.0, result, 0.01);
    }

    /**
     * Run the double getValue() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetValue_2() throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        NormalizationNode fixture = new NormalizationNode(graph, "norm", "norm");
        graph.addVertex(fixture);

        double result = fixture.getValue();
        assertEquals(-1.0, result, 0.01);
    }

    /**
     * Run the double getValue() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetValue_3() throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        NormalizationNode fixture = new NormalizationNode(graph, "norm", "norm");
        ValueNode node = new ValueNode(graph, "value", "value", "");

        graph.addEdge(new ValueToMeasureEdge("edge"), node, fixture);

        double result = fixture.getValue();
        assertEquals(-1.0, result, 0.01);
    }

    /**
     * Run the String getXMLTag() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetXMLTag_1() throws Exception
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
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Before
    public void setUp() throws Exception
    {
        // TODO: add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @After
    public void tearDown() throws Exception
    {
        // TODO: add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args
     *            the command line arguments
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(NormalizationNodeTest.class);
    }
}