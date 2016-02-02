package net.siliconcode.sonar.quamoco.profiles;

import org.junit.*;
import net.siliconcode.sonar.quamoco.profiles.xml.QuamocoProfile;
import static org.junit.Assert.*;

/**
 * The class <code>QuamocoProfileExporterTest</code> contains tests for the class <code>{@link QuamocoProfileExporter}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class QuamocoProfileExporterTest {
    /**
     * Run the void exportProfile(QuamocoProfile) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testExportProfile_1()
        throws Exception
    {
        QuamocoProfileExporter fixture = new QuamocoProfileExporter();
        QuamocoProfile profile = new QuamocoProfile("");

        fixture.exportProfile(profile);

        // add additional test code here
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
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
     * @generatedBy CodePro at 1/26/16 6:35 PM
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
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(QuamocoProfileExporterTest.class);
    }
}