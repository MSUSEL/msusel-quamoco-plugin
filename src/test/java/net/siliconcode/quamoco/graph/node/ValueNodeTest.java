package net.siliconcode.quamoco.graph.node;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;

/**
 * The class <code>ValueNodeTest</code> contains tests for the class
 * <code>{@link ValueNode}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class ValueNodeTest {

    private ValueNode fixture;

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
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        String key = "node";
        String owner = "owner";
        String tool = "tool";

        ValueNode result = new ValueNode(graph, key, owner, tool);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("tool", result.getTool());
        assertEquals(-1.0, result.getValue(), 1.0);
        assertEquals("node", result.getKey());
        assertEquals("owner", result.getOwnedBy());
        assertEquals("", result.getDescription());
        assertEquals("node", result.getName());
    }

    /**
     * Run the ValueNode(DirectedSparseGraph
     * <Node,Edge>,String,String,String,long) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testValueNode_2() throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        String key = "node";
        String owner = "owner";
        String tool = "tool";
        long id = 1L;

        ValueNode result = new ValueNode(graph, key, owner, tool, id);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("tool", result.getTool());
        assertEquals(-1.0, result.getValue(), 1.0);
        assertEquals("node", result.getKey());
        assertEquals("owner", result.getOwnedBy());
        assertEquals("", result.getDescription());
        assertEquals("node", result.getName());
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
        String result = fixture.getKey();

        // TODO: add additional test code here
        assertEquals("node", result);
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
        String result = fixture.getTool();

        // TODO: add additional test code here
        assertEquals("tool", result);
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
        fixture.addValue(1);
        fixture.addValue(1);
        fixture.addValue(1);
        fixture.addValue(-2);

        double result = fixture.getValue();

        // TODO: add additional test code here
        assertEquals(1.0, result, 0.1);
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
        String key = "";

        try
        {
            fixture.setKey(key);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

        key = null;
        try
        {
            fixture.setKey(key);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

        key = "other";
        fixture.setKey(key);

        // TODO: add additional test code here
        assertEquals(key, fixture.getKey());
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
        fixture = new ValueNode(new DirectedSparseGraph<>(), "node", "owner", "tool", 1L);
        fixture.graph = new DirectedSparseGraph<>();
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