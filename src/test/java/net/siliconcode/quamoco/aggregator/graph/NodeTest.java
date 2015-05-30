package net.siliconcode.quamoco.aggregator.graph;

import org.junit.*;
import static org.junit.Assert.*;
import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * The class <code>NodeTest</code> contains tests for the class <code>{@link Node}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class NodeTest {
    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";
        FactorNode obj = new FactorNode(new DirectedSparseGraph(), "", "");
        obj.name = "";
        obj.graph = new DirectedSparseGraph();
        obj.ownedBy = "";
        obj.value = 1.0;
        obj.id = 1L;
        obj.description = "";

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
        fail("unverified");
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_2()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";
        Object obj = null;

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
        fail("unverified");
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_3()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
        fail("unverified");
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_4()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";
        FactorNode obj = new FactorNode(new DirectedSparseGraph(), "", "");
        obj.id = 1L;

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
        fail("unverified");
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_5()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";
        FactorNode obj = new FactorNode(new DirectedSparseGraph(), "", "");
        obj.ownedBy = "";
        obj.id = 1L;

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
        fail("unverified");
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_6()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = null;
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";
        FactorNode obj = new FactorNode(new DirectedSparseGraph(), "", "");
        obj.ownedBy = null;
        obj.value = 1.0;
        obj.id = 1L;

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
        fail("unverified");
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_7()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";
        FactorNode obj = new FactorNode(new DirectedSparseGraph(), "", "");
        obj.ownedBy = "";
        obj.value = 1.0;
        obj.id = 1L;

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
        fail("unverified");
    }

    /**
     * Run the String getDescription() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetDescription_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";

        String result = fixture.getDescription();

        // TODO: add additional test code here
        assertEquals("", result);
        fail("unverified");
    }

    /**
     * Run the DirectedSparseGraph<Node, Edge> getGraph() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetGraph_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";

        DirectedSparseGraph<Node, Edge> result = fixture.getGraph();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(0, result.getEdgeCount());
        assertEquals(0, result.getVertexCount());
        assertEquals("Vertices\nEdges:", result.toString());
        fail("unverified");
    }

    /**
     * Run the long getId() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetId_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";

        long result = fixture.getId();

        // TODO: add additional test code here
        assertEquals(1L, result);
        fail("unverified");
    }

    /**
     * Run the String getName() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetName_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";

        String result = fixture.getName();

        // TODO: add additional test code here
        assertEquals("", result);
        fail("unverified");
    }

    /**
     * Run the String getOwnedBy() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetOwnedBy_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";

        String result = fixture.getOwnedBy();

        // TODO: add additional test code here
        assertEquals("", result);
        fail("unverified");
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testHashCode_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";

        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(1072724000, result);
        fail("unverified");
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testHashCode_2()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = null;
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";

        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(1072724000, result);
        fail("unverified");
    }

    /**
     * Run the void setDescription(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetDescription_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";
        String description = "";

        fixture.setDescription(description);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setDescription(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetDescription_2()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";
        String description = null;

        fixture.setDescription(description);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setId(long) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetId_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";
        long id = 1L;

        fixture.setId(id);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setName(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetName_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";
        String name = "";

        fixture.setName(name);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setOwnedBy(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetOwnedBy_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";
        String ownedBy = "";

        fixture.setOwnedBy(ownedBy);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the String toString() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testToString_1()
        throws Exception
    {
        FactorNode fixture = new FactorNode(new DirectedSparseGraph(), "", "");
        fixture.name = "";
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.value = 1.0;
        fixture.id = 1L;
        fixture.description = "";

        String result = fixture.toString();

        // TODO: add additional test code here
        assertEquals("", result);
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
        new org.junit.runner.JUnitCore().run(NodeTest.class);
    }
}