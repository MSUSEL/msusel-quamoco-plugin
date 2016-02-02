package net.siliconcode.quamoco.processor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.model.qm.NormalizationRange;

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
		NormalizerFactory fixture = NormalizerFactory.getInstance();
		Edge edge = null;
		String metric = "";
		NormalizationRange range = NormalizationRange.CLASS;

		Normalizer result = fixture.createNormalizer(edge, metric, range);

		// add additional test code here
		assertEquals(null, result);
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
		NormalizerFactory fixture = NormalizerFactory.getInstance();
		Edge edge = EasyMock.createMock(Edge.class);
		String metric = null;
		NormalizationRange range = NormalizationRange.CLASS;
		// add mock object expectations here

		EasyMock.replay(edge);

		Normalizer result = fixture.createNormalizer(edge, metric, range);

		// add additional test code here
		EasyMock.verify(edge);
		assertNotNull(result);
		assertEquals(null, result.getMetric());
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
		NormalizerFactory fixture = NormalizerFactory.getInstance();
		Edge edge = EasyMock.createMock(Edge.class);
		String metric = "";
		NormalizationRange range = null;
		// add mock object expectations here

		EasyMock.replay(edge);

		Normalizer result = fixture.createNormalizer(edge, metric, range);

		// add additional test code here
		EasyMock.verify(edge);
		assertNotNull(result);
		assertEquals("", result.getMetric());
		assertEquals(null, result.getNormalizationRange());
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
		NormalizerFactory fixture = NormalizerFactory.getInstance();
		Edge edge = EasyMock.createMock(Edge.class);
		String metric = "";
		NormalizationRange range = NormalizationRange.CLASS;
		// add mock object expectations here

		EasyMock.replay(edge);

		Normalizer result = fixture.createNormalizer(edge, metric, range);

		// add additional test code here
		EasyMock.verify(edge);
		assertNotNull(result);
		assertEquals("", result.getMetric());
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
		NormalizerFactory fixture = NormalizerFactory.getInstance();
		Edge edge = EasyMock.createMock(Edge.class);
		String metric = "";
		NormalizationRange range = NormalizationRange.CLASS;
		// add mock object expectations here

		EasyMock.replay(edge);

		Normalizer result = fixture.createNormalizer(edge, metric, range);

		// add additional test code here
		EasyMock.verify(edge);
		assertNotNull(result);
		assertEquals("", result.getMetric());
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
		NormalizerFactory result = NormalizerFactory.getInstance();
		NormalizerFactory result2 = NormalizerFactory.getInstance();

		// add additional test code here
		assertNotNull(result);
		assertNotNull(result2);
		assertSame(result, result2);
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
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NormalizerFactoryTest.class);
	}
}