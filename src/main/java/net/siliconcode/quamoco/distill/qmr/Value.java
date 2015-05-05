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
package net.siliconcode.quamoco.distill.qmr;

/**
 * Value -
 *
 * @author Isaac Griffith
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
