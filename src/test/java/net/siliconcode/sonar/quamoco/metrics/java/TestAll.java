package net.siliconcode.sonar.quamoco.metrics.java;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 5/30/15 3:48 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    JavaMemberExtractorTest.class,
    JavaNumMethodTest.class,
    JavaNumStmtsTest.class,
    JavaNumTypesClassesTest.class,
    JavaLinesOfCodeTest.class,
    JavaNumFieldsTest.class,
    JavaNumLocalVariablesTest.class,
})
public class TestAll {

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 5/30/15 3:48 PM
     */
    public static void main(String[] args)
    {
        JUnitCore.runClasses(new Class[] { TestAll.class });
    }
}
