package net.siliconcode.quamoco.processor.evaluators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.Node;

/**
 * The class <code>SingleMeasureEvaluatorTest</code> contains tests for the
 * class <code>{@link SingleMeasureEvaluator}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class SingleMeasureEvaluatorTest {

	private SingleMeasureEvaluator fixture;

	/**
	 * Run the SingleMeasureEvaluator(Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testSingleMeasureEvaluator_1() throws Exception {
		Node owner = new FactorNode(new DirectedSparseGraph<>(), "factor", "owners");

		SingleMeasureEvaluator result = new SingleMeasureEvaluator(owner);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the double evaluate(List<Double>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testEvaluate_1() throws Exception {
		List<Double> values = Lists.newArrayList();

		values.add(100.0);
		values.add(20.0);
		values.add(-5.0);

		double result = fixture.evaluate(values);

		// add additional test code here
		assertEquals(115.0, result, 0.001);
	}

	/**
	 * Run the double evaluate(List<Double>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testEvaluate_2() throws Exception {
		List<Double> values = Lists.newArrayList();

		double result = fixture.evaluate(values);

		// add additional test code here
		assertEquals(0.0, result, 0.001);
	}

	/**
	 * Run the double evaluate(List<Double>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testEvaluate_3() throws Exception {
		List<Double> values = null;

		double result = fixture.evaluate(values);

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
		fixture = new SingleMeasureEvaluator(new FactorNode(new DirectedSparseGraph<>(), "factor", "owner"));
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
		new org.junit.runner.JUnitCore().run(SingleMeasureEvaluatorTest.class);
	}
}