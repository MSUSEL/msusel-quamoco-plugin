package net.siliconcode.quamoco.distiller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.DecoratorContext;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.distiller.ModelDistiller;
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
    public void testModelDistiller_1() throws Exception
    {

        ModelDistiller result = new ModelDistiller();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getLanguage());
    }

    /**
     * Run the void buildGraph(DecoratorContext) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testBuildGraph_1() throws Exception
    {
        ModelDistiller fixture = new ModelDistiller();
        fixture.setLanguage("java");
        DecoratorContext context = null;

        fixture.buildGraph(context);

        assertNotNull(fixture.getGraph());
        assertNotEquals(0, fixture.getGraph().getVertexCount());
    }

    /**
     * Run the void buildGraph(DecoratorContext) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testBuildGraph_2() throws Exception
    {
        ModelDistiller fixture = new ModelDistiller();
        fixture.setLanguage("java");
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);

        EasyMock.replay(context);

        fixture.buildGraph(context);

        EasyMock.verify(context);

        assertNotNull(fixture.getGraph());
        assertNotEquals(0, fixture.getGraph().getVertexCount());
    }

    /**
     * Run the void buildGraph(DecoratorContext) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testBuildGraph_3() throws Exception
    {
        ModelDistiller fixture = new ModelDistiller();
        fixture.setLanguage("");
        DecoratorContext context = null;

        fixture.buildGraph(context);

        assertNotNull(fixture.getGraph());
        assertEquals(0, fixture.getGraph().getVertexCount());
    }

    /**
     * Run the DirectedSparseGraph<Node, Edge> getGraph() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetGraph_1() throws Exception
    {
        ModelDistiller fixture = new ModelDistiller();
        fixture.setLanguage("");

        DirectedSparseGraph<Node, Edge> result = fixture.getGraph();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(0, result.getEdgeCount());
        assertEquals(0, result.getVertexCount());
        assertEquals("Vertices\nEdges:", result.toString());
    }

    /**
     * Run the String getLanguage() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetLanguage_1() throws Exception
    {
        ModelDistiller fixture = new ModelDistiller();
        fixture.setLanguage("");

        String result = fixture.getLanguage();

        // TODO: add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the void setLanguage(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testSetLanguage_1() throws Exception
    {
        ModelDistiller fixture = new ModelDistiller();
        fixture.setLanguage("");
        String language = "";

        fixture.setLanguage(language);

        // TODO: add additional test code here
        assertEquals(language, fixture.getLanguage());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Before
    public void setUp() throws Exception
    {
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
    public void tearDown() throws Exception
    {
        // TODO: add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args
     *            the command line arguments
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(ModelDistillerTest.class);
    }
}