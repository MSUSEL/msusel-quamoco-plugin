package net.siliconcode.quamoco.aggregator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>MeasureTest</code> contains tests for the class
 * <code>{@link Measure}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:41 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class MeasureTest {

    /**
     * Run the Measure(String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testMeasure_1() throws Exception
    {
        String name = "";
        String parent = "";

        Measure result = new Measure(name, parent);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("", result.getName());
        assertEquals(0.0, result.getValue(), 1.0);
        assertEquals("", result.getParent());
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
        Measure fixture = new Measure("", "");
        fixture.setValue(1.0);

        String result = fixture.getName();

        // TODO: add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getParent() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetParent_1() throws Exception
    {
        Measure fixture = new Measure("", "");
        fixture.setValue(1.0);

        String result = fixture.getParent();

        // TODO: add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the double getValue() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetValue_1() throws Exception
    {
        Measure fixture = new Measure("", "");
        fixture.setValue(1.0);

        double result = fixture.getValue();

        // TODO: add additional test code here
        assertEquals(1.0, result, 0.1);
    }

    /**
     * Run the void setValue(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testSetValue_1() throws Exception
    {
        Measure fixture = new Measure("", "");
        fixture.setValue(1.0);
        double value = 1.0;

        fixture.setValue(value);

        assertEquals(value, fixture.getValue(), 0.01);
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
        new org.junit.runner.JUnitCore().run(MeasureTest.class);
    }
}