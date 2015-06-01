package net.siliconcode.quamoco.aggregator.graph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * The class <code>ValueNodeTest</code> contains tests for the class
 * <code>{@link ValueNode}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class ValueNodeTest {

    /**
     * Run the ValueNode(DirectedSparseGraph<Node,Edge>,String,String,String)
     * constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testValueNode_1() throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        String key = "";
        String owner = "";
        String tool = "";

        ValueNode result = new ValueNode(graph, key, owner, tool);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("", result.getTool());
        assertEquals(-1.0, result.getValue(), 1.0);
        assertEquals("", result.getKey());
        assertEquals("", result.getOwnedBy());
        assertEquals(null, result.getDescription());
        assertEquals("", result.toString());
        assertEquals("", result.getName());
    }

    /**
     * Run the
     * ValueNode(DirectedSparseGraph<Node,Edge>,String,String,String,long)
     * constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testValueNode_2() throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        String key = "";
        String owner = "";
        String tool = "";
        long id = 1L;

        ValueNode result = new ValueNode(graph, key, owner, tool, id);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("", result.getTool());
        assertEquals("<nodes name=\"\" id=\"1\" owner=\"\" type=\"VALUE\" />", result.getXMLTag());
        assertEquals(-1.0, result.getValue(), 1.0);
        assertEquals("", result.getKey());
        assertEquals("", result.getOwnedBy());
        assertEquals(null, result.getDescription());
        assertEquals("", result.toString());
        assertEquals("", result.getName());
        assertEquals(1L, result.getId());
    }

    /**
     * Run the String getKey() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetKey_1() throws Exception
    {
        ValueNode fixture = new ValueNode(new DirectedSparseGraph(), "", "", "", 1L);
        fixture.setValue(1.0);
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.id = 1L;
        fixture.description = "";

        String result = fixture.getKey();

        // TODO: add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTool() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetTool_1() throws Exception
    {
        ValueNode fixture = new ValueNode(new DirectedSparseGraph(), "", "", "", 1L);
        fixture.setValue(1.0);
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.id = 1L;
        fixture.description = "";

        String result = fixture.getTool();

        // TODO: add additional test code here
        assertEquals("", result);
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
        ValueNode fixture = new ValueNode(new DirectedSparseGraph(), "", "", "", 1L);
        fixture.setValue(1.0);
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.id = 1L;
        fixture.description = "";

        double result = fixture.getValue();

        // TODO: add additional test code here
        assertEquals(1.0, result, 0.1);
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
        ValueNode fixture = new ValueNode(new DirectedSparseGraph(), "", "", "", 1L);
        fixture.setValue(1.0);
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.id = 1L;
        fixture.description = "";

        String result = fixture.getXMLTag();

        // TODO: add additional test code here
        assertEquals("<nodes name=\"\" id=\"1\" owner=\"\" type=\"VALUE\" />", result);
    }

    /**
     * Run the void setKey(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetKey_1() throws Exception
    {
        ValueNode fixture = new ValueNode(new DirectedSparseGraph(), "", "", "", 1L);
        fixture.setValue(1.0);
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.id = 1L;
        fixture.description = "";
        String key = "";

        fixture.setKey(key);

        // TODO: add additional test code here
        assertEquals(key, fixture.getKey());
    }

    /**
     * Run the void setValue(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetValue_1() throws Exception
    {
        ValueNode fixture = new ValueNode(new DirectedSparseGraph(), "", "", "", 1L);
        fixture.setValue(1.0);
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.id = 1L;
        fixture.description = "";
        double value = 1.0;

        fixture.setValue(value);

        // TODO: add additional test code here
        assertEquals(value, fixture.getValue(), 0.01);
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
        new org.junit.runner.JUnitCore().run(ValueNodeTest.class);
    }
}