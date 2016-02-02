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
 * The class <code>NodeTest</code> contains tests for the class
 * <code>{@link Node}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class NodeTest {

    private Node fixture;

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        FactorNode obj = new FactorNode(new DirectedSparseGraph<>(), "node", "owner");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_2() throws Exception
    {
        Object obj = null;

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_3() throws Exception
    {
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_4() throws Exception
    {
        ValueNode obj = new ValueNode(new DirectedSparseGraph<>(), "node", "owner", "tool");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the String getDescription() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetDescription_1() throws Exception
    {
        fixture.description = "description";

        String result = fixture.getDescription();

        // TODO: add additional test code here
        assertEquals("description", result);
    }

    /**
     * Run the DirectedSparseGraph<Node, Edge> getGraph() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetGraph_1() throws Exception
    {
        DirectedSparseGraph<Node, Edge> result = fixture.getGraph();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(0, result.getEdgeCount());
        assertEquals(0, result.getVertexCount());
        assertEquals("Vertices\nEdges:", result.toString());
    }

    /**
     * Run the long getId() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetId_1() throws Exception
    {
        fixture.id = 1L;

        long result = fixture.getId();

        // TODO: add additional test code here
        assertEquals(1L, result);
    }

    /**
     * Run the String getName() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetName_1() throws Exception
    {
        String result = fixture.getName();

        // TODO: add additional test code here
        assertEquals("node", result);
    }

    /**
     * Run the String getOwnedBy() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetOwnedBy_1() throws Exception
    {
        String result = fixture.getOwnedBy();

        // TODO: add additional test code here
        assertEquals("owner", result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testHashCode_1() throws Exception
    {
        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(-2045047410, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testHashCode_2() throws Exception
    {
        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(-2045047410, result);
    }

    /**
     * Run the void setDescription(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetDescription_1() throws Exception
    {
        assertEquals("", fixture.getDescription());
        String description = "description";
        fixture.setDescription(description);

        // TODO: add additional test code here
        assertEquals(description, fixture.getDescription());
    }

    /**
     * Run the void setDescription(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetDescription_2() throws Exception
    {
        String description = null;

        fixture.setDescription(description);

        // TODO: add additional test code here
        assertEquals("", fixture.getDescription());
    }

    /**
     * Run the void setId(long) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetId_1() throws Exception
    {
        long id = 1L;

        fixture.setId(id);

        // TODO: add additional test code here
        assertEquals(id, fixture.getId());
    }

    /**
     * Run the void setName(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetName_1() throws Exception
    {
        String name = "";
        try
        {
            fixture.setName(name);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

        name = null;
        try
        {
            fixture.setName(name);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

        name = "newName";
        fixture.setName(name);

        // TODO: add additional test code here
        assertEquals(name, fixture.getName());
    }

    /**
     * Run the void setOwnedBy(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetOwnedBy_1() throws Exception
    {
        String ownedBy = "";
        try
        {
            fixture.setOwnedBy(ownedBy);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

        ownedBy = null;
        try
        {
            fixture.setOwnedBy(ownedBy);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

        ownedBy = "newOwner";
        fixture.setOwnedBy(ownedBy);

        // TODO: add additional test code here
        assertEquals(ownedBy, fixture.getOwnedBy());
    }

    /**
     * Run the String toString() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testToString_1() throws Exception
    {
        String result = fixture.toString();

        // TODO: add additional test code here
        assertEquals("node", result);
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
        fixture = new FactorNode(new DirectedSparseGraph<>(), "node", "owner");
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
        new org.junit.runner.JUnitCore().run(NodeTest.class);
    }
}