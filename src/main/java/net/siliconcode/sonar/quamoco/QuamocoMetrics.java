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

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.sonar.api.config.Settings;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.api.measures.Metrics;

import com.google.common.collect.ImmutableList;

/**
 * QuamocoMetric -
 * 
 * @author Isaac Griffith
 */
public class QuamocoMetrics implements Metrics {

    private Map<String, Metric<Float>> metricMap;
    private Settings                   settings;

    public QuamocoMetrics(Settings settings)
    {
        this.settings = settings;
    }

    /*
     * (non-Javadoc)
     * @see org.sonar.api.measures.Metrics#getMetrics()
     */
    public List<Metric> getMetrics()
    {
        ImmutableList.Builder<Metric> builder = ImmutableList.builder();
        builder.addAll(loadMetrics(settings.getString(QuamocoConstants.QUAMOCO_METRIC_PROP_DIR)));
        return builder.build();
    }

    public List<Metric> loadMetrics(String propLoc)
    {
        List<Metric> metrics = new ArrayList<>();
        try
        {
            Properties prop = new Properties();
            prop.load(new FileReader(propLoc));
            String[] keys = prop.getProperty("keys").split(",");
            for (String key : keys)
            {
                String name = prop.getProperty(String.format("%s.name", key));
                Metric<Float> temp = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "." + key, name,
                        Metric.ValueType.FLOAT).setDirection(Metric.DIRECTION_BETTER).setQualitative(false)
                        .setDomain(CoreMetrics.DOMAIN_GENERAL).create();
                metrics.add(temp);
                metricMap.put(prop.getProperty(String.format("%s.id", key)), temp);
            }
        }
        catch (IOException e)
        {

        }
        return metrics;
    }

    public Metric getMetric(String id)
    {
        return metricMap.get(id);
    }
}
