package net.siliconcode.quamoco.processor.normalizers;

import java.util.Set;
import org.easymock.EasyMock;
import org.junit.*;
import net.siliconcode.quamoco.graph.node.Finding;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.graph.edge.Edge;
import static org.junit.Assert.*;

/**
 * The class <code>RangedNormalizerTest</code> contains tests for the class <code>{@link RangedNormalizer}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class RangedNormalizerTest {
    /**
     * Run the RangedNormalizer(Edge,String,NormalizationRange) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testRangedNormalizer_1()
        throws Exception
    {
        Edge owner = EasyMock.createMock(Edge.class);
        String normMetric = "";
        NormalizationRange range = NormalizationRange.CLASS;
        // add mock object expectations here

        EasyMock.replay(owner);

        RangedNormalizer result = new RangedNormalizer(owner, normMetric, range);

        // add additional test code here
        EasyMock.verify(owner);
        assertNotNull(result);
        assertEquals("", result.getMetric());
        fail("unverified");
    }

    /**
     * Run the double normalize(double) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testNormalize_1()
        throws Exception
    {
        RangedNormalizer fixture = new RangedNormalizer(EasyMock.createNiceMock(Edge.class), "", NormalizationRange.CLASS);
        double value = 1.0;

        double result = fixture.normalize(value);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.processor.Extent.findExtent(Extent.java:215)
        //       at net.siliconcode.quamoco.processor.normalizers.RangedNormalizer.normalize(RangedNormalizer.java:57)
        assertEquals(0.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Run the double normalize(Set<Finding>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testNormalize_2()
        throws Exception
    {
        RangedNormalizer fixture = new RangedNormalizer(EasyMock.createNiceMock(Edge.class), "", NormalizationRange.CLASS);
        Set<Finding> findings = EasyMock.createMock(Set.class);
        // add mock object expectations here

        EasyMock.replay(findings);

        double result = fixture.normalize(findings);

        // add additional test code here
        EasyMock.verify(findings);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.processor.normalizers.RangedNormalizer.normalize(RangedNormalizer.java:69)
        assertEquals(0.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Run the double normalize(Set<Finding>) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testNormalize_3()
        throws Exception
    {
        RangedNormalizer fixture = new RangedNormalizer(EasyMock.createNiceMock(Edge.class), "", NormalizationRange.CLASS);
        Set<Finding> findings = EasyMock.createMock(Set.class);
        // add mock object expectations here

        EasyMock.replay(findings);

        double result = fixture.normalize(findings);

        // add additional test code here
        EasyMock.verify(findings);
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at net.siliconcode.quamoco.processor.normalizers.RangedNormalizer.normalize(RangedNormalizer.java:69)
        assertEquals(0.0, result, 0.1);
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Before
    public void setUp()
        throws Exception
    {
        // add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @After
    public void tearDown()
        throws Exception
    {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(RangedNormalizerTest.class);
    }
}