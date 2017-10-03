/**
 * The MIT License (MIT)
 * 
 * MSUSEL Sonar Quamoco Plugin
 * Copyright (c) 2015-2017 Montana State University, Gianforte School of Computing,
 * Software Engineering Laboratory
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
package edu.montana.gsoc.msusel.sonar.quamoco.rules.xml;

import java.util.List;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import com.google.common.collect.Lists;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.io.xml.StaxWriter;

/**
 * Customized STAX XML Writer used for writing Quamoco Rules Set xml
 * serializations.
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class CustomizedStaxDriver extends StaxDriver {

    /**
     * The list that contains the field names that would contain a CDATA in the
     * xml.
     */
    private static final List<String> CDATA_FIELDS;

    static
    {
        CDATA_FIELDS = Lists.newArrayList();

        // add cdata field names.eg:cdataField
        CustomizedStaxDriver.CDATA_FIELDS.add("description");
    }

    /**
     * Constructs a new CustomizedStaxDriver
     */
    public CustomizedStaxDriver()
    {
        super();

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StaxWriter createStaxWriter(final XMLStreamWriter out, final boolean writeStartEndDocument)
            throws XMLStreamException
    {
        final XMLStreamWriter writer = out;
        return new StaxWriter(getQnameMap(), out, writeStartEndDocument, isRepairingNamespace()) {
            boolean cdata = false;

            /**
             * {@inheritDoc}
             */
            @Override
            public void startNode(final String name)
            {
                super.startNode(name);
                cdata = CustomizedStaxDriver.CDATA_FIELDS.contains(name);
            }

            /**
             * {@inheritDoc}
             */
            @Override
            public void setValue(final String value)
            {
                if (cdata)
                {
                    try
                    {
                        writer.writeCData(value);
                    }
                    catch (final XMLStreamException e)
                    {
                        e.printStackTrace();
                    }
                }
                else
                {
                    super.setValue(value);
                }
            }
        };
    }
}
