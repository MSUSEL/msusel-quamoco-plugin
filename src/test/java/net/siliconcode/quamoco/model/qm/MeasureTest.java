package net.siliconcode.quamoco.model.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.siliconcode.quamoco.graph.node.MeasureType;

/**
 * The class <code>MeasureTest</code> contains tests for the class
 * <code>{@link Measure}</code>.
 *
 * @generatedBy CodePro at 6/6/15 1:35 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class MeasureTest {

    private Measure fixture;

    /**
     * Run the
     * Measure(String,String,String,String,String,String,String,String,String)
     * constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testMeasure_1() throws Exception
    {
        String name = "name";
        String description = "";
        String title = "title";
        Characterizes characterises = new Characterizes("href");
        String type = MeasureType.FINDINGS;
        String taggedBy = "tag";
        OriginatesFrom originatesFrom = new OriginatesFrom("href");
        Refines refines = new Refines("href");
        String id = "id";

        Measure result = new Measure(name, description, title, characterises, type, taggedBy, originatesFrom, refines,
                id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("tag", result.getTaggedBy());
        assertEquals("href", result.getCharacterizes().getHREF());
        assertEquals("href", result.getOriginatesFrom().getHREF());
        assertEquals("href", result.getRefines().getHREF());
        assertEquals("title", result.getTitle());
        assertEquals(MeasureType.FINDINGS, result.getType());
        assertEquals("", result.getDescription());
        assertEquals("name", result.getName());
        assertEquals("id", result.getId());
    }

    /**
     * Run the void addAnnotation(Annotation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testAddAnnotation_1() throws Exception
    {
        Annotation ann = null;

        fixture.addAnnotation(ann);

        assertTrue(fixture.getAnnotations().isEmpty());
    }

    /**
     * Run the void addAnnotation(Annotation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testAddAnnotation_2() throws Exception
    {
        Annotation ann = new Annotation("key", "value", "id");

        fixture.addAnnotation(ann);

        assertEquals(1, fixture.getAnnotations().size());
    }

    /**
     * Run the void addAnnotation(Annotation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testAddAnnotation_3() throws Exception
    {
        Annotation ann = new Annotation("key", "value", "id");

        fixture.addAnnotation(ann);
        Annotation ann2 = new Annotation("key", "value", "id");

        fixture.addAnnotation(ann2);

        assertEquals(1, fixture.getAnnotations().size());
    }

    /**
     * Run the void addAnnotation(Annotation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetAnnotations_1() throws Exception
    {
        Annotation ann = new Annotation("other", "", "other");

        assertNotNull(fixture.getAnnotations());
    }

    /**
     * Run the void addAnnotation(Annotation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetAnnotations_2() throws Exception
    {
        Annotation ann = new Annotation("other", "", "other");

        assertNotNull(fixture.getAnnotations());
    }

    /**
     * Run the void addAnnotation(Annotation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetMeasures_1() throws Exception
    {
        fixture.addMeasure(new Measure("", "", "", null, "", "", null, null, "id"));

        assertNotNull(fixture.getMeasures());
        assertEquals(1, fixture.getMeasures().size());
    }

    /**
     * Run the void addAnnotation(Annotation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetMeasures_2() throws Exception
    {
        assertNotNull(fixture.getMeasures());
    }

    /**
     * Run the void addMeasure(Measure) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testAddMeasure_1() throws Exception
    {
        Measure measure = null;

        fixture.addMeasure(measure);

        assertTrue(fixture.getMeasures().isEmpty());
    }

    /**
     * Run the void addMeasure(Measure) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testAddMeasure_2() throws Exception
    {
        Measure measure = new Measure("", "", "", null, "", "", null, null, "id");

        fixture.addMeasure(measure);

        assertEquals(1, fixture.getMeasures().size());

        fixture.addMeasure(measure);
        assertEquals(1, fixture.getMeasures().size());
    }

    /**
     * Run the void addMeasure(Measure) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testAddMeasure_3() throws Exception
    {
        Measure measure = new Measure("", "", "", null, "", "", null, null, "id");

        fixture.addMeasure(measure);
        Measure measure2 = new Measure("other", "", "", null, "", "", null, null, "other");

        fixture.addMeasure(measure);
        fixture.addMeasure(measure2);

        assertEquals(2, fixture.getMeasures().size());
    }

    /**
     * Run the void addParent(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testAddParent_1() throws Exception
    {
        Parent parent = null;

        fixture.addParent(parent);

        assertTrue(fixture.getParents().isEmpty());
    }

    /**
     * Run the void addParent(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testAddParent_2() throws Exception
    {
        String parent = "href";

        fixture.addParent(new Parent(parent));

        assertEquals(1, fixture.getParents().size());
    }

    /**
     * Run the void addParent(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testAddParent_3() throws Exception
    {
        String parent = "parent";

        fixture.addParent(new Parent(parent));
        fixture.addParent(new Parent(parent));

        assertEquals(1, fixture.getParents().size());
    }

    /**
     * Run the void addParent(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testAddParent_4() throws Exception
    {
        String parent = "other";

        fixture.addParent(new Parent(parent));
        fixture.addParent(new Parent("parent"));

        assertEquals(2, fixture.getParents().size());
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
        Object obj = new Measure("name", "", "title", new Characterizes("href"), MeasureType.FINDINGS, "href",
                new OriginatesFrom("href"), new Refines("href"), "id");

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
        Object obj = new Measure("other", "", "title", new Characterizes("href"), MeasureType.FINDINGS, "href",
                new OriginatesFrom("href"), new Refines("href"), "id");

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
        Object obj = new Measure("name", "desc", "title", new Characterizes("href"), MeasureType.FINDINGS, "href",
                new OriginatesFrom("href"), new Refines("href"), "id");

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
        Object obj = new Measure("name", null, "title", new Characterizes("href"), MeasureType.FINDINGS, "href",
                new OriginatesFrom("href"), new Refines("href"), "id");

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
    public void testEquals_5() throws Exception
    {
        Object obj = new Measure("name", "", "title", null, MeasureType.FINDINGS, "href", new OriginatesFrom("href"),
                new Refines("href"), "id");

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
    public void testEquals_6() throws Exception
    {
        Object obj = new Measure("name", "", "title", new Characterizes("other"), MeasureType.FINDINGS, "href",
                new OriginatesFrom("href"), new Refines("href"), "id");

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
    public void testEquals_7() throws Exception
    {
        Object obj = new Measure("name", "", "title", new Characterizes("href"), MeasureType.NUMBER, "href",
                new OriginatesFrom("href"), new Refines("href"), "id");

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
    public void testEquals_8() throws Exception
    {
        Object obj = new Measure("name", "", "title", new Characterizes("href"), MeasureType.FINDINGS, "other",
                new OriginatesFrom("href"), new Refines("href"), "id");

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
    public void testEquals_9() throws Exception
    {
        Object obj = new Measure("name", "", "title", new Characterizes("href"), MeasureType.FINDINGS, null,
                new OriginatesFrom("href"), new Refines("href"), "id");

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
    public void testEquals_10() throws Exception
    {
        Object obj = new Measure("name", "", "title", new Characterizes("href"), MeasureType.FINDINGS, "href",
                new OriginatesFrom("other"), new Refines("href"), "id");

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
    public void testEquals_11() throws Exception
    {
        Object obj = new Measure("name", "", "title", new Characterizes("href"), MeasureType.FINDINGS, "href", null,
                new Refines("href"), "id");

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
    public void testEquals_12() throws Exception
    {
        Object obj = new Measure("name", "", "title", new Characterizes("href"), MeasureType.FINDINGS, "href",
                new OriginatesFrom("href"), new Refines("other"), "id");

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
    public void testEquals_13() throws Exception
    {
        Object obj = new Measure("name", "", "title", new Characterizes("href"), MeasureType.FINDINGS, "href",
                new OriginatesFrom("href"), null, "id");

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
    public void testEquals_14() throws Exception
    {
        Object obj = new Measure("name", "", "title", new Characterizes("href"), MeasureType.FINDINGS, "href",
                new OriginatesFrom("href"), new Refines("href"), "other");

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
    public void testEquals_15() throws Exception
    {
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
    public void testEquals_16() throws Exception
    {
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the String getCharacterises() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetCharacterises_1() throws Exception
    {
        String result = fixture.getCharacterizes().getHREF();

        // add additional test code here
        assertEquals("href", result);
    }

    /**
     * Run the String getOriginatesFrom() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetOriginatesFrom_1() throws Exception
    {
        String result = fixture.getOriginatesFrom().getHREF();

        // add additional test code here
        assertEquals("href", result);
    }

    /**
     * Run the Set<String> getParents() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetParents_1() throws Exception
    {
        Set<Parent> result = fixture.getParents();

        // add additional test code here
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    /**
     * Run the Set<String> getParents() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetParents_2() throws Exception
    {
        fixture.addParent(new Parent("parent"));
        Set<Parent> result = fixture.getParents();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the String getRefines() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetRefines_1() throws Exception
    {
        String result = fixture.getRefines().getHREF();

        // add additional test code here
        assertEquals("href", result);
    }

    /**
     * Run the String getTaggedBy() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetTaggedBy_1() throws Exception
    {
        String result = fixture.getTaggedBy();

        // add additional test code here
        assertEquals("href", result);
    }

    /**
     * Run the String getTitle() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetTitle_1() throws Exception
    {
        String result = fixture.getTitle();

        // add additional test code here
        assertEquals("title", result);
    }

    /**
     * Run the String getType() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetType_1() throws Exception
    {
        String result = fixture.getType();

        // add additional test code here
        assertEquals(MeasureType.FINDINGS, result);
    }

    /**
     * Run the void removeAnnotation(Annotation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testRemoveAnnotation_1() throws Exception
    {
        Annotation ann = null;

        fixture.removeAnnotation(ann);

        assertTrue(fixture.getAnnotations().isEmpty());
    }

    /**
     * Run the void removeAnnotation(Annotation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testRemoveAnnotation_2() throws Exception
    {
        Annotation ann = new Annotation("key", "value", "id");
        fixture.addAnnotation(ann);
        fixture.removeAnnotation(ann);

        assertTrue(fixture.getAnnotations().isEmpty());
    }

    /**
     * Run the void removeAnnotation(Annotation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testRemoveAnnotation_3() throws Exception
    {
        Annotation ann = new Annotation("key", "", "id");
        fixture.addAnnotation(ann);

        fixture.removeAnnotation(new Annotation("other", "", "other"));

        assertFalse(fixture.getAnnotations().isEmpty());
    }

    /**
     * Run the void removeMeasure(Measure) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testRemoveMeasure_1() throws Exception
    {
        fixture.addMeasure(new Measure("", "", "", null, "", "", null, null, "id"));

        Measure measure = null;

        assertEquals(1, fixture.getMeasures().size());
        fixture.removeMeasure(measure);

        assertFalse(fixture.getMeasures().isEmpty());
    }

    /**
     * Run the void removeMeasure(Measure) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testRemoveMeasure_2() throws Exception
    {
        Measure measure = new Measure("", "", "", null, "", "", null, null, "id");

        fixture.addMeasure(measure);
        assertEquals(1, fixture.getMeasures().size());
        fixture.removeMeasure(measure);

        assertTrue(fixture.getMeasures().isEmpty());
    }

    /**
     * Run the void removeMeasure(Measure) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testRemoveMeasure_3() throws Exception
    {
        fixture.addMeasure(new Measure("", "", "", null, "", "", null, null, "id"));
        Measure measure = new Measure("Other", "", "", null, "", "", null, null, "other");

        fixture.removeMeasure(measure);

        assertEquals(1, fixture.getMeasures().size());
    }

    /**
     * Run the void setCharacterises(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetCharacterises_1() throws Exception
    {
        String characterises = "char";

        fixture.setCharacterizes(new Characterizes(characterises));

        assertEquals(characterises, fixture.getCharacterizes().getHREF());
    }

    /**
     * Run the void setOriginatesFrom(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetOriginatesFrom_1() throws Exception
    {
        String originatesFrom = "origin";

        fixture.setOriginatesFrom(new OriginatesFrom(originatesFrom));

        assertEquals(originatesFrom, fixture.getOriginatesFrom().getHREF());
    }

    /**
     * Run the void setRefines(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetRefines_1() throws Exception
    {
        String refines = "ref";

        fixture.setRefines(new Refines(refines));

        assertEquals(refines, fixture.getRefines().getHREF());
    }

    /**
     * Run the void setTaggedBy(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetTaggedBy_1() throws Exception
    {
        String taggedBy = "tag";

        fixture.setTaggedBy(taggedBy);

        assertEquals(taggedBy, fixture.getTaggedBy());
    }

    /**
     * Run the void setTitle(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetTitle_1() throws Exception
    {
        String title = "newTitle";

        fixture.setTitle(title);

        assertEquals(title, fixture.getTitle());
    }

    /**
     * Run the void setType(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetType_1() throws Exception
    {
        String type = MeasureType.NUMBER;

        try
        {
            fixture.setType(type);
            assertEquals(type, fixture.getType());
        }
        catch (IllegalArgumentException e)
        {
            fail();
        }
    }

    /**
     * Run the void setType(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetType_2() throws Exception
    {
        String type = MeasureType.FINDINGS;

        try
        {
            fixture.setType(type);
            assertEquals(type, fixture.getType());
        }
        catch (IllegalArgumentException e)
        {
            fail();
        }
    }

    /**
     * Run the void setType(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetType_3() throws Exception
    {
        String type = null;

        try
        {
            fixture.setType(type);
            assertEquals(type, fixture.getType());
        }
        catch (IllegalArgumentException e)
        {
            fail();
        }
    }

    /**
     * Run the void setType(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetType_4() throws Exception
    {
        String type = "test";

        try
        {
            fixture.setType(type);
            fail();
        }
        catch (IllegalArgumentException e)
        {
        }
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
        fixture = new Measure("name", "", "title", new Characterizes("href"), MeasureType.FINDINGS, "href",
                new OriginatesFrom("href"), new Refines("href"), "id");
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
        new org.junit.runner.JUnitCore().run(MeasureTest.class);
    }
}