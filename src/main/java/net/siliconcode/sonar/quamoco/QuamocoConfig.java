/**
 * 
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
import org.sonar.api.measures.Metric;
import org.sonar.api.measures.Metrics;
import org.sonar.api.measures.Measure;

/**
 * QuamocoConfig -
 * 
 * @author isaac
 */
public class QuamocoConfig {

    List<Metric>                      metrics;
    List<Measure>                     measures;
    Map<String, Map<Metric, Measure>> map;

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
