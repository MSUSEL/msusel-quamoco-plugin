package net.siliconcode.quamoco.aggregator.qmr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>FindingMessageTest</code> contains tests for the class
 * <code>{@link FindingMessage}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:49 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class FindingMessageTest {

    /**
     * Run the FindingMessage(String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testFindingMessage_1() throws Exception
    {
        String message = "";
        String location = "";
        String id = "";

        FindingMessage result = new FindingMessage(message, location, id);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("", result.getLocation());
        assertEquals("", result.getMessage());
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
        FindingMessage fixture = new FindingMessage("", "", "");
        Object obj = new FindingMessage("", "", "");

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
        FindingMessage fixture = new FindingMessage("", "", "");
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
        FindingMessage fixture = new FindingMessage("", "", "");
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
        FindingMessage fixture = new FindingMessage("", "", "");
        Object obj = new FindingMessage("", "", "");

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
        FindingMessage fixture = new FindingMessage("", "", "");
        Object obj = new FindingMessage("", "", "");

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
        FindingMessage fixture = new FindingMessage("", "", "");
        Object obj = new FindingMessage("", "", "");

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
        FindingMessage fixture = new FindingMessage("", "", "");
        Object obj = new FindingMessage("", "", "");

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
        FindingMessage fixture = new FindingMessage((String) null, "", "");
        Object obj = new FindingMessage((String) null, "", "");

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
        FindingMessage fixture = new FindingMessage("", "", "");

        String result = fixture.getId();

        // TODO: add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getLocation() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetLocation_1() throws Exception
    {
        FindingMessage fixture = new FindingMessage("", "", "");

        String result = fixture.getLocation();

        // TODO: add additional test code here
        assertEquals("", result);
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
        FindingMessage fixture = new FindingMessage("", "", "");

        String result = fixture.getMessage();

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
        FindingMessage fixture = new FindingMessage("", "", (String) null);

        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(29791, result);
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
        FindingMessage fixture = new FindingMessage((String) null, (String) null, "");

        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(29791, result);
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
        FindingMessage fixture = new FindingMessage("", "", "");
        String id = "";

        fixture.setId(id);

        // TODO: add additional test code here
        assertEquals(id, fixture.getId());
    }

    /**
     * Run the void setLocation(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetLocation_1() throws Exception
    {
        FindingMessage fixture = new FindingMessage("", "", "");
        String location = "";

        fixture.setLocation(location);

        assertEquals(location, fixture.getLocation());
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
        FindingMessage fixture = new FindingMessage("", "", "");
        String message = "";

        fixture.setMessage(message);

        assertEquals(message, fixture.getMessage());
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
        new org.junit.runner.JUnitCore().run(FindingMessageTest.class);
    }
}