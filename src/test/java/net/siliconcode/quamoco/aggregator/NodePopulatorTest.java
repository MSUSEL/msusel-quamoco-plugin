package net.siliconcode.quamoco.aggregator;

import java.util.List;

import org.easymock.EasyMock;
import org.junit.*;

import com.google.common.collect.Lists;

import static org.junit.Assert.*;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.InfluenceEdge;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.qm.Evaluation;
import net.siliconcode.quamoco.aggregator.qm.Factor;
import net.siliconcode.quamoco.aggregator.qm.Influence;
import net.siliconcode.quamoco.aggregator.qm.Measure;
import net.siliconcode.quamoco.aggregator.qm.QualityModel;
import net.siliconcode.quamoco.aggregator.qm.Ranking;

/**
 * The class <code>NodePopulatorTest</code> contains tests for the class
 * <code>{@link NodePopulator}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:42 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class NodePopulatorTest {

    /**
     * Run the NodePopulator() constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testNodePopulator_1() throws Exception
    {

        NodePopulator result = new NodePopulator();

        // TODO: add additional test code here
        assertNotNull(result);
    }

    /**
     * Run the void modifyGraph(DistillerData,DirectedSparseGraph<Node,Edge>)
     * method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testModifyGraph_1() throws Exception
    {
        List<QualityModel> models = Lists.newArrayList();
        QualityModel model = new QualityModel("java", "", "", "", "java");
        models.add(model);
        Factor f1 = new Factor("factor1", "", "", "", "factor1", "java.qm#factor2", "java.qm#factor1");
        f1.addInfluence(new Influence(InfluenceEdge.POS, "", "java.qm#factor2", ""));
        Factor f2 = new Factor("factor2", "", "", "", "factor2", null, "java.qm#factor2");
        Measure m1 = new Measure("measure1", "", "measure1", "", "", "", "", null, "java.qm#measure1");
        m1.addParent("java.qm#factor1");
        Evaluation eval = new Evaluation("eval1", "", "", 0, "", "java.qm#factor2", "", "java.qm#eval1");
        Ranking rank = new Ranking("1", "", "0.25", null, "java.qm#factor1", null, "", "");
        eval.addRanking(rank);
        model.addEvaluation(eval);
        model.addFactor(f1);
        model.addFactor(f2);
        model.addMeasure(m1);

        NodePopulator fixture = new NodePopulator();
        DistillerData data = new DistillerData(models);
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

        fixture.modifyGraph(data, graph);

        assertEquals(3, graph.getVertexCount());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:42 PM
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
     * @generatedBy CodePro at 5/30/15 3:42 PM
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
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(NodePopulatorTest.class);
    }
}