package net.siliconcode.quamoco.aggregator;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.model.qm.QualityModel;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

/**
 * The class <code>DistillerDataTest</code> contains tests for the class
 * <code>{@link DistillerData}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:41 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class DistillerDataTest {

    /**
     * Run the DistillerData(List<QualityModel>) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testDistillerData_1() throws Exception
    {
        List<QualityModel> models = Lists.newArrayList();
        models.add(new QualityModel("java", "", "", "", "java"));

        DistillerData result = new DistillerData(models);
        assertNotNull(result);
    }

    /**
     * Run the Map<String, Node> getFactorMap() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetFactorMap_1() throws Exception
    {
        List<QualityModel> models = Lists.newArrayList();
        models.add(new QualityModel("java", "", "", "", "java"));
        DistillerData fixture = new DistillerData(models);

        Map<String, Node> result = fixture.getFactorMap();

        assertNotNull(result);
    }

    /**
     * Run the Map<String, Node> getMeasureMap() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetMeasureMap_1() throws Exception
    {
        List<QualityModel> models = Lists.newArrayList();
        models.add(new QualityModel("java", "", "", "", "java"));
        DistillerData fixture = new DistillerData(models);

        Map<String, Node> result = fixture.getMeasureMap();

        assertNotNull(result);
    }

    /**
     * Run the Map<String, QualityModel> getModelMap() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetModelMap_1() throws Exception
    {
        List<QualityModel> models = Lists.newArrayList();
        models.add(new QualityModel("java", "", "", "", "java"));
        DistillerData fixture = new DistillerData(models);
        Map<String, QualityModel> result = fixture.getModelMap();

        assertTrue(result.containsKey("java"));
        assertNotNull(result.get("java"));
    }

    /**
     * Run the List<QualityModel> getModels() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetModels_1() throws Exception
    {
        List<QualityModel> models = Lists.newArrayList();
        models.add(new QualityModel("java", "", "", "", "java"));
        DistillerData fixture = new DistillerData(models);

        List<QualityModel> result = fixture.getModels();

        assertEquals(models, result);
    }

    /**
     * Run the Map<String, Node> getValuesMap() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetValuesMap_1() throws Exception
    {
        List<QualityModel> models = Lists.newArrayList();
        models.add(new QualityModel("java", "", "", "", "java"));
        DistillerData fixture = new DistillerData(models);

        Map<String, Node> result = fixture.getValuesMap();

        assertNotNull(result);
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
        new org.junit.runner.JUnitCore().run(DistillerDataTest.class);
    }
}