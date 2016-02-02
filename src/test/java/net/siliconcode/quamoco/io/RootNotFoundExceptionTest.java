package net.siliconcode.quamoco.io;

import org.junit.*;

import net.siliconcode.quamoco.io.RootNotFoundException;

import static org.junit.Assert.*;

/**
 * The class <code>RootNotFoundExceptionTest</code> contains tests for the class
 * <code>{@link RootNotFoundException}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:42 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class RootNotFoundExceptionTest {

    /**
     * Run the RootNotFoundException() constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testRootNotFoundException_1() throws Exception
    {

        RootNotFoundException result = new RootNotFoundException();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getCause());
        assertEquals("net.siliconcode.quamoco.io.RootNotFoundException", result.toString());
        assertEquals(null, result.getMessage());
        assertEquals(null, result.getLocalizedMessage());
    }

    /**
     * Run the RootNotFoundException(String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testRootNotFoundException_2() throws Exception
    {
        String message = "";

        RootNotFoundException result = new RootNotFoundException(message);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getCause());
        assertEquals("net.siliconcode.quamoco.io.RootNotFoundException: ", result.toString());
        assertEquals("", result.getMessage());
        assertEquals("", result.getLocalizedMessage());
    }

    /**
     * Run the RootNotFoundException(Throwable) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testRootNotFoundException_3() throws Exception
    {
        Throwable cause = new Throwable();

        RootNotFoundException result = new RootNotFoundException(cause);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("net.siliconcode.quamoco.io.RootNotFoundException: java.lang.Throwable", result.toString());
        assertEquals("java.lang.Throwable", result.getMessage());
        assertEquals("java.lang.Throwable", result.getLocalizedMessage());
    }

    /**
     * Run the RootNotFoundException(String,Throwable) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testRootNotFoundException_4() throws Exception
    {
        String message = "";
        Throwable cause = new Throwable();

        RootNotFoundException result = new RootNotFoundException(message, cause);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("net.siliconcode.quamoco.io.RootNotFoundException: ", result.toString());
        assertEquals("", result.getMessage());
        assertEquals("", result.getLocalizedMessage());
    }

    /**
     * Run the RootNotFoundException(String,Throwable,boolean,boolean)
     * constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testRootNotFoundException_5() throws Exception
    {
        String message = "";
        Throwable cause = new Throwable();
        boolean enableSuppression = true;
        boolean writableStackTrace = true;

        RootNotFoundException result = new RootNotFoundException(message, cause, enableSuppression, writableStackTrace);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("net.siliconcode.quamoco.io.RootNotFoundException: ", result.toString());
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
        new org.junit.runner.JUnitCore().run(RootNotFoundExceptionTest.class);
    }
}