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
 * The class <code>EntityTest</code> contains tests for the class
 * <code>{@link Entity}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:26 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class EntityTest {

    private Entity fixture;

    /**
     * Run the Entity(String,String,String,String,String,String) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEntity_1() throws Exception
    {
        String name = "name";
        String description = "";
        String originatesFrom = "href";
        String title = "title";
        String id = "id";
        String partOf = "part";

        Entity result = new Entity(name, description, new OriginatesFrom(originatesFrom), title, id,
                new PartOf("partof", new Parent(partOf)));

        // add additional test code here
        assertNotNull(result);
        assertEquals("part", result.getPartOf().getParent().getHREF());
        assertEquals("href", result.getOriginatesFrom().getHREF());
        assertEquals("title", result.getTitle());
        assertEquals("", result.getDescription());
        assertEquals("name", result.getName());
        assertEquals("id", result.getId());
    }

    /**
     * Run the Entity(String,String,String,String,String,String) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEntity_2() throws Exception
    {
        String name = "";
        String description = "";
        String originatesFrom = "";
        String title = "";
        String id = "";
        String partOf = "";

        try
        {
            new Entity(name, description, new OriginatesFrom(originatesFrom), title, id,
                    new PartOf("partof", new Parent(partOf)));
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

    }

    /**
     * Run the Entity(String,String,String,String,String,String) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEntity_3() throws Exception
    {
        String name = null;
        String description = "";
        String originatesFrom = "";
        String title = "";
        String id = "";
        String partOf = "";

        try
        {
            new Entity(name, description, new OriginatesFrom(originatesFrom), title, id,
                    new PartOf("partof", new Parent(partOf)));
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

    }

    /**
     * Run the Entity(String,String,String,String,String,String) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEntity_4() throws Exception
    {
        String name = "";
        String description = null;
        String originatesFrom = "";
        String title = "";
        String id = "";
        String partOf = "";

        try
        {
            new Entity(name, description, new OriginatesFrom(originatesFrom), title, id,
                    new PartOf("partof", new Parent(partOf)));
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

    }

    /**
     * Run the Entity(String,String,String,String,String,String) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEntity_5() throws Exception
    {
        String name = "";
        String description = "";
        String originatesFrom = "";
        String title = null;
        String id = "";
        String partOf = "";

        try
        {
            new Entity(name, description, new OriginatesFrom(originatesFrom), title, id,
                    new PartOf("partof", new Parent(partOf)));
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

    }

    /**
     * Run the Entity(String,String,String,String,String,String) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEntity_6() throws Exception
    {
        String name = "";
        String description = "";
        String originatesFrom = "";
        String title = "";
        String id = null;
        String partOf = "";

        try
        {
            new Entity(name, description, new OriginatesFrom(originatesFrom), title, id,
                    new PartOf("partof", new Parent(partOf)));
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

    }

    /**
     * Run the Entity(String,String,String,String,String,String) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEntity_7() throws Exception
    {
        String name = "name";
        String description = null;
        String originatesFrom = "";
        String title = "title";
        String id = "id";
        String partOf = "";

        try
        {
            new Entity(name, description, new OriginatesFrom(originatesFrom), title, id,
                    new PartOf("partof", new Parent(partOf)));
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

    }

    /**
     * Run the Entity(String,String,String,String,String,String) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEntity_8() throws Exception
    {
        String name = "name";
        String description = "";
        String originatesFrom = "";
        String title = null;
        String id = "id";
        String partOf = "";

        try
        {
            new Entity(name, description, new OriginatesFrom(originatesFrom), title, id,
                    new PartOf("partof", new Parent(partOf)));
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

    }

    /**
     * Run the Entity(String,String,String,String,String,String) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testEntity_9() throws Exception
    {
        String name = "name";
        String description = "";
        String originatesFrom = "";
        String title = "title";
        String id = null;
        String partOf = "";

        try
        {
            new Entity(name, description, new OriginatesFrom(originatesFrom), title, id,
                    new PartOf("partof", new Parent(partOf)));
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }

    }

    /**
     * Run the void addIsA(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testAddIsA_1() throws Exception
    {
        IsA isa = new IsA("isa");
        fixture.addIsA(isa);
        IsA isa2 = null;

        assertEquals(1, fixture.getIsAs().size());
        fixture.addIsA(isa2);
        assertEquals(1, fixture.getIsAs().size());
    }

    /**
     * Run the void addIsA(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testAddIsA_2() throws Exception
    {
        IsA isa = new IsA("isa");
        fixture.addIsA(isa);
        IsA isa2 = new IsA("isa");

        assertEquals(1, fixture.getIsAs().size());
        fixture.addIsA(isa2);
        assertEquals(1, fixture.getIsAs().size());
    }

    /**
     * Run the void addIsA(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testAddIsA_3() throws Exception
    {
        IsA isa = new IsA("isa");
        fixture.addIsA(isa);
        IsA isa2 = new IsA("isa2");

        assertEquals(1, fixture.getIsAs().size());
        fixture.addIsA(isa2);
        assertEquals(2, fixture.getIsAs().size());
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
        Entity obj = new Entity("name", "", new OriginatesFrom("href"), "title", "id",
                new PartOf("part", new Parent("parent")));

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
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
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
     * Run the String getPartOf() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetPartOf_1() throws Exception
    {
        String result = fixture.getPartOf().getParent().getHREF();

        // add additional test code here
        assertEquals("parent", result);
    }

    /**
     * Run the String getTitle() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testGetTitle_1() throws Exception
    {
        String result = fixture.getTitle();

        // add additional test code here
        assertEquals("title", result);
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

        // add additional test code here
        assertEquals(-141633170, result);
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
        assertEquals(-141633170, result);
    }

    /**
     * Run the void removeIsA(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testRemoveIsA_1() throws Exception
    {
        IsA isa = new IsA("isa");
        fixture.addIsA(isa);
        IsA isa2 = null;
        IsA isa3 = new IsA("isa3");

        assertEquals(1, fixture.getIsAs().size());
        fixture.removeIsA(isa3);
        assertEquals(1, fixture.getIsAs().size());
        fixture.removeIsA(isa2);
        assertEquals(1, fixture.getIsAs().size());
        fixture.removeIsA(isa);
        assertTrue(fixture.getIsAs().isEmpty());
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
     * Run the void setPartOf(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetPartOf_1() throws Exception
    {
        assertNotNull(fixture.getPartOf());

        String result = fixture.getPartOf().getParent().getHREF();

        // add additional test code here
        assertEquals("parent", result);
    }

    /**
     * Run the void setTitle(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:26 PM
     */
    @Test
    public void testSetTitle_1() throws Exception
    {
        String title = "title";

        fixture.setTitle(title);

        assertEquals(title, fixture.getTitle());
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
        fixture = new Entity("name", "", new OriginatesFrom("href"), "title", "id",
                new PartOf("part", new Parent("parent")));
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
        new org.junit.runner.JUnitCore().run(EntityTest.class);
    }
}