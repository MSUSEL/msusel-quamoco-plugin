package net.siliconcode.quamoco.aggregator.qm;

import org.junit.*;

import net.siliconcode.quamoco.model.qm.Annotation;
import net.siliconcode.quamoco.model.qm.MeasurementMethod;

import static org.junit.Assert.*;

/**
 * The class <code>MeasurementMethodTest</code> contains tests for the class <code>{@link MeasurementMethod}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:26 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class MeasurementMethodTest {
    /**
     * Run the MeasurementMethod(String,String,String,String,String,String,String,String) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testMeasurementMethod_1()
        throws Exception
    {
        String name = "";
        String description = "";
        String determines = "";
        String tool = "";
        String metric = "";
        String originatesFrom = "";
        String type = "";
        String id = "";

        MeasurementMethod result = new MeasurementMethod(name, description, determines, tool, metric, originatesFrom, type, id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getDetermines());
        assertEquals("", result.getTool());
        assertEquals("", result.getOriginatesFrom());
        assertEquals("", result.getMetric());
        assertEquals(null, result.getAnnotation());
        assertEquals("", result.getType());
        assertEquals("", result.getDescription());
        assertEquals("", result.getName());
        assertEquals("", result.getId());
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_1()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        MeasurementMethod obj = new MeasurementMethod("", "", "", "", "", "", "", "");
        obj.setAnnotation(new Annotation("", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_2()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        MeasurementMethod obj = new MeasurementMethod("", "", "", "", "", "", "", "");
        obj.setAnnotation(new Annotation("", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_3()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        MeasurementMethod obj = new MeasurementMethod("", "", "", "", "", "", "", "");
        obj.setAnnotation(new Annotation("", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_4()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        MeasurementMethod obj = new MeasurementMethod("", "", "", "", "", "", "", "");
        obj.setAnnotation(new Annotation("", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_5()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        MeasurementMethod obj = new MeasurementMethod("", "", "", "", "", "", "", "");
        obj.setAnnotation(new Annotation("", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_6()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        MeasurementMethod obj = new MeasurementMethod("", "", "", "", "", "", "", "");
        obj.setAnnotation(new Annotation("", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_7()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        MeasurementMethod obj = new MeasurementMethod("", "", "", "", "", "", "", "");
        obj.setAnnotation(new Annotation("", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_8()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        MeasurementMethod obj = new MeasurementMethod("", "", "", "", "", "", "", "");
        obj.setAnnotation(new Annotation("", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEquals_9()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        MeasurementMethod obj = new MeasurementMethod("", "", "", "", "", "", "", "");
        obj.setAnnotation(new Annotation("", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the Annotation getAnnotation() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetAnnotation_1()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));

        Annotation result = fixture.getAnnotation();

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getValue());
        assertEquals("", result.getKey());
        assertEquals("", result.getId());
    }

    /**
     * Run the String getDetermines() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetDetermines_1()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));

        String result = fixture.getDetermines();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getMetric() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetMetric_1()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));

        String result = fixture.getMetric();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getOriginatesFrom() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetOriginatesFrom_1()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));

        String result = fixture.getOriginatesFrom();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTool() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetTool_1()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));

        String result = fixture.getTool();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getType() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetType_1()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));

        String result = fixture.getType();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testHashCode_1()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", (String) null, (String) null, "", (String) null, "", "", "");
        fixture.setAnnotation((Annotation) null);

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(-1807454463, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testHashCode_2()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod((String) null, "", "", (String) null, "", (String) null, (String) null, "");
        fixture.setAnnotation(new Annotation("", "", ""));

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(-2003967968, result);
    }

    /**
     * Run the void setAnnotation(Annotation) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetAnnotation_1()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        Annotation annotation = new Annotation("", "", "");

        fixture.setAnnotation(annotation);

        // add additional test code here
    }

    /**
     * Run the void setDetermines(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetDetermines_1()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        String determines = "";

        fixture.setDetermines(determines);

        // add additional test code here
    }

    /**
     * Run the void setMetric(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetMetric_1()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        String metric = "";

        fixture.setMetric(metric);

        // add additional test code here
    }

    /**
     * Run the void setOriginatesFrom(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetOriginatesFrom_1()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        String originatesFrom = "";

        fixture.setOriginatesFrom(originatesFrom);

        // add additional test code here
    }

    /**
     * Run the void setTool(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetTool_1()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        String tool = "";

        fixture.setTool(tool);

        // add additional test code here
    }

    /**
     * Run the void setType(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetType_1()
        throws Exception
    {
        MeasurementMethod fixture = new MeasurementMethod("", "", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        String type = "";

        fixture.setType(type);

        // add additional test code here
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
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
     * @generatedBy CodePro at 5/30/15 3:26 PM
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
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(MeasurementMethodTest.class);
    }
}