package net.siliconcode.quamoco.graph.edge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.MeasureType;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.ValueNode;
import net.siliconcode.quamoco.model.qm.FunctionType;
import net.siliconcode.quamoco.model.qm.InfluenceEffect;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.aggregators.FindingsUnionAggregator;
import net.siliconcode.quamoco.processor.lineardist.PositiveLinearDistribution;
import net.siliconcode.quamoco.processor.normalizers.NullNormalizer;

/**
 * The class <code>MeasureToFactorNumberEdgeTest</code> contains tests for the
 * class <code>{@link MeasureToFactorNumberEdge}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class MeasureToFactorNumberEdgeTest {

	private MeasureToFactorNumberEdge fixture;

	/**
	 * Run the MeasureToFactorNumberEdge(String,InfluenceEffect) constructor
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testMeasureToFactorNumberEdge_1() throws Exception {
		String name = "";
		InfluenceEffect effect = InfluenceEffect.NEGATIVE;

		MeasureToFactorNumberEdge result = new MeasureToFactorNumberEdge(name, null, null, effect);

		// add additional test code here
		assertNotNull(result);
		assertEquals("NEGATIVE", result.getInf());
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
	 * Run the MeasureToFactorNumberEdge(String,InfluenceEffect) constructor
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testMeasureToFactorNumberEdge_2() throws Exception {
		String name = "";
		InfluenceEffect effect = null;

		MeasureToFactorNumberEdge result = new MeasureToFactorNumberEdge(name, null, null, effect);

		// add additional test code here
		assertNotNull(result);
		assertEquals("POSITIVE", result.getInf());
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
		double result = fixture.getValue();

		// add additional test code here
		assertEquals(2.0, result, 0.1);
		fail("unverified");
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
		double result = fixture.getValue();

		// add additional test code here
		assertEquals(0.0, result, 0.1);
		fail("unverified");
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
		double result = fixture.getValue();

		// add additional test code here
		assertEquals(-1.0, result, 0.1);
		fail("unverified");
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
		double result = fixture.getValue();

		// add additional test code here
		assertEquals(0.0, result, 0.1);
		fail("unverified");
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
		double result = fixture.getValue();

		// add additional test code here
		assertEquals(0.0, result, 0.1);
		fail("unverified");
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
		double result = fixture.getValue();

		// add additional test code here
		assertEquals(0.0, result, 0.1);
		fail("unverified");
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
		String inf = "";

		try {
			fixture.setInf(inf);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(InfluenceType.NEG, fixture.getInf());
		}
	}

	/**
	 * Run the void setInf(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetInf_2() throws Exception {
		String inf = null;

		try {
			fixture.setInf(inf);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(InfluenceType.NEG, fixture.getInf());
		}
	}

	/**
	 * Run the void setInf(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetInf_3() throws Exception {
		String inf = "Test";

		try {
			fixture.setInf(inf);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(InfluenceType.NEG, fixture.getInf());
		}
	}

	/**
	 * Run the void setInf(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetInf_4() throws Exception {
		String inf = InfluenceType.POS;

		try {
			fixture.setInf(inf);
			assertEquals(InfluenceType.POS, fixture.getInf());
		} catch (IllegalArgumentException e) {
			fail();
		}
	}

	/**
	 * Run the void setInf(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetInf_5() throws Exception {
		String inf = InfluenceType.NEG;

		try {
			fixture.setInf(inf);
			assertEquals(InfluenceType.NEG, fixture.getInf());
		} catch (IllegalArgumentException e) {
			fail();
		}
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
		src.setType(MeasureType.NUMBER);
		src.setProcessor(new FindingsUnionAggregator(src));
		FactorNode dest = new FactorNode(graph, "factor", "owner");
		ValueNode srcsrc = new ValueNode(graph, "key", "owner", "tool");
		srcsrc.addValue(10);
		srcsrc.addValue(100);

		fixture = new MeasureToFactorNumberEdge("", src, dest, InfluenceEffect.NEGATIVE);
		graph.addEdge(new ValueToMeasureEdge("v2m", srcsrc, src), srcsrc, src, EdgeType.DIRECTED);
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
		new org.junit.runner.JUnitCore().run(MeasureToFactorNumberEdgeTest.class);
	}
}