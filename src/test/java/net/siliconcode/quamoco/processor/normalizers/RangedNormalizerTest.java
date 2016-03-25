package net.siliconcode.quamoco.processor.normalizers;

import java.util.Map;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Maps;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.codetree.MethodNode;
import net.siliconcode.quamoco.codetree.TypeNode;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.MeasureToMeasureNumberEdge;
import net.siliconcode.quamoco.graph.edge.ValueToMeasureEdge;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.ValueNode;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.Extent;
import net.siliconcode.quamoco.processor.MetricsContext;
import net.siliconcode.quamoco.processor.aggregators.NumberMeanAggregator;

/**
 * The class <code>RangedNormalizerTest</code> contains tests for the class
 * <code>{@link RangedNormalizer}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class RangedNormalizerTest {

	private RangedNormalizer fixture;

	/**
	 * Run the RangedNormalizer(Edge,String,NormalizationRange) constructor
	 * test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testRangedNormalizer_1() throws Exception {
		final Edge owner = EasyMock.createMock(Edge.class);
		final String normMetric = "LOC";
		final NormalizationRange range = NormalizationRange.CLASS;
		// add mock object expectations here

		EasyMock.replay(owner);

		final RangedNormalizer result = new RangedNormalizer(owner, normMetric, range);

		// add additional test code here
		EasyMock.verify(owner);
		Assert.assertNotNull(result);
		Assert.assertEquals("LOC", result.getMetric());
	}

	/**
	 * Run the double normalize(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testNormalize_1() throws Exception {
		final double value = 100.0;

		final double result = fixture.normalize(value);

		Assert.assertEquals(0.25, result, 0.001);
	}

	/**
	 * Run the double normalize(Set<Finding>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testNormalize_2() throws Exception {
		final double value = 400.0;

		final double result = fixture.normalize(value);

		Assert.assertEquals(1.0, result, 0.001);
	}

	/**
	 * Run the double normalize(Set<Finding>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testNormalize_3() throws Exception {
		final double value = 0.0;

		final double result = fixture.normalize(value);

		Assert.assertEquals(0.0, result, 0.001);
	}

	/**
	 * Run the double normalize(Set<Finding>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testNormalize_4() throws Exception {
		final double value = 500.0;

		final double result = fixture.normalize(value);

		Assert.assertEquals(1.25, result, 0.001);
	}

	/**
	 * Run the double normalize(Set<Finding>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testNormalize_5() throws Exception {
		final double value = -100.0;

		final double result = fixture.normalize(value);

		Assert.assertEquals(-0.25, result, 0.001);
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
		final DirectedSparseGraph<Node, Edge> graph = new DirectedSparseGraph<>();

		final ValueNode vn = new ValueNode(graph, "LOC", "owner", "tool");
		vn.addValue(100.0);

		final MeasureNode src = new MeasureNode(graph, "src", "owner");
		src.setProcessor(new NumberMeanAggregator(src));

		final MeasureNode dest = new MeasureNode(graph, "dest", "owner");
		dest.setProcessor(new NumberMeanAggregator(dest));

		final Edge e = new MeasureToMeasureNumberEdge("edge", src, dest);
		fixture = new RangedNormalizer(e, "LOC", NormalizationRange.FILE);

		graph.addEdge(e, src, dest, EdgeType.DIRECTED);
		graph.addEdge(new ValueToMeasureEdge("v2m", vn, src), vn, src, EdgeType.DIRECTED);

		// setup metrics
		final MetricsContext context = MetricsContext.getInstance();

		final FileNode file = new FileNode("path");
		final FileNode file2 = new FileNode("path2");
		final TypeNode type = new TypeNode(file, "namespace.Type", "Type", true, 1, 100);
		file.addType(type);
		final MethodNode method = new MethodNode(type, "method", false, 20, 100);
		type.addMethod(method);

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
		final Map<String, Double> typeValues2 = Maps.newHashMap();
		final Map<String, Double> methodValues2 = Maps.newHashMap();

		fileValues2.put("LOC", 200.0);
		fileMetrics.put(file2.getQIdentifier(), fileValues2);

		typeValues2.put("LOC", 100.0);
		typeMetrics.put(type.getQIdentifier() + "2", typeValues2);

		methodValues2.put("LOC", 80.0);
		methodMetrics.put(method.getQIdentifier() + "2", methodValues2);

		projectMetrics.put("LOC", 1000.0);
		projectMetrics.put("NOM", 2.0);
		projectMetrics.put("NIV", 10.0);
		projectMetrics.put("NOC", 2.0);

		context.setMetrics(projectMetrics, fileMetrics, typeMetrics, methodMetrics);
		Extent.getInstance().clearExtents();
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
		new org.junit.runner.JUnitCore().run(RangedNormalizerTest.class);
	}
}