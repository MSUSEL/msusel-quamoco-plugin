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

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * PartOf -
 * 
 * @author Isaac Griffith
 */
@XStreamAlias("partOf")
public class PartOf {

    @XStreamAlias("xmi:id")
    @XStreamAsAttribute
    private String id;

    private Parent parent;

    public PartOf(String id, Parent parent)
    {
        if ((id == null || id.isEmpty()) || parent == null)
            throw new IllegalArgumentException();
        this.id = id;
        this.parent = parent;
    }

    public String getId()
    {
        return id;
    }

    public Parent getParent()
    {
        return parent;
    }

    public void setId(String id)
    {
        if (id == null || id.isEmpty())
            throw new IllegalArgumentException();

        this.id = id;
    }

    public void setParent(Parent parent)
    {
        this.parent = parent;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((parent == null) ? 0 : parent.hashCode());
        return result;
    }

    /* (non-Javadoc)
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
        if (!(obj instanceof PartOf))
        {
            return false;
        }
        PartOf other = (PartOf) obj;
        if (parent == null)
        {
            if (other.parent != null)
            {
                return false;
            }
        }
        else if (!parent.equals(other.parent))
        {
            return false;
        }
        return true;
    }
}
