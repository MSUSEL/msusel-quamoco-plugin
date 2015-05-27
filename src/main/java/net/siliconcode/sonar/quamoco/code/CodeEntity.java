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
package net.siliconcode.sonar.quamoco.code;

import java.util.ArrayList;
import java.util.List;

/**
 * CodeEntity -
 *
 * @author Isaac Griffith
 */
public class CodeEntity {

    private CodeEntityType         type;

    private String                 name;

    private final List<CodeEntity> children;

    private int                    start;
    private int                    end;
    private int                    loc;
    private boolean                isStatic = false;

    public CodeEntity(final String name, final CodeEntityType type, final int start, final int end)
    {
        this.name = name;
        this.type = type;
        this.start = start;
        this.end = end;
        children = new ArrayList<>();
    }

    public void addChild(final CodeEntity child)
    {
        if (child == null || children.contains(child))
        {
            return;
        }

        children.add(child);
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
        final CodeEntity other = (CodeEntity) obj;
        if (end != other.end)
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
        if (start != other.start)
        {
            return false;
        }
        if (type != other.type)
        {
            return false;
        }
        return true;
    }

    public List<CodeEntity> getChildren()
    {
        return children;
    }

    /**
     * @return the end
     */
    public int getEnd()
    {
        return end;
    }

    /**
     * @return the loc
     */
    public int getLoc()
    {
        return loc;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return the start
     */
    public int getStart()
    {
        return start;
    }

    /**
     * @return the type
     */
    public CodeEntityType getType()
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
        result = prime * result + end;
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + start;
        result = prime * result + (type == null ? 0 : type.hashCode());
        return result;
    }

    /**
     * @return the isStatic
     */
    public boolean isStatic()
    {
        return isStatic;
    }

    public void removeChild(final CodeEntity child)
    {
        if (child == null || !children.contains(child))
        {
            return;
        }

        children.remove(child);
    }

    /**
     * @param end
     *            the end to set
     */
    public void setEnd(final int end)
    {
        this.end = end;
    }

    /**
     * @param loc
     *            the loc to set
     */
    public void setLoc(final int loc)
    {
        this.loc = loc;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(final String name)
    {
        this.name = name;
    }

    /**
     * @param start
     *            the start to set
     */
    public void setStart(final int start)
    {
        this.start = start;
    }

    /**
     * @param isStatic
     *            the isStatic to set
     */
    public void setStatic(final boolean isStatic)
    {
        this.isStatic = isStatic;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(final CodeEntityType type)
    {
        this.type = type;
    }
}
