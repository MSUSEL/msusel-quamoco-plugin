package net.siliconcode.quamoco.graph.edge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.graph.node.Finding;
import net.siliconcode.quamoco.graph.node.FindingNode;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.MeasureType;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.aggregators.FindingsUnionAggregator;
import net.siliconcode.quamoco.processor.lineardist.LinearDistribution;
import net.siliconcode.quamoco.processor.normalizers.NullNormalizer;

/**
 * The class <code>MeasureToMeasureFindingsNumberEdgeTest</code> contains tests
 * for the class <code>{@link MeasureToMeasureFindingsNumberEdge}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class MeasureToMeasureFindingsNumberEdgeTest {

    private MeasureToMeasureFindingsNumberEdge fixture;

    /**
     * Run the MeasureToMeasureFindingsNumberEdge(String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testMeasureToMeasureFindingsNumberEdge_1() throws Exception
    {
        String name = "";

        MeasureToMeasureFindingsNumberEdge result = new MeasureToMeasureFindingsNumberEdge(name, null, null);

        // add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getDist());
        assertEquals(0.0, result.getMaxPoints(), 1.0);
        assertEquals(false, result.isUsesLinearDist());
        assertEquals(null, result.getNormalizer());
        assertEquals(1.0, result.getWeight(), 1.0);
        assertEquals(1.0, result.getUpperBound(), 1.0);
        assertEquals(0.0, result.getLowerBound(), 1.0);
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
        fixture.usesLinearDist = false;
        double result = fixture.getValue();

        // add additional test code here
        assertEquals(1.0, result, 0.1);
    }

    /**
     * Run the double getValue() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetValue_2() throws Exception
    {
        fixture.usesLinearDist = true;
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
        MeasureNode dest = new MeasureNode(graph, "name", "owner");
        dest.setType(MeasureType.NUMBER);
        MeasureNode src = new MeasureNode(graph, "name", "owner");
        src.setType(MeasureType.FINDINGS);
        FindingNode srcsrc = new FindingNode(graph, "key", "owner", "rule", "tool");
        FindingToMeasureEdge f2m = new FindingToMeasureEdge("preedge", srcsrc, src);
        srcsrc.addFinding(new Finding(new FileNode("path"), "issue", "issue"));
        fixture = new MeasureToMeasureFindingsNumberEdge("edge", src, dest);
        fixture.dist = EasyMock.createNiceMock(LinearDistribution.class);
        src.setProcessor(new FindingsUnionAggregator(src));

        graph.addEdge(fixture, src, dest);
        graph.addEdge(f2m, srcsrc, src);

        fixture.maxPoints = 100.0;
        fixture.usesLinearDist = false;
        fixture.lowerBound = 0;
        fixture.weight = 1.0;
        fixture.setNormalizer(new NullNormalizer(fixture, "LOC", NormalizationRange.CLASS));
        fixture.upperBound = 1.0;
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
        new org.junit.runner.JUnitCore().run(MeasureToMeasureFindingsNumberEdgeTest.class);
    }
}