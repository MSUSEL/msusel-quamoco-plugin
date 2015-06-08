package net.siliconcode.quamoco.aggregator.qm;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 6/6/15 1:35 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    SourceTest.class,
    FunctionTest.class,
    TagTest.class,
    AbstractQMEntityTest.class,
    EntityTest.class,
    EvaluationTest.class,
    FactorTest.class,
    RankingTest.class,
    MeasurementMethodTest.class,
    QualityModelTest.class,
    ToolTest.class,
    InfluenceTest.class,
    AnnotationTest.class,
    MeasureTest.class,
})
public class TestAll {

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    public static void main(String[] args)
    {
        JUnitCore.runClasses(new Class[] { TestAll.class });
    }
}
