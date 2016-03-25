package net.siliconcode.quamoco.distiller;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.DecoratorContext;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.node.Node;

/**
 * The class <code>ModelDistillerTest</code> contains tests for the class
 * <code>{@link ModelDistiller}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:41 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class ModelDistillerTest {

	/**
	 * Run the ModelDistiller() constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testModelDistiller_1() throws Exception {

		final ModelDistiller result = new ModelDistiller();

		// TODO: add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(null, result.getLanguage());
	}

	/**
	 * Run the void buildGraph(DecoratorContext) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testBuildGraph_1() throws Exception {
		final ModelDistiller fixture = new ModelDistiller();
		fixture.setLanguage("java");
		final DecoratorContext context = null;

		fixture.buildGraph(context);

		Assert.assertNotNull(fixture.getGraph());
		Assert.assertNotEquals(0, fixture.getGraph().getVertexCount());
	}

	/**
	 * Run the void buildGraph(DecoratorContext) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testBuildGraph_2() throws Exception {
		final ModelDistiller fixture = new ModelDistiller();
		fixture.setLanguage("java");
		final DecoratorContext context = EasyMock.createMock(DecoratorContext.class);

		EasyMock.replay(context);

		fixture.buildGraph(context);

		EasyMock.verify(context);

		Assert.assertNotNull(fixture.getGraph());
		Assert.assertNotEquals(0, fixture.getGraph().getVertexCount());
	}

	/**
	 * Run the void buildGraph(DecoratorContext) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testBuildGraph_3() throws Exception {
		final ModelDistiller fixture = new ModelDistiller();
		fixture.setLanguage("");
		final DecoratorContext context = null;

		fixture.buildGraph(context);

		Assert.assertNotNull(fixture.getGraph());
		Assert.assertEquals(0, fixture.getGraph().getVertexCount());
	}

	/**
	 * Run the DirectedSparseGraph<Node, Edge> getGraph() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetGraph_1() throws Exception {
		final ModelDistiller fixture = new ModelDistiller();
		fixture.setLanguage("");

		final DirectedSparseGraph<Node, Edge> result = fixture.getGraph();

		// TODO: add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(0, result.getEdgeCount());
		Assert.assertEquals(0, result.getVertexCount());
		Assert.assertEquals("Vertices\nEdges:", result.toString());
	}

	/**
	 * Run the String getLanguage() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetLanguage_1() throws Exception {
		final ModelDistiller fixture = new ModelDistiller();
		fixture.setLanguage("");

		final String result = fixture.getLanguage();

		// TODO: add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the void setLanguage(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testSetLanguage_1() throws Exception {
		final ModelDistiller fixture = new ModelDistiller();
		fixture.setLanguage("");
		final String language = "";

		fixture.setLanguage(language);

		// TODO: add additional test code here
		Assert.assertEquals(language, fixture.getLanguage());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 * @generatedBy CodePro at 5/30/15 3:41 PM
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
	 * @generatedBy CodePro at 5/30/15 3:41 PM
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
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(ModelDistillerTest.class);
	}
}