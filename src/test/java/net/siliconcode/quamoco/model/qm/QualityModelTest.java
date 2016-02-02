package net.siliconcode.quamoco.model.qm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The class <code>QualityModelTest</code> contains tests for the class
 * <code>{@link QualityModel}</code>.
 *
 * @generatedBy CodePro at 5/30/15 3:27 PM
 * @author isaac
 * @version $Revision: 1.0 $
 */
public class QualityModelTest {

    private QualityModel fixture;

    /**
     * Run the QualityModel(String,String,String,String,String) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testQualityModel_1() throws Exception
    {
        String name = null;
        String description = "desc";
        String originatesFrom = "href";
        String taggedBy = "tag";
        String id = "id";

        try
        {
            new QualityModel(name, description, new OriginatesFrom(originatesFrom), new TaggedBy(taggedBy), id);
            fail();
        }
        catch (IllegalArgumentException e)
        {
        }
    }

    /**
     * Run the QualityModel(String,String,String,String,String) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testQualityModel_2() throws Exception
    {
        String name = "";
        String description = "desc";
        String originatesFrom = "href";
        String taggedBy = "tag";
        String id = "id";

        try
        {
            new QualityModel(name, description, new OriginatesFrom(originatesFrom), new TaggedBy(taggedBy), id);

            fail();
        }
        catch (IllegalArgumentException e)
        {
        }
    }

    /**
     * Run the QualityModel(String,String,String,String,String) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testQualityModel_3() throws Exception
    {
        String name = "name";
        String description = "desc";
        String originatesFrom = "href";
        String taggedBy = "tag";
        String id = null;

        try
        {
            new QualityModel(name, description, new OriginatesFrom(originatesFrom), new TaggedBy(taggedBy), id);

            fail();
        }
        catch (IllegalArgumentException e)
        {
        }
    }

    /**
     * Run the QualityModel(String,String,String,String,String) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testQualityModel_4() throws Exception
    {
        String name = "name";
        String description = "desc";
        String originatesFrom = "href";
        String taggedBy = "tag";
        String id = "";

        try
        {
            new QualityModel(name, description, new OriginatesFrom(originatesFrom), new TaggedBy(taggedBy), id);

            fail();
        }
        catch (IllegalArgumentException e)
        {
        }
    }

    /**
     * Run the QualityModel(String,String,String,String,String) constructor
     * test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testQualityModel_5() throws Exception
    {
        String name = "name";
        String description = "desc";
        String originatesFrom = "href";
        String taggedBy = "tag";
        String id = "id";

        try
        {
            QualityModel result = new QualityModel(name, description, new OriginatesFrom(originatesFrom),
                    new TaggedBy(taggedBy), id);

            // add additional test code here
            assertNotNull(result);
            assertEquals("tag", result.getTaggedBy().getHREF());
            assertEquals("href", result.getOriginatesFrom().getHREF());
            assertEquals("desc", result.getDescription());
            assertEquals("name", result.getName());
            assertEquals("id", result.getId());
        }
        catch (IllegalArgumentException e)
        {
            fail();
        }
    }

    /**
     * Run the void addEntity(Entity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddEntity_1() throws Exception
    {
        Entity ent = null;

        assertTrue(fixture.getEntities().isEmpty());
        fixture.addEntity(ent);

        // add additional test code here
        assertTrue(fixture.getEntities().isEmpty());
    }

    /**
     * Run the void addEntity(Entity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddEntity_2() throws Exception
    {
        Entity ent = new Entity("name", "", null, "", "id", null);

        assertTrue(fixture.getEntities().isEmpty());
        fixture.addEntity(ent);

        // add additional test code here
        assertFalse(fixture.getEntities().isEmpty());
    }

    /**
     * Run the void addEntity(Entity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddEntity_3() throws Exception
    {
        Entity ent = new Entity("name", "", null, "", "id", null);
        fixture.addEntity(new Entity("name", "", null, "", "id", null));

        assertFalse(fixture.getEntities().isEmpty());
        assertEquals(1, fixture.getEntities().size());
        fixture.addEntity(ent);

        // add additional test code here
        assertFalse(fixture.getEntities().isEmpty());
        assertEquals(1, fixture.getEntities().size());
    }

    /**
     * Run the void addEvaluation(Evaluation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddEvaluation_1() throws Exception
    {
        Evaluation eval = null;

        fixture.addEvaluation(eval);

        // add additional test code here
        assertTrue(fixture.getEvaluations().isEmpty());
    }

    /**
     * Run the void addEvaluation(Evaluation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddEvaluation_2() throws Exception
    {
        Evaluation eval = new Evaluation("name", "", "", 1.0, "", null, "", "id");

        fixture.addEvaluation(eval);

        // add additional test code here
        assertFalse(fixture.getEvaluations().isEmpty());
        assertEquals(1, fixture.getEvaluations().size());
    }

    /**
     * Run the void addEvaluation(Evaluation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddEvaluation_3() throws Exception
    {
        Evaluation eval = new Evaluation("name", "", "", 1.0, "", null, "", "id");

        fixture.addEvaluation(eval);

        // add additional test code here
        assertFalse(fixture.getEvaluations().isEmpty());
        assertEquals(1, fixture.getEvaluations().size());

        fixture.addEvaluation(eval);

        assertFalse(fixture.getEvaluations().isEmpty());
        assertEquals(1, fixture.getEvaluations().size());
    }

    /**
     * Run the void addFactor(Factor) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddFactor_1() throws Exception
    {
        Factor fac = null;

        fixture.addFactor(fac);

        // add additional test code here
        assertTrue(fixture.getFactors().isEmpty());
    }

    /**
     * Run the void addFactor(Factor) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddFactor_2() throws Exception
    {
        Factor fac = new Factor("factor", "", null, null, "", null, "factor");

        fixture.addFactor(fac);

        // add additional test code here
        assertFalse(fixture.getFactors().isEmpty());
        assertEquals(1, fixture.getFactors().size());
    }

    /**
     * Run the void addFactor(Factor) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddFactor_3() throws Exception
    {
        Factor fac = new Factor("factor", "", null, null, "", null, "factor");

        fixture.addFactor(fac);

        // add additional test code here
        assertFalse(fixture.getFactors().isEmpty());
        assertEquals(1, fixture.getFactors().size());

        fixture.addFactor(fac);

        assertFalse(fixture.getFactors().isEmpty());
        assertEquals(1, fixture.getFactors().size());
    }

    /**
     * Run the void addMeasure(Measure) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddMeasure_1() throws Exception
    {
        Measure meas = null;

        assertTrue(fixture.getMeasures().isEmpty());
        fixture.addMeasure(meas);

        // add additional test code here
        assertTrue(fixture.getMeasures().isEmpty());
    }

    /**
     * Run the void addMeasure(Measure) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddMeasure_2() throws Exception
    {
        Measure meas = new Measure("name", "", "", null, "", "", null, null, "id");

        assertTrue(fixture.getMeasures().isEmpty());
        fixture.addMeasure(meas);

        // add additional test code here
        assertFalse(fixture.getMeasures().isEmpty());
    }

    /**
     * Run the void addMeasure(Measure) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddMeasure_3() throws Exception
    {
        Measure meas = new Measure("name", "", "", null, "", "", null, null, "id");

        assertTrue(fixture.getMeasures().isEmpty());
        fixture.addMeasure(meas);

        // add additional test code here
        assertFalse(fixture.getMeasures().isEmpty());

        fixture.addMeasure(meas);

        assertFalse(fixture.getMeasures().isEmpty());
        assertEquals(1, fixture.getMeasures().size());
    }

    /**
     * Run the void addMethod(MeasurementMethod) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddMethod_1() throws Exception
    {
        MeasurementMethod mm = null;

        assertTrue(fixture.getMethods().isEmpty());
        fixture.addMethod(mm);

        // add additional test code here
        assertTrue(fixture.getMethods().isEmpty());
    }

    /**
     * Run the void addMethod(MeasurementMethod) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddMethod_2() throws Exception
    {
        MeasurementMethod mm = new MeasurementMethod("name", "", null, "", "", null,
                MeasurementMethodType.FINDINGS_UNION, "id");

        assertTrue(fixture.getMethods().isEmpty());
        fixture.addMethod(mm);

        // add additional test code here
        assertFalse(fixture.getMethods().isEmpty());
    }

    /**
     * Run the void addMethod(MeasurementMethod) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddMethod_3() throws Exception
    {
        MeasurementMethod mm = new MeasurementMethod("name", "", null, "", "", null,
                MeasurementMethodType.FINDINGS_UNION, "id");

        assertTrue(fixture.getMethods().isEmpty());
        fixture.addMethod(mm);

        // add additional test code here
        assertFalse(fixture.getMethods().isEmpty());
        assertEquals(1, fixture.getMethods().size());

        fixture.addMethod(mm);
        assertFalse(fixture.getMethods().isEmpty());
        assertEquals(1, fixture.getMethods().size());
    }

    /**
     * Run the void addRequires(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddRequires_1() throws Exception
    {
        Requires req = null;

        fixture.addRequires(req);

        assertTrue(fixture.getRequires().isEmpty());
    }

    /**
     * Run the void addRequires(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddRequires_2() throws Exception
    {
        Requires req = new Requires("href");

        fixture.addRequires(req);

        // add additional test code here
        assertFalse(fixture.getRequires().isEmpty());
        assertTrue(fixture.getRequires().contains(req));
    }

    /**
     * Run the void addRequires(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddRequires_3() throws Exception
    {
        Requires req = new Requires("href");

        fixture.addRequires(req);
        assertFalse(fixture.getRequires().isEmpty());
        assertTrue(fixture.getRequires().contains(req));
        assertEquals(1, fixture.getRequires().size());
        fixture.addRequires(req);
        assertEquals(1, fixture.getRequires().size());
    }

    /**
     * Run the void addRequires(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddRequires_4() throws Exception
    {
        Requires req = new Requires("href");
        Requires req2 = new Requires("href2");

        fixture.addRequires(req);
        assertFalse(fixture.getRequires().isEmpty());
        assertTrue(fixture.getRequires().contains(req));
        assertEquals(1, fixture.getRequires().size());
        fixture.addRequires(req2);
        assertEquals(2, fixture.getRequires().size());
        assertTrue(fixture.getRequires().contains(req2));
    }

    /**
     * Run the void addSource(Source) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddSource_1() throws Exception
    {
        Source src = null;

        assertTrue(fixture.getSources().isEmpty());
        fixture.addSource(src);

        // add additional test code here
        assertTrue(fixture.getSources().isEmpty());
    }

    /**
     * Run the void addSource(Source) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddSource_2() throws Exception
    {
        Source src = new Source("name", "", "id");

        assertTrue(fixture.getSources().isEmpty());
        fixture.addSource(src);

        // add additional test code here
        assertFalse(fixture.getSources().isEmpty());
    }

    /**
     * Run the void addSource(Source) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddSource_3() throws Exception
    {
        Source src = new Source("name", "", "id");

        assertTrue(fixture.getSources().isEmpty());
        fixture.addSource(src);

        // add additional test code here
        assertFalse(fixture.getSources().isEmpty());

        fixture.addSource(src);

        assertFalse(fixture.getSources().isEmpty());
        assertEquals(1, fixture.getSources().size());
    }

    /**
     * Run the void addTag(Tag) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddTag_1() throws Exception
    {
        Tag tag = null;

        assertTrue(fixture.getTags().isEmpty());
        fixture.addTag(tag);

        // add additional test code here
        assertTrue(fixture.getTags().isEmpty());
    }

    /**
     * Run the void addTag(Tag) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddTag_2() throws Exception
    {
        Tag tag = new Tag("name", "", "id");

        fixture.addTag(tag);

        // add additional test code here
        assertEquals(1, fixture.getTags().size());
        fixture.addTag(tag);
        assertEquals(1, fixture.getTags().size());
    }

    /**
     * Run the void addTag(Tag) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddTag_3() throws Exception
    {
        Tag tag = new Tag("name", "", "id");

        fixture.addTag(tag);

        // add additional test code here
        assertEquals(1, fixture.getTags().size());
    }

    /**
     * Run the void addTool(Tool) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddTool_1() throws Exception
    {
        Tool tool = null;

        assertTrue(fixture.getTools().isEmpty());
        fixture.addTool(tool);

        // add additional test code here
        assertTrue(fixture.getTools().isEmpty());
    }

    /**
     * Run the void addTool(Tool) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddTool_2() throws Exception
    {
        Tool tool = new Tool("name", "", null, "id");

        assertTrue(fixture.getTools().isEmpty());
        fixture.addTool(tool);

        // add additional test code here
        assertFalse(fixture.getTools().isEmpty());
        assertTrue(fixture.getTools().contains(tool));
    }

    /**
     * Run the void addTool(Tool) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testAddTool_3() throws Exception
    {
        Tool tool = new Tool("name", "", null, "id");

        assertTrue(fixture.getTools().isEmpty());
        fixture.addTool(tool);

        // add additional test code here
        assertFalse(fixture.getTools().isEmpty());
        assertTrue(fixture.getTools().contains(tool));

        fixture.addTool(tool);
        assertEquals(1, fixture.getTools().size());
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_1() throws Exception
    {
        QualityModel obj = new QualityModel("name", "description", new OriginatesFrom("href"), new TaggedBy("tag"),
                "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_2() throws Exception
    {
        Object obj = null;

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_3() throws Exception
    {
        Object obj = new Object();

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_4() throws Exception
    {
        Object obj = new QualityModel("name2", "description", new OriginatesFrom("href"), new TaggedBy("tag"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_5() throws Exception
    {
        Object obj = new QualityModel("name", "description", new OriginatesFrom("href"), new TaggedBy("tag"), "id2");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_6() throws Exception
    {
        Object obj = new QualityModel("name", "", new OriginatesFrom("href"), new TaggedBy("tag"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_7() throws Exception
    {
        Object obj = new QualityModel("name", "description", new OriginatesFrom("origin"), new TaggedBy("tag"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_8() throws Exception
    {
        Object obj = new QualityModel("name", "description", new OriginatesFrom("href"), new TaggedBy("other"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_9() throws Exception
    {
        Object obj = new QualityModel("name", null, new OriginatesFrom("href"), new TaggedBy("other"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_10() throws Exception
    {
        Object obj = new QualityModel("name", "description", null, new TaggedBy("other"), "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean equals(Object) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testEquals_11() throws Exception
    {
        Object obj = new QualityModel("name", "description", new OriginatesFrom("href"), null, "id");

        boolean result = fixture.equals(obj);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the AbstractQMEntity find(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testFind_1() throws Exception
    {
        fixture.addEntity(new Entity("name", "", null, "", "entity", null));
        String id = "entity";

        try
        {
            AbstractQMEntity result = fixture.find(id);

            // add additional test code here
            assertNotNull(result);
            assertEquals("", result.getDescription());
            assertEquals("name", result.getName());
            assertEquals(id, result.getId());
        }
        catch (IllegalArgumentException e)
        {
            fail();
        }
    }

    /**
     * Run the AbstractQMEntity find(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testFind_2() throws Exception
    {
        fixture.addEntity(new Entity("name", "", null, "", "entity", null));

        try
        {
            fixture.find("");
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the AbstractQMEntity find(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testFind_3() throws Exception
    {
        fixture.addEntity(new Entity("name", "", null, "", "entity", null));

        try
        {
            fixture.find(null);
            fail();
        }
        catch (IllegalArgumentException e)
        {

        }
    }

    /**
     * Run the List<AbstractQMEntity> getContained() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetContained_1() throws Exception
    {
        fixture.addEntity(new Entity("entity", "", null, "", "entity", null));
        fixture.addFactor(new Factor("factor", "", null, null, "", null, "factor"));
        List<AbstractQMEntity> result = fixture.getContained();

        // add additional test code here
        assertNotNull(result);
        assertEquals(2, result.size());
    }

    /**
     * Run the String getDescription() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetDescription_1() throws Exception
    {
        String result = fixture.getDescription();

        // add additional test code here
        assertEquals("description", result);
    }

    /**
     * Run the List<Evaluation> getEvaluations() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetEvaluations_1() throws Exception
    {
        List<Evaluation> result = fixture.getEvaluations();
        fixture.addEvaluation(new Evaluation("name", "", "", 1.0, "", null, "", "id"));

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the List<Factor> getFactors() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetFactors_1() throws Exception
    {
        fixture.addFactor(new Factor("name", "", null, null, "", null, "id"));
        List<Factor> result = fixture.getFactors();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the String getId() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetId_1() throws Exception
    {
        String result = fixture.getId();

        // add additional test code here
        assertEquals("id", result);
    }

    /**
     * Run the List<Measure> getMeasures() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetMeasures_1() throws Exception
    {
        fixture.addMeasure(new Measure("name", "", "", null, null, null, null, null, "id"));
        List<Measure> result = fixture.getMeasures();

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the List<MeasurementMethod> getMethods() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetMethods_1() throws Exception
    {
        List<MeasurementMethod> result = fixture.getMethods();
        fixture.addMethod(
                new MeasurementMethod("name", "", null, "", "", null, MeasurementMethodType.FINDINGS_UNION, "id"));

        // add additional test code here
        assertNotNull(result);
        assertEquals(1, result.size());
    }

    /**
     * Run the String getName() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetName_1() throws Exception
    {
        String result = fixture.getName();

        // add additional test code here
        assertEquals("name", result);
    }

    /**
     * Run the String getOriginatesFrom() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetOriginatesFrom_1() throws Exception
    {
        String result = fixture.getOriginatesFrom().getHREF();

        // add additional test code here
        assertEquals("href", result);
    }

    /**
     * Run the String getTaggedBy() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testGetTaggedBy_1() throws Exception
    {
        String result = fixture.getTaggedBy().getHREF();

        // add additional test code here
        assertEquals("tag", result);
    }

    /**
     * Run the boolean hasKey(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testHasKey_1() throws Exception
    {
        fixture.addTool(new Tool("name", "", null, "tool1"));
        String id = "tool1";

        boolean result = fixture.hasKey(id);

        // add additional test code here
        assertEquals(true, result);
    }

    /**
     * Run the boolean hasKey(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testHasKey_2() throws Exception
    {
        String id = null;

        boolean result = fixture.hasKey(id);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the boolean hasKey(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testHasKey_3() throws Exception
    {
        String id = "";

        boolean result = fixture.hasKey(id);

        // add additional test code here
        assertEquals(false, result);
    }

    /**
     * Run the void removeEntity(Entity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveEntity_1() throws Exception
    {
        fixture.addEntity(new Entity("name", "", null, "", "id", null));
        Entity ent = null;

        assertFalse(fixture.getEntities().isEmpty());
        fixture.removeEntity(ent);

        // add additional test code here
        assertFalse(fixture.getEntities().isEmpty());
    }

    /**
     * Run the void removeEntity(Entity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveEntity_2() throws Exception
    {
        Entity ent = new Entity("name", "", null, "", "id", null);
        fixture.addEntity(ent);

        assertFalse(fixture.getEntities().isEmpty());
        fixture.removeEntity(ent);

        // add additional test code here
        assertTrue(fixture.getEntities().isEmpty());
    }

    /**
     * Run the void removeEntity(Entity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveEntity_3() throws Exception
    {
        Entity ent = new Entity("name", "", null, "", "id", null);
        Entity ent2 = new Entity("name2", "", null, "", "id2", null);
        fixture.addEntity(ent);

        assertFalse(fixture.getEntities().isEmpty());
        fixture.removeEntity(ent2);

        // add additional test code here
        assertFalse(fixture.getEntities().isEmpty());
    }

    @Test
    public void testGetEntities_1() throws Exception
    {
        fixture.addEntity(new Entity("name", "", null, "", "id", null));

        List<Entity> result = fixture.getEntities();

        assertNotNull(result);
        assertFalse(result.isEmpty());
    }

    /**
     * Run the void removeEvaluation(Evaluation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveEvaluation_1() throws Exception
    {
        Evaluation eval = null;
        fixture.addEvaluation(new Evaluation("name", "", "", 3.0, "", null, "", "id"));

        assertEquals(1, fixture.getEvaluations().size());
        fixture.removeEvaluation(eval);

        // add additional test code here
        assertFalse(fixture.getEvaluations().isEmpty());
    }

    /**
     * Run the void removeEvaluation(Evaluation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveEvaluation_2() throws Exception
    {
        Evaluation eval = new Evaluation("name", "", "", 3.0, "", null, "", "id");
        fixture.addEvaluation(eval);

        assertEquals(1, fixture.getEvaluations().size());
        fixture.removeEvaluation(eval);

        // add additional test code here
        assertTrue(fixture.getEvaluations().isEmpty());
    }

    /**
     * Run the void removeEvaluation(Evaluation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveEvaluation_3() throws Exception
    {
        Evaluation eval = new Evaluation("name", "", "", 1.0, "", null, "", "id");
        eval.addRanking(new Ranking("ranking", "NA", "", null, null, null, "name", "rid"));

        fixture.addEvaluation(eval);

        assertFalse(fixture.getEvaluations().isEmpty());
        assertEquals(1, fixture.getContained().size());
        fixture.removeEvaluation(eval);

        // add additional test code here
        assertTrue(fixture.getEvaluations().isEmpty());
        assertTrue(fixture.getContained().isEmpty());
    }

    /**
     * Run the void removeEvaluation(Evaluation) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveEvaluation_4() throws Exception
    {
        Evaluation eval = new Evaluation("name", "", "", 1.0, "", null, "", "id");
        eval.addRanking(new Ranking("ranking", "NA", "", null, null, null, "name", "rid"));
        Evaluation eval2 = new Evaluation("other", "", "", 1.0, "", null, "", "id2");

        fixture.addEvaluation(eval);

        assertFalse(fixture.getEvaluations().isEmpty());
        assertEquals(1, fixture.getContained().size());
        fixture.removeEvaluation(eval2);

        // add additional test code here
        assertFalse(fixture.getEvaluations().isEmpty());
        assertFalse(fixture.getContained().isEmpty());
    }

    /**
     * Run the void removeFactor(Factor) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveFactor_1() throws Exception
    {
        Factor fac = null;

        fixture.addFactor(new Factor("name", "", null, null, "", null, "id"));
        assertEquals(1, fixture.getFactors().size());
        fixture.removeFactor(fac);

        // add additional test code here
        assertFalse(fixture.getFactors().isEmpty());
    }

    /**
     * Run the void removeFactor(Factor) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveFactor_2() throws Exception
    {
        Factor fac = new Factor("name", "", null, null, "", null, "id");
        fixture.addFactor(fac);

        assertFalse(fixture.getFactors().isEmpty());
        fixture.removeFactor(fac);

        // add additional test code here
        assertTrue(fixture.getFactors().isEmpty());
    }

    /**
     * Run the void removeFactor(Factor) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveFactor_3() throws Exception
    {
        Factor fac = new Factor("name", "", null, null, "", null, "id");
        fixture.addFactor(new Factor("other", "", null, null, "", null, "other_id"));

        assertFalse(fixture.getFactors().isEmpty());
        fixture.removeFactor(fac);

        // add additional test code here
        assertFalse(fixture.getFactors().isEmpty());
    }

    /**
     * Run the void removeMeasure(Measure) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveMeasure_1() throws Exception
    {
        Measure meas = new Measure("", "", "", null, "", "", null, null, "id");
        fixture.addMeasure(meas);
        meas = null;

        assertFalse(fixture.getMeasures().isEmpty());
        fixture.removeMeasure(meas);
        assertFalse(fixture.getMeasures().isEmpty());
    }

    /**
     * Run the void removeMeasure(Measure) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveMeasure_2() throws Exception
    {
        Measure meas = new Measure("", "", "", null, "", "", null, null, "id");
        fixture.addMeasure(meas);
        assertFalse(fixture.getMeasures().isEmpty());
        fixture.removeMeasure(meas);
        assertTrue(fixture.getMeasures().isEmpty());
    }

    /**
     * Run the void removeMeasure(Measure) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveMeasure_3() throws Exception
    {
        Measure meas = new Measure("", "", "", null, "", "", null, null, "id");

        fixture.addMeasure(new Measure("name", "", "", null, "", "", null, null, "id"));
        assertFalse(fixture.getMeasures().isEmpty());
        fixture.removeMeasure(meas);
        assertFalse(fixture.getMeasures().isEmpty());
    }

    /**
     * Run the void removeMethod(MeasurementMethod) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveMethod_1() throws Exception
    {
        MeasurementMethod mm = null;

        fixture.addMethod(
                new MeasurementMethod("name", "", null, null, "", null, MeasurementMethodType.TOOL_INSTRUMENT, "id"));
        assertEquals(1, fixture.getMethods().size());
        fixture.removeMethod(mm);

        // add additional test code here
        assertEquals(1, fixture.getMethods().size());
    }

    /**
     * Run the void removeMethod(MeasurementMethod) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveMethod_2() throws Exception
    {
        MeasurementMethod mm = new MeasurementMethod("name", "", null, null, "", null,
                MeasurementMethodType.TOOL_INSTRUMENT, "id");

        fixture.addMethod(mm);
        assertEquals(1, fixture.getMethods().size());
        fixture.removeMethod(mm);

        // add additional test code here
        assertTrue(fixture.getMethods().isEmpty());
    }

    /**
     * Run the void removeMethod(MeasurementMethod) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveMethod_3() throws Exception
    {
        MeasurementMethod mm = new MeasurementMethod("name", "", null, null, "", null,
                MeasurementMethodType.TOOL_INSTRUMENT, "id");

        fixture.addMethod(mm);
        MeasurementMethod mm2 = new MeasurementMethod("other", "", null, null, "", null,
                MeasurementMethodType.TOOL_INSTRUMENT, "other");
        assertEquals(1, fixture.getMethods().size());
        fixture.removeMethod(mm2);

        // add additional test code here
        assertFalse(fixture.getMethods().isEmpty());
        assertEquals(1, fixture.getMethods().size());
    }

    /**
     * Run the void removeRequires(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveRequires_1() throws Exception
    {
        Requires req = null;

        assertTrue(fixture.getRequires().isEmpty());
        fixture.removeRequires(req);

        // add additional test code here
        assertTrue(fixture.getRequires().isEmpty());
    }

    /**
     * Run the void removeRequires(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveRequires_2() throws Exception
    {
        Requires req = new Requires("href");
        fixture.addRequires(req);

        assertFalse(fixture.getRequires().isEmpty());
        fixture.removeRequires(req);

        // add additional test code here
        assertTrue(fixture.getRequires().isEmpty());
    }

    /**
     * Run the void removeRequires(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveRequires_3() throws Exception
    {
        Requires req = new Requires("href");
        Requires req2 = new Requires("other");
        fixture.addRequires(req);

        assertFalse(fixture.getRequires().isEmpty());
        fixture.removeRequires(req2);

        // add additional test code here
        assertFalse(fixture.getRequires().isEmpty());
    }

    /**
     * Run the void removeSource(Source) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveSource_1() throws Exception
    {
        fixture.addSource(new Source("name", "", "id"));
        Source src = null;

        assertFalse(fixture.getSources().isEmpty());
        fixture.removeSource(src);

        // add additional test code here
        assertFalse(fixture.getSources().isEmpty());
    }

    /**
     * Run the void removeSource(Source) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveSource_2() throws Exception
    {
        fixture.addSource(new Source("name", "", "id"));
        Source src = new Source("name", "", "id");

        assertFalse(fixture.getSources().isEmpty());
        fixture.removeSource(src);

        // add additional test code here
        assertTrue(fixture.getSources().isEmpty());
    }

    /**
     * Run the void removeSource(Source) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveSource_3() throws Exception
    {
        fixture.addSource(new Source("name", "", "id"));
        Source src = new Source("other", "", "other");

        assertFalse(fixture.getSources().isEmpty());
        fixture.removeSource(src);

        // add additional test code here
        assertFalse(fixture.getSources().isEmpty());
    }

    /**
     * Run the void removeTag(AbstractQMEntity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveTag_1() throws Exception
    {
        Tag tag = null;

        fixture.addTag(new Tag("name", "", "id"));
        assertEquals(1, fixture.getTags().size());
        fixture.removeTag(tag);

        // add additional test code here
        assertEquals(1, fixture.getTags().size());
    }

    /**
     * Run the void removeTag(AbstractQMEntity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveTag_2() throws Exception
    {
        Tag tag = new Tag("name", "", "id");
        fixture.addTag(tag);

        assertEquals(1, fixture.getTags().size());
        fixture.removeTag(tag);

        // add additional test code here
        assertTrue(fixture.getTags().isEmpty());
    }

    /**
     * Run the void removeTag(AbstractQMEntity) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveTag_3() throws Exception
    {
        Tag tag = new Tag("name", "", "id");

        fixture.addTag(new Tag("other", "", "id"));
        assertEquals(1, fixture.getTags().size());
        fixture.removeTag(tag);

        // add additional test code here
        assertFalse(fixture.getTags().isEmpty());
    }

    /**
     * Run the void removeTool(Tool) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveTool_1() throws Exception
    {
        Tool tool = null;
        fixture.addTool(new Tool("name", "", null, "id"));

        assertFalse(fixture.getTools().isEmpty());
        fixture.removeTool(tool);

        // add additional test code here
        assertFalse(fixture.getTools().isEmpty());
    }

    /**
     * Run the void removeTool(Tool) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveTool_2() throws Exception
    {
        Tool tool = new Tool("name", "", null, "id");

        fixture.addTool(tool);

        assertFalse(fixture.getTools().isEmpty());
        fixture.removeTool(tool);

        // add additional test code here
        assertTrue(fixture.getTools().isEmpty());
    }

    /**
     * Run the void removeTool(Tool) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testRemoveTool_3() throws Exception
    {
        Tool tool = new Tool("name", "", null, "id");

        fixture.addTool(new Tool("other", "", null, "id2"));

        assertFalse(fixture.getTools().isEmpty());
        fixture.removeTool(tool);

        // add additional test code here
        assertFalse(fixture.getTools().isEmpty());
    }

    /**
     * Run the void setDescription(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetDescription_1() throws Exception
    {
        String description = "";

        fixture.setDescription(description);

        // add additional test code here
        assertEquals(description, fixture.getDescription());
    }

    /**
     * Run the void setDescription(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetDescription_2() throws Exception
    {
        String description = null;

        fixture.setDescription(description);

        // add additional test code here
        assertEquals("", fixture.getDescription());
    }

    /**
     * Run the void setDescription(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetDescription_3() throws Exception
    {
        String description = "other";

        fixture.setDescription(description);

        // add additional test code here
        assertEquals(description, fixture.getDescription());
    }

    /**
     * Run the void setId(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetId_1() throws Exception
    {
        String id = "";
        String oldId = fixture.getId();

        try
        {
            fixture.setId(id);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals(oldId, fixture.getId());
        }
    }

    /**
     * Run the void setId(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetId_2() throws Exception
    {
        String id = null;
        String oldId = fixture.getId();

        try
        {
            fixture.setId(id);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals(oldId, fixture.getId());
        }
    }

    /**
     * Run the void setId(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetId_3() throws Exception
    {
        String id = "newID";

        try
        {
            fixture.setId(id);
            assertEquals(id, fixture.getId());
        }
        catch (IllegalArgumentException e)
        {
            fail();
        }
    }

    /**
     * Run the void setName(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetName_1() throws Exception
    {
        String name = "";
        String oldName = fixture.getName();

        try
        {
            fixture.setName(name);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals(oldName, fixture.getName());
        }
    }

    /**
     * Run the void setName(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetName_2() throws Exception
    {
        String name = null;
        String oldName = fixture.getName();

        try
        {
            fixture.setName(name);
            fail();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals(oldName, fixture.getName());
        }
    }

    /**
     * Run the void setName(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetName_3() throws Exception
    {
        String name = "newName";
        String oldName = fixture.getName();

        try
        {
            fixture.setName(name);
            assertEquals(name, fixture.getName());
            assertNotEquals(name, oldName);
        }
        catch (IllegalArgumentException e)
        {
            fail();
        }
    }

    /**
     * Run the void setOriginatesFrom(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetOriginatesFrom_1() throws Exception
    {
        String originatesFrom = "origin";

        fixture.setOriginatesFrom(new OriginatesFrom(originatesFrom));

        assertEquals(originatesFrom, fixture.getOriginatesFrom().getHREF());
    }

    /**
     * Run the void setTaggedBy(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Test
    public void testSetTaggedBy_1() throws Exception
    {
        String taggedBy = "tagged";

        fixture.setTaggedBy(new TaggedBy(taggedBy));

        assertEquals(taggedBy, fixture.getTaggedBy().getHREF());
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *             if the initialization fails for some reason
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    @Before
    public void setUp() throws Exception
    {
        fixture = new QualityModel("name", "description", new OriginatesFrom("href"), new TaggedBy("tag"), "id");
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *             if the clean-up fails for some reason
     * @generatedBy CodePro at 5/30/15 3:27 PM
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
     * @generatedBy CodePro at 5/30/15 3:27 PM
     */
    public static void main(String[] args)
    {
        new org.junit.runner.JUnitCore().run(QualityModelTest.class);
    }
}