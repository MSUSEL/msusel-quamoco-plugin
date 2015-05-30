package net.siliconcode.quamoco.aggregator.qmr;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MeasurementResultTest</code> contains tests for the class <code>{@link MeasurementResult}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:49 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class MeasurementResultTest {
    /**
     * Run the MeasurementResult() constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testMeasurementResult_1()
        throws Exception
    {

        MeasurementResult result = new MeasurementResult();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getResultsFrom());
        assertEquals(null, result.getResultsType());
        assertEquals(0, result.getCount());
        assertEquals(null, result.getMessage());
        assertEquals(null, result.getValue());
        assertEquals(null, result.getType());
        assertEquals(null, result.getId());
        fail("unverified");
    }

    /**
     * Run the void addFindingMessage(FindingMessage) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testAddFindingMessage_1()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        FindingMessage fm = null;

        fixture.addFindingMessage(fm);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void addFindingMessage(FindingMessage) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testAddFindingMessage_2()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        FindingMessage fm = new FindingMessage("", "", "");

        fixture.addFindingMessage(fm);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void addFindingMessage(FindingMessage) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testAddFindingMessage_3()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        FindingMessage fm = new FindingMessage("", "", "");

        fixture.addFindingMessage(fm);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_1()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        MeasurementResult obj = new MeasurementResult();
        obj.setResultsFrom("");
        obj.setCount(1);
        obj.setMessage("");
        obj.setResultsType("");
        obj.value = new Value(1.0, 1.0, "");
        obj.addFindingMessage(new FindingMessage("", "", ""));
        obj.type = "";

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
        fail("unverified");
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_2()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        Object obj = null;

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
        fail("unverified");
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_3()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
        fail("unverified");
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_4()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        MeasurementResult obj = new MeasurementResult();
        obj.setMessage("");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
        fail("unverified");
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_5()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        MeasurementResult obj = new MeasurementResult();
        obj.setResultsFrom("");
        obj.setMessage("");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
        fail("unverified");
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_6()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        MeasurementResult obj = new MeasurementResult();
        obj.setResultsFrom("");
        obj.setMessage("");
        obj.value = new Value(1.0, 1.0, "");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
        fail("unverified");
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_7()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        MeasurementResult obj = new MeasurementResult();
        obj.setResultsFrom("");
        obj.setMessage("");
        obj.value = new Value(1.0, 1.0, "");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
        fail("unverified");
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_8()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = null;
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        MeasurementResult obj = new MeasurementResult();
        obj.setResultsFrom("");
        obj.setMessage("");
        obj.value = null;

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
        fail("unverified");
    }

    /**
     * Run the int getCount() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetCount_1()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";

        int result = fixture.getCount();

        // TODO: add additional test code here
        assertEquals(1, result);
        fail("unverified");
    }

    /**
     * Run the String getMessage() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetMessage_1()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";

        String result = fixture.getMessage();

        // TODO: add additional test code here
        assertEquals("", result);
        fail("unverified");
    }

    /**
     * Run the String getResultsFrom() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetResultsFrom_1()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";

        String result = fixture.getResultsFrom();

        // TODO: add additional test code here
        assertEquals("", result);
        fail("unverified");
    }

    /**
     * Run the String getResultsType() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetResultsType_1()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";

        String result = fixture.getResultsType();

        // TODO: add additional test code here
        assertEquals("", result);
        fail("unverified");
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testHashCode_1()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage((String) null);
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";

        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(-33494850, result);
        fail("unverified");
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testHashCode_2()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom((String) null);
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = null;
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";

        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(29791, result);
        fail("unverified");
    }

    /**
     * Run the void removeFindingMessage(FindingMessage) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testRemoveFindingMessage_1()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        FindingMessage fm = null;

        fixture.removeFindingMessage(fm);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void removeFindingMessage(FindingMessage) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testRemoveFindingMessage_2()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        FindingMessage fm = new FindingMessage("", "", "");

        fixture.removeFindingMessage(fm);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void removeFindingMessage(FindingMessage) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testRemoveFindingMessage_3()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        FindingMessage fm = new FindingMessage("", "", "");

        fixture.removeFindingMessage(fm);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setCount(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetCount_1()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        int count = 1;

        fixture.setCount(count);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setMessage(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetMessage_1()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        String message = "";

        fixture.setMessage(message);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setResultsFrom(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetResultsFrom_1()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        String resultsFrom = "";

        fixture.setResultsFrom(resultsFrom);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setResultsType(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetResultsType_1()
        throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        String resultsType = "";

        fixture.setResultsType(resultsType);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
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
     * @generatedBy CodePro at 5/30/15 3:49 PM
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
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(MeasurementResultTest.class);
    }
}