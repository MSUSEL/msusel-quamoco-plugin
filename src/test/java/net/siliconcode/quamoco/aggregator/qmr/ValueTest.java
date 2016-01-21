package net.siliconcode.quamoco.aggregator.qmr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.model.qmr.Value;

/**
 * The class <code>ValueTest</code> contains tests for the class
 * <code>{@link Value}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:49 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class ValueTest {

    /**
     * Run the Value(double,double,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testValue_1() throws Exception
    {
        double lower = 1.0;
        double upper = 1.0;
        String id = "";

        Value result = new Value(lower, upper, id);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(1.0, result.getMean(), 1.0);
        assertEquals(1.0, result.getLower(), 1.0);
        assertEquals(1.0, result.getUpper(), 1.0);
        assertEquals("", result.getId());
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        Value fixture = new Value(1.0, 1.0, "");
        Object obj = new Value(1.0, 1.0, "");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_2() throws Exception
    {
        Value fixture = new Value(1.0, 1.0, "");
        Object obj = null;

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_3() throws Exception
    {
        Value fixture = new Value(1.0, 1.0, "");
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_4() throws Exception
    {
        Value fixture = new Value(1.0, 1.0, "");
        Object obj = new Value(1.0, 1.0, "");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_5() throws Exception
    {
        Value fixture = new Value(1.0, 1.0, "");
        Object obj = new Value(1.0, 1.0, "");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_6() throws Exception
    {
        Value fixture = new Value(1.0, 1.0, (String) null);
        Object obj = new Value(1.0, 1.0, (String) null);

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_7() throws Exception
    {
        Value fixture = new Value(1.0, 1.0, "");
        Object obj = new Value(1.0, 1.0, "");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the String getId() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetId_1() throws Exception
    {
        Value fixture = new Value(1.0, 1.0, "");

        String result = fixture.getId();

        // TODO: add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the double getLower() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetLower_1() throws Exception
    {
        Value fixture = new Value(1.0, 1.0, "");

        double result = fixture.getLower();

        // TODO: add additional test code here
        assertEquals(1.0, result, 0.1);
    }

    /**
     * Run the double getMean() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetMean_1() throws Exception
    {
        Value fixture = new Value(1.0, 2.0, "");

        double result = fixture.getMean();

        // TODO: add additional test code here
        assertEquals(1.5, result, 0.1);
    }

    /**
     * Run the double getMean() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetMean_2() throws Exception
    {
        Value fixture = new Value(-2.0, 2.0, "");

        double result = fixture.getMean();

        // TODO: add additional test code here
        assertEquals(2.0, result, 0.1);
    }

    /**
     * Run the double getMean() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetMean_3() throws Exception
    {
        Value fixture = new Value(-1.0, -1.0, "");

        double result = fixture.getMean();

        // TODO: add additional test code here
        assertEquals(-1.0, result, 0.1);
    }

    /**
     * Run the double getMean() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetMean_4() throws Exception
    {
        Value fixture = new Value(1.0, -1.0, "");

        double result = fixture.getMean();

        // TODO: add additional test code here
        assertEquals(1.0, result, 0.1);
    }

    /**
     * Run the double getUpper() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetUpper_1() throws Exception
    {
        Value fixture = new Value(1.0, 1.0, "");

        double result = fixture.getUpper();

        // TODO: add additional test code here
        assertEquals(1.0, result, 0.1);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testHashCode_1() throws Exception
    {
        Value fixture = new Value(1.0, 1.0, "");

        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(-33524641, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testHashCode_2() throws Exception
    {
        Value fixture = new Value(1.0, 1.0, (String) null);

        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(-33524641, result);
    }

    /**
     * Run the void setId(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetId_1() throws Exception
    {
        Value fixture = new Value(1.0, 1.0, "");
        String id = "";

        fixture.setId(id);

        assertEquals(id, fixture.getId());
    }

    /**
     * Run the void setLower(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetLower_1() throws Exception
    {
        Value fixture = new Value(1.0, 1.0, "");
        double lower = 1.0;

        fixture.setLower(lower);

        assertEquals(lower, fixture.getLower(), 0.01);
    }

    /**
     * Run the void setUpper(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetUpper_1() throws Exception
    {
        Value fixture = new Value(1.0, 1.0, "");
        double upper = 1.0;

        fixture.setUpper(upper);

        assertEquals(upper, fixture.getUpper(), 0.01);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:49 PM
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
     * @generatedBy CodePro at 5/30/15 3:49 PM
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
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(ValueTest.class);
    }
}