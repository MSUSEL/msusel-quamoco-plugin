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

/**
 * Function -
 *
 * @author Isaac Griffith
 */
public class Function {

    private double lowerBound;
    private double upperBound;
    private String type;
    private String id;

    /**
     *
     */
    public Function(final double lowerBound, final double upperBound, final String type, final String id)
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
    public void setId(final String id)
    {
        this.id = id;
    }

    /**
     * @param lowerBound
     *            the lowerBound to set
     */
    public void setLowerBound(final double lowerBound)
    {
        this.lowerBound = lowerBound;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(final String type)
    {
        this.type = type;
    }

    /**
     * @param upperBound
     *            the upperBound to set
     */
    public void setUpperBound(final double upperBound)
    {
        this.upperBound = upperBound;
    }
}
