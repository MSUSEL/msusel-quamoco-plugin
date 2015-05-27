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

import java.util.List;
import java.util.Map;

import net.siliconcode.sonar.quamoco.QuamocoConstants;

import org.sonar.api.config.Settings;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.api.measures.Metrics;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;

/**
 * CSharpMetrics -
 *
 * @author Isaac Griffith
 */
public class CSharpMetrics implements Metrics {

    public static final Metric<Float>  NOF       = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
            + QuamocoConstants.CSHARP_KEY + "."
            + "class/CountDeclInstanceVariable", "Number of Fields",
            Metric.ValueType.FLOAT).setDirection(Metric.DIRECTION_BETTER)
            .setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL)
            .create();

    public static final Metric<Float>  NOS       = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
            + QuamocoConstants.CSHARP_KEY + "." + "file/CountStmt",
            "Number of Statements", Metric.ValueType.FLOAT)
    .setDirection(Metric.DIRECTION_BETTER).setQualitative(false)
    .setDomain(CoreMetrics.DOMAIN_GENERAL).create();

    public static final Metric<Float>  NOC       = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
            + QuamocoConstants.CSHARP_KEY + "." + "file/CountDeclClass",
            "Number of Classes", Metric.ValueType.FLOAT)
    .setDirection(Metric.DIRECTION_BETTER).setQualitative(false)
    .setDomain(CoreMetrics.DOMAIN_GENERAL).create();

    public static final Metric<Float>  LOC       = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
            + QuamocoConstants.CSHARP_KEY + "." + "LoC", "Lines of Code",
            Metric.ValueType.FLOAT).setDirection(Metric.DIRECTION_BETTER)
            .setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL)
            .create();

    public static final Metric<Float>  NOM       = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
            + QuamocoConstants.CSHARP_KEY + "."
            + "file/CountDeclInstanceMethods", "Number of Methods",
            Metric.ValueType.FLOAT).setDirection(Metric.DIRECTION_BETTER)
            .setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL)
            .create();

    public static final Metric<Float>  NOT       = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
            + QuamocoConstants.CSHARP_KEY + "." + "#Types",
            "Number of Types", Metric.ValueType.FLOAT)
    .setDirection(Metric.DIRECTION_BETTER).setQualitative(false)
    .setDomain(CoreMetrics.DOMAIN_GENERAL).create();
    private static Map<String, Metric> metricMap = Maps.newHashMap();

    static
    {
        metricMap.put(NOF.getName(), NOF);
        metricMap.put(NOS.getName(), NOS);
        metricMap.put(NOC.getName(), NOC);
        metricMap.put(LOC.getName(), LOC);
        metricMap.put(NOM.getName(), NOM);
        metricMap.put(NOT.getName(), NOT);
    }

    /**
     * @param name
     * @return
     */
    public static Metric getMetric(final String name)
    {
        return metricMap.get(name);
    }

    private Settings settings;

    /*
     * (non-Javadoc)
     * @see org.sonar.api.measures.Metrics#getMetrics()
     */
    @Override
    public List<Metric> getMetrics()
    {
        final ImmutableList.Builder<Metric> builder = ImmutableList.builder();
        builder.add(NOF, NOS, NOC, LOC, NOM, NOT);
        return builder.build();
    }

}
