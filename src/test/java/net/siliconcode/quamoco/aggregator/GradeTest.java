package net.siliconcode.quamoco.aggregator;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>GradeTest</code> contains tests for the class <code>{@link Grade}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:41 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class GradeTest {
    /**
     * Run the int evaluate(Double) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testEvaluate_1()
        throws Exception
    {
        Grade fixture = Grade.A;
        Double val = new Double(1.0);

        int result = fixture.evaluate(val);

        // TODO: add additional test code here
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the int evaluate(Double) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testEvaluate_2()
        throws Exception
    {
        Grade fixture = Grade.A;
        Double val = new Double(1.0);

        int result = fixture.evaluate(val);

        // TODO: add additional test code here
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the int evaluate(Double) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testEvaluate_3()
        throws Exception
    {
        Grade fixture = Grade.A;
        Double val = new Double(1.0);

        int result = fixture.evaluate(val);

        // TODO: add additional test code here
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the List<Grade> getGrades() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetGrades_1()
        throws Exception
    {

        List<Grade> result = Grade.getGrades();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(7, result.size());
        fail("unverified");
    }

    /**
     * Run the String getName() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetName_1()
        throws Exception
    {
        Grade fixture = Grade.A;

        String result = fixture.getName();

        // TODO: add additional test code here
        assertEquals("A", result);
        fail("unverified");
    }

    /**
     * Run the void setThresholds(double,double) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testSetThresholds_1()
        throws Exception
    {
        Grade fixture = Grade.A;
        double lower = 1.0;
        double upper = 1.0;

        fixture.setThresholds(lower, upper);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setThresholds(double,double) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testSetThresholds_2()
        throws Exception
    {
        Grade fixture = Grade.A;
        double lower = 1.0;
        double upper = 1.0;

        fixture.setThresholds(lower, upper);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
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
     * @generatedBy CodePro at 5/30/15 3:41 PM
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
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(GradeTest.class);
    }
}