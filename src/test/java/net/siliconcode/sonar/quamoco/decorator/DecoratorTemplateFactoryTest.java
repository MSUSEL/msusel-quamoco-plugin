package net.siliconcode.sonar.quamoco.decorator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>DecoratorTemplateFactoryTest</code> contains tests for the
 * class <code>{@link DecoratorTemplateFactory}</code>.
 *
 * @generatedBy CodePro at 6/6/15 1:22 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class DecoratorTemplateFactoryTest {

    /**
     * Run the IDecoratorTemplate createDecoratorTemplate(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testCreateDecoratorTemplate_1() throws Exception
    {
        DecoratorTemplateFactory fixture = DecoratorTemplateFactory.getInstance();
        String language = "";

        IDecoratorTemplate result = fixture.createDecoratorTemplate(language);

        // add additional test code here
        assertNotNull(result);
        assertTrue(result instanceof NullDecorator);
    }

    /**
     * Run the IDecoratorTemplate createDecoratorTemplate(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testCreateDecoratorTemplate_2() throws Exception
    {
        DecoratorTemplateFactory fixture = DecoratorTemplateFactory.getInstance();
        String language = "java";

        IDecoratorTemplate result = fixture.createDecoratorTemplate(language);

        // add additional test code here
        assertNotNull(result);
        assertTrue(result instanceof JavaDecorator);
    }

    /**
     * Run the IDecoratorTemplate createDecoratorTemplate(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testCreateDecoratorTemplate_3() throws Exception
    {
        DecoratorTemplateFactory fixture = DecoratorTemplateFactory.getInstance();
        String language = "cs";

        IDecoratorTemplate result = fixture.createDecoratorTemplate(language);

        // add additional test code here
        assertNotNull(result);
        assertTrue(result instanceof CSharpDecorator);
    }

    /**
     * Run the DecoratorTemplateFactory getInstance() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    @Test
    public void testGetInstance_1() throws Exception
    {

        DecoratorTemplateFactory result = DecoratorTemplateFactory.getInstance();

        DecoratorTemplateFactory result2 = DecoratorTemplateFactory.getInstance();

        assertNotNull(result);
        assertSame(result, result2);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 6/6/15 1:22 PM
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
     * @generatedBy CodePro at 6/6/15 1:22 PM
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
     * @generatedBy CodePro at 6/6/15 1:22 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(DecoratorTemplateFactoryTest.class);
    }
}