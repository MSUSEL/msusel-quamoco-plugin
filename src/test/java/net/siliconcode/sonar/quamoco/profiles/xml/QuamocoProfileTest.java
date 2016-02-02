package net.siliconcode.sonar.quamoco.profiles.xml;

import java.util.Set;
import org.junit.*;
import static org.junit.Assert.*;
import com.thoughtworks.xstream.XStream;

/**
 * The class <code>QuamocoProfileTest</code> contains tests for the class <code>{@link QuamocoProfile}</code>.
 *
 * @generatedBy CodePro at 1/26/16 6:35 PM
 * @author fate
 * @version $Revision: 1.0 $
 */
public class QuamocoProfileTest {
    /**
     * Run the QuamocoProfile(String) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testQuamocoProfile_1()
        throws Exception
    {
        String language = "";

        QuamocoProfile result = new QuamocoProfile(language);

        // add additional test code here
        assertNotNull(result);
        assertEquals("<profile lang=\"\"/>", result.toXml());
        fail("unverified");
    }

    /**
     * Run the RuleRepo addRepo(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testAddRepo_1()
        throws Exception
    {
        QuamocoProfile fixture = new QuamocoProfile("");
        String repoKey = null;

        RuleRepo result = fixture.addRepo(repoKey);

        // add additional test code here
        assertEquals(null, result);
        fail("unverified");
    }

    /**
     * Run the RuleRepo addRepo(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testAddRepo_2()
        throws Exception
    {
        QuamocoProfile fixture = new QuamocoProfile("");
        String repoKey = "";

        RuleRepo result = fixture.addRepo(repoKey);

        // add additional test code here
        assertEquals(null, result);
        fail("unverified");
    }

    /**
     * Run the RuleRepo addRepo(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testAddRepo_3()
        throws Exception
    {
        QuamocoProfile fixture = new QuamocoProfile("");
        String repoKey = "";

        RuleRepo result = fixture.addRepo(repoKey);

        // add additional test code here
        assertEquals(null, result);
        fail("unverified");
    }

    /**
     * Run the XStream createXStream() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testCreateXStream_1()
        throws Exception
    {

        XStream result = QuamocoProfile.createXStream();

        // add additional test code here
        assertNotNull(result);
        fail("unverified");
    }

    /**
     * Run the Set<RuleRepo> getRepos() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testGetRepos_1()
        throws Exception
    {
        QuamocoProfile fixture = new QuamocoProfile("");

        Set<RuleRepo> result = fixture.getRepos();

        // add additional test code here
        assertNotNull(result);
        assertEquals(0, result.size());
        fail("unverified");
    }

    /**
     * Run the void removeRepo(RuleRepo) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testRemoveRepo_1()
        throws Exception
    {
        QuamocoProfile fixture = new QuamocoProfile("");
        RuleRepo repo = null;

        fixture.removeRepo(repo);

        // add additional test code here
        fail("unverified");
    }

    /**
     * Run the void removeRepo(RuleRepo) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testRemoveRepo_2()
        throws Exception
    {
        QuamocoProfile fixture = new QuamocoProfile("");
        RuleRepo repo = new RuleRepo("", new String[] {});

        fixture.removeRepo(repo);

        // add additional test code here
        fail("unverified");
    }

    /**
     * Run the String toXml() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 1/26/16 6:35 PM
     */
    @Test
    public void testToXml_1()
        throws Exception
    {
        QuamocoProfile fixture = new QuamocoProfile("");

        String result = fixture.toXml();

        // add additional test code here
        assertEquals("<profile lang=\"\"/>", result);
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
        new org.junit.runner.JUnitCore().run(QuamocoProfileTest.class);
    }
}