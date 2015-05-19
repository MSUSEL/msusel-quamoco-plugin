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
    private final Map<String, Factor>           factorNameMap;

    /**
     *
     */
    public QualityModel(String name, String description, String originatesFrom, String taggedBy, String id)
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
        factorNameMap = new HashMap<>();
    }

    public List<AbstractQMEntity> getContained()
    {
        return new ArrayList<AbstractQMEntity>(contained.values());
    }

    public void addEntity(Entity ent)
    {
        if (ent == null || entities.contains(ent))
        {
            return;
        }

        entities.add(ent);
        contained.put(ent.getId(), ent);
    }

    public void addEvaluation(Evaluation eval)
    {
        if (eval == null)
        {
            return;
        }

        evaluations.add(eval);
        contained.put(eval.getId(), eval);

        for (Ranking rank : eval.getRankings())
            contained.put(rank.getId(), rank);
    }

    public void addFactor(Factor fac)
    {
        if (fac == null)
        {
            return;
        }

        factors.add(fac);
        contained.put(fac.getId(), fac);
    }

    public void addMeasure(Measure meas)
    {
        if (meas == null || measures.contains(meas))
        {
            return;
        }

        measures.add(meas);
        contained.put(meas.getId(), meas);
    }

    public void addMethod(MeasurementMethod mm)
    {
        if (mm == null || methods.contains(mm))
        {
            return;
        }

        methods.add(mm);
        contained.put(mm.getId(), mm);
    }

    public void addRequires(String req)
    {
        if (req == null || req.isEmpty() || requires.contains(req))
        {
            return;
        }

        requires.add(req);
    }

    public void addSource(Source src)
    {
        if (src == null || sources.contains(src))
        {
            return;
        }

        sources.add(src);
        contained.put(src.getId(), src);
    }

    public void addTag(Tag tag)
    {
        if (tag == null || tags.contains(tag))
        {
            return;
        }

        tags.add(tag);
        contained.put(tag.getId(), tag);
    }

    public void addTool(Tool tool)
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
    public boolean equals(Object obj)
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

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @return the id
     */
    public String getId()
    {
        return id;
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

    public void removeEntity(Entity ent)
    {
        if (ent == null || !entities.contains(ent))
        {
            return;
        }

        entities.remove(ent);
        contained.remove(ent.getId());
    }

    public void removeEvaluation(Evaluation eval)
    {
        if (eval == null || !evaluations.contains(eval))
        {
            return;
        }

        evaluations.remove(eval);
        contained.remove(eval.getId());
        for (Ranking rank : eval.getRankings())
            contained.remove(rank);
    }

    public void removeFactor(Factor fac)
    {
        if (fac == null || !factors.contains(fac))
        {
            return;
        }

        factors.remove(fac);
        contained.remove(fac.getId());
    }

    public void removeMeasure(Measure meas)
    {
        if (meas == null || !measures.contains(meas))
        {
            return;
        }

        measures.remove(meas);
        contained.remove(meas.getId());
    }

    public void removeMethod(MeasurementMethod mm)
    {
        if (mm == null || !methods.contains(mm))
        {
            return;
        }

        methods.remove(mm);
        contained.remove(mm.getId());
    }

    public void removeRequires(String req)
    {
        if (req == null || req.isEmpty() || !requires.contains(req))
        {
            return;
        }

        requires.remove(req);
    }

    public void removeSource(Source src)
    {
        if (src == null || !sources.contains(src))
        {
            return;
        }

        sources.remove(src);
        contained.remove(src.getId());
    }

    public void removeTag(AbstractQMEntity tag)
    {
        if (tag == null || !tags.contains(tag))
        {
            return;
        }

        tags.remove(tag);
        contained.remove(tag.getId());
    }

    public void removeTool(Tool tool)
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
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @param originatesFrom
     *            the originatesFrom to set
     */
    public void setOriginatesFrom(String originatesFrom)
    {
        this.originatesFrom = originatesFrom;
    }

    /**
     * @param taggedBy
     *            the taggedBy to set
     */
    public void setTaggedBy(String taggedBy)
    {
        this.taggedBy = taggedBy;
    }

    public AbstractQMEntity find(String id)
    {
        return contained.get(id);
    }

    /**
     * @param id
     * @return
     */
    public boolean hasKey(String id)
    {
        return contained.containsKey(id);
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

    public List<Measure> getMeasures()
    {
        return measures;
    }

    public List<MeasurementMethod> getMethods()
    {
        return methods;
    }
}
