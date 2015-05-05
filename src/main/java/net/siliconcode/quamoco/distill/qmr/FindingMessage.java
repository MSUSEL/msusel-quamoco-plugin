/**
 *
 */
package net.siliconcode.quamoco.distill.qmr;

/**
 * FindingMessage -
 *
 * @author isaac
 */
public class FindingMessage {

    private String id;
    private String message;
    private String location;

    /**
     *
     */
    public FindingMessage(String message, String location, String id)
    {
        this.id = id;
        this.message = message;
        this.location = location;
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
        final FindingMessage other = (FindingMessage) obj;
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
        if (location == null)
        {
            if (other.location != null)
            {
                return false;
            }
        }
        else if (!location.equals(other.location))
        {
            return false;
        }
        if (message == null)
        {
            if (other.message != null)
            {
                return false;
            }
        }
        else if (!message.equals(other.message))
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
     * @return the location
     */
    public String getLocation()
    {
        return location;
    }

    /**
     * @return the message
     */
    public String getMessage()
    {
        return message;
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
        result = prime * result + (id == null ? 0 : id.hashCode());
        result = prime * result + (location == null ? 0 : location.hashCode());
        result = prime * result + (message == null ? 0 : message.hashCode());
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
     * @param location
     *            the location to set
     */
    public void setLocation(String location)
    {
        this.location = location;
    }

    /**
     * @param message
     *            the message to set
     */
    public void setMessage(String message)
    {
        this.message = message;
    }

}
