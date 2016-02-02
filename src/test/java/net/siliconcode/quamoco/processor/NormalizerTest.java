package net.siliconcode.quamoco.processor;

import org.easymock.EasyMock;
import net.siliconcode.quamoco.processor.normalizers.NullNormalizer;
import org.junit.*;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.graph.edge.Edge;
import static org.junit.Assert.*;

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
	public void testGetMetric_1() throws Exception {
		String result = fixture.getMetric();

		// add additional test code here
		assertEquals("LOC", result);
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
		NormalizationRange result = fixture.getNormalizationRange();

		// add additional test code here
		assertNotNull(result);
		assertEquals("CLASS", result.name());
		assertEquals("CLASS", result.toString());
		assertEquals(1, result.ordinal());
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
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NormalizerTest.class);
	}
}