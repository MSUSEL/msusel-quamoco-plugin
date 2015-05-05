/**
 *
 */
package net.siliconcode.quamoco.distill.qm;

/**
 * Tool -
 *
 * @author isaac
 */
public class Tool extends AbstractQMEntity {

    private String     originatesFrom;
    private Annotation annotation;

    /**
     *
     */
    public Tool(String name, String description, String originatesFrom, String id)
    {
        this.name = name;
        this.description = description;
        this.originatesFrom = originatesFrom;
        this.id = id;
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
        final Tool other = (Tool) obj;
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
     * @return the originatesFrom
     */
    public String getOriginatesFrom()
    {
        return originatesFrom;
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
        result = prime * result + (description == null ? 0 : description.hashCode());
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (originatesFrom == null ? 0 : originatesFrom.hashCode());
        return result;
    }

    /**
     * @param annotation
     *            the annotation to set
     */
    public void setAnnotation(Annotation annotation)
    {
        this.annotation = annotation;
    }

    /**
     * @param originatesFrom
     *            the originatesFrom to set
     */
    public void setOriginatesFrom(String originatesFrom)
    {
        this.originatesFrom = originatesFrom;
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
