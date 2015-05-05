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

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

/**
 * AbstractQuamocoReader -
 *
 * @author Isaac Griffith
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
