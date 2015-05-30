package net.siliconcode.quamoco.aggregator.qm;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>QualityModelTest</code> contains tests for the class <code>{@link QualityModel}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:27 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QualityModelTest {
    /**
     * Run the QualityModel(String,String,String,String,String) constructor test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testQualityModel_1()
        throws Exception
    {
        String name = "";
        String description = "";
        String originatesFrom = "";
        String taggedBy = "";
        String id = "";

        QualityModel result = new QualityModel(name, description, originatesFrom, taggedBy, id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getTaggedBy());
        assertEquals("", result.getOriginatesFrom());
        assertEquals("", result.getDescription());
        assertEquals("", result.getName());
        assertEquals("", result.getId());
    }

    /**
     * Run the void addEntity(Entity) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddEntity_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Entity ent = null;

        fixture.addEntity(ent);

        // add additional test code here
    }

    /**
     * Run the void addEntity(Entity) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddEntity_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Entity ent = new Entity("", "", "", "", "", "");

        fixture.addEntity(ent);

        // add additional test code here
    }

    /**
     * Run the void addEntity(Entity) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddEntity_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Entity ent = new Entity("", "", "", "", "", "");

        fixture.addEntity(ent);

        // add additional test code here
    }

    /**
     * Run the void addEvaluation(Evaluation) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddEvaluation_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Evaluation eval = null;

        fixture.addEvaluation(eval);

        // add additional test code here
    }

    /**
     * Run the void addEvaluation(Evaluation) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddEvaluation_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Evaluation eval = new Evaluation("", "", "", 1.0, "", "", "", "");
        eval.addRanking(new Ranking("", "", "", "", "", "", "", ""));

        fixture.addEvaluation(eval);

        // add additional test code here
    }

    /**
     * Run the void addEvaluation(Evaluation) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddEvaluation_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Evaluation eval = new Evaluation("", "", "", 1.0, "", "", "", "");
        eval.addRanking(new Ranking("", "", "", "", "", "", "", ""));

        fixture.addEvaluation(eval);

        // add additional test code here
    }

    /**
     * Run the void addFactor(Factor) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddFactor_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Factor fac = null;

        fixture.addFactor(fac);

        // add additional test code here
    }

    /**
     * Run the void addFactor(Factor) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddFactor_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Factor fac = new Factor("", "", "", "", "", "", "");

        fixture.addFactor(fac);

        // add additional test code here
    }

    /**
     * Run the void addMeasure(Measure) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddMeasure_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Measure meas = null;

        fixture.addMeasure(meas);

        // add additional test code here
    }

    /**
     * Run the void addMeasure(Measure) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddMeasure_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Measure meas = new Measure("", "", "", "", "", "", "", "", "");

        fixture.addMeasure(meas);

        // add additional test code here
    }

    /**
     * Run the void addMeasure(Measure) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddMeasure_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Measure meas = new Measure("", "", "", "", "", "", "", "", "");

        fixture.addMeasure(meas);

        // add additional test code here
    }

    /**
     * Run the void addMethod(MeasurementMethod) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddMethod_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        MeasurementMethod mm = null;

        fixture.addMethod(mm);

        // add additional test code here
    }

    /**
     * Run the void addMethod(MeasurementMethod) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddMethod_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        MeasurementMethod mm = new MeasurementMethod("", "", "", "", "", "", "", "");

        fixture.addMethod(mm);

        // add additional test code here
    }

    /**
     * Run the void addMethod(MeasurementMethod) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddMethod_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        MeasurementMethod mm = new MeasurementMethod("", "", "", "", "", "", "", "");

        fixture.addMethod(mm);

        // add additional test code here
    }

    /**
     * Run the void addRequires(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddRequires_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String req = null;

        fixture.addRequires(req);

        // add additional test code here
    }

    /**
     * Run the void addRequires(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddRequires_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String req = "";

        fixture.addRequires(req);

        // add additional test code here
    }

    /**
     * Run the void addRequires(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddRequires_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String req = "";

        fixture.addRequires(req);

        // add additional test code here
    }

    /**
     * Run the void addRequires(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddRequires_4()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String req = "";

        fixture.addRequires(req);

        // add additional test code here
    }

    /**
     * Run the void addSource(Source) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddSource_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Source src = null;

        fixture.addSource(src);

        // add additional test code here
    }

    /**
     * Run the void addSource(Source) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddSource_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Source src = new Source("", "", "");

        fixture.addSource(src);

        // add additional test code here
    }

    /**
     * Run the void addSource(Source) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddSource_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Source src = new Source("", "", "");

        fixture.addSource(src);

        // add additional test code here
    }

    /**
     * Run the void addTag(Tag) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddTag_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Tag tag = null;

        fixture.addTag(tag);

        // add additional test code here
    }

    /**
     * Run the void addTag(Tag) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddTag_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Tag tag = new Tag("", "", "");

        fixture.addTag(tag);

        // add additional test code here
    }

    /**
     * Run the void addTag(Tag) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddTag_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Tag tag = new Tag("", "", "");

        fixture.addTag(tag);

        // add additional test code here
    }

    /**
     * Run the void addTool(Tool) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddTool_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Tool tool = null;

        fixture.addTool(tool);

        // add additional test code here
    }

    /**
     * Run the void addTool(Tool) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddTool_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Tool tool = new Tool("", "", "", "");

        fixture.addTool(tool);

        // add additional test code here
    }

    /**
     * Run the void addTool(Tool) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddTool_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Tool tool = new Tool("", "", "", "");

        fixture.addTool(tool);

        // add additional test code here
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        QualityModel obj = new QualityModel("", "", "", "", "");
        obj.addSource(new Source("", "", ""));
        obj.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        obj.addTool(new Tool("", "", "", ""));
        obj.addTag(new Tag("", "", ""));
        obj.addRequires("");
        obj.addFactor(new Factor("", "", "", "", "", "", ""));
        obj.addEntity(new Entity("", "", "", "", "", ""));
        obj.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        obj.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Object obj = null;

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_4()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Object obj = new QualityModel("", "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_5()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Object obj = new QualityModel("", "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_6()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Object obj = new QualityModel("", "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_7()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Object obj = new QualityModel("", "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_8()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Object obj = new QualityModel("", "", "", "", "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_9()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", (String) null, "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Object obj = new QualityModel("", "", "", (String) null, "");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the AbstractQMEntity find(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testFind_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String id = "";

        AbstractQMEntity result = fixture.find(id);

        // add additional test code here
        assertNotNull(result);
        assertEquals("", result.getDescription());
        assertEquals("", result.getName());
        assertEquals("", result.getId());
    }

    /**
     * Run the List<AbstractQMEntity> getContained() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetContained_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        List<AbstractQMEntity> result = fixture.getContained();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the String getDescription() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetDescription_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        String result = fixture.getDescription();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the List<Evaluation> getEvaluations() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetEvaluations_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        List<Evaluation> result = fixture.getEvaluations();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the List<Factor> getFactors() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetFactors_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        List<Factor> result = fixture.getFactors();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the String getId() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetId_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        String result = fixture.getId();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the List<Measure> getMeasures() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetMeasures_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        List<Measure> result = fixture.getMeasures();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the List<MeasurementMethod> getMethods() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetMethods_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        List<MeasurementMethod> result = fixture.getMethods();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the String getName() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetName_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        String result = fixture.getName();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getOriginatesFrom() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetOriginatesFrom_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        String result = fixture.getOriginatesFrom();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the String getTaggedBy() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetTaggedBy_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        String result = fixture.getTaggedBy();

        // add additional test code here
        assertEquals("", result);
    }

    /**
     * Run the boolean hasKey(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testHasKey_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String id = "";

        boolean result = fixture.hasKey(id);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean hasKey(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testHasKey_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String id = "";

        boolean result = fixture.hasKey(id);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testHashCode_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel((String) null, (String) null, "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(923521, result);
    }

    /**
     * Run the int hashCode() method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testHashCode_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", (String) null, (String) null, "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));

        int result = fixture.hashCode();

        // add additional test code here
        assertEquals(923521, result);
    }

    /**
     * Run the void removeEntity(Entity) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveEntity_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Entity ent = null;

        fixture.removeEntity(ent);

        // add additional test code here
    }

    /**
     * Run the void removeEntity(Entity) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveEntity_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Entity ent = new Entity("", "", "", "", "", "");

        fixture.removeEntity(ent);

        // add additional test code here
    }

    /**
     * Run the void removeEntity(Entity) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveEntity_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Entity ent = new Entity("", "", "", "", "", "");

        fixture.removeEntity(ent);

        // add additional test code here
    }

    /**
     * Run the void removeEvaluation(Evaluation) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveEvaluation_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Evaluation eval = null;

        fixture.removeEvaluation(eval);

        // add additional test code here
    }

    /**
     * Run the void removeEvaluation(Evaluation) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveEvaluation_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Evaluation eval = new Evaluation("", "", "", 1.0, "", "", "", "");

        fixture.removeEvaluation(eval);

        // add additional test code here
    }

    /**
     * Run the void removeEvaluation(Evaluation) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveEvaluation_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Evaluation eval = new Evaluation("", "", "", 1.0, "", "", "", "");
        eval.addRanking(new Ranking("", "", "", "", "", "", "", ""));

        fixture.removeEvaluation(eval);

        // add additional test code here
    }

    /**
     * Run the void removeEvaluation(Evaluation) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveEvaluation_4()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Evaluation eval = new Evaluation("", "", "", 1.0, "", "", "", "");
        eval.addRanking(new Ranking("", "", "", "", "", "", "", ""));

        fixture.removeEvaluation(eval);

        // add additional test code here
    }

    /**
     * Run the void removeFactor(Factor) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveFactor_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Factor fac = null;

        fixture.removeFactor(fac);

        // add additional test code here
    }

    /**
     * Run the void removeFactor(Factor) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveFactor_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Factor fac = new Factor("", "", "", "", "", "", "");

        fixture.removeFactor(fac);

        // add additional test code here
    }

    /**
     * Run the void removeFactor(Factor) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveFactor_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Factor fac = new Factor("", "", "", "", "", "", "");

        fixture.removeFactor(fac);

        // add additional test code here
    }

    /**
     * Run the void removeMeasure(Measure) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveMeasure_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Measure meas = null;

        fixture.removeMeasure(meas);

        // add additional test code here
    }

    /**
     * Run the void removeMeasure(Measure) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveMeasure_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Measure meas = new Measure("", "", "", "", "", "", "", "", "");

        fixture.removeMeasure(meas);

        // add additional test code here
    }

    /**
     * Run the void removeMeasure(Measure) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveMeasure_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Measure meas = new Measure("", "", "", "", "", "", "", "", "");

        fixture.removeMeasure(meas);

        // add additional test code here
    }

    /**
     * Run the void removeMethod(MeasurementMethod) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveMethod_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        MeasurementMethod mm = null;

        fixture.removeMethod(mm);

        // add additional test code here
    }

    /**
     * Run the void removeMethod(MeasurementMethod) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveMethod_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        MeasurementMethod mm = new MeasurementMethod("", "", "", "", "", "", "", "");

        fixture.removeMethod(mm);

        // add additional test code here
    }

    /**
     * Run the void removeMethod(MeasurementMethod) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveMethod_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        MeasurementMethod mm = new MeasurementMethod("", "", "", "", "", "", "", "");

        fixture.removeMethod(mm);

        // add additional test code here
    }

    /**
     * Run the void removeRequires(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveRequires_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String req = null;

        fixture.removeRequires(req);

        // add additional test code here
    }

    /**
     * Run the void removeRequires(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveRequires_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String req = "";

        fixture.removeRequires(req);

        // add additional test code here
    }

    /**
     * Run the void removeRequires(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveRequires_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String req = "";

        fixture.removeRequires(req);

        // add additional test code here
    }

    /**
     * Run the void removeRequires(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveRequires_4()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String req = "";

        fixture.removeRequires(req);

        // add additional test code here
    }

    /**
     * Run the void removeSource(Source) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveSource_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Source src = null;

        fixture.removeSource(src);

        // add additional test code here
    }

    /**
     * Run the void removeSource(Source) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveSource_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Source src = new Source("", "", "");

        fixture.removeSource(src);

        // add additional test code here
    }

    /**
     * Run the void removeSource(Source) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveSource_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Source src = new Source("", "", "");

        fixture.removeSource(src);

        // add additional test code here
    }

    /**
     * Run the void removeTag(AbstractQMEntity) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveTag_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        AbstractQMEntity tag = null;

        fixture.removeTag(tag);

        // add additional test code here
    }

    /**
     * Run the void removeTag(AbstractQMEntity) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveTag_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        AbstractQMEntity tag = new Entity("", "", "", "", "", "");

        fixture.removeTag(tag);

        // add additional test code here
    }

    /**
     * Run the void removeTag(AbstractQMEntity) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveTag_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        AbstractQMEntity tag = new Entity("", "", "", "", "", "");

        fixture.removeTag(tag);

        // add additional test code here
    }

    /**
     * Run the void removeTool(Tool) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveTool_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Tool tool = null;

        fixture.removeTool(tool);

        // add additional test code here
    }

    /**
     * Run the void removeTool(Tool) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveTool_2()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Tool tool = new Tool("", "", "", "");

        fixture.removeTool(tool);

        // add additional test code here
    }

    /**
     * Run the void removeTool(Tool) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveTool_3()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        Tool tool = new Tool("", "", "", "");

        fixture.removeTool(tool);

        // add additional test code here
    }

    /**
     * Run the void setDescription(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetDescription_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String description = "";

        fixture.setDescription(description);

        // add additional test code here
    }

    /**
     * Run the void setId(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetId_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String id = "";

        fixture.setId(id);

        // add additional test code here
    }

    /**
     * Run the void setName(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetName_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String name = "";

        fixture.setName(name);

        // add additional test code here
    }

    /**
     * Run the void setOriginatesFrom(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetOriginatesFrom_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String originatesFrom = "";

        fixture.setOriginatesFrom(originatesFrom);

        // add additional test code here
    }

    /**
     * Run the void setTaggedBy(String) method test.
     *
     * @throws Exception
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetTaggedBy_1()
        throws Exception
    {
        QualityModel fixture = new QualityModel("", "", "", "", "");
        fixture.addSource(new Source("", "", ""));
        fixture.addEvaluation(new Evaluation("", "", "", 1.0, "", "", "", ""));
        fixture.addTool(new Tool("", "", "", ""));
        fixture.addTag(new Tag("", "", ""));
        fixture.addRequires("");
        fixture.addFactor(new Factor("", "", "", "", "", "", ""));
        fixture.addEntity(new Entity("", "", "", "", "", ""));
        fixture.addMethod(new MeasurementMethod("", "", "", "", "", "", "", ""));
        fixture.addMeasure(new Measure("", "", "", "", "", "", "", "", ""));
        String taggedBy = "";

        fixture.setTaggedBy(taggedBy);

        // add additional test code here
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     *
     * @generatedBy CodePro at 5/30/15 3:27 PM
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(QualityModelTest.class);
    }
}