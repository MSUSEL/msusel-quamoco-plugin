package net.siliconcode.quamoco.distiller.keys;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>StringKeyTest</code> contains tests for the class
 * <code>{@link StringKey}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class StringKeyTest {

    /**
     * Run the StringKey(String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testStringKey_1() throws Exception
    {
        String key = "key";
        String name = "name";

        StringKey result = new StringKey(key, name);

        // add additional test code here
        assertNotNull(result);
        assertEquals(name, result.getShortKey());
        assertEquals("StringKey [key=key, name=name]", result.toString());
        assertEquals(key, result.getKey());
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        StringKey fixture = new StringKey("key", "name");
        Object obj = new StringKey("key", "name");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertTrue(result);
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
        StringKey fixture = new StringKey("key", "name");
        Object obj = null;

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertFalse(result);
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
        StringKey fixture = new StringKey("key", "name");
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertFalse(result);
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
        StringKey fixture = new StringKey("", "");
        Object obj = new StringKey("", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertTrue(result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testEquals_5() throws Exception
    {
        StringKey fixture = new StringKey(null, null);
        Object obj = new StringKey(null, null);

        boolean result = fixture.equals(obj);

        assertTrue(result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testEquals_6() throws Exception
    {
        StringKey fixture = new StringKey(null, "");
        Object obj = new StringKey(null, "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertTrue(result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testEquals_7() throws Exception
    {
        StringKey fixture = new StringKey("", null);
        Object obj = new StringKey("", null);

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertTrue(result);
    }

    /**
     * Run the String getKey() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetKey_1() throws Exception
    {
        StringKey fixture = new StringKey("key", "name");
        StringKey fixture2 = new StringKey("key", null);
        StringKey fixture3 = new StringKey(null, "name");
        StringKey fixture4 = new StringKey("", "");

        String result = fixture.getKey();
        String result2 = fixture2.getKey();
        String result3 = fixture3.getKey();
        String result4 = fixture4.getKey();

        // add additional test code here
        assertEquals("key", result);
        assertNull(result3);
        assertEquals("key", result2);
        assertEquals("", result4);
    }

    /**
     * Run the String getShortKey() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetShortKey_1() throws Exception
    {
        StringKey fixture = new StringKey("key", "name");
        StringKey fixture2 = new StringKey("key", null);
        StringKey fixture3 = new StringKey(null, "name");
        StringKey fixture4 = new StringKey("", "");

        String result = fixture.getShortKey();
        String result2 = fixture2.getShortKey();
        String result3 = fixture3.getShortKey();
        String result4 = fixture4.getShortKey();

        // add additional test code here
        assertEquals("name", result);
        assertNull(result2);
        assertEquals("name", result3);
        assertEquals("", result4);
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
        StringKey fixture = new StringKey((String) null, "");

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(961, result);
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
        StringKey fixture = new StringKey("", (String) null);

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(961, result);
    }

    /**
     * @throws Exception
     */
    @Test
    public void testHashCode_3() throws Exception
    {
        StringKey fixture = new StringKey("key", "name");

        int result = fixture.hashCode();

        assertEquals(6663117, result);
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
        StringKey fixture = new StringKey("key", "name");
        StringKey fixture2 = new StringKey("key", null);
        StringKey fixture3 = new StringKey(null, "name");
        StringKey fixture4 = new StringKey("", "");

        String result = fixture.toString();
        String result2 = fixture2.toString();
        String result3 = fixture3.toString();
        String result4 = fixture4.toString();

        // add additional test code here
        assertEquals("StringKey [key=key, name=name]", result);
        assertEquals("StringKey [key=key, name=null]", result2);
        assertEquals("StringKey [key=null, name=name]", result3);
        assertEquals("StringKey [key=, name=]", result4);
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
        // add additional set up code here
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
        new org.junit.runner.JUnitCore().run(StringKeyTest.class);
    }
}