package net.siliconcode.sonar.quamoco.metrics;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.config.Settings;
import org.sonar.plugins.java.api.JavaResourceLocator;

/**
 * The class <code>JavaSensorTest</code> contains tests for the class
 * <code>{@link JavaSensor}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:45 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class JavaSensorTest {

    /**
     * Run the JavaSensor(JavaResourceLocator,FileSystem,Settings) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testJavaSensor_1() throws Exception
    {
        JavaResourceLocator javaResourceLocator = EasyMock.createMock(JavaResourceLocator.class);
        FileSystem fs = EasyMock.createMock(FileSystem.class);
        Settings settings = new Settings();
        // TODO: add mock object expectations here

        EasyMock.replay(javaResourceLocator);
        EasyMock.replay(fs);

        JavaSensor result = new JavaSensor(javaResourceLocator, fs, settings);

        // TODO: add additional test code here
        EasyMock.verify(javaResourceLocator);
        EasyMock.verify(fs);
        assertNotNull(result);
    }

    /**
     * Run the void analyse(Project,SensorContext) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testAnalyse_1() throws Exception
    {
        fail("unverified");
    }

    /**
     * Run the boolean shouldExecuteOnProject(Project) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testShouldExecuteOnProject_1() throws Exception
    {
        fail("unverified");
    }

    /**
     * Run the boolean shouldExecuteOnProject(Project) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testShouldExecuteOnProject_2() throws Exception
    {
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Before
    public void setUp() throws Exception
    {
        // TODO: add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @After
    public void tearDown() throws Exception
    {
        // TODO: add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args
     *            the command line arguments
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(JavaSensorTest.class);
    }
}