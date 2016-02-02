package net.siliconcode.quamoco.graph.edge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.model.qm.FunctionType;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.Normalizer;
import net.siliconcode.quamoco.processor.lineardist.LinearDistribution;
import net.siliconcode.quamoco.processor.lineardist.NegativeLinearDistribution;
import net.siliconcode.quamoco.processor.lineardist.PositiveLinearDistribution;
import net.siliconcode.quamoco.processor.normalizers.NullNormalizer;

/**
 * The class <code>WeightedRankedEdgeTest</code> contains tests for the class
 * <code>{@link WeightedRankedEdge}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class WeightedRankedEdgeTest {

	private WeightedRankedEdge fixture;

	/**
	 * Run the LinearDistribution getDist() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetDist_1() throws Exception {
		LinearDistribution result = fixture.getDist();

		// add additional test code here
		assertNotNull(result);
		assertTrue(result instanceof PositiveLinearDistribution);
	}

	/**
	 * Run the double getLowerBound() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetLowerBound_1() throws Exception {
		double result = fixture.getLowerBound();

		// add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getMaxPoints() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetMaxPoints_1() throws Exception {
		double result = fixture.getMaxPoints();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the Normalizer getNormalizer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetNormalizer_1() throws Exception {
		Normalizer result = fixture.getNormalizer();

		// add additional test code here
		assertNotNull(result);
		assertEquals("LOC", result.getMetric());
	}

	/**
	 * Run the double getUpperBound() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetUpperBound_1() throws Exception {
		double result = fixture.getUpperBound();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getWeight() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetWeight_1() throws Exception {
		double result = fixture.getWeight();

		// add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the boolean isUsesLinearDist() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testIsUsesLinearDist_1() throws Exception {
		boolean result = fixture.isUsesLinearDist();

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isUsesLinearDist() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testIsUsesLinearDist_2() throws Exception {
		fixture.setUsesLinearDist(false);
		boolean result = fixture.isUsesLinearDist();

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setDist(LinearDistribution) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetDist_1() throws Exception {
		LinearDistribution lindist = new NegativeLinearDistribution(FunctionType.DECREASING);

		fixture.setDist(lindist);

		assertSame(lindist, fixture.getDist());
	}

	/**
	 * Run the void setLowerBound(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetLowerBound_1() throws Exception {
		double lowerBound = 0.5;

		try {
			fixture.setLowerBound(lowerBound);
			assertEquals(0.5, fixture.getLowerBound(), 0.001);
		} catch (IllegalArgumentException e) {
			fail();
		}

	}

	/**
	 * Run the void setLowerBound(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetLowerBound_2() throws Exception {
		fixture.setUpperBound(0.0);
		double lowerBound = 0.5;

		try {
			fixture.setLowerBound(lowerBound);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(0, fixture.getLowerBound(), 0.001);
		}
	}

	/**
	 * Run the void setMaxPoints(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetMaxPoints_1() throws Exception {
		double maxPoints = 100.0;

		try {
			fixture.setMaxPoints(maxPoints);
			assertEquals(maxPoints, fixture.getMaxPoints(), 0.001);
		} catch (IllegalArgumentException e) {
			fail();
		}
	}

	/**
	 * Run the void setMaxPoints(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetMaxPoints_2() throws Exception {
		double maxPoints = 0.0;

		try {
			fixture.setMaxPoints(maxPoints);
			assertEquals(maxPoints, fixture.getMaxPoints(), 0.001);
		} catch (IllegalArgumentException e) {
			fail();
		}
	}

	/**
	 * Run the void setMaxPoints(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetMaxPoints_3() throws Exception {
		double maxPoints = -1.0;

		try {
			fixture.setMaxPoints(maxPoints);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(1.0, fixture.getMaxPoints(), 0.001);
		}
	}

	/**
	 * Run the void setNormalizer(Normalizer) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetNormalizer_1() throws Exception {
		Normalizer normalizer = new NullNormalizer(fixture, "NOC", NormalizationRange.CLASS);

		fixture.setNormalizer(normalizer);

		// add additional test code here
		assertNotNull(fixture.getNormalizer());
		assertEquals("NOC", fixture.getNormalizer().getMetric());
		assertEquals(NormalizationRange.CLASS, fixture.getNormalizer().getNormalizationRange());
	}

	/**
	 * Run the void setUpperBound(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetUpperBound_1() throws Exception {
		double upperBound = 0.5;

		try {
			fixture.setUpperBound(upperBound);
			assertEquals(upperBound, fixture.getUpperBound(), 0.001);
		} catch (IllegalArgumentException e) {
			fail();
		}
	}

	/**
	 * Run the void setUpperBound(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetUpperBound_2() throws Exception {
		fixture.setLowerBound(1.0);
		double upperBound = 0.5;

		try {
			fixture.setUpperBound(upperBound);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(1.0, fixture.getUpperBound(), 0.001);
		}
	}

	/**
	 * Run the void setUsesLinearDist(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetUsesLinearDist_1() throws Exception {
		boolean usesLinearDist = true;

		fixture.setUsesLinearDist(usesLinearDist);

		assertTrue(fixture.usesLinearDist);
	}

	/**
	 * Run the void setWeight(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetWeight_1() throws Exception {
		double weight = 1.0;

		try {
			fixture.setWeight(weight);
			assertEquals(weight, fixture.getWeight(), 0.001);
		} catch (IllegalArgumentException e) {
			fail();
		}
	}

	/**
	 * Run the void setWeight(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetWeight_2() throws Exception {
		double weight = -1.0;

		try {
			fixture.setWeight(weight);
			fail();
		} catch (IllegalArgumentException e) {
			// add additional test code here
			assertEquals(1.0, fixture.getWeight(), 0.001);
		}
	}

	/**
	 * Run the void setWeight(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetWeight_3() throws Exception {
		double weight = 0.0;

		try {
			fixture.setWeight(weight);
			assertEquals(weight, fixture.getWeight(), 0.001);
		} catch (IllegalArgumentException e) {
			fail();
		}
	}

	/**
	 * Run the void setWeight(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetWeight_4() throws Exception {
		double weight = 2.0;

		try {
			fixture.setWeight(weight);
			fail();
		} catch (IllegalArgumentException e) {
			// add additional test code here
			assertEquals(1.0, fixture.getWeight(), 0.001);
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

		FactorNode src = new FactorNode(graph, "src", "factor");
		FactorNode dest = new FactorNode(graph, "src", "factor");
		fixture = new MeasureToMeasureFindingsNumberEdge("edge", src, dest);

		fixture.upperBound = 1.0;
		fixture.norm = new NullNormalizer(fixture, "LOC", NormalizationRange.CLASS);
		fixture.dist = new PositiveLinearDistribution(FunctionType.DECREASING);
		fixture.usesLinearDist = true;
		fixture.weight = 1.0;
		fixture.maxPoints = 1.0;
		fixture.lowerBound = 0.0;
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
		new org.junit.runner.JUnitCore().run(WeightedRankedEdgeTest.class);
	}
}