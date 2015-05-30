package net.siliconcode.quamoco.aggregator.strategy;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>NoNormalizationStrategyTest</code> contains tests for the class <code>{@link NoNormalizationStrategy}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:43 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class NoNormalizationStrategyTest {
    /**
     * Run the NoNormalizationStrategy() constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testNoNormalizationStrategy_1()
        throws Exception
    {

        NoNormalizationStrategy result = new NoNormalizationStrategy();

        // TODO: add additional test code here
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the double[] calculate(Double[]) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testCalculate_1()
        throws Exception
    {
        NoNormalizationStrategy fixture = new NoNormalizationStrategy();
        Double value1 = Double.valueOf(1.0);

        double[] result = fixture.calculate(value1);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(1, result.length);
        assertEquals(1.0, result[0], 1.0);
        fail("unverified");
    }

    /**
     * Run the double[] calculate(Double[]) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testCalculate_2()
        throws Exception
    {
        NoNormalizationStrategy fixture = new NoNormalizationStrategy();

        double[] result = fixture.calculate();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(0, result.length);
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
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
     * @generatedBy CodePro at 5/30/15 3:43 PM
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
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(NoNormalizationStrategyTest.class);
    }
}