package net.siliconcode.quamoco.processor;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 1/26/16 6:36 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    FindingsAggregatorTest.class,
    NullProcessorTest.class,
    EvaluatorFactoryTest.class,
    ExtentTest.class,
    AggregatorFactoryTest.class,
    ProcessorFactoryTest.class,
    AggregatorTest.class,
    EvaluatorTest.class,
    NormalizerFactoryTest.class,
    NormalizerTest.class,
    MetricsContextTest.class,
    MetricsContextExceptionTest.class,
    net.siliconcode.quamoco.processor.aggregators.TestAll.class,
    net.siliconcode.quamoco.processor.evaluators.TestAll.class,
    net.siliconcode.quamoco.processor.lineardist.TestAll.class,
    net.siliconcode.quamoco.processor.normalizers.TestAll.class,
})
public class TestAll {

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 1/26/16 6:36 PM
     */
    public static void main(String[] args)
    {
        JUnitCore.runClasses(new Class[] { TestAll.class });
    }
}
