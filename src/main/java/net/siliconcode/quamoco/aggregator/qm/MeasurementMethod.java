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
package net.siliconcode.quamoco.aggregator.qm;

/**
 * MeasurementMethod -
 *
 * @author Isaac Griffith
 */
public class MeasurementMethod extends AbstractQMEntity {

    private String     determines;
    private String     metric;
    private String     originatesFrom;
    private String     tool;
    private Annotation annotation;
    private String     type;

    /**
     *
     */
    public MeasurementMethod(final String name, final String description, final String determines, final String tool,
            final String metric, final String originatesFrom, final String type, final String id)
    {
        this.description = description;
        this.determines = determines;
        this.metric = metric;
        this.name = name;
        this.originatesFrom = originatesFrom;
        this.tool = tool;
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
        final MeasurementMethod other = (MeasurementMethod) obj;
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
        if (determines == null)
        {
            if (other.determines != null)
            {
                return false;
            }
        }
        else if (!determines.equals(other.determines))
        {
            return false;
        }
        if (metric == null)
        {
            if (other.metric != null)
            {
                return false;
            }
        }
        else if (!metric.equals(other.metric))
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
        if (type == null)
        {
            if (other.type != null)
            {
                return false;
            }
        }
        else if (!type.equals(other.type))
        {
            return false;
        }
        if (tool == null)
        {
            if (other.tool != null)
            {
                return false;
            }
        }
        else if (!tool.equals(other.tool))
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
     * @return the determines
     */
    public String getDetermines()
    {
        return determines;
    }

    /**
     * @return the metric
     */
    public String getMetric()
    {
        return metric;
    }

    /**
     * @return the originatesFrom
     */
    public String getOriginatesFrom()
    {
        return originatesFrom;
    }

    /**
     * @return the tool
     */
    public String getTool()
    {
        return tool;
    }

    public String getType()
    {
        return type;
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
        result = prime * result + (determines == null ? 0 : determines.hashCode());
        result = prime * result + (metric == null ? 0 : metric.hashCode());
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (originatesFrom == null ? 0 : originatesFrom.hashCode());
        result = prime * result + (type == null ? 0 : type.hashCode());
        result = prime * result + (tool == null ? 0 : tool.hashCode());
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

    /**
     * @param annotation
     *            the annotation to set
     */
    public void setAnnotation(final Annotation annotation)
    {
        this.annotation = annotation;
    }

    /**
     * @param determines
     *            the determines to set
     */
    public void setDetermines(final String determines)
    {
        this.determines = determines;
    }

    /**
     * @param metric
     *            the metric to set
     */
    public void setMetric(final String metric)
    {
        this.metric = metric;
    }

    /**
     * @param originatesFrom
     *            the originatesFrom to set
     */
    public void setOriginatesFrom(final String originatesFrom)
    {
        this.originatesFrom = originatesFrom;
    }

    /**
     * @param tool
     *            the tool to set
     */
    public void setTool(final String tool)
    {
        this.tool = tool;
    }

    public void setType(final String type)
    {
        this.type = type;
    }

}
