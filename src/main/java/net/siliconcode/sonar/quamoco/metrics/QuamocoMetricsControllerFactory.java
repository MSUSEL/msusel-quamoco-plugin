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
package net.siliconcode.sonar.quamoco.metrics;

import com.sparqline.quamoco.codetree.CodeNode;
import com.sparqline.quamoco.codetree.FileNode;
import com.sparqline.quamoco.codetree.MethodNode;
import com.sparqline.quamoco.codetree.ProjectNode;
import com.sparqline.quamoco.codetree.TypeNode;

import net.siliconcode.sonar.quamoco.QuamocoMetricsController;

/**
 * QuamocoMetricsControllerFactory -
 * 
 * @author Isaac Griffith
 */
public class QuamocoMetricsControllerFactory {

    /**
     * 
     */
    public QuamocoMetricsControllerFactory()
    {
        // TODO Auto-generated constructor stub
    }

    public static QuamocoMetricsController getController(CodeNode node)
    {
        if (node instanceof ProjectNode)
        {
            return new ModuleMetricsController();
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
