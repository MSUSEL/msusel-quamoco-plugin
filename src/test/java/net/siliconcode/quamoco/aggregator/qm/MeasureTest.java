package net.siliconcode.quamoco.aggregator.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>MeasureTest</code> contains tests for the class
 * <code>{@link Measure}</code>.
 *
 * @generatedBy CodePro at 6/6/15 1:35 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class MeasureTest {

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
        String name = "";
        String description = "";
        String title = "";
        String characterises = "";
        String type = "";
        String taggedBy = "";
        String originatesFrom = "";
        String refines = "";
        String id = "";

        Measure result = new Measure(name, description, title, characterises, type, taggedBy, originatesFrom, refines,
                id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getTaggedBy());
        assertEquals("", result.getCharacterises());
        assertEquals(null, result.getOriginatesFrom());
        assertEquals("", result.getRefines());
        assertEquals("", result.getTitle());
        assertEquals("", result.getType());
        assertEquals("", result.getDescription());
        assertEquals("", result.getName());
        assertEquals("", result.getId());
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Annotation ann = null;

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
    public void testAddAnnotation_2() throws Exception
    {
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Annotation ann = new Annotation("", "", "");

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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Annotation ann = new Annotation("other", "", "other");

        fixture.addAnnotation(ann);

        assertEquals(2, fixture.getAnnotations().size());
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        assertNotNull(fixture.getMeasures());
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addParent("");

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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Measure measure = null;

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
    public void testAddMeasure_2() throws Exception
    {
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Measure measure = new Measure("", "", "", "", "", "", "", "", "");

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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Measure measure = new Measure("other", "", "", "", "", "", "", "", "other");

        fixture.addMeasure(measure);

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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("parent");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String parent = null;

        fixture.addParent(parent);

        assertEquals(1, fixture.getParents().size());
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("parent");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String parent = "";

        fixture.addParent(parent);

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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("parent");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String parent = "parent";

        fixture.addParent(parent);

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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("parent");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String parent = "other";

        fixture.addParent(parent);

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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Object obj = new Measure("", "", "", "", "", "", "", "", "");

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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        String result = fixture.getCharacterises();

        // add additional test code here
        assertEquals("", result);
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        String result = fixture.getOriginatesFrom();

        // add additional test code here
        assertEquals("", result);
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        Set<String> result = fixture.getParents();

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("parent");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        Set<String> result = fixture.getParents();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the Set<String> getParents() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetParents_3() throws Exception
    {
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        Set<String> result = fixture.getParents();

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        String result = fixture.getRefines();

        // add additional test code here
        assertEquals("", result);
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        String result = fixture.getTaggedBy();

        // add additional test code here
        assertEquals("", result);
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        String result = fixture.getTitle();

        // add additional test code here
        assertEquals("", result);
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        String result = fixture.getType();

        // add additional test code here
        assertEquals("", result);
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
        Measure fixture = new Measure((String) null, (String) null, "", (String) null, "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(742359646, result);
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Annotation ann = null;

        fixture.removeAnnotation(ann);

        assertEquals(1, fixture.getAnnotations().size());
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Annotation ann = new Annotation("", "", "");

        fixture.removeAnnotation(ann);

        assertEquals(0, fixture.getAnnotations().size());
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Annotation ann = new Annotation("other", "", "other");

        fixture.removeAnnotation(ann);

        assertEquals(1, fixture.getAnnotations().size());
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Measure measure = null;

        fixture.removeMeasure(measure);

        assertEquals(1, fixture.getMeasures().size());
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Measure measure = new Measure("", "", "", "", "", "", "", "", "");

        fixture.removeMeasure(measure);

        assertEquals(0, fixture.getMeasures().size());
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Measure measure = new Measure("Other", "", "", "", "", "", "", "", "other");

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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String characterises = "";

        fixture.setCharacterises(characterises);

        assertEquals(characterises, fixture.getCharacterises());
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String originatesFrom = "";

        fixture.setOriginatesFrom(originatesFrom);

        assertEquals(originatesFrom, fixture.getOriginatesFrom());
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String refines = "";

        fixture.setRefines(refines);

        assertEquals(refines, fixture.getRefines());
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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String taggedBy = "";

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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String title = "";

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
        Measure fixture = new Measure("", "", "", "", "", "", "", "", "");
        fixture.setOriginatesFrom("");
        fixture.addAnnotation(new Annotation("", "", ""));
        fixture.addParent("");
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String type = "";

        fixture.setType(type);

        assertEquals(type, fixture.getType());
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
        new org.junit.runner.JUnitCore().run(MeasureTest.class);
    }
}