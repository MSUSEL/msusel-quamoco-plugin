package net.siliconcode.quamoco.aggregator;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 5/30/15 3:49 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    EdgePopulatorTest.class,
    DistillerDataTest.class,
    QualityModelUtilsTest.class,
    GradeTest.class,
    QMDistillCLITest.class,
    ModelDistillerTest.class,
    NodePopulatorTest.class,
    AbstractEntityTest.class,
    DistilledGraphCreatorTest.class,
    GradeThresholdExceptionTest.class,
    MeasureTest.class,
    net.siliconcode.quamoco.aggregator.graph.TestAll.class,
    net.siliconcode.quamoco.aggregator.io.TestAll.class,
    net.siliconcode.quamoco.aggregator.qmr.TestAll.class,
    net.siliconcode.quamoco.aggregator.strategy.TestAll.class,
})
public class TestAll {

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 5/30/15 3:49 PM
     */
    public static void main(String[] args)
    {
        JUnitCore.runClasses(new Class[] { TestAll.class });
    }
}
