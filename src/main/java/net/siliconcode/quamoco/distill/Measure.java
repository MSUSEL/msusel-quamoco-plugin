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
package net.siliconcode.quamoco.distill;

import java.util.ArrayList;
import java.util.List;

/**
 * Measure -
 *
 * @author Isaac Griffith
 */
public class Measure {

    /**
     * Name of the metric that is being measured.
     */
    private final String   name;
    /**
     * The description of the metric that is being measured.
     */
    private final String   description;
    /**
     * The names of parent metrics of the metric being measured.
     */
    private final String[] parents;
    /**
     * The Evaluation or Rank id for which this measure relates a value to.
     */
    private final String   id;
    private String[]       evaluators;
    private List<Double>   values;

    /**
     * 
     */
    public Measure(String id, String name, String description, String[] parents, String[] evaluators)
    {
        this.name = name;
        this.id = id;
        this.description = description;
        this.parents = parents;
        this.evaluators = evaluators;
        this.values = new ArrayList<>();
    }

    public void addValue(double value)
    {
        if (Double.isNaN(value) || Double.compare(value, 0.0) < 0)
            return;

        values.add(value);
    }

    public double getValue()
    {
        double total = 0;
        for (double val : values)
            total += val;

        if (values.size() >= 1)
            total /= values.size();

        return total;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    public String getId()
    {
        return id;
    }

    public String[] getParents()
    {
        return parents;
    }

    public String[] getEvaluators()
    {
        return evaluators;
    }
}
