package net.siliconcode.quamoco.aggregator.io;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import net.siliconcode.quamoco.aggregator.qm.Annotation;
import net.siliconcode.quamoco.aggregator.qm.Evaluation;
import net.siliconcode.quamoco.aggregator.qm.Factor;
import net.siliconcode.quamoco.aggregator.qm.Function;
import net.siliconcode.quamoco.aggregator.qm.Influence;
import net.siliconcode.quamoco.aggregator.qm.Measure;
import net.siliconcode.quamoco.aggregator.qm.MeasurementMethod;
import net.siliconcode.quamoco.aggregator.qm.QualityModel;
import net.siliconcode.quamoco.aggregator.qm.Ranking;
import net.siliconcode.quamoco.aggregator.qm.Source;
import net.siliconcode.quamoco.aggregator.qm.Tag;
import net.siliconcode.quamoco.aggregator.qm.Tool;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>QMReaderTest</code> contains tests for the class
 * <code>{@link QMReader}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:42 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QMReaderTest {

    /**
     * Run the QMReader() constructor test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testQMReader_1() throws Exception
    {
        QMReader result = new QMReader();

        // TODO: add additional test code here
        assertNotNull(result);
    }

    /**
     * Run the QualityModel getModel() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testGetModel_1() throws Exception
    {
        QMReader fixture = new QMReader();

        QualityModel result = fixture.getModel();

        assertNotNull(result);
    }

    /**
     * Run the void read(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testRead_1() throws Exception
    {
        QMReader fixture = new QMReader();

        fixture.read("testdata/test.qm");

        QualityModel result = fixture.getModel();

        assertNotNull(result);
        assertEquals("test", result.getName());
        assertEquals(
                "This module contains the part of the base quality model that is specific for the programming language Java.    ",
                result.getDescription());
        assertEquals("_nTsl8AczEd-2cMROGu2IWg", result.getId());
        assertEquals("root.qm#_R7EQ4U8cEeCyVsuO56b1rA", result.getTaggedBy());
        assertEquals(1, result.getFactors().size());
        assertEquals(1, result.getEvaluations().size());
        assertEquals(3, result.getMeasures().size());
        assertEquals(3, result.getMethods().size());
        assertEquals(1, result.getRequires().size());
        assertEquals(1, result.getTools().size());
        assertEquals(1, result.getTags().size());
        assertEquals(1, result.getSources().size());
        assertEquals("object.qm#_vVIPYKUsEd-NpKpUUyVKCQ", result.getRequires().get(0));

        Factor fac = result.getFactors().get(0);
        assertEquals("test.qm#_9Ir9hYXWEeCT8pJoQsn4HQ", fac.getId());
        assertEquals(
                "An source code identifier is conform to naming convention regarding capitalization if no coding conventions rule of the respective programming language, which restricts capitalization, is violated. Domain, technology, library and project coding conventions are excluded.",
                fac.getDescription());
        assertEquals("Conformity to Naming Convention regarding Capitalization", fac.getName());
        assertEquals(null, fac.getTitle());
        assertEquals("root.qm#_ztWGsIeSEeCvOcxPw9PG9g", fac.getRefines());
        assertEquals("root.qm#_n3OgULtaEd-4Dvfk12g7Xw", fac.getCharacterises());
        assertEquals(1, fac.getInfluences().size());
        assertEquals(null, fac.getAnnotation());

        Influence inf = fac.getInfluences().get(0);
        assertEquals("test.qm#_96AFtIXWEeCT8pJoQsn4HQ", inf.getId());
        assertEquals(
                "Analyzability is positively influenced because people reading the source code are used to patterns of the coding convention.",
                inf.getJustification());
        assertEquals("POSITIVE", inf.getEffect());
        assertEquals("root.qm#_hCU1x-P0Ed6mXujsf-O9qQ", inf.getTarget());

        Evaluation eval = result.getEvaluations().get(0);
        assertEquals("test.qm#_2j4dEJGlEeC4ia6L3LOvxA", eval.getId());
        assertEquals(
                "a measure that validates that everything that should have been cloned is actually cloned is missing",
                eval.getDescription());
        assertEquals("WeightedSumMultiMeasureEvaluation", eval.getName());
        assertEquals("50", eval.getCompleteness());
        assertEquals("object.qm#_9UAcsoXWEeCT8pJoQsn4HQ", eval.getEvaluates());
        assertEquals(2, eval.getRankings().size());

        Ranking rank1 = eval.getRankings().get(0);
        assertEquals("test.qm#_eRtawJv6EeCW5eP_GFwpfw", rank1.getId());
        assertEquals("test.qm#_paC_EhdREeCWcbKUk5fWYg", rank1.getMeasure());
        assertEquals(null, rank1.getFactor());
        assertEquals("CLASS", rank1.getRange());
        assertEquals("1", rank1.getRank());
        assertEquals("0.75", rank1.getWeight());
        assertEquals("root.qm#_6wmhsOHIEd-_QLJMFBuPpg", rank1.getNormalizationMeasure());
        assertNotNull(rank1.getFunction());

        Function fn1 = rank1.getFunction();
        assertEquals("test.qm#_eRtawZv6EeCW5eP_GFwpfw", fn1.getId());
        assertEquals("qm:LinearDecreasingFunction", fn1.getType());
        assertEquals(0.0, fn1.getLowerBound(), 0.00001);
        assertEquals(0.02115295067208891, fn1.getUpperBound(), 0.00001);

        Ranking rank2 = eval.getRankings().get(1);
        assertEquals("test.qm#_eRtawpv6EeCW5eP_GFwpfw", rank2.getId());
        assertEquals(null, rank2.getMeasure());
        assertEquals("test.qm#_pZ9fsRdREeCWcbKUk5fWYg", rank2.getFactor());
        assertEquals("CLASS", rank2.getRange());
        assertEquals("2", rank2.getRank());
        assertEquals("0.25", rank2.getWeight());
        assertEquals("root.qm#_6wmhsOHIEd-_QLJMFBuPpg", rank2.getNormalizationMeasure());
        assertNotNull(rank2.getFunction());

        Function fn2 = rank2.getFunction();
        assertEquals("test.qm#_eRtaw5v6EeCW5eP_GFwpfw", fn2.getId());
        assertEquals("qm:LinearDecreasingFunction", fn2.getType());
        assertEquals(0.0, fn2.getLowerBound(), 0.00001);
        assertEquals(0.01254260186066505, fn2.getUpperBound(), 0.00001);

        Measure meas1 = result.getMeasures().get(0);
        assertEquals("test.qm#_paBxQxdREeCWcbKUk5fWYg", meas1.getId());
        assertEquals(
                "\"This class defines a covariant version of the equals() method, but inherits the normal equals(Object) method defined in the base java.lang.Object class.\r\n"
                        + "The class should probably define a boolean equals(Object) method.\" [1]",
                meas1.getDescription());
        assertEquals("Covariant equals() method defined, Object.equals(Object) inherited", meas1.getName());
        assertEquals("FINDINGS", meas1.getType());
        assertEquals("root.qm#_uliZAQQNEeGSsdo78OGnBA", meas1.getOriginatesFrom());
        assertTrue(meas1.getParents().contains("object.qm#_9U50kIXWEeCT8pJoQsn4HQ"));
        assertTrue(meas1.getParents().contains("object.qm#_9Y7Y8IXWEeCT8pJoQsn4HQ"));
        assertTrue(meas1.getMeasures().isEmpty());
        assertNull(meas1.getCharacterises());
        assertNull(meas1.getRefines());
        assertNull(meas1.getTaggedBy());
        assertNull(meas1.getTitle());

        Measure meas2 = result.getMeasures().get(1);
        assertEquals("test.qm#_s1W3wPDPEd-dO4k3YfzrzA", meas2.getId());
        assertEquals(
                "\"This rule warns if a non-constant public static field is found. In a multi-threaded environment access to those fields must be synchronized. \" [1]",
                meas2.getDescription());
        assertEquals("Non constant and static", meas2.getName());
        assertEquals("FINDINGS", meas2.getType());
        assertTrue(meas2.getParents().contains("test.qm#_9j89MIXWEeCT8pJoQsn4HQ"));
        assertTrue(meas2.getMeasures().isEmpty());
        assertTrue(meas2.getAnnotations().isEmpty());
        assertNull(meas2.getCharacterises());
        assertNull(meas2.getRefines());
        assertNull(meas2.getTaggedBy());
        assertNull(meas2.getTitle());

        Measure meas3 = result.getMeasures().get(2);
        assertEquals("qm:NormalizationMeasure", meas3.getType());
        assertEquals("test.qm#_y3MI4MTqEeCkhKnv06OAoA", meas3.getId());
        assertEquals("The number of classes, interfaces, and enums.", meas3.getDescription());
        assertEquals("#Types", meas3.getName());

        MeasurementMethod mm1 = result.getMethods().get(0);
        assertEquals("qm:ToolBasedInstrument", mm1.getType());
        assertEquals("test.qm#_9LpQ43MWEd-Ywpz7Oo8Ghw", mm1.getId());
        assertEquals("test.qm#_qwch0JuUEd6lZqfHOw9WKg", mm1.getDetermines());
        assertEquals("test.qm#_D6iLF6UeEd-NpKpUUyVKCQ", mm1.getTool());
        assertEquals("Insufficient Comment", mm1.getMetric());
        assertNotNull(mm1.getAnnotation());

        Annotation mm1a = mm1.getAnnotation();
        assertEquals("test.qm#_oQk9IKucEeCjgf2sYoj_Lg", mm1a.getId());
        assertEquals("Block-Id", mm1a.getKey());
        assertEquals("edu.tum.cs.conqat.quamoco.model.QJavaDoc", mm1a.getValue());

        MeasurementMethod mm2 = result.getMethods().get(1);
        assertEquals("qm:ToolBasedInstrument", mm2.getType());
        assertEquals("test.qm#_pZ9fmBdREeCWcbKUk5fWYg", mm2.getId());
        assertEquals("test.qm#_lpVKU1qYEeC1KZOCQoCvzA", mm2.getDetermines());
        assertEquals("test.qm#_D6lOQKUeEd-NpKpUUyVKCQ", mm2.getTool());
        assertEquals("UWF_UNWRITTEN_FIELD", mm2.getMetric());
        assertEquals("root.qm#_uliZAQQNEeGSsdo78OGnBA", mm2.getOriginatesFrom());

        MeasurementMethod mm3 = result.getMethods().get(2);
        assertEquals("qm:ToolBasedInstrument", mm3.getType());
        assertEquals("test.qm#_6hvW0ab7EeCXmfDlLBltgw", mm3.getId());
        assertEquals("test.qm#_iCg1kB5IEeCp6rP-KrdnJA", mm3.getTool());
        assertEquals("#Statements", mm3.getMetric());
        assertEquals("object.qm#_nTzIGVqYEeC1KZOCQoCvzA", mm3.getDetermines());

        Tool tool = result.getTools().get(0);
        assertEquals("test.qm#_D6iLF6UeEd-NpKpUUyVKCQ", tool.getId());
        assertEquals("The tool JavaDoc Analysis.", tool.getDescription());
        assertEquals("JavaDoc Analysis", tool.getName());
        assertNotNull(tool.getAnnotation());

        Annotation ann1 = tool.getAnnotation();
        assertEquals("test.qm#_oQVFhaucEeCjgf2sYoj_Lg", ann1.getId());
        assertEquals("Block-Id", ann1.getKey());
        assertEquals("edu.tum.cs.conqat.quamoco.model.QJavaDoc", ann1.getValue());

        Tag tag = result.getTags().get(0);
        assertEquals("test.qm#_WAAF8E8cEeCyVsuO56b1rA", tag.getId());
        assertEquals("component", tag.getDescription());
        assertEquals("component", tag.getName());

        Source src = result.getSources().get(0);
        assertEquals("test.qm#_IcgR4KPMEd-Pv7j9Ez0GHQ", src.getId());
        assertEquals(
                "ISO/IEC FCD 25010: Systems and software engineering - System and software product Quality Requirements and Evaluation (SQuaRE) - System and software quality models. http://www.iso.org/iso/catalogue_detail.htm?csnumber=35733. Accessed on 01.11.2011.",
                src.getDescription());
        assertEquals("ISO 25010 v1.81", src.getName());
        assertNotNull(src.getAnnotation());

        Annotation ann2 = src.getAnnotation();
        assertEquals("test.qm#_z38MgARqEeGUKsTjqjurSA", ann2.getId());
        assertEquals("url", ann2.getKey());
        assertEquals("http://www.iso.org/iso/catalogue_detail.htm?csnumber=35733", ann2.getValue());
    }

    /**
     * Run the void read(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testRead_2() throws Exception
    {
        QMReader fixture = new QMReader();

        fixture.read("");

        QualityModel result = fixture.getModel();

        assertNotNull(result);
        assertEquals("", result.getName());
    }

    /**
     * Run the void read(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:42 PM
     */
    @Test
    public void testRead_3() throws Exception
    {
        QMReader fixture = new QMReader();

        fixture.read(null);

        QualityModel result = fixture.getModel();

        assertNotNull(result);
        assertEquals("", result.getName());
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
        new org.junit.runner.JUnitCore().run(QMReaderTest.class);
    }
}