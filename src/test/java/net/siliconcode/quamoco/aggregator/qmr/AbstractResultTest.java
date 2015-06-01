package net.siliconcode.quamoco.aggregator.qmr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>AbstractResultTest</code> contains tests for the class <code>{@link AbstractResult}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:49 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class AbstractResultTest {
    /**
     * Run the AbstractResult() constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testAbstractResult_1()
        throws Exception
    {

        AbstractResult result = new AbstractResult();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getValue());
        assertEquals(null, result.getType());
        assertEquals(null, result.getId());
    }

    /**
     * Run the String getType() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetType_1()
        throws Exception
    {
        AbstractResult fixture = new AbstractResult();
        fixture.setValue(new Value(1.0, 1.0, ""));
        fixture.setType("");

        String result = fixture.getType();

        // TODO: add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the Value getValue() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testGetValue_1()
        throws Exception
    {
        AbstractResult fixture = new AbstractResult();
        fixture.setValue(new Value(1.0, 1.0, ""));
        fixture.setType("");

        Value result = fixture.getValue();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(1.0, result.getMean(), 1.0);
        assertEquals(1.0, result.getLower(), 1.0);
        assertEquals(1.0, result.getUpper(), 1.0);
        assertEquals("", result.getId());
    }

    /**
     * Run the void setType(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetType_1()
        throws Exception
    {
        AbstractResult fixture = new AbstractResult();
        fixture.setValue(new Value(1.0, 1.0, ""));
        fixture.setType("");
        String type = "";

        fixture.setType(type);

        // TODO: add additional test code here
        assertEquals(type, fixture.getType());
    }

    /**
     * Run the void setValue(Value) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    @Test
    public void testSetValue_1()
        throws Exception
    {
        AbstractResult fixture = new AbstractResult();
        fixture.setValue(new Value(1.0, 1.0, ""));
        fixture.setType("");
        Value value = new Value(1.0, 1.0, "");

        fixture.setValue(value);

        assertEquals(value, fixture.getValue());
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
        new org.junit.runner.JUnitCore().run(AbstractResultTest.class);
    }
}