package net.siliconcode.quamoco.model.qmr;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.model.AbstractEntity;

/**
 * The class <code>QualityModelResultTest</code> contains tests for the class
 * <code>{@link QualityModelResult}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:49 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QualityModelResultTest {

	/**
	 * Run the QualityModelResult(String,String) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testQualityModelResult_1() throws Exception {
		final String date = "";
		final String system = "";

		final QualityModelResult result = new QualityModelResult(date, system);

		// TODO: add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals("", result.getSystem());
		Assert.assertEquals("", result.getDate());
	}

	/**
	 * Run the void addEvalResult(EvaluationResult) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testAddEvalResult_1() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final EvaluationResult result = null;

		fixture.addEvalResult(result);

		// TODO: add additional test code here
		Assert.assertEquals(1, fixture.getEvaluationResults().size());
	}

	/**
	 * Run the void addEvalResult(EvaluationResult) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testAddEvalResult_2() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final EvaluationResult result = new EvaluationResult();
		result.setId("new");

		fixture.addEvalResult(result);

		// TODO: add additional test code here
		Assert.assertEquals(2, fixture.getEvaluationResults().size());
	}

	/**
	 * Run the void addEvalResult(EvaluationResult) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testAddEvalResult_3() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final EvaluationResult result = new EvaluationResult();

		fixture.addEvalResult(result);

		Assert.assertEquals(1, fixture.getEvaluationResults().size());
	}

	/**
	 * Run the void addMeasureResult(MeasurementResult) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testAddMeasureResult_1() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final MeasurementResult result = null;

		fixture.addMeasureResult(result);

		// TODO: add additional test code here
		Assert.assertEquals(1, fixture.getMeasurementResults().size());
	}

	/**
	 * Run the void addMeasureResult(MeasurementResult) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testAddMeasureResult_2() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final MeasurementResult result = new MeasurementResult();
		result.setId("new");

		fixture.addMeasureResult(result);

		// TODO: add additional test code here
		Assert.assertEquals(2, fixture.getMeasurementResults().size());
	}

	/**
	 * Run the void addMeasureResult(MeasurementResult) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testAddMeasureResult_3() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final MeasurementResult result = new MeasurementResult();

		fixture.addMeasureResult(result);

		// TODO: add additional test code here
		Assert.assertEquals(1, fixture.getMeasurementResults().size());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testEquals_1() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final QualityModelResult obj = new QualityModelResult("", "");
		obj.addMeasureResult(new MeasurementResult());
		obj.addEvalResult(new EvaluationResult());

		final boolean result = fixture.equals(obj);

		// TODO: add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testEquals_2() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final Object obj = null;

		final boolean result = fixture.equals(obj);

		// TODO: add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testEquals_3() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final Object obj = new Object();

		final boolean result = fixture.equals(obj);

		// TODO: add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testEquals_4() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final Object obj = new QualityModelResult("", "");

		final boolean result = fixture.equals(obj);

		// TODO: add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testEquals_5() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final Object obj = new QualityModelResult("", "");

		final boolean result = fixture.equals(obj);

		// TODO: add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testEquals_6() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final Object obj = new QualityModelResult("", "");

		final boolean result = fixture.equals(obj);

		// TODO: add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testEquals_7() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", (String) null);
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final Object obj = new QualityModelResult("", (String) null);

		final boolean result = fixture.equals(obj);

		// TODO: add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the List<AbstractResult> getContained() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testGetContained_1() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());

		final List<AbstractResult> result = fixture.getContained();

		// TODO: add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(1, result.size());
	}

	/**
	 * Run the String getDate() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testGetDate_1() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());

		final String result = fixture.getDate();

		// TODO: add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the List<EvaluationResult> getEvaluationResults() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testGetEvaluationResults_1() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());

		final List<EvaluationResult> result = fixture.getEvaluationResults();

		// TODO: add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(1, result.size());
	}

	/**
	 * Run the List<MeasurementResult> getMeasurementResults() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testGetMeasurementResults_1() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());

		final List<MeasurementResult> result = fixture.getMeasurementResults();

		// TODO: add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(1, result.size());
	}

	/**
	 * Run the String getSystem() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testGetSystem_1() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());

		final String result = fixture.getSystem();

		// TODO: add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testHashCode_1() throws Exception {
		final QualityModelResult fixture = new QualityModelResult((String) null, "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());

		final int result = fixture.hashCode();

		// TODO: add additional test code here
		Assert.assertEquals(961, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testHashCode_2() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", (String) null);
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());

		final int result = fixture.hashCode();

		// TODO: add additional test code here
		Assert.assertEquals(961, result);
	}

	/**
	 * Run the void removeEvalResult(EvaluationResult) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testRemoveEvalResult_1() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final EvaluationResult result = null;

		fixture.removeEvalResult(result);

		Assert.assertEquals(1, fixture.getEvaluationResults().size());
	}

	/**
	 * Run the void removeEvalResult(EvaluationResult) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testRemoveEvalResult_2() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final EvaluationResult result = new EvaluationResult();

		fixture.removeEvalResult(result);

		Assert.assertEquals(0, fixture.getEvaluationResults().size());
	}

	/**
	 * Run the void removeEvalResult(EvaluationResult) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testRemoveEvalResult_3() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final EvaluationResult result = new EvaluationResult();
		result.setId("other");

		fixture.removeEvalResult(result);

		Assert.assertEquals(1, fixture.getEvaluationResults().size());
	}

	/**
	 * Run the void removeMeasureResult(AbstractEntity) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testRemoveMeasureResult_1() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final AbstractEntity result = null;

		fixture.removeMeasureResult(result);

		Assert.assertEquals(1, fixture.getMeasurementResults().size());
	}

	/**
	 * Run the void removeMeasureResult(AbstractEntity) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testRemoveMeasureResult_2() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final AbstractEntity result = new MeasurementResult();

		fixture.removeMeasureResult(result);

		Assert.assertEquals(0, fixture.getMeasurementResults().size());
	}

	/**
	 * Run the void removeMeasureResult(AbstractEntity) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testRemoveMeasureResult_3() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final AbstractEntity result = new AbstractResult();
		result.setId("other");
		fixture.removeMeasureResult(result);

		Assert.assertEquals(1, fixture.getMeasurementResults().size());
	}

	/**
	 * Run the void setDate(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testSetDate_1() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final String date = "";

		fixture.setDate(date);

		Assert.assertEquals(date, fixture.getDate());
	}

	/**
	 * Run the void setSystem(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	@Test
	public void testSetSystem_1() throws Exception {
		final QualityModelResult fixture = new QualityModelResult("", "");
		fixture.addMeasureResult(new MeasurementResult());
		fixture.addEvalResult(new EvaluationResult());
		final String system = "";

		fixture.setSystem(system);

		Assert.assertEquals(system, fixture.getSystem());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 * @generatedBy CodePro at 5/30/15 3:49 PM
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
	 * @generatedBy CodePro at 5/30/15 3:49 PM
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
	 * @generatedBy CodePro at 5/30/15 3:49 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(QualityModelResultTest.class);
	}
}