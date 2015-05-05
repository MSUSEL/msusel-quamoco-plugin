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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Measure;
import org.sonar.api.measures.Metric;

/**
 * QuamocoConfig -
 * 
 * @author Isaac Griffith
 */
public class QuamocoConfig {

    private List<Metric>                      metrics;
    private List<Measure>                     measures;
    private Map<String, Map<Metric, Measure>> map;

    public QuamocoConfig()
    {
        metrics = new ArrayList<>();
        measures = new ArrayList<>();
        map = new HashMap<>();
    }

    public void read(String file)
    {
        Path path = Paths.get(file);
        if (Files.exists(path))
        {
            try
            {
                XMLInputFactory xmlif = XMLInputFactory.newInstance();
                XMLStreamReader xmlr = xmlif.createXMLStreamReader(file, new FileInputStream(file));
                String modelName = null;

                while (xmlr.hasNext())
                {
                    int event = xmlr.next();

                    switch (event)
                    {
                    case XMLStreamConstants.START_ELEMENT:
                        if (xmlr.getLocalName() == "model")
                        {
                            modelName = xmlr.getAttributeValue(0);
                            map.put(modelName, new HashMap<>());
                        }
                        if (xmlr.getLocalName() == "metric")
                        {
                            for (int i = 0; i < xmlr.getAttributeCount(); i++)
                            {
                                switch (xmlr.getAttributeLocalName(i))
                                {
                                case "name":
                                case "type":
                                case "valType":
                                case "levels":
                                case "domain":
                                }
                            }

                            Metric m = new Metric.Builder("Quamoco", "Operability", Metric.ValueType.FLOAT)
                                    .setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL).create();
                        }
                        break;

                    case XMLStreamConstants.END_ELEMENT:
                        switch (xmlr.getLocalName())
                        {
                        case "model":
                            break;
                        case "metric":
                            break;
                        }
                        break;
                    }
                }
            }
            catch (XMLStreamException | FileNotFoundException e)
            {

            }
        }
    }
}
