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
package edu.montana.gsoc.msusel.codetree.sonar.quamoco.profiles.xml;

import java.util.Arrays;
import java.util.Set;

import com.google.common.collect.Sets;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * A class representing a repository of rules in a Quamoco Rule Profile.
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
@XStreamAlias("repo")
public class RuleRepo {

    /**
     * The key for this repository as defined by SonarQube
     */
    @XStreamAsAttribute
    private String      key;
    /**
     * The set of rule keys defined in this repository
     */
    @XStreamImplicit(itemFieldName = "rule")
    private Set<String> rules;

    /**
     * Constructs a new Rule Repository with the given key and zero or more rule
     * keys
     * 
     * @param key
     *            The key for this repo as defined in SonarQube
     * @param rules
     *            The keys for contained rules, as defined by SonarQube
     */
    public RuleRepo(final String key, final String... rules)
    {
        setKey(key);
        this.rules = Sets.newHashSet();
        this.rules.addAll(Arrays.asList(rules));
    }

    /**
     * @return the key
     */
    public String getKey()
    {
        return key;
    }

    /**
     * @param key
     *            the key to set
     */
    public void setKey(final String key)
    {
        if (key == null || key.isEmpty())
        {
            throw new IllegalArgumentException("Repository key cannot be empty or null.");
        }

        this.key = key;
    }

    /**
     * Adds a rule to this repository, assuming that the key is not null or
     * empty.
     * 
     * @param rule
     *            Rule key to add
     */
    public void addRule(final String rule)
    {
        if (rule == null || rule.isEmpty())
        {
            return;
        }

        if (rules == null)
        {
            rules = Sets.newHashSet();
        }

        rules.add(rule);
    }

    /**
     * Removes the provided rule from this repository, assuming that the
     * provided rule key is not null or empty
     * 
     * @param rule
     *            Rule key to remove
     */
    public void removeRule(final String rule)
    {
        if (rule == null || rule.isEmpty())
        {
            return;
        }

        if (rules != null)
        {
            rules.remove(rule);
        }
    }

    /**
     * @return Set of rule keys associated with this repository
     */
    public Set<String> getRules()
    {
        return rules;
    }
}
