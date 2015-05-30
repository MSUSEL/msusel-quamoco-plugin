package net.siliconcode.quamoco.aggregator.qm;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractQMEntityTest</code> contains tests for the class <code>{@link AbstractQMEntity}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:26 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class AbstractQMEntityTest {
    /**
     * Run the String getDescription() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetDescription_1()
        throws Exception
    {
        AbstractQMEntity fixture = new Entity("", "", "", "", "", "");

        String result = fixture.getDescription();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getName() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetName_1()
        throws Exception
    {
        AbstractQMEntity fixture = new Entity("", "", "", "", "", "");

        String result = fixture.getName();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the void setDescription(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetDescription_1()
        throws Exception
    {
        AbstractQMEntity fixture = new Entity("", "", "", "", "", "");
        String description = "";

        fixture.setDescription(description);

        // add additional test code here
    }

    /**
     * Run the void setName(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetName_1()
        throws Exception
    {
        AbstractQMEntity fixture = new Entity("", "", "", "", "", "");
        String name = "";

        fixture.setName(name);

        // add additional test code here
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
        new org.junit.runner.JUnitCore().run(AbstractQMEntityTest.class);
    }
}