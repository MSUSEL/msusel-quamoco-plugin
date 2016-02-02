package net.siliconcode.quamoco.graph.node;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.ValueToMeasureEdge;
import net.siliconcode.quamoco.processor.NullProcessor;

/**
 * The class <code>MeasureNodeTest</code> contains tests for the class
 * <code>{@link MeasureNode}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class MeasureNodeTest {

	/**
	 * Run the MeasureNode(DirectedSparseGraph<Node,Edge>,String,String)
	 * constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testMeasureNode_1() throws Exception {
		DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		String name = "name";
		String owner = "owner";

		MeasureNode result = new MeasureNode(graph, name, owner);

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isNormalized());
		assertEquals(null, result.getMethod());
		assertEquals(MeasureType.FINDINGS, result.getType());
		assertEquals("owner", result.getOwnedBy());
		assertEquals("", result.getDescription());
		assertEquals("name", result.toString());
		assertEquals("name", result.getName());
	}

	/**
	 * Run the MeasureNode(DirectedSparseGraph<Node,Edge>,String,String,long)
	 * constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testMeasureNode_2() throws Exception {
		DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		String name = "name";
		String owner = "owner";
		long id = 1L;

		MeasureNode result = new MeasureNode(graph, name, owner, id);

		// TODO: add additional test code here
		assertNotNull(result);
		assertEquals(false, result.isNormalized());
		assertEquals(null, result.getMethod());
		assertEquals(MeasureType.FINDINGS, result.getType());
		assertEquals("owner", result.getOwnedBy());
		assertEquals("", result.getDescription());
		assertEquals("name", result.toString());
		assertEquals("name", result.getName());
		assertEquals(1L, result.getId());
	}

	/**
	 * Run the String getMethod() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetMethod_1() throws Exception {
		MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(true);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;

		String result = fixture.getMethod();

		// TODO: add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetType_1() throws Exception {
		MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(true);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;

		String result = fixture.getType();

		// TODO: add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetValue_1() throws Exception {
		DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		MeasureNode fixture = new MeasureNode(graph, "fixture", "fixture");
		ValueNode value = new ValueNode(graph, "value", "value", "");
		ValueToMeasureEdge edge = new ValueToMeasureEdge("edge", fixture, value);
		fixture.setProcessor(new NullProcessor(fixture));
		fixture.setType(MeasureType.NUMBER);
		fixture.value = 1.0;

		graph.addEdge(edge, value, fixture, EdgeType.DIRECTED);

		double result = fixture.getValue();

		assertEquals(1.0, result, 0.01);
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetValue_2() throws Exception {
		DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		MeasureNode fixture = new MeasureNode(graph, "fixture", "fixture");
		ValueNode value = new ValueNode(graph, "value", "value", "");
		ValueToMeasureEdge edge = new ValueToMeasureEdge("edge", fixture, value);

		fixture.setProcessor(new NullProcessor(fixture));
		fixture.setType(MeasureType.FINDINGS);

		graph.addEdge(edge, value, fixture, EdgeType.DIRECTED);

		assertTrue(Double.isInfinite(fixture.getValue()));
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetValue_3() throws Exception {
		DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		MeasureNode fixture = new MeasureNode(graph, "fixture", "fixture");
		ValueNode value = new ValueNode(graph, "value", "value", "");
		ValueToMeasureEdge edge = new ValueToMeasureEdge("edge", fixture, value);
		fixture.setProcessor(new NullProcessor(fixture));
		fixture.setType(MeasureType.NUMBER);

		graph.addEdge(edge, value, fixture, EdgeType.DIRECTED);

		double result = fixture.getValue();

		assertEquals(0, result, 0.1);
	}

	/**
	 * Run the String getXMLTag() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetXMLTag_1() throws Exception {
		MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(true);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;

		String result = fixture.getXMLTag();

		// TODO: add additional test code here
		assertEquals("<nodes name=\"\" description=\"\" id=\"1\" owner=\"\" type=\"MEASURE\">\n\t</nodes>", result);
	}

	/**
	 * Run the boolean isNormalized() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testIsNormalized_1() throws Exception {
		MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(true);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;

		boolean result = fixture.isNormalized();

		// TODO: add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isNormalized() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testIsNormalized_2() throws Exception {
		MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(false);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;

		boolean result = fixture.isNormalized();

		// TODO: add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the void setMethod(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetMethod_1() throws Exception {
		MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(true);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;
		String method = "";

		fixture.setMethod(method);

		// TODO: add additional test code here
		assertEquals(method, fixture.getMethod());
	}

	/**
	 * Run the void setNormalized(boolean) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetNormalized_1() throws Exception {
		MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(true);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;
		boolean normalized = true;

		fixture.setNormalized(normalized);

		assertEquals(normalized, fixture.isNormalized());
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetType_1() throws Exception {
		MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(true);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;
		String type = "";

		fixture.setType(type);

		assertEquals(type, fixture.getType());
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
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MeasureNodeTest.class);
	}
}