package net.siliconcode.quamoco.aggregator;

import java.util.List;
import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.qm.QualityModel;

/**
 * The class <code>EdgePopulatorTest</code> contains tests for the class <code>{@link EdgePopulator}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:42 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class EdgePopulatorTest {
    /**
     * Run the EdgePopulator() constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testEdgePopulator_1()
        throws Exception
    {

        EdgePopulator result = new EdgePopulator();

        // TODO: add additional test code here
        assertNotNull(result);
    }

    /**
     * Run the void modifyGraph(DistillerData,DirectedSparseGraph<Node,Edge>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testModifyGraph_1()
        throws Exception
    {
        EdgePopulator fixture = new EdgePopulator();
        DistillerData data = new DistillerData(EasyMock.createNiceMock(List.class));
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph();

        fixture.modifyGraph(data, graph);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.createModelMap(QualityModelUtils.java:59)
        //       at net.siliconcode.quamoco.aggregator.DistillerData.<init>(DistillerData.java:51)
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Before
    public void setUp()
        throws Exception
    {
        // TODO: add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @After
    public void tearDown()
        throws Exception
    {
        // TODO: add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(EdgePopulatorTest.class);
    }
}