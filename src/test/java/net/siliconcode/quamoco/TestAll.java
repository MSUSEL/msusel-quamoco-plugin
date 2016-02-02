package net.siliconcode.quamoco;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 5/30/15 3:42 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    net.siliconcode.quamoco.cli.TestAll.class,
    net.siliconcode.quamoco.codetree.TestAll.class,
    net.siliconcode.quamoco.distiller.TestAll.class,
    net.siliconcode.quamoco.graph.TestAll.class,
    net.siliconcode.quamoco.io.TestAll.class,
    net.siliconcode.quamoco.model.TestAll.class,
    net.siliconcode.quamoco.processor.TestAll.class,
})
public class TestAll {

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    public static void main(String[] args)
    {
        JUnitCore.runClasses(new Class[] { TestAll.class });
    }
}
