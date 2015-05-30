package net.siliconcode.quamoco.aggregator.graph;

import org.junit.*;
import static org.junit.Assert.*;
import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * The class <code>AbstractEdgeTest</code> contains tests for the class <code>{@link AbstractEdge}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class AbstractEdgeTest {
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
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge();
        Object obj = AbstractEdgeFactory.createAbstractEdge2();

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
    public void testEquals_2()
        throws Exception
    {
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge3();
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
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge4();
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
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge5();
        Object obj = AbstractEdgeFactory.createAbstractEdge6();

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
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge7();
        Object obj = AbstractEdgeFactory.createAbstractEdge8();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
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
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge();

        long result = fixture.getId();

        // TODO: add additional test code here
        assertEquals(8L, result);
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
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge2();

        String result = fixture.getName();

        // TODO: add additional test code here
        assertEquals("", result);
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
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge3();
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        Node caller = new FactorNode(new DirectedSparseGraph(), "", "");

        double result = fixture.getValue(graph, caller);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at edu.uci.ics.jung.graph.AbstractGraph.getOpposite(AbstractGraph.java:175)
        //       at net.siliconcode.quamoco.aggregator.graph.ParentEdge.getValue(ParentEdge.java:76)
        assertEquals(0.0, result, 0.1);
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
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge4();

        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(1302, result);
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
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge5();

        String result = fixture.toString();

        // TODO: add additional test code here
        assertEquals("Edge: 12", result);
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
        new org.junit.runner.JUnitCore().run(AbstractEdgeTest.class);
    }
}