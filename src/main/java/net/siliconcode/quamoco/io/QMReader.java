/**
 * The MIT License (MIT)
 *
 * Sonar Quamoco Plugin
 * Copyright (c) 2015 Isaac Griffith, SiliconCode, LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.siliconcode.quamoco.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.siliconcode.quamoco.model.qm.Annotation;
import net.siliconcode.quamoco.model.qm.Characterizes;
import net.siliconcode.quamoco.model.qm.Determines;
import net.siliconcode.quamoco.model.qm.Entity;
import net.siliconcode.quamoco.model.qm.Evaluates;
import net.siliconcode.quamoco.model.qm.Evaluation;
import net.siliconcode.quamoco.model.qm.Factor;
import net.siliconcode.quamoco.model.qm.FactorLink;
import net.siliconcode.quamoco.model.qm.Function;
import net.siliconcode.quamoco.model.qm.Influence;
import net.siliconcode.quamoco.model.qm.IsA;
import net.siliconcode.quamoco.model.qm.Measure;
import net.siliconcode.quamoco.model.qm.MeasureLink;
import net.siliconcode.quamoco.model.qm.MeasurementMethod;
import net.siliconcode.quamoco.model.qm.NormalizationMeasure;
import net.siliconcode.quamoco.model.qm.OriginatesFrom;
import net.siliconcode.quamoco.model.qm.Parent;
import net.siliconcode.quamoco.model.qm.PartOf;
import net.siliconcode.quamoco.model.qm.QMEntityFactory;
import net.siliconcode.quamoco.model.qm.QualityModel;
import net.siliconcode.quamoco.model.qm.Ranking;
import net.siliconcode.quamoco.model.qm.Refines;
import net.siliconcode.quamoco.model.qm.Requires;
import net.siliconcode.quamoco.model.qm.Source;
import net.siliconcode.quamoco.model.qm.Tag;
import net.siliconcode.quamoco.model.qm.TaggedBy;
import net.siliconcode.quamoco.model.qm.Target;
import net.siliconcode.quamoco.model.qm.Tool;

/**
 * QMReader -
 *
 * @author Isaac Griffith
 */
public class QMReader extends AbstractQuamocoReader {

    private static final Logger    LOG    = LoggerFactory.getLogger(QMReader.class);
    /**
     *
     */
    private static final String    HASH   = "#";
    /**
     *
     */
    private static final String    PARENT = "parent";
    /**
     *
     */
    private static final String    DOT_QM = ".qm#";
    /**
     *
     */
    private static final String    HREF   = "href";
    transient private QualityModel model;

    public QMReader()
    {
        model = new QualityModel("model", "", null, null, "model_id");
    }

    /**
     * @return
     */
    public QualityModel getModel()
    {
        return model;
    }

    /**
     * @throws XMLStreamException
     * @throws FileNotFoundException
     */
    @Override
    public void read(final String qm) throws FileNotFoundException, XMLStreamException
    {
        if (qm == null || qm.isEmpty())
        {
            return;
        }

        model = null;
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
        boolean innerMeasure = false;

        final XMLInputFactory factory = XMLInputFactory.newInstance();
        final InputStream stream = getInputStream(qm);
        final XMLStreamReader reader = factory.createXMLStreamReader(stream);
        while (reader.hasNext())
        {
            final int event = reader.next();

            switch (event)
            {
            case XMLStreamConstants.START_ELEMENT:
                final Map<String, String> attrs = getAttributes(reader);
                switch (reader.getLocalName())
                {
                case "QualityModel":
                    model = QMEntityFactory.createQualityModel(attrs);
                    break;
                case "taggedBy":
                    model.setTaggedBy(new TaggedBy(attrs.get(QMReader.HREF)));
                    break;
                case "entities":
                    entity = QMEntityFactory.createEntity(model.getName(), attrs);
                    break;
                case "factors":
                    factor = QMEntityFactory.createFactor(model.getName(), attrs);
                    break;
                case "evaluations":
                    eval = QMEntityFactory.createEvaluation(model.getName(), attrs);
                    break;
                case "measures":
                    if (measure != null)
                    {
                        innerMeasure = true;
                        updateMeasureParent(measure, attrs);
                    }
                    else
                    {
                        innerMeasure = false;
                        final String parent = getParent(attrs);
                        final String characterizes = setCharacterizes(attrs);

                        measure = QMEntityFactory.createMeasure(model.getName(), attrs, characterizes);
                        model.addMeasure(measure);
                        if (parent != null && !parent.isEmpty())
                            measure.addParent(new Parent(parent));
                    }
                    break;
                case "measurementMethods":
                    method = QMEntityFactory.createMeasurementMethod(model.getName(), attrs);
                    model.addMethod(method);
                    break;
                case "tools":
                    tool = QMEntityFactory.createTool(model.getName(), attrs);
                    model.addTool(tool);
                    break;
                case "tags":
                    final Tag tag = QMEntityFactory.createTag(model.getName(), attrs);
                    model.addTag(tag);
                    break;
                case "sources":
                    source = QMEntityFactory.createSource(model.getName(), attrs);
                    model.addSource(source);
                    break;
                case "requires":
                    model.addRequires(new Requires(attrs.get(QMReader.HREF)));
                    break;
                case "characterizes":
                    setCharacterizes(factor, measure, attrs);
                    break;
                case "influences":
                    inf = QMEntityFactory.createInfluences(model.getName(), attrs);
                    break;
                case "refines":
                    setRefines(factor, measure, attrs);
                    isRefines = true;
                    break;
                case "evaluates":
                    setEvaluates(eval, attrs);
                    break;
                case "rankings":
                    rank = QMEntityFactory.createRanking(model.getName(), eval, attrs);
                    break;
                case "originatesFrom":
                    setOriginatesFrom(measure, method, tool, entity, attrs);
                    break;
                case PARENT:
                    setParent(factor, measure, entity, isRefines, attrs);
                    break;
                case "annotations":
                    annot = QMEntityFactory.createAnnotation(model.getName(), attrs);
                    setAnnotation(factor, measure, method, tool, annot, source);
                    break;
                case "determines":
                    method.setDetermines(new Determines(attrs.get(QMReader.HREF)));
                    break;
                case "tool":
                    method.setTool(attrs.get(QMReader.HREF));
                    break;
                case "factor":
                    rank.setFactor(new FactorLink(attrs.get(QMReader.HREF)));
                    break;
                case "measure":
                    rank.setMeasure(new MeasureLink(attrs.get(QMReader.HREF)));
                    break;
                case "normlizationMeasure":
                    rank.setNormalizationMeasure(new NormalizationMeasure(attrs.get(QMReader.HREF)));
                    break;
                case "function":
                    func = QMEntityFactory.createFunction(model.getName(), attrs);
                    rank.setFunction(func);
                    break;
                case "target":
                    inf.setTarget(new Target(attrs.get(QMReader.HREF)));
                    break;
                case "isA":
                    entity.addIsA(new IsA(model.getName() + QMReader.DOT_QM + attrs.get(QMReader.PARENT)));
                    break;
                case "partOf":
                    entity.setPartOf(new PartOf(attrs.get("id"),
                            new Parent(model.getName() + QMReader.DOT_QM + attrs.get(QMReader.PARENT))));
                    break;
                }
                break;
            case XMLStreamConstants.END_ELEMENT:
                switch (reader.getLocalName())
                {
                case "entities":
                    model.addEntity(entity);
                    entity = null;
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
                    if (!innerMeasure)
                    {
                        measure = null;
                    }
                    innerMeasure = !innerMeasure;
                    isRefines = false;
                    break;
                case "measurementMethods":
                    method = null;
                    break;
                case "tools":
                    tool = null;
                    break;
                case "sources":
                    model.addSource(source);
                    source = null;
                    break;
                case "influences":
                    factor.addInfluence(inf);
                    inf = null;
                    break;
                case "refines":
                    isRefines = false;
                    break;
                case "rankings":
                    if (eval != null)
                    {
                        eval.addRanking(rank);
                    }
                    rank = null;
                    break;
                case "annotations":
                    annot = null;
                    break;
                case "function":
                    func = null;
                    break;
                }
                break;
            }
        }
    }

    /**
     * @param qm
     * @return
     */
    private InputStream getInputStream(final String qm)
    {
        final File file = new File(qm);
        if (file.exists())
        {
            try
            {
                return new FileInputStream(file);
            }
            catch (final FileNotFoundException e)
            {
                QMReader.LOG.warn(e.getMessage(), e);
                return QMReader.class.getResourceAsStream("models/" + qm + ".qm");
            }
        }
        else
        {
            return QMReader.class.getResourceAsStream("models/" + qm + ".qm");
        }
    }

    /**
     * @param measure
     * @param attrs
     */
    private void updateMeasureParent(final Measure measure, final Map<String, String> attrs)
    {
        String parent = getMeasureParent(attrs.get(QMReader.PARENT));
        if (parent == null)
        {
            parent = getMeasureParent(attrs.get(QMReader.HREF));
        }
        if (parent != null && !parent.isEmpty())
            measure.addParent(new Parent(parent));
    }

    /**
     * @param parent
     * @return
     */
    private String getMeasureParent(final String parent)
    {
        String returnValue = null;
        if (parent != null)
        {
            if (!parent.contains(QMReader.HASH))
            {
                returnValue = model.getName() + QMReader.DOT_QM + parent;
            }
        }
        return returnValue;
    }

    /**
     * @param attrs
     * @param characterizes
     * @return
     */
    private String setCharacterizes(final Map<String, String> attrs)
    {
        String characterizes = null;
        if (attrs.get("characterizes") != null)
        {
            characterizes = model.getName() + QMReader.DOT_QM + attrs.get("characterizes");
        }
        return characterizes;
    }

    /**
     * @param attrs
     * @param parent
     * @return
     */
    private String getParent(final Map<String, String> attrs)
    {
        String parent = null;
        if (attrs.get(QMReader.PARENT) != null)
        {
            parent = model.getName() + QMReader.DOT_QM + attrs.get(QMReader.PARENT);
        }
        return parent;
    }

    /**
     * @param factor
     * @param measure
     * @param method
     * @param tool
     * @param annot
     * @param source
     */
    private void setAnnotation(final Factor factor, final Measure measure, final MeasurementMethod method,
            final Tool tool, final Annotation annot, final Source source)
    {
        if (factor != null)
        {
            factor.addAnnotation(annot);
        }
        else if (measure != null)
        {
            measure.addAnnotation(annot);
        }
        else if (method != null)
        {
            method.addAnnotation(annot);
        }
        else if (source != null)
        {
            source.addAnnotation(annot);
        }
        else if (tool != null)
        {
            tool.addAnnotation(annot);
        }
    }

    /**
     * @param factor
     * @param measure
     * @param attrs
     */
    private void setCharacterizes(final Factor factor, final Measure measure, final Map<String, String> attrs)
    {
        if (factor != null)
        {
            if (factor.getCharacterizes() == null)
            {
                factor.setCharacterizes(new Characterizes(attrs.get(QMReader.HREF)));
            }
        }
        else if (measure != null)
        {
            if (measure.getCharacterizes() == null)
            {
                measure.setCharacterizes(new Characterizes(attrs.get(QMReader.HREF)));
            }
        }
    }

    /**
     * @param eval
     * @param attrs
     */
    private void setEvaluates(final Evaluation eval, final Map<String, String> attrs)
    {
        String href = attrs.get(QMReader.HREF);
        if (href != null && !href.contains(QMReader.HASH))
        {
            href = model.getName() + QMReader.DOT_QM + href;
        }
        eval.setEvaluates(new Evaluates(href));
    }

    /**
     * @param measure
     * @param method
     * @param tool
     * @param entity
     * @param attrs
     */
    private void setOriginatesFrom(final Measure measure, final MeasurementMethod method, final Tool tool,
            final Entity entity, final Map<String, String> attrs)
    {
        if (tool != null)
        {
            tool.setOriginatesFrom(new OriginatesFrom(attrs.get(QMReader.HREF)));
        }
        else if (method != null)
        {
            method.setOriginatesFrom(new OriginatesFrom(attrs.get(QMReader.HREF)));
        }
        else if (measure != null)
        {
            measure.setOriginatesFrom(new OriginatesFrom(attrs.get(QMReader.HREF)));
        }
        else if (entity != null)
        {
            entity.setOriginatesFrom(new OriginatesFrom(attrs.get(QMReader.HREF)));
        }
    }

    /**
     * @param factor
     * @param measure
     * @param entity
     * @param isRefines
     * @param attrs
     */
    private void setParent(final Factor factor, final Measure measure, final Entity entity, final boolean isRefines,
            final Map<String, String> attrs)
    {
        if (factor != null)
        {
            factor.setRefines(new Refines(attrs.get(QMReader.HREF)));
        }
        else if (measure != null)
        {
            if (isRefines)
            {
                measure.setRefines(new Refines(attrs.get(QMReader.HREF)));
            }
            else
            {
                measure.addParent(new Parent(attrs.get(QMReader.HREF)));
            }
        }
        else if (entity != null)
        {
            entity.addIsA(new IsA(attrs.get(QMReader.HREF)));
        }
    }

    /**
     * @param factor
     * @param measure
     * @param attrs
     */
    private void setRefines(final Factor factor, final Measure measure, final Map<String, String> attrs)
    {
        if (factor != null)
        {
            factor.setRefines(new Refines(model.getName() + QMReader.DOT_QM + attrs.get(QMReader.PARENT)));
        }
        else if (measure != null)
        {
            measure.setRefines(new Refines(model.getName() + QMReader.DOT_QM + attrs.get(QMReader.PARENT)));
        }
    }
}
