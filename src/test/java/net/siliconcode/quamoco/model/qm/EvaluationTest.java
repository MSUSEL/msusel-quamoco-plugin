package net.siliconcode.quamoco.aggregator.qm;

import java.util.List;
import org.junit.*;

import net.siliconcode.quamoco.model.qm.Evaluation;
import net.siliconcode.quamoco.model.qm.Ranking;

import static org.junit.Assert.*;

/**
 * The class <code>EvaluationTest</code> contains tests for the class <code>{@link Evaluation}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:26 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class EvaluationTest {
    /**
     * Run the Evaluation(String,String,String,double,String,String,String,String) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEvaluation_1()
        throws Exception
    {
        String name = "";
        String description = "";
        String specification = "";
        double maximumPoints = 1.0;
        String completeness = "";
        String evaluates = "";
        String type = "";
        String id = "";

        Evaluation result = new Evaluation(name, description, specification, maximumPoints, completeness, evaluates, type, id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getSpecification());
        assertEquals("", result.getEvaluates());
        assertEquals(1.0, result.getMaximumPoints(), 1.0);
        assertEquals("", result.getCompleteness());
        assertEquals("", result.getType());
        assertEquals("", result.getDescription());
        assertEquals("", result.getName());
        assertEquals("", result.getId());
    }

    /**
     * Run the void addRanking(Ranking) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testAddRanking_1()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Ranking rank = null;

        fixture.addRanking(rank);

        // add additional test code here
    }

    /**
     * Run the void addRanking(Ranking) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testAddRanking_2()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Ranking rank = new Ranking("", "", "", "", "", "", "", "");

        fixture.addRanking(rank);

        // add additional test code here
    }

    /**
     * Run the void addRanking(Ranking) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testAddRanking_3()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Ranking rank = new Ranking("", "", "", "", "", "", "", "");

        fixture.addRanking(rank);

        // add additional test code here
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_1()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Object obj = null;

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_2()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_3()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Object obj = new Evaluation("", "", "", 1.0, "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_4()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Object obj = new Evaluation("", "", "", 1.0, "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_5()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Object obj = new Evaluation("", "", "", 1.0, "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_6()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Object obj = new Evaluation("", "", "", 1.0, "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_7()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Object obj = new Evaluation("", "", "", 1.0, "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_8()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Object obj = new Evaluation("", "", "", 1.0, "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_9()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Object obj = new Evaluation("", "", "", 1.0, "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_10()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Object obj = new Evaluation("", "", "", 1.0, "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the String getCompleteness() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetCompleteness_1()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));

        String result = fixture.getCompleteness();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getEvaluates() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetEvaluates_1()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));

        String result = fixture.getEvaluates();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the double getMaximumPoints() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetMaximumPoints_1()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));

        double result = fixture.getMaximumPoints();

        // add additional test code here
        assertEquals(1.0, result, 0.1);
    }

    /**
     * Run the List<Ranking> getRankings() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetRankings_1()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));

        List<Ranking> result = fixture.getRankings();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the String getSpecification() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetSpecification_1()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));

        String result = fixture.getSpecification();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the Object getType() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetType_1()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));

        Object result = fixture.getType();

        // add additional test code here
        assertNotNull(result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testHashCode_1()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", (String) null, "", 1.0, (String) null, (String) null, "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(1808870623, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testHashCode_2()
        throws Exception
    {
        Evaluation fixture = new Evaluation((String) null, "", (String) null, 1.0, "", "", "", (String) null);
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(1808870623, result);
    }

    /**
     * Run the void removeRanking(Ranking) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testRemoveRanking_1()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Ranking rank = null;

        fixture.removeRanking(rank);

        // add additional test code here
    }

    /**
     * Run the void removeRanking(Ranking) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testRemoveRanking_2()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Ranking rank = new Ranking("", "", "", "", "", "", "", "");

        fixture.removeRanking(rank);

        // add additional test code here
    }

    /**
     * Run the void removeRanking(Ranking) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testRemoveRanking_3()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        Ranking rank = new Ranking("", "", "", "", "", "", "", "");

        fixture.removeRanking(rank);

        // add additional test code here
    }

    /**
     * Run the void setCompleteness(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetCompleteness_1()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        String completeness = "";

        fixture.setCompleteness(completeness);

        // add additional test code here
    }

    /**
     * Run the void setEvaluates(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetEvaluates_1()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        String evaluates = "";

        fixture.setEvaluates(evaluates);

        // add additional test code here
    }

    /**
     * Run the void setMaximumPoints(double) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetMaximumPoints_1()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        double maximumPoints = 1.0;

        fixture.setMaximumPoints(maximumPoints);

        // add additional test code here
    }

    /**
     * Run the void setSpecification(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetSpecification_1()
        throws Exception
    {
        Evaluation fixture = new Evaluation("", "", "", 1.0, "", "", "", "");
        fixture.addRanking(new Ranking("", "", "", "", "", "", "", ""));
        String specification = "";

        fixture.setSpecification(specification);

        // add additional test code here
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Before
    public void setUp()
        throws Exception
    {
        // add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @After
    public void tearDown()
        throws Exception
    {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(EvaluationTest.class);
    }
}