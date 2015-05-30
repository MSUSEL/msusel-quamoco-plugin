package net.siliconcode.quamoco.aggregator.qm;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ToolTest</code> contains tests for the class <code>{@link Tool}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:26 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class ToolTest {
    /**
     * Run the Tool(String,String,String,String) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTool_1()
        throws Exception
    {
        String name = "";
        String description = "";
        String originatesFrom = "";
        String id = "";

        Tool result = new Tool(name, description, originatesFrom, id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getOriginatesFrom());
        assertEquals(null, result.getAnnotation());
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
        Tool fixture = new Tool("", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        Tool obj = new Tool("", "", "", "");
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
        Tool fixture = new Tool("", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        Object obj = null;

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
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
        Tool fixture = new Tool("", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
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
        Tool fixture = new Tool("", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        Tool obj = new Tool("", "", "", "");
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
        Tool fixture = new Tool("", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        Tool obj = new Tool("", "", "", "");
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
        Tool fixture = new Tool("", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        Tool obj = new Tool("", "", "", "");
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
        Tool fixture = new Tool("", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        Tool obj = new Tool("", "", "", "");
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
        Tool fixture = new Tool("", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        Tool obj = new Tool("", "", "", "");
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
        Tool fixture = new Tool("", "", (String) null, "");
        fixture.setAnnotation(new Annotation("", "", ""));
        Tool obj = new Tool("", "", (String) null, "");
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
        Tool fixture = new Tool("", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));

        Annotation result = fixture.getAnnotation();

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getValue());
        assertEquals("", result.getKey());
        assertEquals("", result.getId());
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
        Tool fixture = new Tool("", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));

        String result = fixture.getOriginatesFrom();

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
        Tool fixture = new Tool("", (String) null, "", "");
        fixture.setAnnotation((Annotation) null);

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(923521, result);
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
        Tool fixture = new Tool((String) null, "", (String) null, "");
        fixture.setAnnotation(new Annotation("", "", ""));

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(29552672, result);
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
        Tool fixture = new Tool("", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        Annotation annotation = new Annotation("", "", "");

        fixture.setAnnotation(annotation);

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
        Tool fixture = new Tool("", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        String originatesFrom = "";

        fixture.setOriginatesFrom(originatesFrom);

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
        new org.junit.runner.JUnitCore().run(ToolTest.class);
    }
}