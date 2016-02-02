package net.siliconcode.quamoco.model.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>ToolTest</code> contains tests for the class
 * <code>{@link Tool}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:26 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class ToolTest {

    private Tool fixture;

    /**
     * Run the Tool(String,String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTool_1() throws Exception
    {
        String name = "";
        String description = "";
        String originatesFrom = "href";
        String id = "";

        try
        {
            new Tool(name, description, new OriginatesFrom(originatesFrom), id);
            fail();
        }
        catch (IllegalArgumentException e)
        {
        }
    }

    /**
     * Run the Tool(String,String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTool_2() throws Exception
    {
        String name = null;
        String description = "";
        String originatesFrom = "href";
        String id = "id";

        try
        {
            new Tool(name, description, new OriginatesFrom(originatesFrom), id);
            fail();
        }
        catch (IllegalArgumentException e)
        {
        }
    }

    /**
     * Run the Tool(String,String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTool_3() throws Exception
    {
        String name = "name";
        String description = "";
        String originatesFrom = "href";
        String id = null;

        try
        {
            new Tool(name, description, new OriginatesFrom(originatesFrom), id);
            fail();
        }
        catch (IllegalArgumentException e)
        {
        }
    }

    /**
     * Run the Tool(String,String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTool_4() throws Exception
    {
        String name = "name";
        String description = null;
        String originatesFrom = "href";
        String id = "id";

        try
        {
            new Tool(name, description, new OriginatesFrom(originatesFrom), id);
            fail();
        }
        catch (IllegalArgumentException e)
        {
        }
    }

    /**
     * Run the Tool(String,String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTool_5() throws Exception
    {
        String name = "name";
        String description = null;
        String originatesFrom = "href";
        String id = null;

        try
        {
            new Tool(name, description, new OriginatesFrom(originatesFrom), id);
            fail();
        }
        catch (IllegalArgumentException e)
        {
        }
    }

    /**
     * Run the Tool(String,String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTool_6() throws Exception
    {
        String name = null;
        String description = null;
        String originatesFrom = "href";
        String id = null;

        try
        {
            new Tool(name, description, new OriginatesFrom(originatesFrom), id);
            fail();
        }
        catch (IllegalArgumentException e)
        {
        }
    }

    /**
     * Run the Tool(String,String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testTool_7() throws Exception
    {
        String name = "name";
        String description = "";
        String originatesFrom = "href";
        String id = "id";

        Tool result = new Tool(name, description, new OriginatesFrom(originatesFrom), id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("href", result.getOriginatesFrom().getHREF());
        assertTrue(result.getAnnotations().isEmpty());
        assertEquals("", result.getDescription());
        assertEquals("name", result.getName());
        assertEquals("id", result.getId());
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
        fixture.addAnnotation(new Annotation("key", "value", "id"));
        Tool obj = new Tool("name", "", new OriginatesFrom("href"), "id");
        obj.addAnnotation(new Annotation("key", "value", "id"));

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
        fixture.addAnnotation(new Annotation("key", "value", "id"));
        Object obj = null;

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
        fixture.addAnnotation(new Annotation("key", "value", "id"));
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
        fixture.addAnnotation(new Annotation("key", "value", "id"));
        Tool obj = new Tool("name", "", new OriginatesFrom("href"), "id");
        obj.addAnnotation(new Annotation("key", "value", "id"));

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
    public void testEquals_5() throws Exception
    {
        fixture.addAnnotation(new Annotation("key", "value", "id"));
        Tool obj = new Tool("name", "", new OriginatesFrom("href"), "id");
        obj.addAnnotation(new Annotation("key", "value", "id"));

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
    public void testEquals_6() throws Exception
    {
        fixture.addAnnotation(new Annotation("key", "value", "id"));
        Tool obj = new Tool("name", "", new OriginatesFrom("href"), "id");
        obj.addAnnotation(new Annotation("key", "value", "id"));

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
    public void testEquals_7() throws Exception
    {
        fixture.addAnnotation(new Annotation("key", "value", "id"));
        Tool obj = new Tool("name", "", new OriginatesFrom("href"), "id");
        obj.addAnnotation(new Annotation("key", "value", "id"));

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
    public void testEquals_8() throws Exception
    {
        fixture.addAnnotation(new Annotation("key", "value", "id"));
        Tool obj = new Tool("name", "", new OriginatesFrom("href"), "id");
        obj.addAnnotation(new Annotation("key", "value", "id"));

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
    public void testEquals_9() throws Exception
    {
        fixture.addAnnotation(new Annotation("key", "value", "id"));
        Tool obj = new Tool("name", "", new OriginatesFrom("href"), "id");
        obj.addAnnotation(new Annotation("key", "value", "id"));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
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
        assertTrue(fixture.getAnnotations().isEmpty());
        Annotation ann = new Annotation("key", "value", "id");
        fixture.addAnnotation(new Annotation("key", "value", "id"));

        assertEquals(1, fixture.getAnnotations().size());
        Annotation result = fixture.getAnnotations().get(0);

        // add additional test code here
        assertNotNull(result);
        assertEquals(ann, result);
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
        assertNotNull(fixture.getOriginatesFrom());

        OriginatesFrom originatesFrom = new OriginatesFrom("href2");
        fixture.setOriginatesFrom(originatesFrom);
        assertEquals(originatesFrom, fixture.getOriginatesFrom());
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testHashCode_1() throws Exception
    {
        int result = fixture.hashCode();

        assertEquals(107825790, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testHashCode_2() throws Exception
    {
        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(107825790, result);
    }

    /**
     * Run the void addAnnotation(Annotation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testAddAnnotation_1() throws Exception
    {
        Annotation annotation = new Annotation("key", "value", "id");

        assertEquals(0, fixture.getAnnotations().size());
        fixture.addAnnotation(annotation);

        assertEquals(1, fixture.getAnnotations().size());
    }

    @Test
    public void testAddAnnotation_2() throws Exception
    {
        Annotation annotation = null;

        assertTrue(fixture.getAnnotations().isEmpty());
        fixture.addAnnotation(annotation);

        assertTrue(fixture.getAnnotations().isEmpty());
    }

    @Test
    public void testAddAnnotation_3() throws Exception
    {
        Annotation annotation = new Annotation("key", "value", "id");

        assertTrue(fixture.getAnnotations().isEmpty());
        fixture.addAnnotation(annotation);

        assertEquals(1, fixture.getAnnotations().size());

        fixture.addAnnotation(new Annotation("key", "value", "id"));

        assertEquals(1, fixture.getAnnotations().size());
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
        assertNotNull(fixture.getOriginatesFrom());
        OriginatesFrom originatesFrom = new OriginatesFrom("href2");

        fixture.setOriginatesFrom(originatesFrom);

        assertEquals(originatesFrom, fixture.getOriginatesFrom());
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
        fixture = new Tool("name", "", new OriginatesFrom("href"), "id");
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
        new org.junit.runner.JUnitCore().run(ToolTest.class);
    }
}