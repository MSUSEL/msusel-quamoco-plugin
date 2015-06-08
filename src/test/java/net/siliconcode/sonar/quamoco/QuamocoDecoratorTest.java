package net.siliconcode.sonar.quamoco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.api.batch.fs.FilePredicates;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile.Type;
import org.sonar.api.issue.ProjectIssues;
import org.sonar.api.rules.RuleFinder;

import com.google.common.collect.Lists;

/**
 * The class <code>QuamocoDecoratorTest</code> contains tests for the class
 * <code>{@link QuamocoDecorator}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:44 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QuamocoDecoratorTest {

    /**
     * Run the QuamocoDecorator(FileSystem,ProjectIssues,RuleFinder) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testQuamocoDecorator_1() throws Exception
    {
        FileSystem files = EasyMock.createMock(FileSystem.class);
        ProjectIssues projectIssues = EasyMock.createMock(ProjectIssues.class);
        RuleFinder finder = EasyMock.createMock(RuleFinder.class);
        // TODO: add mock object expectations here

        EasyMock.replay(files);
        EasyMock.replay(projectIssues);
        EasyMock.replay(finder);

        QuamocoDecorator result = new QuamocoDecorator(files, projectIssues, finder);

        // TODO: add additional test code here
        EasyMock.verify(files);
        EasyMock.verify(projectIssues);
        EasyMock.verify(finder);
        assertNotNull(result);
        assertEquals("Quamoco Decorator", result.toString());
    }

    /**
     * Run the boolean shouldExecuteOnProject(Project) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testShouldExecuteOnProject_1() throws Exception
    {
        FileSystem files = EasyMock.createMock(FileSystem.class);
        ProjectIssues projectIssues = EasyMock.createMock(ProjectIssues.class);
        RuleFinder finder = EasyMock.createMock(RuleFinder.class);

        final FilePredicates predicates = EasyMock.createMock(FilePredicates.class);
        List<File> fileList = Lists.newArrayList();
        fileList.add(new File("./"));
        FilePredicate pred = EasyMock.createNiceMock(FilePredicate.class);
        // TODO: add mock object expectations here

        EasyMock.replay(projectIssues);
        EasyMock.replay(finder);
        EasyMock.replay(pred);

        EasyMock.expect(files.predicates()).andReturn(predicates);

        EasyMock.expect(predicates.hasLanguage(QuamocoConstants.CSHARP_KEY)).andReturn(pred).times(2);
        EasyMock.expect(predicates.hasType(Type.MAIN)).andReturn(pred);
        EasyMock.expect(predicates.and(pred, pred)).andReturn(pred);
        EasyMock.replay(predicates);

        EasyMock.expect(files.files(pred)).andReturn(fileList).times(2);
        EasyMock.replay(files);

        QuamocoDecorator fixture = new QuamocoDecorator(files, projectIssues, finder);
        boolean result = fixture.shouldExecuteOnProject(null);
        assertTrue(result);
    }

    /**
     * Run the boolean shouldExecuteOnProject(Project) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testShouldExecuteOnProject_2() throws Exception
    {
        FileSystem files = EasyMock.createMock(FileSystem.class);
        ProjectIssues projectIssues = EasyMock.createMock(ProjectIssues.class);
        RuleFinder finder = EasyMock.createMock(RuleFinder.class);

        final FilePredicates predicates = EasyMock.createMock(FilePredicates.class);
        List<File> fileList = Lists.newArrayList();
        FilePredicate pred = EasyMock.createNiceMock(FilePredicate.class);
        // TODO: add mock object expectations here

        EasyMock.replay(projectIssues);
        EasyMock.replay(finder);
        EasyMock.replay(pred);

        EasyMock.expect(files.predicates()).andReturn(predicates);

        EasyMock.expect(predicates.hasLanguage(QuamocoConstants.CSHARP_KEY)).andReturn(pred).times(2);
        EasyMock.expect(predicates.hasType(Type.MAIN)).andReturn(pred);
        EasyMock.expect(predicates.and(pred, pred)).andReturn(pred);
        EasyMock.replay(predicates);

        EasyMock.expect(files.files(pred)).andReturn(fileList).times(2);
        EasyMock.replay(files);

        QuamocoDecorator fixture = new QuamocoDecorator(files, projectIssues, finder);
        boolean result = fixture.shouldExecuteOnProject(null);
        assertFalse(result);
    }

    /**
     * Run the String toString() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testToString_1() throws Exception
    {
        QuamocoDecorator fixture = new QuamocoDecorator(EasyMock.createNiceMock(FileSystem.class),
                EasyMock.createNiceMock(ProjectIssues.class), EasyMock.createNiceMock(RuleFinder.class));

        String result = fixture.toString();

        // TODO: add additional test code here
        assertEquals("Quamoco Decorator", result);
    }

    /**
     * Runs the void decorate() method test.
     * 
     * @throws Exception
     */
    @Test
    public void testDecorate_1() throws Exception
    {
        fail("unverified");
    }

    /**
     * Runs the void decorate() method test.
     * 
     * @throws Exception
     */
    @Test
    public void testDecorate_2() throws Exception
    {
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:44 PM
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
     * @generatedBy CodePro at 5/30/15 3:44 PM
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
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(QuamocoDecoratorTest.class);
    }
}