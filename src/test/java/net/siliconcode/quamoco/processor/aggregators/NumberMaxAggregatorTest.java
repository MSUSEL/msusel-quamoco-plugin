package net.siliconcode.quamoco.processor.aggregators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.Node;

/**
 * The class <code>NumberMaxAggregatorTest</code> contains tests for the class
 * <code>{@link NumberMaxAggregator}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class NumberMaxAggregatorTest {

	private NumberMaxAggregator fixture;

	/**
	 * Run the NumberMaxAggregator(Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testNumberMaxAggregator_1() throws Exception {
		Node owner = new MeasureNode(new DirectedSparseGraph<>(), "measure", "owner");

		NumberMaxAggregator result = new NumberMaxAggregator(owner);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the double aggregate(Map<Node,Double>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testAggregate_1() throws Exception {
		List<Double> values = Lists.newArrayList();
		values.add(10.0);
		values.add(20.0);
		values.add(3.0);

		double result = fixture.aggregate(values);

		// add additional test code here
		assertEquals(20.0, result, 0.001);
	}

	/**
	 * Run the double aggregate(Map<Node,Double>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
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
	 * @generatedBy CodePro at 1/26/16 6:35 PM
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
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Before
	public void setUp() throws Exception {
		DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		MeasureNode node = new MeasureNode(graph, "measure", "owner");
		fixture = new NumberMaxAggregator(node);
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
		new org.junit.runner.JUnitCore().run(NumberMaxAggregatorTest.class);
	}
}