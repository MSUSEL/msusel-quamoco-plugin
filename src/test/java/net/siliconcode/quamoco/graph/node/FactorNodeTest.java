package net.siliconcode.quamoco.graph.node;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.ValueToMeasureEdge;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.NullProcessor;

/**
 * The class <code>FactorNodeTest</code> contains tests for the class
 * <code>{@link FactorNode}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class FactorNodeTest {

    private FactorNode fixture;

    /**
     * Run the FactorNode(DirectedSparseGraph<Node,Edge>,String,String)
     * constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testFactorNode_1() throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        String name = "factor";
        String owner = "owner";

        FactorNode result = new FactorNode(graph, name, owner);
        result.setId(1L);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(FactorMethod.MEAN, result.getMethod());
        assertEquals("owner", result.getOwnedBy());
        assertEquals("", result.getDescription());
        assertEquals("factor", result.toString());
        assertEquals("factor", result.getName());
        assertEquals(1L, result.getId());
    }

    /**
     * Run the FactorNode(DirectedSparseGraph<Node,Edge>,String,String,long)
     * constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testFactorNode_2() throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        String name = "factor";
        String owner = "owner";
        long id = 2L;

        FactorNode result = new FactorNode(graph, name, owner, id);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(FactorMethod.MEAN, result.getMethod());
        assertEquals("owner", result.getOwnedBy());
        assertEquals("", result.getDescription());
        assertEquals("factor", result.toString());
        assertEquals("factor", result.getName());
        assertEquals(2L, result.getId());
    }

    /**
     * Run the String getMethod() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetMethod_1() throws Exception
    {
        String result = fixture.getMethod();

        // TODO: add additional test code here
        assertEquals("MEAN", result);
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
        fixture.setProcessor(new NullProcessor(fixture));

        double result = fixture.getValue();

        assertEquals(0, result, 0.01);
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
        fixture.setProcessor(new NullProcessor(fixture));
        fixture.value = 1.0;

        double result = fixture.getValue();

        assertEquals(1.0, result, 0.01);
    }

    /**
     * Run the void setMethod(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetMethod_1() throws Exception
    {
        try
        {
            fixture.setMethod("");
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

        try
        {
            fixture.setMethod(null);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

        try
        {
            fixture.setMethod("bob");
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

        String method = FactorMethod.RANKING;
        fixture.setMethod(method);

        assertEquals(method, fixture.getMethod());
    }

    @Test
    public void testGetUpperResult_1() throws Exception
    {
        ValueNode vn1 = new ValueNode(fixture.getGraph(), "vn1", "owner", "tool");
        vn1.addValue(100);
        ValueNode vn2 = new ValueNode(fixture.getGraph(), "vn2", "owner", "tool");
        vn2.addValue(150);
        ValueNode vn3 = new ValueNode(fixture.getGraph(), "vn3", "owner", "tool");
        vn3.addValue(200);

        fixture.getGraph().addEdge(new ValueToMeasureEdge("edge1", vn1, fixture), vn1, fixture);
        fixture.getGraph().addEdge(new ValueToMeasureEdge("edge1", vn2, fixture), vn2, fixture);
        fixture.getGraph().addEdge(new ValueToMeasureEdge("edge1", vn3, fixture), vn3, fixture);

        double result = fixture.getUpperResult();

        assertEquals(200, result, 0.01);
    }

    @Test
    public void testGetLowerResult_1() throws Exception
    {
        ValueNode vn1 = new ValueNode(fixture.getGraph(), "vn1", "owner", "tool");
        vn1.addValue(100);
        ValueNode vn2 = new ValueNode(fixture.getGraph(), "vn2", "owner", "tool");
        vn2.addValue(150);
        ValueNode vn3 = new ValueNode(fixture.getGraph(), "vn3", "owner", "tool");
        vn3.addValue(200);

        fixture.getGraph().addEdge(new ValueToMeasureEdge("edge1", vn1, fixture), vn1, fixture);
        fixture.getGraph().addEdge(new ValueToMeasureEdge("edge1", vn2, fixture), vn2, fixture);
        fixture.getGraph().addEdge(new ValueToMeasureEdge("edge1", vn3, fixture), vn3, fixture);

        double result = fixture.getLowerResult();

        assertEquals(100, result, 0.01);
    }

    @Test
    public void testGetExtent_1() throws Exception
    {
        fixture.value = 1.0;

        assertEquals(1.0, fixture.getExtent("LOC", NormalizationRange.NA), 0.01);
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
        fixture = new FactorNode(new DirectedSparseGraph<>(), "factor", "owner");
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
        new org.junit.runner.JUnitCore().run(FactorNodeTest.class);
    }
}