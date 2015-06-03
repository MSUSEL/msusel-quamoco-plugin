package net.siliconcode.sonar.quamoco;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>MetricsContextTest</code> contains tests for the class
 * <code>{@link MetricsContext}</code>.
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
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testMetricsContext_1() throws Exception
    {

        MetricsContext result = new MetricsContext();

        assertNotNull(result);
        assertEquals(0, result.getTotalNOC());
        assertEquals(0, result.getTotalNOF());
        assertEquals(0, result.getTotalNOM());
        assertEquals(0, result.getTotalNOT());
        assertEquals(0, result.getTotalNOV());
        assertEquals(0, result.getTotalLOC());
        assertEquals(0, result.getTotalNOS());
    }

    /**
     * Run the int getFileLOC(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileLOC_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";

        int result = fixture.getFileLOC(fileName);

        assertEquals(-1, result);
    }

    /**
     * Run the int getFileLOC(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileLOC_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";

        int result = fixture.getFileLOC(fileName);

        assertEquals(-1, result);
    }

    /**
     * Run the int getFileNOC(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOC_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOC(file);

        assertEquals(-1, result);
    }

    /**
     * Run the int getFileNOC(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOC_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOC(file);

        assertEquals(-1, result);
    }

    /**
     * Run the int getFileNOF(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOF_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";

        int result = fixture.getFileNOF(fileName);

        assertEquals(-1, result);
    }

    /**
     * Run the int getFileNOF(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOF_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";

        int result = fixture.getFileNOF(fileName);

        assertEquals(-1, result);
    }

    /**
     * Run the int getFileNOM(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOM_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOM(file);

        assertEquals(-1, result);
    }

    /**
     * Run the int getFileNOM(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOM_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "other";
        fixture.setFileNOM("", 1);
        int result = fixture.getFileNOM(file);

        assertEquals(-1, result);
    }

    /**
     * Run the int getFileNOS(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOS_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOS(file);

        assertEquals(-1, result);
    }

    /**
     * Run the int getFileNOS(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOS_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOS(file);

        assertEquals(-1, result);
    }

    /**
     * Run the int getFileNOT(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOT_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOT(file);

        assertEquals(-1, result);
    }

    /**
     * Run the int getFileNOT(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOT_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOT(file);

        assertEquals(-1, result);
    }

    /**
     * Run the int getFileNOV(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOV_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOV(file);

        assertEquals(-1, result);
    }

    /**
     * Run the int getFileNOV(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetFileNOV_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";

        int result = fixture.getFileNOV(file);

        assertEquals(-1, result);
    }

    /**
     * Run the int getMethodLOC(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetMethodLOC_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";
        fixture.setMethodLOC(method, 1);

        int result = fixture.getMethodLOC(method);

        assertEquals(1, result);
    }

    /**
     * Run the int getMethodLOC(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetMethodLOC_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";

        int result = fixture.getMethodLOC(method);

        assertEquals(-1, result);
    }

    /**
     * Run the int getMethodNOS(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetMethodNOS_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";

        int result = fixture.getMethodNOS(method);

        assertEquals(-1, result);
    }

    /**
     * Run the int getMethodNOS(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetMethodNOS_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";

        int result = fixture.getMethodNOS(method);

        assertEquals(-1, result);
    }

    /**
     * Run the int getTotalLOC() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTotalLOC_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();

        int result = fixture.getTotalLOC();

        assertEquals(0, result);
    }

    /**
     * Run the int getTotalNOC() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTotalNOC_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();

        int result = fixture.getTotalNOC();

        assertEquals(0, result);
    }

    /**
     * Run the int getTotalNOF() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTotalNOF_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();

        int result = fixture.getTotalNOF();

        assertEquals(0, result);
    }

    /**
     * Run the int getTotalNOM() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTotalNOM_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();

        int result = fixture.getTotalNOM();

        assertEquals(0, result);
    }

    /**
     * Run the int getTotalNOS() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTotalNOS_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();

        int result = fixture.getTotalNOS();

        assertEquals(0, result);
    }

    /**
     * Run the int getTotalNOT() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTotalNOT_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();

        int result = fixture.getTotalNOT();

        assertEquals(0, result);
    }

    /**
     * Run the int getTotalNOV() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTotalNOV_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();

        int result = fixture.getTotalNOV();

        assertEquals(0, result);
    }

    /**
     * Run the int getTypeLOC(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeLOC_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeLOC(type);

        assertEquals(-1, result);
    }

    /**
     * Run the int getTypeLOC(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeLOC_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeLOC(type);

        assertEquals(-1, result);
    }

    /**
     * Run the int getTypeNOF(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOF_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeNOF(type);

        assertEquals(-1, result);
    }

    /**
     * Run the int getTypeNOF(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOF_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeNOF(type);

        assertEquals(-1, result);
    }

    /**
     * Run the int getTypeNOM(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOM_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeNOM(type);

        assertEquals(-1, result);
    }

    /**
     * Run the int getTypeNOM(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOM_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "other";
        fixture.setTypeNOM("", 1);

        int result = fixture.getTypeNOM(type);

        assertEquals(-1, result);
    }

    /**
     * Run the int getTypeNOS(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOS_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeNOS(type);

        assertEquals(-1, result);
    }

    /**
     * Run the int getTypeNOS(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOS_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeNOS(type);

        assertEquals(-1, result);
    }

    /**
     * Run the int getTypeNOV(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOV_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeNOV(type);

        assertEquals(-1, result);
    }

    /**
     * Run the int getTypeNOV(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testGetTypeNOV_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";

        int result = fixture.getTypeNOV(type);

        assertEquals(-1, result);
    }

    /**
     * Run the void setFileLOC(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileLOC_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";
        int loc = 1;

        fixture.setFileLOC(fileName, loc);

        assertEquals(loc, fixture.getFileLOC(fileName));
    }

    /**
     * Run the void setFileLOC(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileLOC_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = null;
        int loc = 1;

        fixture.setFileLOC(fileName, loc);

        assertEquals(-1, fixture.getFileLOC(fileName));
    }

    /**
     * Run the void setFileLOC(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileLOC_3() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";
        int loc = -1;

        fixture.setFileLOC(fileName, loc);

        assertEquals(loc, fixture.getFileLOC(fileName));
    }

    /**
     * Run the void setFileNOC(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOC_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int noc = 1;

        fixture.setFileNOC(file, noc);

        assertEquals(noc, fixture.getFileNOC(file));
    }

    /**
     * Run the void setFileNOC(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOC_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = null;
        int noc = 1;

        fixture.setFileNOC(file, noc);

        assertEquals(-1, fixture.getFileNOC(file));
    }

    /**
     * Run the void setFileNOC(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOC_3() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int noc = -1;

        fixture.setFileNOC(file, noc);

        assertEquals(noc, fixture.getFileNOC(file));
    }

    /**
     * Run the void setFileNOF(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOF_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";
        int nof = 1;

        fixture.setFileNOF(fileName, nof);

        assertEquals(nof, fixture.getFileNOF(fileName));
    }

    /**
     * Run the void setFileNOF(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOF_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = null;
        int nof = 1;

        fixture.setFileNOF(fileName, nof);

        assertEquals(-1, fixture.getFileNOF(fileName));
    }

    /**
     * Run the void setFileNOF(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOF_3() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String fileName = "";
        int nof = -1;

        fixture.setFileNOF(fileName, nof);

        assertEquals(nof, fixture.getFileNOF(fileName));
    }

    /**
     * Run the void setFileNOM(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOM_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int nom = 1;

        fixture.setFileNOM(file, nom);

        assertEquals(nom, fixture.getFileNOM(file));
    }

    /**
     * Run the void setFileNOM(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOM_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = null;
        int nom = 1;

        fixture.setFileNOM(file, nom);

        assertEquals(-1, fixture.getFileNOM(file));
    }

    /**
     * Run the void setFileNOM(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOM_3() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int nom = -1;

        fixture.setFileNOM(file, nom);

        assertEquals(nom, fixture.getFileNOM(file));
    }

    /**
     * Run the void setFileNOS(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOS_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int nos = 1;

        fixture.setFileNOS(file, nos);

        assertEquals(nos, fixture.getFileNOS(file));
    }

    /**
     * Run the void setFileNOS(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOS_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = null;
        int nos = 1;

        fixture.setFileNOS(file, nos);

        assertEquals(-1, fixture.getFileNOS(file));
    }

    /**
     * Run the void setFileNOS(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOS_3() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int nos = -1;

        fixture.setFileNOS(file, nos);

        assertEquals(nos, fixture.getFileNOS(file));
    }

    /**
     * Run the void setFileNOT(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOT_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int not = 1;

        fixture.setFileNOT(file, not);

        assertEquals(not, fixture.getFileNOT(file));
    }

    /**
     * Run the void setFileNOT(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOT_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = null;
        int not = 1;

        fixture.setFileNOT(file, not);

        assertEquals(-1, fixture.getFileNOT(file));
    }

    /**
     * Run the void setFileNOT(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOT_3() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int not = -1;

        fixture.setFileNOT(file, not);

        assertEquals(not, fixture.getFileNOT(file));
    }

    /**
     * Run the void setFileNOV(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOV_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int nov = 1;

        fixture.setFileNOV(file, nov);

        assertEquals(nov, fixture.getFileNOV(file));
    }

    /**
     * Run the void setFileNOV(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOV_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = null;
        int nov = 1;

        fixture.setFileNOV(file, nov);

        assertEquals(-1, fixture.getFileNOV(file));
    }

    /**
     * Run the void setFileNOV(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetFileNOV_3() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String file = "";
        int nov = -1;

        fixture.setFileNOV(file, nov);

        assertEquals(nov, fixture.getFileNOV(file));
    }

    /**
     * Run the void setMethodLOC(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetMethodLOC_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";
        int loc = 1;

        fixture.setMethodLOC(method, loc);

        assertEquals(loc, fixture.getMethodLOC(method));
    }

    /**
     * Run the void setMethodLOC(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetMethodLOC_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = null;
        int loc = 1;

        fixture.setMethodLOC(method, loc);

        assertEquals(-1, fixture.getMethodLOC(method));
    }

    /**
     * Run the void setMethodLOC(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetMethodLOC_3() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";
        int loc = -1;

        fixture.setMethodLOC(method, loc);

        assertEquals(loc, fixture.getMethodLOC(method));
    }

    /**
     * Run the void setMethodNOS(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetMethodNOS_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";
        int nos = 1;

        fixture.setMethodNOS(method, nos);

        assertEquals(nos, fixture.getMethodNOS(method));
    }

    /**
     * Run the void setMethodNOS(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetMethodNOS_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = null;
        int nos = 1;

        fixture.setMethodNOS(method, nos);

        assertEquals(-1, fixture.getMethodNOS(method));
    }

    /**
     * Run the void setMethodNOS(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetMethodNOS_3() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String method = "";
        int nos = -1;

        fixture.setMethodNOS(method, nos);

        assertEquals(nos, fixture.getMethodNOS(method));
    }

    /**
     * Run the void setTotalLOC(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalLOC_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int loc = 0;

        fixture.setTotalLOC(loc);

        assertEquals(loc, fixture.getTotalLOC());
    }

    /**
     * Run the void setTotalLOC(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalLOC_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int loc = 1;

        fixture.setTotalLOC(loc);

        assertEquals(loc, fixture.getTotalLOC());
    }

    /**
     * Run the void setTotalNOC(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOC_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int noc = 0;

        fixture.setTotalNOC(noc);

        assertEquals(noc, fixture.getTotalNOC());
    }

    /**
     * Run the void setTotalNOC(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOC_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int noc = 1;

        fixture.setTotalNOC(noc);

        assertEquals(noc, fixture.getTotalNOC());
    }

    /**
     * Run the void setTotalNOF(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOF_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nof = 0;

        fixture.setTotalNOF(nof);

        assertEquals(nof, fixture.getTotalNOF());
    }

    /**
     * Run the void setTotalNOF(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOF_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nof = 1;

        fixture.setTotalNOF(nof);

        assertEquals(nof, fixture.getTotalNOF());
    }

    /**
     * Run the void setTotalNOM(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOM_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nom = 0;

        fixture.setTotalNOM(nom);

        assertEquals(nom, fixture.getTotalNOM());
    }

    /**
     * Run the void setTotalNOM(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOM_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nom = 1;

        fixture.setTotalNOM(nom);

        assertEquals(nom, fixture.getTotalNOM());
    }

    /**
     * Run the void setTotalNOS(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOS_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nos = 0;

        fixture.setTotalNOS(nos);

        assertEquals(nos, fixture.getTotalNOS());
    }

    /**
     * Run the void setTotalNOS(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOS_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nos = 1;

        fixture.setTotalNOS(nos);

        assertEquals(nos, fixture.getTotalNOS());
    }

    /**
     * Run the void setTotalNOT(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOT_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int not = 0;

        fixture.setTotalNOT(not);

        assertEquals(not, fixture.getTotalNOT());
    }

    /**
     * Run the void setTotalNOT(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOT_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int not = 1;

        fixture.setTotalNOT(not);

        assertEquals(not, fixture.getTotalNOT());
    }

    /**
     * Run the void setTotalNOV(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOV_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nov = 0;

        fixture.setTotalNOV(nov);

        assertEquals(nov, fixture.getTotalNOV());
    }

    /**
     * Run the void setTotalNOV(int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTotalNOV_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        int nov = 1;

        fixture.setTotalNOV(nov);

        assertEquals(nov, fixture.getTotalNOV());
    }

    /**
     * Run the void setTypeLOC(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeLOC_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int loc = 1;

        fixture.setTypeLOC(type, loc);

        assertEquals(loc, fixture.getTypeLOC(type));
    }

    /**
     * Run the void setTypeLOC(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeLOC_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = null;
        int loc = 1;

        fixture.setTypeLOC(type, loc);

        assertEquals(-1, fixture.getTypeLOC(type));
    }

    /**
     * Run the void setTypeLOC(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeLOC_3() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int loc = -1;

        fixture.setTypeLOC(type, loc);

        assertEquals(loc, fixture.getTypeLOC(type));
    }

    /**
     * Run the void setTypeNOF(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOF_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nof = 1;

        fixture.setTypeNOF(type, nof);

        assertEquals(nof, fixture.getTypeNOF(type));
    }

    /**
     * Run the void setTypeNOF(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOF_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = null;
        int nof = 1;

        fixture.setTypeNOF(type, nof);

        assertEquals(-1, fixture.getTypeNOF(type));
    }

    /**
     * Run the void setTypeNOF(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOF_3() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nof = -1;

        fixture.setTypeNOF(type, nof);

        assertEquals(nof, fixture.getTypeNOF(type));
    }

    /**
     * Run the void setTypeNOM(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOM_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nom = 1;

        fixture.setTypeNOM(type, nom);

        assertEquals(nom, fixture.getTypeNOM(type));
    }

    /**
     * Run the void setTypeNOM(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOM_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = null;
        int nom = 1;

        fixture.setTypeNOM(type, nom);

        assertEquals(-1, fixture.getTypeNOM(type));
    }

    /**
     * Run the void setTypeNOM(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOM_3() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nom = -1;

        fixture.setTypeNOM(type, nom);

        assertEquals(nom, fixture.getTypeNOM(type));
    }

    /**
     * Run the void setTypeNOS(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOS_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nos = 1;

        fixture.setTypeNOS(type, nos);

        assertEquals(nos, fixture.getTypeNOS(type));
    }

    /**
     * Run the void setTypeNOS(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOS_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = null;
        int nos = 1;

        fixture.setTypeNOS(type, nos);

        assertEquals(-1, fixture.getTypeNOS(type));
    }

    /**
     * Run the void setTypeNOS(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOS_3() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nos = -1;

        fixture.setTypeNOS(type, nos);

        assertEquals(nos, fixture.getTypeNOS(type));
    }

    /**
     * Run the void setTypeNOV(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOV_1() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nov = 1;

        fixture.setTypeNOV(type, nov);

        assertEquals(nov, fixture.getTypeNOV(type));
    }

    /**
     * Run the void setTypeNOV(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOV_2() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = null;
        int nov = 1;

        fixture.setTypeNOV(type, nov);

        assertEquals(-1, fixture.getTypeNOV(type));
    }

    /**
     * Run the void setTypeNOV(String,int) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    @Test
    public void testSetTypeNOV_3() throws Exception
    {
        MetricsContext fixture = new MetricsContext();
        String type = "";
        int nov = -1;

        fixture.setTypeNOV(type, nov);

        assertEquals(nov, fixture.getTypeNOV(type));
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:44 PM
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
     * @generatedBy CodePro at 5/30/15 3:44 PM
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
     * @generatedBy CodePro at 5/30/15 3:44 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(MetricsContextTest.class);
    }
}