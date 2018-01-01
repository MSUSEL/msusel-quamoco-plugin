/**
 * The MIT License (MIT)
 *
 * SparQLine Analytics Sonar Quamoco Plugin
 * Copyright (c) 2015-2017 Isaac Griffith, SparQLine Analytics, LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package edu.montana.gsoc.msusel.sonar.quamoco;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.measures.Metric;

import edu.montana.gsoc.msusel.sonar.quamoco.QuamocoMetrics;

/**
 * The class <code>QuamocoMetricsTest</code> contains tests for the class
 * <code>{@link QuamocoMetrics}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:44 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QuamocoMetricsTest {

	/**
	 * Run the QuamocoMetrics() constructor test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:44 PM
	 */
	@Test
	public void testQuamocoMetrics_1() throws Exception {

		final QuamocoMetrics result = new QuamocoMetrics();

		// TODO: add additional test code here
		Assert.assertNotNull(result);
	}

	/**
	 * Run the Metric getMetric(String) method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:44 PM
	 */
	@Test
	public void testGetMetric_1() throws Exception {
		final QuamocoMetrics fixture = new QuamocoMetrics();
		final List<Metric> results = fixture.loadMetrics();

		Assert.assertNotNull(results);
		Assert.assertFalse(results.isEmpty());
	}

	/**
	 * Run the List<Metric> getMetrics() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:44 PM
	 */
	@Test
	public void testGetMetrics_1() throws Exception {
		final QuamocoMetrics fixture = new QuamocoMetrics();

		final List<Metric> result = fixture.getMetrics();

		// TODO: add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(28, result.size());
	}

	/**
	 * Run the List<Metric> loadMetrics() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:44 PM
	 */
	@Test
	public void testLoadMetrics_1() throws Exception {
		final QuamocoMetrics fixture = new QuamocoMetrics();

		final List<Metric> result = fixture.loadMetrics();

		// TODO: add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(28, result.size());
	}

	/**
	 * Run the List<Metric> loadMetrics() method test.
	 *
	 * @throws Exception
	 * @generatedBy CodePro at 5/30/15 3:44 PM
	 */
	@Test
	public void testLoadMetrics_2() throws Exception {
		final QuamocoMetrics fixture = new QuamocoMetrics();

		final List<Metric> result = fixture.loadMetrics();

		// TODO: add additional test code here
		Assert.assertNotNull(result);
		Assert.assertEquals(28, result.size());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *             if the initialization fails for some reason
	 * @generatedBy CodePro at 5/30/15 3:44 PM
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
	 * @generatedBy CodePro at 5/30/15 3:44 PM
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
	 * @generatedBy CodePro at 5/30/15 3:44 PM
	 */
	public static void main(final String[] args) {
		new org.junit.runner.JUnitCore().run(QuamocoMetricsTest.class);
	}
}