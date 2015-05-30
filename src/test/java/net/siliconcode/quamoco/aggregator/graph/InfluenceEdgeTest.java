package net.siliconcode.quamoco.aggregator.graph;

import org.junit.*;
import static org.junit.Assert.*;
import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * The class <code>InfluenceEdgeTest</code> contains tests for the class <code>{@link InfluenceEdge}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class InfluenceEdgeTest {
    /**
     * Run the InfluenceEdge(String) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testInfluenceEdge_1()
        throws Exception
    {
        String name = "";

        InfluenceEdge result = new InfluenceEdge(name);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(1.0, result.getWeight(), 1.0);
        assertEquals("POSITIVE", result.getInf());
        assertEquals(0.0, result.getUpperBound(), 1.0);
        assertEquals(0.0, result.getLowerBound(), 1.0);
        assertEquals("Edge: 0", result.toString());
        assertEquals("", result.getName());
        assertEquals(0L, result.getId());
        fail("unverified");
    }

    /**
     * Run the String getInf() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetInf_1()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);

        String result = fixture.getInf();

        // TODO: add additional test code here
        assertEquals("", result);
        fail("unverified");
    }

    /**
     * Run the double getLowerBound() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetLowerBound_1()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);

        double result = fixture.getLowerBound();

        // TODO: add additional test code here
        assertEquals(1.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Run the double getUpperBound() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetUpperBound_1()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);

        double result = fixture.getUpperBound();

        // TODO: add additional test code here
        assertEquals(1.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Run the double getValue(DirectedSparseGraph<Node,Edge>,Node) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetValue_1()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("NEGATIVE");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        Node caller = new FactorNode(new DirectedSparseGraph(), "", "");

        double result = fixture.getValue(graph, caller);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at edu.uci.ics.jung.graph.AbstractGraph.getOpposite(AbstractGraph.java:175)
        //       at net.siliconcode.quamoco.aggregator.graph.InfluenceEdge.getValue(InfluenceEdge.java:85)
        assertEquals(0.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Run the double getValue(DirectedSparseGraph<Node,Edge>,Node) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetValue_2()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        Node caller = new FactorNode(new DirectedSparseGraph(), "", "");

        double result = fixture.getValue(graph, caller);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at edu.uci.ics.jung.graph.AbstractGraph.getOpposite(AbstractGraph.java:175)
        //       at net.siliconcode.quamoco.aggregator.graph.InfluenceEdge.getValue(InfluenceEdge.java:85)
        assertEquals(0.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Run the double getValue(DirectedSparseGraph<Node,Edge>,Node) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetValue_3()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("POSITIVE");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        Node caller = new FactorNode(new DirectedSparseGraph(), "", "");

        double result = fixture.getValue(graph, caller);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at edu.uci.ics.jung.graph.AbstractGraph.getOpposite(AbstractGraph.java:175)
        //       at net.siliconcode.quamoco.aggregator.graph.InfluenceEdge.getValue(InfluenceEdge.java:85)
        assertEquals(0.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Run the double getValue(DirectedSparseGraph<Node,Edge>,Node) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetValue_4()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf((String) null);
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        Node caller = new FactorNode(new DirectedSparseGraph(), "", "");

        double result = fixture.getValue(graph, caller);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at edu.uci.ics.jung.graph.AbstractGraph.getOpposite(AbstractGraph.java:175)
        //       at net.siliconcode.quamoco.aggregator.graph.InfluenceEdge.getValue(InfluenceEdge.java:85)
        assertEquals(0.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Run the double getWeight() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetWeight_1()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);

        double result = fixture.getWeight();

        // TODO: add additional test code here
        assertEquals(1.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Run the void setInf(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetInf_1()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        String inf = "";

        fixture.setInf(inf);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setLowerBound(double) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetLowerBound_1()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        double lowerBound = 1.0;

        fixture.setLowerBound(lowerBound);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setLowerBound(double) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetLowerBound_2()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        double lowerBound = 1.0;

        fixture.setLowerBound(lowerBound);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setRank(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetRank_1()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        int rank = 1;

        fixture.setRank(rank);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setUpperBound(double) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetUpperBound_1()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        double upperBound = 1.0;

        fixture.setUpperBound(upperBound);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setUpperBound(double) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetUpperBound_2()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        double upperBound = 1.0;

        fixture.setUpperBound(upperBound);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setWeight(double) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetWeight_1()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        double weight = 1.0;

        fixture.setWeight(weight);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setWeight(double) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetWeight_2()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        double weight = 1.0;

        fixture.setWeight(weight);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setWeight(double) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetWeight_3()
        throws Exception
    {
        InfluenceEdge fixture = new InfluenceEdge("");
        fixture.setInf("");
        fixture.setRank(1);
        fixture.setUpperBound(1.0);
        fixture.setWeight(1.0);
        fixture.setLowerBound(1.0);
        double weight = 1.0;

        fixture.setWeight(weight);

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
        new org.junit.runner.JUnitCore().run(InfluenceEdgeTest.class);
    }
}