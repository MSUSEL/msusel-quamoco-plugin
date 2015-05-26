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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Measure -
 *
 * @author Isaac Griffith
 */
public class Measure extends AbstractQMEntity {

    private String                 characterises;
    private String                 originatesFrom;
    private String                 refines;
    private final Set<String>      parents;
    private String                 title;
    private String                 type;
    private String                 taggedBy;
    private final List<Annotation> annotations;
    private final List<Measure>    measures;

    /**
     *
     */
    public Measure(final String name, final String description, final String title, final String characterises,
            final String type, final String taggedBy, final String originatesFrom, final String refines, final String id)
    {
        annotations = new ArrayList<>();
        measures = new ArrayList<>();
        parents = new HashSet<>();
        this.name = name;
        this.description = description;
        this.title = title;
        this.characterises = characterises;
        this.type = type;
        this.taggedBy = taggedBy;
        this.id = id;
        this.refines = refines;
    }

    public void addAnnotation(final Annotation ann)
    {
        if (ann == null || annotations.contains(ann))
        {
            return;
        }

        annotations.add(ann);
    }

    /**
     * @param measure
     *            the measure to add
     */
    public void addMeasure(final Measure measure)
    {
        if (measure == null || measures.contains(measure))
        {
            return;
        }

        measures.add(measure);
    }

    /**
     * @param parent
     */
    public void addParent(final String parent)
    {
        if (parent == null || parent.isEmpty())
        {
            return;
        }

        parents.add(parent);
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
        final Measure other = (Measure) obj;
        if (characterises == null)
        {
            if (other.characterises != null)
            {
                return false;
            }
        }
        else if (!characterises.equals(other.characterises))
        {
            return false;
        }
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
        if (measures == null)
        {
            if (other.measures != null)
            {
                return false;
            }
        }
        else if (!measures.equals(other.measures))
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
        if (refines == null)
        {
            if (other.refines != null)
            {
                return false;
            }
        }
        else if (!refines.equals(other.refines))
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
        if (title == null)
        {
            if (other.title != null)
            {
                return false;
            }
        }
        else if (!title.equals(other.title))
        {
            return false;
        }
        if (type == null)
        {
            if (other.type != null)
            {
                return false;
            }
        }
        else if (!type.equals(other.type))
        {
            return false;
        }
        return true;
    }

    /**
     * @return the characterises
     */
    public String getCharacterises()
    {
        return characterises;
    }

    /**
     * @return the originatesFrom
     */
    public String getOriginatesFrom()
    {
        return originatesFrom;
    }

    public Set<String> getParents()
    {
        return parents;
    }

    /**
     * @return the refines
     */
    public String getRefines()
    {
        return refines;
    }

    /**
     * @return the taggedBy
     */
    public String getTaggedBy()
    {
        return taggedBy;
    }

    /**
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * @return the type
     */
    public String getType()
    {
        return type;
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
        result = prime * result + (characterises == null ? 0 : characterises.hashCode());
        result = prime * result + (description == null ? 0 : description.hashCode());
        result = prime * result + (measures == null ? 0 : measures.hashCode());
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (originatesFrom == null ? 0 : originatesFrom.hashCode());
        result = prime * result + (refines == null ? 0 : refines.hashCode());
        result = prime * result + (taggedBy == null ? 0 : taggedBy.hashCode());
        result = prime * result + (title == null ? 0 : title.hashCode());
        result = prime * result + (type == null ? 0 : type.hashCode());
        return result;
    }

    public void removeAnnotation(final Annotation ann)
    {
        if (ann == null || !annotations.contains(ann))
        {
            return;
        }

        annotations.remove(ann);
    }

    /**
     * @param measure
     *            the measure to remove
     */
    public void removeMeasure(final Measure measure)
    {
        if (measure == null || !measures.contains(measure))
        {
            return;
        }

        measures.remove(measure);
    }

    /**
     * @param characterises
     *            the characterises to set
     */
    public void setCharacterises(final String characterises)
    {
        this.characterises = characterises;
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
     * @param refines
     *            the refines to set
     */
    public void setRefines(final String refines)
    {
        this.refines = refines;
    }

    /**
     * @param taggedBy
     *            the taggedBy to set
     */
    public void setTaggedBy(final String taggedBy)
    {
        this.taggedBy = taggedBy;
    }

    /**
     * @param title
     *            the title to set
     */
    public void setTitle(final String title)
    {
        this.title = title;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(final String type)
    {
        this.type = type;
    }

}
