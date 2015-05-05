/**
 *
 */
package net.siliconcode.quamoco.distill.qmr;

/**
 * Value -
 *
 * @author isaac
 */
public class Value {

    private double lower;
    private double upper;
    private String id;

    /**
     *
     */
    public Value(double lower, double upper, String id)
    {
        this.lower = lower;
        this.upper = upper;
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
        final Value other = (Value) obj;
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
        if (Double.doubleToLongBits(lower) != Double.doubleToLongBits(other.lower))
        {
            return false;
        }
        if (Double.doubleToLongBits(upper) != Double.doubleToLongBits(other.upper))
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
     * @return the lower
     */
    public double getLower()
    {
        return lower;
    }

    /**
     * @return the upper
     */
    public double getUpper()
    {
        return upper;
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
        temp = Double.doubleToLongBits(lower);
        result = prime * result + (int) (temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(upper);
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
     * @param lower
     *            the lower to set
     */
    public void setLower(double lower)
    {
        this.lower = lower;
    }

    /**
     * @param upper
     *            the upper to set
     */
    public void setUpper(double upper)
    {
        this.upper = upper;
    }

    /**
     * @return
     */
    public double getMean()
    {
        if (upper != Double.NEGATIVE_INFINITY && lower != Double.NEGATIVE_INFINITY)
            return (upper + lower) / 2;
        else if (upper != Double.NEGATIVE_INFINITY)
            return upper;
        else if (lower != Double.NEGATIVE_INFINITY)
            return lower;
        else
            return 0;
    }

}
