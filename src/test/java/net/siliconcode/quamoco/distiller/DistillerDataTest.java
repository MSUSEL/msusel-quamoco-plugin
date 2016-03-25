package net.siliconcode.quamoco.distiller;

import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.model.qm.QualityModel;

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
	public void testDistillerData_1() throws Exception {
		final List<QualityModel> models = Lists.newArrayList();
		models.add(new QualityModel("java", "", null, null, "java"));

		final DistillerData result = new DistillerData(models);
		Assert.assertNotNull(result);
	}

	/**
	 * Run the Map<String, Node> getFactorMap() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetFactorMap_1() throws Exception {
		final List<QualityModel> models = Lists.newArrayList();
		models.add(new QualityModel("java", "", null, null, "java"));
		final DistillerData fixture = new DistillerData(models);

		final Map<String, Node> result = fixture.getFactorMap();

		Assert.assertNotNull(result);
	}

	/**
	 * Run the Map<String, Node> getMeasureMap() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetMeasureMap_1() throws Exception {
		final List<QualityModel> models = Lists.newArrayList();
		models.add(new QualityModel("java", "", null, null, "java"));
		final DistillerData fixture = new DistillerData(models);

		final Map<String, Node> result = fixture.getMeasureMap();

		Assert.assertNotNull(result);
	}

	/**
	 * Run the Map<String, QualityModel> getModelMap() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetModelMap_1() throws Exception {
		final List<QualityModel> models = Lists.newArrayList();
		models.add(new QualityModel("java", "", null, null, "java"));
		final DistillerData fixture = new DistillerData(models);
		final Map<String, QualityModel> result = fixture.getModelMap();

		Assert.assertTrue(result.containsKey("java"));
		Assert.assertNotNull(result.get("java"));
	}

	/**
	 * Run the List<QualityModel> getModels() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetModels_1() throws Exception {
		final List<QualityModel> models = Lists.newArrayList();
		models.add(new QualityModel("java", "", null, null, "java"));
		final DistillerData fixture = new DistillerData(models);

		final List<QualityModel> result = fixture.getModels();

		Assert.assertEquals(models, result);
	}

	/**
	 * Run the Map<String, Node> getValuesMap() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetValuesMap_1() throws Exception {
		final List<QualityModel> models = Lists.newArrayList();
		models.add(new QualityModel("java", "", null, null, "java"));
		final DistillerData fixture = new DistillerData(models);

		final Map<String, Node> result = fixture.getValuesMap();

		Assert.assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(DistillerDataTest.class);
	}
}