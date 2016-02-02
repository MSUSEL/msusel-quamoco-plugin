package net.siliconcode.quamoco.distiller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import net.siliconcode.quamoco.graph.INode;
import net.siliconcode.quamoco.model.AbstractEntity;
import net.siliconcode.quamoco.model.qm.Evaluation;
import net.siliconcode.quamoco.model.qm.Factor;
import net.siliconcode.quamoco.model.qm.MeasurementMethod;
import net.siliconcode.quamoco.model.qm.QualityModel;

/**
 * The class <code>QualityModelUtilsTest</code> contains tests for the class
 * <code>{@link QualityModelUtils}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:41 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QualityModelUtilsTest {

    private List<QualityModel> models;

    /**
     * Run the Map<String, QualityModel> createModelMap(List<QualityModel>)
     * method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testCreateModelMap_1() throws Exception
    {
        Map<String, QualityModel> result = QualityModelUtils.createModelMap(models);

        assertNotNull(result);
        assertEquals(4, result.size());
        assertEquals(true, result.containsKey("java"));
        assertEquals(true, result.containsKey("csharp"));
        assertEquals(true, result.containsKey("object"));
        assertEquals(true, result.containsKey("root"));
    }

    /**
     * Run the Map<String, QualityModel> createModelMap(List<QualityModel>)
     * method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testCreateModelMap_2() throws Exception
    {
        models.add(null);
        Map<String, QualityModel> result = QualityModelUtils.createModelMap(models);

        assertNotNull(result);
        assertEquals(4, result.size());
        assertEquals(true, result.containsKey("java"));
        assertEquals(true, result.containsKey("csharp"));
        assertEquals(true, result.containsKey("object"));
        assertEquals(true, result.containsKey("root"));
    }

    /**
     * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testFindEntity_1() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        String id = "java";

        AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

        assertNull(result);
    }

    /**
     * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testFindEntity_2() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        modelMap.put("java", new QualityModel("java", "", null, null, "java"));
        String id = "";

        AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

        assertNull(result);
    }

    /**
     * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testFindEntity_3() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        QualityModel model = new QualityModel("java", "", null, null, "java");
        modelMap.put("java", model);
        String id = "java.qm#mock-object";

        Evaluation entity = new Evaluation("mock-object", "", "", 0, "", null, "", id);
        model.addEvaluation(entity);

        AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

        assertNotNull(result);
        assertEquals(entity, result);
    }

    /**
     * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testFindEntity_4() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        QualityModel model = new QualityModel("java", "", null, null, "java");
        modelMap.put("java", model);
        String id = "java.qm#mock-object";

        Evaluation entity = new Evaluation("mock-object", "", "", 0, "", null, "", id);
        model.addEvaluation(entity);

        AbstractEntity result = QualityModelUtils.findEntity(modelMap, "java.qm#other");

        assertNull(result);
    }

    /**
     * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testFindEntity_5() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        QualityModel model = new QualityModel("java", "", null, null, "java");
        modelMap.put("java", model);
        String id = "java.qm#mock-object";

        Evaluation entity = new Evaluation("mock-object", "", "", 0, "", null, "", id);
        model.addEvaluation(entity);

        AbstractEntity result = QualityModelUtils.findEntity(modelMap, "mock-object");

        assertNotNull(result);
        assertEquals(entity, result);
    }

    /**
     * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testFindEntity_6() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        QualityModel model = new QualityModel("java", "", null, null, "java");
        modelMap.put("java", model);
        String id = "java.qm#mock-object";

        Evaluation entity = new Evaluation("mock-object", "", "", 0, "", null, "", id);
        model.addEvaluation(entity);

        AbstractEntity result = QualityModelUtils.findEntity(modelMap, "other");

        assertNull(result);
    }

    /**
     * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
     * test.
     * 
     * @throws Exception
     */
    @Test
    public void testFindEntity_7() throws Exception
    {
        Map<String, QualityModel> modelMap = null;

        String id = "java";
        AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

        assertNull(result);
    }

    /**
     * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
     * test.
     * 
     * @throws Exception
     */
    @Test
    public void testFindEntity_8() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        modelMap.put("java", new QualityModel("java", "", null, null, "java"));

        String id = null;
        AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

        assertNull(result);
    }

    /**
     * Run the List<MeasurementMethod> getAllMeasurementMethods(List
     * <QualityModel>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetAllMeasurementMethods_1() throws Exception
    {
        List<QualityModel> models = null;
        List<MeasurementMethod> result = QualityModelUtils.getAllMeasurementMethods(models);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    /**
     * Run the List<MeasurementMethod> getAllMeasurementMethods(List
     * <QualityModel>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetAllMeasurementMethods_2() throws Exception
    {
        List<QualityModel> models = Lists.newArrayList();
        List<MeasurementMethod> result = QualityModelUtils.getAllMeasurementMethods(models);

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    /**
     * Run the List<MeasurementMethod> getAllMeasurementMethods(List
     * <QualityModel>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetAllMeasurementMethods_3() throws Exception
    {
        MeasurementMethod mm1 = new MeasurementMethod("mm1", "", null, "", "", null, "owner", "java.qm#mm1");
        MeasurementMethod mm2 = new MeasurementMethod("mm2", "", null, "", "", null, "owner", "java.qm#mm2");
        MeasurementMethod mm3 = new MeasurementMethod("mm3", "", null, "", "", null, "owner", "csharp.qm#mm3");
        models.get(0).addMethod(mm1);
        models.get(0).addMethod(mm2);
        models.get(1).addMethod(mm3);
        List<MeasurementMethod> result = QualityModelUtils.getAllMeasurementMethods(models);

        assertNotNull(result);
        assertEquals(false, result.isEmpty());
        assertEquals(3, result.size());
    }

    /**
     * Run the Evaluation getEvaluates(Node,Map<String,QualityModel>) method
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetEvaluates_1() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        QualityModel model = new QualityModel("java", "", null, null, "java");
        modelMap.put("java", model);
        String id = "java.qm#mock-object";

        Evaluation entity = new Evaluation("mock-object", "", "", 0, "", null, "", id);
        model.addEvaluation(entity);

        INode dest = EasyMock.createMock(INode.class);
        EasyMock.expect(dest.getOwnedBy()).andReturn(id);
        EasyMock.replay(dest);

        Evaluation result = QualityModelUtils.getEvaluates(dest, modelMap);

        assertEquals(entity, result);
    }

    /**
     * Run the Evaluation getEvaluates(Node,Map<String,QualityModel>) method
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetEvaluates_2() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        QualityModel model = new QualityModel("java", "", null, null, "java");
        modelMap.put("java", model);
        String id = "java.qm#mock-object";

        Evaluation entity = new Evaluation("mock-object", "", "", 0, "", null, "", id);
        model.addEvaluation(entity);

        INode dest = EasyMock.createMock(INode.class);
        EasyMock.expect(dest.getOwnedBy()).andReturn(null);
        EasyMock.replay(dest);

        Evaluation result = QualityModelUtils.getEvaluates(dest, modelMap);
        assertNull(result);
    }

    /**
     * Run the Evaluation getEvaluates(Node,Map<String,QualityModel>) method
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetEvaluates_3() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        QualityModel model = new QualityModel("java", "", null, null, "java");
        modelMap.put("java", model);
        String id = "java.qm#mock-object";

        Evaluation entity = new Evaluation("mock-object", "", "", 0, "", null, "", id);
        model.addEvaluation(entity);

        INode dest = EasyMock.createMock(INode.class);
        EasyMock.expect(dest.getOwnedBy()).andReturn("java.qm#other");
        EasyMock.replay(dest);

        Evaluation result = QualityModelUtils.getEvaluates(dest, modelMap);
        assertNull(result);
    }

    /**
     * Run the Factor getFactor(Node,Map<String,QualityModel>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetFactor_1() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        QualityModel model = new QualityModel("java", "", null, null, "java");
        modelMap.put("java", model);
        String id = "java.qm#mock-object";

        Factor factor = new Factor("mock-object", "", null, null, "", null, id);
        model.addFactor(factor);

        INode dest = EasyMock.createMock(INode.class);
        EasyMock.expect(dest.getOwnedBy()).andReturn(id);
        EasyMock.replay(dest);

        Factor result = QualityModelUtils.getFactor(dest, modelMap);
        assertEquals(factor, result);
    }

    /**
     * Run the Factor getFactor(Node,Map<String,QualityModel>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetFactor_2() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        QualityModel model = new QualityModel("java", "", null, null, "java");
        modelMap.put("java", model);
        String id = "java.qm#mock-object";

        Factor factor = new Factor("mock-object", "", null, null, "", null, id);
        model.addFactor(factor);

        INode dest = EasyMock.createMock(INode.class);
        EasyMock.expect(dest.getOwnedBy()).andReturn(null);
        EasyMock.replay(dest);

        Factor result = QualityModelUtils.getFactor(dest, modelMap);
        assertNull(result);
    }

    /**
     * Run the Factor getFactor(Node,Map<String,QualityModel>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetFactor_3() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        QualityModel model = new QualityModel("java", "", null, null, "java");
        modelMap.put("java", model);
        String id = "java.qm#mock-object";

        Factor factor = new Factor("mock-object", "", null, null, "", null, id);
        model.addFactor(factor);

        INode dest = EasyMock.createMock(INode.class);
        EasyMock.expect(dest.getOwnedBy()).andReturn("java.qm#other");
        EasyMock.replay(dest);

        Factor result = QualityModelUtils.getFactor(dest, modelMap);
        assertNull(result);
    }

    /**
     * Run the net.siliconcode.quamoco.aggregator.qm.Measure getMeasure(Node,Map
     * <String,QualityModel>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetMeasure_1() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        QualityModel model = new QualityModel("java", "", null, null, "java");
        modelMap.put("java", model);
        String id = "java.qm#mock-object";

        net.siliconcode.quamoco.model.qm.Measure measure = new net.siliconcode.quamoco.model.qm.Measure("mock-object",
                "", "", null, "", "", null, null, id);
        model.addMeasure(measure);

        INode dest = EasyMock.createMock(INode.class);
        EasyMock.expect(dest.getOwnedBy()).andReturn(id);
        EasyMock.replay(dest);

        net.siliconcode.quamoco.model.qm.Measure result = QualityModelUtils.getMeasure(dest, modelMap);
        assertEquals(measure, result);
    }

    /**
     * Run the net.siliconcode.quamoco.aggregator.qm.Measure getMeasure(Node,Map
     * <String,QualityModel>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetMeasure_2() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        QualityModel model = new QualityModel("java", "", null, null, "java");
        modelMap.put("java", model);
        String id = "java.qm#mock-object";

        net.siliconcode.quamoco.model.qm.Measure measure = new net.siliconcode.quamoco.model.qm.Measure("mock-object",
                "", "", null, "", "", null, null, id);
        model.addMeasure(measure);

        INode dest = EasyMock.createMock(INode.class);
        EasyMock.expect(dest.getOwnedBy()).andReturn(null);
        EasyMock.replay(dest);

        net.siliconcode.quamoco.model.qm.Measure result = QualityModelUtils.getMeasure(dest, modelMap);
        assertNull(result);
    }

    /**
     * Run the net.siliconcode.quamoco.aggregator.qm.Measure getMeasure(Node,Map
     * <String,QualityModel>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetMeasure_3() throws Exception
    {
        Map<String, QualityModel> modelMap = Maps.newHashMap();
        QualityModel model = new QualityModel("java", "", null, null, "java");
        modelMap.put("java", model);
        String id = "java.qm#mock-object";

        net.siliconcode.quamoco.model.qm.Measure measure = new net.siliconcode.quamoco.model.qm.Measure("mock-object",
                "", "", null, "", "", null, null, id);
        model.addMeasure(measure);

        INode dest = EasyMock.createMock(INode.class);
        EasyMock.expect(dest.getOwnedBy()).andReturn("java.qm#other");
        EasyMock.replay(dest);

        net.siliconcode.quamoco.model.qm.Measure result = QualityModelUtils.getMeasure(dest, modelMap);
        assertNull(result);
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
        models = Lists.newArrayList();
        QualityModel qm1 = new QualityModel("java", "", null, null, "java");
        QualityModel qm2 = new QualityModel("csharp", "", null, null, "csharp");
        QualityModel qm3 = new QualityModel("root", "", null, null, "root");
        QualityModel qm4 = new QualityModel("object", "", null, null, "object");
        models.add(qm1);
        models.add(qm2);
        models.add(qm3);
        models.add(qm4);
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
        new org.junit.runner.JUnitCore().run(QualityModelUtilsTest.class);
    }
}