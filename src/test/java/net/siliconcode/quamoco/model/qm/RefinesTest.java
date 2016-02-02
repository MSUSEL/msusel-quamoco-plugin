package net.siliconcode.quamoco.model.qm;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RefinesTest</code> contains tests for the class <code>{@link Refines}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class RefinesTest {
    /**
     * Run the Refines(String) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testRefines_1()
        throws Exception
    {
        String href = "href";

        Refines result = new Refines(href);

        // add additional test code here
        assertNotNull(result);
        assertEquals("href", result.getHREF());
        assertEquals("href", result.toString());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 1/26/16 6:38 PM
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
     * @generatedBy CodePro at 1/26/16 6:38 PM
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
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(RefinesTest.class);
    }
}