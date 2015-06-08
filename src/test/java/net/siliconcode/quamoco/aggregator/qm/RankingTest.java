package net.siliconcode.quamoco.aggregator.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>RankingTest</code> contains tests for the class
 * <code>{@link Ranking}</code>.
 *
 * @generatedBy CodePro at 6/6/15 1:35 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class RankingTest {

    /**
     * Run the Ranking(String,String,String,String,String,String,String,String)
     * constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testRanking_1() throws Exception
    {
        String rank = "";
        String range = "";
        String weight = "";
        String measure = "";
        String factor = "";
        String normalizationMeasure = "";
        String ownerId = "";
        String id = "";

        Ranking result = new Ranking(rank, range, weight, measure, factor, normalizationMeasure, ownerId, id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getNormalizationMeasure());
        assertEquals("", result.getFactor());
        assertEquals("", result.getMeasure());
        assertEquals("", result.getOwnerId());
        assertEquals(null, result.getFunction());
        assertEquals("", result.getRange());
        assertEquals("", result.getWeight());
        assertEquals("", result.getRank());
        assertEquals("", result.getId());
        assertEquals(null, result.getDescription());
        assertEquals(null, result.getName());
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        Ranking obj = new Ranking("", "", "", "", "", "", "", "");
        obj.setFunction(new Function(1.0, 1.0, "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_2() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        Ranking obj = new Ranking("", "", "", "", "", "", "", "");
        obj.setFunction(new Function(1.0, 1.0, "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_3() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        Ranking obj = new Ranking("", "", "", "", "", "", "", "");
        obj.setFunction(new Function(1.0, 1.0, "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_4() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        Ranking obj = new Ranking("", "", "", "", "", "", "", "");
        obj.setFunction(new Function(1.0, 1.0, "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_5() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        Ranking obj = new Ranking("", "", "", "", "", "", "", "");
        obj.setFunction(new Function(1.0, 1.0, "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_6() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        Ranking obj = new Ranking("", "", "", "", "", "", "", "");
        obj.setFunction(new Function(1.0, 1.0, "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_7() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        Ranking obj = new Ranking("", "", "", "", "", "", "", "");
        obj.setFunction(new Function(1.0, 1.0, "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_8() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        Ranking obj = new Ranking("", "", "", "", "", "", "", "");
        obj.setFunction(new Function(1.0, 1.0, "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_9() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        Ranking obj = new Ranking("", "", "", "", "", "", "", "");
        obj.setFunction(new Function(1.0, 1.0, "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the String getFactor() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetFactor_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";

        String result = fixture.getFactor();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the Function getFunction() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetFunction_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";

        Function result = fixture.getFunction();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1.0, result.getUpperBound(), 1.0);
        assertEquals(1.0, result.getLowerBound(), 1.0);
        assertEquals("", result.getId());
        assertEquals("", result.getType());
    }

    /**
     * Run the String getId() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetId_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";

        String result = fixture.getId();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getMeasure() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetMeasure_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";

        String result = fixture.getMeasure();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getNormalizationMeasure() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetNormalizationMeasure_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";

        String result = fixture.getNormalizationMeasure();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getOwnerId() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetOwnerId_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";

        String result = fixture.getOwnerId();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getRange() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetRange_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";

        String result = fixture.getRange();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getRank() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetRank_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";

        String result = fixture.getRank();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getWeight() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetWeight_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";

        String result = fixture.getWeight();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testHashCode_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", (String) null, (String) null, "", "", (String) null);
        fixture.setId("");
        fixture.setFunction((Function) null);
        fixture.name = "";
        fixture.description = "";

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(-196513505, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testHashCode_2() throws Exception
    {
        Ranking fixture = new Ranking((String) null, (String) null, (String) null, "", "", (String) null,
                (String) null, "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(-886168608, result);
    }

    /**
     * Run the void setFactor(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetFactor_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        String factor = "";

        fixture.setFactor(factor);

        // add additional test code here
        assertEquals(factor, fixture.getFactor());
    }

    /**
     * Run the void setFunction(Function) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetFunction_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        Function function = new Function(1.0, 1.0, "", "");

        fixture.setFunction(function);

        // add additional test code here
        assertEquals(function, fixture.getFunction());
    }

    /**
     * Run the void setId(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetId_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        String id = "";

        fixture.setId(id);

        // add additional test code here
        assertEquals(id, fixture.getId());
    }

    /**
     * Run the void setMeasure(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetMeasure_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        String measure = "";

        fixture.setMeasure(measure);

        // add additional test code here
        assertEquals(measure, fixture.getMeasure());
    }

    /**
     * Run the void setNormalizationMeasure(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetNormalizationMeasure_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        String normalizationMeasure = "";

        fixture.setNormalizationMeasure(normalizationMeasure);

        assertEquals(normalizationMeasure, fixture.getNormalizationMeasure());
    }

    /**
     * Run the void setOwnerId(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetOwnerId_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        String ownerId = "";

        fixture.setOwnerId(ownerId);

        assertEquals(ownerId, fixture.getOwnerId());
    }

    /**
     * Run the void setRange(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetRange_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        String range = "";

        fixture.setRange(range);

        assertEquals(range, fixture.getRange());
    }

    /**
     * Run the void setRank(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetRank_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        String rank = "";

        fixture.setRank(rank);

        assertEquals(rank, fixture.getRank());
    }

    /**
     * Run the void setWeight(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetWeight_1() throws Exception
    {
        Ranking fixture = new Ranking("", "", "", "", "", "", "", "");
        fixture.setId("");
        fixture.setFunction(new Function(1.0, 1.0, "", ""));
        fixture.name = "";
        fixture.description = "";
        String weight = "";

        fixture.setWeight(weight);

        assertEquals(weight, fixture.getWeight());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Before
    public void setUp() throws Exception
    {
        // add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 6/6/15 1:35 PM
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
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(RankingTest.class);
    }
}