package net.siliconcode.quamoco.processor.aggregators;

import java.util.List;
import java.util.Map;
import org.easymock.EasyMock;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import org.junit.*;

import com.google.common.collect.Lists;

import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.MeasureNode;

import static org.junit.Assert.*;

/**
 * The class <code>NumberMinAggregatorTest</code> contains tests for the class
 * <code>{@link NumberMinAggregator}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:34 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class NumberMinAggregatorTest {

	private NumberMinAggregator fixture;

	/**
	 * Run the NumberMinAggregator(Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:34 PM
	 */
	@Test
	public void testNumberMinAggregator_1() throws Exception {
		Node owner = new MeasureNode(new DirectedSparseGraph<>(), "measure", "owner");

		NumberMinAggregator result = new NumberMinAggregator(owner);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the double aggregate(Map<Node,Double>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:34 PM
	 */
	@Test
	public void testAggregate_1() throws Exception {
		List<Double> values = Lists.newArrayList();
		values.add(10.0);
		values.add(20.0);
		values.add(3.0);

		double result = fixture.aggregate(values);

		// add additional test code here
		assertEquals(3.0, result, 0.001);
	}

	/**
	 * Run the double aggregate(Map<Node,Double>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:34 PM
	 */
	@Test
	public void testAggregate_2() throws Exception {
		List<Double> values = Lists.newArrayList();

		double result = fixture.aggregate(values);

		// add additional test code here
		assertEquals(0.0, result, 0.001);
	}

	/**
	 * Run the double aggregate(Map<Node,Double>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:34 PM
	 */
	@Test
	public void testAggregate_3() throws Exception {
		List<Double> values = null;

		double result = fixture.aggregate(values);

		// add additional test code here
		assertEquals(0.0, result, 0.001);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/26/16 6:34 PM
	 */
	@Before
	public void setUp() throws Exception {
		DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		MeasureNode node = new MeasureNode(graph, "measure", "owner");
		fixture = new NumberMinAggregator(node);
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 1/26/16 6:34 PM
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
	 * @generatedBy CodePro at 1/26/16 6:34 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NumberMinAggregatorTest.class);
	}
}