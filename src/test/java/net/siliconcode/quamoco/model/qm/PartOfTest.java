package net.siliconcode.quamoco.model.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>PartOfTest</code> contains tests for the class
 * <code>{@link PartOf}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class PartOfTest {

    private PartOf fixture;

    /**
     * Run the PartOf(String,Parent) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testPartOf_1() throws Exception
    {
        String id = "";
        Parent parent = new Parent("parent");

        PartOf result = null;
        try
        {
            result = new PartOf(id, parent);
            fail();
        }
        catch (IllegalArgumentException e)
        {
        }

        try
        {
            result = new PartOf(null, parent);
            fail();
        }
        catch (IllegalArgumentException e)
        {
        }

        try
        {
            result = new PartOf("part", null);
            fail();
        }
        catch (IllegalArgumentException e)
        {
        }

        result = new PartOf("part", parent);
        // add additional test code here
        assertNotNull(result);
        assertEquals("part", result.getId());
    }

    /**
     * Run the String getId() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetId_1() throws Exception
    {
        String result = fixture.getId();

        // add additional test code here
        assertEquals("part", result);
    }

    /**
     * Run the Parent getParent() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetParent_1() throws Exception
    {
        Parent result = fixture.getParent();

        // add additional test code here
        assertNotNull(result);
        assertEquals("parent", result.getHREF());
        assertEquals("parent", result.toString());
    }

    /**
     * Run the void setId(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testSetId_1() throws Exception
    {
        String id = null;

        try
        {
            fixture.setId(id);
            fail();
        }
        catch (IllegalArgumentException e)
        {
        }
    }

    /**
     * Run the void setId(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testSetId_2() throws Exception
    {
        String id = "";

        try
        {
            fixture.setId(id);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the void setId(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testSetId_3() throws Exception
    {
        String id = "id";

        fixture.setId(id);

        // add additional test code here
        assertEquals(id, fixture.getId());
    }

    /**
     * Run the void setParent(Parent) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testSetParent_1() throws Exception
    {
        Parent parent = new Parent("parent");

        fixture.setParent(parent);

        // add additional test code here
        assertEquals(parent, fixture.getParent());
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
        fixture = new PartOf("part", new Parent("parent"));
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
        new org.junit.runner.JUnitCore().run(PartOfTest.class);
    }
}