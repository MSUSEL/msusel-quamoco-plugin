/**
 * The MIT License (MIT)
 * 
 * MSUSEL Sonar Quamoco Plugin
 * Copyright (c) 2015-2017 Montana State University, Gianforte School of Computing,
 * Software Engineering Laboratory
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
package edu.montana.gsoc.msusel.codetree.sonar.quamoco.metrics;

import com.sparqline.codetree.INode;
import com.sparqline.codetree.node.FileNode;
import com.sparqline.codetree.node.MethodNode;
import com.sparqline.codetree.node.ProjectNode;
import com.sparqline.codetree.node.TypeNode;
import edu.montana.gsoc.msusel.codetree.sonar.quamoco.QuamocoMetricsController;

/**
 * Factory used to generate the correct QuamocoMetricsController for a given
 * CodeNode.
 * 
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class QuamocoMetricsControllerFactory {

    /**
     * FactoryMethod for subtypes of QuamocoMetricsController
     * 
     * @param node
     *            CodeNode used to determine the type of MetricsController to
     *            produce.
     * @return MetricsController applicable to the type of CodeNode provided, or
     *         null if no such MetricsController exists.
     */
    public static QuamocoMetricsController getController(INode node)
    {
        if (node instanceof ProjectNode)
        {
            return new ProjectMetricsController();
        }
        else if (node instanceof FileNode)
        {
            return new FileMetricsController();
        }
        else if (node instanceof TypeNode)
        {
            return new ClassMetricsController();
        }
        else if (node instanceof MethodNode)
        {
            return new MethodMetricsController();
        }
        else
        {
            return null;
        }
    }
}
