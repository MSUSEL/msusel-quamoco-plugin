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
package net.siliconcode.quamoco.codetree;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import net.siliconcode.quamoco.aggregator.keys.FlyweightKeyFactory;

/**
 * FileNode -
 * 
 * @author Isaac Griffith
 */
public class FileNode extends CodeNode {

    private SortedSet<CodeNode> types = new TreeSet<>();

    public FileNode(String fullPath)
    {
        super(null, FlyweightKeyFactory.getInstance().getKey(fullPath, fullPath), 0, 0);
    }

    public boolean addType(TypeNode node)
    {
        return addChild(node, types, TypeNode.class);
    }

    public boolean removeType(TypeNode node)
    {
        return removeChild(node, types, TypeNode.class);
    }

    public Set<CodeNode> getTypes()
    {
        return types;
    }

    /**
     * @param line
     * @return
     */
    public String getMethod(int line)
    {
        for (CodeNode node : types)
        {
            if (node instanceof TypeNode)
            {
                TypeNode t = (TypeNode) node;
                if (t.containsLine(line))
                {
                    return t.getMethod(line).getIdentifier().getShortKey();
                }
            }
        }

        return "";
    }

    /**
     * @param line
     * @return
     */
    public String getType(int line)
    {
        for (CodeNode node : types)
        {
            if (node instanceof TypeNode)
            {
                TypeNode t = (TypeNode) node;
                return t.getIdentifier().getShortKey();
            }
        }

        return "";
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.codetree.CodeNode#getType()
     */
    @Override
    public String getType()
    {
        return CodeNodeType.FILE;
    }
}
