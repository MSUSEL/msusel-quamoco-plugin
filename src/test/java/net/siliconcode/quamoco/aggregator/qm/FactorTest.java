package net.siliconcode.quamoco.aggregator.qm;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FactorTest</code> contains tests for the class <code>{@link Factor}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:27 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class FactorTest {
    /**
     * Run the Factor(String,String,String,String,String,String,String) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testFactor_1()
        throws Exception
    {
        String name = "";
        String description = "";
        String characterises = "";
        String originatesFrom = "";
        String title = "";
        String refines = "";
        String id = "";

        Factor result = new Factor(name, description, characterises, originatesFrom, title, refines, id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getRefines());
        assertEquals("", result.getCharacterises());
        assertEquals("", result.getOriginatesFrom());
        assertEquals("", result.getTitle());
        assertEquals(null, result.getAnnotation());
        assertEquals("", result.getDescription());
        assertEquals("", result.getName());
        assertEquals("", result.getId());
    }

    /**
     * Run the void addInfluence(Influence) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddInfluence_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Influence inf = null;

        fixture.addInfluence(inf);

        // add additional test code here
    }

    /**
     * Run the void addInfluence(Influence) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddInfluence_2()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Influence inf = new Influence("", "", "", "");

        fixture.addInfluence(inf);

        // add additional test code here
    }

    /**
     * Run the void addInfluence(Influence) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddInfluence_3()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Influence inf = new Influence("", "", "", "");

        fixture.addInfluence(inf);

        // add additional test code here
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_2()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Factor obj = new Factor("", "", "", "", "", "", "");
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_3()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Factor obj = new Factor("", "", "", "", "", "", "");
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_4()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Factor obj = new Factor("", "", "", "", "", "", "");
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_5()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Factor obj = new Factor("", "", "", "", "", "", "");
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_6()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Factor obj = new Factor("", "", "", "", "", "", "");
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_7()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Factor obj = new Factor("", "", "", "", "", "", "");
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_8()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Factor obj = new Factor("", "", "", "", "", "", "");
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_9()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Factor obj = new Factor("", "", "", "", "", "", "");
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetAnnotation_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));

        Annotation result = fixture.getAnnotation();

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getValue());
        assertEquals("", result.getKey());
        assertEquals("", result.getId());
    }

    /**
     * Run the String getCharacterises() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetCharacterises_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));

        String result = fixture.getCharacterises();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the List<Influence> getInfluences() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetInfluences_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));

        List<Influence> result = fixture.getInfluences();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the String getOriginatesFrom() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetOriginatesFrom_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));

        String result = fixture.getOriginatesFrom();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getRefines() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetRefines_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));

        String result = fixture.getRefines();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTitle() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetTitle_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));

        String result = fixture.getTitle();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testHashCode_1()
        throws Exception
    {
        Factor fixture = new Factor("", (String) null, (String) null, "", "", "", "");
        fixture.setAnnotation((Annotation) null);
        fixture.addInfluence(new Influence("", "", "", ""));

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(1742810335, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testHashCode_2()
        throws Exception
    {
        Factor fixture = new Factor((String) null, "", "", (String) null, (String) null, (String) null, "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(-64644128, result);
    }

    /**
     * Run the String influenceEffect(Factor) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testInfluenceEffect_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Factor fac = new Factor("", "", "", "", "", "", "");

        String result = fixture.influenceEffect(fac);

        // add additional test code here
        assertEquals("POSITIVE", result);
    }

    /**
     * Run the String influenceEffect(Factor) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testInfluenceEffect_2()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Factor fac = new Factor("", "", "", "", "", "", "");

        String result = fixture.influenceEffect(fac);

        // add additional test code here
        assertEquals("POSITIVE", result);
    }

    /**
     * Run the String influenceEffect(Factor) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testInfluenceEffect_3()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Factor fac = new Factor("", "", "", "", "", "", "");

        String result = fixture.influenceEffect(fac);

        // add additional test code here
        assertEquals("POSITIVE", result);
    }

    /**
     * Run the boolean influences(Factor) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testInfluences_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Factor fac = new Factor("", "", "", "", "", "", "");

        boolean result = fixture.influences(fac);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean influences(Factor) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testInfluences_2()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Factor fac = new Factor("", "", "", "", "", "", "");

        boolean result = fixture.influences(fac);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean influences(Factor) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testInfluences_3()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Factor fac = new Factor("", "", "", "", "", "", "");

        boolean result = fixture.influences(fac);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the void removeInfluence(Influence) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveInfluence_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Influence inf = null;

        fixture.removeInfluence(inf);

        // add additional test code here
    }

    /**
     * Run the void removeInfluence(Influence) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveInfluence_2()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Influence inf = new Influence("", "", "", "");

        fixture.removeInfluence(inf);

        // add additional test code here
    }

    /**
     * Run the void removeInfluence(Influence) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveInfluence_3()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Influence inf = new Influence("", "", "", "");

        fixture.removeInfluence(inf);

        // add additional test code here
    }

    /**
     * Run the void setAnnotation(Annotation) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetAnnotation_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        Annotation annotation = new Annotation("", "", "");

        fixture.setAnnotation(annotation);

        // add additional test code here
    }

    /**
     * Run the void setCharacterises(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetCharacterises_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        String characterises = "";

        fixture.setCharacterises(characterises);

        // add additional test code here
    }

    /**
     * Run the void setOriginatesFrom(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetOriginatesFrom_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        String originatesFrom = "";

        fixture.setOriginatesFrom(originatesFrom);

        // add additional test code here
    }

    /**
     * Run the void setRefines(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetRefines_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        String refines = "";

        fixture.setRefines(refines);

        // add additional test code here
    }

    /**
     * Run the void setTitle(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetTitle_1()
        throws Exception
    {
        Factor fixture = new Factor("", "", "", "", "", "", "");
        fixture.setAnnotation(new Annotation("", "", ""));
        fixture.addInfluence(new Influence("", "", "", ""));
        String title = "";

        fixture.setTitle(title);

        // add additional test code here
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(FactorTest.class);
    }
}