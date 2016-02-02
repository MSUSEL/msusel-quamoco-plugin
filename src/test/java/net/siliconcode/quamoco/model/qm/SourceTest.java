package net.siliconcode.quamoco.model.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>SourceTest</code> contains tests for the class
 * <code>{@link Source}</code>.
 *
 * @generatedBy CodePro at 6/6/15 1:35 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class SourceTest {

    /**
     * Run the Source(String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSource_1() throws Exception
    {
        String name = "fixture";
        String description = "";
        String id = "fixture";

        Source result = new Source(name, description, id);

        // add additional test code here
        assertNotNull(result);
        assertTrue(result.getAnnotations().isEmpty());
        assertEquals("", result.getDescription());
        assertEquals("fixture", result.getName());
        assertEquals("fixture", result.getId());
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        Source fixture = new Source("", "", "");
        fixture.addAnnotation(new Annotation("", "", ""));
        Source obj = new Source("", "", "");
        obj.addAnnotation(new Annotation("", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_2() throws Exception
    {
        Source fixture = new Source("", "", "");
        fixture.addAnnotation(new Annotation("", "", ""));
        Object obj = null;

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_3() throws Exception
    {
        Source fixture = new Source("", "", "");
        fixture.addAnnotation(new Annotation("", "", ""));
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_4() throws Exception
    {
        Source fixture = new Source("", "", "");
        fixture.addAnnotation(new Annotation("", "", ""));
        Source obj = new Source("", "", "");
        obj.addAnnotation(new Annotation("", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_5() throws Exception
    {
        Source fixture = new Source("", "", "");
        fixture.addAnnotation(new Annotation("", "", ""));
        Source obj = new Source("", "", "");
        obj.addAnnotation(new Annotation("", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_6() throws Exception
    {
        Source fixture = new Source("", "", "");
        fixture.addAnnotation(new Annotation("", "", ""));
        Source obj = new Source("", "", "");
        obj.addAnnotation(new Annotation("", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_7() throws Exception
    {
        Source fixture = new Source("", "", "");
        fixture.addAnnotation(new Annotation("", "", ""));
        Source obj = new Source("", "", "");
        obj.addAnnotation(new Annotation("", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_8() throws Exception
    {
        Source fixture = new Source((String) null, "", "");
        fixture.addAnnotation(new Annotation("", "", ""));
        Source obj = new Source((String) null, "", "");
        obj.addAnnotation(new Annotation("", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the Annotation getAnnotation() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetAnnotation_1() throws Exception
    {
        Source fixture = new Source("", "", "");
        
        assertTrue(fixture.getAnnotations().isEmpty());
        Annotation ann = new Annotation("", "", "");
        fixture.addAnnotation(ann);

        assertEquals(1, fixture.getAnnotations().size());
        Annotation result = fixture.getAnnotations().get(0);

        // add additional test code here
        assertNotNull(result);
        assertEquals(ann, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testHashCode_1() throws Exception
    {
        Source fixture = new Source("", "", "");
        fixture.addAnnotation((Annotation) null);

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(961, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testHashCode_2() throws Exception
    {
        Source fixture = new Source((String) null, (String) null, "");
        fixture.addAnnotation(new Annotation("", "", ""));

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(961, result);
    }

    /**
     * Run the void setAnnotation(Annotation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testAddAnnotation_1() throws Exception
    {
        Source fixture = new Source("", "", "");

        assertTrue(fixture.getAnnotations().isEmpty());
        Annotation annotation = new Annotation("", "", "");

        fixture.addAnnotation(annotation);

        // add additional test code here
        assertFalse(fixture.getAnnotations().isEmpty());
        assertEquals(1, fixture.getAnnotations().size());
        assertTrue(fixture.getAnnotations().contains(annotation));
    }

    @Test
    public void testAddAnnotation_2() throws Exception
    {
        Source fixture = new Source("", "", "");

        assertTrue(fixture.getAnnotations().isEmpty());
        Annotation annotation = null;

        fixture.addAnnotation(annotation);

        // add additional test code here
        assertTrue(fixture.getAnnotations().isEmpty());
        assertEquals(0, fixture.getAnnotations().size());
        assertFalse(fixture.getAnnotations().contains(annotation));
    }

    @Test
    public void testAddAnnotation_3() throws Exception
    {
        Source fixture = new Source("", "", "");

        assertTrue(fixture.getAnnotations().isEmpty());
        Annotation annotation = new Annotation("", "", "");

        fixture.addAnnotation(annotation);

        // add additional test code here
        assertFalse(fixture.getAnnotations().isEmpty());

        fixture.addAnnotation(new Annotation("", "", ""));
        assertEquals(1, fixture.getAnnotations().size());
        assertTrue(fixture.getAnnotations().contains(annotation));
    }

    public void testAddAnnotation_4() throws Exception
    {
        Source fixture = new Source("", "", "");

        assertTrue(fixture.getAnnotations().isEmpty());
        Annotation annotation = new Annotation("", "", "");

        fixture.addAnnotation(annotation);

        // add additional test code here
        assertFalse(fixture.getAnnotations().isEmpty());

        fixture.addAnnotation(new Annotation("Hello", "World", "Test"));
        assertEquals(2, fixture.getAnnotations().size());
        assertTrue(fixture.getAnnotations().contains(annotation));
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 6/6/15 1:35 PM
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
     * @generatedBy CodePro at 6/6/15 1:35 PM
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
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(SourceTest.class);
    }
}