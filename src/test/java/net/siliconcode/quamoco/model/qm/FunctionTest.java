package net.siliconcode.quamoco.model.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.model.qm.Function;

/**
 * The class <code>FunctionTest</code> contains tests for the class
 * <code>{@link Function}</code>.
 *
 * @generatedBy CodePro at 6/6/15 1:35 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class FunctionTest {

    /**
     * Run the Function(double,double,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testFunction_1() throws Exception
    {
        double lowerBound = 1.0;
        double upperBound = 1.0;
        String type = "";
        String id = "";

        Function result = new Function(lowerBound, upperBound, type, id);

        // add additional test code here
        assertNotNull(result);
        assertEquals(1.0, result.getUpperBound(), 1.0);
        assertEquals(1.0, result.getLowerBound(), 1.0);
        assertEquals("", result.getId());
        assertEquals("", result.getType());
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", "");
        Object obj = new Function(1.0, 1.0, "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_2() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", "");
        Object obj = null;

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_3() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", "");
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_4() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", "");
        Object obj = new Function(1.0, 1.0, "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_5() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", "");
        Object obj = new Function(1.0, 1.0, "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_6() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", (String) null);
        Object obj = new Function(1.0, 1.0, "", (String) null);

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_7() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", "");
        Object obj = new Function(1.0, 1.0, "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the String getId() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetId_1() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", "");

        String result = fixture.getId();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the double getLowerBound() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetLowerBound_1() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", "");

        double result = fixture.getLowerBound();

        // add additional test code here
        assertEquals(1.0, result, 0.1);
    }

    /**
     * Run the String getType() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetType_1() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", "");

        String result = fixture.getType();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the double getUpperBound() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetUpperBound_1() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", "");

        double result = fixture.getUpperBound();

        // add additional test code here
        assertEquals(1.0, result, 0.1);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testHashCode_1() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", "");

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(-33524641, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testHashCode_2() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", (String) null);

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(-33524641, result);
    }

    /**
     * Run the void setId(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetId_1() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", "");
        String id = "";

        fixture.setId(id);

        assertEquals(id, fixture.getId());
    }

    /**
     * Run the void setLowerBound(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetLowerBound_1() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", "");
        double lowerBound = 1.0;

        fixture.setLowerBound(lowerBound);

        assertEquals(lowerBound, fixture.getLowerBound(), 0.01);
    }

    /**
     * Run the void setType(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetType_1() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", "");
        String type = "";

        fixture.setType(type);

        assertEquals(type, fixture.getType());
    }

    /**
     * Run the void setUpperBound(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetUpperBound_1() throws Exception
    {
        Function fixture = new Function(1.0, 1.0, "", "");
        double upperBound = 1.0;

        fixture.setUpperBound(upperBound);

        assertEquals(upperBound, fixture.getUpperBound(), 0.01);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Before
    public void setUp() throws Exception
    {
        // add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @After
    public void tearDown() throws Exception
    {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args
     *            the command line arguments
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(FunctionTest.class);
    }
}