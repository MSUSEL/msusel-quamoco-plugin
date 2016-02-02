package net.siliconcode.quamoco.aggregator.qm;

import org.junit.*;

import net.siliconcode.quamoco.model.qm.Entity;

import static org.junit.Assert.*;

/**
 * The class <code>EntityTest</code> contains tests for the class <code>{@link Entity}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:26 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class EntityTest {
    /**
     * Run the Entity(String,String,String,String,String,String) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEntity_1()
        throws Exception
    {
        String name = "";
        String description = "";
        String originatesFrom = "";
        String title = "";
        String id = "";
        String partOf = "";

        Entity result = new Entity(name, description, originatesFrom, title, id, partOf);

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getPartOf());
        assertEquals("", result.getOriginatesFrom());
        assertEquals("", result.getTitle());
        assertEquals("", result.getDescription());
        assertEquals("", result.getName());
        assertEquals("", result.getId());
    }

    /**
     * Run the void addIsA(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testAddIsA_1()
        throws Exception
    {
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        String isa = null;

        fixture.addIsA(isa);

        // add additional test code here
    }

    /**
     * Run the void addIsA(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testAddIsA_2()
        throws Exception
    {
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        String isa = "";

        fixture.addIsA(isa);

        // add additional test code here
    }

    /**
     * Run the void addIsA(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testAddIsA_3()
        throws Exception
    {
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        String isa = "";

        fixture.addIsA(isa);

        // add additional test code here
    }

    /**
     * Run the void addIsA(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testAddIsA_4()
        throws Exception
    {
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        String isa = "";

        fixture.addIsA(isa);

        // add additional test code here
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
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        Entity obj = new Entity("", "", "", "", "", "");
        obj.addIsA("");

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
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
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
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
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
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        Object obj = new Entity("", "", "", "", "", "");

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
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        Object obj = new Entity("", "", "", "", "", "");

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
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        Object obj = new Entity("", "", "", "", "", "");

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
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        Object obj = new Entity("", "", "", "", "", "");

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
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        Object obj = new Entity("", "", "", "", "", "");

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
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        Object obj = new Entity("", "", "", "", "", "");

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
    public void testEquals_10()
        throws Exception
    {
        Entity fixture = new Entity("", "", "", (String) null, "", "");
        fixture.addIsA("");
        Object obj = new Entity("", "", "", (String) null, "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
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
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");

        String result = fixture.getOriginatesFrom();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getPartOf() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetPartOf_1()
        throws Exception
    {
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");

        String result = fixture.getPartOf();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTitle() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetTitle_1()
        throws Exception
    {
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");

        String result = fixture.getTitle();

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
        Entity fixture = new Entity((String) null, (String) null, "", "", "", "");
        fixture.addIsA("");

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(28629151, result);
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
        Entity fixture = new Entity("", "", (String) null, (String) null, "", (String) null);
        fixture.addIsA("");

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(28629151, result);
    }

    /**
     * Run the void removeIsA(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testRemoveIsA_1()
        throws Exception
    {
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        String isa = null;

        fixture.removeIsA(isa);

        // add additional test code here
    }

    /**
     * Run the void removeIsA(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testRemoveIsA_2()
        throws Exception
    {
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        String isa = "";

        fixture.removeIsA(isa);

        // add additional test code here
    }

    /**
     * Run the void removeIsA(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testRemoveIsA_3()
        throws Exception
    {
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        String isa = "";

        fixture.removeIsA(isa);

        // add additional test code here
    }

    /**
     * Run the void removeIsA(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testRemoveIsA_4()
        throws Exception
    {
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        String isa = "";

        fixture.removeIsA(isa);

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
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        String originatesFrom = "";

        fixture.setOriginatesFrom(originatesFrom);

        // add additional test code here
    }

    /**
     * Run the void setPartOf(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetPartOf_1()
        throws Exception
    {
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
        String partOf = "";

        fixture.setPartOf(partOf);

        // add additional test code here
    }

    /**
     * Run the void setTitle(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetTitle_1()
        throws Exception
    {
        Entity fixture = new Entity("", "", "", "", "", "");
        fixture.addIsA("");
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
        new org.junit.runner.JUnitCore().run(EntityTest.class);
    }
}