package net.siliconcode.quamoco.aggregator.strategy;

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MeanFactorEvaluationStrategyTest</code> contains tests for the class <code>{@link MeanFactorEvaluationStrategy}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:43 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class MeanFactorEvaluationStrategyTest {
    /**
     * Run the MeanFactorEvaluationStrategy(NormalizationStrategy) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testMeanFactorEvaluationStrategy_1()
        throws Exception
    {
        NormalizationStrategy ns = EasyMock.createMock(NormalizationStrategy.class);
        // TODO: add mock object expectations here

        EasyMock.replay(ns);

        MeanFactorEvaluationStrategy result = new MeanFactorEvaluationStrategy(ns);

        // TODO: add additional test code here
        EasyMock.verify(ns);
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the double evaluate(Double[]) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testEvaluate_1()
        throws Exception
    {
        fail("unverified");
    }

    /**
     * Run the double evaluate(Double[]) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testEvaluate_2()
        throws Exception
    {
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
        new org.junit.runner.JUnitCore().run(MeanFactorEvaluationStrategyTest.class);
    }
}