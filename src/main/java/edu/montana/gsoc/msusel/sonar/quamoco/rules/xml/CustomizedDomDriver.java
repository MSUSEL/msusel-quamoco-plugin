/**
 * The MIT License (MIT)
 *
 * SparQLine Analytics Sonar Quamoco Plugin
 * Copyright (c) 2015-2017 Isaac Griffith, SparQLine Analytics, LLC
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

import java.io.Writer;
import java.util.List;

import com.google.common.collect.Lists;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;

/**
 * Custom DOM XML writer used for writing Quamoco rule sets
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class CustomizedDomDriver extends DomDriver {

    /**
     * The list that contains the field names that would contain a CDATA in the
     * xml.
     */
    private static final List<String> CDATA_FIELDS;

    static
    {
        CDATA_FIELDS = Lists.newArrayList();
        // add cdata field names.eg:cdataField
        CustomizedDomDriver.CDATA_FIELDS.add("description");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HierarchicalStreamWriter createWriter(final Writer out)
    {
        return new PrettyPrintWriter(out) {
            boolean cdata = false;

            /**
             * {@inheritDoc}
             */
            @Override
            public void startNode(final String name)
            {
                super.startNode(name);
                cdata = CustomizedDomDriver.CDATA_FIELDS.contains(name);

            }

            /**
             * {@inheritDoc}
             */
            @Override
            protected void writeText(final QuickWriter writer, final String text)
            {
                if (cdata)
                {
                    writer.write("<![CDATA[");
                    writer.write(text);
                    writer.write("]]>");

                }
                else
                {
                    writer.write(text);
                }
            }
        };

    }
}
