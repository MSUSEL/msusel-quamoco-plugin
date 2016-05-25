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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.sonar.api.measures.Metric;
import org.sonar.api.measures.Metrics;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.sparqline.quamoco.distiller.Measure;
import com.sparqline.quamoco.io.MetricPropertiesReader;

/**
 * QuamocoMetric -
 *
 * @author Isaac Griffith
 */
public class QuamocoMetrics implements Metrics {

    private Map<String, Metric<Serializable>> metricMap;

    public QuamocoMetrics() {
        metricMap = Maps.newHashMap();
    }

    public Metric<Serializable> getMetric(final String id) {
        return metricMap.get(id);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.sonar.api.measures.Metrics#getMetrics()
     */
    @Override
    public List<Metric> getMetrics() {
        final ImmutableList.Builder<Metric> builder = ImmutableList.builder();
        builder.addAll(loadMetrics());
        return builder.build();
    }

    public List<Metric> loadMetrics() {
        final List<Metric> metrics = new ArrayList<>();
        final Map<String, Measure> map = MetricPropertiesReader.read();
        for (final String key : map.keySet()) {
            final Metric<Float> temp = new Metric.Builder(
                    QuamocoConstants.PLUGIN_KEY + "." + key.toUpperCase().replaceAll(" ", "_"), key,
                    Metric.ValueType.FLOAT).setDirection(Metric.DIRECTION_BETTER).setQualitative(false)
                            .setDomain("Quamoco-Quality").create();
            final Metric<String> grade = new Metric.Builder(
                    QuamocoConstants.PLUGIN_KEY + "." + key.toUpperCase().replaceAll(" ", "_") + ".GRADE",
                    key + " Grade", Metric.ValueType.STRING).setQualitative(true).setDomain("Quamoco-Quality").create();
            metrics.add(temp);
            metrics.add(grade);
        }
        metrics.add(new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "." + QuamocoConstants.CODE_TREE,
                QuamocoConstants.CODE_TREE, Metric.ValueType.STRING)
                        .setDescription("Method Level Code Tree for a Project.").setQualitative(false)
                        .setDomain(QuamocoConstants.DOMAIN_NAME).create());

        for (final Metric m : metrics) {
            metricMap.put(m.getKey(), m);
        }

        return metrics;
    }
}
