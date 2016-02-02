package net.siliconcode.quamoco.graph.edge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.Finding;
import net.siliconcode.quamoco.graph.node.FindingNode;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.MeasureType;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.model.qm.FunctionType;
import net.siliconcode.quamoco.model.qm.InfluenceEffect;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.aggregators.FindingsUnionAggregator;
import net.siliconcode.quamoco.processor.lineardist.PositiveLinearDistribution;
import net.siliconcode.quamoco.processor.normalizers.NullNormalizer;

/**
 * The class <code>MeasureToFactorFindingsEdgeTest</code> contains tests for the
 * class <code>{@link MeasureToFactorFindingsEdge}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class MeasureToFactorFindingsEdgeTest {

	private MeasureToFactorFindingsEdge fixture;

	/**
	 * Run the MeasureToFactorFindingsEdge(String,InfluenceEffect) constructor
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testMeasureToFactorFindingsEdge_1() throws Exception {
		String name = "";
		InfluenceEffect effect = InfluenceEffect.NEGATIVE;

		MeasureToFactorFindingsEdge result = new MeasureToFactorFindingsEdge(name, null, null, effect);

		// add additional test code here
		assertNotNull(result);
		assertEquals("NEGATIVE", result.getInf());
		assertEquals(0.0, result.getValue(), 1.0);
		assertEquals(null, result.getDist());
		assertEquals(0.0, result.getMaxPoints(), 1.0);
		assertEquals(false, result.isUsesLinearDist());
		assertEquals(null, result.getNormalizer());
		assertEquals(1.0, result.getWeight(), 1.0);
		assertEquals(1.0, result.getUpperBound(), 1.0);
		assertEquals(0.0, result.getLowerBound(), 1.0);
		assertEquals("", result.getName());
	}

	/**
	 * Run the MeasureToFactorFindingsEdge(String,InfluenceEffect) constructor
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testMeasureToFactorFindingsEdge_2() throws Exception {
		String name = "";
		InfluenceEffect effect = null;

		MeasureToFactorFindingsEdge result = new MeasureToFactorFindingsEdge(name, null, null, effect);

		// add additional test code here
		assertNotNull(result);
		assertEquals("POSITIVE", result.getInf());
		assertEquals(0.0, result.getValue(), 1.0);
		assertEquals(null, result.getDist());
		assertEquals(0.0, result.getMaxPoints(), 1.0);
		assertEquals(false, result.isUsesLinearDist());
		assertEquals(null, result.getNormalizer());
		assertEquals(1.0, result.getWeight(), 1.0);
		assertEquals(1.0, result.getUpperBound(), 1.0);
		assertEquals(0.0, result.getLowerBound(), 1.0);
		assertEquals("", result.getName());
	}

	/**
	 * Run the String getInf() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetInf_1() throws Exception {
		String result = fixture.getInf();

		// add additional test code here
		assertEquals(InfluenceType.NEG, result);
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetValue_1() throws Exception {
		fixture.setUsesLinearDist(false);
		fixture.setInf(InfluenceType.POS);
		double result = fixture.getValue();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetValue_2() throws Exception {
		fixture.setUsesLinearDist(false);
		fixture.setInf(InfluenceType.NEG);
		double result = fixture.getValue();

		// add additional test code here
		assertEquals(0, result, 0.1);
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetValue_3() throws Exception {
		fixture.setUsesLinearDist(true);
		fixture.setInf(InfluenceType.POS);
		double result = fixture.getValue();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetValue_4() throws Exception {
		fixture.setUsesLinearDist(true);
		fixture.setInf(InfluenceType.NEG);
		double result = fixture.getValue();

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetValue_5() throws Exception {
		fixture.setUsesLinearDist(false);
		fixture.setInf(InfluenceType.POS);
		fixture.setWeight(0.5);
		double result = fixture.getValue();

		// add additional test code here
		assertEquals(0.5, result, 0.1);
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetValue_6() throws Exception {
		fixture.setUsesLinearDist(true);
		fixture.setInf(InfluenceType.POS);
		fixture.setWeight(0.5);
		double result = fixture.getValue();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the void setInf(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetInf_1() throws Exception {
		InfluenceEffect inf = InfluenceEffect.POSITIVE;
		fixture.setInf(inf.toString());

		// add additional test code here
		assertEquals(InfluenceType.POS, fixture.getInf());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Before
	public void setUp() throws Exception {
		DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		MeasureNode src = new MeasureNode(graph, "measure", "owner");
		src.setType(MeasureType.FINDINGS);
		src.setProcessor(new FindingsUnionAggregator(src));
		FactorNode dest = new FactorNode(graph, "factor", "owner");
		FindingNode srcsrc = new FindingNode(graph, "key", "owner", "finding", "tool");
		srcsrc.addFinding(new Finding(new FileNode("path"), "finding", "finding"));

		fixture = new MeasureToFactorFindingsEdge("", src, dest, InfluenceEffect.NEGATIVE);
		graph.addEdge(new FindingToMeasureEdge("f2m", srcsrc, src), srcsrc, src, EdgeType.DIRECTED);
		graph.addEdge(fixture, src, dest, EdgeType.DIRECTED);

		fixture.weight = 1.0;
		fixture.lowerBound = 0.0;
		fixture.upperBound = 1.0;
		fixture.usesLinearDist = true;
		fixture.maxPoints = 1.0;
		fixture.dist = new PositiveLinearDistribution(FunctionType.INCREASING);
		fixture.norm = new NullNormalizer(fixture, "", NormalizationRange.CLASS);
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
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
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MeasureToFactorFindingsEdgeTest.class);
	}
}