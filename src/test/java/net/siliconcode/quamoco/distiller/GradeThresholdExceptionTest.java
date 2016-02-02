package net.siliconcode.quamoco.aggregator;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GradeThresholdExceptionTest</code> contains tests for the
 * class <code>{@link GradeThresholdException}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:42 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class GradeThresholdExceptionTest {

    /**
     * Run the GradeThresholdException() constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testGradeThresholdException_1() throws Exception
    {

        GradeThresholdException result = new GradeThresholdException();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getCause());
        assertEquals("net.siliconcode.quamoco.aggregator.GradeThresholdException", result.toString());
        assertEquals(null, result.getMessage());
        assertEquals(null, result.getLocalizedMessage());
    }

    /**
     * Run the GradeThresholdException(String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testGradeThresholdException_2() throws Exception
    {
        String message = "";

        GradeThresholdException result = new GradeThresholdException(message);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getCause());
        assertEquals("net.siliconcode.quamoco.aggregator.GradeThresholdException: ", result.toString());
        assertEquals("", result.getMessage());
        assertEquals("", result.getLocalizedMessage());
    }

    /**
     * Run the GradeThresholdException(Throwable) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testGradeThresholdException_3() throws Exception
    {
        Throwable cause = new Throwable();

        GradeThresholdException result = new GradeThresholdException(cause);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("net.siliconcode.quamoco.aggregator.GradeThresholdException: java.lang.Throwable",
                result.toString());
        assertEquals("java.lang.Throwable", result.getMessage());
        assertEquals("java.lang.Throwable", result.getLocalizedMessage());
    }

    /**
     * Run the GradeThresholdException(String,Throwable) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testGradeThresholdException_4() throws Exception
    {
        String message = "";
        Throwable cause = new Throwable();

        GradeThresholdException result = new GradeThresholdException(message, cause);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("net.siliconcode.quamoco.aggregator.GradeThresholdException: ", result.toString());
        assertEquals("", result.getMessage());
        assertEquals("", result.getLocalizedMessage());
    }

    /**
     * Run the GradeThresholdException(String,Throwable,boolean,boolean)
     * constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testGradeThresholdException_5() throws Exception
    {
        String message = "";
        Throwable cause = new Throwable();
        boolean enableSuppression = true;
        boolean writableStackTrace = true;

        GradeThresholdException result = new GradeThresholdException(message, cause, enableSuppression,
                writableStackTrace);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("net.siliconcode.quamoco.aggregator.GradeThresholdException: ", result.toString());
        assertEquals("", result.getMessage());
        assertEquals("", result.getLocalizedMessage());
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
        new org.junit.runner.JUnitCore().run(GradeThresholdExceptionTest.class);
    }
}