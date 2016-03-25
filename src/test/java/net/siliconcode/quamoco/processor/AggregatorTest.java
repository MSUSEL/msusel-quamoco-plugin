package net.siliconcode.quamoco.processor;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.ValueToMeasureEdge;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.ValueNode;
import net.siliconcode.quamoco.processor.aggregators.NumberMeanAggregator;

/**
 * The class <code>AggregatorTest</code> contains tests for the class
 * <code>{@link Aggregator}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class AggregatorTest {

	private Aggregator fixture;

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
		Assert.assertEquals(15, result, 0.1);
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
		final ValueNode vn = new ValueNode(graph, "value", "issue", "issue");
		final MeasureNode mn = new MeasureNode(graph, "measure", "owner");
		fixture = new NumberMeanAggregator(mn);
		mn.setProcessor(fixture);
		vn.addValue(10);
		vn.addValue(20);
		graph.addEdge(new ValueToMeasureEdge("v2m", vn, mn), vn, mn, EdgeType.DIRECTED);
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
		new org.junit.runner.JUnitCore().run(AggregatorTest.class);
	}
}