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
package net.siliconcode.quamoco.aggregator.io;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import net.siliconcode.quamoco.aggregator.qm.Annotation;
import net.siliconcode.quamoco.aggregator.qm.Entity;
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * QMReader -
 *
 * @author Isaac Griffith
 */
public class QMReader extends AbstractQuamocoReader {

    private static final Logger LOG = LoggerFactory.getLogger(QMReader.class);
    private QualityModel        model;

    public QMReader()
    {
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
        boolean isA = false;
        boolean partOf = false;
        boolean innerMeasure = false;

        final XMLInputFactory factory = XMLInputFactory.newInstance();
        final InputStream stream = QMReader.class.getResourceAsStream("models/" + qm + ".qm");
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
                    model = new QualityModel(attrs.get("name").toLowerCase().split("-")[0], attrs.get("description"),
                            null, null, attrs.get("id"));
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
                    final String evalhref = attrs.get("evaluates") == null ? null : model.getName() + ".qm#"
                            + attrs.get("evaluates");
                    eval = new Evaluation(attrs.get("name"), attrs.get("description"), attrs.get("specification"),
                            attrs.get("maximumPoints") == null ? 0 : Double.parseDouble(attrs.get("maximumPoints")),
                                    attrs.get("completeness"), evalhref, attrs.get("type"), model.getName() + ".qm#"
                                            + attrs.get("id"));
                    break;
                case "measures":
                    if (measure != null)
                    {
                        innerMeasure = true;
                        String p = attrs.get("parent");
                        if (p != null)
                        {
                            if (!p.contains("#"))
                            {
                                p = model.getName() + ".qm#" + p;
                            }
                        }
                        else
                        {
                            p = attrs.get("href");
                            if (p != null)
                            {
                                if (!p.contains("#"))
                                {
                                    p = model.getName() + ".qm#" + p;
                                }
                            }
                        }
                        measure.addParent(p);
                    }
                    else
                    {
                        innerMeasure = false;
                        final String parent = attrs.get("parent") == null ? null : model.getName() + ".qm#"
                                + attrs.get("parent");
                        final String characterizes = attrs.get("characterizes") == null ? null : model.getName()
                                + ".qm#" + attrs.get("characterizes");
                        measure = new Measure(attrs.get("name"), attrs.get("description"), attrs.get("title"),
                                characterizes, attrs.get("type"), attrs.get("taggedBy"), null, null, model.getName()
                                + ".qm#" + attrs.get("id"));
                        model.addMeasure(measure);
                        measure.addParent(parent);
                    }
                    break;
                case "measurementMethods":
                    final String determines = attrs.get("determines") == null ? null : model.getName() + ".qm#"
                            + attrs.get("determines");
                    final String mmtool = attrs.get("tool") == null ? null : model.getName() + ".qm#"
                            + attrs.get("tool");
                    method = new MeasurementMethod(attrs.get("name"), attrs.get("description"), determines, mmtool,
                            attrs.get("metric"), null, attrs.get("type"), model.getName() + ".qm#" + attrs.get("id"));
                    model.addMethod(method);
                    break;
                case "tools":
                    tool = new Tool(attrs.get("name"), attrs.get("description"), null, model.getName() + ".qm#"
                            + attrs.get("id"));
                    model.addTool(tool);
                    break;
                case "tags":
                    final Tag tag = new Tag(attrs.get("name"), attrs.get("description"), model.getName() + ".qm#"
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
                        {
                            factor.setCharacterises(attrs.get("href"));
                        }
                    }
                    else if (measure != null)
                    {
                        if (measure.getCharacterises() == null)
                        {
                            measure.setCharacterises(attrs.get("href"));
                        }
                    }
                    break;
                case "influences":
                    String target = attrs.get("target");
                    if (target != null && !target.contains(".qm#"))
                    {
                        target = model.getName() + ".qm#" + target;
                    }
                    inf = new Influence(attrs.get("effect"), attrs.get("justification"), target, model.getName()
                            + ".qm#" + attrs.get("id"));
                    break;
                case "refines":
                    if (factor != null)
                    {
                        factor.setRefines(model.getName() + ".qm#" + attrs.get("parent"));
                    }
                    else if (measure != null)
                    {
                        measure.setRefines(model.getName() + ".qm#" + attrs.get("parent"));
                    }

                    isRefines = true;
                    break;
                case "evaluates":
                    String h = attrs.get("href");
                    if (h != null && !h.contains("#"))
                    {
                        h = model.getName() + ".qm#" + h;
                    }
                    eval.setEvaluates(h);
                    break;
                case "rankings":
                    final String normMeas = attrs.get("normlizationMeasure") == null ? null : model.getName() + ".qm#"
                            + attrs.get("normlizationMeasure");
                    final String meashref = attrs.get("measure") == null ? null : model.getName() + ".qm#"
                            + attrs.get("measure");
                    final String fachref = attrs.get("factor") == null ? null : model.getName() + ".qm#"
                            + attrs.get("factor");
                    rank = new Ranking(attrs.get("rank"), attrs.get("range"), attrs.get("weight"), meashref, fachref,
                            normMeas, eval.getId(), model.getName() + ".qm#" + attrs.get("id"));
                    break;
                case "originatesFrom":
                    if (tool != null)
                    {
                        tool.setOriginatesFrom(attrs.get("href"));
                    }
                    else if (method != null)
                    {
                        method.setOriginatesFrom(attrs.get("href"));
                    }
                    else if (measure != null)
                    {
                        measure.setOriginatesFrom(attrs.get("href"));
                    }
                    else if (entity != null)
                    {
                        entity.setOriginatesFrom(attrs.get("href"));
                    }
                    break;
                case "parent":
                    if (factor != null)
                    {
                        factor.setRefines(attrs.get("href"));
                    }
                    else if (measure != null)
                    {
                        if (isRefines)
                        {
                            measure.setRefines(attrs.get("href"));
                        }
                        else
                        {
                            measure.addParent(attrs.get("href"));
                        }
                    }
                    else if (entity != null)
                    {
                        entity.addIsA(attrs.get("href"));
                    }
                    break;
                case "annotations":
                    annot = new Annotation(attrs.get("key"), attrs.get("value"), model.getName() + ".qm#"
                            + attrs.get("id"));
                    if (factor != null)
                    {
                        factor.setAnnotation(annot);
                    }
                    else if (measure != null)
                    {
                        measure.addAnnotation(annot);
                    }
                    else if (method != null)
                    {
                        method.setAnnotation(annot);
                    }
                    else if (source != null)
                    {
                        source.setAnnotation(annot);
                    }
                    else if (tool != null)
                    {
                        tool.setAnnotation(annot);
                    }
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
                    entity.addIsA(model.getName() + ".qm#" + attrs.get("parent"));
                    break;
                case "partOf":
                    entity.setPartOf(model.getName() + ".qm#" + attrs.get("parent"));
                    break;
                }
                break;
            case XMLStreamConstants.END_ELEMENT:
                switch (reader.getLocalName())
                {
                case "QualityModel":
                    break;
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
                    // model.addMethod(method);
                    method = null;
                    break;
                case "tools":
                    // model.addTool(tool);
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
            }
        }
    }
}
