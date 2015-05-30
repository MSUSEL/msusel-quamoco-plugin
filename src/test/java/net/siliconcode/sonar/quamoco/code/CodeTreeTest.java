package net.siliconcode.sonar.quamoco.code;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CodeTreeTest</code> contains tests for the class <code>{@link CodeTree}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:45 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class CodeTreeTest {
    /**
     * Run the CodeTree() constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testCodeTree_1()
        throws Exception
    {

        CodeTree result = new CodeTree();

        // TODO: add additional test code here
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the void addRoot(CodeEntity) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testAddRoot_1()
        throws Exception
    {
        CodeTree fixture = new CodeTree();
        fixture.addRoot(CodeEntityFactory.createCodeEntity());
        CodeEntity entity = null;

        fixture.addRoot(entity);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void addRoot(CodeEntity) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testAddRoot_2()
        throws Exception
    {
        CodeTree fixture = new CodeTree();
        fixture.addRoot(CodeEntityFactory.createCodeEntity2());
        CodeEntity entity = CodeEntityFactory.createCodeEntity3();

        fixture.addRoot(entity);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void addRoot(CodeEntity) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testAddRoot_3()
        throws Exception
    {
        CodeTree fixture = new CodeTree();
        fixture.addRoot(CodeEntityFactory.createCodeEntity4());
        CodeEntity entity = CodeEntityFactory.createCodeEntity();

        fixture.addRoot(entity);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the List<CodeEntity> getRoots() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testGetRoots_1()
        throws Exception
    {
        CodeTree fixture = new CodeTree();
        fixture.addRoot(CodeEntityFactory.createCodeEntity2());

        List<CodeEntity> result = fixture.getRoots();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
        fail("unverified");
    }

    /**
     * Run the void removeRoot(CodeEntity) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testRemoveRoot_1()
        throws Exception
    {
        CodeTree fixture = new CodeTree();
        fixture.addRoot(CodeEntityFactory.createCodeEntity3());
        CodeEntity entity = null;

        fixture.removeRoot(entity);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void removeRoot(CodeEntity) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testRemoveRoot_2()
        throws Exception
    {
        CodeTree fixture = new CodeTree();
        fixture.addRoot(CodeEntityFactory.createCodeEntity4());
        CodeEntity entity = CodeEntityFactory.createCodeEntity();

        fixture.removeRoot(entity);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void removeRoot(CodeEntity) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testRemoveRoot_3()
        throws Exception
    {
        CodeTree fixture = new CodeTree();
        fixture.addRoot(CodeEntityFactory.createCodeEntity2());
        CodeEntity entity = CodeEntityFactory.createCodeEntity3();

        fixture.removeRoot(entity);

        // TODO: add additional test code here
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
        new org.junit.runner.JUnitCore().run(CodeTreeTest.class);
    }
}