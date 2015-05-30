package net.siliconcode.sonar.quamoco.metrics;

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.config.Settings;
import org.sonar.api.resources.Project;
import org.sonar.plugins.java.api.JavaResourceLocator;

/**
 * The class <code>JavaSensorTest</code> contains tests for the class <code>{@link JavaSensor}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:45 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class JavaSensorTest {
    /**
     * Run the JavaSensor(JavaResourceLocator,FileSystem,Settings) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testJavaSensor_1()
        throws Exception
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
        fail("unverified");
    }

    /**
     * Run the void analyse(Project,SensorContext) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testAnalyse_1()
        throws Exception
    {
        JavaSensor fixture = new JavaSensor(EasyMock.createNiceMock(JavaResourceLocator.class), EasyMock.createNiceMock(FileSystem.class), new Settings());
        Project module = new Project("");
        SensorContext context = EasyMock.createMock(SensorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.analyse(module, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.IllegalStateException: missing behavior definition for the preceding method call encoding()
        //       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
        //       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
        //       at com.sun.proxy.$Proxy196.predicates(Unknown Source)
        //       at net.siliconcode.sonar.quamoco.metrics.JavaSensor.getSourceFiles(JavaSensor.java:93)
        //       at net.siliconcode.sonar.quamoco.metrics.JavaSensor.analyse(JavaSensor.java:83)
        fail("unverified");
    }

    /**
     * Run the boolean shouldExecuteOnProject(Project) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testShouldExecuteOnProject_1()
        throws Exception
    {
        JavaSensor fixture = new JavaSensor(EasyMock.createNiceMock(JavaResourceLocator.class), EasyMock.createNiceMock(FileSystem.class), new Settings());
        Project project = new Project("");

        boolean result = fixture.shouldExecuteOnProject(project);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.sonar.quamoco.metrics.JavaSensor.shouldExecuteOnProject(JavaSensor.java:113)
        assertTrue(result);
        fail("unverified");
    }

    /**
     * Run the boolean shouldExecuteOnProject(Project) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testShouldExecuteOnProject_2()
        throws Exception
    {
        JavaSensor fixture = new JavaSensor(EasyMock.createNiceMock(JavaResourceLocator.class), EasyMock.createNiceMock(FileSystem.class), new Settings());
        Project project = new Project("");

        boolean result = fixture.shouldExecuteOnProject(project);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.sonar.quamoco.metrics.JavaSensor.shouldExecuteOnProject(JavaSensor.java:113)
        assertTrue(result);
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
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
     * @generatedBy CodePro at 5/30/15 3:45 PM
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
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(JavaSensorTest.class);
    }
}