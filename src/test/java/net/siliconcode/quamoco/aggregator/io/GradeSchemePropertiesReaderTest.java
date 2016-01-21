package net.siliconcode.quamoco.aggregator.io;

import static org.junit.Assert.*;
import net.siliconcode.quamoco.aggregator.Grade;
import net.siliconcode.quamoco.io.GradeSchemePropertiesReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>GradeSchemePropertiesReaderTest</code> contains tests for the
 * class <code>{@link GradeSchemePropertiesReader}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:42 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class GradeSchemePropertiesReaderTest {

    /**
     * Run the GradeSchemePropertiesReader() constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testGradeSchemePropertiesReader_1() throws Exception
    {
        GradeSchemePropertiesReader fixture = new GradeSchemePropertiesReader();

        assertNotNull(fixture);
    }

    /**
     * Run the void read() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testRead_1() throws Exception
    {
        GradeSchemePropertiesReader fixture = new GradeSchemePropertiesReader();
        fixture.read();

        assertEquals(1.5, Grade.A.getUpperThreshold(), 0.01);
        assertEquals(0.98, Grade.A.getLowerThreshold(), 0.01);

        assertEquals(0.98, Grade.B.getUpperThreshold(), 0.01);
        assertEquals(0.96, Grade.B.getLowerThreshold(), 0.01);

        assertEquals(0.96, Grade.C.getUpperThreshold(), 0.01);
        assertEquals(0.94, Grade.C.getLowerThreshold(), 0.01);

        assertEquals(0.94, Grade.D.getUpperThreshold(), 0.01);
        assertEquals(0.92, Grade.D.getLowerThreshold(), 0.01);

        assertEquals(0.92, Grade.E.getUpperThreshold(), 0.01);
        assertEquals(0.90, Grade.E.getLowerThreshold(), 0.01);

        assertEquals(0.90, Grade.F.getUpperThreshold(), 0.01);
        assertEquals(0.0, Grade.F.getLowerThreshold(), 0.01);

        assertEquals(0.0, Grade.U.getUpperThreshold(), 0.01);
        assertEquals(-1.0, Grade.U.getLowerThreshold(), 0.01);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:42 PM
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
     * @generatedBy CodePro at 5/30/15 3:42 PM
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
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(GradeSchemePropertiesReaderTest.class);
    }
}