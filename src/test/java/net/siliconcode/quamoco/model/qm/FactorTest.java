package net.siliconcode.quamoco.model.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>FactorTest</code> contains tests for the class
 * <code>{@link Factor}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:27 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class FactorTest {

    private Factor fixture;

    /**
     * Run the Factor(String,String,String,String,String,String,String)
     * constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testFactor_1() throws Exception
    {
        String name = "factor";
        String description = "";
        Characterizes characterises = new Characterizes("href");
        OriginatesFrom originatesFrom = new OriginatesFrom("href");
        String title = "";
        Refines refines = new Refines("href");
        String id = "id";

        Factor result = new Factor(name, description, characterises, originatesFrom, title, refines, id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("href", result.getRefines().getHREF());
        assertEquals("href", result.getCharacterizes().getHREF());
        assertEquals("href", result.getOriginatesFrom().getHREF());
        assertEquals("", result.getTitle());
        assertTrue(result.getAnnotations().isEmpty());
        assertEquals("", result.getDescription());
        assertEquals("factor", result.getName());
        assertEquals("id", result.getId());
    }

    /**
     * Run the void addInfluence(Influence) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddInfluence_1() throws Exception
    {
        fixture.addInfluence(new Influence(InfluenceEffect.POSITIVE, "", null, "id"));
        Influence inf = null;

        assertEquals(1, fixture.getInfluences().size());
        fixture.addInfluence(inf);
        assertEquals(1, fixture.getInfluences().size());
        // add additional test code here

    }

    /**
     * Run the void addInfluence(Influence) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddInfluence_2() throws Exception
    {
        fixture.addInfluence(new Influence(InfluenceEffect.POSITIVE, "", null, "id"));
        Influence inf = new Influence(InfluenceEffect.POSITIVE, "", null, "id");

        assertEquals(1, fixture.getInfluences().size());
        fixture.addInfluence(inf);
        assertEquals(1, fixture.getInfluences().size());
    }

    /**
     * Run the void addInfluence(Influence) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddInfluence_3() throws Exception
    {
        fixture.addInfluence(new Influence(InfluenceEffect.POSITIVE, "", null, "id"));
        Influence inf = new Influence(InfluenceEffect.NEGATIVE, "", null, "id");

        assertEquals(1, fixture.getInfluences().size());
        fixture.addInfluence(inf);
        assertEquals(2, fixture.getInfluences().size());
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_1() throws Exception
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_2() throws Exception
    {
        Factor obj = new Factor("factor", "", new Characterizes("href"), new OriginatesFrom("href"), "",
                new Refines("href"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_3() throws Exception
    {
        Factor obj = new Factor("factorx", "", new Characterizes("href"), new OriginatesFrom("href"), "",
                new Refines("href"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_4() throws Exception
    {
        Factor obj = new Factor("factor", "darkness", new Characterizes("href"), new OriginatesFrom("href"), "",
                new Refines("href"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_5() throws Exception
    {
        Factor obj = new Factor("factor", "", new Characterizes("href"), new OriginatesFrom("href"), "",
                new Refines("href"), "id2");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_6() throws Exception
    {
        Factor obj = new Factor("factor", "", new Characterizes("href2"), new OriginatesFrom("href"), "",
                new Refines("href"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_7() throws Exception
    {
        Factor obj = new Factor("factor", "", new Characterizes("href"), new OriginatesFrom("href2"), "",
                new Refines("href"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_8() throws Exception
    {
        Factor obj = new Factor("factor", "", new Characterizes("href"), new OriginatesFrom("href"), "",
                new Refines("href2"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_9() throws Exception
    {
        Factor obj = new Factor("factor", "", null, new OriginatesFrom("href"), "", new Refines("href"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_10() throws Exception
    {
        Factor obj = new Factor("factor", "", new Characterizes("href"), null, "", new Refines("href"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_11() throws Exception
    {
        Factor obj = new Factor("factor", "", new Characterizes("href"), new OriginatesFrom("href"), "", null, "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_12() throws Exception
    {
        Factor obj = new Factor("factor", "description", new Characterizes("href"), new OriginatesFrom("href"), "",
                new Refines("href"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_13() throws Exception
    {
        Factor obj = new Factor("factor", null, new Characterizes("href"), new OriginatesFrom("href"), "",
                new Refines("href"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_14() throws Exception
    {
        Factor obj = new Factor("factor", "", new Characterizes("href"), new OriginatesFrom("href"), null,
                new Refines("href"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_15() throws Exception
    {
        Factor obj = new Factor("factor", "", new Characterizes("href"), new OriginatesFrom("href"), "title",
                new Refines("href"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the Annotation getAnnotation() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
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
     * Run the String getCharacterises() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetCharacterises_1() throws Exception
    {
        String result = fixture.getCharacterizes().getHREF();

        // add additional test code here
        assertEquals("href", result);
    }

    /**
     * Run the List<Influence> getInfluences() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetInfluences_1() throws Exception
    {
        fixture.addInfluence(new Influence(InfluenceEffect.POSITIVE, "", null, "id"));

        List<Influence> result = fixture.getInfluences();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the String getOriginatesFrom() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetOriginatesFrom_1() throws Exception
    {
        String result = fixture.getOriginatesFrom().getHREF();

        // add additional test code here
        assertEquals("href", result);
    }

    /**
     * Run the String getRefines() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetRefines_1() throws Exception
    {
        String result = fixture.getRefines().getHREF();

        // add additional test code here
        assertEquals("href", result);
    }

    /**
     * Run the String getTitle() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetTitle_1() throws Exception
    {
        String result = fixture.getTitle();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String influenceEffect(Factor) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testInfluenceEffect_1() throws Exception
    {
        fixture.addInfluence(new Influence(InfluenceEffect.POSITIVE, "", new Target("factor"), "id"));
        Factor fac = new Factor("factor", "", null, null, "", null, "factor");

        String result = fixture.influenceEffect(fac).toString();

        // add additional test code here
        assertEquals("POSITIVE", result);
    }

    /**
     * Run the String influenceEffect(Factor) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testInfluenceEffect_2() throws Exception
    {
        fixture.addInfluence(new Influence(InfluenceEffect.POSITIVE, "", new Target("factor"), "id"));
        Factor fac = new Factor("factor", "", null, null, "", null, "factor");

        String result = fixture.influenceEffect(fac).toString();

        // add additional test code here
        assertEquals("POSITIVE", result);
    }

    /**
     * Run the String influenceEffect(Factor) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testInfluenceEffect_3() throws Exception
    {
        fixture.addInfluence(new Influence(InfluenceEffect.POSITIVE, "", new Target("factor"), "id"));
        Factor fac = new Factor("factor", "", null, null, "", null, "factor");

        String result = fixture.influenceEffect(fac).toString();

        // add additional test code here
        assertEquals("POSITIVE", result);
    }

    /**
     * Run the boolean influences(Factor) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testInfluences_1() throws Exception
    {
        fixture.addInfluence(new Influence(InfluenceEffect.POSITIVE, "", new Target("factor"), "id"));
        Factor fac = new Factor("factor", "", null, null, "", null, "factor");

        boolean result = fixture.influences(fac);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean influences(Factor) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testInfluences_2() throws Exception
    {
        fixture.addInfluence(new Influence(InfluenceEffect.POSITIVE, "", new Target("factor"), "id"));
        Factor fac = new Factor("factor", "", null, null, "", null, "factor");

        boolean result = fixture.influences(fac);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean influences(Factor) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testInfluences_3() throws Exception
    {
        fixture.addInfluence(new Influence(InfluenceEffect.POSITIVE, "", new Target("factor"), "id"));
        Factor fac = new Factor("factor", "", null, null, "", null, "factor");

        boolean result = fixture.influences(fac);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the void removeInfluence(Influence) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveInfluence_1() throws Exception
    {
        fixture.addInfluence(new Influence(InfluenceEffect.POSITIVE, "", null, "id"));
        Influence inf = null;

        assertEquals(1, fixture.getInfluences().size());
        fixture.removeInfluence(inf);
        assertEquals(1, fixture.getInfluences().size());

        // add additional test code here
    }

    /**
     * Run the void removeInfluence(Influence) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveInfluence_2() throws Exception
    {
        fixture.addInfluence(new Influence(InfluenceEffect.POSITIVE, "", null, "id"));
        Influence inf = new Influence(InfluenceEffect.POSITIVE, "", null, "id");

        assertEquals(1, fixture.getInfluences().size());
        fixture.removeInfluence(inf);
        assertTrue(fixture.getInfluences().isEmpty());
    }

    /**
     * Run the void removeInfluence(Influence) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveInfluence_3() throws Exception
    {
        fixture.addInfluence(new Influence(InfluenceEffect.POSITIVE, "", null, "id"));
        Influence inf = new Influence(InfluenceEffect.NEGATIVE, "", null, "id2");

        assertFalse(fixture.getInfluences().contains(inf));
        assertEquals(1, fixture.getInfluences().size());
        fixture.removeInfluence(inf);
        assertEquals(1, fixture.getInfluences().size());
    }

    /**
     * Run the void setAnnotation(Annotation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddAnnotation_1() throws Exception
    {
        fixture.addInfluence(new Influence(InfluenceEffect.POSITIVE, "", null, "id"));
        Annotation annotation = new Annotation("key", "", "id");

        assertTrue(fixture.getAnnotations().isEmpty());
        fixture.addAnnotation(annotation);

        // add additional test code here
        assertFalse(fixture.getAnnotations().isEmpty());
        assertEquals(1, fixture.getAnnotations().size());
        assertTrue(fixture.getAnnotations().contains(annotation));

        fixture.addAnnotation(null);
        assertEquals(1, fixture.getAnnotations().size());

        fixture.addAnnotation(annotation);
        assertEquals(1, fixture.getAnnotations().size());
    }

    /**
     * Run the void setCharacterises(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetCharacterises_1() throws Exception
    {
        String characterises = "char";

        fixture.setCharacterizes(new Characterizes(characterises));

        // add additional test code here
        assertNotNull(fixture.getCharacterizes());
        assertEquals("char", fixture.getCharacterizes().getHREF());
    }

    /**
     * Run the void setOriginatesFrom(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetOriginatesFrom_1() throws Exception
    {
        String originatesFrom = "origin";

        fixture.setOriginatesFrom(new OriginatesFrom(originatesFrom));

        // add additional test code here
        assertNotNull(fixture.getOriginatesFrom());
        assertEquals("origin", fixture.getOriginatesFrom().getHREF());
    }

    /**
     * Run the void setRefines(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetRefines_1() throws Exception
    {
        String refines = "refine";

        fixture.setRefines(new Refines(refines));

        // add additional test code here
        assertNotNull(fixture.getRefines());
        assertEquals("refine", fixture.getRefines().getHREF());
    }

    /**
     * Run the void setTitle(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetTitle_1() throws Exception
    {
        String title = "title";

        fixture.setTitle(title);

        // add additional test code here
        assertEquals(title, fixture.getTitle());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Before
    public void setUp() throws Exception
    {
        String name = "factor";
        String description = "";
        Characterizes characterises = new Characterizes("href");
        OriginatesFrom originatesFrom = new OriginatesFrom("href");
        String title = "";
        Refines refines = new Refines("href");
        String id = "id";

        fixture = new Factor(name, description, characterises, originatesFrom, title, refines, id);
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 5/30/15 3:27 PM
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(FactorTest.class);
    }
}