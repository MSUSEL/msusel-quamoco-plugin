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
package net.siliconcode.sonar.quamoco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sonar.api.BatchExtension;

/**
 * JavaMetricsContext -
 *
 * @author Isaac Griffith
 */
public class MetricsContext implements BatchExtension {

    /**
     * 
     */
    public static final String                 NOV              = "NOV";
    /**
     * 
     */
    public static final String                 NOT              = "NOT";
    /**
     * 
     */
    public static final String                 NOM              = "NOM";
    /**
     * 
     */
    public static final String                 NOF              = "NOF";
    /**
     * 
     */
    public static final String                 NOC              = "NOC";
    /**
     * 
     */
    public static final String                 NOS              = "NOS";
    /**
     * 
     */
    public static final String                 LOC              = "LOC";
    /**
     * 
     */
    public static final String                 MAXNESTING       = "MAXNESTING";
    /**
     * Map indexed by qualified class name, containing a map indexed by metric
     * name of values
     */
    protected Map<String, Map<String, Number>> classMetrics     = new HashMap<>();
    /**
     * Map indexed by absolute file name, containing a map indexed by metric
     * name of values
     */
    protected Map<String, Map<String, Number>> fileMetrics      = new HashMap<>();;
    /**
     * Map indexed by qualified method name, containing a map indexed by metric
     * name of values
     */
    protected Map<String, Map<String, Number>> methodMetrics    = new HashMap<>();
    /**
     * Map indexed by metric name, containing the metric value
     */
    protected Map<String, Number>              projectMetrics   = new HashMap<>();

    private static final Map<String, String>   metricNameLookup = new HashMap<>();

    static
    {
        metricNameLookup.put("class/CountDeclInstanceMethod", NOM);
        metricNameLookup.put("file/CountDeclClass", NOC);
        metricNameLookup.put("file/CountStmt", NOS);
        metricNameLookup.put("class/CountDeclInstanceVariable", NOF);
        metricNameLookup.put("#Methods", NOM);
        metricNameLookup.put("#Fields", NOF);
        metricNameLookup.put("#Variables", NOV);
        metricNameLookup.put("#Statements", NOS);
        metricNameLookup.put("#Classes", NOC);
        metricNameLookup.put("#Classes", NOC);
        metricNameLookup.put("#Statements", NOS);
        metricNameLookup.put("#FieldDeclarations", NOF);
        metricNameLookup.put("#LocalVariableDeclarations", NOV);
        metricNameLookup.put("#Types", NOT);
    }

    public MetricsContext()
    {
        classMetrics = new HashMap<>();
        fileMetrics = new HashMap<>();
        methodMetrics = new HashMap<>();
        projectMetrics = new HashMap<>();
    }

    /**
     * @param file
     * @param metric
     * @return
     */
    public int getFileMetric(String file, String metric) throws MetricsContextException
    {
        return getMetric(file, metric, fileMetrics);
    }

    /**
     * @param method
     * @param metric
     * @return
     */
    public int getMethodMetric(String method, String metric) throws MetricsContextException
    {
        return getMetric(method, metric, methodMetrics);
    }

    /**
     * @param type
     * @param metric
     * @return
     * @throws MetricsContextException
     */
    public int getTypeMetric(String type, String metric) throws MetricsContextException
    {
        return getMetric(type, metric, classMetrics);
    }

    /**
     * @param metric
     * @return
     */
    public int getProjectMetric(String metric) throws MetricsContextException
    {
        if (metric == null || metric.isEmpty())
            throw new MetricsContextException();

        if (projectMetrics.containsKey(metric))
            return projectMetrics.get(metric).intValue();
        else if (metricNameLookup.containsKey(metric))
            return projectMetrics.get(metricNameLookup.get(metric)).intValue();

        return -1;
    }

    /**
     * @param key
     * @param metric
     * @param map
     * @return
     */
    private int getMetric(String key, String metric, Map<String, Map<String, Number>> map)
            throws MetricsContextException
    {
        if (key == null || key.isEmpty() || metric == null || metric.isEmpty() || map == null)
            throw new MetricsContextException();

        if (map.containsKey(key))
        {
            if (map.get(key).containsKey(metric))
                return map.get(key).get(metric).intValue();
            else if (metricNameLookup.containsKey(metric))
                return map.get(key).get(metricNameLookup.get(metric)).intValue();
        }

        return -1;
    }

    /**
     * @param metric
     * @return
     */
    public List<Double> getAllClassValues(String metric)
    {
        List<Double> list = new ArrayList<>();

        for (String key : classMetrics.keySet())
        {
            if (classMetrics.get(key).containsKey(metric))
            {
                list.add(classMetrics.get(key).get(metric).doubleValue());
            }
        }

        return list;
    }

    /**
     * @param metric
     * @return
     */
    public List<Double> getAllFileValues(String metric)
    {
        List<Double> list = new ArrayList<>();

        for (String key : fileMetrics.keySet())
        {
            if (fileMetrics.get(key).containsKey(metric))
            {
                list.add(fileMetrics.get(key).get(metric).doubleValue());
            }
        }

        return list;
    }

    /**
     * @param metric
     * @return
     */
    public List<Double> getAllMethodValues(String metric)
    {
        List<Double> list = new ArrayList<>();

        for (String key : methodMetrics.keySet())
        {
            if (methodMetrics.get(key).containsKey(metric))
            {
                list.add(methodMetrics.get(key).get(metric).doubleValue());
            }
        }

        return list;
    }
}
