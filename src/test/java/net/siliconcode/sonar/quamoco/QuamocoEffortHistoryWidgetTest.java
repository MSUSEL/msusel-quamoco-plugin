package net.siliconcode.sonar.quamoco;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>QuamocoEffortHistoryWidgetTest</code> contains tests for the class <code>{@link QuamocoEffortHistoryWidget}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:44 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QuamocoEffortHistoryWidgetTest {
    /**
     * Run the QuamocoEffortHistoryWidget() constructor test.
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testQuamocoEffortHistoryWidget_1()
        throws Exception
    {
        QuamocoEffortHistoryWidget result = new QuamocoEffortHistoryWidget();
        assertNotNull(result);
        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the String getId() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetId_1()
        throws Exception
    {
        QuamocoEffortHistoryWidget fixture = new QuamocoEffortHistoryWidget();

        String result = fixture.getId();

        // TODO: add additional test code here
        assertEquals("quamoco_efforthistory_widget", result);
        fail("unverified");
    }

    /**
     * Run the String getTemplatePath() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTemplatePath_1()
        throws Exception
    {
        QuamocoEffortHistoryWidget fixture = new QuamocoEffortHistoryWidget();

        String result = fixture.getTemplatePath();

        // TODO: add additional test code here
        assertEquals("/net/siliconcode/sonar/quamoco/quamoco_effort_history.html.erb", result);
        fail("unverified");
    }

    /**
     * Run the String getTitle() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTitle_1()
        throws Exception
    {
        QuamocoEffortHistoryWidget fixture = new QuamocoEffortHistoryWidget();

        String result = fixture.getTitle();

        // TODO: add additional test code here
        assertEquals("Sonar Quamoco Effort to Rating History", result);
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
        new org.junit.runner.JUnitCore().run(QuamocoEffortHistoryWidgetTest.class);
    }
}