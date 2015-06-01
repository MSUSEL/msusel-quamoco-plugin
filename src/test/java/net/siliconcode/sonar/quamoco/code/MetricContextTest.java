package net.siliconcode.sonar.quamoco.code;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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

        assertEquals(0, fixture.getTrees().size());
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

        assertEquals(1, fixture.getTrees().size());
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
        Resource other = new Directory("");
        CodeTree tree = new CodeTree();

        fixture.addCodeTree(resource, tree);
        fixture.addCodeTree(other, tree);

        assertEquals(1, fixture.getTrees().size());
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
        fixture.addCodeTree(new Directory(""), new CodeTree());
        fixture.removeCodeTree(resource);

        assertEquals(1, fixture.getTrees().size());
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

        assertEquals(0, fixture.getTrees().size());
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
        fixture.addCodeTree(new Directory("Other"), new CodeTree());
        Resource resource = new Directory("");

        fixture.removeCodeTree(resource);

        assertEquals(1, fixture.getTrees().size());
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