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
package net.siliconcode.quamoco.aggregator.codetree;

import java.util.Set;

/**
 * CodeNode -
 * 
 * @author Isaac Griffith
 */
public abstract class CodeNode implements Comparable<CodeNode> {

    private String             identifier;
    protected CodeNode         owner;
    private int                start;
    private int                end;

    public static final String NOT = "NOT";
    public static final String NOF = "NOF";
    public static final String NOS = "NOS";
    public static final String NOC = "NOC";
    public static final String LOC = "LOC";
    public static final String NOM = "NOM";

    public CodeNode(String identifier, int start, int end)
    {
        this.identifier = identifier;
        this.start = start;
        this.end = end;
    }

    /**
     * @return the identifier
     */
    public String getIdentifier()
    {
        return identifier;
    }

    /**
     * @param identifier
     *            the identifier to set
     */
    public void setIdentifier(String identifier)
    {
        this.identifier = identifier;
    }

    /**
     * @return the start
     */
    public int getStart()
    {
        return start;
    }

    /**
     * @param start
     *            the start to set
     */
    public void setStart(int start)
    {
        this.start = start;
    }

    /**
     * @return the end
     */
    public int getEnd()
    {
        return end;
    }

    /**
     * @param end
     *            the end to set
     */
    public void setEnd(int end)
    {
        this.end = end;
    }

    protected abstract void updateMetrics(CodeNode node);

    /*
     * (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(CodeNode o)
    {
        return Integer.compare(this.start, o.start);
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
        result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
        result = prime * result + start;
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
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CodeNode other = (CodeNode) obj;
        if (end != other.end)
            return false;
        if (identifier == null)
        {
            if (other.identifier != null)
                return false;
        }
        else if (!identifier.equals(other.identifier))
            return false;
        if (start != other.start)
            return false;
        return true;
    }

    /**
     * @param name
     * @return
     */
    public abstract int getMetric(String name);

    protected boolean removeChild(CodeNode child, Set<CodeNode> set, Class type)
    {
        if (child == null || !type.isInstance(child) || !set.contains(type))
            return false;

        set.remove(child);
        child.setOwner(null);
        updateMetrics(child);

        return true;
    }

    /**
     * @param owner
     */
    protected void setOwner(CodeNode owner)
    {
        this.owner = owner;
    }

    protected boolean addChild(CodeNode child, Set<CodeNode> set, Class type)
    {
        if (child == null || !type.isInstance(child))
            return false;

        set.add(child);
        child.setOwner(this);
        updateMetrics(child);

        return true;
    }
}
