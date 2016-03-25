package net.siliconcode.quamoco.processor.aggregators;

import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.FindingToMeasureEdge;
import net.siliconcode.quamoco.graph.edge.MeasureToMeasureFindingsEdge;
import net.siliconcode.quamoco.graph.node.Finding;
import net.siliconcode.quamoco.graph.node.FindingNode;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.Node;

/**
 * The class <code>FindingsIntersectAggregatorTest</code> contains tests for the
 * class <code>{@link FindingsIntersectAggregator}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class FindingsIntersectAggregatorTest {

	private FindingsIntersectAggregator fixture;
	private FindingNode fn1;
	private FindingNode fn2;

	/**
	 * Run the FindingsIntersectAggregator(Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindingsIntersectAggregator_1() throws Exception {
		final Node owner = new MeasureNode(new DirectedSparseGraph<>(), "measure", "owner");

		final FindingsIntersectAggregator result = new FindingsIntersectAggregator(owner);

		// add additional test code here
		Assert.assertNotNull(result);
	}

	/**
	 * Run the Set<Finding> aggregate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testAggregate_1() throws Exception {
		fn1.addFinding(new Finding(new FileNode("file"), "issue1", "issue"));
		fn1.addFinding(new Finding(new FileNode("file2"), "issue2", "issue"));

		fn2.addFinding(new Finding(new FileNode("file"), "issue1", "issue2"));
		fn2.addFinding(new Finding(new FileNode("file2"), "issue2", "issue2"));

		final Set<Finding> result = fixture.aggregate();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertTrue(result.isEmpty());
	}

	/**
	 * Run the Set<Finding> aggregate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testAggregate_2() throws Exception {
		fn1.addFinding(new Finding(new FileNode("file"), "issue1", "issue"));
		fn1.addFinding(new Finding(new FileNode("file2"), "issue2", "issue"));

		fn2.addFinding(new Finding(new FileNode("file"), "issue1", "issue"));
		fn2.addFinding(new Finding(new FileNode("file2"), "issue2", "issue2"));

		final Set<Finding> result = fixture.aggregate();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(1, result.size());
	}

	/**
	 * Run the Set<Finding> aggregate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testAggregate_3() throws Exception {
		fn1.addFinding(new Finding(new FileNode("file"), "issue1", "issue"));
		fn1.addFinding(new Finding(new FileNode("file2"), "issue2", "issue"));

		final Set<Finding> result = fixture.aggregate();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertTrue(result.isEmpty());
	}

	/**
	 * Run the Set<Finding> aggregate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testAggregate_4() throws Exception {
		fn1.addFinding(new Finding(new FileNode("file"), "issue1", "issue"));

		fn2.addFinding(new Finding(new FileNode("file"), "issue1", "issue"));

		final Set<Finding> result = fixture.aggregate();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(1, result.size());
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
		final MeasureNode src = new MeasureNode(graph, "src", "owner");
		final MeasureNode dest = new MeasureNode(graph, "dest", "owner");
		fn1 = new FindingNode(graph, "key", "owner", "rule", "tool");
		fn2 = new FindingNode(graph, "key2", "owner", "rule2", "tool");

		fixture = new FindingsIntersectAggregator(dest);
		dest.setProcessor(fixture);

		src.setProcessor(new FindingsIntersectAggregator(src));

		graph.addEdge(new FindingToMeasureEdge("edge1", fn1, src), fn1, src, EdgeType.DIRECTED);
		graph.addEdge(new FindingToMeasureEdge("edge2", fn2, dest), fn2, dest, EdgeType.DIRECTED);
		graph.addEdge(new MeasureToMeasureFindingsEdge("edge3", src, dest), src, dest, EdgeType.DIRECTED);
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
		new org.junit.runner.JUnitCore().run(FindingsIntersectAggregatorTest.class);
	}
}