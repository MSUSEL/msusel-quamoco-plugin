package net.siliconcode.quamoco.aggregator.strategy;

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.measures.Metric;

/**
 * The class <code>BasicNormalizationStrategyTest</code> contains tests for the class <code>{@link BasicNormalizationStrategy}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:43 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class BasicNormalizationStrategyTest {
    /**
     * Run the BasicNormalizationStrategy(Metric,DecoratorContext) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:43 PM
     */
    @Test
    public void testBasicNormalizationStrategy_1()
        throws Exception
    {
        Metric normMetric = new Metric();
        DecoratorContext contex = EasyMock.createMock(DecoratorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(contex);

        BasicNormalizationStrategy result = new BasicNormalizationStrategy(normMetric, contex);

        // TODO: add additional test code here
        EasyMock.verify(contex);
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
        BasicNormalizationStrategy fixture = new BasicNormalizationStrategy(new Metric(), EasyMock.createNiceMock(DecoratorContext.class));
        Double value1 = new Double(1.0);

        double[] result = fixture.calculate(value1);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.BasicNormalizationStrategy.calculate(BasicNormalizationStrategy.java:59)
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
    public void testCalculate_2()
        throws Exception
    {
        BasicNormalizationStrategy fixture = new BasicNormalizationStrategy(new Metric(), EasyMock.createNiceMock(DecoratorContext.class));

        double[] result = fixture.calculate();

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.aggregator.strategy.BasicNormalizationStrategy.calculate(BasicNormalizationStrategy.java:59)
        assertNotNull(result);
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
        new org.junit.runner.JUnitCore().run(BasicNormalizationStrategyTest.class);
    }
}