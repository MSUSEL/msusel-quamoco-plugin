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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * CodeTree -
 * 
 * @author Isaac Griffith
 */
public class CodeTree {

    /**
     * 
     */
    private Map<String, FileNode> files;

    /**
     * 
     */
    public CodeTree()
    {
        files = new HashMap<>();
    }

    /**
     * @param file
     * @param line
     * @return
     */
    public String findMethod(String file, int line)
    {
        if (file == null || file.isEmpty() || line < 0)
            return "";

        if (files.containsKey(file))
        {
            FileNode node = files.get(file);
            return node.getMethod(line);
        }

        return "";
    }

    /**
     * @param file
     * @param line
     * @return
     */
    public String findClass(String file, int line)
    {
        if (file == null || file.isEmpty() || line < 0)
            return "";

        if (files.containsKey(file))
        {
            FileNode node = files.get(file);
            return node.getType(line);
        }

        return "";
    }

    /**
     * @param file
     * @return
     */
    public FileNode getFile(String file)
    {
        if (file == null || file.isEmpty())
            return null;

        return files.get(file);
    }

    /**
     * @param file
     * @param node
     */
    public synchronized void addFile(String file, FileNode node)
    {
        if (file == null || file.isEmpty())
            return;

        if (files.containsKey(file))
            return;
        else
            files.put(file, node);
    }

    /**
     * @return
     */
    public Set<String> getFiles()
    {
        return files.keySet();
    }

    /**
     * @param file
     */
    public void removeChild(String file)
    {
        if (file == null || file.isEmpty())
            return;

        if (files.containsKey(file))
            files.remove(file);
    }

    /**
     * 
     */
    public void printTree()
    {
        for (String file : files.keySet())
        {
            FileNode fn = files.get(file);
            System.out.println(fn.getIdentifier());
            Set<CodeNode> types = fn.getTypes();
            for (CodeNode type : types)
            {
                System.out.println("\t" + type.getIdentifier());
                for (CodeNode method : ((TypeNode) type).getMethods())
                {
                    System.out.println("\t\t" + method.getIdentifier());
                }
            }
        }
    }

    /**
     * @param string
     * @return
     */
    public FileNode findFile(String string)
    {
        if (string == null || string.isEmpty())
            return null;

        return files.get(string);
    }

    /**
     * @param fnode
     * @param line
     * @return
     */
    public TypeNode findType(FileNode fnode, int line)
    {
        return null;
    }

    /**
     * @param type
     * @param line
     * @return
     */
    public MethodNode findMethod(TypeNode type, int line)
    {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @param key
     * @return
     */
    public TypeNode findType(String key)
    {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * @return
     */
    public Set<String> getMethods()
    {
        Set<String> methods = new HashSet<>();

        for (String file : files.keySet())
        {
            for (CodeNode type : files.get(file).getTypes())
            {
                if (type instanceof TypeNode)
                {
                    for (CodeNode method : ((TypeNode) type).getMethods())
                    {
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
    public Set<String> getTypes()
    {
        Set<String> types = new HashSet<>();

        for (String file : files.keySet())
        {
            for (CodeNode type : files.get(file).getTypes())
            {
                types.add(type.getQIdentifier());
            }
        }

        return types;
    }

}
