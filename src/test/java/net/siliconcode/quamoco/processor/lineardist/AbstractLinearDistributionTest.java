package net.siliconcode.quamoco.processor.lineardist;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.model.qm.FunctionType;

/**
 * The class <code>AbstractLinearDistributionTest</code> contains tests for the
 * class <code>{@link AbstractLinearDistribution}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class AbstractLinearDistributionTest {

	private AbstractLinearDistribution fixture;

	/**
	 * Run the double calculate(double,double,double,double,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testCalculate_1() throws Exception {
		final double proportion = 0.5;
		final double lowerBound = 0.0;
		final double lowerResult = 0.0;
		final double upperBound = 1.0;
		final double upperResult = 100.0;

		final double result = fixture.calculate(proportion, lowerBound, lowerResult, upperBound, upperResult);

		// add additional test code here
		Assert.assertEquals(50.0, result, 0.1);
	}

	/**
	 * Run the double calculate(double,double,double,double,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testCalculate_2() throws Exception {
		final double proportion = 1.5;
		final double lowerBound = 0.0;
		final double lowerResult = 0.0;
		final double upperBound = 1.0;
		final double upperResult = 100.0;

		final double result = fixture.calculate(proportion, lowerBound, lowerResult, upperBound, upperResult);

		// add additional test code here
		Assert.assertEquals(100.0, result, 0.1);
	}

	/**
	 * Run the double calculate(double,double,double,double,double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testCalculate_3() throws Exception {
		final double proportion = -0.5;
		final double lowerBound = 0.0;
		final double lowerResult = 0.0;
		final double upperBound = 1.0;
		final double upperResult = 100.0;

		final double result = fixture.calculate(proportion, lowerBound, lowerResult, upperBound, upperResult);

		// add additional test code here
		Assert.assertEquals(0.0, result, 0.1);
	}

	/**
	 * Run the String getType() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testGetType_1() throws Exception {
		final String result = fixture.getType();

		Assert.assertNotNull(result);
		Assert.assertEquals(FunctionType.DECREASING, result);
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetType_1() throws Exception {
		final String type = null;

		fixture.setType(type);
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test(expected = java.lang.IllegalArgumentException.class)
	public void testSetType_2() throws Exception {
		final String type = "";

		fixture.setType(type);

		Assert.fail();
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testSetType_3() throws Exception {
		final String type = FunctionType.INCREASING;

		fixture.setType(type);

		Assert.assertEquals(type, fixture.getType());
	}

	/**
	 * Run the void setType(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 1/26/16 6:35 PM
	 */
	@Test
	public void testSetType_4() throws Exception {
		final String type = FunctionType.DECREASING;

		fixture.setType(type);

		Assert.assertEquals(type, fixture.getType());
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
		fixture = new NegativeLinearDistribution(FunctionType.DECREASING);
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
		new org.junit.runner.JUnitCore().run(AbstractLinearDistributionTest.class);
	}
}