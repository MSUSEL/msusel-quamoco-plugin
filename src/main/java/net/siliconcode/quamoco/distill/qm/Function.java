/**
 *
 */
package net.siliconcode.quamoco.distill.qm;

/**
 * Function -
 *
 * @author isaac
 */
public class Function {

    private double lowerBound;
    private double upperBound;
    private String type;
    private String id;

    /**
     *
     */
    public Function(double lowerBound, double upperBound, String type, String id)
    {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.type = type;
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
        final Function other = (Function) obj;
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
        if (Double.doubleToLongBits(lowerBound) != Double.doubleToLongBits(other.lowerBound))
        {
            return false;
        }
        if (Double.doubleToLongBits(upperBound) != Double.doubleToLongBits(other.upperBound))
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
     * @return the lowerBound
     */
    public double getLowerBound()
    {
        return lowerBound;
    }

    /**
     * @return the type
     */
    public String getType()
    {
        return type;
    }

    /**
     * @return the upperBound
     */
    public double getUpperBound()
    {
        return upperBound;
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
        long temp;
        temp = Double.doubleToLongBits(lowerBound);
        result = prime * result + (int) (temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(upperBound);
        result = prime * result + (int) (temp ^ temp >>> 32);
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
     * @param lowerBound
     *            the lowerBound to set
     */
    public void setLowerBound(double lowerBound)
    {
        this.lowerBound = lowerBound;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * @param upperBound
     *            the upperBound to set
     */
    public void setUpperBound(double upperBound)
    {
        this.upperBound = upperBound;
    }
}
