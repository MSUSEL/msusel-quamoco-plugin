package net.siliconcode.quamoco.model.qm;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>EvaluationTest</code> contains tests for the class
 * <code>{@link Evaluation}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:26 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class EvaluationTest {

	private Evaluation fixture;

	/**
	 * Run the
	 * Evaluation(String,String,String,double,String,String,String,String)
	 * constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testEvaluation_1() throws Exception {
		final String name = "name";
		final String description = "";
		final String specification = "";
		final double maximumPoints = 1.0;
		final String completeness = "";
		final Evaluates evaluates = new Evaluates("eval");
		final String type = "";
		final String id = "id";

		final Evaluation result = new Evaluation(name, description, specification, maximumPoints, completeness,
				evaluates, type, id);

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals("", result.getSpecification());
		Assert.assertEquals("eval", result.getEvaluates().getHREF());
		Assert.assertEquals(1.0, result.getMaximumPoints(), 1.0);
		Assert.assertEquals("", result.getCompleteness());
		Assert.assertEquals("", result.getType());
		Assert.assertEquals("", result.getDescription());
		Assert.assertEquals("name", result.getName());
		Assert.assertEquals("id", result.getId());
	}

	/**
	 * Run the void addRanking(Ranking) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testAddRanking_1() throws Exception {
		final Ranking rank = null;

		Assert.assertEquals(0, fixture.getRankings().size());
		fixture.addRanking(rank);

		// add additional test code here
		Assert.assertEquals(0, fixture.getRankings().size());
	}

	/**
	 * Run the void addRanking(Ranking) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testAddRanking_2() throws Exception {
		final Ranking rank = new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id");

		Assert.assertEquals(0, fixture.getRankings().size());
		fixture.addRanking(rank);
		Assert.assertEquals(1, fixture.getRankings().size());
	}

	/**
	 * Run the void addRanking(Ranking) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testAddRanking_3() throws Exception {
		final Ranking rank = new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id");

		Assert.assertEquals(0, fixture.getRankings().size());
		fixture.addRanking(rank);
		Assert.assertEquals(1, fixture.getRankings().size());
		fixture.addRanking(rank);
		Assert.assertEquals(1, fixture.getRankings().size());
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testEquals_1() throws Exception {
		final Object obj = null;

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testEquals_2() throws Exception {
		final Object obj = new Object();

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testEquals_3() throws Exception {
		final Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testEquals_4() throws Exception {
		final Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testEquals_5() throws Exception {
		final Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testEquals_6() throws Exception {
		final Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testEquals_7() throws Exception {
		final Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testEquals_8() throws Exception {
		final Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testEquals_9() throws Exception {
		final Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testEquals_10() throws Exception {
		final Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the String getCompleteness() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testGetCompleteness_1() throws Exception {
		final String result = fixture.getCompleteness();

		// add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the String getEvaluates() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testGetEvaluates_1() throws Exception {
		final String result = fixture.getEvaluates().getHREF();

		// add additional test code here
		Assert.assertEquals("eval", result);
	}

	/**
	 * Run the double getMaximumPoints() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testGetMaximumPoints_1() throws Exception {
		final double result = fixture.getMaximumPoints();

		// add additional test code here
		Assert.assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the List<Ranking> getRankings() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testGetRankings_1() throws Exception {
		final List<Ranking> result = fixture.getRankings();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(0, result.size());
		final Ranking rank = new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id");
		fixture.addRanking(rank);
		Assert.assertEquals(1, result.size());
	}

	/**
	 * Run the String getSpecification() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testGetSpecification_1() throws Exception {
		final String result = fixture.getSpecification();

		// add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the Object getType() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testGetType_1() throws Exception {
		final String result = fixture.getType();

		// add additional test code here
		Assert.assertNotNull(result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testHashCode_1() throws Exception {
		final int result = fixture.hashCode();

		// add additional test code here
		Assert.assertEquals(-2094729228, result);
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testHashCode_2() throws Exception {
		final int result = fixture.hashCode();

		// add additional test code here
		Assert.assertEquals(-2094729228, result);
	}

	/**
	 * Run the void removeRanking(Ranking) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testRemoveRanking_1() throws Exception {
		fixture.addRanking(new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id"));
		final Ranking rank = null;

		Assert.assertEquals(1, fixture.getRankings().size());
		fixture.removeRanking(rank);
		Assert.assertEquals(1, fixture.getRankings().size());
	}

	/**
	 * Run the void removeRanking(Ranking) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testRemoveRanking_2() throws Exception {
		fixture.addRanking(new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id"));
		final Ranking rank = new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id");

		Assert.assertEquals(1, fixture.getRankings().size());
		fixture.removeRanking(rank);
		Assert.assertTrue(fixture.getRankings().isEmpty());
	}

	/**
	 * Run the void removeRanking(Ranking) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testRemoveRanking_3() throws Exception {
		fixture.addRanking(new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id"));
		final Ranking rank = new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id2");

		Assert.assertEquals(1, fixture.getRankings().size());
		fixture.removeRanking(rank);
		Assert.assertEquals(1, fixture.getRankings().size());
	}

	/**
	 * Run the void setCompleteness(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testSetCompleteness_1() throws Exception {
		final String completeness = "45";

		fixture.setCompleteness(completeness);

		// add additional test code here
		Assert.assertEquals(completeness, fixture.getCompleteness());
	}

	/**
	 * Run the void setEvaluates(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testSetEvaluates_1() throws Exception {
		final String evaluates = "eval1";

		fixture.setEvaluates(new Evaluates(evaluates));

		// add additional test code here
		Assert.assertEquals("eval1", fixture.getEvaluates().getHREF());
	}

	/**
	 * Run the void setMaximumPoints(double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testSetMaximumPoints_1() throws Exception {
		final double maximumPoints = 100.0;

		fixture.setMaximumPoints(maximumPoints);

		// add additional test code here
		Assert.assertEquals(maximumPoints, fixture.getMaximumPoints(), 0.01);
	}

	/**
	 * Run the void setSpecification(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Test
	public void testSetSpecification_1() throws Exception {
		final String specification = "result";

		fixture.setSpecification(specification);

		// add additional test code here
		Assert.assertEquals(specification, fixture.getSpecification());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	@Before
	public void setUp() throws Exception {
		fixture = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 * @generatedBy CodePro at 5/30/15 3:26 PM
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
	 * @generatedBy CodePro at 5/30/15 3:26 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(EvaluationTest.class);
	}
}