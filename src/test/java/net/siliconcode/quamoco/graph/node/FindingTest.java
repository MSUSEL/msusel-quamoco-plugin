package net.siliconcode.quamoco.graph.node;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Maps;

import net.siliconcode.quamoco.codetree.CodeNode;
import net.siliconcode.quamoco.codetree.CodeNodeType;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.MetricsContext;

/**
 * The class <code>FindingTest</code> contains tests for the class
 * <code>{@link Finding}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class FindingTest {

    /**
     * Run the Finding(CodeNode,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testFinding_1() throws Exception
    {
        CodeNode location = new FileNode("/some/path");
        String issueKey = "issueKey";
        String issueName = "issueName";

        Finding result = new Finding(location, issueKey, issueName);

        // add additional test code here
        assertNotNull(result);
        assertEquals("issueName", result.getIssueName());
        assertEquals("issueKey", result.getIssueKey());
    }

    /**
     * Run the Finding(CodeNode,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testFinding_2() throws Exception
    {
        CodeNode location = new FileNode("/some/path");
        String issueKey = "";
        String issueName = "issueName";

        try
        {
            new Finding(location, issueKey, issueName);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the Finding(CodeNode,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testFinding_3() throws Exception
    {
        CodeNode location = new FileNode("/some/path");
        String issueKey = "issueKey";
        String issueName = "";

        try
        {
            new Finding(location, issueKey, issueName);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the Finding(CodeNode,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testFinding_4() throws Exception
    {
        CodeNode location = new FileNode("/some/path");
        String issueKey = null;
        String issueName = "issueName";

        try
        {
            new Finding(location, issueKey, issueName);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the Finding(CodeNode,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testFinding_5() throws Exception
    {
        CodeNode location = new FileNode("/some/path");
        String issueKey = "issueKey";
        String issueName = null;

        try
        {
            new Finding(location, issueKey, issueName);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the Finding(CodeNode,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testFinding_6() throws Exception
    {
        CodeNode location = null;
        String issueKey = "issueKey";
        String issueName = "issueName";

        try
        {
            new Finding(location, issueKey, issueName);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_1() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        String level = null;
        String metric = "";
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_2() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        String level = "";
        String metric = "";
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_3() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        String level = "";
        String metric = null;
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_4() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        String level = CodeNodeType.FIELD;
        String metric = "";
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_5() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        String level = "";
        String metric = "LOC";
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_6() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        String level = CodeNodeType.FIELD;
        String metric = "LOC";
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertTrue(result);
    }

    /**
     * Run the void addExtent(String,String,double) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddExtent_7() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        String level = null;
        String metric = null;
        double value = 1.0;

        boolean result = fixture.addExtent(level, metric, value);

        // add additional test code here
        assertFalse(result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        Object obj = new Finding(new FileNode("/some/path"), "issueKey", "issueName");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testEquals_2() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        Object obj = null;

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testEquals_3() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testEquals_4() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        Object obj = new Finding(new FileNode("/some/path"), "otherKey", "issueName");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testEquals_5() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        Object obj = new Finding(new FileNode("/some/path"), "issueKey", "otherName");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testEquals_6() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        Object obj = new Finding(new FileNode("/other/path"), "issueKey", "issueName");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the double getExtent(String,NormalizationRange) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetExtent_1() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        String metric = "LOC";
        NormalizationRange range = NormalizationRange.FILE;

        fixture.addExtent(CodeNodeType.FILE, metric, 1234.0);
        double result = fixture.getExtent(metric, range);

        assertEquals(1234.0, result, 0.1);
    }

    /**
     * Run the double getExtent(String,NormalizationRange) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetExtent_2() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        String metric = "LOC";
        NormalizationRange range = NormalizationRange.FILE;

        MetricsContext context = MetricsContext.getInstance();
        Map<String, Map<String, Double>> metrics = Maps.newHashMap();
        Map<String, Double> fileMetric = Maps.newHashMap();
        fileMetric.put("LOC", 1234.0);
        metrics.put("/some/path", fileMetric);
        context.setMetrics(null, metrics, null, null);

        double result = fixture.getExtent(metric, range);

        assertEquals(1234.0, result, 0.1);
    }

    /**
     * Run the double getExtent(String,NormalizationRange) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetExtent_3() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        String metric = "NOM";
        NormalizationRange range = NormalizationRange.FILE;

        MetricsContext context = MetricsContext.getInstance();
        Map<String, Map<String, Double>> metrics = Maps.newHashMap();
        Map<String, Double> fileMetric = Maps.newHashMap();
        fileMetric.put("LOC", 1234.0);
        metrics.put("/some/path", fileMetric);
        context.setMetrics(null, metrics, null, null);

        fixture.addExtent(CodeNodeType.FILE, metric, 15.0);
        double result = fixture.getExtent("LOC", range);

        assertEquals(1234.0, result, 0.1);
    }

    /**
     * Run the String getIssueKey() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetIssueKey_1() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");

        String result = fixture.getIssueKey();

        // add additional test code here
        assertEquals("issueKey", result);
    }

    /**
     * Run the String getIssueName() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetIssueName_1() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");

        String result = fixture.getIssueName();

        // add additional test code here
        assertEquals("issueName", result);
    }

    /**
     * Run the CodeNode getLocation() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetLocation_1() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");

        CodeNode result = fixture.getLocation();

        // add additional test code here
        assertNotNull(result);
        assertEquals("/some/path", result.getQIdentifier());
        assertEquals(1, result.getEnd());
        assertEquals(1, result.getStart());
        assertEquals(null, result.getOwner());
        assertEquals("FILE", result.getType());
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testHashCode_1() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(1191012737, result);
    }

    /**
     * Run the void setIssueKey(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testSetIssueKey_1() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        String issueKey = "";

        fixture.setIssueKey(issueKey);

        // add additional test code here
        assertEquals("issueKey", fixture.getIssueKey());

        fixture.setIssueKey(null);
        assertEquals("issueKey", fixture.getIssueKey());

        fixture.setIssueKey("otherKey");
        assertEquals("otherKey", fixture.getIssueKey());
    }

    /**
     * Run the void setIssueName(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testSetIssueName_1() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        String issueName = "";

        fixture.setIssueName(issueName);

        assertEquals("issueName", fixture.getIssueName());

        fixture.setIssueName(null);
        assertEquals("issueName", fixture.getIssueName());

        issueName = "otherName";
        fixture.setIssueName(issueName);

        assertEquals(issueName, fixture.getIssueName());
    }

    /**
     * Run the void setLocation(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testSetLocation_1() throws Exception
    {
        Finding fixture = new Finding(new FileNode("/some/path"), "issueKey", "issueName");
        CodeNode location = new FileNode("/some/other/path");

        fixture.setLocation(location);

        // add additional test code here
        assertEquals(location, fixture.getLocation());

        fixture.setLocation(null);
        assertNotNull(fixture.getLocation());
        assertEquals(location, fixture.getLocation());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 1/26/16 6:38 PM
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
     * @generatedBy CodePro at 1/26/16 6:38 PM
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
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(FindingTest.class);
    }
}