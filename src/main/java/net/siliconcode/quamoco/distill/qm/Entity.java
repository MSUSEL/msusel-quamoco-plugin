/**
 *
 */
package net.siliconcode.quamoco.distill.qm;

import java.util.ArrayList;
import java.util.List;

/**
 * Entity -
 *
 * @author isaac
 */
public class Entity extends AbstractQMEntity {

    private String             originatesFrom;
    private String             title;
    private final List<String> isAs;
    private String             partOf;

    /**
     *
     */
    public Entity(String name, String description, String originatesFrom, String title, String id, String partOf)
    {
        isAs = new ArrayList<>();
        this.description = description;
        this.name = name;
        this.title = title;
        this.id = id;
        this.originatesFrom = originatesFrom;
        this.partOf = partOf;
    }

    public void addIsA(String isa)
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

    public void removeIsA(String isa)
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
    public void setOriginatesFrom(String originatesFrom)
    {
        this.originatesFrom = originatesFrom;
    }

    /**
     * @param partOf
     *            the partOf to set
     */
    public void setPartOf(String partOf)
    {
        this.partOf = partOf;
    }

    /**
     * @param title
     *            the title to set
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.qm.AbstractQMEntity#resolve()
     */
    @Override
    public void resolve()
    {
        // TODO Auto-generated method stub

    }

}
