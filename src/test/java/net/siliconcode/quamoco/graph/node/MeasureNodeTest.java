package net.siliconcode.quamoco.graph.node;

import org.junit.After;
import org.junit.Assert;
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
		final DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		final String name = "name";
		final String owner = "owner";

		final MeasureNode result = new MeasureNode(graph, name, owner);

		// TODO: add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(false, result.isNormalized());
		Assert.assertEquals(null, result.getMethod());
		Assert.assertEquals(MeasureType.FINDINGS, result.getType());
		Assert.assertEquals("owner", result.getOwnedBy());
		Assert.assertEquals("", result.getDescription());
		Assert.assertEquals("name", result.toString());
		Assert.assertEquals("name", result.getName());
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
		final DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		final String name = "name";
		final String owner = "owner";
		final long id = 1L;

		final MeasureNode result = new MeasureNode(graph, name, owner, id);

		// TODO: add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(false, result.isNormalized());
		Assert.assertEquals(null, result.getMethod());
		Assert.assertEquals(MeasureType.FINDINGS, result.getType());
		Assert.assertEquals("owner", result.getOwnedBy());
		Assert.assertEquals("", result.getDescription());
		Assert.assertEquals("name", result.toString());
		Assert.assertEquals("name", result.getName());
		Assert.assertEquals(1L, result.getId());
	}

	/**
	 * Run the String getMethod() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetMethod_1() throws Exception {
		final MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(true);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;

		final String result = fixture.getMethod();

		// TODO: add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetType_1() throws Exception {
		final MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(true);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;

		final String result = fixture.getType();

		// TODO: add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetValue_1() throws Exception {
		final DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		final MeasureNode fixture = new MeasureNode(graph, "fixture", "fixture");
		final ValueNode value = new ValueNode(graph, "value", "value", "");
		final ValueToMeasureEdge edge = new ValueToMeasureEdge("edge", fixture, value);
		fixture.setProcessor(new NullProcessor(fixture));
		fixture.setType(MeasureType.NUMBER);
		fixture.value = 1.0;

		graph.addEdge(edge, value, fixture, EdgeType.DIRECTED);

		final double result = fixture.getValue();

		Assert.assertEquals(1.0, result, 0.01);
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetValue_2() throws Exception {
		final DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		final MeasureNode fixture = new MeasureNode(graph, "fixture", "fixture");
		final ValueNode value = new ValueNode(graph, "value", "value", "");
		final ValueToMeasureEdge edge = new ValueToMeasureEdge("edge", fixture, value);

		fixture.setProcessor(new NullProcessor(fixture));
		fixture.setType(MeasureType.FINDINGS);

		graph.addEdge(edge, value, fixture, EdgeType.DIRECTED);

		Assert.assertTrue(Double.isInfinite(fixture.getValue()));
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetValue_3() throws Exception {
		final DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		final MeasureNode fixture = new MeasureNode(graph, "fixture", "fixture");
		final ValueNode value = new ValueNode(graph, "value", "value", "");
		final ValueToMeasureEdge edge = new ValueToMeasureEdge("edge", fixture, value);
		fixture.setProcessor(new NullProcessor(fixture));
		fixture.setType(MeasureType.NUMBER);

		graph.addEdge(edge, value, fixture, EdgeType.DIRECTED);

		final double result = fixture.getValue();

		Assert.assertEquals(0, result, 0.1);
	}

	/**
	 * Run the String getXMLTag() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testGetXMLTag_1() throws Exception {
		final MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(true);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;

		final String result = fixture.getXMLTag();

		// TODO: add additional test code here
		Assert.assertEquals("<nodes name=\"\" description=\"\" id=\"1\" owner=\"\" type=\"MEASURE\">\n\t</nodes>",
				result);
	}

	/**
	 * Run the boolean isNormalized() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testIsNormalized_1() throws Exception {
		final MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(true);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;

		final boolean result = fixture.isNormalized();

		// TODO: add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean isNormalized() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testIsNormalized_2() throws Exception {
		final MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(false);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;

		final boolean result = fixture.isNormalized();

		// TODO: add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the void setMethod(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetMethod_1() throws Exception {
		final MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(true);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;
		final String method = "";

		fixture.setMethod(method);

		// TODO: add additional test code here
		Assert.assertEquals(method, fixture.getMethod());
	}

	/**
	 * Run the void setNormalized(boolean) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetNormalized_1() throws Exception {
		final MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(true);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;
		final boolean normalized = true;

		fixture.setNormalized(normalized);

		Assert.assertEquals(normalized, fixture.isNormalized());
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:38 PM
	 */
	@Test
	public void testSetType_1() throws Exception {
		final MeasureNode fixture = new MeasureNode(new DirectedSparseGraph<>(), "name", "owner");
		fixture.setType("");
		fixture.setNormalized(true);
		fixture.setMethod("");
		fixture.name = "";
		fixture.value = 1.0;
		fixture.graph = new DirectedSparseGraph<>();
		fixture.ownedBy = "";
		fixture.description = "";
		fixture.id = 1L;
		final String type = "";

		fixture.setType(type);

		Assert.assertEquals(type, fixture.getType());
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
		new org.junit.runner.JUnitCore().run(MeasureNodeTest.class);
	}
}