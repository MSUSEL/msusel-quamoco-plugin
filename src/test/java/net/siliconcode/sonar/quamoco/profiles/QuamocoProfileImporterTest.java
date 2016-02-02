package net.siliconcode.sonar.quamoco.profiles;

import java.io.PipedReader;
import java.io.Reader;
import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;
import org.sonar.api.profiles.RulesProfile;
import org.sonar.api.rules.RuleFinder;
import org.sonar.api.utils.ValidationMessages;

/**
 * The class <code>QuamocoProfileImporterTest</code> contains tests for the class <code>{@link QuamocoProfileImporter}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class QuamocoProfileImporterTest {
    /**
     * Run the QuamocoProfileImporter(RuleFinder) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testQuamocoProfileImporter_1()
        throws Exception
    {
        RuleFinder ruleFinder = EasyMock.createMock(RuleFinder.class);
        // add mock object expectations here

        EasyMock.replay(ruleFinder);

        QuamocoProfileImporter result = new QuamocoProfileImporter(ruleFinder);

        // add additional test code here
        EasyMock.verify(ruleFinder);
        assertNotNull(result);
        assertEquals("QuamocoProfileImporter[key=quamoco,name=Quamoco,languages={java,cs}]", result.toString());
        assertEquals("Quamoco", result.getName());
        assertEquals("quamoco", result.getKey());
        fail("unverified");
    }

    /**
     * Run the RulesProfile importProfile(Reader,ValidationMessages) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testImportProfile_1()
        throws Exception
    {
        QuamocoProfileImporter fixture = new QuamocoProfileImporter(EasyMock.createNiceMock(RuleFinder.class));
        Reader findbugsConf = new PipedReader();
        ValidationMessages messages = ValidationMessages.create();

        RulesProfile result = fixture.importProfile(findbugsConf, messages);

        // add additional test code here
        assertNotNull(result);
        assertEquals(null, result.getParentName());
        assertEquals(null, result.getUsed());
        assertEquals(-1, result.getVersion());
        assertEquals(Boolean.FALSE, result.getDefaultProfile());
        assertEquals("[name=null,language=null]", result.toString());
        assertEquals(null, result.getName());
        assertEquals(null, result.getLanguage());
        assertEquals(null, result.getId());
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Before
    public void setUp()
        throws Exception
    {
        // add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @After
    public void tearDown()
        throws Exception
    {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args the command line arguments
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(QuamocoProfileImporterTest.class);
    }
}