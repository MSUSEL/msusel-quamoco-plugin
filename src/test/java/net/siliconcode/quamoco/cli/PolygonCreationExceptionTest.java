package net.siliconcode.quamoco.cli;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>PolygonCreationExceptionTest</code> contains tests for the
 * class <code>{@link PolygonCreationException}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class PolygonCreationExceptionTest {

    /**
     * Run the PolygonCreationException() constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testPolygonCreationException_1() throws Exception
    {

        PolygonCreationException result = new PolygonCreationException();

        // add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getCause());
        assertEquals("net.siliconcode.quamoco.cli.PolygonCreationException", result.toString());
        assertEquals(null, result.getMessage());
        assertEquals(null, result.getLocalizedMessage());
    }

    /**
     * Run the PolygonCreationException(String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testPolygonCreationException_2() throws Exception
    {
        String message = "message";

        PolygonCreationException result = new PolygonCreationException(message);

        // add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getCause());
        assertEquals("net.siliconcode.quamoco.cli.PolygonCreationException: message", result.toString());
        assertEquals("message", result.getMessage());
        assertEquals("message", result.getLocalizedMessage());
    }

    /**
     * Run the PolygonCreationException(Throwable) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testPolygonCreationException_3() throws Exception
    {
        Throwable cause = new Throwable();

        PolygonCreationException result = new PolygonCreationException(cause);

        // add additional test code here
        assertNotNull(result);
        assertEquals("net.siliconcode.quamoco.cli.PolygonCreationException: java.lang.Throwable", result.toString());
        assertEquals("java.lang.Throwable", result.getMessage());
        assertEquals("java.lang.Throwable", result.getLocalizedMessage());
    }

    /**
     * Run the PolygonCreationException(String,Throwable) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testPolygonCreationException_4() throws Exception
    {
        String message = "message";
        Throwable cause = new Throwable();

        PolygonCreationException result = new PolygonCreationException(message, cause);

        // add additional test code here
        assertNotNull(result);
        assertEquals("net.siliconcode.quamoco.cli.PolygonCreationException: message", result.toString());
        assertEquals("message", result.getMessage());
        assertEquals("message", result.getLocalizedMessage());
    }

    /**
     * Run the PolygonCreationException(String,Throwable,boolean,boolean)
     * constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testPolygonCreationException_5() throws Exception
    {
        String message = "message";
        Throwable cause = new Throwable();
        boolean enableSuppression = true;
        boolean writableStackTrace = true;

        PolygonCreationException result = new PolygonCreationException(message, cause, enableSuppression,
                writableStackTrace);

        // add additional test code here
        assertNotNull(result);
        assertEquals("net.siliconcode.quamoco.cli.PolygonCreationException: message", result.toString());
        assertEquals("message", result.getMessage());
        assertEquals("message", result.getLocalizedMessage());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 1/26/16 6:38 PM
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
     * @generatedBy CodePro at 1/26/16 6:38 PM
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
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(PolygonCreationExceptionTest.class);
    }
}