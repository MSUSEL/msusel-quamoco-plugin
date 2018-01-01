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
package edu.montana.gsoc.msusel.sonar.quamoco.rules;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import com.thoughtworks.xstream.converters.enums.EnumToStringConverter;

import edu.montana.gsoc.msusel.sonar.quamoco.rules.xml.CustomizedDomDriver;
import edu.montana.gsoc.msusel.sonar.quamoco.rules.xml.Parameter;
import edu.montana.gsoc.msusel.sonar.quamoco.rules.xml.Rule;

/**
 * Class holding a collection of rules
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
@XStreamAlias("rules")
public class RuleSet {

    /**
     * List of individual rules
     */
    @XStreamImplicit
    private final List<Rule>  rules;
    /**
     * Mapping of keys to rules
     */
    @XStreamOmitField
    private Map<String, Rule> ruleMap;

    /**
     * constructs a new empty RuleSet
     */
    public RuleSet()
    {
        rules = Lists.newArrayList();
    }

    /**
     * @param r
     *            Rule to be added to the set
     */
    public void addRule(final Rule r)
    {
        if (r == null || rules.contains(r))
            return;

        rules.add(r);
    }

    /**
     * @return iterator associated with this rule set
     */
    public Iterator<Rule> getRules()
    {
        return rules.iterator();
    }

    /**
     * Retrieve the rule with the provided key
     * 
     * @param key
     *            Key to search for the associated rule
     * @return Rule associated with the given key, or null if no such rule
     *         exists in this RuleSet
     */
    public Rule getRule(final String key)
    {
        if (ruleMap.isEmpty() && !rules.isEmpty())
        {
            initRuleMap();
        }

        if (ruleMap.containsKey(key))
        {
            return ruleMap.get(key);
        }

        return null;
    }

    /**
     * Initializes the rule map
     */
    private void initRuleMap()
    {
        for (final Rule rule : rules)
        {
            ruleMap.put(rule.key(), rule);
        }
    }

    /**
     * Serializes this class to XML
     * 
     * @param location
     *            Location to which this class and its contents are to be
     *            serialized using XML
     */
    public void writeXML(final String location)
    {
        try
        {
            final FileOutputStream out = new FileOutputStream(location);
            final PrintWriter pw = new PrintWriter(out);
            pw.println("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
            pw.print(RuleSet.createXStream().toXML(this));
            pw.close();
        }
        catch (final IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Deserializes this class from an XML file
     * 
     * @param location
     *            Stream reading the file from which to deserialize this set.
     * @return RuleSet deserialized from the input stream
     */
    public static RuleSet readXML(final InputStream location)
    {
        final CustomizedDomDriver custom = new CustomizedDomDriver();
        final XStream xstream = new XStream(custom);
        xstream.setClassLoader(RuleSet.class.getClassLoader());
        xstream.processAnnotations(RuleSet.class);
        xstream.processAnnotations(Rule.class);
        xstream.registerConverter(new EnumToStringConverter<>(Rule.Priority.class, Rule.Priority.map));
        xstream.registerConverter(new EnumToStringConverter<>(Rule.Cardinality.class, Rule.Cardinality.map));
        xstream.registerConverter(new EnumToStringConverter<>(Parameter.Type.class, Parameter.Type.map));

        final RuleSet set = (RuleSet) xstream.fromXML(location);
        return set;
    }

    /**
     * @return Constructs an XStream to serialize or deserialize a RuleSet
     *         object to/from XML
     */
    public static XStream createXStream()
    {
        final CustomizedDomDriver custom = new CustomizedDomDriver();
        final XStream xstream = new XStream(custom);
        xstream.setClassLoader(RuleSet.class.getClassLoader());
        xstream.processAnnotations(RuleSet.class);
        xstream.processAnnotations(Rule.class);
        return xstream;
    }
}
