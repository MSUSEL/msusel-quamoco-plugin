package net.siliconcode.quamoco.graph.node;

import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Maps;

import net.siliconcode.quamoco.codetree.CodeNode;
import net.siliconcode.quamoco.codetree.CodeNodeType;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.MetricsContext;

/**
 * The class <code>FindingTest</code> contains tests for the class
 * <code>{@link Finding}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class FindingTest {

	/**
	 * Run the Finding(CodeNode,String,String) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFinding_1() throws Exception {
		final CodeNode location = new FileNode("/some/path");
		final String issueKey = "issueKey";
		final String issueName = "issueName";

		final Finding result = new Finding(location, issueKey, issueName);

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals("issueName", result.getIssueName());
		Assert.assertEquals("issueKey", result.getIssueKey());
	}

	/**
	 * Run the Finding(CodeNode,String,String) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFinding_2() throws Exception {
		final CodeNode location = new FileNode("/some/path");
		final String issueKey = "";
		final String issueName = "issueName";

		try {
			new Finding(location, issueKey, issueName);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

		}
	}

	/**
	 * Run the Finding(CodeNode,String,String) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFinding_3() throws Exception {
		final CodeNode location = new FileNode("/some/path");
		final String issueKey = "issueKey";
		final String issueName = "";

		try {
			new Finding(location, issueKey, issueName);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

		}
	}

	/**
	 * Run the Finding(CodeNode,String,String) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFinding_4() throws Exception {
		final CodeNode location = new FileNode("/some/path");
		final String issueKey = null;
		final String issueName = "issueName";

		try {
			new Finding(location, issueKey, issueName);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

		}
	}

	/**
	 * Run the Finding(CodeNode,String,String) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFinding_5() throws Exception {
		final CodeNode location = new FileNode("/some/path");
		final String issueKey = "issueKey";
		final String issueName = null;

		try {
			new Finding(location, issueKey, issueName);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

		}
	}

	/**
	 * Run the Finding(CodeNode,String,String) constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testFinding_6() throws Exception {
		final CodeNode location = null;
		final String issueKey = "issueKey";
		final String issueName = "issueName";

		try {
			new Finding(location, issueKey, issueName);
			Assert.fail();
		} catch (final IllegalArgumentException e) {

		}
	}

	/**
	 * Run the void addExtent(String,String,double) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testAddExtent_1() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
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
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
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
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
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
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
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
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
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
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
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
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
		final String level = null;
		final String metric = null;
		final double value = 1.0;

		final boolean result = fixture.addExtent(level, metric, value);

		// add additional test code here
		Assert.assertFalse(result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_1() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
		final Object obj = new Finding(new FileNode("/some/path"), "issueKey", "issueName");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_2() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
		final Object obj = null;

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_3() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
		final Object obj = new Object();

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_4() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
		final Object obj = new Finding(new FileNode("/some/path"), "otherKey", "issueName");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_5() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
		final Object obj = new Finding(new FileNode("/some/path"), "issueKey", "otherName");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testEquals_6() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
		final Object obj = new Finding(new FileNode("/other/path"), "issueKey", "issueName");

		final boolean result = fixture.equals(obj);

		// add additional test code here
		Assert.assertEquals(false, result);
	}

	/**
	 * Run the double getExtent(String,NormalizationRange) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetExtent_1() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.FILE;

		fixture.addExtent(CodeNodeType.FILE, metric, 1234.0);
		final double result = fixture.getExtent(metric, range);

		Assert.assertEquals(1234.0, result, 0.1);
	}

	/**
	 * Run the double getExtent(String,NormalizationRange) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetExtent_2() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.FILE;

		final MetricsContext context = MetricsContext.getInstance();
		final Map<String, Map<String, Double>> metrics = Maps.newHashMap();
		final Map<String, Double> fileMetric = Maps.newHashMap();
		fileMetric.put("LOC", 1234.0);
		metrics.put("/some/path", fileMetric);
		context.setMetrics(null, metrics, null, null);

		final double result = fixture.getExtent(metric, range);

		Assert.assertEquals(1234.0, result, 0.1);
	}

	/**
	 * Run the double getExtent(String,NormalizationRange) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetExtent_3() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
		final String metric = "NOM";
		final NormalizationRange range = NormalizationRange.FILE;

		final MetricsContext context = MetricsContext.getInstance();
		final Map<String, Map<String, Double>> metrics = Maps.newHashMap();
		final Map<String, Double> fileMetric = Maps.newHashMap();
		fileMetric.put("LOC", 1234.0);
		metrics.put("/some/path", fileMetric);
		context.setMetrics(null, metrics, null, null);

		fixture.addExtent(CodeNodeType.FILE, metric, 15.0);
		final double result = fixture.getExtent("LOC", range);

		Assert.assertEquals(1234.0, result, 0.1);
	}

	/**
	 * Run the String getIssueKey() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetIssueKey_1() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");

		final String result = fixture.getIssueKey();

		// add additional test code here
		Assert.assertEquals("issueKey", result);
	}

	/**
	 * Run the String getIssueName() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetIssueName_1() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");

		final String result = fixture.getIssueName();

		// add additional test code here
		Assert.assertEquals("issueName", result);
	}

	/**
	 * Run the CodeNode getLocation() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testGetLocation_1() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");

		final CodeNode result = fixture.getLocation();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals("/some/path", result.getQIdentifier());
		Assert.assertEquals(1, result.getEnd());
		Assert.assertEquals(1, result.getStart());
		Assert.assertEquals(null, result.getOwner());
		Assert.assertEquals("FILE", result.getType());
	}

	/**
	 * Run the int hashCode() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testHashCode_1() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");

		final int result = fixture.hashCode();

		// add additional test code here
		Assert.assertEquals(1191012737, result);
	}

	/**
	 * Run the void setIssueKey(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetIssueKey_1() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
		final String issueKey = "";

		fixture.setIssueKey(issueKey);

		// add additional test code here
		Assert.assertEquals("issueKey", fixture.getIssueKey());

		fixture.setIssueKey(null);
		Assert.assertEquals("issueKey", fixture.getIssueKey());

		fixture.setIssueKey("otherKey");
		Assert.assertEquals("otherKey", fixture.getIssueKey());
	}

	/**
	 * Run the void setIssueName(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetIssueName_1() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
		String issueName = "";

		fixture.setIssueName(issueName);

		Assert.assertEquals("issueName", fixture.getIssueName());

		fixture.setIssueName(null);
		Assert.assertEquals("issueName", fixture.getIssueName());

		issueName = "otherName";
		fixture.setIssueName(issueName);

		Assert.assertEquals(issueName, fixture.getIssueName());
	}

	/**
	 * Run the void setLocation(CodeNode) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 1/26/16 6:38 PM
	 */
	@Test
	public void testSetLocation_1() throws Exception {
		final Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
		final CodeNode location = new FileNode("/some/other/path");

		fixture.setLocation(location);

		// add additional test code here
		Assert.assertEquals(location, fixture.getLocation());

		fixture.setLocation(null);
		Assert.assertNotNull(fixture.getLocation());
		Assert.assertEquals(location, fixture.getLocation());
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
		// add additional set up code here
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
		new org.junit.runner.JUnitCore().run(FindingTest.class);
	}
}