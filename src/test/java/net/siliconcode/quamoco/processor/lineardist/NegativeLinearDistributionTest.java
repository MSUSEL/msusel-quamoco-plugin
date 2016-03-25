package net.siliconcode.quamoco.processor.lineardist;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.model.qm.FunctionType;

/**
 * The class <code>NegativeLinearDistributionTest</code> contains tests for the
 * class <code>{@link NegativeLinearDistribution}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class NegativeLinearDistributionTest {
	/**
	 * Run the NegativeLinearDistribution(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testNegativeLinearDistribution_1() throws Exception {
		final String type = FunctionType.DECREASING;

		final NegativeLinearDistribution result = new NegativeLinearDistribution(type);

		// add additional test code here
		Assert.assertNotNull(result);
	}

	/**
	 * Run the double calculate(double,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testCalculate_1() throws Exception {
		final NegativeLinearDistribution fixture = new NegativeLinearDistribution(FunctionType.DECREASING);
		final double maxPoints = 100.0;
		final double proportion = 0.5;

		double result = fixture.calculate(maxPoints, proportion);

		// add additional test code here
		Assert.assertEquals(50.0, result, 0.1);

		result = fixture.calculate(maxPoints, 0.75);
		Assert.assertEquals(25.0, result, 0.1);

		result = fixture.calculate(maxPoints, 0.25);
		Assert.assertEquals(75.0, result, 0.1);

		result = fixture.calculate(maxPoints, 0);
		Assert.assertEquals(100.0, result, 0.1);

		result = fixture.calculate(maxPoints, 1.0);
		Assert.assertEquals(0.0, result, 0.1);

		result = fixture.calculate(maxPoints, 1.5);
		Assert.assertEquals(0.0, result, 0.1);

		result = fixture.calculate(maxPoints, -1.5);
		Assert.assertEquals(100.0, result, 0.1);
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
		new org.junit.runner.JUnitCore().run(NegativeLinearDistributionTest.class);
	}
}