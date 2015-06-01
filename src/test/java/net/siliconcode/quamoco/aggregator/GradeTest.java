package net.siliconcode.quamoco.aggregator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>GradeTest</code> contains tests for the class
 * <code>{@link Grade}</code>.
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
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testEvaluate_1() throws Exception
    {
        Grade fixture = Grade.A;
        Double val = new Double(1.0);

        int result = fixture.evaluate(val);

        // TODO: add additional test code here
        assertEquals(0, result);
    }

    /**
     * Run the int evaluate(Double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testEvaluate_2() throws Exception
    {
        Grade fixture = Grade.A;
        Double val = new Double(1.0);

        int result = fixture.evaluate(val);

        // TODO: add additional test code here
        assertEquals(0, result);
    }

    /**
     * Run the int evaluate(Double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testEvaluate_3() throws Exception
    {
        Grade fixture = Grade.A;
        Double val = new Double(1.0);

        int result = fixture.evaluate(val);

        // TODO: add additional test code here
        assertEquals(0, result);
    }

    /**
     * Run the List<Grade> getGrades() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetGrades_1() throws Exception
    {

        List<Grade> result = Grade.getGrades();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(7, result.size());
    }

    /**
     * Run the String getName() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetName_1() throws Exception
    {
        Grade fixture = Grade.A;

        String result = fixture.getName();

        // TODO: add additional test code here
        assertEquals("A", result);
    }

    /**
     * Run the void setThresholds(double,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testSetThresholds_1() throws Exception
    {
        Grade fixture = Grade.A;
        double lower = 1.0;
        double upper = 1.0;

        try
        {
            fixture.setThresholds(lower, upper);
            assertEquals(lower, fixture.getLowerThreshold(), 0.01);
            assertEquals(upper, fixture.getUpperThreshold(), 0.01);
        }
        catch (IllegalArgumentException e)
        {
            fail();
        }
    }

    /**
     * Run the void setThresholds(double,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testSetThresholds_2() throws Exception
    {
        Grade fixture = Grade.A;
        fixture.setThresholds(0.0, 1.0);
        double lower = 1.0;
        double upper = 0.0;

        try
        {
            fixture.setThresholds(lower, upper);
            fail();
        }
        catch (GradeThresholdException e)
        {
            assertEquals(0.0, fixture.getLowerThreshold(), 0.01);
            assertEquals(1.0, fixture.getUpperThreshold(), 0.01);
        }
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:41 PM
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
     * @generatedBy CodePro at 5/30/15 3:41 PM
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
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(GradeTest.class);
    }
}