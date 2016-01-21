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
import java.util.List;

/**
 * Entity -
 *
 * @author Isaac Griffith
 */
public class Entity extends AbstractQMEntity {

    private String             originatesFrom;
    private String             title;
    private final List<String> isAs;
    private String             partOf;

    /**
     *
     */
    public Entity(final String name, final String description, final String originatesFrom, final String title,
            final String id, final String partOf)
    {
        isAs = new ArrayList<>();
        this.description = description;
        this.name = name;
        this.title = title;
        this.id = id;
        this.originatesFrom = originatesFrom;
        this.partOf = partOf;
    }

    public void addIsA(final String isa)
    {
        if (isa == null || isa.isEmpty() || isAs.contains(isa))
        {
            return;
        }

        isAs.add(isa);
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
        final Entity other = (Entity) obj;
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
        if (partOf == null)
        {
            if (other.partOf != null)
            {
                return false;
            }
        }
        else if (!partOf.equals(other.partOf))
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
     * @return the originatesFrom
     */
    public String getOriginatesFrom()
    {
        return originatesFrom;
    }

    /**
     * @return the partOf
     */
    public String getPartOf()
    {
        return partOf;
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
        result = prime * result + (description == null ? 0 : description.hashCode());
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (originatesFrom == null ? 0 : originatesFrom.hashCode());
        result = prime * result + (partOf == null ? 0 : partOf.hashCode());
        result = prime * result + (title == null ? 0 : title.hashCode());
        return result;
    }

    public void removeIsA(final String isa)
    {
        if (isa == null || isa.isEmpty() || !isAs.contains(isa))
        {
            return;
        }

        isAs.remove(isa);
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
     * @param partOf
     *            the partOf to set
     */
    public void setPartOf(final String partOf)
    {
        this.partOf = partOf;
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
