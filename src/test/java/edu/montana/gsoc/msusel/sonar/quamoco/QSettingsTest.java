package edu.montana.gsoc.msusel.sonar.quamoco;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.montana.gsoc.msusel.sonar.quamoco.QuamocoSettings;

/**
 * The class <code>QSettingsTest</code> contains tests for the class
 * <code>{@link QuamocoSettings}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:44 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QSettingsTest {
    /**
     * Run the QSettings(Settings) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testQSettings_1() throws Exception
    {
        final QuamocoSettings result = new QuamocoSettings();

        // TODO: add additional test code here
        Assert.assertNotNull(result);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:44 PM
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
     * @generatedBy CodePro at 5/30/15 3:44 PM
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
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    public static void main(final String[] args)
    {
        new org.junit.runner.JUnitCore().run(QSettingsTest.class);
    }
}