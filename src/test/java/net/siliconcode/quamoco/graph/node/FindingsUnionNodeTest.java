package net.siliconcode.quamoco.graph.node;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import net.siliconcode.quamoco.codetree.CodeNodeType;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.FindingToMeasureEdge;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.NullProcessor;

/**
 * The class <code>FindingsUnionNodeTest</code> contains tests for the class
 * <code>{@link FindingsUnionNode}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class FindingsUnionNodeTest {

    /**
     * Run the FindingsUnionNode(DirectedSparseGraph<Node,Edge>,String,String)
     * constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testFindingsUnionNode_1() throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        String name = "name";
        String owner = "owner";

        FindingsUnionNode result = new FindingsUnionNode(graph, name, owner);

        // add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getXMLTag());
        assertEquals(0.0, result.getLowerResult(), 1.0);
        assertEquals(0.0, result.getUpperResult(), 1.0);
        assertEquals(0.0, result.getValue(), 1.0);
        assertEquals("owner", result.getOwnedBy());
        assertEquals("", result.getDescription());
        assertEquals(null, result.getProcessor());
        assertEquals("name", result.toString());
        assertEquals("name", result.getName());
    }

    /**
     * Run the double getExtent(String,NormalizationRange) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetExtent_1() throws Exception
    {
        FindingsUnionNode fixture = new FindingsUnionNode(new DirectedSparseGraph<>(), "union", "owner");
        fixture.value = 1.0;
        fixture.processor = new NullProcessor(new FactorNode(new DirectedSparseGraph<>(), "name", "owner"));

        String metric = "LOC";
        NormalizationRange range = NormalizationRange.FILE;

        fixture.addExtent("FILE", "LOC", 300);

        double result = fixture.getExtent(metric, range);

        // add additional test code here
        assertEquals(300, result, 0.1);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_1() throws Exception
    {
        FindingsUnionNode fixture = new FindingsUnionNode(new DirectedSparseGraph<>(), "union", "owner");
        String level = null;
        String metric = "";
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_2() throws Exception
    {
        FindingsUnionNode fixture = new FindingsUnionNode(new DirectedSparseGraph<>(), "union", "owner");
        String level = "";
        String metric = "";
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_3() throws Exception
    {
        FindingsUnionNode fixture = new FindingsUnionNode(new DirectedSparseGraph<>(), "union", "owner");
        String level = "";
        String metric = null;
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_4() throws Exception
    {
        FindingsUnionNode fixture = new FindingsUnionNode(new DirectedSparseGraph<>(), "union", "owner");
        String level = CodeNodeType.FIELD;
        String metric = "";
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_5() throws Exception
    {
        FindingsUnionNode fixture = new FindingsUnionNode(new DirectedSparseGraph<>(), "union", "owner");
        String level = "";
        String metric = "LOC";
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_6() throws Exception
    {
        FindingsUnionNode fixture = new FindingsUnionNode(new DirectedSparseGraph<>(), "union", "owner");
        String level = CodeNodeType.FIELD;
        String metric = "LOC";
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertTrue(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_7() throws Exception
    {
        FindingsUnionNode fixture = new FindingsUnionNode(new DirectedSparseGraph<>(), "union", "owner");
        String level = null;
        String metric = null;
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the Set<Finding> getFindings() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetFindings_1() throws Exception
    {
        FindingsUnionNode fixture = new FindingsUnionNode(new DirectedSparseGraph<>(), "union", "owner");
        fixture.processor = new NullProcessor(fixture);

        fixture.graph.addVertex(fixture);
        FindingNode fn = new FindingNode(fixture.graph, "finding", "finding", "rule", "tool");
        fn.addFinding(new Finding(new FileNode("path"), "finding1", "rule"));
        fn.addFinding(new Finding(new FileNode("path"), "finding2", "rule"));
        fn.addFinding(new Finding(new FileNode("path"), "finding3", "rule"));
        fixture.graph.addVertex(fn);
        fixture.graph.addEdge(new FindingToMeasureEdge("name", fn, fixture), fn, fixture, EdgeType.DIRECTED);

        Set<Finding> result = fixture.getFindings();

        assertNotNull(result);
        assertEquals(3, result.size());
    }

    /**
     * Run the Set<Finding> getFindings() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetFindings_2() throws Exception
    {
        FindingsUnionNode fixture = new FindingsUnionNode(new DirectedSparseGraph<>(), "union", "owner");

        fixture.graph.addVertex(fixture);
        Set<Finding> result = fixture.getFindings();

        assertTrue(result.isEmpty());
    }

    /**
     * Run the double getLowerResult() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetLowerResult_1() throws Exception
    {
        FindingsUnionNode fixture = new FindingsUnionNode(new DirectedSparseGraph<>(), "union", "owner");

        double result = fixture.getLowerResult();

        // add additional test code here
        assertEquals(0.0, result, 0.1);
    }

    /**
     * Run the double getUpperResult() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetUpperResult_1() throws Exception
    {
        FindingsUnionNode fixture = new FindingsUnionNode(new DirectedSparseGraph<>(), "union", "owner");

        double result = fixture.getUpperResult();

        // add additional test code here
        assertEquals(0.0, result, 0.1);
    }

    /**
     * Run the double getValue() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetValue_1() throws Exception
    {
        FindingsUnionNode fixture = new FindingsUnionNode(new DirectedSparseGraph<>(), "union", "owner");

        double result = fixture.getValue();

        // add additional test code here
        assertEquals(0.0, result, 0.1);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Before
    public void setUp() throws Exception
    {
        // add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @After
    public void tearDown() throws Exception
    {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args
     *            the command line arguments
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(FindingsUnionNodeTest.class);
    }
}