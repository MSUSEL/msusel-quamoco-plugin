package net.siliconcode.quamoco.graph.edge;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>AbstractEdgeTest</code> contains tests for the class
 * <code>{@link AbstractEdge}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:38 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class AbstractEdgeTest {

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge();
        Object obj = AbstractEdgeFactory.createAbstractEdge2();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_2() throws Exception
    {
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge3();
        Object obj = null;

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_3() throws Exception
    {
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge4();
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_4() throws Exception
    {
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge5();
        Object obj = AbstractEdgeFactory.createAbstractEdge6();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testEquals_5() throws Exception
    {
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge7();
        Object obj = AbstractEdgeFactory.createAbstractEdge8();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the long getId() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetId_1() throws Exception
    {
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge();
        long id = 1;
        fixture.setId(id);
        long result = fixture.getId();

        // TODO: add additional test code here
        assertEquals(id, result);
    }

    /**
     * Run the String getName() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testGetName_1() throws Exception
    {
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge2();

        String result = fixture.getName();

        // TODO: add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String toString() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Test
    public void testToString_1() throws Exception
    {
        AbstractEdge fixture = AbstractEdgeFactory.createAbstractEdge5();

        String result = fixture.toString();

        // TODO: add additional test code here
        assertEquals("Edge: " + fixture.getId(), result);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @Before
    public void setUp() throws Exception
    {
        // TODO: add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    @After
    public void tearDown() throws Exception
    {
        // TODO: add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args
     *            the command line arguments
     * @generatedBy CodePro at 5/30/15 3:38 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(AbstractEdgeTest.class);
    }
}