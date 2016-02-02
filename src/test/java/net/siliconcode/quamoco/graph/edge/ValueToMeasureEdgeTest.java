package net.siliconcode.quamoco.graph.edge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.ValueNode;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.normalizers.NullNormalizer;

/**
 * The class <code>ValueToMeasureEdgeTest</code> contains tests for the class
 * <code>{@link ValueToMeasureEdge}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class ValueToMeasureEdgeTest {

    private ValueToMeasureEdge fixture;

    /**
     * Run the ValueToMeasureEdge(String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testValueToMeasureEdge_1() throws Exception
    {
        String name = "";

        ValueToMeasureEdge result = new ValueToMeasureEdge(name, null, null);

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getName());
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
        assertEquals(10.0, result, 0.1);
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
        ValueNode src = new ValueNode(graph, "key", "owner", "tool");
        MeasureNode dest = new MeasureNode(graph, "name", "owner");

        src.addValue(10);

        fixture = new ValueToMeasureEdge("edge", src, dest);
        fixture.norm = new NullNormalizer(fixture, "LOC", NormalizationRange.CLASS);
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
        new org.junit.runner.JUnitCore().run(ValueToMeasureEdgeTest.class);
    }
}