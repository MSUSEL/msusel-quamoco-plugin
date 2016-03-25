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
package net.siliconcode.quamoco.cli;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.siliconcode.quamoco.io.AbstractQuamocoReader;
import net.siliconcode.sonar.quamoco.rules.RuleSet;
import net.siliconcode.sonar.quamoco.rules.xml.Parameter;
import net.siliconcode.sonar.quamoco.rules.xml.Rule;
import net.siliconcode.sonar.quamoco.rules.xml.Rule.Cardinality;
import net.siliconcode.sonar.quamoco.rules.xml.Rule.Priority;

/**
 * StyleCop -
 *
 * @author Isaac Griffith
 *
 */
public class StyleCopReader extends AbstractQuamocoReader {

    private static final Logger LOG = LoggerFactory.getLogger(StyleCopReader.class);
    private final RuleSet       set;

    public StyleCopReader() {
        set = new RuleSet();
    }

    @Override
    public void read(final String file) throws FileNotFoundException, XMLStreamException {
        if (file == null || file.isEmpty()) {
            return;
        }

        final XMLInputFactory factory = XMLInputFactory.newInstance();
        factory.setProperty(XMLInputFactory.IS_COALESCING, true);
        final InputStream stream = getInputStream(file);

        if (stream != null) {
            final XMLStreamReader reader = factory.createXMLStreamReader(stream);

            boolean name = false;
            boolean description = false;
            boolean tag = false;
            boolean severity = false;
            boolean cardinality = false;
            boolean configKey = false;
            Rule.Builder builder = new Rule.Builder();
            Parameter param = new Parameter();

            while (reader.hasNext()) {
                final int event = reader.next();

                switch (event) {
                    case XMLStreamConstants.START_ELEMENT:
                        final Map<String, String> attrs = getAttributes(reader);
                        switch (reader.getLocalName()) {
                            case "rule":
                                builder = new Rule.Builder().key(attrs.get("key"));
                                break;
                            case "name":
                                name = true;
                                break;
                            case "priority":
                                severity = true;
                                break;
                            case "cardinality":
                                cardinality = true;
                                break;
                            case "description":
                                description = true;
                                break;
                            case "tag":
                                tag = true;
                                break;
                            case "configKey":
                                configKey = true;
                                break;
                            case "param":
                                param = new Parameter(attrs.get("key"), null);
                                break;
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        switch (reader.getLocalName()) {
                            case "rule":
                                set.addRule(builder.build());
                                break;
                            case "name":
                                name = false;
                                break;
                            case "priority":
                                severity = false;
                                break;
                            case "cardinality":
                                cardinality = false;
                                break;
                            case "description":
                                description = false;
                                break;
                            case "tag":
                                tag = false;
                                break;
                            case "configKey":
                                configKey = false;
                                break;
                            case "param":
                                builder.param(param);
                                break;
                        }
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        if (configKey) {
                            builder.configKey(reader.getText());
                        }
                        else if (name) {
                            builder.name(reader.getText());
                        }
                        else if (severity) {
                            builder.priority(Priority.valueOf(reader.getText()));
                        }
                        else if (cardinality) {
                            builder.cardinality(Cardinality.valueOf(reader.getText()));
                        }
                        else if (description) {
                            builder.description(reader.getText());
                        }
                        else if (tag) {
                            builder.tag(reader.getText());
                        }
                        break;
                }
            }
        }
    }

    /**
     * @param qm
     * @return
     */
    private InputStream getInputStream(final String loc) {
        final File file = new File(loc);
        if (file.exists()) {
            try {
                return new FileInputStream(file);
            }
            catch (final FileNotFoundException e) {
                LOG.warn("Could not read file: " + loc);
            }
        }
        else {
            LOG.warn("Could not find file: " + loc);
        }

        return null;
    }

    public RuleSet getRuleSet() {
        return set;
    }

    public static void main(final String args[]) throws FileNotFoundException, XMLStreamException {
        final StyleCopReader reader = new StyleCopReader();

        reader.read("/home/fate/test/StyleCop/rules.xml");

        LOG.info("RuleSet: " + reader.getRuleSet());
        LOG.info("Set Size: " + reader.getRuleSet().getRules().size());
        for (final Rule r : reader.getRuleSet().getRules()) {
            LOG.info("Key: " + r.key());
            LOG.info("Name: " + r.name());
        }

        final RuleSet set = reader.getRuleSet();
        set.writeXML("/home/fate/test/rules/rules-stylecop.xml");
    }

}
