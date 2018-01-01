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
package edu.montana.gsoc.msusel.sonar.quamoco.profiles.xml;

/**
 * A class representing a profile repository rule.
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class RepoRule {

    /**
     * The rule key as defined by SonarQube
     */
    private String ruleKey;

    /**
     * Constructs a new RepoRule with the given key.
     * 
     * @param ruleKey
     *            Rule key
     */
    public RepoRule(final String ruleKey)
    {
        setRuleKey(ruleKey);
    }

    /**
     * @return the ruleKey
     */
    public String getRuleKey()
    {
        return ruleKey;
    }

    /**
     * @param ruleKey
     *            the ruleKey to set, if null an IllegalArgumentException is
     *            thrown
     */
    public void setRuleKey(final String ruleKey)
    {
        if (ruleKey == null || ruleKey.isEmpty())
        {
            throw new IllegalArgumentException("Rule key may not be empty or null.");
        }

        this.ruleKey = ruleKey;
    }
}
