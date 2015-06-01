package net.siliconcode.sonar.quamoco;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>QuamocoFileDistWidgetTest</code> contains tests for the class <code>{@link QuamocoFileDistWidget}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:44 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QuamocoFileDistWidgetTest {
    /**
     * Run the QuamocoFileDistWidget() constructor test.
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testQuamocoFileDistWidget_1()
        throws Exception
    {
        QuamocoFileDistWidget result = new QuamocoFileDistWidget();
        assertNotNull(result);
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
        QuamocoFileDistWidget fixture = new QuamocoFileDistWidget();

        String result = fixture.getId();

        // TODO: add additional test code here
        assertEquals("quamoco_filedist_widget", result);
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
        QuamocoFileDistWidget fixture = new QuamocoFileDistWidget();

        String result = fixture.getTemplatePath();

        // TODO: add additional test code here
        assertEquals("/net/siliconcode/sonar/quamoco/quamoco_filedist.html.erb", result);
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
        QuamocoFileDistWidget fixture = new QuamocoFileDistWidget();

        String result = fixture.getTitle();

        // TODO: add additional test code here
        assertEquals("Sonar Quamoco File Distribution", result);
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
        new org.junit.runner.JUnitCore().run(QuamocoFileDistWidgetTest.class);
    }
}