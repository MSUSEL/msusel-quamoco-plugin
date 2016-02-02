package net.siliconcode.quamoco.graph.edge;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.ValueNode;
import net.siliconcode.quamoco.model.qm.InfluenceEffect;

/**
 * The class <code>InfluenceEdgeTest</code> contains tests for the class
 * <code>{@link FactorToFactorEdge}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class FactorToFactorEdgeTest {

	private FactorToFactorEdge fixture;

	/**
	 * Run the InfluenceEdge(String) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testFactorToFactorEdge_1() throws Exception {
		String name = "TestEdge";

		FactorToFactorEdge result = new FactorToFactorEdge(name, null, null, InfluenceEffect.POSITIVE);

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(1.0, result.getWeight(), 1.0);
		assertEquals(InfluenceType.POS, result.getInf());
		assertEquals(0.0, result.getUpperBound(), 1.0);
		assertEquals(0.0, result.getLowerBound(), 1.0);
		assertEquals(name, result.getName());
	}

	/**
	 * Run the String getInf() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetInf_1() throws Exception {
		String result = fixture.getInf();

		// TODO: add additional test code here
		assertEquals(InfluenceType.POS, result);
	}

	/**
	 * Run the double getLowerBound() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetLowerBound_1() throws Exception {
		double result = fixture.getLowerBound();

		// TODO: add additional test code here
		assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getUpperBound() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetUpperBound_1() throws Exception {
		double result = fixture.getUpperBound();

		// TODO: add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getValue(DirectedSparseGraph<Node,Edge>,Node) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetValue_1() throws Exception {
		DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		FactorNode dest = new FactorNode(graph, "dest", "dest");
		ValueNode src = new ValueNode(graph, "source", "source", "");

		graph.addEdge(fixture, src, dest, EdgeType.DIRECTED);
		fixture.src = src;
		fixture.dest = dest;

		// TODO: add additional test code here
		fail();
	}

	/**
	 * Run the double getValue(DirectedSparseGraph<Node,Edge>,Node) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetValue_2() throws Exception {
		DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		FactorNode dest = new FactorNode(graph, "dest", "dest");
		ValueNode src = new ValueNode(graph, "source", "source", "");

		graph.addEdge(fixture, src, dest, EdgeType.DIRECTED);
		fixture.src = src;
		fixture.dest = dest;

		// TODO: add additional test code here
		fail();
	}

	/**
	 * Run the double getValue(DirectedSparseGraph<Node,Edge>,Node) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetValue_3() throws Exception {
		DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		FactorNode dest = new FactorNode(graph, "dest", "dest");
		ValueNode src = new ValueNode(graph, "source", "source", "");

		graph.addEdge(fixture, src, dest, EdgeType.DIRECTED);
		fixture.src = src;
		fixture.dest = dest;

		// TODO: add additional test code here
		fail();
	}

	/**
	 * Run the double getValue(DirectedSparseGraph<Node,Edge>,Node) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetValue_4() throws Exception {
		DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		FactorNode dest = new FactorNode(graph, "dest", "dest");
		ValueNode src = new ValueNode(graph, "source", "source", "");

		graph.addEdge(fixture, src, dest, EdgeType.DIRECTED);
		fixture.src = src;
		fixture.dest = dest;

		// TODO: add additional test code here
		fail();
	}

	/**
	 * Run the double getWeight() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetWeight_1() throws Exception {
		double result = fixture.getWeight();

		// TODO: add additional test code here
		assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the void setInf(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetInf_1() throws Exception {
		String inf = "";

		try {
			fixture.setInf(inf);
			fail();
		} catch (IllegalArgumentException e) {

		}
	}

	/**
	 * Run the void setInf(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetInf_2() throws Exception {
		String inf = null;

		try {
			fixture.setInf(inf);
			fail();
		} catch (IllegalArgumentException e) {

		}
	}

	/**
	 * Run the void setInf(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetInf_3() throws Exception {
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
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetInf_4() throws Exception {
		String inf = InfluenceType.NEG;

		try {
			fixture.setInf(inf);
			assertEquals(InfluenceType.NEG, fixture.getInf());
		} catch (IllegalArgumentException e) {
			fail();
		}
	}

	/**
	 * Run the void setInf(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetInf_5() throws Exception {
		String inf = "test";

		try {
			fixture.setInf(inf);
			fail();
		} catch (IllegalArgumentException e) {

		}
	}

	/**
	 * Run the void setLowerBound(double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetLowerBound_1() throws Exception {
		double lowerBound = 0.0;

		try {
			fixture.setLowerBound(lowerBound);
			assertEquals(lowerBound, fixture.getLowerBound(), 1.0);
		} catch (IllegalArgumentException e) {
			fail();
		}
	}

	/**
	 * Run the void setLowerBound(double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetLowerBound_2() throws Exception {
		double lowerBound = 2.0;

		try {
			fixture.setLowerBound(lowerBound);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(0.0, fixture.getLowerBound(), 1.0);
		}
	}

	/**
	 * Run the void setUpperBound(double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetUpperBound_1() throws Exception {
		double upperBound = 0.0;
		fixture.setLowerBound(1.0);
		try {
			fixture.setUpperBound(upperBound);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(1.0, fixture.getUpperBound(), 1.0);
		}
	}

	/**
	 * Run the void setUpperBound(double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetUpperBound_2() throws Exception {
		double upperBound = 2.0;

		try {
			fixture.setUpperBound(upperBound);
			assertEquals(upperBound, fixture.getUpperBound(), 1.0);
		} catch (IllegalArgumentException e) {
			fail();
		}
	}

	/**
	 * Run the void setWeight(double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetWeight_1() throws Exception {
		double weight = 0.0;

		try {
			fixture.setWeight(weight);
			assertEquals(weight, fixture.getWeight(), 0.01);
		} catch (IllegalArgumentException e) {
			fail();
		}
	}

	/**
	 * Run the void setWeight(double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetWeight_2() throws Exception {
		double weight = -1.0;

		try {
			fixture.setWeight(weight);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(1.0, fixture.getWeight(), 0.01);
		}
	}

	/**
	 * Run the void setWeight(double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetWeight_3() throws Exception {
		double weight = 1.5;

		try {
			fixture.setWeight(weight);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals(1.0, fixture.getWeight(), 0.01);
		}
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FactorToFactorEdgeTest.class);
	}

	/**
	 * 
	 */
	@Before
	public void setUp() {
		fixture = new FactorToFactorEdge("", null, null, InfluenceEffect.POSITIVE);
		fixture.setInf(InfluenceType.POS);
		fixture.setUpperBound(1.0);
		fixture.setWeight(1.0);
		fixture.setLowerBound(0.0);
	}
}