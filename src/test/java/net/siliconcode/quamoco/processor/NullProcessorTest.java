package net.siliconcode.quamoco.processor;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.MeasureToFactorNumberEdge;
import net.siliconcode.quamoco.graph.edge.ValueToMeasureEdge;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.ValueNode;
import net.siliconcode.quamoco.model.qm.InfluenceEffect;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.aggregators.NumberMeanAggregator;
import net.siliconcode.quamoco.processor.normalizers.NullNormalizer;

/**
 * The class <code>NullProcessorTest</code> contains tests for the class
 * <code>{@link NullProcessor}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class NullProcessorTest {

	private NullProcessor fixture;

	/**
	 * Run the NullProcessor(Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testNullProcessor_1() throws Exception {
		final Node owner = new FactorNode(new DirectedSparseGraph<>(), "node", "owner");

		final NullProcessor result = new NullProcessor(owner);

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(0.0, result.process(), 1.0);
	}

	/**
	 * Run the double process() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testProcess_1() throws Exception {
		final double result = fixture.process();

		// add additional test code here
		Assert.assertEquals(0.0, result, 0.1);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Before
	public void setUp() throws Exception {
		final DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		final FactorNode owner = new FactorNode(graph, "owner", "other");

		final ValueNode vn = new ValueNode(graph, "key", "owner", "tool");
		final MeasureNode mn = new MeasureNode(graph, "measure", "owner");
		graph.addEdge(new ValueToMeasureEdge("v2m", vn, mn), vn, mn, EdgeType.DIRECTED);
		final MeasureToFactorNumberEdge m2fn = new MeasureToFactorNumberEdge("m2fn", mn, owner,
				InfluenceEffect.POSITIVE);
		graph.addEdge(m2fn, mn, owner, EdgeType.DIRECTED);
		m2fn.setNormalizer(new NullNormalizer(m2fn, "LOC", NormalizationRange.CLASS));
		vn.addValue(100);
		mn.setProcessor(new NumberMeanAggregator(mn));

		fixture = new NullProcessor(owner);
		owner.setProcessor(fixture);
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
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
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(NullProcessorTest.class);
	}
}