package net.siliconcode.quamoco.processor.lineardist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
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
		double proportion = 0.5;
		double lowerBound = 0.0;
		double lowerResult = 0.0;
		double upperBound = 1.0;
		double upperResult = 100.0;

		double result = fixture.calculate(proportion, lowerBound, lowerResult, upperBound, upperResult);

		// add additional test code here
		assertEquals(50.0, result, 0.1);
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
		double proportion = 1.5;
		double lowerBound = 0.0;
		double lowerResult = 0.0;
		double upperBound = 1.0;
		double upperResult = 100.0;

		double result = fixture.calculate(proportion, lowerBound, lowerResult, upperBound, upperResult);

		// add additional test code here
		assertEquals(100.0, result, 0.1);
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
		double proportion = -0.5;
		double lowerBound = 0.0;
		double lowerResult = 0.0;
		double upperBound = 1.0;
		double upperResult = 100.0;

		double result = fixture.calculate(proportion, lowerBound, lowerResult, upperBound, upperResult);

		// add additional test code here
		assertEquals(0.0, result, 0.1);
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
		String result = fixture.getType();

		assertNotNull(result);
		assertEquals(FunctionType.DECREASING, result);
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
		String type = null;

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
		String type = "";

		fixture.setType(type);

		fail();
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
		String type = FunctionType.INCREASING;

		fixture.setType(type);

		assertEquals(type, fixture.getType());
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
		String type = FunctionType.DECREASING;

		fixture.setType(type);

		assertEquals(type, fixture.getType());
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
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(AbstractLinearDistributionTest.class);
	}
}