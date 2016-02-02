package net.siliconcode.quamoco.model.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>TagTest</code> contains tests for the class
 * <code>{@link Tag}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:26 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class TagTest {

    private Tag fixture;

    /**
     * Run the Tag(String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTag_1() throws Exception
    {
        String name = "name";
        String description = "";
        String id = "id";

        Tag result = new Tag(name, description, id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getDescription());
        assertEquals("name", result.getName());
        assertEquals("id", result.getId());
    }

    /**
     * Run the Tag(String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTag_2() throws Exception
    {
        String name = "";
        String description = "";
        String id = "id";

        try
        {
            new Tag(name, description, id);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the Tag(String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTag_3() throws Exception
    {
        String name = "name";
        String description = "";
        String id = "";

        try
        {
            new Tag(name, description, id);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the Tag(String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTag_4() throws Exception
    {
        String name = "";
        String description = "";
        String id = "";

        try
        {
            new Tag(name, description, id);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the Tag(String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTag_5() throws Exception
    {
        String name = null;
        String description = "";
        String id = "id";

        try
        {
            new Tag(name, description, id);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the Tag(String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTag_6() throws Exception
    {
        String name = "name";
        String description = "";
        String id = null;

        try
        {
            new Tag(name, description, id);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the Tag(String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTag_7() throws Exception
    {
        String name = null;
        String description = "";
        String id = null;

        try
        {
            new Tag(name, description, id);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        Object obj = new Tag("name", "", "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
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
     * @generatedBy CodePro at 5/30/15 3:26 PM
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
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testHashCode_1() throws Exception
    {
        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(3374668, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testHashCode_2() throws Exception
    {
        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(3374668, result);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Before
    public void setUp() throws Exception
    {
        fixture = new Tag("name", "", "id");
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 5/30/15 3:26 PM
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
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(TagTest.class);
    }
}