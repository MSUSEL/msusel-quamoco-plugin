package net.siliconcode.quamoco.processor.evaluators;

import java.util.List;
import org.easymock.EasyMock;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import org.junit.*;

import com.google.common.collect.Lists;

import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.FactorNode;
import static org.junit.Assert.*;

/**
 * The class <code>WeightedSumEvaluatorTest</code> contains tests for the class
 * <code>{@link WeightedSumEvaluator}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class WeightedSumEvaluatorTest {

	private WeightedSumEvaluator fixture;

	/**
	 * Run the WeightedSumEvaluator(Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testWeightedSumEvaluator_1() throws Exception {
		Node owner = new FactorNode(new DirectedSparseGraph<>(), "factor", "owner");

		WeightedSumEvaluator result = new WeightedSumEvaluator(owner);

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
		values.add(10.0);
		values.add(15.0);
		values.add(20.0);

		double result = fixture.evaluate(values);

		// add additional test code here
		assertEquals(45.0, result, 0.001);
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
		Node owner = new FactorNode(new DirectedSparseGraph<>(), "factor", "owner");
		fixture = new WeightedSumEvaluator(owner);
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
		new org.junit.runner.JUnitCore().run(WeightedSumEvaluatorTest.class);
	}
}