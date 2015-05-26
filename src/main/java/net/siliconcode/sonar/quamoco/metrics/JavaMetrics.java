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

import net.siliconcode.sonar.quamoco.QuamocoConstants;

import org.sonar.api.config.Settings;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.api.measures.Metrics;

import com.google.common.collect.ImmutableList;

/**
 * JavaMetrics -
 *
 * @author Isaac Griffith
 */
public class JavaMetrics implements Metrics {

    public static final Metric<Float> NOF = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
                                                  + QuamocoConstants.JAVA_KEY + "." + "NOF", "Number of Fields",
                                                  Metric.ValueType.FLOAT).setDirection(Metric.DIRECTION_BETTER)
                                                  .setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL).create();

    public static final Metric<Float> NOS = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
                                                  + QuamocoConstants.JAVA_KEY + "." + "NOS", "Number of Statements",
                                                  Metric.ValueType.FLOAT).setDirection(Metric.DIRECTION_BETTER)
                                                  .setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL).create();

    public static final Metric<Float> NOC = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
                                                  + QuamocoConstants.JAVA_KEY + "." + "NOC", "Number of Classes",
                                                  Metric.ValueType.FLOAT).setDirection(Metric.DIRECTION_BETTER)
                                                  .setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL).create();

    public static final Metric<Float> LOC = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
                                                  + QuamocoConstants.JAVA_KEY + "." + "NCLOC",
                                                  "Non Comment Lines of Code", Metric.ValueType.FLOAT)
                                                  .setDirection(Metric.DIRECTION_BETTER).setQualitative(false)
                                                  .setDomain(CoreMetrics.DOMAIN_GENERAL).create();

    public static final Metric<Float> NOT = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
                                                  + QuamocoConstants.JAVA_KEY + "." + "NOT", "Number of Types",
                                                  Metric.ValueType.FLOAT).setDirection(Metric.DIRECTION_BETTER)
                                                  .setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL).create();

    public static final Metric<Float> NOV = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
                                                  + QuamocoConstants.JAVA_KEY + "." + "NOV",
                                                  "Number of Locally Defined Variables", Metric.ValueType.FLOAT)
                                                  .setDirection(Metric.DIRECTION_BETTER).setQualitative(false)
                                                  .setDomain(CoreMetrics.DOMAIN_GENERAL).create();

    public static final Metric<Float> NOM = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
                                                  + QuamocoConstants.JAVA_KEY + "." + "NOM", "Number of Methods",
                                                  Metric.ValueType.FLOAT).setDirection(Metric.DIRECTION_BETTER)
                                                  .setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL).create();

    private final Settings            settings;

    public JavaMetrics(final Settings settings)
    {
        this.settings = settings;
    }

    /*
     * (non-Javadoc)
     * @see org.sonar.api.measures.Metrics#getMetrics()
     */
    @Override
    public List<Metric> getMetrics()
    {
        final ImmutableList.Builder<Metric> builder = ImmutableList.builder();
        builder.add(NOF, NOS, NOC, LOC, NOT, NOV);
        return builder.build();
    }

}
