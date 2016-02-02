package net.siliconcode.quamoco.codetree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>FieldNodeTest</code> contains tests for the class
 * <code>{@link FieldNode}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class FieldNodeTest {

    private FieldNode fixture;

    /**
     * Run the FieldNode(CodeNode,String,String,int) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testFieldNode_1() throws Exception
    {
        CodeNode parent = new FileNode("path");
        String identifier = "field";
        int line = 1;

        try
        {
            FieldNode result = new FieldNode(parent, identifier, line);

            // add additional test code here
            assertNotNull(result);
            assertEquals("FIELD", result.getType());
            assertEquals("path#field", result.getQIdentifier());
            assertEquals(1, result.getEnd());
            assertEquals(1, result.getStart());
        }
        catch (IllegalArgumentException e)
        {
            fail();
        }
    }

    /**
     * Run the FieldNode(CodeNode,String,String,int) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testFieldNode_2() throws Exception
    {
        CodeNode parent = new FileNode("path");
        String identifier = "";
        int line = 1;

        try
        {
            new FieldNode(parent, identifier, line);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the FieldNode(CodeNode,String,String,int) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testFieldNode_3() throws Exception
    {
        CodeNode parent = new FileNode("path");
        String identifier = null;
        int line = 1;

        try
        {
            new FieldNode(parent, identifier, line);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
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
        assertEquals("FIELD", result);
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
        fixture = new FieldNode(new FileNode("path"), "field", 1);
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
        new org.junit.runner.JUnitCore().run(FieldNodeTest.class);
    }
}