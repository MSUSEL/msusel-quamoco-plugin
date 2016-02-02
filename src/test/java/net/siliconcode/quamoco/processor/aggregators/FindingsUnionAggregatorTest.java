package net.siliconcode.quamoco.processor.aggregators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Set;

import org.junit.After;
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
import net.siliconcode.quamoco.graph.node.MeasureType;
import net.siliconcode.quamoco.graph.node.Node;

/**
 * The class <code>FindingsUnionAggregatorTest</code> contains tests for the
 * class <code>{@link FindingsUnionAggregator}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class FindingsUnionAggregatorTest {

	private FindingsUnionAggregator fixture;

	/**
	 * Run the FindingsUnionAggregator(Node) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindingsUnionAggregator_1() throws Exception {
		Node owner = new MeasureNode(new DirectedSparseGraph<>(), "measure", "owner");

		FindingsUnionAggregator result = new FindingsUnionAggregator(owner);

		// add additional test code here
		assertNotNull(result);
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
		Set<Finding> result = fixture.aggregate();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.size());
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
		FindingNode fn1 = new FindingNode(graph, "key1", "owner", "rule", "tool");
		FindingNode fn2 = new FindingNode(graph, "key2", "owner", "rule", "tool");

		fn1.addFinding(new Finding(new FileNode("path1"), "issue1", "issue"));
		fn1.addFinding(new Finding(new FileNode("path2"), "issue1", "issue"));
		fn2.addFinding(new Finding(new FileNode("path1"), "issue2", "issue"));
		fn2.addFinding(new Finding(new FileNode("path2"), "issue2", "issue"));

		MeasureNode owner = new MeasureNode(graph, "measure", "owner");
		owner.setType(MeasureType.FINDINGS);

		MeasureNode mn = new MeasureNode(graph, "measure2", "owner");
		mn.setType(MeasureType.FINDINGS);
		mn.setProcessor(new FindingsUnionAggregator(mn));

		graph.addEdge(new FindingToMeasureEdge("edge", fn1, owner), fn1, owner, EdgeType.DIRECTED);
		graph.addEdge(new FindingToMeasureEdge("edge2", fn2, mn), fn2, owner, EdgeType.DIRECTED);
		graph.addEdge(new MeasureToMeasureFindingsEdge("edge3", mn, owner), mn, owner, EdgeType.DIRECTED);

		fixture = new FindingsUnionAggregator(owner);
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
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FindingsUnionAggregatorTest.class);
	}
}