package net.siliconcode.quamoco.graph.node;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;

/**
 * The class <code>NormalizationNodeTest</code> contains tests for the class
 * <code>{@link NormalizationNode}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class NormalizationNodeTest {

	/**
	 * Run the NormalizationNode(DirectedSparseGraph<Node,Edge>,String,String)
	 * constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testNormalizationNode_1() throws Exception {
		final DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		final String name = "norm";
		final String owner = "node";

		final NormalizationNode result = new NormalizationNode(graph, name, owner);

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(false, result.isNormalized());
		Assert.assertEquals(null, result.getMethod());
		Assert.assertEquals(MeasureType.FINDINGS, result.getType());
		Assert.assertEquals("node", result.getOwnedBy());
		Assert.assertEquals("", result.getDescription());
		Assert.assertEquals("norm", result.toString());
		Assert.assertEquals("norm", result.getName());
	}

	/**
	 * Run the NormalizationNode(DirectedSparseGraph
	 * <Node,Edge>,String,String,long) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testNormalizationNode_2() throws Exception {
		final DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		final String name = "norm";
		final String owner = "node";
		final long id = 1L;

		final NormalizationNode result = new NormalizationNode(graph, name, owner, id);

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(false, result.isNormalized());
		Assert.assertEquals(null, result.getMethod());
		Assert.assertEquals(MeasureType.FINDINGS, result.getType());
		Assert.assertEquals("node", result.getOwnedBy());
		Assert.assertEquals("", result.getDescription());
		Assert.assertEquals("norm", result.toString());
		Assert.assertEquals("norm", result.getName());
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetValue_1() throws Exception {
		final NormalizationNode fixture = new NormalizationNode(null, "norm", "norm");

		final double result = fixture.getValue();
		Assert.assertEquals(0.0, result, 0.01);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Before
	public void setUp() throws Exception {
		// TODO: add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@After
	public void tearDown() throws Exception {
		// TODO: add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(NormalizationNodeTest.class);
	}
}