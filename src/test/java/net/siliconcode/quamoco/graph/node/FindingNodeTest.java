package net.siliconcode.quamoco.graph.node;

import java.util.Set;

import org.junit.After;
import org.junit.Assert;
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
	public void testFindingNode_1() throws Exception {
		final DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		final String key = "node";
		final String owner = "owner";
		final String ruleName = "rule";
		final String toolName = "tool";

		final FindingNode result = new FindingNode(graph, key, owner, ruleName, toolName);

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals("rule", result.getRuleName());
		Assert.assertEquals(null, result.getXMLTag());
		Assert.assertEquals("tool", result.getToolName());
		Assert.assertEquals(0.0, result.getValue(), 1.0);
		Assert.assertEquals("owner", result.getOwnedBy());
		Assert.assertEquals("", result.getDescription());
		Assert.assertEquals(null, result.getProcessor());
		Assert.assertEquals("node", result.getName());
	}

	/**
	 * Run the void addExtent(String,String,double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddExtent_1() throws Exception {
		final String level = null;
		final String metric = "";
		final double value = 1.0;

		final boolean result = fixture.addExtent(level, metric, value);

		// add additional test code here
		Assert.assertFalse(result);
	}

	/**
	 * Run the void addExtent(String,String,double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddExtent_2() throws Exception {
		final String level = "";
		final String metric = "";
		final double value = 1.0;

		final boolean result = fixture.addExtent(level, metric, value);

		// add additional test code here
		Assert.assertFalse(result);
	}

	/**
	 * Run the void addExtent(String,String,double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddExtent_3() throws Exception {
		final String level = "";
		final String metric = null;
		final double value = 1.0;

		final boolean result = fixture.addExtent(level, metric, value);

		// add additional test code here
		Assert.assertFalse(result);
	}

	/**
	 * Run the void addExtent(String,String,double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddExtent_4() throws Exception {
		final String level = CodeNodeType.FIELD;
		final String metric = "";
		final double value = 1.0;

		final boolean result = fixture.addExtent(level, metric, value);

		// add additional test code here
		Assert.assertFalse(result);
	}

	/**
	 * Run the void addExtent(String,String,double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddExtent_5() throws Exception {
		final String level = "";
		final String metric = "LOC";
		final double value = 1.0;

		final boolean result = fixture.addExtent(level, metric, value);

		// add additional test code here
		Assert.assertFalse(result);
	}

	/**
	 * Run the void addExtent(String,String,double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddExtent_6() throws Exception {
		final String level = CodeNodeType.FIELD;
		final String metric = "LOC";
		final double value = 1.0;

		final boolean result = fixture.addExtent(level, metric, value);

		// add additional test code here
		Assert.assertTrue(result);
	}

	/**
	 * Run the void addExtent(String,String,double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddExtent_7() throws Exception {
		final String level = null;
		final String metric = null;
		final double value = 1.0;

		final boolean result = fixture.addExtent(level, metric, value);

		// add additional test code here
		Assert.assertFalse(result);
	}

	/**
	 * Run the void addFinding(Finding) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddFinding_1() throws Exception {
		Assert.assertTrue(fixture.getFindings().isEmpty());
		final Finding finding = new Finding(new FileNode("path"), "issueKey", "issueName");

		fixture.addFinding(finding);

		// add additional test code here
		Assert.assertFalse(fixture.getFindings().isEmpty());
		Assert.assertEquals(1, fixture.getFindings().size());
	}

	/**
	 * Run the double getExtent(String,NormalizationRange) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetExtent_1() throws Exception {
		final String metric = "";
		final NormalizationRange range = NormalizationRange.CLASS;

		final double result = fixture.getExtent(metric, range);

		Assert.assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the double getExtent(String,NormalizationRange) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetExtent_2() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.FILE;

		final boolean test = fixture.addExtent(range.toString(), metric, 300);
		Assert.assertTrue(test);

		final double result = fixture.getExtent(metric, range);

		// add additional test code here
		Assert.assertEquals(300, result, 0.01);
	}

	/**
	 * Run the double getExtent(String,NormalizationRange) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetExtent_3() throws Exception {
		final Finding f = new Finding(new FileNode("path"), "issueKey1", "issueName1");
		Assert.assertTrue(f.addExtent("FILE", "LOC", 100));
		final Finding f2 = new Finding(new FileNode("path2"), "issueKey2", "issueName2");
		Assert.assertTrue(f2.addExtent("FILE", "LOC", 100));

		Assert.assertTrue(fixture.addFinding(f));
		Assert.assertTrue(fixture.getFindings().contains(f));
		Assert.assertEquals(1, f.getExtents().get("FILE").size());
		Assert.assertEquals(100, f.getExtent("LOC", NormalizationRange.FILE), 0.01);
		Assert.assertTrue(fixture.addFinding(f2));
		Assert.assertTrue(fixture.getFindings().contains(f2));
		Assert.assertEquals(1, f2.getExtents().get("FILE").size());
		Assert.assertEquals(100, f2.getExtent("LOC", NormalizationRange.FILE), 0.01);

		Assert.assertEquals(2, fixture.getFindings().size());

		final double result = fixture.getExtent("LOC", NormalizationRange.FILE);

		Assert.assertEquals(200, result, 0.1);
	}

	/**
	 * Run the Set<Finding> getFindings() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetFindings_1() throws Exception {
		fixture.addFinding(new Finding(new FileNode("path"), "issueKey", "issueName"));
		final Set<Finding> result = fixture.getFindings();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(1, result.size());
	}

	/**
	 * Run the double getLowerResult() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetLowerResult_1() throws Exception {
		final double result = fixture.getLowerResult();

		Assert.assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the String getRuleName() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetRuleName_1() throws Exception {
		final String result = fixture.getRuleName();

		// add additional test code here
		Assert.assertEquals("rule", result);
	}

	/**
	 * Run the String getToolName() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetToolName_1() throws Exception {
		final String result = fixture.getToolName();

		// add additional test code here
		Assert.assertEquals("tool", result);
	}

	/**
	 * Run the double getUpperResult() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetUpperResult_1() throws Exception {
		final double result = fixture.getUpperResult();

		Assert.assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double getValue() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetValue_1() throws Exception {
		final double result = fixture.getValue();

		// add additional test code here
		Assert.assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the void setRuleName(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetRuleName_1() throws Exception {
		final String ruleName = "other";

		fixture.setRuleName(ruleName);

		// add additional test code here
		Assert.assertEquals(ruleName, fixture.getRuleName());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Before
	public void setUp() throws Exception {
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
	public void tearDown() throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(FindingNodeTest.class);
	}
}