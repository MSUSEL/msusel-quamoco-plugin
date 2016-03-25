package net.siliconcode.quamoco.graph.edge;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Assert;
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
import net.siliconcode.quamoco.processor.LinearDistribution;
import net.siliconcode.quamoco.processor.aggregators.FindingsUnionAggregator;
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
	public void testMeasureToMeasureFindingsNumberEdge_1() throws Exception {
		final String name = "";

		final MeasureToMeasureFindingsNumberEdge result = new MeasureToMeasureFindingsNumberEdge(name, null, null);

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(null, result.getDist());
		Assert.assertEquals(0.0, result.getMaxPoints(), 1.0);
		Assert.assertEquals(false, result.isUsesLinearDist());
		Assert.assertEquals(null, result.getNormalizer());
		Assert.assertEquals(1.0, result.getWeight(), 1.0);
		Assert.assertEquals(1.0, result.getUpperBound(), 1.0);
		Assert.assertEquals(0.0, result.getLowerBound(), 1.0);
		Assert.assertEquals("", result.getName());
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetValue_1() throws Exception {
		fixture.usesLinearDist = false;
		final double result = fixture.getValue();

		// add additional test code here
		Assert.assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetValue_2() throws Exception {
		fixture.usesLinearDist = true;
		final double result = fixture.getValue();

		// add additional test code here
		Assert.assertEquals(0.0, result, 0.1);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Before
	public void setUp() throws Exception {
		final DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		final MeasureNode dest = new MeasureNode(graph, "name", "owner");
		dest.setType(MeasureType.NUMBER);
		final MeasureNode src = new MeasureNode(graph, "name", "owner");
		src.setType(MeasureType.FINDINGS);
		final FindingNode srcsrc = new FindingNode(graph, "key", "owner", "rule", "tool");
		final FindingToMeasureEdge f2m = new FindingToMeasureEdge("preedge", srcsrc, src);
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
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(MeasureToMeasureFindingsNumberEdgeTest.class);
	}
}