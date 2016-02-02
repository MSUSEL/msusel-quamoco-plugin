package net.siliconcode.quamoco.model.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

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

    private Ranking fixture;

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
        String rank = "2";
        String range = "NA";
        String weight = "1.0";
        String measure = "measure";
        String normalizationMeasure = "norm";
        String ownerId = "owner";
        String id = "id";

        Ranking result = new Ranking(rank, range, weight, new MeasureLink(measure), null,
                new NormalizationMeasure(normalizationMeasure), ownerId, id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("norm", result.getNormalizationMeasure().getHREF());
        assertEquals(null, result.getFactor());
        assertEquals("measure", result.getMeasure().getHREF());
        assertEquals("owner", result.getOwnerId());
        assertEquals(null, result.getFunction());
        assertEquals("NA", result.getRange().toString());
        assertEquals("1.0", result.getWeight());
        assertEquals("2", result.getRank());
        assertEquals("id", result.getId());
        assertEquals("", result.getDescription());
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
        Ranking obj = new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id");

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
        Ranking obj = new Ranking("", "CLASS", "", new MeasureLink("measure"), null, null, "owner", "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
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
        Ranking obj = null;

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
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
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
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
        Ranking obj = new Ranking("", "NA", "", null, new FactorLink("factor"), null, "owner", "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
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
        Ranking obj = new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id");
        obj.setFunction(new Function(1.0, 1.0, "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
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
        Ranking obj = new Ranking("1", "NA", "", new MeasureLink("measure"), null, null, "owner", "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
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
        Ranking obj = new Ranking("", "NA", "", new MeasureLink("measure"), null, new NormalizationMeasure("norm"),
                "owner", "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
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
        fixture.setFactor(new FactorLink("factor"));
        FactorLink result = fixture.getFactor();

        // add additional test code here
        assertEquals("factor", result.getHREF());
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
        fixture.setFunction(new Function(0, 1.0, FunctionType.INCREASING, "function"));
        Function result = fixture.getFunction();

        // add additional test code here
        assertNotNull(result);
        assertEquals(0.0, result.getUpperBound(), 1.0);
        assertEquals(1.0, result.getLowerBound(), 1.0);
        assertEquals("function", result.getId());
        assertEquals(FunctionType.INCREASING, result.getType());
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
        String result = fixture.getId();

        // add additional test code here
        assertEquals("id", result);
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
        String result = fixture.getMeasure().getHREF();

        // add additional test code here
        assertEquals("measure", result);
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
        fixture.setNormalizationMeasure(new NormalizationMeasure("norm"));
        String result = fixture.getNormalizationMeasure().getHREF();

        // add additional test code here
        assertEquals("norm", result);
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
        String result = fixture.getOwnerId();

        // add additional test code here
        assertEquals("owner", result);
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
        String result = fixture.getRange().toString();

        // add additional test code here
        assertEquals("NA", result);
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
        String result = fixture.getWeight();

        // add additional test code here
        assertEquals("", result);
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
        String factor = "factor";

        assertNotNull(fixture.getMeasure());
        fixture.setFactor(null);
        assertNotNull(fixture.getMeasure());
        assertNull(fixture.getFactor());

        assertNull(fixture.getFactor());
        fixture.setFactor(new FactorLink(factor));

        // add additional test code here
        assertEquals(factor, fixture.getFactor().getHREF());
        assertNull(fixture.getMeasure());
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
        String id = "newId";

        fixture.setId(id);

        // add additional test code here
        assertEquals(id, fixture.getId());

        try
        {
            fixture.setId(null);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

        try
        {
            fixture.setId("");
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
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
        fixture.setFactor(new FactorLink("factor"));
        assertNull(fixture.getMeasure());

        fixture.setMeasure(null);
        assertNull(fixture.getMeasure());

        String measure = "measure2";
        fixture.setMeasure(new MeasureLink(measure));

        // add additional test code here
        assertNotNull(fixture.getMeasure());
        assertNull(fixture.getFactor());
        assertEquals(measure, fixture.getMeasure().getHREF());
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
        String normalizationMeasure = "measure";

        assertNull(fixture.getNormalizationMeasure());
        fixture.setNormalizationMeasure(new NormalizationMeasure(normalizationMeasure));

        assertEquals(normalizationMeasure, fixture.getNormalizationMeasure().getHREF());
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
        String ownerId = "newOwner";

        assertEquals("owner", fixture.getOwnerId());
        fixture.setOwnerId(ownerId);

        assertEquals(ownerId, fixture.getOwnerId());

        try
        {
            fixture.setOwnerId(null);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

        try
        {
            fixture.setOwnerId("");
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
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
        String range = "CLASS";

        assertEquals(NormalizationRange.NA, fixture.getRange());
        fixture.setRange(range);

        assertEquals(NormalizationRange.valueOf(range), fixture.getRange());
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
        String rank = "2";

        assertEquals("", fixture.getRank());
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
        String weight = "0.5";

        assertEquals("", fixture.getWeight());
        fixture.setWeight(weight);

        assertEquals(weight, fixture.getWeight());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization afails for some reason
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Before
    public void setUp() throws Exception
    {
        fixture = new Ranking("", "NA", "", new MeasureLink("measure"), null, null, "owner", "id");
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