package net.siliconcode.quamoco.aggregator;

import java.util.List;
import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import org.sonar.api.batch.DecoratorContext;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.qm.QualityModel;

/**
 * The class <code>DistilledGraphCreatorTest</code> contains tests for the class <code>{@link DistilledGraphCreator}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:42 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class DistilledGraphCreatorTest {
    /**
     * Run the DistilledGraphCreator() constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testDistilledGraphCreator_1()
        throws Exception
    {

        DistilledGraphCreator result = new DistilledGraphCreator();

        // TODO: add additional test code here
        assertNotNull(result);
    }

    /**
     * Run the DirectedSparseGraph<Node, Edge> buildGraph(List<QualityModel>,DecoratorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testBuildGraph_1()
        throws Exception
    {
        DistilledGraphCreator fixture = new DistilledGraphCreator();
        List<QualityModel> models = EasyMock.createMock(List.class);
        DecoratorContext context = EasyMock.createMock(DecoratorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(models);
        EasyMock.replay(context);

        DirectedSparseGraph<Node, Edge> result = fixture.buildGraph(models, context);

        // TODO: add additional test code here
        EasyMock.verify(models);
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.createModelMap(QualityModelUtils.java:59)
        //       at net.siliconcode.quamoco.aggregator.DistillerData.<init>(DistillerData.java:51)
        //       at net.siliconcode.quamoco.aggregator.DistilledGraphCreator.buildGraph(DistilledGraphCreator.java:100)
        assertNotNull(result);
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
        new org.junit.runner.JUnitCore().run(DistilledGraphCreatorTest.class);
    }
}