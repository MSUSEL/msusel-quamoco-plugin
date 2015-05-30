package net.siliconcode.sonar.quamoco.metrics;

import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.resources.Project;

/**
 * The class <code>CSharpSensorTest</code> contains tests for the class <code>{@link CSharpSensor}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:45 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class CSharpSensorTest {
    /**
     * Run the CSharpSensor(FileSystem) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testCSharpSensor_1()
        throws Exception
    {
        FileSystem fs = EasyMock.createMock(FileSystem.class);
        // TODO: add mock object expectations here

        EasyMock.replay(fs);

        CSharpSensor result = new CSharpSensor(fs);

        // TODO: add additional test code here
        EasyMock.verify(fs);
        assertNotNull(result);
        assertEquals("Quamoco C# Sensor", result.toString());
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
        CSharpSensor fixture = new CSharpSensor(EasyMock.createNiceMock(FileSystem.class));
        Project module = new Project("");
        SensorContext context = EasyMock.createMock(SensorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.analyse(module, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.sonar.quamoco.metrics.CSharpSensor.analyse(CSharpSensor.java:86)
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
    public void testAnalyse_2()
        throws Exception
    {
        CSharpSensor fixture = new CSharpSensor(EasyMock.createNiceMock(FileSystem.class));
        Project module = new Project("");
        SensorContext context = EasyMock.createMock(SensorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.analyse(module, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.sonar.quamoco.metrics.CSharpSensor.analyse(CSharpSensor.java:86)
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
    public void testAnalyse_3()
        throws Exception
    {
        CSharpSensor fixture = new CSharpSensor(EasyMock.createNiceMock(FileSystem.class));
        Project module = new Project("");
        SensorContext context = EasyMock.createMock(SensorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.analyse(module, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.sonar.quamoco.metrics.CSharpSensor.analyse(CSharpSensor.java:86)
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
    public void testAnalyse_4()
        throws Exception
    {
        CSharpSensor fixture = new CSharpSensor(EasyMock.createNiceMock(FileSystem.class));
        Project module = new Project("");
        SensorContext context = EasyMock.createMock(SensorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.analyse(module, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.sonar.quamoco.metrics.CSharpSensor.analyse(CSharpSensor.java:86)
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
    public void testAnalyse_5()
        throws Exception
    {
        CSharpSensor fixture = new CSharpSensor(EasyMock.createNiceMock(FileSystem.class));
        Project module = new Project("");
        SensorContext context = EasyMock.createMock(SensorContext.class);
        // TODO: add mock object expectations here

        EasyMock.replay(context);

        fixture.analyse(module, context);

        // TODO: add additional test code here
        EasyMock.verify(context);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.sonar.quamoco.metrics.CSharpSensor.analyse(CSharpSensor.java:86)
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
        CSharpSensor fixture = new CSharpSensor(EasyMock.createNiceMock(FileSystem.class));
        Project project = new Project("");

        boolean result = fixture.shouldExecuteOnProject(project);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.sonar.quamoco.metrics.CSharpSensor.shouldExecuteOnProject(CSharpSensor.java:141)
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
        CSharpSensor fixture = new CSharpSensor(EasyMock.createNiceMock(FileSystem.class));
        Project project = new Project("");

        boolean result = fixture.shouldExecuteOnProject(project);

        // TODO: add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.sonar.quamoco.metrics.CSharpSensor.shouldExecuteOnProject(CSharpSensor.java:141)
        assertTrue(result);
        fail("unverified");
    }

    /**
     * Run the String toString() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testToString_1()
        throws Exception
    {
        CSharpSensor fixture = new CSharpSensor(EasyMock.createNiceMock(FileSystem.class));

        String result = fixture.toString();

        // TODO: add additional test code here
        assertEquals("Quamoco C# Sensor", result);
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
        new org.junit.runner.JUnitCore().run(CSharpSensorTest.class);
    }
}