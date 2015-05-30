package net.siliconcode.quamoco.aggregator;

import java.util.List;
import java.util.Map;
import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.FactorNode;
import net.siliconcode.quamoco.aggregator.graph.Node;
import net.siliconcode.quamoco.aggregator.qm.Evaluation;
import net.siliconcode.quamoco.aggregator.qm.Factor;
import net.siliconcode.quamoco.aggregator.qm.MeasurementMethod;
import net.siliconcode.quamoco.aggregator.qm.QualityModel;

/**
 * The class <code>QualityModelUtilsTest</code> contains tests for the class <code>{@link QualityModelUtils}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:41 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QualityModelUtilsTest {
    /**
     * Run the Map<String, QualityModel> createModelMap(List<QualityModel>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testCreateModelMap_1()
        throws Exception
    {
        List<QualityModel> models = EasyMock.createMock(List.class);
        // TODO: add mock object expectations here

        EasyMock.replay(models);

        Map<String, QualityModel> result = QualityModelUtils.createModelMap(models);

        // TODO: add additional test code here
        EasyMock.verify(models);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.createModelMap(QualityModelUtils.java:59)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the Map<String, QualityModel> createModelMap(List<QualityModel>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testCreateModelMap_2()
        throws Exception
    {
        List<QualityModel> models = EasyMock.createMock(List.class);
        // TODO: add mock object expectations here

        EasyMock.replay(models);

        Map<String, QualityModel> result = QualityModelUtils.createModelMap(models);

        // TODO: add additional test code here
        EasyMock.verify(models);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.createModelMap(QualityModelUtils.java:59)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testFindEntity_1()
        throws Exception
    {
        Map<String, QualityModel> modelMap = EasyMock.createMock(Map.class);
        String id = "";
        // TODO: add mock object expectations here

        EasyMock.replay(modelMap);

        AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

        // TODO: add additional test code here
        EasyMock.verify(modelMap);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy113.values(Unknown Source)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.findEntity(QualityModelUtils.java:89)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testFindEntity_2()
        throws Exception
    {
        Map<String, QualityModel> modelMap = EasyMock.createMock(Map.class);
        String id = null;
        // TODO: add mock object expectations here

        EasyMock.replay(modelMap);

        AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

        // TODO: add additional test code here
        EasyMock.verify(modelMap);
        assertEquals(null, result);
        fail("unverified");
    }

    /**
     * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testFindEntity_3()
        throws Exception
    {
        Map<String, QualityModel> modelMap = EasyMock.createMock(Map.class);
        String id = "";
        // TODO: add mock object expectations here

        EasyMock.replay(modelMap);

        AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

        // TODO: add additional test code here
        EasyMock.verify(modelMap);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy113.values(Unknown Source)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.findEntity(QualityModelUtils.java:89)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testFindEntity_4()
        throws Exception
    {
        Map<String, QualityModel> modelMap = EasyMock.createMock(Map.class);
        String id = "";
        // TODO: add mock object expectations here

        EasyMock.replay(modelMap);

        AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

        // TODO: add additional test code here
        EasyMock.verify(modelMap);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy113.values(Unknown Source)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.findEntity(QualityModelUtils.java:89)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testFindEntity_5()
        throws Exception
    {
        Map<String, QualityModel> modelMap = EasyMock.createMock(Map.class);
        String id = "";
        // TODO: add mock object expectations here

        EasyMock.replay(modelMap);

        AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

        // TODO: add additional test code here
        EasyMock.verify(modelMap);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy113.values(Unknown Source)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.findEntity(QualityModelUtils.java:89)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testFindEntity_6()
        throws Exception
    {
        Map<String, QualityModel> modelMap = EasyMock.createMock(Map.class);
        String id = "";
        // TODO: add mock object expectations here

        EasyMock.replay(modelMap);

        AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

        // TODO: add additional test code here
        EasyMock.verify(modelMap);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy113.values(Unknown Source)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.findEntity(QualityModelUtils.java:89)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the List<MeasurementMethod> getAllMeasurementMethods(List<QualityModel>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetAllMeasurementMethods_1()
        throws Exception
    {
        List<QualityModel> models = EasyMock.createMock(List.class);
        // TODO: add mock object expectations here

        EasyMock.replay(models);

        List<MeasurementMethod> result = QualityModelUtils.getAllMeasurementMethods(models);

        // TODO: add additional test code here
        EasyMock.verify(models);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.getAllMeasurementMethods(QualityModelUtils.java:106)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the List<MeasurementMethod> getAllMeasurementMethods(List<QualityModel>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetAllMeasurementMethods_2()
        throws Exception
    {
        List<QualityModel> models = EasyMock.createMock(List.class);
        // TODO: add mock object expectations here

        EasyMock.replay(models);

        List<MeasurementMethod> result = QualityModelUtils.getAllMeasurementMethods(models);

        // TODO: add additional test code here
        EasyMock.verify(models);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.getAllMeasurementMethods(QualityModelUtils.java:106)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the List<MeasurementMethod> getAllMeasurementMethods(List<QualityModel>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetAllMeasurementMethods_3()
        throws Exception
    {
        List<QualityModel> models = EasyMock.createMock(List.class);
        // TODO: add mock object expectations here

        EasyMock.replay(models);

        List<MeasurementMethod> result = QualityModelUtils.getAllMeasurementMethods(models);

        // TODO: add additional test code here
        EasyMock.verify(models);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.getAllMeasurementMethods(QualityModelUtils.java:106)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the List<MeasurementMethod> getAllMeasurementMethods(List<QualityModel>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetAllMeasurementMethods_4()
        throws Exception
    {
        List<QualityModel> models = EasyMock.createMock(List.class);
        // TODO: add mock object expectations here

        EasyMock.replay(models);

        List<MeasurementMethod> result = QualityModelUtils.getAllMeasurementMethods(models);

        // TODO: add additional test code here
        EasyMock.verify(models);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.getAllMeasurementMethods(QualityModelUtils.java:106)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the Evaluation getEvaluates(Node,Map<String,QualityModel>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetEvaluates_1()
        throws Exception
    {
        Node dest = new FactorNode(new DirectedSparseGraph(), "", "");
        Map<String, QualityModel> modelMap = EasyMock.createMock(Map.class);
        // TODO: add mock object expectations here

        EasyMock.replay(modelMap);

        Evaluation result = QualityModelUtils.getEvaluates(dest, modelMap);

        // TODO: add additional test code here
        EasyMock.verify(modelMap);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy113.values(Unknown Source)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.findEntity(QualityModelUtils.java:89)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.getEvaluates(QualityModelUtils.java:127)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the Evaluation getEvaluates(Node,Map<String,QualityModel>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetEvaluates_2()
        throws Exception
    {
        Node dest = new FactorNode(new DirectedSparseGraph(), "", "");
        Map<String, QualityModel> modelMap = EasyMock.createMock(Map.class);
        // TODO: add mock object expectations here

        EasyMock.replay(modelMap);

        Evaluation result = QualityModelUtils.getEvaluates(dest, modelMap);

        // TODO: add additional test code here
        EasyMock.verify(modelMap);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy113.values(Unknown Source)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.findEntity(QualityModelUtils.java:89)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.getEvaluates(QualityModelUtils.java:127)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the Evaluation getEvaluates(Node,Map<String,QualityModel>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetEvaluates_3()
        throws Exception
    {
        Node dest = new FactorNode(new DirectedSparseGraph(), "", "");
        Map<String, QualityModel> modelMap = EasyMock.createMock(Map.class);
        // TODO: add mock object expectations here

        EasyMock.replay(modelMap);

        Evaluation result = QualityModelUtils.getEvaluates(dest, modelMap);

        // TODO: add additional test code here
        EasyMock.verify(modelMap);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy113.values(Unknown Source)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.findEntity(QualityModelUtils.java:89)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.getEvaluates(QualityModelUtils.java:127)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the Factor getFactor(Node,Map<String,QualityModel>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetFactor_1()
        throws Exception
    {
        Node source = new FactorNode(new DirectedSparseGraph(), "", "");
        Map<String, QualityModel> modelMap = EasyMock.createMock(Map.class);
        // TODO: add mock object expectations here

        EasyMock.replay(modelMap);

        Factor result = QualityModelUtils.getFactor(source, modelMap);

        // TODO: add additional test code here
        EasyMock.verify(modelMap);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy113.values(Unknown Source)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.findEntity(QualityModelUtils.java:89)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.getFactor(QualityModelUtils.java:142)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the Factor getFactor(Node,Map<String,QualityModel>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetFactor_2()
        throws Exception
    {
        Node source = new FactorNode(new DirectedSparseGraph(), "", "");
        Map<String, QualityModel> modelMap = EasyMock.createMock(Map.class);
        // TODO: add mock object expectations here

        EasyMock.replay(modelMap);

        Factor result = QualityModelUtils.getFactor(source, modelMap);

        // TODO: add additional test code here
        EasyMock.verify(modelMap);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy113.values(Unknown Source)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.findEntity(QualityModelUtils.java:89)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.getFactor(QualityModelUtils.java:142)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the Factor getFactor(Node,Map<String,QualityModel>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetFactor_3()
        throws Exception
    {
        Node source = new FactorNode(new DirectedSparseGraph(), "", "");
        Map<String, QualityModel> modelMap = EasyMock.createMock(Map.class);
        // TODO: add mock object expectations here

        EasyMock.replay(modelMap);

        Factor result = QualityModelUtils.getFactor(source, modelMap);

        // TODO: add additional test code here
        EasyMock.verify(modelMap);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy113.values(Unknown Source)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.findEntity(QualityModelUtils.java:89)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.getFactor(QualityModelUtils.java:142)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the net.siliconcode.quamoco.aggregator.qm.Measure getMeasure(Node,Map<String,QualityModel>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetMeasure_1()
        throws Exception
    {
        Node source = new FactorNode(new DirectedSparseGraph(), "", "");
        Map<String, QualityModel> modelMap = EasyMock.createMock(Map.class);
        // TODO: add mock object expectations here

        EasyMock.replay(modelMap);

        net.siliconcode.quamoco.aggregator.qm.Measure result = QualityModelUtils.getMeasure(source, modelMap);

        // TODO: add additional test code here
        EasyMock.verify(modelMap);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy113.values(Unknown Source)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.findEntity(QualityModelUtils.java:89)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.getMeasure(QualityModelUtils.java:157)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the net.siliconcode.quamoco.aggregator.qm.Measure getMeasure(Node,Map<String,QualityModel>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetMeasure_2()
        throws Exception
    {
        Node source = new FactorNode(new DirectedSparseGraph(), "", "");
        Map<String, QualityModel> modelMap = EasyMock.createMock(Map.class);
        // TODO: add mock object expectations here

        EasyMock.replay(modelMap);

        net.siliconcode.quamoco.aggregator.qm.Measure result = QualityModelUtils.getMeasure(source, modelMap);

        // TODO: add additional test code here
        EasyMock.verify(modelMap);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy113.values(Unknown Source)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.findEntity(QualityModelUtils.java:89)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.getMeasure(QualityModelUtils.java:157)
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the net.siliconcode.quamoco.aggregator.qm.Measure getMeasure(Node,Map<String,QualityModel>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetMeasure_3()
        throws Exception
    {
        Node source = new FactorNode(new DirectedSparseGraph(), "", "");
        Map<String, QualityModel> modelMap = EasyMock.createMock(Map.class);
        // TODO: add mock object expectations here

        EasyMock.replay(modelMap);

        net.siliconcode.quamoco.aggregator.qm.Measure result = QualityModelUtils.getMeasure(source, modelMap);

        // TODO: add additional test code here
        EasyMock.verify(modelMap);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy113.values(Unknown Source)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.findEntity(QualityModelUtils.java:89)
        //       at net.siliconcode.quamoco.aggregator.QualityModelUtils.getMeasure(QualityModelUtils.java:157)
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
        new org.junit.runner.JUnitCore().run(QualityModelUtilsTest.class);
    }
}