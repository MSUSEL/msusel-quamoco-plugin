package net.siliconcode.quamoco.processor;

import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Maps;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.codetree.MethodNode;
import net.siliconcode.quamoco.codetree.TypeNode;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.FindingToMeasureEdge;
import net.siliconcode.quamoco.graph.edge.MeasureToMeasureFindingsEdge;
import net.siliconcode.quamoco.graph.node.Finding;
import net.siliconcode.quamoco.graph.node.FindingNode;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.MeasureType;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.aggregators.FindingsUnionAggregator;

/**
 * The class <code>ExtentTest</code> contains tests for the class
 * <code>{@link Extent}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class ExtentTest {

	private Extent fixture;
	private FileNode file;
	private FileNode file2;
	private FileNode file3;
	private TypeNode type;
	private MethodNode method;

	private Finding fileFinding;
	private Finding methodFinding;
	private Finding typeFinding;

	private MeasureNode measure;

	/**
	 * Run the double findExtent(String,NormalizationRange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindExtent_1() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.FILE;

		final double result = fixture.findExtent(metric, range);

		// add additional test code here
		Assert.assertEquals(600.0, result, 0.1);
	}

	/**
	 * Run the double findExtent(String,NormalizationRange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindExtent_2() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.CLASS;

		final double result = fixture.findExtent(metric, range);

		// add additional test code here
		Assert.assertEquals(200.0, result, 0.1);
	}

	/**
	 * Run the double findExtent(String,NormalizationRange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindExtent_3() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.METHOD;

		final double result = fixture.findExtent(metric, range);

		// add additional test code here
		Assert.assertEquals(160.0, result, 0.1);
	}

	/**
	 * Run the double findExtent(String,NormalizationRange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindExtent_4() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.NA;

		final double result = fixture.findExtent(metric, range);

		// add additional test code here
		Assert.assertEquals(1000.0, result, 0.1);
	}

	/**
	 * Run the double findExtent(String,NormalizationRange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindExtent_5() throws Exception {
		final String metric = "NOC";
		final NormalizationRange range = NormalizationRange.NA;

		Assert.assertFalse(fixture.hasExtentForRangeAndMetric(metric, range));
		double result = fixture.findExtent(metric, range);

		// add additional test code here
		Assert.assertEquals(2.0, result, 0.1);
		Assert.assertTrue(fixture.hasExtentForRangeAndMetric(metric, range));
		result = fixture.findExtent(metric, range);
		Assert.assertEquals(2.0, result, 0.1);
	}

	/**
	 * Run the double findExtent(String,NormalizationRange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindExtent_6() throws Exception {
		final String metric = "NIV";
		final String metric2 = "NOM";
		final NormalizationRange range = NormalizationRange.NA;

		Assert.assertFalse(fixture.hasExtentForRangeAndMetric(metric, range));
		double result = fixture.findExtent(metric, range);
		Assert.assertTrue(fixture.hasExtentForRange(range));
		Assert.assertFalse(fixture.hasExtentForRangeAndMetric(metric2, range));
		result = fixture.findExtent(metric2, range);
		Assert.assertTrue(fixture.hasExtentForRangeAndMetric(metric2, range));
		// add additional test code here
		Assert.assertEquals(2.0, result, 0.1);
		Assert.assertTrue(fixture.hasExtentForRangeAndMetric(metric, range));
		result = fixture.findExtent(metric, range);
		Assert.assertEquals(10.0, result, 0.1);
	}

	/**
	 * Run the double findExtent(String,NormalizationRange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testFindExtent_7() throws Exception {
		final String metric = "";
		final NormalizationRange range = NormalizationRange.CLASS;

		fixture.findExtent(metric, range);
	}

	/**
	 * Run the double findExtent(String,NormalizationRange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testFindExtent_8() throws Exception {
		final String metric = null;
		final NormalizationRange range = NormalizationRange.CLASS;

		fixture.findExtent(metric, range);
	}

	/**
	 * Run the double findExtent(String,NormalizationRange) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testFindExtent_9() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = null;

		fixture.findExtent(metric, range);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindFindingExtent_1() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.CLASS;
		final Finding finding = fileFinding;

		final double result = fixture.findFindingExtent(metric, range, finding);

		// add additional test code here
		Assert.assertEquals(100.0, result, 0.1);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindFindingExtent_2() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.FILE;
		final Finding finding = fileFinding;

		final double result = fixture.findFindingExtent(metric, range, finding);

		// add additional test code here
		Assert.assertEquals(200.0, result, 0.1);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindFindingExtent_3() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.METHOD;
		final Finding finding = fileFinding;

		final double result = fixture.findFindingExtent(metric, range, finding);

		// add additional test code here
		Assert.assertEquals(80.0, result, 0.1);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindFindingExtent_4() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.NA;
		final Finding finding = fileFinding;

		final double result = fixture.findFindingExtent(metric, range, finding);

		// add additional test code here
		Assert.assertEquals(200.0, result, 0.1);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindFindingExtent_5() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.CLASS;
		final Finding finding = typeFinding;

		final double result = fixture.findFindingExtent(metric, range, finding);

		// add additional test code here
		Assert.assertEquals(100.0, result, 0.1);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindFindingExtent_6() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.FILE;
		final Finding finding = typeFinding;

		final double result = fixture.findFindingExtent(metric, range, finding);

		// add additional test code here
		Assert.assertEquals(100.0, result, 0.1);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindFindingExtent_7() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.METHOD;
		final Finding finding = typeFinding;

		final double result = fixture.findFindingExtent(metric, range, finding);

		// add additional test code here
		Assert.assertEquals(80.0, result, 0.1);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindFindingExtent_8() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.NA;
		final Finding finding = typeFinding;

		final double result = fixture.findFindingExtent(metric, range, finding);

		// add additional test code here
		Assert.assertEquals(100.0, result, 0.1);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindFindingExtent_9() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.CLASS;
		final Finding finding = methodFinding;

		final double result = fixture.findFindingExtent(metric, range, finding);

		// add additional test code here
		Assert.assertEquals(80.0, result, 0.1);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindFindingExtent_10() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.FILE;
		final Finding finding = methodFinding;

		final double result = fixture.findFindingExtent(metric, range, finding);

		// add additional test code here
		Assert.assertEquals(80.0, result, 0.1);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindFindingExtent_11() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.METHOD;
		final Finding finding = methodFinding;

		final double result = fixture.findFindingExtent(metric, range, finding);

		// add additional test code here
		Assert.assertEquals(80.0, result, 0.1);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindFindingExtent_12() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.NA;
		final Finding finding = methodFinding;

		final double result = fixture.findFindingExtent(metric, range, finding);

		// add additional test code here
		Assert.assertEquals(80.0, result, 0.1);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testFindFindingExtent_13() throws Exception {
		final String metric = "";
		final NormalizationRange range = NormalizationRange.CLASS;
		final Finding finding = fileFinding;

		fixture.findFindingExtent(metric, range, finding);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testFindFindingExtent_14() throws Exception {
		final String metric = null;
		final NormalizationRange range = NormalizationRange.CLASS;
		final Finding finding = fileFinding;

		fixture.findFindingExtent(metric, range, finding);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testFindFindingExtent_15() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = null;
		final Finding finding = new Finding(new TypeNode(new FileNode(""), "", "", true, 1, 1), "", "");

		fixture.findFindingExtent(metric, range, finding);
	}

	/**
	 * Run the double findFindingExtent(String,NormalizationRange,Finding)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testFindFindingExtent_16() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.CLASS;
		final Finding finding = null;

		fixture.findFindingExtent(metric, range, finding);
	}

	/**
	 * Run the double findMeasureExtent(String,NormalizationRange,MeasureNode)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testFindMeasureExtent_1() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.FILE;

		buildGraph();
		final double result = fixture.findMeasureExtent(metric, range, measure);

		// add additional test code here
		Assert.assertEquals(600.0, result, 0.1);
	}

	/**
	 * Run the double findMeasureExtent(String,NormalizationRange,MeasureNode)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testFindMeasureExtent_2() throws Exception {
		final String metric = "";
		final NormalizationRange range = NormalizationRange.FILE;

		buildGraph();

		fixture.findMeasureExtent(metric, range, measure);
	}

	/**
	 * Run the double findMeasureExtent(String,NormalizationRange,MeasureNode)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testFindMeasureExtent_3() throws Exception {
		final String metric = null;
		final NormalizationRange range = NormalizationRange.FILE;

		buildGraph();
		fixture.findMeasureExtent(metric, range, measure);
	}

	/**
	 * Run the double findMeasureExtent(String,NormalizationRange,MeasureNode)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testFindMeasureExtent_4() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = null;

		buildGraph();
		fixture.findMeasureExtent(metric, range, measure);
	}

	/**
	 * Run the double findMeasureExtent(String,NormalizationRange,MeasureNode)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testFindMeasureExtent_5() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.FILE;

		buildGraph();
		fixture.findMeasureExtent(metric, range, null);
	}

	/**
	 * Run the Extent getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testGetInstance_1() throws Exception {
		final Extent result = Extent.getInstance();
		final Extent result2 = Extent.getInstance();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertNotNull(result2);
		Assert.assertSame(result, result2);
	}

	/**
	 * Run the Extent getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testHasExtentForRange_1() throws Exception {
		final NormalizationRange range = NormalizationRange.FILE;
		fixture.clearExtents();

		Assert.assertTrue(fixture.hasExtentForRange(range));
	}

	/**
	 * Run the Extent getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testHasExtentForRangeAndMetric_1() throws Exception {
		final NormalizationRange range = NormalizationRange.FILE;
		fixture.clearExtents();

		fixture.findExtent("LOC", range);

		Assert.assertFalse(fixture.hasExtentForRangeAndMetric("NOM", range));

		fixture.findExtent("NOM", range);

		Assert.assertTrue(fixture.hasExtentForRangeAndMetric("NOM", range));
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Before
	public void setUp() throws Exception {
		fixture = Extent.getInstance();
		final MetricsContext context = MetricsContext.getInstance();

		file = new FileNode("path");
		file2 = new FileNode("path2");
		file3 = new FileNode("path3");
		type = new TypeNode(file, "namespace.Type", "Type", true, 1, 100);
		file.addType(type);
		method = new MethodNode(type, "method", false, 20, 100);
		type.addMethod(method);

		fileFinding = new Finding(file, "issue", "issue");
		methodFinding = new Finding(method, "issue", "issue");
		typeFinding = new Finding(type, "issue", "issue");

		final Map<String, Map<String, Double>> fileMetrics = Maps.newHashMap();
		final Map<String, Map<String, Double>> typeMetrics = Maps.newHashMap();
		final Map<String, Map<String, Double>> methodMetrics = Maps.newHashMap();
		final Map<String, Double> projectMetrics = Maps.newHashMap();

		final Map<String, Double> fileValues = Maps.newHashMap();
		final Map<String, Double> typeValues = Maps.newHashMap();
		final Map<String, Double> methodValues = Maps.newHashMap();

		fileValues.put("LOC", 200.0);
		fileMetrics.put(file.getQIdentifier(), fileValues);

		typeValues.put("LOC", 100.0);
		typeMetrics.put(type.getQIdentifier(), typeValues);

		methodValues.put("LOC", 80.0);
		methodMetrics.put(method.getQIdentifier(), methodValues);

		final Map<String, Double> fileValues2 = Maps.newHashMap();
		final Map<String, Double> fileValues3 = Maps.newHashMap();
		final Map<String, Double> typeValues2 = Maps.newHashMap();
		final Map<String, Double> methodValues2 = Maps.newHashMap();

		fileValues2.put("LOC", 200.0);
		fileMetrics.put(file2.getQIdentifier(), fileValues2);

		fileValues3.put("LOC", 200.0);
		fileMetrics.put(file3.getQIdentifier(), fileValues3);

		typeValues2.put("LOC", 100.0);
		typeMetrics.put(type.getQIdentifier() + "2", typeValues2);

		methodValues2.put("LOC", 80.0);
		methodMetrics.put(method.getQIdentifier() + "2", methodValues2);

		projectMetrics.put("LOC", 1000.0);
		projectMetrics.put("NOM", 2.0);
		projectMetrics.put("NIV", 10.0);
		projectMetrics.put("NOC", 2.0);

		context.setMetrics(projectMetrics, fileMetrics, typeMetrics, methodMetrics);
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
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
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(ExtentTest.class);
	}

	private void buildGraph() {
		final DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();
		measure = new MeasureNode(graph, "dest", "owner");
		measure.setType(MeasureType.FINDINGS);
		final MeasureNode src = new MeasureNode(graph, "src", "owner");
		src.setType(MeasureType.FINDINGS);
		final FindingNode srcsrc = new FindingNode(graph, "key", "owner", "rule", "tool");
		final FindingToMeasureEdge f2m = new FindingToMeasureEdge("preedge", srcsrc, src);
		final Edge edge = new MeasureToMeasureFindingsEdge("fixture", src, measure);
		src.setProcessor(new FindingsUnionAggregator(src));
		measure.setProcessor(new FindingsUnionAggregator(src));

		srcsrc.addFinding(new Finding(file, "issue", "issue"));
		srcsrc.addFinding(new Finding(file2, "issue", "issue"));
		srcsrc.addFinding(new Finding(file3, "issue", "issue"));

		graph.addEdge(edge, src, measure);
		graph.addEdge(f2m, srcsrc, src);
	}
}