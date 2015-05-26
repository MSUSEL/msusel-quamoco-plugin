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
package net.siliconcode.quamoco.aggregator.strategy;

import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.measures.Metric;

/**
 * BasicNormalizationStrategy -
 * 
 * @author Isaac Griffith
 */
public class BasicNormalizationStrategy implements NormalizationStrategy {

    private Metric           normMetric;
    private DecoratorContext context;

    /**
     * @param normMetric
     * @param contex
     */
    public BasicNormalizationStrategy(Metric normMetric, DecoratorContext contex)
    {
        this.context = contex;
        this.normMetric = normMetric;
    }

    /*
     * (non-Javadoc)
     * @see
     * net.siliconcode.quamoco.aggregator.strategy.NormalizationStrategy#calculate
     * (java.lang.Double[])
     */
    @Override
    public double[] calculate(Double... values)
    {
        double norm = context.getMeasure(normMetric).getValue();
        double[] retval = new double[values.length];
        for (int i = 0; i < values.length; i++)
        {
            retval[i] = values[i] / norm;
        }

        return retval;
    }
}
