package net.siliconcode.quamoco.processor;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.MeasureToFactorNumberEdge;
import net.siliconcode.quamoco.graph.edge.ValueToMeasureEdge;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.MeasureType;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.ValueNode;
import net.siliconcode.quamoco.model.qm.InfluenceEffect;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.aggregators.NumberMeanAggregator;
import net.siliconcode.quamoco.processor.evaluators.MeanEvaluator;
import net.siliconcode.quamoco.processor.normalizers.NullNormalizer;

/**
 * The class <code>EvaluatorTest</code> contains tests for the class
 * <code>{@link Evaluator}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class EvaluatorTest {

	private Evaluator fixture;

	/**
	 * Run the double process() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testProcess_1() throws Exception {
		double result = fixture.process();

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double process() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testProcess_2() throws Exception {
		ValueNode vn = new ValueNode(fixture.owner.getGraph(), "key", "owner", "tool");
		MeasureNode mn = new MeasureNode(fixture.owner.getGraph(), "measure", "owner");
		mn.setProcessor(new NumberMeanAggregator(mn));
		mn.setType(MeasureType.NUMBER);
		mn.getGraph().addEdge(new ValueToMeasureEdge("v2m", vn, mn), vn, mn, EdgeType.DIRECTED);
		MeasureToFactorNumberEdge m2f = new MeasureToFactorNumberEdge("m2f", mn, fixture.owner,
				InfluenceEffect.POSITIVE);
		m2f.setUsesLinearDist(false);
		m2f.setNormalizer(new NullNormalizer(m2f, "LOC", NormalizationRange.CLASS));
		vn.addValue(10);
		mn.getGraph().addEdge(m2f, mn, fixture.owner, EdgeType.DIRECTED);

		double result = fixture.process();

		// add additional test code here
		assertEquals(10.0, result, 0.1);
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
		DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		FactorNode node = new FactorNode(graph, "factor", "owner");
		fixture = new MeanEvaluator(node);
		node.setProcessor(fixture);
		graph.addVertex(node);
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
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EvaluatorTest.class);
	}
}