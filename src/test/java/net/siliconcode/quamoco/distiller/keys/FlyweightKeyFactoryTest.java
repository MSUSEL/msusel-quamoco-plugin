package net.siliconcode.quamoco.distiller.keys;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>FlyweightKeyFactoryTest</code> contains tests for the class
 * <code>{@link FlyweightKeyFactory}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class FlyweightKeyFactoryTest {

    /**
     * Run the FlyweightKeyFactory getInstance() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetInstance_1() throws Exception
    {

        FlyweightKeyFactory result = FlyweightKeyFactory.getInstance();
        FlyweightKeyFactory result2 = FlyweightKeyFactory.getInstance();

        // add additional test code here
        assertNotNull(result);
        assertNotNull(result2);
        assertSame(result, result2);
    }

    /**
     * Run the FlyweightKey getKey(String,String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetKey_1() throws Exception
    {
        FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
        String key1 = "key1";
        String name1 = "name1";

        String key2 = "key2";
        String name2 = "name2";

        String key3 = "key3";
        String name3 = "name3";

        FlyweightKey result1 = fixture.getKey(key1, name1);
        FlyweightKey result2 = fixture.getKey(key2, name2);
        FlyweightKey result3 = fixture.getKey(key3, name3);

        assertNotNull(result1);
        assertNotNull(result2);
        assertNotNull(result3);

        assertNotSame(result1, result2);
        assertNotSame(result1, result3);
        assertNotSame(result2, result3);

        assertSame(result1, fixture.getKey("key1", "name1"));
        assertSame(result2, fixture.getKey("key2", "name2"));
        assertSame(result3, fixture.getKey("key3", "name3"));
    }

    /**
     * Run the FlyweightKey getKey(String,String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetKey_2() throws Exception
    {
        FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
        String key = "";
        String name = "";

        FlyweightKey result = fixture.getKey(key, name);

        assertNull(result);
    }

    /**
     * Run the FlyweightKey getKey(String,String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetKey_3() throws Exception
    {
        FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
        String key = null;
        String name = "";

        FlyweightKey result = fixture.getKey(key, name);

        assertNull(result);
    }

    /**
     * Run the FlyweightKey getKey(String,String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetKey_4() throws Exception
    {
        FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
        String key = "";
        String name = null;

        FlyweightKey result = fixture.getKey(key, name);

        assertNull(result);
    }

    /**
     * Run the FlyweightKey getKey(String,String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetKey_5() throws Exception
    {
        FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
        String key = null;
        String name = null;

        FlyweightKey result = fixture.getKey(key, name);

        assertNull(result);
    }

    /**
     * Run the FlyweightKey getKey(String,String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetKey_6() throws Exception
    {
        FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
        String key = "something";
        String name = "";

        FlyweightKey result = fixture.getKey(key, name);

        assertNull(result);
    }

    /**
     * Run the FlyweightKey getKey(String,String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetKey_7() throws Exception
    {
        FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
        String key = "something";
        String name = null;

        FlyweightKey result = fixture.getKey(key, name);

        assertNull(result);
    }

    /**
     * Run the FlyweightKey getKey(String,String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetKey_8() throws Exception
    {
        FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
        String key = "";
        String name = "something";

        FlyweightKey result = fixture.getKey(key, name);

        assertNull(result);
    }

    /**
     * Run the FlyweightKey getKey(String,String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetKey_9() throws Exception
    {
        FlyweightKeyFactory fixture = FlyweightKeyFactory.getInstance();
        String key = "something";
        String name = null;

        FlyweightKey result = fixture.getKey(key, name);

        assertNull(result);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 1/26/16 6:38 PM
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
     * @generatedBy CodePro at 1/26/16 6:38 PM
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
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(FlyweightKeyFactoryTest.class);
    }
}