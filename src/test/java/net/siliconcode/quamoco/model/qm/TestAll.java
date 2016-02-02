package net.siliconcode.quamoco.model.qm;

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
    AbstractLinkTest.class,
    AbstractQMEntityTest.class,
    AnnotationTest.class,
    CharacterizesTest.class,
    DeterminesTest.class,
    EntityTest.class,
    EvaluatesTest.class,
    EvaluationTest.class,
    FactorLinkTest.class,
    FactorTest.class,
    FunctionTest.class,
    IsATest.class,
    MeasureLinkTest.class,
    MeasurementMethodTest.class,
    MeasureTest.class,
    NormalizationMeasureTest.class,
    OriginatesFromTest.class,
    ParentTest.class,
    PartOfTest.class,
    QualityModelTest.class,
    RankingTest.class,
    RefinesTest.class,
    RequiresTest.class,
    SourceTest.class,
    TaggedByTest.class,
    TagTest.class,
    TargetTest.class,
    ToolTest.class
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
