package net.siliconcode.quamoco.model.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>InfluenceTest</code> contains tests for the class
 * <code>{@link Influence}</code>.
 *
 * @generatedBy CodePro at 6/6/15 1:35 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class InfluenceTest {

    /**
     * Run the Influence(String,String,String,String) constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testInfluence_1() throws Exception
    {
        InfluenceEffect effect = InfluenceEffect.POSITIVE;
        String justification = "";
        Target target = new Target("");
        String id = "";

        Influence result = new Influence(effect, justification, target, id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getJustification());
        assertEquals("POSITIVE", result.getEffect().toString());
        assertEquals("", result.getId());
        assertEquals("", result.getTarget().getHREF());
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", null, "");
        Object obj = new Influence(InfluenceEffect.POSITIVE, "", null, "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_2() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", null, "");
        Object obj = null;

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_3() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", null, "");
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_4() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", null, "");
        Object obj = new Influence(InfluenceEffect.POSITIVE, "", null, "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_5() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", null, "");
        Object obj = new Influence(InfluenceEffect.POSITIVE, "", null, "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_6() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", null, "");
        Object obj = new Influence(InfluenceEffect.POSITIVE, "", null, "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_7() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", null, "");
        Object obj = new Influence(InfluenceEffect.POSITIVE, "", null, "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testEquals_8() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", null, "");
        Object obj = new Influence(InfluenceEffect.POSITIVE, "", null, "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the String getEffect() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetEffect_1() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", null, "");

        String result = fixture.getEffect().toString();

        // add additional test code here
        assertEquals("POSITIVE", result);
    }

    /**
     * Run the String getId() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetId_1() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", null, "");

        String result = fixture.getId();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getJustification() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetJustification_1() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", null, "");

        String result = fixture.getJustification();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTarget() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testGetTarget_1() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", new Target(""), "");

        String result = fixture.getTarget().getHREF();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the void setEffect(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetEffect_1() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", null, "");
        String effect = "NEGATIVE";

        fixture.setEffect(InfluenceEffect.valueOf(effect));

        assertEquals(effect, fixture.getEffect().toString());
    }

    /**
     * Run the void setId(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetId_1() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", null, "");
        String id = "";

        fixture.setId(id);

        assertEquals(id, fixture.getId());
    }

    /**
     * Run the void setJustification(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetJustification_1() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", null, "");
        String justification = "";

        fixture.setJustification(justification);

        assertEquals(justification, fixture.getJustification());
    }

    /**
     * Run the void setTarget(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    @Test
    public void testSetTarget_1() throws Exception
    {
        Influence fixture = new Influence(InfluenceEffect.POSITIVE, "", null, "");
        String target = "";

        fixture.setTarget(new Target(target));

        assertEquals(target, fixture.getTarget().getHREF());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 6/6/15 1:35 PM
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
     * @generatedBy CodePro at 6/6/15 1:35 PM
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
     * @generatedBy CodePro at 6/6/15 1:35 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(InfluenceTest.class);
    }
}