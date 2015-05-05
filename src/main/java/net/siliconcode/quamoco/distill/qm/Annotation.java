/**
 *
 */
package net.siliconcode.quamoco.distill.qm;

/**
 * Annotation -
 *
 * @author isaac
 */
public class Annotation {

    private String key;
    private String value;
    private String id;

    /**
     *
     */
    public Annotation(String key, String value, String id)
    {
        this.key = key;
        this.value = value;
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
        final Annotation other = (Annotation) obj;
        if (key == null)
        {
            if (other.key != null)
            {
                return false;
            }
        }
        else if (!key.equals(other.key))
        {
            return false;
        }
        if (value == null)
        {
            if (other.value != null)
            {
                return false;
            }
        }
        else if (!value.equals(other.value))
        {
            return false;
        }
        return true;
    }

    /**
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * @return the key
     */
    public String getKey()
    {
        return key;
    }

    /**
     * @return the value
     */
    public String getValue()
    {
        return value;
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
        result = prime * result + (key == null ? 0 : key.hashCode());
        result = prime * result + (value == null ? 0 : value.hashCode());
        return result;
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
     * @param key
     *            the key to set
     */
    public void setKey(String key)
    {
        this.key = key;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValue(String value)
    {
        this.value = value;
    }

}
