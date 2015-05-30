package net.siliconcode.quamoco.aggregator.io;

import java.util.Map;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;
import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>AbstractQuamocoReaderTest</code> contains tests for the class <code>{@link AbstractQuamocoReader}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:42 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class AbstractQuamocoReaderTest {
    /**
     * Run the Map<String, String> getAttributes(XMLStreamReader) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testGetAttributes_1()
        throws Exception
    {
        AbstractQuamocoReader fixture = new QMRReader();
        XMLStreamReader reader = EasyMock.createMock(XMLStreamReader.class);
        // TODO: add mock object expectations here

        EasyMock.replay(reader);

        Map<String, String> result = fixture.getAttributes(reader);

        // TODO: add additional test code here
        EasyMock.verify(reader);
        assertNotNull(result);
        assertEquals(0, result.size());
        fail("unverified");
    }

    /**
     * Run the Map<String, String> getAttributes(XMLStreamReader) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testGetAttributes_2()
        throws Exception
    {
        AbstractQuamocoReader fixture = new QMRReader();
        XMLStreamReader reader = EasyMock.createMock(XMLStreamReader.class);
        // TODO: add mock object expectations here

        EasyMock.replay(reader);

        Map<String, String> result = fixture.getAttributes(reader);

        // TODO: add additional test code here
        EasyMock.verify(reader);
        assertNotNull(result);
        assertEquals(0, result.size());
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Before
    public void setUp()
        throws Exception
    {
        // TODO: add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @After
    public void tearDown()
        throws Exception
    {
        // TODO: add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(AbstractQuamocoReaderTest.class);
    }
}