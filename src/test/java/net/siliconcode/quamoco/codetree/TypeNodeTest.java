package net.siliconcode.quamoco.codetree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>TypeNodeTest</code> contains tests for the class
 * <code>{@link TypeNode}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:38 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class TypeNodeTest {

    private TypeNode fixture;

    /**
     * Run the TypeNode(CodeNode,String,String,boolean,int,int) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testTypeNode_1() throws Exception
    {
        CodeNode owner = new FileNode("path");
        String identifier = "type";
        String qIdentifier = "namespace.Type";
        boolean isClass = true;
        int start = 1;
        int end = 1000;

        try
        {
            TypeNode result = new TypeNode(owner, qIdentifier, identifier, isClass, start, end);

            // add additional test code here
            assertNotNull(result);
            assertEquals("TYPE", result.getType());
            assertEquals("namespace.Type", result.getQIdentifier());
            assertEquals(1000, result.getEnd());
            assertEquals(1, result.getStart());
        }
        catch (IllegalArgumentException e)
        {
            fail();
        }
    }

    /**
     * Run the TypeNode(CodeNode,String,String,boolean,int,int) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testTypeNode_2() throws Exception
    {
        CodeNode owner = new FileNode("path");
        String identifier = "";
        String qIdentifier = "";
        boolean isClass = true;
        int start = 1;
        int end = 1000;

        try
        {
            new TypeNode(owner, qIdentifier, identifier, isClass, start, end);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the TypeNode(CodeNode,String,String,boolean,int,int) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testTypeNode_3() throws Exception
    {
        CodeNode owner = new FileNode("path");
        String identifier = null;
        String qIdentifier = "";
        boolean isClass = true;
        int start = 1;
        int end = 1000;

        try
        {
            new TypeNode(owner, qIdentifier, identifier, isClass, start, end);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the void addMethod(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddMethod_1() throws Exception
    {
        MethodNode method = new MethodNode(fixture, "method", false, 25, 100);

        fixture.addMethod(method);

        // add additional test code here
        assertEquals(1, fixture.getMethods().size());
    }

    /**
     * Run the void addMethod(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddMethod_2() throws Exception
    {
        MethodNode method = null;

        assertTrue(fixture.getMethods().isEmpty());
        fixture.addMethod(method);

        // add additional test code here
        assertTrue(fixture.getMethods().isEmpty());
    }

    /**
     * Run the void addMethod(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddMethod_3() throws Exception
    {
        MethodNode method = new MethodNode(fixture, "method", false, 25, 100);

        fixture.addMethod(method);

        // add additional test code here
        assertEquals(1, fixture.getMethods().size());
        fixture.addMethod(method);
        assertEquals(1, fixture.getMethods().size());
    }

    /**
     * Run the void addMethod(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddMethod_4() throws Exception
    {
        try
        {
            MethodNode method = new MethodNode(fixture, "method", false, 25, 1001);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the void addMethod(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddMethod_5() throws Exception
    {
        fixture.setStart(100);
        try
        {
            MethodNode method = new MethodNode(fixture, "method", false, 25, 1000);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the void addField(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddField_1() throws Exception
    {
        FieldNode field = new FieldNode(fixture, "field", 25);

        fixture.addField(field);

        // add additional test code here
        assertEquals(1, fixture.getFields().size());
    }

    /**
     * Run the void addField(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddField_2() throws Exception
    {
        FieldNode field = null;

        assertTrue(fixture.getFields().isEmpty());
        fixture.addField(field);

        // add additional test code here
        assertTrue(fixture.getFields().isEmpty());
    }

    /**
     * Run the void addField(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddField_3() throws Exception
    {
        FieldNode field = new FieldNode(fixture, "field", 25);

        fixture.addField(field);

        // add additional test code here
        assertEquals(1, fixture.getFields().size());
        fixture.addField(field);
        assertEquals(1, fixture.getFields().size());
    }

    /**
     * Run the void addField(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddField_4() throws Exception
    {
        try
        {
            FieldNode field = new FieldNode(fixture, "field", 1001);
            fail();
        }
        catch (IllegalArgumentException e)
        {
        }
    }

    /**
     * Run the void addField(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testAddField_5() throws Exception
    {
        fixture.setStart(25);
        try
        {
            FieldNode field = new FieldNode(fixture, "field", 24);
            fail();
        }
        catch (IllegalArgumentException e)
        {
        }
    }

    /**
     * Run the MethodNode getMethod(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetMethod_1() throws Exception
    {
        MethodNode method = new MethodNode(fixture, "method", false, 25, 100);
        fixture.addMethod(method);

        MethodNode result = fixture.getMethod(30);

        // add additional test code here
        assertEquals(method, result);

        result = fixture.getMethod(25);
        assertEquals(method, result);

        result = fixture.getMethod(100);
        assertEquals(method, result);

        result = fixture.getMethod(26);
        assertEquals(method, result);

        result = fixture.getMethod(99);
        assertEquals(method, result);
    }

    /**
     * Run the MethodNode getMethod(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetMethod_2() throws Exception
    {
        MethodNode method = new MethodNode(fixture, "method", false, 25, 100);
        fixture.addMethod(method);

        MethodNode result = fixture.getMethod(30);

        // add additional test code here
        assertEquals(method, result);

        result = fixture.getMethod(24);
        assertNull(result);

        result = fixture.getMethod(101);
        assertNull(result);

        result = fixture.getMethod(-1);
        assertNull(result);

        result = fixture.getMethod(20000);
        assertNull(result);
    }

    /**
     * Run the MethodNode getMethod(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetMethod_3() throws Exception
    {
        MethodNode method = new MethodNode(fixture, "method", false, 25, 100);

        MethodNode result = fixture.getMethod(30);

        // add additional test code here
        assertNull(result);

        result = fixture.getMethod(24);
        assertNull(result);

        result = fixture.getMethod(101);
        assertNull(result);

        result = fixture.getMethod(-1);
        assertNull(result);

        result = fixture.getMethod(20000);
        assertNull(result);
    }

    /**
     * Run the MethodNode getMethod(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetMethod_4() throws Exception
    {
        assertTrue(fixture.getMethods().isEmpty());

        MethodNode result = fixture.getMethod(30);

        // add additional test code here
        assertNull(result);

        result = fixture.getMethod(24);
        assertNull(result);

        result = fixture.getMethod(101);
        assertNull(result);

        result = fixture.getMethod(-1);
        assertNull(result);

        result = fixture.getMethod(20000);
        assertNull(result);
    }

    /**
     * Run the MethodNode getField(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetField_1() throws Exception
    {
        FieldNode field = new FieldNode(fixture, "field", 25);
        fixture.addField(field);

        FieldNode result = fixture.getField(25);

        // add additional test code here
        assertEquals(field, result);
    }

    /**
     * Run the MethodNode getField(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetField_2() throws Exception
    {
        FieldNode field = new FieldNode(fixture, "field", 25);
        fixture.addField(field);

        FieldNode result = fixture.getField(26);

        // add additional test code here
        assertNull(result);

        result = fixture.getField(24);
        assertNull(result);
    }

    /**
     * Run the MethodNode getField(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetField_3() throws Exception
    {
        FieldNode field = new FieldNode(fixture, "field", 25);

        FieldNode result = fixture.getField(25);

        // add additional test code here
        assertNull(result);
    }

    /**
     * Run the Set<CodeNode> getMethods() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetMethods_1() throws Exception
    {
        MethodNode method = new MethodNode(fixture, "method", false, 25, 100);
        fixture.addMethod(method);
        Set<MethodNode> result = fixture.getMethods();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the Set<CodeNode> getFields() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testGetFields_1() throws Exception
    {
        FieldNode field = new FieldNode(fixture, "field", 25);
        fixture.addField(field);
        Set<FieldNode> result = fixture.getFields();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
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
        assertEquals("TYPE", result);
    }

    /**
     * Run the void removeMethod(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testRemoveMethod_1() throws Exception
    {
        MethodNode method = new MethodNode(fixture, "method", false, 25, 100);
        fixture.addMethod(method);

        assertEquals(1, fixture.getMethods().size());
        fixture.removeMethod(method);

        // add additional test code here
        assertTrue(fixture.getMethods().isEmpty());
    }

    /**
     * Run the void removeMethod(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testRemoveMethod_2() throws Exception
    {
        MethodNode method = new MethodNode(fixture, "method", false, 25, 100);
        fixture.addMethod(method);

        assertEquals(1, fixture.getMethods().size());
        fixture.removeMethod(null);

        // add additional test code here
        assertFalse(fixture.getMethods().isEmpty());
    }

    /**
     * Run the void removeMethod(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testRemoveMethod_3() throws Exception
    {
        MethodNode method = new MethodNode(fixture, "method", false, 25, 100);
        MethodNode method2 = new MethodNode(fixture, "method2", false, 100, 120);
        fixture.addMethod(method);

        assertEquals(1, fixture.getMethods().size());
        fixture.removeMethod(method2);

        // add additional test code here
        assertFalse(fixture.getMethods().isEmpty());
    }

    /**
     * Run the void removeField(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testRemoveField_1() throws Exception
    {
        FieldNode field = new FieldNode(fixture, "field", 25);
        fixture.addField(field);

        assertEquals(1, fixture.getFields().size());
        fixture.removeField(field);

        // add additional test code here
        assertTrue(fixture.getFields().isEmpty());
    }

    /**
     * Run the void removeField(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testRemoveField_2() throws Exception
    {
        FieldNode field = new FieldNode(fixture, "field", 25);
        fixture.addField(field);

        assertEquals(1, fixture.getFields().size());
        fixture.removeField(null);

        // add additional test code here
        assertFalse(fixture.getFields().isEmpty());
    }

    /**
     * Run the void removeField(CodeNode) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/26/16 6:38 PM
     */
    @Test
    public void testRemoveField_3() throws Exception
    {
        FieldNode field = new FieldNode(fixture, "field", 25);
        FieldNode field2 = new FieldNode(fixture, "field2", 24);
        fixture.addField(field);

        assertEquals(1, fixture.getFields().size());
        fixture.removeField(field2);

        // add additional test code here
        assertFalse(fixture.getFields().isEmpty());
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
        fixture = new TypeNode(new FileNode("path"), "namespace.type", "type", true, 1, 1000);
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
        new org.junit.runner.JUnitCore().run(TypeNodeTest.class);
    }
}