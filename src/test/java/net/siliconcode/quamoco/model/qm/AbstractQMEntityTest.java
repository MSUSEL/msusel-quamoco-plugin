package net.siliconcode.quamoco.model.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>AbstractQMEntityTest</code> contains tests for the class
 * <code>{@link AbstractQMEntity}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:26 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class AbstractQMEntityTest {

    private AbstractQMEntity fixture;
    
    /**
     * Run the String getDescription() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetDescription_1() throws Exception
    {
        String result = fixture.getDescription();

        // add additional test code here
        assertEquals("description", result);
    }

    /**
     * Run the String getName() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetName_1() throws Exception
    {
        String result = fixture.getName();

        // add additional test code here
        assertEquals("name", result);
    }

    /**
     * Run the void setDescription(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetDescription_1() throws Exception
    {
        String description = "description";

        fixture.setDescription(description);
        assertEquals(description, fixture.getDescription());

        description = null;
        try
        {
            fixture.setDescription(description);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

        // add additional test code here
    }

    /**
     * Run the void setName(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetName_1() throws Exception
    {
        String name = "name";

        fixture.setName(name);

        // add additional test code here
        assertEquals(name, fixture.getName());
        
        name = null;
        try {
            fixture.setName(name);        
            fail();
        } 
        catch (IllegalArgumentException e) 
        {
            
        }
        
        name = "";
        try {
            fixture.setName(name);        
            fail();
        }
        catch (IllegalArgumentException e) {}
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
        fixture = new Entity("name", "description", null, "title", "id", null);
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
        new org.junit.runner.JUnitCore().run(AbstractQMEntityTest.class);
    }
}