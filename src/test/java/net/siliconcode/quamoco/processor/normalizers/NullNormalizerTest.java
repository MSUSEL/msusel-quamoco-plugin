package net.siliconcode.quamoco.processor.normalizers;

import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Sets;

import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.graph.edge.MeasureToMeasureNumberEdge;
import net.siliconcode.quamoco.graph.node.Finding;
import net.siliconcode.quamoco.model.qm.NormalizationRange;

/**
 * The class <code>NullNormalizerTest</code> contains tests for the class
 * <code>{@link NullNormalizer}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:34 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class NullNormalizerTest {

	private NullNormalizer fixture;

	/**
	 * Run the NullNormalizer(Edge,String,NormalizationRange) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:34 PM
	 */
	@Test
	public void testNullNormalizer_1() throws Exception {
		final NormalizationRange range = NormalizationRange.CLASS;

		final NullNormalizer result = new NullNormalizer(new MeasureToMeasureNumberEdge("edge", null, null), "LOC",
				range);

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals("LOC", result.getMetric());
	}

	/**
	 * Run the double normalize(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:34 PM
	 */
	@Test
	public void testNormalize_1() throws Exception {
		final double value = 1.0;

		final double result = fixture.normalize(value);

		// add additional test code here
		Assert.assertEquals(value, result, 0.1);
	}

	/**
	 * Run the double normalize(Set<Finding>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:34 PM
	 */
	@Test
	public void testNormalize_2() throws Exception {
		final Set<Finding> findings = Sets.newHashSet();
		findings.add(new Finding(new FileNode("path"), "issue", "issue"));
		final double result = fixture.normalize(findings);

		// add additional test code here
		Assert.assertEquals(1.0, result, 0.1);
	}

	/**
	 * Run the double normalize(Set<Finding>) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:34 PM
	 */
	@Test
	public void testNormalize_3() throws Exception {
		final Set<Finding> findings = null;
		final double result = fixture.normalize(findings);

		// add additional test code here
		Assert.assertEquals(0.0, result, 0.1);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 1/26/16 6:34 PM
	 */
	@Before
	public void setUp() throws Exception {
		fixture = new NullNormalizer(new MeasureToMeasureNumberEdge("edge", null, null), "LOC",
				NormalizationRange.CLASS);
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 1/26/16 6:34 PM
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
	 * @generatedBy CodePro at 1/26/16 6:34 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(NullNormalizerTest.class);
	}
}