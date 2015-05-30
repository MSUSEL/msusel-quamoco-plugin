package net.siliconcode.quamoco.aggregator.graph;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    EdgeTest.class,
    FactorNodeTest.class,
    ValueEdgeTest.class,
    ParentEdgeTest.class,
    NodeTest.class,
    AbstractEdgeTest.class,
    NormalizationNodeTest.class,
    NormalizationEdgeTest.class,
    InfluenceEdgeTest.class,
    ValueNodeTest.class,
    MeasureNodeTest.class,
})
public class TestAll {

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    public static void main(String[] args)
    {
        JUnitCore.runClasses(new Class[] { TestAll.class });
    }
}
