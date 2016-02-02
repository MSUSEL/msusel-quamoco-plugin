package net.siliconcode.quamoco.aggregator.qmr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import net.siliconcode.quamoco.aggregator.AbstractEntity;
import net.siliconcode.quamoco.model.qmr.AbstractResult;
import net.siliconcode.quamoco.model.qmr.EvaluationResult;
import net.siliconcode.quamoco.model.qmr.MeasurementResult;
import net.siliconcode.quamoco.model.qmr.QualityModelResult;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
    public void testQualityModelResult_1() throws Exception
    {
        String date = "";
        String system = "";

        QualityModelResult result = new QualityModelResult(date, system);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("", result.getSystem());
        assertEquals("", result.getDate());
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
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        EvaluationResult result = null;

        fixture.addEvalResult(result);

        // TODO: add additional test code here
        assertEquals(1, fixture.getEvaluationResults().size());
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
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        EvaluationResult result = new EvaluationResult();
        result.setId("new");

        fixture.addEvalResult(result);

        // TODO: add additional test code here
        assertEquals(2, fixture.getEvaluationResults().size());
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
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        EvaluationResult result = new EvaluationResult();

        fixture.addEvalResult(result);

        assertEquals(1, fixture.getEvaluationResults().size());
    }

    /**
     * Run the void addMeasureResult(MeasurementResult) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testAddMeasureResult_1() throws Exception
    {
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        MeasurementResult result = null;

        fixture.addMeasureResult(result);

        // TODO: add additional test code here
        assertEquals(1, fixture.getMeasurementResults().size());
    }

    /**
     * Run the void addMeasureResult(MeasurementResult) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testAddMeasureResult_2() throws Exception
    {
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        MeasurementResult result = new MeasurementResult();
        result.setId("new");

        fixture.addMeasureResult(result);

        // TODO: add additional test code here
        assertEquals(2, fixture.getMeasurementResults().size());
    }

    /**
     * Run the void addMeasureResult(MeasurementResult) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testAddMeasureResult_3() throws Exception
    {
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        MeasurementResult result = new MeasurementResult();

        fixture.addMeasureResult(result);

        // TODO: add additional test code here
        assertEquals(1, fixture.getMeasurementResults().size());
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
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        QualityModelResult obj = new QualityModelResult("", "");
        obj.addMeasureResult(new MeasurementResult());
        obj.addEvalResult(new EvaluationResult());

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
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
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
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
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
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        Object obj = new QualityModelResult("", "");

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
    public void testEquals_5() throws Exception
    {
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        Object obj = new QualityModelResult("", "");

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
    public void testEquals_6() throws Exception
    {
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        Object obj = new QualityModelResult("", "");

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
        QualityModelResult fixture = new QualityModelResult("", (String) null);
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        Object obj = new QualityModelResult("", (String) null);

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the List<AbstractResult> getContained() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetContained_1() throws Exception
    {
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());

        List<AbstractResult> result = fixture.getContained();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the String getDate() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetDate_1() throws Exception
    {
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());

        String result = fixture.getDate();

        // TODO: add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the List<EvaluationResult> getEvaluationResults() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetEvaluationResults_1() throws Exception
    {
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());

        List<EvaluationResult> result = fixture.getEvaluationResults();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the List<MeasurementResult> getMeasurementResults() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetMeasurementResults_1() throws Exception
    {
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());

        List<MeasurementResult> result = fixture.getMeasurementResults();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the String getSystem() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetSystem_1() throws Exception
    {
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());

        String result = fixture.getSystem();

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
        QualityModelResult fixture = new QualityModelResult((String) null, "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());

        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(961, result);
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
        QualityModelResult fixture = new QualityModelResult("", (String) null);
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());

        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(961, result);
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
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        EvaluationResult result = null;

        fixture.removeEvalResult(result);

        assertEquals(1, fixture.getEvaluationResults().size());
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
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        EvaluationResult result = new EvaluationResult();

        fixture.removeEvalResult(result);

        assertEquals(0, fixture.getEvaluationResults().size());
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
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        EvaluationResult result = new EvaluationResult();
        result.setId("other");

        fixture.removeEvalResult(result);

        assertEquals(1, fixture.getEvaluationResults().size());
    }

    /**
     * Run the void removeMeasureResult(AbstractEntity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testRemoveMeasureResult_1() throws Exception
    {
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        AbstractEntity result = null;

        fixture.removeMeasureResult(result);

        assertEquals(1, fixture.getMeasurementResults().size());
    }

    /**
     * Run the void removeMeasureResult(AbstractEntity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testRemoveMeasureResult_2() throws Exception
    {
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        AbstractEntity result = new MeasurementResult();

        fixture.removeMeasureResult(result);

        assertEquals(0, fixture.getMeasurementResults().size());
    }

    /**
     * Run the void removeMeasureResult(AbstractEntity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testRemoveMeasureResult_3() throws Exception
    {
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        AbstractEntity result = new AbstractResult();
        result.setId("other");
        fixture.removeMeasureResult(result);

        assertEquals(1, fixture.getMeasurementResults().size());
    }

    /**
     * Run the void setDate(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetDate_1() throws Exception
    {
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        String date = "";

        fixture.setDate(date);

        assertEquals(date, fixture.getDate());
    }

    /**
     * Run the void setSystem(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetSystem_1() throws Exception
    {
        QualityModelResult fixture = new QualityModelResult("", "");
        fixture.addMeasureResult(new MeasurementResult());
        fixture.addEvalResult(new EvaluationResult());
        String system = "";

        fixture.setSystem(system);

        assertEquals(system, fixture.getSystem());
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
        new org.junit.runner.JUnitCore().run(QualityModelResultTest.class);
    }
}