package net.siliconcode.quamoco.graph.edge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.graph.node.Finding;
import net.siliconcode.quamoco.graph.node.FindingNode;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.normalizers.NullNormalizer;

/**
 * The class <code>FindingToMeasureEdgeTest</code> contains tests for the class
 * <code>{@link FindingToMeasureEdge}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class FindingToMeasureEdgeTest {

    private FindingToMeasureEdge fixture;

    /**
     * Run the FindingToMeasureEdge(String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testFindingToMeasureEdge_1() throws Exception
    {
        String name = "edge";

        FindingToMeasureEdge result = new FindingToMeasureEdge(name, null, null);

        // add additional test code here
        assertNotNull(result);
        assertEquals(0.0, result.getValue(), 1.0);
        assertEquals("edge", result.getName());
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
        Set<Finding> result = fixture.getFindings();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
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
        Set<Finding> result = fixture.getFindings();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
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
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        FindingNode src = new FindingNode(graph, "key", "owner", "rule", "tool");
        MeasureNode dest = new MeasureNode(graph, "name", "owner");
        fixture = new FindingToMeasureEdge("edge", src, dest);
        fixture.norm = new NullNormalizer(fixture, "LOC", NormalizationRange.CLASS);

        src.addFinding(new Finding(new FileNode("path1"), "rule", "rule"));
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
        new org.junit.runner.JUnitCore().run(FindingToMeasureEdgeTest.class);
    }
}