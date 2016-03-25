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
package net.siliconcode.sonar.quamoco.profiles.xml;

import java.util.Arrays;
import java.util.Set;

import com.google.common.collect.Sets;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * RuleRepo -
 *
 * @author Isaac Griffith
 */
@XStreamAlias("repo")
public class RuleRepo {

	@XStreamAsAttribute
	private String key;
	@XStreamImplicit(itemFieldName = "rule")
	private Set<String> rules;

	public RuleRepo(final String key, final String... rules) {
		setKey(key);
		this.rules = Sets.newHashSet();
		this.rules.addAll(Arrays.asList(rules));
	}

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key
	 *            the key to set
	 */
	public void setKey(final String key) {
		if (key == null || key.isEmpty()) {
			throw new IllegalArgumentException("Repository key cannot be empty or null.");
		}

		this.key = key;
	}

	public void addRule(final String rule) {
		if (rule == null || rule.isEmpty()) {
			return;
		}

		if (rules == null) {
			rules = Sets.newHashSet();
		}

		rules.add(rule);
	}

	public void removeRule(final String rule) {
		if (rule == null || rule.isEmpty()) {
			return;
		}

		if (rules != null) {
			rules.remove(rule);
		}
	}

	public Set<String> getRules() {
		return rules;
	}
}
