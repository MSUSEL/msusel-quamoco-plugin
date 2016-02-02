package net.siliconcode.quamoco.model.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>AbstractLinkTest</code> contains tests for the class
 * <code>{@link AbstractLink}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class AbstractLinkTest {

    private AbstractLink fixture;

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        Characterizes obj = new Characterizes("href");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testEquals_2() throws Exception
    {
        Object obj = null;

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testEquals_3() throws Exception
    {
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testEquals_4() throws Exception
    {
        AbstractLink obj = new Evaluates("href");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the String getHREF() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetHREF_1() throws Exception
    {
        String result = fixture.getHREF();

        // add additional test code here
        assertEquals("href", result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testHashCode_1() throws Exception
    {
        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(3211082, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testHashCode_2() throws Exception
    {
        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(3211082, result);
    }

    /**
     * Run the void setHERF(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testSetHREF_1() throws Exception
    {
        String href = "";

        try
        {
            fixture.setHREF(href);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the void setHERF(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testSetHERF_2() throws Exception
    {
        String href = null;

        try
        {
            fixture.setHREF(href);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the void setHERF(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testSetHERF_3() throws Exception
    {
        String href = "other";

        fixture.setHREF(href);

        assertEquals(href, fixture.getHREF());
    }

    /**
     * Run the String toString() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testToString_1() throws Exception
    {
        String result = fixture.toString();

        // add additional test code here
        assertEquals("href", result);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Before
    public void setUp() throws Exception
    {
        fixture = new Characterizes("href");
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 1/26/16 6:38 PM
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
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(AbstractLinkTest.class);
    }
}