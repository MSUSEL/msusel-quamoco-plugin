/**
 * 
 */
package net.siliconcode.quamoco.distill.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import net.siliconcode.quamoco.distill.qm.Annotation;
import net.siliconcode.quamoco.distill.qm.Entity;
import net.siliconcode.quamoco.distill.qm.Evaluation;
import net.siliconcode.quamoco.distill.qm.Factor;
import net.siliconcode.quamoco.distill.qm.Function;
import net.siliconcode.quamoco.distill.qm.Influence;
import net.siliconcode.quamoco.distill.qm.Measure;
import net.siliconcode.quamoco.distill.qm.MeasurementMethod;
import net.siliconcode.quamoco.distill.qm.QualityModel;
import net.siliconcode.quamoco.distill.qm.Ranking;
import net.siliconcode.quamoco.distill.qm.Source;
import net.siliconcode.quamoco.distill.qm.Tag;
import net.siliconcode.quamoco.distill.qm.Tool;

/**
 * QMReader -
 *
 * @author isaac
 */
public class QMReader extends AbstractQuamocoReader {

    private List<QualityModel> models;

    public QMReader()
    {
        this.models = new ArrayList<>();
    }

    /**
     * @throws XMLStreamException
     * @throws FileNotFoundException
     */
    public void read(String... qms) throws FileNotFoundException, XMLStreamException
    {
        for (String qm : qms)
        {
            QualityModel model = null;
            Factor factor = null;
            Evaluation eval = null;
            Measure measure = null;
            Influence inf = null;
            MeasurementMethod method = null;
            Tool tool = null;
            Ranking rank = null;
            Annotation annot = null;
            Function func = null;
            Entity entity = null;
            Source source = null;
            boolean isRefines = false;
            boolean isA = false;
            boolean partOf = false;

            XMLInputFactory factory = XMLInputFactory.newInstance();
            XMLStreamReader reader = factory.createXMLStreamReader(new FileReader(qm));
            while (reader.hasNext())
            {
                int event = reader.next();

                switch (event)
                {
                case XMLStreamConstants.START_ELEMENT:
                    Map<String, String> attrs = getAttributes(reader);
                    switch (reader.getLocalName())
                    {
                    case "QualityModel":
                        model = new QualityModel(attrs.get("name").toLowerCase().split("-")[0],
                                attrs.get("description"), null, null, attrs.get("id"));
                        break;
                    case "taggedBy":
                        model.setTaggedBy(attrs.get("href"));
                        break;
                    case "entities":
                        entity = new Entity(attrs.get("name"), attrs.get("description"), attrs.get("originatesFrom"),
                                attrs.get("title"), model.getName() + ".qm#" + attrs.get("id"), null);
                        break;
                    case "factors":
                        factor = new Factor(attrs.get("name"), attrs.get("description"), null, null, null, null,
                                model.getName() + ".qm#" + attrs.get("id"));
                        break;
                    case "evaluations":
                        String evalhref = (attrs.get("evaluates") == null ? null : model.getName() + ".qm#"
                                + attrs.get("evaluates"));
                        eval = new Evaluation(
                                attrs.get("name"),
                                attrs.get("description"),
                                attrs.get("specification"),
                                attrs.get("maximumPoints") == null ? 0 : Double.parseDouble(attrs.get("maximumPoints")),
                                attrs.get("completeness"), evalhref, model.getName() + ".qm#" + attrs.get("id"));
                        break;
                    case "measures":
                        if (measure != null)
                        {
                            measure.setParent(attrs.get("parent"));
                        }
                        else
                        {
                            String parent = (attrs.get("parent") == null ? null : model.getName() + ".qm#"
                                    + attrs.get("parent"));
                            String characterizes = attrs.get("characterizes") == null ? null : model.getName() + ".qm#"
                                    + attrs.get("characterizes");
                            measure = new Measure(attrs.get("name"), attrs.get("description"), attrs.get("title"),
                                    parent, characterizes, attrs.get("type"), attrs.get("taggedBy"), null, null,
                                    model.getName() + ".qm#" + attrs.get("id"));
                            model.addMeasure(measure);
                        }
                        break;
                    case "measurementMethods":
                        String determines = (attrs.get("determines") == null ? null : model.getName() + ".qm#"
                                + attrs.get("determines"));
                        String mmtool = (attrs.get("tool") == null ? null : model.getName() + ".qm#"
                                + attrs.get("tool"));
                        method = new MeasurementMethod(attrs.get("name"), attrs.get("description"), determines, mmtool,
                                attrs.get("metric"), null, model.getName() + ".qm#" + attrs.get("id"));
                        model.addMethod(method);
                        break;
                    case "tools":
                        tool = new Tool(attrs.get("name"), attrs.get("description"), null, model.getName() + ".qm#"
                                + attrs.get("id"));
                        model.addTool(tool);
                        break;
                    case "tags":
                        Tag tag = new Tag(attrs.get("name"), attrs.get("description"), model.getName() + ".qm#"
                                + attrs.get("id"));
                        model.addTag(tag);
                        break;
                    case "sources":
                        source = new Source(attrs.get("name"), attrs.get("description"), model.getName() + ".qm#"
                                + attrs.get("id"));
                        model.addSource(source);
                        break;
                    case "requires":
                        model.addRequires(attrs.get("href"));
                        break;
                    case "characterizes":
                        if (factor != null)
                        {
                            if (factor.getCharacterises() == null)
                                factor.setCharacterises(attrs.get("href"));
                        }
                        else if (measure != null)
                        {
                            if (measure.getCharacterises() == null)
                                measure.setCharacterises(attrs.get("href"));
                        }
                        break;
                    case "influences":
                        String target = attrs.get("target");
                        if (target != null && !target.contains(".qm#"))
                            target = model.getName() + ".qm#" + target;
                        inf = new Influence(attrs.get("effect"), attrs.get("justification"), target, model.getName()
                                + ".qm#" + attrs.get("id"));
                        break;
                    case "refines":
                        if (factor != null)
                            factor.setRefines(model.getName() + ".qm#" + attrs.get("parent"));
                        else if (measure != null)
                            measure.setRefines(model.getName() + ".qm#" + attrs.get("parent"));

                        isRefines = true;
                        break;
                    case "evaluates":
                        eval.setEvaluates(attrs.get("href"));
                        break;
                    case "rankings":
                        String normMeas = (attrs.get("normlizationMeasure") == null ? null : model.getName() + ".qm#"
                                + attrs.get("normlizationMeasure"));
                        String meashref = (attrs.get("measure") == null ? null : model.getName() + ".qm#"
                                + attrs.get("measure"));
                        String fachref = (attrs.get("factor") == null ? null : model.getName() + ".qm#"
                                + attrs.get("factor"));
                        rank = new Ranking(attrs.get("rank"), attrs.get("range"), attrs.get("weight"), meashref,
                                fachref, normMeas, model.getName() + ".qm#" + eval.getId(), model.getName() + ".qm#"
                                        + attrs.get("id"));
                        break;
                    case "originatesFrom":
                        if (tool != null)
                            tool.setOriginatesFrom(attrs.get("href"));
                        else if (method != null)
                            method.setOriginatesFrom(attrs.get("href"));
                        else if (measure != null)
                            measure.setOriginatesFrom(attrs.get("href"));
                        else if (entity != null)
                            entity.setOriginatesFrom(attrs.get("href"));
                        break;
                    case "parent":
                        if (factor != null)
                            factor.setRefines(attrs.get("href"));
                        else if (measure != null)
                        {
                            if (isRefines)
                                measure.setRefines(attrs.get("href"));
                            else
                            {
                                measure.setParent(attrs.get("href"));
                            }
                        }
                        else if (entity != null)
                            entity.addIsA(attrs.get("href"));
                        break;
                    case "annotations":
                        annot = new Annotation(attrs.get("key"), attrs.get("value"), model.getName() + ".qm#"
                                + attrs.get("id"));
                        if (factor != null)
                            factor.setAnnotation(annot);
                        else if (measure != null)
                            measure.addAnnotation(annot);
                        else if (method != null)
                            method.setAnnotation(annot);
                        else if (source != null)
                            source.setAnnotation(annot);
                        else if (tool != null)
                            tool.setAnnotation(annot);
                        break;
                    case "determines":
                        method.setDetermines(attrs.get("href"));
                        break;
                    case "tool":
                        method.setTool(attrs.get("href"));
                        break;
                    case "factor":
                        rank.setFactor(attrs.get("href"));
                        break;
                    case "measure":
                        rank.setMeasure(attrs.get("href"));
                        break;
                    case "normlizationMeasure":
                        rank.setNormalizationMeasure(attrs.get("href"));
                        break;
                    case "function":
                        func = new Function(attrs.get("lowerBound") == null ? 0 : Double.parseDouble(attrs
                                .get("lowerBound")), attrs.get("upperBound") == null ? 1.0 : Double.parseDouble(attrs
                                .get("upperBound")), attrs.get("type"), model.getName() + ".qm#" + attrs.get("id"));
                        rank.setFunction(func);
                        break;
                    case "target":
                        inf.setTarget(attrs.get("href"));
                        break;
                    case "isA":
                        entity.addIsA(attrs.get("parent"));
                        break;
                    case "partOf":
                        entity.setPartOf(attrs.get("parent"));
                        break;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    switch (reader.getLocalName())
                    {
                    case "QualityModel":
                        models.add(model);
                        model = null;
                        break;
                    case "entities":
                        model.addEntity(entity);
                        entity = null;
                        break;
                    case "taggedBy":
                        break;
                    case "factors":
                        model.addFactor(factor);
                        factor = null;
                        break;
                    case "evaluations":
                        model.addEvaluation(eval);
                        isRefines = false;
                        eval = null;
                        break;
                    case "measures":
                        measure = null;
                        isRefines = false;
                        break;
                    case "measurementMethods":
                        // model.addMethod(method);
                        method = null;
                        break;
                    case "tools":
                        // model.addTool(tool);
                        tool = null;
                        break;
                    case "tags":
                        break;
                    case "sources":
                        model.addSource(source);
                        source = null;
                        break;
                    case "requires":
                        break;
                    case "characterizes":
                        break;
                    case "influences":
                        factor.addInfluence(inf);
                        inf = null;
                        break;
                    case "refines":
                        isRefines = false;
                        break;
                    case "evaluates":
                        // eval = null;
                        break;
                    case "rankings":
                        if (eval != null)
                            eval.addRanking(rank);
                        rank = null;
                        break;
                    case "originatesFrom":
                        break;
                    case "parent":
                        break;
                    case "annotations":
                        annot = null;
                        break;
                    case "determines":
                        break;
                    case "tool":
                        break;
                    case "factor":
                        break;
                    case "measure":
                        break;
                    case "normlizationMeasure":
                        break;
                    case "function":
                        func = null;
                        break;
                    case "target":
                        break;
                    case "isA":
                        isA = false;
                        break;
                    case "partOf":
                        partOf = false;
                        break;
                    }
                    break;
                case XMLStreamConstants.START_DOCUMENT:
                    break;
                case XMLStreamConstants.END_DOCUMENT:
                    break;
                }
            }
        }
    }

    /**
     * @return
     */
    public List<QualityModel> getModels()
    {
        return models;
    }
}
