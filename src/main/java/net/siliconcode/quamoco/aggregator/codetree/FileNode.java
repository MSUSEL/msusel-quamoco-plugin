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
 * FileNode -
 * 
 * @author Isaac Griffith
 */
public class FileNode extends CodeNode {

    private SortedSet<CodeNode> types = new TreeSet<>();
    private int                 NOT   = 0;
    private int                 LOC   = 0;
    private int                 NOS   = 0;
    private int                 NOF   = 0;
    private int                 NOM   = 0;
    private int                 NOC   = 0;

    public FileNode(String identifier, int start, int end)
    {
        super(identifier, start, end);
    }

    public boolean addType(TypeNode node)
    {
        return addChild(node, types, TypeNode.class);
    }

    public boolean removeType(TypeNode node)
    {
        return removeChild(node, types, TypeNode.class);
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.quamoco.aggregator.codetree.CodeNode#updateMetrics(net
     * .siliconcode.quamoco.aggregator.codetree.CodeNode)
     */
    @Override
    public void updateMetrics(CodeNode node)
    {
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
