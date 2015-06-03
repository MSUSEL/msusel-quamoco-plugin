package net.siliconcode.quamoco.aggregator.graph;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import net.siliconcode.quamoco.aggregator.strategy.Evaluator;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * The class <code>MeasureNodeTest</code> contains tests for the class
 * <code>{@link MeasureNode}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class MeasureNodeTest {

    /**
     * Run the MeasureNode(DirectedSparseGraph<Node,Edge>,String,String)
     * constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testMeasureNode_1() throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        String name = "";
        String owner = "";

        MeasureNode result = new MeasureNode(graph, name, owner);

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
     * Run the MeasureNode(DirectedSparseGraph<Node,Edge>,String,String,long)
     * constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testMeasureNode_2() throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();
        String name = "";
        String owner = "";
        long id = 1L;

        MeasureNode result = new MeasureNode(graph, name, owner, id);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getEvaluator());
        assertEquals("<nodes name=\"\" description=\"null\" id=\"1\" owner=\"\" type=\"MEASURE\">\n\t</nodes>",
                result.getXMLTag());
        assertEquals(false, result.isNormalized());
        assertEquals(null, result.getMethod());
        assertEquals(null, result.getType());
        assertEquals("", result.getOwnedBy());
        assertEquals(null, result.getDescription());
        assertEquals("", result.toString());
        assertEquals("", result.getName());
        assertEquals(1L, result.getId());
    }

    /**
     * Run the Evaluator getEvaluator() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetEvaluator_1() throws Exception
    {
        MeasureNode fixture = new MeasureNode(new DirectedSparseGraph(), "", "");
        fixture.setType("");
        fixture.setNormalized(true);
        fixture.setMethod("");
        fixture.setEvaluator(EasyMock.createNiceMock(Evaluator.class));
        fixture.name = "";
        fixture.value = 1.0;
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.description = "";
        fixture.id = 1L;

        Evaluator result = fixture.getEvaluator();

        // TODO: add additional test code here
        assertNotNull(result);
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
        MeasureNode fixture = new MeasureNode(new DirectedSparseGraph(), "", "");
        fixture.setType("");
        fixture.setNormalized(true);
        fixture.setMethod("");
        fixture.setEvaluator(EasyMock.createNiceMock(Evaluator.class));
        fixture.name = "";
        fixture.value = 1.0;
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.description = "";
        fixture.id = 1L;

        String result = fixture.getMethod();

        // TODO: add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getType() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetType_1() throws Exception
    {
        MeasureNode fixture = new MeasureNode(new DirectedSparseGraph(), "", "");
        fixture.setType("");
        fixture.setNormalized(true);
        fixture.setMethod("");
        fixture.setEvaluator(EasyMock.createNiceMock(Evaluator.class));
        fixture.name = "";
        fixture.value = 1.0;
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.description = "";
        fixture.id = 1L;

        String result = fixture.getType();

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
        fail("unverified");
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
        fail("unverified");
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
        fail("unverified");
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
        MeasureNode fixture = new MeasureNode(new DirectedSparseGraph(), "", "");
        fixture.setType("");
        fixture.setNormalized(true);
        fixture.setMethod("");
        fixture.setEvaluator(EasyMock.createNiceMock(Evaluator.class));
        fixture.name = "";
        fixture.value = 1.0;
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.description = "";
        fixture.id = 1L;

        String result = fixture.getXMLTag();

        // TODO: add additional test code here
        assertEquals("<nodes name=\"\" description=\"\" id=\"1\" owner=\"\" type=\"MEASURE\">\n\t</nodes>", result);
    }

    /**
     * Run the boolean isNormalized() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testIsNormalized_1() throws Exception
    {
        MeasureNode fixture = new MeasureNode(new DirectedSparseGraph(), "", "");
        fixture.setType("");
        fixture.setNormalized(true);
        fixture.setMethod("");
        fixture.setEvaluator(EasyMock.createNiceMock(Evaluator.class));
        fixture.name = "";
        fixture.value = 1.0;
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.description = "";
        fixture.id = 1L;

        boolean result = fixture.isNormalized();

        // TODO: add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isNormalized() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testIsNormalized_2() throws Exception
    {
        MeasureNode fixture = new MeasureNode(new DirectedSparseGraph(), "", "");
        fixture.setType("");
        fixture.setNormalized(false);
        fixture.setMethod("");
        fixture.setEvaluator(EasyMock.createNiceMock(Evaluator.class));
        fixture.name = "";
        fixture.value = 1.0;
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.description = "";
        fixture.id = 1L;

        boolean result = fixture.isNormalized();

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the void setEvaluator(Evaluator) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetEvaluator_1() throws Exception
    {
        MeasureNode fixture = new MeasureNode(new DirectedSparseGraph(), "", "");
        fixture.setType("");
        fixture.setNormalized(true);
        fixture.setMethod("");
        fixture.setEvaluator(EasyMock.createNiceMock(Evaluator.class));
        fixture.name = "";
        fixture.value = 1.0;
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.description = "";
        fixture.id = 1L;
        Evaluator evaluator = EasyMock.createMock(Evaluator.class);
        // TODO: add mock object expectations here

        EasyMock.replay(evaluator);

        fixture.setEvaluator(evaluator);

        // TODO: add additional test code here
        EasyMock.verify(evaluator);
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
        MeasureNode fixture = new MeasureNode(new DirectedSparseGraph(), "", "");
        fixture.setType("");
        fixture.setNormalized(true);
        fixture.setMethod("");
        fixture.setEvaluator(EasyMock.createNiceMock(Evaluator.class));
        fixture.name = "";
        fixture.value = 1.0;
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.description = "";
        fixture.id = 1L;
        String method = "";

        fixture.setMethod(method);

        // TODO: add additional test code here
        assertEquals(method, fixture.getMethod());
    }

    /**
     * Run the void setNormalized(boolean) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetNormalized_1() throws Exception
    {
        MeasureNode fixture = new MeasureNode(new DirectedSparseGraph(), "", "");
        fixture.setType("");
        fixture.setNormalized(true);
        fixture.setMethod("");
        fixture.setEvaluator(EasyMock.createNiceMock(Evaluator.class));
        fixture.name = "";
        fixture.value = 1.0;
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.description = "";
        fixture.id = 1L;
        boolean normalized = true;

        fixture.setNormalized(normalized);

        assertEquals(normalized, fixture.isNormalized());
    }

    /**
     * Run the void setType(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testSetType_1() throws Exception
    {
        MeasureNode fixture = new MeasureNode(new DirectedSparseGraph(), "", "");
        fixture.setType("");
        fixture.setNormalized(true);
        fixture.setMethod("");
        fixture.setEvaluator(EasyMock.createNiceMock(Evaluator.class));
        fixture.name = "";
        fixture.value = 1.0;
        fixture.graph = new DirectedSparseGraph();
        fixture.ownedBy = "";
        fixture.description = "";
        fixture.id = 1L;
        String type = "";

        fixture.setType(type);

        assertEquals(type, fixture.getType());
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
        new org.junit.runner.JUnitCore().run(MeasureNodeTest.class);
    }
}