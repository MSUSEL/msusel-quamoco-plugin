package net.siliconcode.sonar.quamoco.code;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import org.sonar.api.resources.Directory;
import org.sonar.api.resources.Resource;

/**
 * The class <code>MetricContextTest</code> contains tests for the class <code>{@link MetricContext}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:45 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class MetricContextTest {
    /**
     * Run the MetricContext() constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testMetricContext_1()
        throws Exception
    {

        MetricContext result = new MetricContext();

        // TODO: add additional test code here
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the void addCodeTree(Resource,CodeTree) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testAddCodeTree_1()
        throws Exception
    {
        MetricContext fixture = new MetricContext();
        Resource resource = null;
        CodeTree tree = new CodeTree();

        fixture.addCodeTree(resource, tree);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void addCodeTree(Resource,CodeTree) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testAddCodeTree_2()
        throws Exception
    {
        MetricContext fixture = new MetricContext();
        Resource resource = new Directory("");
        CodeTree tree = new CodeTree();

        fixture.addCodeTree(resource, tree);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void addCodeTree(Resource,CodeTree) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testAddCodeTree_3()
        throws Exception
    {
        MetricContext fixture = new MetricContext();
        Resource resource = new Directory("");
        CodeTree tree = new CodeTree();

        fixture.addCodeTree(resource, tree);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the CodeTree getTree(Resource) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testGetTree_1()
        throws Exception
    {
        MetricContext fixture = new MetricContext();
        Resource resource = new Directory("");

        CodeTree result = fixture.getTree(resource);

        // TODO: add additional test code here
        assertEquals(null, result);
        fail("unverified");
    }

    /**
     * Run the List<CodeTree> getTrees() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testGetTrees_1()
        throws Exception
    {
        MetricContext fixture = new MetricContext();

        List<CodeTree> result = fixture.getTrees();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
        fail("unverified");
    }

    /**
     * Run the void removeCodeTree(Resource) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testRemoveCodeTree_1()
        throws Exception
    {
        MetricContext fixture = new MetricContext();
        Resource resource = null;

        fixture.removeCodeTree(resource);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void removeCodeTree(Resource) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testRemoveCodeTree_2()
        throws Exception
    {
        MetricContext fixture = new MetricContext();
        Resource resource = new Directory("");

        fixture.removeCodeTree(resource);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void removeCodeTree(Resource) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testRemoveCodeTree_3()
        throws Exception
    {
        MetricContext fixture = new MetricContext();
        Resource resource = new Directory("");

        fixture.removeCodeTree(resource);

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
        new org.junit.runner.JUnitCore().run(MetricContextTest.class);
    }
}