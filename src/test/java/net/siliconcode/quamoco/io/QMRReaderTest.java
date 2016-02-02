package net.siliconcode.quamoco.aggregator.io;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.io.QMRReader;
import net.siliconcode.quamoco.model.qmr.EvaluationResult;
import net.siliconcode.quamoco.model.qmr.FindingMessage;
import net.siliconcode.quamoco.model.qmr.MeasurementResult;
import net.siliconcode.quamoco.model.qmr.QualityModelResult;
import net.siliconcode.quamoco.model.qmr.Value;

/**
 * The class <code>QMRReaderTest</code> contains tests for the class
 * <code>{@link QMRReader}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:42 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QMRReaderTest {

    /**
     * Run the QMRReader() constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testQMRReader_1() throws Exception
    {

        QMRReader result = new QMRReader();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getResult());
    }

    /**
     * Run the QualityModelResult getResult() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testGetResult_1() throws Exception
    {
        QMRReader fixture = new QMRReader();

        QualityModelResult result = fixture.getResult();

        // TODO: add additional test code here
        assertEquals(null, result);
    }

    /**
     * Run the void read(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testRead_1() throws Exception
    {
        QMRReader fixture = new QMRReader();
        fixture.read("testdata/test.qmr");

        QualityModelResult result = fixture.getResult();
        assertNotNull(result);
        assertEquals("test", result.getSystem());
        assertEquals("2013-05-29T09:09:31.253+0200", result.getDate());

        assertEquals(3, result.getMeasurementResults().size());
        MeasurementResult mr1 = result.getMeasurementResults().get(0);
        assertEquals("_taU0kMguEeKB3pQmwdg3FA", mr1.getId());
        assertEquals(1, mr1.getCount());
        assertEquals("qm:FindingsMeasurementResult", mr1.getType());
        assertEquals("java.qm#_9LpQ43MWEd-Ywpz7Oo8Ghw", mr1.getResultsFrom());
        assertEquals("qm:ToolBasedInstrument", mr1.getResultsType());
        
        assertEquals(1, mr1.getFindingMessages().size());
        FindingMessage msg1 = mr1.getFindingMessages().get(0);
        assertEquals("_taVboMguEeKB3pQmwdg3FA", msg1.getId());
        assertEquals("filestats.FileCreationDate.GENERIC_EXECUTE has insufficient comment.", msg1.getLocation());
        assertEquals("test/src/filestats/FileCreationDate.java:17-17", msg1.getMessage());
        
        MeasurementResult mr2 = result.getMeasurementResults().get(1);
        assertEquals("_taWCsMguEeKB3pQmwdg3FA", mr2.getId());
        assertEquals(0, mr2.getCount());
        assertEquals("qm:FindingsMeasurementResult", mr2.getType());
        assertEquals("java.qm#_9LpQ7XMWEd-Ywpz7Oo8Ghw", mr2.getResultsFrom());
        assertEquals("qm:ToolBasedInstrument", mr2.getResultsType());
        
        MeasurementResult mr3 = result.getMeasurementResults().get(2);
        assertEquals("_tcJZgsguEeKB3pQmwdg3FA", mr3.getId());
        assertEquals(1, mr3.getCount());
        assertEquals("qm:FindingsMeasurementResult", mr3.getType());
        assertEquals("java.qm#_9LpQ53MWEd-Ywpz7Oo8Ghw", mr3.getResultsFrom());
        assertEquals("qm:ToolBasedInstrument", mr3.getResultsType());
        
        assertEquals(1, mr3.getFindingMessages().size());
        FindingMessage msg2 = mr3.getFindingMessages().get(0);
        assertEquals("_tcJZg8guEeKB3pQmwdg3FA", msg2.getId());
        assertEquals("Avoid unused local variables such as 'iLastError'.", msg2.getLocation());
        assertEquals("test/src/filestats/FileCreationDate.java:68-68", msg2.getMessage());

        assertEquals(4, result.getEvaluationResults().size());
        EvaluationResult er1 = result.getEvaluationResults().get(0);
        assertEquals("_tcGWMMguEeKB3pQmwdg3FA", er1.getId());
        assertEquals(null, er1.getRatioAffected());
        assertEquals("java.qm#_yi0EYJKiEeCZ2qLvmkZpQQ", er1.getResultsFrom());
        assertEquals("qm:WeightedSumMultiMeasureEvaluation", er1.getResultsType());
        assertEquals("qm:MultiMeasureEvaluationResult", er1.getType());
        assertEquals(3, er1.getEvalResults().size());
        
        Value v1 = er1.getValue();
        assertNotNull(v1);
        assertEquals(0.9999999999999998, v1.getUpper(), 0.000001);
        assertEquals(0.9999999999999998, v1.getLower(), 0.000001);
        assertEquals("_tcGWN8guEeKB3pQmwdg3FA", v1.getId());
        
        EvaluationResult er2 = result.getEvaluationResults().get(1);
        assertEquals("_tcGWMcguEeKB3pQmwdg3FA", er2.getId());
        assertEquals(null, er2.getRatioAffected());
        assertEquals("java.qm#_Bj1BMKC0EeCXeaQmNuK36Q", er2.getResultsFrom());
        assertEquals(null, er2.getResultsType());
        assertEquals(null, er2.getType());
        
        Value v2 = er2.getValue();
        assertNotNull(v2);
        assertEquals(1.0, v2.getUpper(), 0.01);
        assertEquals(1.0, v2.getLower(), 0.01);
        assertEquals("_tcGWMsguEeKB3pQmwdg3FA", v2.getId());
        
        EvaluationResult er3 = result.getEvaluationResults().get(2);
        assertEquals("_tcGWM8guEeKB3pQmwdg3FA", er3.getId());
        assertEquals(null, er3.getRatioAffected());
        assertEquals("java.qm#_Bj1BMqC0EeCXeaQmNuK36Q", er3.getResultsFrom());
        assertEquals(null, er3.getResultsType());
        assertEquals(null, er3.getType());
        
        Value v3 = er3.getValue();
        assertNotNull(v3);
        assertEquals(1.0, v3.getUpper(), 0.01);
        assertEquals(1.0, v3.getLower(), 0.01);
        assertEquals("_tcGWNMguEeKB3pQmwdg3FA", v3.getId());
        
        EvaluationResult er4 = result.getEvaluationResults().get(3);
        assertEquals("_tcGWNcguEeKB3pQmwdg3FA", er4.getId());
        assertEquals(null, er4.getRatioAffected());
        assertEquals("java.qm#_Bj1BNKC0EeCXeaQmNuK36Q", er4.getResultsFrom());
        assertEquals(null, er4.getResultsType());
        assertEquals(null, er4.getType());
        
        Value v4 = er4.getValue();
        assertNotNull(v4);
        assertEquals(1.0, v4.getUpper(), 0.01);
        assertEquals(1.0, v4.getLower(), 0.01);
        assertEquals("_tcGWNsguEeKB3pQmwdg3FA", v4.getId());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:42 PM
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
     * @generatedBy CodePro at 5/30/15 3:42 PM
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
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(QMRReaderTest.class);
    }
}