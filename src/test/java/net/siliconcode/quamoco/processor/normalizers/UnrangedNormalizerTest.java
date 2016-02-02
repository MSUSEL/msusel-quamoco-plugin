package net.siliconcode.quamoco.processor.normalizers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Set;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.node.Finding;
import net.siliconcode.quamoco.model.qm.NormalizationRange;

/**
 * The class <code>UnrangedNormalizerTest</code> contains tests for the class
 * <code>{@link UnrangedNormalizer}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:34 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class UnrangedNormalizerTest {

    /**
     * Run the UnrangedNormalizer(Edge,String,NormalizationRange) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:34 PM
     */
    @Test
    public void testUnrangedNormalizer_1() throws Exception
    {
        Edge owner = EasyMock.createMock(Edge.class);
        String normMetric = "LOC";
        NormalizationRange range = NormalizationRange.CLASS;
        // add mock object expectations here

        EasyMock.replay(owner);

        UnrangedNormalizer result = new UnrangedNormalizer(owner, normMetric, range);

        // add additional test code here
        EasyMock.verify(owner);
        assertNotNull(result);
        assertEquals("LOC", result.getMetric());
        assertEquals(NormalizationRange.CLASS, result.getNormalizationRange());
    }

    /**
     * Run the double normalize(double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:34 PM
     */
    @Test
    public void testNormalize_1() throws Exception
    {
        UnrangedNormalizer fixture = new UnrangedNormalizer(EasyMock.createNiceMock(Edge.class), "LOC",
                NormalizationRange.CLASS);
        double value = 1.0;

        double result = fixture.normalize(value);

        assertEquals(0.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Run the double normalize(Set<Finding>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:34 PM
     */
    @Test
    public void testNormalize_2() throws Exception
    {
        UnrangedNormalizer fixture = new UnrangedNormalizer(EasyMock.createNiceMock(Edge.class), "",
                NormalizationRange.CLASS);
        Set<Finding> findings = EasyMock.createMock(Set.class);
        // add mock object expectations here

        EasyMock.replay(findings);

        double result = fixture.normalize(findings);

        // add additional test code here
        EasyMock.verify(findings);
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.quamoco.processor.normalizers.UnrangedNormalizer.normalize(UnrangedNormalizer.java:69)
        assertEquals(0.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Run the double normalize(Set<Finding>) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:34 PM
     */
    @Test
    public void testNormalize_3() throws Exception
    {
        UnrangedNormalizer fixture = new UnrangedNormalizer(EasyMock.createNiceMock(Edge.class), "",
                NormalizationRange.CLASS);
        Set<Finding> findings = EasyMock.createMock(Set.class);
        // add mock object expectations here

        EasyMock.replay(findings);

        double result = fixture.normalize(findings);

        // add additional test code here
        EasyMock.verify(findings);
        // An unexpected exception was thrown in user code while executing this
        // test:
        // java.lang.NullPointerException
        // at
        // net.siliconcode.quamoco.processor.normalizers.UnrangedNormalizer.normalize(UnrangedNormalizer.java:69)
        assertEquals(0.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 1/26/16 6:34 PM
     */
    @Before
    public void setUp() throws Exception
    {
        // add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 1/26/16 6:34 PM
     */
    @After
    public void tearDown() throws Exception
    {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args
     *            the command line arguments
     * @generatedBy CodePro at 1/26/16 6:34 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(UnrangedNormalizerTest.class);
    }
}