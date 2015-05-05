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
package net.siliconcode.quamoco.distill.io;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import net.siliconcode.quamoco.distill.Measure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MetricPropertiesReader -
 * 
 * @author Isaac Griffith
 */
public class MetricPropertiesReader {

    private static final Logger  LOG = LoggerFactory.getLogger(MetricPropertiesReader.class);
    private Map<String, Measure> metricMap;

    /**
     * 
     */
    public MetricPropertiesReader()
    {
        this.metricMap = new HashMap<>();
    }

    /**
     * @param file
     */
    public void read(String file)
    {
        Properties prop = new Properties();
        try
        {
            prop.load(new FileReader(file));

            String temp = prop.getProperty("properties.keynames");
            String[] keys = temp.split(",");
            for (String key : keys)
            {
                String id = prop.getProperty(String.format("%s.id", key));
                String name = prop.getProperty(String.format("%s.name", key));
                String parents = prop.getProperty(String.format("%s.parents", key));
                String valueIDs = prop.getProperty(String.format("%s.values", key));
                String description = prop.getProperty(String.format("%s.description"));
                metricMap.put(id, new Measure(id, name, description, parents.split(",")));
            }
        }
        catch (IOException e)
        {
            LOG.warn("A problem occurred while loading the metric properties file.");
        }
    }

    /**
     * @return
     */
    public Map<String, Measure> getMetricsMap()
    {
        return metricMap;
    }
}
