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
import java.util.List;

/**
 * Factor -
 *
 * @author Isaac Griffith
 */
public class Factor extends AbstractQMEntity {

    private String                characterises;
    private String                originatesFrom;
    private String                title;
    private Annotation            annotation;
    private final List<Influence> influences;
    private String                refines;

    /**
     *
     */
    public Factor(final String name, final String description, final String characterises, final String originatesFrom,
            final String title, final String refines, final String id)
    {
        influences = new ArrayList<>();
        this.characterises = characterises;
        this.name = name;
        this.description = description;
        this.originatesFrom = originatesFrom;
        this.title = title;
        this.refines = refines;
        this.id = id;
    }

    public void addInfluence(final Influence inf)
    {
        if (inf == null || influences.contains(inf))
        {
            return;
        }

        influences.add(inf);
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
        final Factor other = (Factor) obj;
        if (annotation == null)
        {
            if (other.annotation != null)
            {
                return false;
            }
        }
        else if (!annotation.equals(other.annotation))
        {
            return false;
        }
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
        return true;
    }

    /**
     * @return the annotation
     */
    public Annotation getAnnotation()
    {
        return annotation;
    }

    /**
     * @return the characterises
     */
    public String getCharacterises()
    {
        return characterises;
    }

    public List<Influence> getInfluences()
    {
        return influences;
    }

    /**
     * @return the originatesFrom
     */
    public String getOriginatesFrom()
    {
        return originatesFrom;
    }

    /**
     * @return the refines
     */
    public String getRefines()
    {
        return refines;
    }

    /**
     * @return the title
     */
    public String getTitle()
    {
        return title;
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
        result = prime * result + (annotation == null ? 0 : annotation.hashCode());
        result = prime * result + (characterises == null ? 0 : characterises.hashCode());
        result = prime * result + (description == null ? 0 : description.hashCode());
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (originatesFrom == null ? 0 : originatesFrom.hashCode());
        result = prime * result + (refines == null ? 0 : refines.hashCode());
        result = prime * result + (title == null ? 0 : title.hashCode());
        return result;
    }

    public String influenceEffect(final Factor fac)
    {
        for (final Influence inf : influences)
        {
            if (inf.getTarget().equals(fac.getId()))
            {
                return inf.getEffect();
            }
        }
        return null;
    }

    public boolean influences(final Factor fac)
    {
        for (final Influence inf : influences)
        {
            if (inf.getTarget().equals(fac.getId()))
            {
                return true;
            }
        }
        return false;
    }

    public void removeInfluence(final Influence inf)
    {
        if (inf == null || !influences.contains(inf))
        {
            return;
        }

        influences.remove(inf);
    }

    /**
     * @param annotation
     *            the annotation to set
     */
    public void setAnnotation(final Annotation annotation)
    {
        this.annotation = annotation;
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
     * @param title
     *            the title to set
     */
    public void setTitle(final String title)
    {
        this.title = title;
    }

}
