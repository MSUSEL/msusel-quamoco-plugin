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

import java.util.Map;

import com.google.common.collect.Maps;

import net.siliconcode.quamoco.codetree.CodeNode;
import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.Extent;

/**
 * Finding -
 * 
 * @author Isaac Griffith
 */
public class Finding {

    private CodeNode                         location;
    private String                           issueKey;
    private String                           issueName;

    /**
     * Map containing extens for each level, Key = FILE, TYPE, or METHOD, Value
     * = (Map holding extent values for the finding. Key = Metric, Value =
     * Extent (unnormalized))
     */
    private Map<String, Map<String, Double>> extents;

    /**
     * 
     */
    public Finding(CodeNode location, String issueKey, String issueName)
    {
        if (location == null || (issueKey == null || issueKey.isEmpty()) || (issueName == null || issueName.isEmpty()))
            throw new IllegalArgumentException();

        this.location = location;
        this.issueKey = issueKey;
        this.issueName = issueName;
        extents = Maps.newHashMap();
    }

    /**
     * @return the location
     */
    public CodeNode getLocation()
    {
        return location;
    }

    /**
     * @param location
     *            the location to set
     */
    public void setLocation(CodeNode location)
    {
        if (location == null)
            return;

        this.location = location;
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
        if (issueKey == null || issueKey.isEmpty())
            return;

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
        if (issueName == null || issueName.isEmpty())
            return;

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
        return true;
    }

    public boolean addExtent(String level, String metric, double extent)
    {
        if ((level == null || level.isEmpty()) || (metric == null || metric.isEmpty()) || Double.isInfinite(extent))
            return false;

        if (extents.containsKey(level))
        {
            Map<String, Double> map = extents.get(level);
            map.put(metric, extent);
            return true;
        }
        else
        {
            Map<String, Double> map = Maps.newHashMap();
            map.put(metric, extent);
            extents.put(level, map);

            return true;
        }
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Finding [location=" + location.toString() + ", issueKey=" + issueKey + ", issueName=" + issueName + "]";
    }

    /**
     * @param metric
     * @param range
     * @return
     */
    public double getExtent(String metric, NormalizationRange range)
    {
        if (extents.containsKey(range.toString()))
        {
            if (extents.get(range.toString()).containsKey(metric))
            {
                return extents.get(range.toString()).get(metric);
            }
        }

        double extent = Extent.getInstance().findFindingExtent(metric, range, this);
        addExtent(range.toString(), metric, extent);

        return extent;
    }

    /**
     * @return
     */
    public Map<String, Map<String, Double>> getExtents()
    {
        return extents;
    }

}
