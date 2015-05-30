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
package net.siliconcode.quamoco.aggregator.io;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import net.siliconcode.quamoco.aggregator.Measure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MetricPropertiesReader -
 *
 * @author Isaac Griffith
 */
public final class MetricPropertiesReader {

    private static final Logger LOG = LoggerFactory.getLogger(MetricPropertiesReader.class);

    private MetricPropertiesReader()
    {
    }

    /**
     * @param temp
     * @param prop
     */
    private static void getChildren(final String temp, final String parent, final Properties prop,
            final Map<String, Measure> map)
    {
        final String key = temp;
        final Measure measure = new Measure(key, parent);
        map.putIfAbsent(key, measure);
        if (prop.containsKey(key.replaceAll(" ", "_") + ".children"))
        {
            final String[] children = prop.getProperty(key.replaceAll(" ", "_") + ".children").split(",");
            for (final String child : children)
            {
                getChildren(child, key, prop, map);
            }
        }
    }

    /**
     * @return
     */
    public static Map<String, Measure> read()
    {
        Properties prop = new Properties();
        final Map<String, Measure> map = new HashMap<>();
        try
        {
            prop.load(MetricPropertiesReader.class.getResourceAsStream("java-metrics.properties"));
            String temp = prop.getProperty("root");
            getChildren(temp, null, prop, map);
            prop = new Properties();
            prop.load(MetricPropertiesReader.class.getResourceAsStream("csharp-metrics.properties"));
            temp = prop.getProperty("root");
            getChildren(temp, null, prop, map);
        }
        catch (final IOException e)
        {
            LOG.warn("A problem occurred while loading the metric properties file.", e);
        }

        return map;
    }
}
