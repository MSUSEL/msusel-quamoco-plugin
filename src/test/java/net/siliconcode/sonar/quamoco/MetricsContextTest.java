package net.siliconcode.sonar.quamoco;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MetricsContextTest</code> contains tests for the class <code>{@link MetricsContext}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:44 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class MetricsContextTest {
    /**
     * Run the MetricsContext() constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testMetricsContext_1()
        throws Exception
    {

        MetricsContext result = new MetricsContext();

        // TODO: add additional test code here
        assertNotNull(result);
        assertEquals(0, result.getTotalNOC());
        assertEquals(0, result.getTotalNOF());
        assertEquals(0, result.getTotalNOM());
        assertEquals(0, result.getTotalNOT());
        assertEquals(0, result.getTotalNOV());
        assertEquals(0, result.getTotalLOC());
        assertEquals(0, result.getTotalNOS());
        fail("unverified");
    }

    /**
     * Run the int getFileLOC(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileLOC_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";

        int result = fixture.getFileLOC(fileName);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getFileLOC(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileLOC_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";

        int result = fixture.getFileLOC(fileName);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getFileNOC(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOC_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOC(file);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getFileNOC(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOC_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOC(file);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getFileNOF(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOF_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";

        int result = fixture.getFileNOF(fileName);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getFileNOF(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOF_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";

        int result = fixture.getFileNOF(fileName);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getFileNOM(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOM_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOM(file);

        // TODO: add additional test code here
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the int getFileNOM(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOM_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOM(file);

        // TODO: add additional test code here
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the int getFileNOS(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOS_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOS(file);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getFileNOS(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOS_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOS(file);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getFileNOT(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOT_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOT(file);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getFileNOT(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOT_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOT(file);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getFileNOV(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOV_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOV(file);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getFileNOV(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOV_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOV(file);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getMethodLOC(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetMethodLOC_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";
        int loc = 1;

        int result = fixture.getMethodLOC(method, loc);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getMethodLOC(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetMethodLOC_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";
        int loc = 1;

        int result = fixture.getMethodLOC(method, loc);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getMethodNOS(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetMethodNOS_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";

        int result = fixture.getMethodNOS(method);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getMethodNOS(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetMethodNOS_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";

        int result = fixture.getMethodNOS(method);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getTotalLOC() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTotalLOC_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();

        int result = fixture.getTotalLOC();

        // TODO: add additional test code here
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the int getTotalNOC() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTotalNOC_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();

        int result = fixture.getTotalNOC();

        // TODO: add additional test code here
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the int getTotalNOF() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTotalNOF_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();

        int result = fixture.getTotalNOF();

        // TODO: add additional test code here
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the int getTotalNOM() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTotalNOM_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();

        int result = fixture.getTotalNOM();

        // TODO: add additional test code here
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the int getTotalNOS() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTotalNOS_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();

        int result = fixture.getTotalNOS();

        // TODO: add additional test code here
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the int getTotalNOT() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTotalNOT_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();

        int result = fixture.getTotalNOT();

        // TODO: add additional test code here
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the int getTotalNOV() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTotalNOV_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();

        int result = fixture.getTotalNOV();

        // TODO: add additional test code here
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the int getTypeLOC(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeLOC_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeLOC(type);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getTypeLOC(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeLOC_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeLOC(type);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getTypeNOF(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOF_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeNOF(type);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getTypeNOF(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOF_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeNOF(type);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getTypeNOM(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOM_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeNOM(type);

        // TODO: add additional test code here
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the int getTypeNOM(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOM_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeNOM(type);

        // TODO: add additional test code here
        assertEquals(0, result);
        fail("unverified");
    }

    /**
     * Run the int getTypeNOS(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOS_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeNOS(type);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getTypeNOS(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOS_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeNOS(type);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getTypeNOV(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOV_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeNOV(type);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the int getTypeNOV(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOV_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeNOV(type);

        // TODO: add additional test code here
        assertEquals(-1, result);
        fail("unverified");
    }

    /**
     * Run the void setFileLOC(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileLOC_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";
        int loc = 1;

        fixture.setFileLOC(fileName, loc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileLOC(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileLOC_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = null;
        int loc = 1;

        fixture.setFileLOC(fileName, loc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileLOC(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileLOC_3()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";
        int loc = -1;

        fixture.setFileLOC(fileName, loc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOC(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOC_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int noc = 1;

        fixture.setFileNOC(file, noc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOC(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOC_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = null;
        int noc = 1;

        fixture.setFileNOC(file, noc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOC(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOC_3()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int noc = -1;

        fixture.setFileNOC(file, noc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOF(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOF_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";
        int nof = 1;

        fixture.setFileNOF(fileName, nof);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOF(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOF_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = null;
        int nof = 1;

        fixture.setFileNOF(fileName, nof);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOF(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOF_3()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";
        int nof = -1;

        fixture.setFileNOF(fileName, nof);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOM(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOM_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int nom = 1;

        fixture.setFileNOM(file, nom);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOM(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOM_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = null;
        int nom = 1;

        fixture.setFileNOM(file, nom);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOM(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOM_3()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int nom = -1;

        fixture.setFileNOM(file, nom);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOS(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOS_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int nos = 1;

        fixture.setFileNOS(file, nos);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOS(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOS_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = null;
        int nos = 1;

        fixture.setFileNOS(file, nos);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOS(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOS_3()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int nos = -1;

        fixture.setFileNOS(file, nos);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOT(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOT_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int not = 1;

        fixture.setFileNOT(file, not);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOT(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOT_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = null;
        int not = 1;

        fixture.setFileNOT(file, not);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOT(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOT_3()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int not = -1;

        fixture.setFileNOT(file, not);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOV(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOV_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int nov = 1;

        fixture.setFileNOV(file, nov);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOV(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOV_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = null;
        int nov = 1;

        fixture.setFileNOV(file, nov);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setFileNOV(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOV_3()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int nov = -1;

        fixture.setFileNOV(file, nov);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setMethodLOC(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetMethodLOC_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";
        int loc = 1;

        fixture.setMethodLOC(method, loc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setMethodLOC(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetMethodLOC_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = null;
        int loc = 1;

        fixture.setMethodLOC(method, loc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setMethodLOC(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetMethodLOC_3()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";
        int loc = -1;

        fixture.setMethodLOC(method, loc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setMethodNOS(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetMethodNOS_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";
        int nos = 1;

        fixture.setMethodNOS(method, nos);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setMethodNOS(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetMethodNOS_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = null;
        int nos = 1;

        fixture.setMethodNOS(method, nos);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setMethodNOS(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetMethodNOS_3()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";
        int nos = -1;

        fixture.setMethodNOS(method, nos);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTotalLOC(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalLOC_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int loc = -1;

        fixture.setTotalLOC(loc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTotalLOC(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalLOC_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int loc = 1;

        fixture.setTotalLOC(loc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTotalNOC(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOC_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int noc = -1;

        fixture.setTotalNOC(noc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTotalNOC(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOC_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int noc = 1;

        fixture.setTotalNOC(noc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTotalNOF(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOF_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nof = -1;

        fixture.setTotalNOF(nof);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTotalNOF(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOF_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nof = 1;

        fixture.setTotalNOF(nof);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTotalNOM(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOM_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nom = -1;

        fixture.setTotalNOM(nom);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTotalNOM(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOM_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nom = 1;

        fixture.setTotalNOM(nom);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTotalNOS(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOS_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nos = -1;

        fixture.setTotalNOS(nos);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTotalNOS(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOS_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nos = 1;

        fixture.setTotalNOS(nos);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTotalNOT(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOT_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int not = -1;

        fixture.setTotalNOT(not);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTotalNOT(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOT_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int not = 1;

        fixture.setTotalNOT(not);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTotalNOV(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOV_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nov = -1;

        fixture.setTotalNOV(nov);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTotalNOV(int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOV_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nov = 1;

        fixture.setTotalNOV(nov);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTypeLOC(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeLOC_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int loc = 1;

        fixture.setTypeLOC(type, loc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTypeLOC(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeLOC_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = null;
        int loc = 1;

        fixture.setTypeLOC(type, loc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTypeLOC(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeLOC_3()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int loc = -1;

        fixture.setTypeLOC(type, loc);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTypeNOF(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOF_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nof = 1;

        fixture.setTypeNOF(type, nof);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTypeNOF(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOF_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = null;
        int nof = 1;

        fixture.setTypeNOF(type, nof);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTypeNOF(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOF_3()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nof = -1;

        fixture.setTypeNOF(type, nof);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTypeNOM(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOM_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nom = 1;

        fixture.setTypeNOM(type, nom);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTypeNOM(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOM_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = null;
        int nom = 1;

        fixture.setTypeNOM(type, nom);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTypeNOM(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOM_3()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nom = -1;

        fixture.setTypeNOM(type, nom);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTypeNOS(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOS_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nos = 1;

        fixture.setTypeNOS(type, nos);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTypeNOS(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOS_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = null;
        int nos = 1;

        fixture.setTypeNOS(type, nos);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTypeNOS(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOS_3()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nos = -1;

        fixture.setTypeNOS(type, nos);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTypeNOV(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOV_1()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nov = 1;

        fixture.setTypeNOV(type, nov);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTypeNOV(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOV_2()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = null;
        int nov = 1;

        fixture.setTypeNOV(type, nov);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Run the void setTypeNOV(String,int) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOV_3()
        throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nov = -1;

        fixture.setTypeNOV(type, nov);

        // TODO: add additional test code here
        fail("unverified");
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:44 PM
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
     * @generatedBy CodePro at 5/30/15 3:44 PM
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
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(MetricsContextTest.class);
    }
}