package net.siliconcode.quamoco.model.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>MeasurementMethodTest</code> contains tests for the class
 * <code>{@link MeasurementMethod}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:26 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class MeasurementMethodTest {

    private MeasurementMethod fixture;

    /**
     * Run the
     * MeasurementMethod(String,String,String,String,String,String,String,
     * String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testMeasurementMethod_1() throws Exception
    {
        String name = "name";
        String description = "";
        Determines determines = new Determines("href");
        String tool = "tool";
        String metric = "metric";
        OriginatesFrom originatesFrom = new OriginatesFrom("href");
        String type = MeasurementMethodType.TOOL_INSTRUMENT;
        String id = "id";

        MeasurementMethod result = new MeasurementMethod(name, description, determines, tool, metric, originatesFrom,
                type, id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("href", result.getDetermines().getHREF());
        assertEquals(tool, result.getTool());
        assertEquals("href", result.getOriginatesFrom().getHREF());
        assertEquals(metric, result.getMetric());
        assertTrue(result.getAnnotations().isEmpty());
        assertEquals(type, result.getType());
        assertEquals(description, result.getDescription());
        assertEquals(name, result.getName());
        assertEquals(id, result.getId());
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        MeasurementMethod obj = new MeasurementMethod("name", "", new Determines("href"), "tool", "metric",
                new OriginatesFrom("href"), MeasurementMethodType.TOOL_INSTRUMENT, "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_2() throws Exception
    {
        MeasurementMethod obj = null;

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_3() throws Exception
    {
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_4() throws Exception
    {
        MeasurementMethod obj = new MeasurementMethod("name2", "", new Determines("href"), "tool", "metric",
                new OriginatesFrom("href"), MeasurementMethodType.TOOL_INSTRUMENT, "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_5() throws Exception
    {
        MeasurementMethod obj = new MeasurementMethod("name", null, new Determines("href"), "tool", "metric",
                new OriginatesFrom("href"), MeasurementMethodType.TOOL_INSTRUMENT, "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_6() throws Exception
    {
        MeasurementMethod obj = new MeasurementMethod("name", "desc", new Determines("href"), "tool", "metric",
                new OriginatesFrom("href"), MeasurementMethodType.TOOL_INSTRUMENT, "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_7() throws Exception
    {
        MeasurementMethod obj = new MeasurementMethod("name", "", null, "tool", "metric", new OriginatesFrom("href"),
                MeasurementMethodType.TOOL_INSTRUMENT, "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_8() throws Exception
    {
        MeasurementMethod obj = new MeasurementMethod("name", "", new Determines("det"), "tool", "metric",
                new OriginatesFrom("href"), MeasurementMethodType.TOOL_INSTRUMENT, "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_9() throws Exception
    {
        MeasurementMethod obj = new MeasurementMethod("name", "", new Determines("href"), null, "metric",
                new OriginatesFrom("href"), MeasurementMethodType.TOOL_INSTRUMENT, "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_10() throws Exception
    {
        MeasurementMethod obj = new MeasurementMethod("name", "", new Determines("href"), "", "metric",
                new OriginatesFrom("href"), MeasurementMethodType.TOOL_INSTRUMENT, "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_11() throws Exception
    {
        MeasurementMethod obj = new MeasurementMethod("name", "", new Determines("href"), "tool", null,
                new OriginatesFrom("href"), MeasurementMethodType.TOOL_INSTRUMENT, "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_12() throws Exception
    {
        MeasurementMethod obj = new MeasurementMethod("name", "", new Determines("href"), "tool", "",
                new OriginatesFrom("href"), MeasurementMethodType.TOOL_INSTRUMENT, "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_13() throws Exception
    {
        MeasurementMethod obj = new MeasurementMethod("name", "", new Determines("href"), "tool", "metric", null,
                MeasurementMethodType.TOOL_INSTRUMENT, "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_14() throws Exception
    {
        MeasurementMethod obj = new MeasurementMethod("name", "", new Determines("href"), "tool", "metric",
                new OriginatesFrom("origin"), MeasurementMethodType.TOOL_INSTRUMENT, "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_15() throws Exception
    {
        MeasurementMethod obj = new MeasurementMethod("name", "", new Determines("href"), "tool", "metric",
                new OriginatesFrom("href"), MeasurementMethodType.MANUAL_INSTRUMENT, "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_16() throws Exception
    {
        MeasurementMethod obj = new MeasurementMethod("name", "", new Determines("href"), "tool", "metric",
                new OriginatesFrom("href"), MeasurementMethodType.TOOL_INSTRUMENT, "other");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the Annotation getAnnotation() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetAnnotation_1() throws Exception
    {
        fixture.addAnnotation(new Annotation("", "", ""));

        List<Annotation> result = fixture.getAnnotations();

        // add additional test code here
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals(1, result.size());
    }

    /**
     * Run the String getDetermines() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetDetermines_1() throws Exception
    {
        String result = fixture.getDetermines().getHREF();

        // add additional test code here
        assertEquals("href", result);
    }

    /**
     * Run the String getMetric() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetMetric_1() throws Exception
    {
        String result = fixture.getMetric();

        // add additional test code here
        assertEquals("metric", result);
    }

    /**
     * Run the String getOriginatesFrom() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetOriginatesFrom_1() throws Exception
    {
        String result = fixture.getOriginatesFrom().getHREF();

        // add additional test code here
        assertEquals("href", result);
    }

    /**
     * Run the String getTool() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetTool_1() throws Exception
    {
        String result = fixture.getTool();

        // add additional test code here
        assertEquals("tool", result);
    }

    /**
     * Run the String getType() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetType_1() throws Exception
    {
        String result = fixture.getType();

        // add additional test code here
        assertEquals(MeasurementMethodType.TOOL_INSTRUMENT, result);
    }

    /**
     * Run the void setAnnotation(Annotation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testAddAnnotation_1() throws Exception
    {
        Annotation annotation = new Annotation("key", "value", "id");

        fixture.addAnnotation(annotation);

        // add additional test code here
        assertTrue(fixture.getAnnotations().contains(annotation));
        assertEquals(1, fixture.getAnnotations().size());

        fixture.addAnnotation(null);
        assertEquals(1, fixture.getAnnotations().size());

        fixture.addAnnotation(annotation);
        assertEquals(1, fixture.getAnnotations().size());
    }

    /**
     * Run the void setDetermines(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetDetermines_1() throws Exception
    {
        String determines = "determines";

        fixture.setDetermines(new Determines(determines));

        // add additional test code here
        assertEquals(determines, fixture.getDetermines().getHREF());
    }

    /**
     * Run the void setMetric(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetMetric_1() throws Exception
    {
        String metric = "metric2";

        fixture.setMetric(metric);

        // add additional test code here
        assertEquals(metric, fixture.getMetric());
    }

    /**
     * Run the void setOriginatesFrom(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetOriginatesFrom_1() throws Exception
    {
        String originatesFrom = "origin";

        fixture.setOriginatesFrom(new OriginatesFrom(originatesFrom));

        // add additional test code here
        assertEquals(originatesFrom, fixture.getOriginatesFrom().getHREF());
    }

    /**
     * Run the void setTool(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetTool_1() throws Exception
    {
        String tool = "tool";

        fixture.setTool(tool);

        // add additional test code here
        assertEquals(tool, fixture.getTool());

        fixture.setTool(null);
        assertNull(fixture.getTool());

        fixture.setTool("");
        assertEquals("", fixture.getTool());
    }

    /**
     * Run the void setType(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetType_1() throws Exception
    {
        String type = MeasurementMethodType.TOOL_INSTRUMENT;

        fixture.setType(type);

        // add additional test code here
        assertEquals(type, fixture.getType());

        fixture.setType(null);
        assertNull(fixture.getType());

        fixture.setType("");
        assertEquals("", fixture.getType());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Before
    public void setUp() throws Exception
    {
        fixture = new MeasurementMethod("name", "", new Determines("href"), "tool", "metric",
                new OriginatesFrom("href"), MeasurementMethodType.TOOL_INSTRUMENT, "id");
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 5/30/15 3:26 PM
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
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(MeasurementMethodTest.class);
    }
}