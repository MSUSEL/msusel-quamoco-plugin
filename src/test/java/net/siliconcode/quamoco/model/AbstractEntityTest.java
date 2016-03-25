package net.siliconcode.quamoco.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.model.qmr.AbstractResult;

/**
 * The class <code>AbstractEntityTest</code> contains tests for the class
 * <code>{@link AbstractEntity}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:41 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class AbstractEntityTest {
	/**
	 * Run the String getId() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testGetId_1() throws Exception {
		final AbstractResult fixture = new AbstractResult();
		fixture.id = "";

		final String result = fixture.getId();

		// TODO: add additional test code here
		Assert.assertEquals("", result);
	}

	/**
	 * Run the void setId(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Test
	public void testSetId_1() throws Exception {
		final AbstractResult fixture = new AbstractResult();
		fixture.id = "";
		final String id = "";

		fixture.setId(id);

		// TODO: add additional test code here
		Assert.assertEquals(id, fixture.getId());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@Before
	public void setUp() throws Exception {
		// TODO: add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *             if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	@After
	public void tearDown() throws Exception {
		// TODO: add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args
	 *            the command line arguments
	 *
	 * @generatedBy CodePro at 5/30/15 3:41 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(AbstractEntityTest.class);
	}
}