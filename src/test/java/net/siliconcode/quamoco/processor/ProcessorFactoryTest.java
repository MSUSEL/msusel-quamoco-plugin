package net.siliconcode.quamoco.processor;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.INode;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.MeasureNode;

/**
 * The class <code>ProcessorFactoryTest</code> contains tests for the class
 * <code>{@link ProcessorFactory}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class ProcessorFactoryTest {
	/**
	 * Run the ProcessorFactory getInstance(INode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testGetInstance_1() throws Exception {
		INode node = new FactorNode(new DirectedSparseGraph<>(), "factor", "owner");
		INode node2 = new FactorNode(new DirectedSparseGraph<>(), "factor2", "owner");

		ProcessorFactory result = ProcessorFactory.getInstance(node);
		ProcessorFactory result2 = ProcessorFactory.getInstance(node2);

		// add additional test code here
		assertNotNull(result);
		assertTrue(result instanceof EvaluatorFactory);
		assertSame(result, result2);
	}

	/**
	 * Run the ProcessorFactory getInstance(INode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testGetInstance_2() throws Exception {
		INode node = new MeasureNode(new DirectedSparseGraph<>(), "measure", "owner");
		INode node2 = new MeasureNode(new DirectedSparseGraph<>(), "measure2", "owner");

		ProcessorFactory result = ProcessorFactory.getInstance(node);
		ProcessorFactory result2 = ProcessorFactory.getInstance(node2);

		// add additional test code here
		assertNotNull(result);
		assertTrue(result instanceof AggregatorFactory);
		assertSame(result, result2);
	}

	/**
	 * Run the ProcessorFactory getInstance(INode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testGetInstance_3() throws Exception {
		INode node = null;

		ProcessorFactory result = ProcessorFactory.getInstance(node);

		// add additional test code here
		assertNull(result);
	}

	/**
	 * Run the ProcessorFactory getInstance(INode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testGetInstance_4() throws Exception {
		INode node = new MeasureNode(new DirectedSparseGraph<>(), "measure", "owner");
		INode node2 = new FactorNode(new DirectedSparseGraph<>(), "factor2", "owner");

		ProcessorFactory result = ProcessorFactory.getInstance(node);
		ProcessorFactory result2 = ProcessorFactory.getInstance(node2);

		// add additional test code here
		assertNotNull(result);
		assertNotNull(result2);
		assertTrue(result instanceof AggregatorFactory);
		assertTrue(result2 instanceof EvaluatorFactory);
		assertNotSame(result, result2);
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
		// add additional set up code here
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
		new org.junit.runner.JUnitCore().run(ProcessorFactoryTest.class);
	}
}