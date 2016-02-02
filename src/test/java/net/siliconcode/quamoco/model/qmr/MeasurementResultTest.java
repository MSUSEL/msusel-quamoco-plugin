package net.siliconcode.quamoco.aggregator.qmr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.model.qmr.FindingMessage;
import net.siliconcode.quamoco.model.qmr.MeasurementResult;
import net.siliconcode.quamoco.model.qmr.Value;

/**
 * The class <code>MeasurementResultTest</code> contains tests for the class
 * <code>{@link MeasurementResult}</code>.
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
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testMeasurementResult_1() throws Exception
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
    }

    /**
     * Run the void addFindingMessage(FindingMessage) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testAddFindingMessage_1() throws Exception
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

        assertEquals(1, fixture.getFindingMessages().size());
    }

    /**
     * Run the void addFindingMessage(FindingMessage) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testAddFindingMessage_2() throws Exception
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

        assertEquals(1, fixture.getFindingMessages().size());
    }

    /**
     * Run the void addFindingMessage(FindingMessage) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testAddFindingMessage_3() throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        FindingMessage fm = new FindingMessage("other", "", "");

        fixture.addFindingMessage(fm);

        assertEquals(2, fixture.getFindingMessages().size());
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
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testEquals_8() throws Exception
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
    }

    /**
     * Run the int getCount() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetCount_1() throws Exception
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
    }

    /**
     * Run the String getMessage() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetMessage_1() throws Exception
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
    }

    /**
     * Run the String getResultsFrom() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetResultsFrom_1() throws Exception
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
    }

    /**
     * Run the String getResultsType() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetResultsType_1() throws Exception
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
    }

    /**
     * Run the void removeFindingMessage(FindingMessage) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testRemoveFindingMessage_1() throws Exception
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

        assertEquals(1, fixture.getFindingMessages().size());
    }

    /**
     * Run the void removeFindingMessage(FindingMessage) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testRemoveFindingMessage_2() throws Exception
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

        assertEquals(0, fixture.getFindingMessages().size());
    }

    /**
     * Run the void removeFindingMessage(FindingMessage) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testRemoveFindingMessage_3() throws Exception
    {
        MeasurementResult fixture = new MeasurementResult();
        fixture.setResultsFrom("");
        fixture.setCount(1);
        fixture.setMessage("");
        fixture.setResultsType("");
        fixture.value = new Value(1.0, 1.0, "");
        fixture.addFindingMessage(new FindingMessage("", "", ""));
        fixture.type = "";
        FindingMessage fm = new FindingMessage("other", "", "");

        fixture.removeFindingMessage(fm);

        assertEquals(1, fixture.getFindingMessages().size());
    }

    /**
     * Run the void setCount(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetCount_1() throws Exception
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

        assertEquals(count, fixture.getCount());
    }

    /**
     * Run the void setMessage(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetMessage_1() throws Exception
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

        assertEquals(message, fixture.getMessage());
    }

    /**
     * Run the void setResultsFrom(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetResultsFrom_1() throws Exception
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

        assertEquals(resultsFrom, fixture.getResultsFrom());
    }

    /**
     * Run the void setResultsType(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetResultsType_1() throws Exception
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

        assertEquals(resultsType, fixture.getResultsType());
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
        new org.junit.runner.JUnitCore().run(MeasurementResultTest.class);
    }
}