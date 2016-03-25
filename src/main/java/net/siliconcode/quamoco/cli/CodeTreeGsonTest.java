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
package net.siliconcode.quamoco.cli;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.siliconcode.quamoco.codetree.CodeTree;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.codetree.MethodNode;
import net.siliconcode.quamoco.codetree.TypeNode;

/**
 * CodeTreeGsonTest -
 * 
 * @author Isaac Griffith
 *
 */
public class CodeTreeGsonTest {

    /**
     * @param args
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
        CodeTree fixture = new CodeTree();
        final FileNode file1 = new FileNode("path1");
        final FileNode file2 = new FileNode("path2");
        fixture.addFile(file1);
        fixture.addFile(file2);

        final TypeNode type1 = new TypeNode(file1, "namespace.Type1", "Type1", true, 100, 150);
        final MethodNode method1 = new MethodNode(type1, "method1", false, 110, 150);
        type1.addMethod(method1);
        file1.addType(type1);

        final TypeNode type2 = new TypeNode(file2, "namespace.Type2", "Type2", true, 100, 150);
        final MethodNode method2 = new MethodNode(type2, "method2", false, 110, 150);
        type2.addMethod(method2);
        file2.addType(type2);

        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
        String output = gson.toJson(fixture);

        System.out.println(output);

        CodeTree tree = gson.fromJson(output, CodeTree.class);
        String output2 = gson.toJson(tree);

        System.out.println(output.equals(output2));

        System.out.println(Double.POSITIVE_INFINITY / Double.NEGATIVE_INFINITY);
    }
}
