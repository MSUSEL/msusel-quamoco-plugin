package net.siliconcode.quamoco.aggregator.qmr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

/**
 * The class <code>EvaluationResultTest</code> contains tests for the class
 * <code>{@link EvaluationResult}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:49 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class EvaluationResultTest {

    /**
     * Run the EvaluationResult() constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEvaluationResult_1() throws Exception
    {

        EvaluationResult result = new EvaluationResult();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getRatioAffected());
        assertEquals(null, result.getResultsFrom());
        assertEquals(null, result.getResultsType());
        assertEquals(null, result.getValue());
        assertEquals(null, result.getType());
        assertEquals(null, result.getId());
    }

    /**
     * Run the void addEvalResult(EvaluationResult) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testAddEvalResult_1() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        EvaluationResult result = null;

        fixture.addEvalResult(result);

        assertEquals(0, fixture.getEvalResults().size());
    }

    /**
     * Run the void addEvalResult(EvaluationResult) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testAddEvalResult_2() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        EvaluationResult result = new EvaluationResult();

        fixture.addEvalResult(result);

        assertEquals(1, fixture.getEvalResults().size());
    }

    /**
     * Run the void addEvalResult(EvaluationResult) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testAddEvalResult_3() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        EvaluationResult result = new EvaluationResult();

        fixture.addEvalResult(new EvaluationResult());
        assertEquals(1, fixture.getEvalResults().size());
        fixture.addEvalResult(result);
        assertEquals(1, fixture.getEvalResults().size());
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        EvaluationResult obj = new EvaluationResult();
        obj.setResultsType("");
        obj.setResultsFrom("");
        obj.setRatioAffected("");
        obj.type = "";
        obj.value = new Value(1.0, 1.0, "");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_2() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        Object obj = null;

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_3() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_4() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        EvaluationResult obj = new EvaluationResult();
        obj.setRatioAffected("");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_5() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        EvaluationResult obj = new EvaluationResult();
        obj.setResultsFrom("");
        obj.setRatioAffected("");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_6() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        EvaluationResult obj = new EvaluationResult();
        obj.setResultsFrom("");
        obj.setRatioAffected("");
        obj.value = new Value(1.0, 1.0, "");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_7() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        EvaluationResult obj = new EvaluationResult();
        obj.setResultsFrom("");
        obj.setRatioAffected("");
        obj.value = new Value(1.0, 1.0, "");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_8() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = null;
        EvaluationResult obj = new EvaluationResult();
        obj.setResultsFrom("");
        obj.setRatioAffected("");
        obj.value = null;

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the List<EvaluationResult> getEvalResults() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetEvalResults_1() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");

        List<EvaluationResult> result = fixture.getEvalResults();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the String getRatioAffected() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetRatioAffected_1() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");

        String result = fixture.getRatioAffected();

        // TODO: add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getResultsFrom() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetResultsFrom_1() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");

        String result = fixture.getResultsFrom();

        // TODO: add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getResultsType() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetResultsType_1() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");

        String result = fixture.getResultsType();

        // TODO: add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testHashCode_1() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected((String) null);
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");

        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(-33494850, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testHashCode_2() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom((String) null);
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = null;

        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(29791, result);
    }

    /**
     * Run the void removeEvalResult(EvaluationResult) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testRemoveEvalResult_1() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.addEvalResult(new EvaluationResult());
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        EvaluationResult result = null;

        fixture.removeEvalResult(result);

        assertEquals(1, fixture.getEvalResults().size());
    }

    /**
     * Run the void removeEvalResult(EvaluationResult) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testRemoveEvalResult_2() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        EvaluationResult result = new EvaluationResult();

        fixture.removeEvalResult(result);

        assertEquals(0, fixture.getEvalResults().size());
    }

    /**
     * Run the void removeEvalResult(EvaluationResult) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testRemoveEvalResult_3() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addEvalResult(new EvaluationResult());
        EvaluationResult result = new EvaluationResult();
        result.setId("other");

        fixture.removeEvalResult(result);

        assertEquals(1, fixture.getEvalResults().size());
    }

    /**
     * Run the void setEvalResults(List<EvaluationResult>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetEvalResults_1() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        List<EvaluationResult> evalResults = Lists.newArrayList();

        assertEquals(0, fixture.getEvalResults().size());
        evalResults.add(new EvaluationResult());
        fixture.setEvalResults(evalResults);
        assertEquals(1, fixture.getEvalResults().size());
    }

    /**
     * Run the void setRatioAffected(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetRatioAffected_1() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        String ratioAffected = "0.5";

        fixture.setRatioAffected(ratioAffected);

        assertEquals(ratioAffected, fixture.getRatioAffected());
    }

    /**
     * Run the void setResultsFrom(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetResultsFrom_1() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        String resultsFrom = "";

        fixture.setResultsFrom(resultsFrom);

        assertEquals(resultsFrom, fixture.getResultsFrom());
    }

    /**
     * Run the void setResultsType(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetResultsType_1() throws Exception
    {
        EvaluationResult fixture = new EvaluationResult();
        fixture.setResultsType("");
        fixture.setResultsFrom("");
        fixture.setRatioAffected("");
        fixture.type = "";
        fixture.value = new Value(1.0, 1.0, "");
        String resultsType = "";

        fixture.setResultsType(resultsType);

        assertEquals(resultsType, fixture.getResultsType());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Before
    public void setUp() throws Exception
    {
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
    public void tearDown() throws Exception
    {
        // TODO: add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args
     *            the command line arguments
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(EvaluationResultTest.class);
    }
}