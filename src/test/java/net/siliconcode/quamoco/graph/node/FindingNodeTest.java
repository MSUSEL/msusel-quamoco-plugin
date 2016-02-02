package net.siliconcode.quamoco.graph.node;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.codetree.CodeNodeType;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.NullProcessor;

/**
 * The class <code>FindingNodeTest</code> contains tests for the class
 * <code>{@link FindingNode}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class FindingNodeTest {

    private FindingNode fixture;

    /**
     * Run the FindingNode(DirectedSparseGraph
     * <Node,Edge>,String,String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testFindingNode_1() throws Exception
    {
        DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
        String key = "node";
        String owner = "owner";
        String ruleName = "rule";
        String toolName = "tool";

        FindingNode result = new FindingNode(graph, key, owner, ruleName, toolName);

        // add additional test code here
        assertNotNull(result);
        assertEquals("rule", result.getRuleName());
        assertEquals(null, result.getXMLTag());
        assertEquals("tool", result.getToolName());
        assertEquals(0.0, result.getValue(), 1.0);
        assertEquals("owner", result.getOwnedBy());
        assertEquals("", result.getDescription());
        assertEquals(null, result.getProcessor());
        assertEquals("node", result.getName());
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_1() throws Exception
    {
        String level = null;
        String metric = "";
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_2() throws Exception
    {
        String level = "";
        String metric = "";
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_3() throws Exception
    {
        String level = "";
        String metric = null;
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_4() throws Exception
    {
        String level = CodeNodeType.FIELD;
        String metric = "";
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_5() throws Exception
    {
        String level = "";
        String metric = "LOC";
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_6() throws Exception
    {
        String level = CodeNodeType.FIELD;
        String metric = "LOC";
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertTrue(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_7() throws Exception
    {
        String level = null;
        String metric = null;
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addFinding(Finding) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddFinding_1() throws Exception
    {
        assertTrue(fixture.getFindings().isEmpty());
        Finding finding = new Finding(new FileNode("path"), "issueKey", "issueName");

        fixture.addFinding(finding);

        // add additional test code here
        assertFalse(fixture.getFindings().isEmpty());
        assertEquals(1, fixture.getFindings().size());
    }

    /**
     * Run the double getExtent(String,NormalizationRange) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetExtent_1() throws Exception
    {
        String metric = "";
        NormalizationRange range = NormalizationRange.CLASS;

        double result = fixture.getExtent(metric, range);

        assertEquals(0.0, result, 0.1);
    }

    /**
     * Run the double getExtent(String,NormalizationRange) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetExtent_2() throws Exception
    {
        String metric = "LOC";
        NormalizationRange range = NormalizationRange.FILE;

        boolean test = fixture.addExtent(range.toString(), metric, 300);
        assertTrue(test);

        double result = fixture.getExtent(metric, range);

        // add additional test code here
        assertEquals(300, result, 0.01);
    }

    /**
     * Run the double getExtent(String,NormalizationRange) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetExtent_3() throws Exception
    {
        Finding f = new Finding(new FileNode("path"), "issueKey1", "issueName1");
        assertTrue(f.addExtent("FILE", "LOC", 100));
        Finding f2 = new Finding(new FileNode("path2"), "issueKey2", "issueName2");
        assertTrue(f2.addExtent("FILE", "LOC", 100));

        assertTrue(fixture.addFinding(f));
        assertTrue(fixture.getFindings().contains(f));
        assertEquals(1, f.getExtents().get("FILE").size());
        assertEquals(100, f.getExtent("LOC", NormalizationRange.FILE), 0.01);
        assertTrue(fixture.addFinding(f2));
        assertTrue(fixture.getFindings().contains(f2));
        assertEquals(1, f2.getExtents().get("FILE").size());
        assertEquals(100, f2.getExtent("LOC", NormalizationRange.FILE), 0.01);

        assertEquals(2, fixture.getFindings().size());

        double result = fixture.getExtent("LOC", NormalizationRange.FILE);

        assertEquals(200, result, 0.1);
    }

    /**
     * Run the Set<Finding> getFindings() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetFindings_1() throws Exception
    {
        fixture.addFinding(new Finding(new FileNode("path"), "issueKey", "issueName"));
        Set<Finding> result = fixture.getFindings();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the double getLowerResult() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetLowerResult_1() throws Exception
    {
        double result = fixture.getLowerResult();

        assertEquals(0.0, result, 0.1);
    }

    /**
     * Run the String getRuleName() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetRuleName_1() throws Exception
    {
        String result = fixture.getRuleName();

        // add additional test code here
        assertEquals("rule", result);
    }

    /**
     * Run the String getToolName() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetToolName_1() throws Exception
    {
        String result = fixture.getToolName();

        // add additional test code here
        assertEquals("tool", result);
    }

    /**
     * Run the double getUpperResult() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetUpperResult_1() throws Exception
    {
        double result = fixture.getUpperResult();

        assertEquals(1.0, result, 0.1);
    }

    /**
     * Run the double getValue() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetValue_1() throws Exception
    {
        double result = fixture.getValue();

        // add additional test code here
        assertEquals(0.0, result, 0.1);
    }

    /**
     * Run the void setRuleName(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testSetRuleName_1() throws Exception
    {
        String ruleName = "other";

        fixture.setRuleName(ruleName);

        // add additional test code here
        assertEquals(ruleName, fixture.getRuleName());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Before
    public void setUp() throws Exception
    {
        fixture = new FindingNode(new DirectedSparseGraph<>(), "node", "owner", "rule", "tool");
        fixture.processor = new NullProcessor(fixture);
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @After
    public void tearDown() throws Exception
    {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args
     *            the command line arguments
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(FindingNodeTest.class);
    }
}