/**
 *
 */
package net.siliconcode.quamoco.distill.qm;

/**
 * Tag -
 *
 * @author isaac
 */
public class Tag extends AbstractQMEntity {

    /**
     *
     */
    public Tag(String name, String description, String id)
    {
        this.name = name;
        this.description = description;
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
        final AbstractQMEntity other = (AbstractQMEntity) obj;
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
        return true;
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
        return result;
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
