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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * Class used to encode the definition of a SonarQube rule
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
@XStreamAlias("rule")
public class Rule {

    /**
     * Enum to define the valid values of cardinality of a rule
     * 
     * @author Isaac Griffith
     * @version 1.1.1
     */
    public enum Cardinality {
        SINGLE, MULTIPLE;

        /**
         * String to enum literal mapping
         */
        public static Map<String, Cardinality> map = new HashMap<>();

        static
        {
            Cardinality.map.put(SINGLE.toString(), SINGLE);
            Cardinality.map.put(MULTIPLE.toString(), MULTIPLE);
        }
    };

    /**
     * Enum to define the valid values of priority of a rule
     * 
     * @author Isaac Griffith
     * @version 1.1.1
     */
    public enum Priority {
        MAJOR, CRITICAL, MINOR, BLOCKER, INFO;

        /**
         * String to enum literal mapping
         */
        public static Map<String, Priority> map = new HashMap<>();

        static
        {
            Priority.map.put(MAJOR.toString(), MAJOR);
            Priority.map.put(CRITICAL.toString(), CRITICAL);
            Priority.map.put(MINOR.toString(), MINOR);
            Priority.map.put(BLOCKER.toString(), BLOCKER);
            Priority.map.put(INFO.toString(), INFO);
        }
    };

    /**
     * Enum to define the proper values for Rule status.
     * 
     * @author Isaac Griffith
     * @version 1.1.1
     */
    public enum Status {
        DEPRECATED;

        /**
         * String to enum literal mapping
         */
        public static Map<String, Status> map = new HashMap<>();

        static
        {
            Status.map.put(DEPRECATED.toString(), DEPRECATED);
        }
    }

    @XStreamAlias("key")
    @XStreamAsAttribute
    private String             key;
    @XStreamAlias("name")
    private String             name;
    @XStreamAlias("priority")
    @XStreamAsAttribute
    private Priority           priority;
    @XStreamAlias("cardinality")
    private Cardinality        cardinality;
    private String             description;
    @XStreamAlias("tag")
    @XStreamImplicit
    private final List<String> tags;
    @XStreamAlias("configKey")
    private String             configKey;
    @XStreamAlias("param")
    @XStreamImplicit
    List<Parameter>            params;
    @XStreamAlias("status")
    private Status             status;

    /**
     * 
     */
    public Rule()
    {
        tags = Lists.newArrayList();
        params = Lists.newArrayList();
    }

    /**
     * @param key
     * @param name
     */
    public Rule(final String key, final String name)
    {
        this.key = key;
        this.name = name;
        tags = Lists.newArrayList();
        params = Lists.newArrayList();
    }

    /**
     * @return The key of this Rule
     */
    public String key()
    {
        return key;
    }

    /**
     * @param key
     *            The new key for this rule
     */
    private void key(final String key)
    {
        this.key = key;
    }

    /**
     * @return The name of this rule
     */
    public String name()
    {
        return name;
    }

    /**
     * @param name
     *            The new name of this rule
     */
    private void name(final String name)
    {
        this.name = name;
    }

    /**
     * @return The priority of this rule
     */
    public Priority priority()
    {
        return priority;
    }

    /**
     * @param priority
     *            The new priority of this rule
     */
    private void priority(final Priority priority)
    {
        this.priority = priority;
    }

    /**
     * @return The cardinality of this rule
     */
    public Cardinality cardinality()
    {
        return cardinality;
    }

    /**
     * @param cardinality
     *            The new cardinality of this rule
     */
    private void cardinality(final Cardinality cardinality)
    {
        this.cardinality = cardinality;
    }

    /**
     * @return The description of this rule
     */
    public String description()
    {
        return description;
    }

    /**
     * @param description
     *            The new description of this rule
     */
    private void description(final String description)
    {
        this.description = description;
    }

    /**
     * @return List of tags associated with this rule
     */
    public List<String> tags()
    {
        return tags;
    }

    /**
     * @param tag
     *            New tag to add to this rule
     */
    private void addTag(final String tag)
    {
        if (tag == null || tag.isEmpty() || tags.contains(tag))
        {
            return;
        }
        tags.add(tag);
    }

    /**
     * @return Configuration key associated with this rule
     */
    public String configKey()
    {
        return configKey;
    }

    /**
     * @param configKey
     *            New configuration key to associate with this rule
     */
    private void configKey(final String configKey)
    {
        this.configKey = configKey;
    }

    /**
     * @return List of parameters associated with this rule
     */
    public List<Parameter> params()
    {
        return params;
    }

    /**
     * @param param
     *            New parameter to add to this rule
     */
    private void addParam(final Parameter param)
    {
        if (param == null || params.contains(param))
            return;

        params.add(param);
    }

    /**
     * @param status
     *            New status of this rule
     */
    private void status(final Status status)
    {
        this.status = status;
    }

    /**
     * @return Status of this rule
     */
    public Status status()
    {
        return status;
    }

    /**
     * Builder with a fluent interface to create rules using the
     * method chaining pattern.
     *
     * @author Isaac Griffith
     * @version 1.1.1
     */
    public static class Builder {

        /**
         * Rule to be constructed
         */
        private final Rule r;

        /**
         * Constructs a new Builder for a Rule
         */
        public Builder()
        {
            r = new Rule();
        }

        /**
         * Constructs a new Builder for a rule with the given key and name
         * 
         * @param key
         *            Key of the new rule to be constructed using this builder
         * @param name
         *            Name of the new rule to be constructed using this builder
         */
        public Builder(final String key, final String name)
        {
            r = new Rule(key, name);
        }

        /**
         * Sets the key of the rule to be construct to the given value
         * 
         * @param key
         *            Value of the key for the new rule
         * @return this
         */
        public Builder key(final String key)
        {
            r.key(key);

            return this;
        }

        /**
         * Sets the name of the rule to be constructed to the given value
         * 
         * @param name
         *            Value of the name for the new rule
         * @return this
         */
        public Builder name(final String name)
        {
            r.name(name);

            return this;
        }

        /**
         * Sets the priority of the rule to be constructed to the given value
         * 
         * @param priority
         *            Value of the priority to be set for the new rule
         * @return this
         */
        public Builder priority(final Priority priority)
        {
            r.priority(priority);

            return this;
        }

        /**
         * Sets the description of the rule to be constructed to the given value
         * 
         * @param description
         *            Description of the new rule
         * @return this
         */
        public Builder description(final String description)
        {
            r.description(description);

            return this;
        }

        /**
         * Sets the cardinality of the rule to be constructed to the given value
         * 
         * @param cardinality
         *            Cardinality of the new rule
         * @return this
         */
        public Builder cardinality(final Cardinality cardinality)
        {
            r.cardinality(cardinality);

            return this;
        }

        /**
         * Adds a tag to the new rule
         * 
         * @param tag
         *            Tag to be added to the new rule
         * @return this
         */
        public Builder tag(final String tag)
        {
            r.addTag(tag);

            return this;
        }

        /**
         * Sets the configuration key for the new rule
         * 
         * @param configKey
         *            Configuration key
         * @return this
         */
        public Builder configKey(final String configKey)
        {
            r.configKey(configKey);

            return this;
        }

        /**
         * Sets the status of the new rule
         * 
         * @param status
         *            Status
         * @return this
         */
        public Builder status(final Status status)
        {
            r.status(status);

            return this;
        }

        /**
         * @return the new rule defined by this Builder
         */
        public Rule build()
        {
            return r;
        }

        /**
         * Adds a parameter with the given key and type to the rule under
         * construction
         * 
         * @param key
         *            Key of the parameter
         * @param type
         *            Type of the parameter
         * @return this
         */
        public Builder param(final Parameter param)
        {
            r.addParam(param);

            return this;
        }
    }
}
