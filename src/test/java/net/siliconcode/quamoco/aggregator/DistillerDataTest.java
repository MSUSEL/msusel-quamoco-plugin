package net.siliconcode.quamoco.aggregator;

import java.util.List;
import java.util.Map;
import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.qm.QualityModel;

/**
 * The class <code>DistillerDataTest</code> contains tests for the class <code>{@link DistillerData}</code>.
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
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testDistillerData_1()
        throws Exception
    {
        List<QualityModel> models = EasyMock.createMock(List.class);
        // TODO: add mock object expectations here

        EasyMock.replay(models);

        DistillerData result = new DistillerData(models);

        // TODO: add additional test code here
        EasyMock.verify(models);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.createModelMap(QualityModelUtils.java:59)
        //       at net.siliconcode.quamoco.aggregator.DistillerData.<init>(DistillerData.java:51)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the Map<String, Node> getFactorMap() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetFactorMap_1()
        throws Exception
    {
        DistillerData fixture = new DistillerData(EasyMock.createNiceMock(List.class));

        Map<String, Node> result = fixture.getFactorMap();

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.createModelMap(QualityModelUtils.java:59)
        //       at net.siliconcode.quamoco.aggregator.DistillerData.<init>(DistillerData.java:51)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the Map<String, Node> getMeasureMap() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetMeasureMap_1()
        throws Exception
    {
        DistillerData fixture = new DistillerData(EasyMock.createNiceMock(List.class));

        Map<String, Node> result = fixture.getMeasureMap();

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.createModelMap(QualityModelUtils.java:59)
        //       at net.siliconcode.quamoco.aggregator.DistillerData.<init>(DistillerData.java:51)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the Map<String, QualityModel> getModelMap() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetModelMap_1()
        throws Exception
    {
        DistillerData fixture = new DistillerData(EasyMock.createNiceMock(List.class));

        Map<String, QualityModel> result = fixture.getModelMap();

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.createModelMap(QualityModelUtils.java:59)
        //       at net.siliconcode.quamoco.aggregator.DistillerData.<init>(DistillerData.java:51)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the List<QualityModel> getModels() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetModels_1()
        throws Exception
    {
        DistillerData fixture = new DistillerData(EasyMock.createNiceMock(List.class));

        List<QualityModel> result = fixture.getModels();

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.createModelMap(QualityModelUtils.java:59)
        //       at net.siliconcode.quamoco.aggregator.DistillerData.<init>(DistillerData.java:51)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the Map<String, Node> getValuesMap() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetValuesMap_1()
        throws Exception
    {
        DistillerData fixture = new DistillerData(EasyMock.createNiceMock(List.class));

        Map<String, Node> result = fixture.getValuesMap();

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.createModelMap(QualityModelUtils.java:59)
        //       at net.siliconcode.quamoco.aggregator.DistillerData.<init>(DistillerData.java:51)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
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
     * @generatedBy CodePro at 5/30/15 3:41 PM
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
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(DistillerDataTest.class);
    }
}