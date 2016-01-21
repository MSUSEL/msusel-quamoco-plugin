package net.siliconcode.quamoco.aggregator.qm;

import org.junit.*;

import net.siliconcode.quamoco.model.qm.Entity;
import net.siliconcode.quamoco.model.qm.Tag;

import static org.junit.Assert.*;

/**
 * The class <code>TagTest</code> contains tests for the class <code>{@link Tag}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:26 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class TagTest {
    /**
     * Run the Tag(String,String,String) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTag_1()
        throws Exception
    {
        String name = "";
        String description = "";
        String id = "";

        Tag result = new Tag(name, description, id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getDescription());
        assertEquals("", result.getName());
        assertEquals("", result.getId());
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_1()
        throws Exception
    {
        Tag fixture = new Tag("", "", "");
        Object obj = new Tag("", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_2()
        throws Exception
    {
        Tag fixture = new Tag("", "", "");
        Object obj = null;

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_3()
        throws Exception
    {
        Tag fixture = new Tag("", "", "");
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_4()
        throws Exception
    {
        Tag fixture = new Tag("", (String) null, "");
        Object obj = new Entity("", "", "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_5()
        throws Exception
    {
        Tag fixture = new Tag("", "", "");
        Object obj = new Entity("", "", "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_6()
        throws Exception
    {
        Tag fixture = new Tag("", "", "");
        Object obj = new Entity("", "", "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_7()
        throws Exception
    {
        Tag fixture = new Tag("", "", "");
        Object obj = new Entity("", "", "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testHashCode_1()
        throws Exception
    {
        Tag fixture = new Tag("", (String) null, "");

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(961, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testHashCode_2()
        throws Exception
    {
        Tag fixture = new Tag((String) null, "", "");

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(961, result);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Before
    public void setUp()
        throws Exception
    {
        // add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @After
    public void tearDown()
        throws Exception
    {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(TagTest.class);
    }
}