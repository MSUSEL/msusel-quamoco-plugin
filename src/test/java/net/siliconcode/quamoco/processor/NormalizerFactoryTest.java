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
import net.siliconcode.quamoco.processor.normalizers.UnrangedNormalizer;

/**
 * The class <code>NormalizerFactoryTest</code> contains tests for the class
 * <code>{@link NormalizerFactory}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class NormalizerFactoryTest {
	/**
	 * Run the Normalizer createNormalizer(Edge,String,NormalizationRange)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testCreateNormalizer_1() throws Exception {
		final NormalizerFactory fixture = NormalizerFactory.getInstance();
		final Edge edge = null;
		final String metric = "";
		final NormalizationRange range = NormalizationRange.CLASS;

		final Normalizer result = fixture.createNormalizer(edge, metric, range);

		// add additional test code here
		Assert.assertEquals(null, result);
	}

	/**
	 * Run the Normalizer createNormalizer(Edge,String,NormalizationRange)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testCreateNormalizer_2() throws Exception {
		final NormalizerFactory fixture = NormalizerFactory.getInstance();
		final Edge edge = EasyMock.createMock(Edge.class);
		final String metric = null;
		final NormalizationRange range = NormalizationRange.CLASS;
		// add mock object expectations here

		EasyMock.replay(edge);

		final Normalizer result = fixture.createNormalizer(edge, metric, range);

		// add additional test code here
		EasyMock.verify(edge);
		Assert.assertNotNull(result);
		Assert.assertTrue(result instanceof NullNormalizer);
		Assert.assertEquals(null, result.getMetric());
	}

	/**
	 * Run the Normalizer createNormalizer(Edge,String,NormalizationRange)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testCreateNormalizer_3() throws Exception {
		final NormalizerFactory fixture = NormalizerFactory.getInstance();
		final Edge edge = EasyMock.createMock(Edge.class);
		final String metric = "";
		final NormalizationRange range = null;
		// add mock object expectations here

		EasyMock.replay(edge);

		final Normalizer result = fixture.createNormalizer(edge, metric, range);

		// add additional test code here
		EasyMock.verify(edge);
		Assert.assertNotNull(result);
		Assert.assertTrue(result instanceof NullNormalizer);
		Assert.assertEquals("", result.getMetric());
		Assert.assertEquals(null, result.getNormalizationRange());
	}

	/**
	 * Run the Normalizer createNormalizer(Edge,String,NormalizationRange)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testCreateNormalizer_4() throws Exception {
		final NormalizerFactory fixture = NormalizerFactory.getInstance();
		final Edge edge = EasyMock.createMock(Edge.class);
		final String metric = "";
		final NormalizationRange range = NormalizationRange.CLASS;
		// add mock object expectations here

		EasyMock.replay(edge);

		final Normalizer result = fixture.createNormalizer(edge, metric, range);

		// add additional test code here
		EasyMock.verify(edge);
		Assert.assertNotNull(result);
		Assert.assertTrue(result instanceof NullNormalizer);
		Assert.assertEquals("", result.getMetric());
	}

	/**
	 * Run the Normalizer createNormalizer(Edge,String,NormalizationRange)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testCreateNormalizer_5() throws Exception {
		final NormalizerFactory fixture = NormalizerFactory.getInstance();
		final Edge edge = EasyMock.createMock(Edge.class);
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.CLASS;
		// add mock object expectations here

		EasyMock.replay(edge);

		final Normalizer result = fixture.createNormalizer(edge, metric, range);

		// add additional test code here
		EasyMock.verify(edge);
		Assert.assertNotNull(result);
		Assert.assertTrue(result instanceof RangedNormalizer);
		Assert.assertEquals("LOC", result.getMetric());
	}

	/**
	 * Run the Normalizer createNormalizer(Edge,String,NormalizationRange)
	 * method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testCreateNormalizer_6() throws Exception {
		final NormalizerFactory fixture = NormalizerFactory.getInstance();
		final Edge edge = EasyMock.createMock(Edge.class);
		final String metric = "LOC";
		final NormalizationRange range = NormalizationRange.NA;
		// add mock object expectations here

		EasyMock.replay(edge);

		final Normalizer result = fixture.createNormalizer(edge, metric, range);

		// add additional test code here
		EasyMock.verify(edge);
		Assert.assertNotNull(result);
		Assert.assertTrue(result instanceof UnrangedNormalizer);
		Assert.assertEquals("LOC", result.getMetric());
	}

	/**
	 * Run the NormalizerFactory getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testGetInstance_1() throws Exception {
		final NormalizerFactory result = NormalizerFactory.getInstance();
		final NormalizerFactory result2 = NormalizerFactory.getInstance();

		// add additional test code here
		Assert.assertNotNull(result);
		Assert.assertNotNull(result2);
		Assert.assertSame(result, result2);
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
		// add additional set up code here
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
		new org.junit.runner.JUnitCore().run(NormalizerFactoryTest.class);
	}
}