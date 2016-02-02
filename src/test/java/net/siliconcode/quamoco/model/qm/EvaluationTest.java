package net.siliconcode.quamoco.model.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
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
    public void testEvaluation_1() throws Exception
    {
        String name = "name";
        String description = "";
        String specification = "";
        double maximumPoints = 1.0;
        String completeness = "";
        Evaluates evaluates = new Evaluates("eval");
        String type = "";
        String id = "id";

        Evaluation result = new Evaluation(name, description, specification, maximumPoints, completeness, evaluates,
                type, id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getSpecification());
        assertEquals("eval", result.getEvaluates().getHREF());
        assertEquals(1.0, result.getMaximumPoints(), 1.0);
        assertEquals("", result.getCompleteness());
        assertEquals("", result.getType());
        assertEquals("", result.getDescription());
        assertEquals("name", result.getName());
        assertEquals("id", result.getId());
    }

    /**
     * Run the void addRanking(Ranking) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testAddRanking_1() throws Exception
    {
        Ranking rank = null;

        assertEquals(0, fixture.getRankings().size());
        fixture.addRanking(rank);

        // add additional test code here
        assertEquals(0, fixture.getRankings().size());
    }

    /**
     * Run the void addRanking(Ranking) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testAddRanking_2() throws Exception
    {
        Ranking rank = new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id");

        assertEquals(0, fixture.getRankings().size());
        fixture.addRanking(rank);
        assertEquals(1, fixture.getRankings().size());
    }

    /**
     * Run the void addRanking(Ranking) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testAddRanking_3() throws Exception
    {
        Ranking rank = new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id");

        assertEquals(0, fixture.getRankings().size());
        fixture.addRanking(rank);
        assertEquals(1, fixture.getRankings().size());
        fixture.addRanking(rank);
        assertEquals(1, fixture.getRankings().size());
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        Object obj = null;

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_2() throws Exception
    {
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_3() throws Exception
    {
        Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_4() throws Exception
    {
        Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_5() throws Exception
    {
        Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_6() throws Exception
    {
        Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_7() throws Exception
    {
        Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_8() throws Exception
    {
        Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_9() throws Exception
    {
        Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_10() throws Exception
    {
        Object obj = new Evaluation("name", "", "", 1.0, "", new Evaluates("eval"), "", "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the String getCompleteness() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetCompleteness_1() throws Exception
    {
        String result = fixture.getCompleteness();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getEvaluates() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetEvaluates_1() throws Exception
    {
        String result = fixture.getEvaluates().getHREF();

        // add additional test code here
        assertEquals("eval", result);
    }

    /**
     * Run the double getMaximumPoints() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetMaximumPoints_1() throws Exception
    {
        double result = fixture.getMaximumPoints();

        // add additional test code here
        assertEquals(1.0, result, 0.1);
    }

    /**
     * Run the List<Ranking> getRankings() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetRankings_1() throws Exception
    {
        List<Ranking> result = fixture.getRankings();

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
        Ranking rank = new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id");
        fixture.addRanking(rank);
        assertEquals(1, result.size());
    }

    /**
     * Run the String getSpecification() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetSpecification_1() throws Exception
    {
        String result = fixture.getSpecification();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the Object getType() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetType_1() throws Exception
    {
        String result = fixture.getType();

        // add additional test code here
        assertNotNull(result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testHashCode_1() throws Exception
    {
        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(-2094729228, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testHashCode_2() throws Exception
    {
        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(-2094729228, result);
    }

    /**
     * Run the void removeRanking(Ranking) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testRemoveRanking_1() throws Exception
    {
        fixture.addRanking(new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id"));
        Ranking rank = null;

        assertEquals(1, fixture.getRankings().size());
        fixture.removeRanking(rank);
        assertEquals(1, fixture.getRankings().size());
    }

    /**
     * Run the void removeRanking(Ranking) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testRemoveRanking_2() throws Exception
    {
        fixture.addRanking(new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id"));
        Ranking rank = new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id");

        assertEquals(1, fixture.getRankings().size());
        fixture.removeRanking(rank);
        assertTrue(fixture.getRankings().isEmpty());
    }

    /**
     * Run the void removeRanking(Ranking) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testRemoveRanking_3() throws Exception
    {
        fixture.addRanking(new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id"));
        Ranking rank = new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id2");

        assertEquals(1, fixture.getRankings().size());
        fixture.removeRanking(rank);
        assertEquals(1, fixture.getRankings().size());
    }

    /**
     * Run the void setCompleteness(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetCompleteness_1() throws Exception
    {
        String completeness = "45";

        fixture.setCompleteness(completeness);

        // add additional test code here
        assertEquals(completeness, fixture.getCompleteness());
    }

    /**
     * Run the void setEvaluates(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetEvaluates_1() throws Exception
    {
        String evaluates = "eval1";

        fixture.setEvaluates(new Evaluates(evaluates));

        // add additional test code here
        assertEquals("eval1", fixture.getEvaluates().getHREF());
    }

    /**
     * Run the void setMaximumPoints(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetMaximumPoints_1() throws Exception
    {
        double maximumPoints = 100.0;

        fixture.setMaximumPoints(maximumPoints);

        // add additional test code here
        assertEquals(maximumPoints, fixture.getMaximumPoints(), 0.01);
    }

    /**
     * Run the void setSpecification(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetSpecification_1() throws Exception
    {
        String specification = "result";

        fixture.setSpecification(specification);

        // add additional test code here
        assertEquals(specification, fixture.getSpecification());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Before
    public void setUp() throws Exception
    {
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
    public void tearDown() throws Exception
    {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args
     *            the command line arguments
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(EvaluationTest.class);
    }
}