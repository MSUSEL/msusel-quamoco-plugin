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
package net.siliconcode.quamoco.model.qm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

import net.siliconcode.quamoco.model.AbstractEntity;

/**
 * QualityModel -
 *
 * @author Isaac Griffith
 */
@XStreamAlias("qm:QualityModel")
public class QualityModel {

    @XStreamAlias("description")
    @XStreamAsAttribute
    private String                              description;
    @XStreamAlias("name")
    @XStreamAsAttribute
    private String                              name;
    private OriginatesFrom                      originatesFrom;
    private TaggedBy                            taggedBy;
    @XStreamImplicit
    private final List<Entity>                  entities;
    @XStreamImplicit
    private final List<Factor>                  factors;
    @XStreamImplicit
    private final List<Evaluation>              evaluations;
    @XStreamImplicit
    private final List<Measure>                 measures;
    @XStreamImplicit
    private final List<MeasurementMethod>       methods;
    @XStreamImplicit
    private final List<Tool>                    tools;
    @XStreamImplicit
    private final List<Tag>                     tags;
    @XStreamImplicit
    private final List<Source>                  sources;
    @XStreamAlias("xmi:id")
    @XStreamAsAttribute
    private String                              id;
    @XStreamImplicit
    private final List<Requires>                requires;
    @XStreamOmitField
    private final Map<String, AbstractQMEntity> contained;

    /**
     *
     */
    public QualityModel(final String name, final String description, final OriginatesFrom originatesFrom,
            final TaggedBy taggedBy, final String id)
    {
        if ((name == null || name.isEmpty()) || (id == null || id.isEmpty()))
            throw new IllegalArgumentException();

        this.name = name;
        this.description = description;
        this.originatesFrom = originatesFrom;
        this.taggedBy = taggedBy;
        this.id = id;
        entities = new ArrayList<>();
        factors = new ArrayList<>();
        evaluations = new ArrayList<>();
        measures = new ArrayList<>();
        methods = new ArrayList<>();
        tools = new ArrayList<>();
        tags = new ArrayList<>();
        sources = new ArrayList<>();
        requires = new ArrayList<>();
        contained = new HashMap<>();
    }

    public void addEntity(final Entity ent)
    {
        if (ent == null || entities.contains(ent))
        {
            return;
        }

        entities.add(ent);
        contained.put(ent.getId(), ent);
    }

    public List<Entity> getEntities()
    {
        return entities;
    }

    public void addEvaluation(final Evaluation eval)
    {
        if (eval == null || evaluations.contains(eval))
        {
            return;
        }

        evaluations.add(eval);
        contained.put(eval.getId(), eval);
    }

    public void addFactor(final Factor fac)
    {
        if (fac == null || factors.contains(fac))
        {
            return;
        }

        factors.add(fac);
        contained.put(fac.getId(), fac);
    }

    public void addMeasure(final Measure meas)
    {
        if (meas == null || measures.contains(meas))
        {
            return;
        }

        measures.add(meas);
        contained.put(meas.getId(), meas);
    }

    public void addMethod(final MeasurementMethod mm)
    {
        if (mm == null || methods.contains(mm))
        {
            return;
        }

        methods.add(mm);
        contained.put(mm.getId(), mm);
    }

    public void addRequires(final Requires req)
    {
        if (req == null || requires.contains(req))
        {
            return;
        }

        requires.add(req);
    }

    public void addSource(final Source src)
    {
        if (src == null || sources.contains(src))
        {
            return;
        }

        sources.add(src);
        contained.put(src.getId(), src);
    }

    public void addTag(final Tag tag)
    {
        if (tag == null || tags.contains(tag))
        {
            return;
        }

        tags.add(tag);
        contained.put(tag.getId(), tag);
    }

    public void addTool(final Tool tool)
    {
        if (tool == null || tools.contains(tool))
        {
            return;
        }

        tools.add(tool);
        contained.put(tool.getId(), tool);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final QualityModel other = (QualityModel) obj;
        if (description == null)
        {
            if (other.description != null)
            {
                return false;
            }
        }
        else if (!description.equals(other.description))
        {
            return false;
        }
        if (name == null)
        {
            if (other.name != null)
            {
                return false;
            }
        }
        else if (!name.equals(other.name))
        {
            return false;
        }
        if (originatesFrom == null)
        {
            if (other.originatesFrom != null)
            {
                return false;
            }
        }
        else if (!originatesFrom.equals(other.originatesFrom))
        {
            return false;
        }
        if (taggedBy == null)
        {
            if (other.taggedBy != null)
            {
                return false;
            }
        }
        else if (!taggedBy.equals(other.taggedBy))
        {
            return false;
        }
        if (id == null)
        {
            if (other.id != null)
            {
                return false;
            }
        }
        else if (!id.equals(other.id))
        {
            return false;
        }
        return true;
    }

    public AbstractQMEntity find(final String id)
    {
        if (id == null || id.isEmpty())
            throw new IllegalArgumentException();

        return contained.get(id);
    }

    public List<AbstractQMEntity> getContained()
    {
        return new ArrayList<AbstractQMEntity>(contained.values());
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @return
     */
    public List<Evaluation> getEvaluations()
    {
        return evaluations;
    }

    public List<Factor> getFactors()
    {
        return factors;
    }

    /**
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    public List<Measure> getMeasures()
    {
        return measures;
    }

    public List<MeasurementMethod> getMethods()
    {
        return methods;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return the originatesFrom
     */
    public OriginatesFrom getOriginatesFrom()
    {
        return originatesFrom;
    }

    /**
     * @return the taggedBy
     */
    public TaggedBy getTaggedBy()
    {
        return taggedBy;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + (description == null ? 0 : description.hashCode());
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (originatesFrom == null ? 0 : originatesFrom.hashCode());
        result = prime * result + (taggedBy == null ? 0 : taggedBy.hashCode());
        return result;
    }

    /**
     * @param id
     * @return
     */
    public boolean hasKey(final String id)
    {
        if (id == null || id.isEmpty())
            return false;

        return contained.containsKey(id);
    }

    public void removeEntity(final Entity ent)
    {
        if (ent == null || !entities.contains(ent))
        {
            return;
        }

        entities.remove(ent);
        contained.remove(ent.getId());
    }

    public void removeEvaluation(final Evaluation eval)
    {
        if (eval == null || !evaluations.contains(eval))
        {
            return;
        }

        evaluations.remove(eval);
        contained.remove(eval.getId());
    }

    public void removeFactor(final Factor fac)
    {
        if (fac == null || !factors.contains(fac))
        {
            return;
        }

        factors.remove(fac);
        contained.remove(fac.getId());
    }

    public void removeMeasure(final Measure meas)
    {
        if (meas == null || !measures.contains(meas))
        {
            return;
        }

        measures.remove(meas);
        contained.remove(meas.getId());
    }

    public void removeMethod(final MeasurementMethod mm)
    {
        if (mm == null || !methods.contains(mm))
        {
            return;
        }

        methods.remove(mm);
        contained.remove(mm.getId());
    }

    public void removeRequires(final Requires req)
    {
        if (req == null || !requires.contains(req))
        {
            return;
        }

        requires.remove(req);
    }

    public void removeSource(final Source src)
    {
        if (src == null || !sources.contains(src))
        {
            return;
        }

        sources.remove(src);
        contained.remove(src.getId());
    }

    public void removeTag(final AbstractQMEntity tag)
    {
        if (tag == null || !tags.contains(tag))
        {
            return;
        }

        tags.remove(tag);
        contained.remove(tag.getId());
    }

    public void removeTool(final Tool tool)
    {
        if (tool == null || !tools.contains(tool))
        {
            return;
        }

        tools.remove(tool);
        contained.remove(tool.getId());
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(final String description)
    {
        if (description == null)
            this.description = "";
        else
            this.description = description;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(final String id)
    {
        if (id == null || id.isEmpty())
            throw new IllegalArgumentException();

        this.id = id;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(final String name)
    {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException();

        this.name = name;
    }

    /**
     * @param originatesFrom
     *            the originatesFrom to set
     */
    public void setOriginatesFrom(final OriginatesFrom originatesFrom)
    {
        this.originatesFrom = originatesFrom;
    }

    /**
     * @param taggedBy
     *            the taggedBy to set
     */
    public void setTaggedBy(final TaggedBy taggedBy)
    {
        this.taggedBy = taggedBy;
    }

    /**
     * @return
     */
    public List<Requires> getRequires()
    {
        return requires;
    }

    /**
     * @return
     */
    public List<Tool> getTools()
    {
        return tools;
    }

    public List<Tag> getTags()
    {
        return tags;
    }

    /**
     * @return
     */
    public List<Source> getSources()
    {
        return sources;
    }

    public String toXml()
    {
        XStream xstream = createXStream();
        return xstream.toXML(this);
    }

    public static XStream createXStream()
    {
        XStream xstream = new XStream();
        xstream.setClassLoader(QualityModel.class.getClassLoader());
        xstream.processAnnotations(QualityModel.class);
        xstream.processAnnotations(AbstractLink.class);
        xstream.processAnnotations(AbstractEntity.class);
        xstream.processAnnotations(AbstractQMEntity.class);
        xstream.processAnnotations(Annotation.class);
        xstream.processAnnotations(Characterizes.class);
        xstream.processAnnotations(Determines.class);
        xstream.processAnnotations(Entity.class);
        xstream.processAnnotations(Evaluates.class);
        xstream.processAnnotations(Evaluation.class);
        xstream.processAnnotations(Factor.class);
        xstream.processAnnotations(FactorLink.class);
        xstream.processAnnotations(Function.class);
        xstream.processAnnotations(Influence.class);
        xstream.processAnnotations(IsA.class);
        xstream.processAnnotations(Measure.class);
        xstream.processAnnotations(MeasureLink.class);
        xstream.processAnnotations(MeasurementMethod.class);
        xstream.processAnnotations(NormalizationMeasure.class);
        xstream.processAnnotations(OriginatesFrom.class);
        xstream.processAnnotations(Parent.class);
        xstream.processAnnotations(PartOf.class);
        xstream.processAnnotations(Ranking.class);
        xstream.processAnnotations(Refines.class);
        xstream.processAnnotations(Requires.class);
        xstream.processAnnotations(Source.class);
        xstream.processAnnotations(Tag.class);
        xstream.processAnnotations(TaggedBy.class);
        xstream.processAnnotations(Target.class);
        xstream.processAnnotations(Tool.class);

        return xstream;
    }
}
