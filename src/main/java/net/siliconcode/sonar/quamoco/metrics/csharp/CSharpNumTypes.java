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
package net.siliconcode.sonar.quamoco.metrics.csharp;

import net.siliconcode.sonar.quamoco.code.CodeEntity;
import net.siliconcode.sonar.quamoco.code.CodeTree;
import net.siliconcode.sonar.quamoco.code.MetricContext;
import net.siliconcode.sonar.quamoco.metrics.CSharpMetrics;

import org.sonar.api.measures.Measure;

/**
 * CSharpNumTypes -
 *
 * @author Isaac Griffith
 */
public class CSharpNumTypes {

    private static int totalNOT = -1;

    public static Measure<Double> getTotalNOT(final MetricContext metctx)
    {
        if (totalNOT < 0)
        {
            int count = 0;
            for (final CodeTree tree : metctx.getTrees())
            {
                for (final CodeEntity root : tree.getRoots())
                {
                    count += 1;
                }
            }
            totalNOT = count;
        }

        return new Measure<Double>(CSharpMetrics.NOT, (double) totalNOT);
    }
}
