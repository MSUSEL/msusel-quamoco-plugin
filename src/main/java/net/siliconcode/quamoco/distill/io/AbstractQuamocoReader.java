/**
 * 
 */
package net.siliconcode.quamoco.distill.io;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * AbstractQuamocoReader -
 *
 * @author isaac
 */
public abstract class AbstractQuamocoReader {

    /**
     * 
     */
    public AbstractQuamocoReader()
    {
        // TODO Auto-generated constructor stub
    }

    public abstract void read(String... files) throws FileNotFoundException, XMLStreamException;

    protected Map<String, String> getAttributes(XMLStreamReader reader)
    {
        Map<String, String> retVal = new HashMap<>();

        for (int i = 0; i < reader.getAttributeCount(); i++)
        {
            if (!retVal.containsKey(reader.getAttributeLocalName(i)))
                retVal.put(reader.getAttributeLocalName(i), reader.getAttributeValue(i));
        }

        return retVal;
    }

}
