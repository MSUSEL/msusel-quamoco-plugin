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

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TypeNode -
 * 
 * @author Isaac Griffith
 */
public class TypeNode extends CodeNode {

    private int                 NOT     = 0;
    private int                 LOC     = 0;
    private int                 NOS     = 0;
    private int                 NOF     = 0;
    private int                 NOM     = 0;
    private int                 NOC     = 0;

    private SortedSet<CodeNode> methods = new TreeSet<>();
    private SortedSet<CodeNode> fields  = new TreeSet<>();
    private SortedSet<CodeNode> types   = new TreeSet<>();
    private boolean             isClass;

    /**
     * @param identifier
     * @param start
     * @param end
     */
    public TypeNode(String identifier, boolean isClass, int start, int end)
    {
        super(identifier, start, end);
        this.isClass = isClass;
    }

    public void addType(CodeNode type)
    {
        addChild(type, types, TypeNode.class);
    }

    public void removeType(CodeNode type)
    {
        removeChild(type, types, TypeNode.class);
    }

    public void addField(CodeNode field)
    {
        addChild(field, fields, FieldNode.class);
    }

    public void removeField(CodeNode field)
    {
        removeChild(field, fields, FieldNode.class);
    }

    public void addMethod(CodeNode method)
    {
        addChild(method, methods, MethodNode.class);
    }

    public void removeMethod(CodeNode method)
    {
        removeChild(method, methods, MethodNode.class);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.quamoco.aggregator.codetree.CodeNode#updateMetrics(net
     * .siliconcode.quamoco.aggregator.codetree.CodeNode)
     */
    @Override
    protected void updateMetrics(CodeNode node)
    {
        NOT = 0;
        NOC = 0;
        NOS = 0;
        NOF = 0;
        NOM = 0;
        for (CodeNode child : types)
        {
            NOT += child.getMetric("NOT");
            NOC += child.getMetric("NOC");
            NOS += child.getMetric("NOS");
            if (((TypeNode) child).isClass())
                NOC++;
            NOT++;
        }
        NOF = fields.size();
        NOM = methods.size();
        for (CodeNode child : methods)
        {
            NOS += child.getMetric("NOS");
        }
        NOS += NOF;
        owner.updateMetrics(this);
    }

    /**
     * @return
     */
    private boolean isClass()
    {
        return isClass;
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.quamoco.aggregator.codetree.CodeNode#getMetric(java.lang
     * .String)
     */
    @Override
    public int getMetric(String name)
    {
        if (name.equals(CodeNode.LOC))
            return LOC;
        if (name.equals(CodeNode.NOC))
            return NOC;
        if (name.equals(CodeNode.NOT))
            return NOT;
        if (name.equals(CodeNode.NOS))
            return NOS;
        if (name.equals(CodeNode.NOM))
            return NOM;
        if (name.equals(CodeNode.NOF))
            return NOF;

        return -1;
    }
}
