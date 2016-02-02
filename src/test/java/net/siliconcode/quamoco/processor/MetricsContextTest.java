package net.siliconcode.quamoco.processor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Maps;

/**
 * The class <code>MetricsContextTest</code> contains tests for the class
 * <code>{@link MetricsContext}</code>.
 *
 * @generatedBy CodePro at 2/1/16 4:21 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class MetricsContextTest {

	private MetricsContext fixture;

	/**
	 * Run the List<Double> getAllClassValues(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetAllClassValues_1() throws Exception {
		String metric = "LOC";
		buildTypeMetrics(metric);

		List<Double> result = fixture.getAllClassValues(metric);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<Double> getAllClassValues(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetAllClassValues_2() throws Exception {
		String metric = "";

		fixture.getAllClassValues(metric);
	}

	/**
	 * Run the List<Double> getAllClassValues(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetAllClassValues_3() throws Exception {
		String metric = null;

		fixture.getAllClassValues(metric);
	}

	/**
	 * Run the List<Double> getAllFileValues(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetAllFileValues_1() throws Exception {
		String metric = "LOC";
		buildFileMetrics("LOC");

		List<Double> result = fixture.getAllFileValues(metric);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<Double> getAllFileValues(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetAllFileValues_2() throws Exception {
		String metric = "";

		fixture.getAllFileValues(metric);
	}

	/**
	 * Run the List<Double> getAllFileValues(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetAllFileValues_3() throws Exception {
		String metric = "";

		fixture.getAllFileValues(metric);
	}

	/**
	 * Run the List<Double> getAllMethodValues(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetAllMethodValues_1() throws Exception {
		String metric = "LOC";
		buildMethodMetrics(metric);

		List<Double> result = fixture.getAllMethodValues(metric);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.size());
	}

	/**
	 * Run the List<Double> getAllMethodValues(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetAllMethodValues_2() throws Exception {
		String metric = "";

		fixture.getAllMethodValues(metric);
	}

	/**
	 * Run the List<Double> getAllMethodValues(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetAllMethodValues_3() throws Exception {
		String metric = null;

		fixture.getAllMethodValues(metric);
	}

	/**
	 * Run the double getFileMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetFileMetric_1() throws Exception {
		String file = "path1";
		String metric = "LOC";

		buildFileMetrics(metric);

		double result = fixture.getFileMetric(file, metric);

		// add additional test code here
		assertEquals(10.0, result, 0.1);
		result = fixture.getFileMetric("path2", metric);
		assertEquals(20.0, result, 0.1);
		result = fixture.getFileMetric("path3", metric);
		assertEquals(30.0, result, 0.1);
	}

	/**
	 * Run the double getFileMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetFileMetric_2() throws Exception {
		String file = "";
		String metric = "LOC";

		buildFileMetrics(metric);

		fixture.getFileMetric(file, metric);
	}

	/**
	 * Run the double getFileMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetFileMetric_3() throws Exception {
		String file = null;
		String metric = "LOC";

		buildFileMetrics(metric);

		fixture.getFileMetric(file, metric);
	}

	/**
	 * Run the double getFileMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetFileMetric_4() throws Exception {
		String file = "path1";
		String metric = "";

		buildFileMetrics(metric);

		fixture.getFileMetric(file, metric);
	}

	/**
	 * Run the double getFileMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetFileMetric_5() throws Exception {
		String file = "path1";
		String metric = null;

		buildFileMetrics(metric);

		fixture.getFileMetric(file, metric);
	}

	/**
	 * Run the double getFileMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetFileMetric_6() throws Exception {
		String file = "test";
		String metric = "LOC";

		buildFileMetrics(metric);

		double result = fixture.getFileMetric(file, metric);

		// add additional test code here
		assertEquals(Double.NEGATIVE_INFINITY, result, 0.1);
	}

	/**
	 * Run the MetricsContext getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetInstance_1() throws Exception {
		MetricsContext result = MetricsContext.getInstance();
		MetricsContext result2 = MetricsContext.getInstance();

		// add additional test code here
		assertNotNull(result);
		assertNotNull(result2);
		assertSame(result, result2);
	}

	/**
	 * Run the double getMethodMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetMethodMetric_1() throws Exception {
		String method = "";
		String metric = "LOC";

		fixture.getMethodMetric(method, metric);
	}

	/**
	 * Run the double getMethodMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetMethodMetric_2() throws Exception {
		String method = null;
		String metric = "LOC";

		fixture.getMethodMetric(method, metric);
	}

	/**
	 * Run the double getMethodMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetMethodMetric_3() throws Exception {
		String method = "method1";
		String metric = "";

		fixture.getMethodMetric(method, metric);
	}

	/**
	 * Run the double getMethodMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetMethodMetric_4() throws Exception {
		String method = "method1";
		String metric = null;

		fixture.getMethodMetric(method, metric);
	}

	/**
	 * Run the double getMethodMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetMethodMetric_5() throws Exception {
		String method = "method1";
		String metric = "LOC";

		double result = fixture.getMethodMetric(method, metric);

		// add additional test code here
		assertEquals(Double.NEGATIVE_INFINITY, result, 0.1);
	}

	/**
	 * Run the double getMethodMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetMethodMetric_6() throws Exception {
		String method = "method1";
		String metric = "LOC";

		buildMethodMetrics(metric);

		double result = fixture.getMethodMetric(method, metric);

		// add additional test code here
		assertEquals(10.0, result, 0.1);
	}

	/**
	 * Run the double getMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetMetric_1() throws Exception {
		String identifier = "";
		String metric = "LOC";

		fixture.getMetric(identifier, metric);
	}

	/**
	 * Run the double getMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetMetric_2() throws Exception {
		String identifier = null;
		String metric = "LOC";

		fixture.getMetric(identifier, metric);
	}

	/**
	 * Run the double getMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetMetric_3() throws Exception {
		String identifier = "path1";
		String metric = "";

		fixture.getMetric(identifier, metric);
	}

	/**
	 * Run the double getMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetMetric_4() throws Exception {
		String identifier = "path1";
		String metric = null;

		fixture.getMetric(identifier, metric);
	}

	/**
	 * Run the double getMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetMetric_5() throws Exception {
		String identifier = "test";
		String metric = "LOC";

		fixture.getMetric(identifier, metric);
	}

	/**
	 * Run the double getMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetMetric_6() throws Exception {
		String identifier = "path1";
		String metric = "LOC";

		buildFileMetrics(metric);
		buildTypeMetrics(metric);
		buildMethodMetrics(metric);

		fixture.getMetric(identifier, "test");
	}

	/**
	 * Run the double getMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetMetric_7() throws Exception {
		String identifier = "path1";
		String metric = "LOC";

		buildFileMetrics(metric);

		double result = fixture.getMetric(identifier, metric);

		// add additional test code here
		assertEquals(10.0, result, 0.1);
	}

	/**
	 * Run the double getMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetMetric_8() throws Exception {
		String identifier = "type1";
		String metric = "LOC";

		buildTypeMetrics(metric);

		double result = fixture.getMetric(identifier, metric);

		// add additional test code here
		assertEquals(10.0, result, 0.1);
	}

	/**
	 * Run the double getMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetMetric_9() throws Exception {
		String identifier = "method1";
		String metric = "LOC";

		buildMethodMetrics(metric);

		double result = fixture.getMetric(identifier, metric);

		// add additional test code here
		assertEquals(10.0, result, 0.1);
	}

	/**
	 * Run the double getProjectMetric(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetProjectMetric_1() throws Exception {
		String metric = null;

		fixture.getProjectMetric(metric);
	}

	/**
	 * Run the double getProjectMetric(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetProjectMetric_2() throws Exception {
		String metric = "";

		fixture.getProjectMetric(metric);
	}

	/**
	 * Run the double getProjectMetric(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetProjectMetric_3() throws Exception {
		String metric = "LOC";

		buildProjectMetrics(metric);

		double result = fixture.getProjectMetric(metric);

		// add additional test code here
		assertEquals(60.0, result, 0.1);
	}

	/**
	 * Run the double getProjectMetric(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetProjectMetric_4() throws Exception {
		String metric = "NIV";

		buildProjectMetrics("LOC");

		double result = fixture.getProjectMetric(metric);

		// add additional test code here
		assertEquals(Double.NEGATIVE_INFINITY, result, 0.1);
	}

	/**
	 * Run the double getProjectMetric(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetProjectMetric_5() throws Exception {
		String metric = "NOM";

		buildProjectMetrics(metric);

		double result = fixture.getProjectMetric("#Methods");

		// add additional test code here
		assertEquals(60.0, result, 0.1);
	}

	/**
	 * Run the double getTypeMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetTypeMetric_1() throws Exception {
		String type = "";
		String metric = "LOC";

		fixture.getTypeMetric(type, metric);
	}

	/**
	 * Run the double getTypeMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetTypeMetric_2() throws Exception {
		String type = null;
		String metric = "LOC";

		fixture.getTypeMetric(type, metric);
	}

	/**
	 * Run the double getTypeMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetTypeMetric_3() throws Exception {
		String type = "type1";
		String metric = "";

		fixture.getTypeMetric(type, metric);
	}

	/**
	 * Run the double getTypeMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testGetTypeMetric_4() throws Exception {
		String type = "type1";
		String metric = null;

		fixture.getTypeMetric(type, metric);
	}

	/**
	 * Run the double getTypeMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetTypeMetric_5() throws Exception {
		String type = "type1";
		String metric = "LOC";

		double result = fixture.getTypeMetric(type, metric);

		// add additional test code here
		assertEquals(Double.NEGATIVE_INFINITY, result, 0.1);
	}

	/**
	 * Run the double getTypeMetric(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testGetTypeMetric_6() throws Exception {
		String type = "type1";
		String metric = "LOC";

		buildTypeMetrics(metric);

		double result = fixture.getTypeMetric(type, metric);

		// add additional test code here
		assertEquals(10.0, result, 0.1);
	}

	/**
	 * Run the void setFileMetrics(Map<String,Map<String,Double>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testSetFileMetrics_1() throws Exception {
		Map<String, Map<String, Double>> fileMetrics = null;

		fixture.setFileMetrics(fileMetrics);

		// add additional test code here
		assertNotNull(fixture.fileMetrics);
		assertTrue(fixture.fileMetrics.isEmpty());
	}

	/**
	 * Run the void setFileMetrics(Map<String,Map<String,Double>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testSetFileMetrics_2() throws Exception {
		Map<String, Map<String, Double>> fileMetrics = Maps.newHashMap();
		fileMetrics.put("test", Maps.newHashMap());

		fixture.setFileMetrics(fileMetrics);

		// add additional test code here
		assertNotNull(fixture.fileMetrics);
		assertFalse(fixture.fileMetrics.isEmpty());
	}

	/**
	 * Run the void setMethodMetrics(Map<String,Map<String,Double>>) method
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testSetMethodMetrics_1() throws Exception {
		Map<String, Map<String, Double>> methodMetrics = null;

		fixture.setMethodMetrics(methodMetrics);

		// add additional test code here
		assertNotNull(fixture.methodMetrics);
		assertTrue(fixture.methodMetrics.isEmpty());
	}

	/**
	 * Run the void setMethodMetrics(Map<String,Map<String,Double>>) method
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testSetMethodMetrics_2() throws Exception {
		Map<String, Map<String, Double>> methodMetrics = Maps.newHashMap();
		methodMetrics.put("test", Maps.newHashMap());

		fixture.setMethodMetrics(methodMetrics);

		// add additional test code here
		assertNotNull(fixture.methodMetrics);
		assertFalse(fixture.methodMetrics.isEmpty());
	}

	/**
	 * Run the void setMetrics(Map<String,Double>,Map<String,Map
	 * <String,Double>>,Map<String,Map<String,Double>>,Map<String,Map
	 * <String,Double>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testSetMetrics_1() throws Exception {
		fixture.projectMetrics = null;
		fixture.fileMetrics = null;
		fixture.classMetrics = null;
		fixture.methodMetrics = null;

		Map<String, Double> projectMetrics = Maps.newHashMap();
		Map<String, Map<String, Double>> fileMetrics = Maps.newHashMap();
		Map<String, Map<String, Double>> typeMetrics = Maps.newHashMap();
		Map<String, Map<String, Double>> methodMetrics = Maps.newHashMap();

		fixture.setMetrics(projectMetrics, fileMetrics, typeMetrics, methodMetrics);

		// add additional test code here
		assertNotNull(fixture.projectMetrics);
		assertNotNull(fixture.fileMetrics);
		assertNotNull(fixture.methodMetrics);
		assertNotNull(fixture.classMetrics);
	}

	/**
	 * Run the void setProjectMetrics(Map<String,Double>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testSetProjectMetrics_1() throws Exception {
		Map<String, Double> projectMetrics = null;

		fixture.setProjectMetrics(projectMetrics);

		// add additional test code here
		assertNotNull(fixture.projectMetrics);
		assertTrue(fixture.projectMetrics.isEmpty());
	}

	/**
	 * Run the void setProjectMetrics(Map<String,Double>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testSetProjectMetrics_2() throws Exception {
		Map<String, Double> projectMetrics = Maps.newHashMap();
		projectMetrics.put("test", 1.0);

		fixture.setProjectMetrics(projectMetrics);

		// add additional test code here
		assertNotNull(fixture.projectMetrics);
		assertFalse(fixture.projectMetrics.isEmpty());
	}

	/**
	 * Run the void setTypeMetrics(Map<String,Map<String,Double>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testSetTypeMetrics_1() throws Exception {
		Map<String, Map<String, Double>> typeMetrics = null;

		fixture.setTypeMetrics(typeMetrics);

		// add additional test code here
		assertNotNull(fixture.classMetrics);
		assertTrue(fixture.classMetrics.isEmpty());
	}

	/**
	 * Run the void setTypeMetrics(Map<String,Map<String,Double>>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Test
	public void testSetTypeMetrics_2() throws Exception {
		Map<String, Map<String, Double>> typeMetrics = Maps.newHashMap();
		typeMetrics.put("test", Maps.newHashMap());

		fixture.setTypeMetrics(typeMetrics);

		// add additional test code here
		assertNotNull(fixture.classMetrics);
		assertFalse(fixture.classMetrics.isEmpty());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@Before
	public void setUp() throws Exception {
		fixture = MetricsContext.getInstance();
		fixture.setMethodMetrics(Maps.newHashMap());
		fixture.setTypeMetrics(Maps.newHashMap());
		fixture.setFileMetrics(Maps.newHashMap());
		fixture.setProjectMetrics(Maps.newHashMap());
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	@After
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 *
	 * @generatedBy CodePro at 2/1/16 4:21 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MetricsContextTest.class);
	}

	/**
	 * @param metric
	 */
	private void buildFileMetrics(String metric) {
		Map<String, Map<String, Double>> fileMetrics = Maps.newHashMap();
		Map<String, Double> path1Map = Maps.newHashMap();
		Map<String, Double> path2Map = Maps.newHashMap();
		Map<String, Double> path3Map = Maps.newHashMap();

		path1Map.put(metric, 10.0);
		path2Map.put(metric, 20.0);
		path3Map.put(metric, 30.0);

		fileMetrics.put("path1", path1Map);
		fileMetrics.put("path2", path2Map);
		fileMetrics.put("path3", path3Map);

		fixture.setFileMetrics(fileMetrics);
	}

	/**
	 * @param metric
	 */
	private void buildMethodMetrics(String metric) {
		Map<String, Map<String, Double>> methodMetrics = Maps.newHashMap();
		Map<String, Double> method1Map = Maps.newHashMap();
		Map<String, Double> method2Map = Maps.newHashMap();
		Map<String, Double> method3Map = Maps.newHashMap();

		method1Map.put(metric, 10.0);
		method2Map.put(metric, 20.0);
		method3Map.put(metric, 30.0);

		methodMetrics.put("method1", method1Map);
		methodMetrics.put("method2", method2Map);
		methodMetrics.put("method3", method3Map);

		fixture.setMethodMetrics(methodMetrics);
	}

	/**
	 * @param metric
	 */
	private void buildTypeMetrics(String metric) {
		Map<String, Map<String, Double>> typeMetrics = Maps.newHashMap();
		Map<String, Double> type1Map = Maps.newHashMap();
		Map<String, Double> type2Map = Maps.newHashMap();
		Map<String, Double> type3Map = Maps.newHashMap();

		type1Map.put(metric, 10.0);
		type2Map.put(metric, 20.0);
		type3Map.put(metric, 30.0);

		typeMetrics.put("type1", type1Map);
		typeMetrics.put("type2", type2Map);
		typeMetrics.put("type3", type3Map);

		fixture.setTypeMetrics(typeMetrics);
	}

	/**
	 * @param metric
	 */
	private void buildProjectMetrics(String metric) {
		Map<String, Double> projectMetrics = Maps.newHashMap();

		projectMetrics.put(metric, 60.0);

		fixture.setProjectMetrics(projectMetrics);

	}
}