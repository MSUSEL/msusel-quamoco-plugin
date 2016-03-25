package net.siliconcode.quamoco.distiller;

import java.util.List;
import java.util.Map;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Assert;
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
	public void testCreateModelMap_1() throws Exception {
		final Map<String, QualityModel> result = QualityModelUtils.createModelMap(models);

		Assert.assertNotNull(result);
		Assert.assertEquals(4, result.size());
		Assert.assertEquals(true, result.containsKey("java"));
		Assert.assertEquals(true, result.containsKey("csharp"));
		Assert.assertEquals(true, result.containsKey("object"));
		Assert.assertEquals(true, result.containsKey("root"));
	}

	/**
	 * Run the Map<String, QualityModel> createModelMap(List<QualityModel>)
	 * method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testCreateModelMap_2() throws Exception {
		models.add(null);
		final Map<String, QualityModel> result = QualityModelUtils.createModelMap(models);

		Assert.assertNotNull(result);
		Assert.assertEquals(4, result.size());
		Assert.assertEquals(true, result.containsKey("java"));
		Assert.assertEquals(true, result.containsKey("csharp"));
		Assert.assertEquals(true, result.containsKey("object"));
		Assert.assertEquals(true, result.containsKey("root"));
	}

	/**
	 * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
	 * test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testFindEntity_1() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		final String id = "java";

		final AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

		Assert.assertNull(result);
	}

	/**
	 * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
	 * test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testFindEntity_2() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		modelMap.put("java", new QualityModel("java", "", null, null, "java"));
		final String id = "";

		final AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

		Assert.assertNull(result);
	}

	/**
	 * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
	 * test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testFindEntity_3() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		final QualityModel model = new QualityModel("java", "", null, null, "java");
		modelMap.put("java", model);
		final String id = "java.qm#mock-object";

		final Evaluation entity = new Evaluation("mock-object", "", "", 0, "", null, "", id);
		model.addEvaluation(entity);

		final AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

		Assert.assertNotNull(result);
		Assert.assertEquals(entity, result);
	}

	/**
	 * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
	 * test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testFindEntity_4() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		final QualityModel model = new QualityModel("java", "", null, null, "java");
		modelMap.put("java", model);
		final String id = "java.qm#mock-object";

		final Evaluation entity = new Evaluation("mock-object", "", "", 0, "", null, "", id);
		model.addEvaluation(entity);

		final AbstractEntity result = QualityModelUtils.findEntity(modelMap, "java.qm#other");

		Assert.assertNull(result);
	}

	/**
	 * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
	 * test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testFindEntity_5() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		final QualityModel model = new QualityModel("java", "", null, null, "java");
		modelMap.put("java", model);
		final String id = "java.qm#mock-object";

		final Evaluation entity = new Evaluation("mock-object", "", "", 0, "", null, "", id);
		model.addEvaluation(entity);

		final AbstractEntity result = QualityModelUtils.findEntity(modelMap, "mock-object");

		Assert.assertNotNull(result);
		Assert.assertEquals(entity, result);
	}

	/**
	 * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
	 * test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testFindEntity_6() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		final QualityModel model = new QualityModel("java", "", null, null, "java");
		modelMap.put("java", model);
		final String id = "java.qm#mock-object";

		final Evaluation entity = new Evaluation("mock-object", "", "", 0, "", null, "", id);
		model.addEvaluation(entity);

		final AbstractEntity result = QualityModelUtils.findEntity(modelMap, "other");

		Assert.assertNull(result);
	}

	/**
	 * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
	 * test.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testFindEntity_7() throws Exception {
		final Map<String, QualityModel> modelMap = null;

		final String id = "java";
		final AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

		Assert.assertNull(result);
	}

	/**
	 * Run the AbstractEntity findEntity(Map<String,QualityModel>,String) method
	 * test.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testFindEntity_8() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		modelMap.put("java", new QualityModel("java", "", null, null, "java"));

		final String id = null;
		final AbstractEntity result = QualityModelUtils.findEntity(modelMap, id);

		Assert.assertNull(result);
	}

	/**
	 * Run the List<MeasurementMethod> getAllMeasurementMethods(List
	 * <QualityModel>) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetAllMeasurementMethods_1() throws Exception {
		final List<QualityModel> models = null;
		final List<MeasurementMethod> result = QualityModelUtils.getAllMeasurementMethods(models);

		Assert.assertNotNull(result);
		Assert.assertTrue(result.isEmpty());
	}

	/**
	 * Run the List<MeasurementMethod> getAllMeasurementMethods(List
	 * <QualityModel>) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetAllMeasurementMethods_2() throws Exception {
		final List<QualityModel> models = Lists.newArrayList();
		final List<MeasurementMethod> result = QualityModelUtils.getAllMeasurementMethods(models);

		Assert.assertNotNull(result);
		Assert.assertTrue(result.isEmpty());
	}

	/**
	 * Run the List<MeasurementMethod> getAllMeasurementMethods(List
	 * <QualityModel>) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetAllMeasurementMethods_3() throws Exception {
		final MeasurementMethod mm1 = new MeasurementMethod("mm1", "", null, "", "", null, "owner", "java.qm#mm1");
		final MeasurementMethod mm2 = new MeasurementMethod("mm2", "", null, "", "", null, "owner", "java.qm#mm2");
		final MeasurementMethod mm3 = new MeasurementMethod("mm3", "", null, "", "", null, "owner", "csharp.qm#mm3");
		models.get(0).addMethod(mm1);
		models.get(0).addMethod(mm2);
		models.get(1).addMethod(mm3);
		final List<MeasurementMethod> result = QualityModelUtils.getAllMeasurementMethods(models);

		Assert.assertNotNull(result);
		Assert.assertEquals(false, result.isEmpty());
		Assert.assertEquals(3, result.size());
	}

	/**
	 * Run the Evaluation getEvaluates(Node,Map<String,QualityModel>) method
	 * test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetEvaluates_1() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		final QualityModel model = new QualityModel("java", "", null, null, "java");
		modelMap.put("java", model);
		final String id = "java.qm#mock-object";

		final Evaluation entity = new Evaluation("mock-object", "", "", 0, "", null, "", id);
		model.addEvaluation(entity);

		final INode dest = EasyMock.createMock(INode.class);
		EasyMock.expect(dest.getOwnedBy()).andReturn(id);
		EasyMock.replay(dest);

		final Evaluation result = QualityModelUtils.getEvaluates(dest, modelMap);

		Assert.assertEquals(entity, result);
	}

	/**
	 * Run the Evaluation getEvaluates(Node,Map<String,QualityModel>) method
	 * test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetEvaluates_2() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		final QualityModel model = new QualityModel("java", "", null, null, "java");
		modelMap.put("java", model);
		final String id = "java.qm#mock-object";

		final Evaluation entity = new Evaluation("mock-object", "", "", 0, "", null, "", id);
		model.addEvaluation(entity);

		final INode dest = EasyMock.createMock(INode.class);
		EasyMock.expect(dest.getOwnedBy()).andReturn(null);
		EasyMock.replay(dest);

		final Evaluation result = QualityModelUtils.getEvaluates(dest, modelMap);
		Assert.assertNull(result);
	}

	/**
	 * Run the Evaluation getEvaluates(Node,Map<String,QualityModel>) method
	 * test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetEvaluates_3() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		final QualityModel model = new QualityModel("java", "", null, null, "java");
		modelMap.put("java", model);
		final String id = "java.qm#mock-object";

		final Evaluation entity = new Evaluation("mock-object", "", "", 0, "", null, "", id);
		model.addEvaluation(entity);

		final INode dest = EasyMock.createMock(INode.class);
		EasyMock.expect(dest.getOwnedBy()).andReturn("java.qm#other");
		EasyMock.replay(dest);

		final Evaluation result = QualityModelUtils.getEvaluates(dest, modelMap);
		Assert.assertNull(result);
	}

	/**
	 * Run the Factor getFactor(Node,Map<String,QualityModel>) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetFactor_1() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		final QualityModel model = new QualityModel("java", "", null, null, "java");
		modelMap.put("java", model);
		final String id = "java.qm#mock-object";

		final Factor factor = new Factor("mock-object", "", null, null, "", null, id);
		model.addFactor(factor);

		final INode dest = EasyMock.createMock(INode.class);
		EasyMock.expect(dest.getOwnedBy()).andReturn(id);
		EasyMock.replay(dest);

		final Factor result = QualityModelUtils.getFactor(dest, modelMap);
		Assert.assertEquals(factor, result);
	}

	/**
	 * Run the Factor getFactor(Node,Map<String,QualityModel>) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetFactor_2() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		final QualityModel model = new QualityModel("java", "", null, null, "java");
		modelMap.put("java", model);
		final String id = "java.qm#mock-object";

		final Factor factor = new Factor("mock-object", "", null, null, "", null, id);
		model.addFactor(factor);

		final INode dest = EasyMock.createMock(INode.class);
		EasyMock.expect(dest.getOwnedBy()).andReturn(null);
		EasyMock.replay(dest);

		final Factor result = QualityModelUtils.getFactor(dest, modelMap);
		Assert.assertNull(result);
	}

	/**
	 * Run the Factor getFactor(Node,Map<String,QualityModel>) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetFactor_3() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		final QualityModel model = new QualityModel("java", "", null, null, "java");
		modelMap.put("java", model);
		final String id = "java.qm#mock-object";

		final Factor factor = new Factor("mock-object", "", null, null, "", null, id);
		model.addFactor(factor);

		final INode dest = EasyMock.createMock(INode.class);
		EasyMock.expect(dest.getOwnedBy()).andReturn("java.qm#other");
		EasyMock.replay(dest);

		final Factor result = QualityModelUtils.getFactor(dest, modelMap);
		Assert.assertNull(result);
	}

	/**
	 * Run the net.siliconcode.quamoco.aggregator.qm.Measure getMeasure(Node,Map
	 * <String,QualityModel>) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetMeasure_1() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		final QualityModel model = new QualityModel("java", "", null, null, "java");
		modelMap.put("java", model);
		final String id = "java.qm#mock-object";

		final net.siliconcode.quamoco.model.qm.Measure measure = new net.siliconcode.quamoco.model.qm.Measure(
				"mock-object", "", "", null, "", "", null, null, id);
		model.addMeasure(measure);

		final INode dest = EasyMock.createMock(INode.class);
		EasyMock.expect(dest.getOwnedBy()).andReturn(id);
		EasyMock.replay(dest);

		final net.siliconcode.quamoco.model.qm.Measure result = QualityModelUtils.getMeasure(dest, modelMap);
		Assert.assertEquals(measure, result);
	}

	/**
	 * Run the net.siliconcode.quamoco.aggregator.qm.Measure getMeasure(Node,Map
	 * <String,QualityModel>) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetMeasure_2() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		final QualityModel model = new QualityModel("java", "", null, null, "java");
		modelMap.put("java", model);
		final String id = "java.qm#mock-object";

		final net.siliconcode.quamoco.model.qm.Measure measure = new net.siliconcode.quamoco.model.qm.Measure(
				"mock-object", "", "", null, "", "", null, null, id);
		model.addMeasure(measure);

		final INode dest = EasyMock.createMock(INode.class);
		EasyMock.expect(dest.getOwnedBy()).andReturn(null);
		EasyMock.replay(dest);

		final net.siliconcode.quamoco.model.qm.Measure result = QualityModelUtils.getMeasure(dest, modelMap);
		Assert.assertNull(result);
	}

	/**
	 * Run the net.siliconcode.quamoco.aggregator.qm.Measure getMeasure(Node,Map
	 * <String,QualityModel>) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetMeasure_3() throws Exception {
		final Map<String, QualityModel> modelMap = Maps.newHashMap();
		final QualityModel model = new QualityModel("java", "", null, null, "java");
		modelMap.put("java", model);
		final String id = "java.qm#mock-object";

		final net.siliconcode.quamoco.model.qm.Measure measure = new net.siliconcode.quamoco.model.qm.Measure(
				"mock-object", "", "", null, "", "", null, null, id);
		model.addMeasure(measure);

		final INode dest = EasyMock.createMock(INode.class);
		EasyMock.expect(dest.getOwnedBy()).andReturn("java.qm#other");
		EasyMock.replay(dest);

		final net.siliconcode.quamoco.model.qm.Measure result = QualityModelUtils.getMeasure(dest, modelMap);
		Assert.assertNull(result);
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
		models = Lists.newArrayList();
		final QualityModel qm1 = new QualityModel("java", "", null, null, "java");
		final QualityModel qm2 = new QualityModel("csharp", "", null, null, "csharp");
		final QualityModel qm3 = new QualityModel("root", "", null, null, "root");
		final QualityModel qm4 = new QualityModel("object", "", null, null, "object");
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
		new org.junit.runner.JUnitCore().run(QualityModelUtilsTest.class);
	}
}