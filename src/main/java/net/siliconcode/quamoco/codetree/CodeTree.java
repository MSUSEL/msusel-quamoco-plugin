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

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;
import com.google.gson.annotations.Expose;

/**
 * CodeTree -
 *
 * @author Isaac Griffith
 */
public class CodeTree {

    /**
     *
     */
    @Expose
    private final Map<String, FileNode> files;

    /**
     *
     */
    public CodeTree() {
        files = Maps.newHashMap();
    }

    /**
     * @param file
     * @param line
     * @return
     */
    public String findMethod(final String file, final int line) {
        if (file == null || file.isEmpty() || line < 0) {
            return "";
        }

        if (files.containsKey(file)) {
            final FileNode node = files.get(file);
            return node.getMethod(line);
        }

        return "";
    }

    /**
     * @param file
     * @param line
     * @return
     */
    public String findClass(final String file, final int line) {
        if (file == null || file.isEmpty() || line < 0) {
            return "";
        }

        if (files.containsKey(file)) {
            final FileNode node = files.get(file);
            return node.getType(line);
        }

        return "";
    }

    /**
     * @param file
     * @return
     */
    public FileNode getFile(final String file) {
        if (file == null || file.isEmpty()) {
            return null;
        }

        return files.get(file);
    }

    /**
     * @param file
     * @param node
     */
    public synchronized void addFile(final FileNode node) {
        if (node == null || files.containsKey(node.getQIdentifier())) {
            return;
        }

        files.put(node.getQIdentifier(), node);
    }

    /**
     * @return
     */
    public Set<String> getFiles() {
        return files.keySet();
    }

    /**
     * @param file
     */
    public void removeFile(final String file) {
        if (file == null || file.isEmpty() || !files.containsKey(file)) {
            return;
        }

        files.remove(file);
    }

    /**
     *
     */
    public void printTree() {
        for (final String file : files.keySet()) {
            final FileNode fn = files.get(file);
            System.out.println(fn.getIdentifier().getShortKey());
            final Set<TypeNode> types = fn.getTypes();
            for (final CodeNode type : types) {
                System.out.println("\t" + type.getIdentifier().getShortKey());
                for (final CodeNode method : ((TypeNode) type).getMethods()) {
                    System.out.println("\t\t" + method.getIdentifier().getShortKey());
                }
            }
        }
    }

    /**
     * @param string
     * @return
     */
    public FileNode findFile(final String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }

        return files.get(string);
    }

    /**
     * @param fnode
     * @param line
     * @return
     */
    public TypeNode findType(final FileNode fnode, final int line) {
        if (fnode == null || line < 1) {
            return null;
        }

        for (final TypeNode tnode : fnode.getTypes()) {
            if (tnode.getQIdentifier().equals(fnode.getType(line))) {
                return tnode;
            }
        }

        return null;
    }

    /**
     * @param type
     * @param line
     * @return
     */
    public MethodNode findMethod(final TypeNode type, final int line) {
        if (type == null || line < 1) {
            return null;
        }

        return type.getMethod(line);
    }

    /**
     * @return
     */
    public Set<String> getMethods() {
        final Set<String> methods = new HashSet<>();

        for (final String file : files.keySet()) {
            for (final CodeNode type : files.get(file).getTypes()) {
                if (type instanceof TypeNode) {
                    for (final CodeNode method : ((TypeNode) type).getMethods()) {
                        methods.add(method.getQIdentifier());
                    }
                }
            }
        }

        return methods;
    }

    /**
     * @return
     */
    public Set<String> getTypes() {
        final Set<String> types = new HashSet<>();

        for (final String file : files.keySet()) {
            for (final CodeNode type : files.get(file).getTypes()) {
                types.add(type.getQIdentifier());
            }
        }

        return types;
    }

    /**
     * @param key
     * @return
     */
    public TypeNode findType(final String key) {
        for (final String file : files.keySet()) {
            final FileNode fnode = files.get(file);
            for (final TypeNode tnode : fnode.getTypes()) {
                if (tnode.getQIdentifier().equals(key)) {
                    return tnode;
                }
            }
        }

        return null;
    }

}
