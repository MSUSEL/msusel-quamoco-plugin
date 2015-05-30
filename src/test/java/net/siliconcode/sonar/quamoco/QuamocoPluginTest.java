package net.siliconcode.sonar.quamoco;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.sonar.api.Extension;

/**
 * The class <code>QuamocoPluginTest</code> contains tests for the class <code>{@link QuamocoPlugin}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:44 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QuamocoPluginTest {
    /**
     * Run the List<Class<? extends Extension>> getExtensions() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetExtensions_1()
        throws Exception
    {
        QuamocoPlugin fixture = new QuamocoPlugin();

        List<Class<? extends Extension>> result = fixture.getExtensions();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(6, result.size());
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Before
    public void setUp()
        throws Exception
    {
        // TODO: add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @After
    public void tearDown()
        throws Exception
    {
        // TODO: add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(QuamocoPluginTest.class);
    }
}