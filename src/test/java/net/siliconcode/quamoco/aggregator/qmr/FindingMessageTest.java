package net.siliconcode.quamoco.aggregator.qmr;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FindingMessageTest</code> contains tests for the class <code>{@link FindingMessage}</code>.
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
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testFindingMessage_1()
        throws Exception
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
        FindingMessage fixture = new FindingMessage("", "", "");
        Object obj = new FindingMessage("", "", "");

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
        FindingMessage fixture = new FindingMessage("", "", "");
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
        FindingMessage fixture = new FindingMessage("", "", "");
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
        FindingMessage fixture = new FindingMessage("", "", "");
        Object obj = new FindingMessage("", "", "");

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
    public void testEquals_5()
        throws Exception
    {
        FindingMessage fixture = new FindingMessage("", "", "");
        Object obj = new FindingMessage("", "", "");

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
    public void testEquals_6()
        throws Exception
    {
        FindingMessage fixture = new FindingMessage("", "", "");
        Object obj = new FindingMessage("", "", "");

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
        FindingMessage fixture = new FindingMessage("", "", "");
        Object obj = new FindingMessage("", "", "");

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
        FindingMessage fixture = new FindingMessage((String) null, "", "");
        Object obj = new FindingMessage((String) null, "", "");

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(true, result);
        fail("unverified");
    }

    /**
     * Run the String getId() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetId_1()
        throws Exception
    {
        FindingMessage fixture = new FindingMessage("", "", "");

        String result = fixture.getId();

        // TODO: add additional test code here
        assertEquals("", result);
        fail("unverified");
    }

    /**
     * Run the String getLocation() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetLocation_1()
        throws Exception
    {
        FindingMessage fixture = new FindingMessage("", "", "");

        String result = fixture.getLocation();

        // TODO: add additional test code here
        assertEquals("", result);
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
        FindingMessage fixture = new FindingMessage("", "", "");

        String result = fixture.getMessage();

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
        FindingMessage fixture = new FindingMessage("", "", (String) null);

        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(29791, result);
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
        FindingMessage fixture = new FindingMessage((String) null, (String) null, "");

        int result = fixture.hashCode();

        // TODO: add additional test code here
        assertEquals(29791, result);
        fail("unverified");
    }

    /**
     * Run the void setId(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetId_1()
        throws Exception
    {
        FindingMessage fixture = new FindingMessage("", "", "");
        String id = "";

        fixture.setId(id);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setLocation(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetLocation_1()
        throws Exception
    {
        FindingMessage fixture = new FindingMessage("", "", "");
        String location = "";

        fixture.setLocation(location);

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
        FindingMessage fixture = new FindingMessage("", "", "");
        String message = "";

        fixture.setMessage(message);

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
        new org.junit.runner.JUnitCore().run(FindingMessageTest.class);
    }
}