package net.siliconcode.sonar.quamoco;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>QuamocoRatingWidgetTest</code> contains tests for the class <code>{@link QuamocoRatingWidget}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:44 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QuamocoRatingWidgetTest {
    /**
     * Run the QuamocoRatingWidget() constructor test.
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testQuamocoRatingWidget_1()
        throws Exception
    {
        QuamocoRatingWidget result = new QuamocoRatingWidget();
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
        QuamocoRatingWidget fixture = new QuamocoRatingWidget();

        String result = fixture.getId();

        // TODO: add additional test code here
        assertEquals("quamoco_rating_widget", result);
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
        QuamocoRatingWidget fixture = new QuamocoRatingWidget();

        String result = fixture.getTemplatePath();

        // TODO: add additional test code here
        assertEquals("/net/siliconcode/sonar/quamoco/quamoco_rating.html.erb", result);
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
        QuamocoRatingWidget fixture = new QuamocoRatingWidget();

        String result = fixture.getTitle();

        // TODO: add additional test code here
        assertEquals("Sonar Quamoco Quality Rating", result);
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
        new org.junit.runner.JUnitCore().run(QuamocoRatingWidgetTest.class);
    }
}