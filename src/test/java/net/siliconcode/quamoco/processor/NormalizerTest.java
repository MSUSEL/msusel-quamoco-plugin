package net.siliconcode.quamoco.processor;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.normalizers.NullNormalizer;
import net.siliconcode.quamoco.processor.normalizers.RangedNormalizer;

/**
 * The class <code>NormalizerTest</code> contains tests for the class
 * <code>{@link Normalizer}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class NormalizerTest {

	private Normalizer fixture;

	/**
	 * Run the String getMetric() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testNormalizer_1() throws Exception {
		final Edge edge = EasyMock.createMock(Edge.class);
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.CLASS;

		EasyMock.replay(edge);

		final Normalizer result = new RangedNormalizer(edge, metric, range);

		EasyMock.verify(edge);
		Assert.assertNotNull(result);
		Assert.assertEquals("LOC", result.getMetric());
	}

	/**
	 * Run the String getMetric() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testNormalizer_2() throws Exception {
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.CLASS;

		new RangedNormalizer(null, metric, range);
	}

	/**
	 * Run the String getMetric() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testGetMetric_1() throws Exception {
		final String result = fixture.getMetric();

		// add additional test code here
		Assert.assertEquals("LOC", result);
	}

	/**
	 * Run the NormalizationRange getNormalizationRange() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testGetNormalizationRange_1() throws Exception {
		final NormalizationRange result = fixture.getNormalizationRange();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals("CLASS", result.name());
		Assert.assertEquals("CLASS", result.toString());
		Assert.assertEquals(1, result.ordinal());
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
		fixture = new NullNormalizer(EasyMock.createNiceMock(Edge.class), "LOC", NormalizationRange.CLASS);
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
		new org.junit.runner.JUnitCore().run(NormalizerTest.class);
	}
}