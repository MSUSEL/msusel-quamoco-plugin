package net.siliconcode.quamoco.aggregator.graph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * The class <code>ParentEdgeTest</code> contains tests for the class
 * <code>{@link ParentEdge}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class ParentEdgeTest {

    /**
     * Run the ParentEdge(String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testParentEdge_1() throws Exception
    {
        String name = "";

        ParentEdge result = new ParentEdge(name);
        result.setId(0L);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(1.0, result.getWeight(), 1.0);
        assertEquals(0.0, result.getUpperBound(), 1.0);
        assertEquals(0.0, result.getLowerBound(), 1.0);
        assertEquals("Edge: " + result.getId(), result.toString());
        assertEquals("", result.getName());
        assertEquals(0L, result.getId());
    }

    /**
     * Run the double getLowerBound() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetLowerBound_1() throws Exception
    {
        ParentEdge fixture = new ParentEdge("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);

        double result = fixture.getLowerBound();

        // TODO: add additional test code here
        assertEquals(1.0, result, 0.1);
    }

    /**
     * Run the double getUpperBound() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetUpperBound_1() throws Exception
    {
        ParentEdge fixture = new ParentEdge("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);

        double result = fixture.getUpperBound();

        // TODO: add additional test code here
        assertEquals(1.0, result, 0.1);
    }

    /**
     * Run the double getValue(DirectedSparseGraph<Node,Edge>,Node) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetValue_1() throws Exception
    {
        ParentEdge fixture = new ParentEdge("edge");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(0.0);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        Node parent = new FactorNode(graph, "parent", "parent");
        Node child = new ValueNode(graph, "child", "child", "");
        ((ValueNode) child).setValue(0.5);
        graph.addEdge(fixture, child, parent);

        double result = fixture.getValue(graph, parent);
        assertEquals(0.5, result, 0.1);
    }

    /**
     * Run the double getValue(DirectedSparseGraph<Node,Edge>,Node) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetValue_2() throws Exception
    {
        ParentEdge fixture = new ParentEdge("edge");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(0.0);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        Node parent = new FactorNode(graph, "parent", "parent");
        Node child = new ValueNode(graph, "child", "child", "");
        ((ValueNode) child).setValue(-0.5);
        graph.addEdge(fixture, child, parent);

        double result = fixture.getValue(graph, parent);
        assertEquals(0.0, result, 0.1);
    }

    /**
     * Run the double getValue(DirectedSparseGraph<Node,Edge>,Node) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetValue_3() throws Exception
    {
        ParentEdge fixture = new ParentEdge("edge");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(0.0);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        Node parent = new FactorNode(graph, "parent", "parent");
        Node child = new ValueNode(graph, "child", "child", "");
        ((ValueNode) child).setValue(1.5);
        graph.addEdge(fixture, child, parent);

        double result = fixture.getValue(graph, parent);
        assertEquals(1.0, result, 0.1);
    }

    /**
     * Run the double getWeight() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetWeight_1() throws Exception
    {
        ParentEdge fixture = new ParentEdge("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);

        double result = fixture.getWeight();

        // TODO: add additional test code here
        assertEquals(1.0, result, 0.1);
    }

    /**
     * Run the void setLowerBound(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetLowerBound_1() throws Exception
    {
        ParentEdge fixture = new ParentEdge("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        double lowerBound = 1.0;

        fixture.setLowerBound(lowerBound);

        try
        {
            fixture.setLowerBound(lowerBound);
            assertEquals(1.0, fixture.getLowerBound(), 0.01);
        }
        catch (IllegalArgumentException e)
        {
            fail();
        }
    }

    /**
     * Run the void setLowerBound(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetLowerBound_2() throws Exception
    {
        ParentEdge fixture = new ParentEdge("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        double lowerBound = 2.0;

        try
        {
            fixture.setLowerBound(lowerBound);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals(1.0, fixture.getLowerBound(), 0.01);
        }
    }

    /**
     * Run the void setRank(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetRank_1() throws Exception
    {
        ParentEdge fixture = new ParentEdge("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        int rank = 1;

        fixture.setRank(rank);

        assertEquals(rank, fixture.getRank());
    }

    /**
     * Run the void setUpperBound(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetUpperBound_1() throws Exception
    {
        ParentEdge fixture = new ParentEdge("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        double upperBound = 1.0;

        try
        {
            fixture.setUpperBound(upperBound);
            assertEquals(upperBound, fixture.getUpperBound(), 0.01);
        }
        catch (IllegalArgumentException e)
        {
            fail();
        }
    }

    /**
     * Run the void setUpperBound(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetUpperBound_2() throws Exception
    {
        ParentEdge fixture = new ParentEdge("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        double upperBound = 0.0;

        try
        {
            fixture.setUpperBound(upperBound);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals(1.0, fixture.getUpperBound(), 0.01);
        }
    }

    /**
     * Run the void setWeight(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetWeight_1() throws Exception
    {
        ParentEdge fixture = new ParentEdge("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        double weight = 0.5;

        try
        {
            fixture.setWeight(weight);
            assertEquals(weight, fixture.getWeight(), 0.01);
        }
        catch (IllegalArgumentException e)
        {
            fail();
        }
    }

    /**
     * Run the void setWeight(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetWeight_2() throws Exception
    {
        ParentEdge fixture = new ParentEdge("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        double weight = 1.5;

        try
        {
            fixture.setWeight(weight);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals(1.0, fixture.getWeight(), 0.01);
        }
    }

    /**
     * Run the void setWeight(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetWeight_3() throws Exception
    {
        ParentEdge fixture = new ParentEdge("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        double weight = -1.0;

        try
        {
            fixture.setWeight(weight);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals(1.0, fixture.getWeight(), 0.01);
        }
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
        new org.junit.runner.JUnitCore().run(ParentEdgeTest.class);
    }
}