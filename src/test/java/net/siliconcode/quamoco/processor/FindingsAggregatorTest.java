package net.siliconcode.quamoco.processor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

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
import net.siliconcode.quamoco.processor.aggregators.FindingsUnionAggregator;

/**
 * The class <code>FindingsAggregatorTest</code> contains tests for the class
 * <code>{@link FindingsAggregator}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class FindingsAggregatorTest {

	private FindingsAggregator fixture;

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
		values.add(0.0);
		double result = fixture.aggregate(values);

		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the Set<Finding> processFindings() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testProcessFindings_1() throws Exception {
		Set<Finding> result = fixture.processFindings();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.size());
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

		FindingNode fn = new FindingNode(graph, "fn1", "owner", "rule1", "tool");
		fn.addFinding(new Finding(new FileNode("path2"), "issue1", "issue"));
		MeasureNode mn = new MeasureNode(graph, "measure1", "owner");
		mn.setType(MeasureType.FINDINGS);
		MeasureNode mn2 = new MeasureNode(graph, "measure2", "owner");
		mn2.setType(MeasureType.FINDINGS);
		FindingNode fn2 = new FindingNode(graph, "fn2", "owner", "rule1", "tool");
		fn2.addFinding(new Finding(new FileNode("path"), "issue1", "issue"));

		graph.addEdge(new FindingToMeasureEdge("edge1", fn, mn), fn, mn, EdgeType.DIRECTED);
		graph.addEdge(new MeasureToMeasureFindingsEdge("edge2", mn2, mn), mn2, mn, EdgeType.DIRECTED);
		graph.addEdge(new FindingToMeasureEdge("edge3", fn2, mn2), fn2, mn2, EdgeType.DIRECTED);

		fixture = new FindingsUnionAggregator(mn);
		mn.setProcessor(fixture);
		mn2.setProcessor(new FindingsUnionAggregator(mn2));
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
		new org.junit.runner.JUnitCore().run(FindingsAggregatorTest.class);
	}
}