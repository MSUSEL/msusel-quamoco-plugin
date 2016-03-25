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

import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.annotations.Expose;

/**
 * FileNode -
 *
 * @author Isaac Griffith
 */
public class FileNode extends CodeNode {

    @Expose
    private final Map<String, TypeNode> types = Maps.newHashMap();

    private FileNode() {
        super();
    }

    public FileNode(final String fullPath) {
        super(null, fullPath, 1, 1);
    }

    public boolean addType(final TypeNode node) {
        if (node == null || types.containsKey(node.getQIdentifier())) {
            return false;
        }

        types.put(node.getQIdentifier(), node);
        node.setOwner(this);

        return true;
    }

    public boolean removeType(final TypeNode node) {
        if (node == null || !types.containsKey(node.getQIdentifier())) {
            return false;
        }

        types.remove(node);
        node.setOwner(null);
        return true;
    }

    public Set<TypeNode> getTypes() {
        final Set<TypeNode> typeSet = Sets.newTreeSet();

        for (final String key : types.keySet()) {
            typeSet.add(types.get(key));
        }

        return typeSet;
    }

    /**
     * @param line
     * @return
     */
    public String getMethod(final int line) {
        final String type = getType(line);
        if (type != null && types.containsKey(type)) {
            final TypeNode node = types.get(getType(line));
            if (node.getMethod(line) != null) {
                return node.getMethod(line).getQIdentifier();
            }
        }

        return "";
    }

    /**
     * @param line
     * @return
     */
    public String getType(final int line) {
        for (final String type : types.keySet()) {
            final TypeNode node = types.get(type);
            if (node.containsLine(line)) {
                return node.getQIdentifier();
            }
        }

        return "";
    }

    /*
     * (non-Javadoc)
     *
     * @see net.siliconcode.quamoco.codetree.CodeNode#getType()
     */
    @Override
    public String getType() {
        return CodeNodeType.FILE;
    }

    /**
     * @param line
     * @return
     */
    public String getField(final int line) {
        final String type = getType(line);

        if (type != null && types.containsKey(type)) {
            final TypeNode node = types.get(type);
            if (node.getField(line) != null) {
                return node.getField(line).getQIdentifier();
            }
        }

        return "";
    }

    /*
     * (non-Javadoc)
     *
     * @see net.siliconcode.quamoco.codetree.CodeNode#updateKey()
     */
    @Override
    protected void updateKey() {
    }
}
