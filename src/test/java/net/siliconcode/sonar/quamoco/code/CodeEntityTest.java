package net.siliconcode.sonar.quamoco.code;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>CodeEntityTest</code> contains tests for the class
 * <code>{@link CodeEntity}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:45 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class CodeEntityTest {

    /**
     * Run the CodeEntity(String,CodeEntityType,int,int) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testCodeEntity_1() throws Exception
    {
        String name = "";
        CodeEntityType type = CodeEntityType.CLASS;
        int start = 1;
        int end = 1;

        CodeEntity result = new CodeEntity(name, type, start, end);

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(0, result.getLoc());
        assertEquals(1, result.getStart());
        assertEquals(1, result.getEnd());
        assertEquals("", result.getName());
        assertEquals(false, result.isStatic());
    }

    /**
     * Run the void addChild(CodeEntity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testAddChild_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity();
        CodeEntity child = null;

        fixture.addChild(child);

        assertNotNull(fixture.getChildren());
        assertEquals(0, fixture.getChildren().size());
    }

    /**
     * Run the void addChild(CodeEntity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testAddChild_2() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity2();
        CodeEntity child = CodeEntityFactory.createCodeEntity3();

        fixture.addChild(child);

        assertNotNull(fixture.getChildren());
        assertEquals(1, fixture.getChildren().size());
    }

    /**
     * Run the void addChild(CodeEntity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testAddChild_3() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity4();
        CodeEntity child = CodeEntityFactory.createCodeEntity();
        fixture.addChild(CodeEntityFactory.createCodeEntity());
        child.setName("other");
        fixture.addChild(child);

        assertNotNull(fixture.getChildren());
        assertEquals(2, fixture.getChildren().size());
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity2();
        Object obj = CodeEntityFactory.createCodeEntity3();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testEquals_2() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity4();
        Object obj = null;

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testEquals_3() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity();
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testEquals_4() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity2();
        Object obj = CodeEntityFactory.createCodeEntity3();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testEquals_5() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity4();
        Object obj = CodeEntityFactory.createCodeEntity();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testEquals_6() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity2();
        Object obj = CodeEntityFactory.createCodeEntity3();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testEquals_7() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity4();
        Object obj = CodeEntityFactory.createCodeEntity();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testEquals_8() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity2();
        Object obj = CodeEntityFactory.createCodeEntity3();

        boolean result = fixture.equals(obj);

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the List<CodeEntity> getChildren() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testGetChildren_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity4();

        List<CodeEntity> result = fixture.getChildren();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    /**
     * Run the int getEnd() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testGetEnd_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity();

        int result = fixture.getEnd();

        // TODO: add additional test code here
        assertEquals(0, result);
    }

    /**
     * Run the int getLoc() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testGetLoc_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity2();

        int result = fixture.getLoc();

        // TODO: add additional test code here
        assertEquals(0, result);
    }

    /**
     * Run the String getName() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testGetName_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity3();

        String result = fixture.getName();

        // TODO: add additional test code here
        assertEquals("An��t-1.0.txt", result);
    }

    /**
     * Run the int getStart() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testGetStart_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity4();

        int result = fixture.getStart();

        // TODO: add additional test code here
        assertEquals(-1, result);
    }

    /**
     * Run the CodeEntityType getType() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testGetType_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity();

        CodeEntityType result = fixture.getType();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals("CLASS", result.name());
        assertEquals("CLASS", result.toString());
        assertEquals(2, result.ordinal());
    }

    /**
     * Run the boolean isStatic() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testIsStatic_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity4();

        boolean result = fixture.isStatic();

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean isStatic() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testIsStatic_2() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity();

        boolean result = fixture.isStatic();

        // TODO: add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the void removeChild(CodeEntity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testRemoveChild_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity2();
        CodeEntity child = null;
        CodeEntity other = CodeEntityFactory.createCodeEntity();
        fixture.addChild(other);
        fixture.removeChild(child);

        assertNotNull(fixture.getChildren());
        assertEquals(1, fixture.getChildren().size());
    }

    /**
     * Run the void removeChild(CodeEntity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testRemoveChild_2() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity3();
        CodeEntity child = CodeEntityFactory.createCodeEntity4();
        fixture.addChild(child);
        fixture.removeChild(child);

        assertNotNull(fixture.getChildren());
        assertEquals(0, fixture.getChildren().size());
    }

    /**
     * Run the void removeChild(CodeEntity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testRemoveChild_3() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity();
        CodeEntity child = CodeEntityFactory.createCodeEntity2();
        fixture.addChild(CodeEntityFactory.createCodeEntity());
        fixture.removeChild(child);

        assertNotNull(fixture.getChildren());
        assertEquals(1, fixture.getChildren().size());
    }

    /**
     * Run the void setEnd(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testSetEnd_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity3();
        int end = 1;

        fixture.setEnd(end);

        assertEquals(end, fixture.getEnd());
    }

    /**
     * Run the void setLoc(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testSetLoc_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity4();
        int loc = 1;

        fixture.setLoc(loc);

        assertEquals(loc, fixture.getLoc());
    }

    /**
     * Run the void setName(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testSetName_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity();
        String name = "";

        fixture.setName(name);

        assertEquals(name, fixture.getName());
    }

    /**
     * Run the void setStart(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testSetStart_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity2();
        int start = 1;

        fixture.setStart(start);

        assertEquals(start, fixture.getStart());
    }

    /**
     * Run the void setStatic(boolean) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testSetStatic_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity3();
        boolean isStatic = true;

        fixture.setStatic(isStatic);

        assertEquals(isStatic, fixture.isStatic());
    }

    /**
     * Run the void setType(CodeEntityType) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    @Test
    public void testSetType_1() throws Exception
    {
        CodeEntity fixture = CodeEntityFactory.createCodeEntity4();
        CodeEntityType type = CodeEntityType.CLASS;

        fixture.setType(type);

        assertEquals(type, fixture.getType());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:45 PM
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
     * @generatedBy CodePro at 5/30/15 3:45 PM
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
     * @generatedBy CodePro at 5/30/15 3:45 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(CodeEntityTest.class);
    }
}