package net.siliconcode.quamoco.codetree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>MethodNodeTest</code> contains tests for the class
 * <code>{@link MethodNode}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class MethodNodeTest {

    private MethodNode fixture;

    /**
     * Run the MethodNode(CodeNode,String,String,boolean,int,int) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testMethodNode_1() throws Exception
    {
        CodeNode owner = new FileNode("path");
        String identifier = "method";
        boolean constructor = true;
        int start = 1;
        int end = 1;

        MethodNode result = new MethodNode(owner, identifier, constructor, start, end);

        // add additional test code here
        assertNotNull(result);
        assertEquals(true, result.isConstructor());
        assertEquals("METHOD", result.getType());
        assertEquals("path#method", result.getQIdentifier());
        assertEquals(1, result.getEnd());
        assertEquals(1, result.getStart());
    }

    /**
     * Run the String getType() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetType_1() throws Exception
    {
        String result = fixture.getType();

        // add additional test code here
        assertEquals("METHOD", result);
    }

    /**
     * Run the boolean isConstructor() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testIsConstructor_1() throws Exception
    {
        boolean result = fixture.isConstructor();

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean isConstructor() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testIsConstructor_2() throws Exception
    {
        fixture.setConstructor(false);
        boolean result = fixture.isConstructor();

        // add additional test code here
        assertEquals(false, result);
    }

    @Test
    public void testSetConstructor_1() throws Exception
    {
        assertTrue(fixture.isConstructor());

        fixture.setConstructor(false);

        assertFalse(fixture.isConstructor());
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
        fixture = new MethodNode(new FileNode("path"), "method", true, 1, 1);
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
        new org.junit.runner.JUnitCore().run(MethodNodeTest.class);
    }
}