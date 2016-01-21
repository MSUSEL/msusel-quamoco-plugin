package net.siliconcode.quamoco.aggregator;

import org.junit.*;

import net.siliconcode.quamoco.model.qmr.AbstractResult;

import static org.junit.Assert.*;

/**
 * The class <code>AbstractEntityTest</code> contains tests for the class <code>{@link AbstractEntity}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:41 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class AbstractEntityTest {
    /**
     * Run the String getId() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testGetId_1()
        throws Exception
    {
        AbstractResult fixture = new AbstractResult();
        fixture.id = "";

        String result = fixture.getId();

        // TODO: add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the void setId(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    @Test
    public void testSetId_1()
        throws Exception
    {
        AbstractResult fixture = new AbstractResult();
        fixture.id = "";
        String id = "";

        fixture.setId(id);

        // TODO: add additional test code here
        assertEquals(id, fixture.getId());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:41 PM
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
     * @generatedBy CodePro at 5/30/15 3:41 PM
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
     * @generatedBy CodePro at 5/30/15 3:41 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(AbstractEntityTest.class);
    }
}