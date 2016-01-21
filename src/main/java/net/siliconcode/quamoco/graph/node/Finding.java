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
package net.siliconcode.quamoco.graph.node;

import net.siliconcode.quamoco.aggregator.keys.FlyweightKey;

/**
 * Finding -
 * 
 * @author Isaac Griffith
 */
public class Finding {

    private FlyweightKey location;
    private String       locationType;
    private String       issueKey;
    private String       issueName;

    /**
     * 
     */
    public Finding(FlyweightKey location, String locationType, String issueKey, String issueName)
    {
        this.location = location;
        this.locationType = locationType;
        this.issueKey = issueKey;
        this.issueName = issueName;
    }

    /**
     * @return the location
     */
    public FlyweightKey getLocation()
    {
        return location;
    }

    /**
     * @param location
     *            the location to set
     */
    public void setLocation(FlyweightKey location)
    {
        this.location = location;
    }

    /**
     * @return the locationType
     */
    public String getLocationType()
    {
        return locationType;
    }

    /**
     * @param locationType
     *            the locationType to set
     */
    public void setLocationType(String locationType)
    {
        this.locationType = locationType;
    }

    /**
     * @return the issueKey
     */
    public String getIssueKey()
    {
        return issueKey;
    }

    /**
     * @param issueKey
     *            the issueKey to set
     */
    public void setIssueKey(String issueKey)
    {
        this.issueKey = issueKey;
    }

    /**
     * @return the issueName
     */
    public String getIssueName()
    {
        return issueName;
    }

    /**
     * @param issueName
     *            the issueName to set
     */
    public void setIssueName(String issueName)
    {
        this.issueName = issueName;
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
        result = prime * result + ((issueKey == null) ? 0 : issueKey.hashCode());
        result = prime * result + ((issueName == null) ? 0 : issueName.hashCode());
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        result = prime * result + ((locationType == null) ? 0 : locationType.hashCode());
        return result;
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
        if (!(obj instanceof Finding))
        {
            return false;
        }
        Finding other = (Finding) obj;
        if (issueKey == null)
        {
            if (other.issueKey != null)
            {
                return false;
            }
        }
        else if (!issueKey.equals(other.issueKey))
        {
            return false;
        }
        if (issueName == null)
        {
            if (other.issueName != null)
            {
                return false;
            }
        }
        else if (!issueName.equals(other.issueName))
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
        if (locationType == null)
        {
            if (other.locationType != null)
            {
                return false;
            }
        }
        else if (!locationType.equals(other.locationType))
        {
            return false;
        }
        return true;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Finding [location=" + location + ", locationType=" + locationType + ", issueKey=" + issueKey
                + ", issueName=" + issueName + "]";
    }

}
