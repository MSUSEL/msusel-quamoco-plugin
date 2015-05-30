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
package net.siliconcode.quamoco.aggregator.qm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * QualityModel -
 *
 * @author Isaac Griffith
 */
public class QualityModel {

    private String                              description;
    private String                              name;
    private String                              originatesFrom;
    private String                              taggedBy;
    private final List<Entity>                  entities;
    private final List<Factor>                  factors;
    private final List<Evaluation>              evaluations;
    private final List<Measure>                 measures;
    private final List<MeasurementMethod>       methods;
    private final List<Tool>                    tools;
    private final List<Tag>                     tags;
    private final List<Source>                  sources;
    private String                              id;
    private final List<String>                  requires;
    private final Map<String, AbstractQMEntity> contained;

    /**
     *
     */
    public QualityModel(final String name, final String description, final String originatesFrom,
            final String taggedBy, final String id)
    {
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

    public void addEvaluation(final Evaluation eval)
    {
        if (eval == null)
        {
            return;
        }

        evaluations.add(eval);
        contained.put(eval.getId(), eval);

        for (final Ranking rank : eval.getRankings())
        {
            contained.put(rank.getId(), rank);
        }
    }

    public void addFactor(final Factor fac)
    {
        if (fac == null)
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

    public void addRequires(final String req)
    {
        if (req == null || req.isEmpty() || requires.contains(req))
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
        return true;
    }

    public AbstractQMEntity find(final String id)
    {
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
    public String getOriginatesFrom()
    {
        return originatesFrom;
    }

    /**
     * @return the taggedBy
     */
    public String getTaggedBy()
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
        for (final Ranking rank : eval.getRankings())
        {
            contained.remove(rank);
        }
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

    public void removeRequires(final String req)
    {
        if (req == null || req.isEmpty() || !requires.contains(req))
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
        this.description = description;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(final String id)
    {
        this.id = id;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(final String name)
    {
        this.name = name;
    }

    /**
     * @param originatesFrom
     *            the originatesFrom to set
     */
    public void setOriginatesFrom(final String originatesFrom)
    {
        this.originatesFrom = originatesFrom;
    }

    /**
     * @param taggedBy
     *            the taggedBy to set
     */
    public void setTaggedBy(final String taggedBy)
    {
        this.taggedBy = taggedBy;
    }
}
