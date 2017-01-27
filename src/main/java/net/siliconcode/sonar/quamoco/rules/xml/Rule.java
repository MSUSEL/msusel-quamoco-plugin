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
package net.siliconcode.sonar.quamoco.rules.xml;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * Rule -
 *
 * @author Isaac Griffith
 *
 */
@XStreamAlias("rule")
public class Rule {

	public enum Cardinality {
		SINGLE, MULTIPLE;

		public static Map<String, Cardinality> map = new HashMap<>();

		static {
			Cardinality.map.put(SINGLE.toString(), SINGLE);
			Cardinality.map.put(MULTIPLE.toString(), MULTIPLE);
		}
	};

	public enum Priority {
		MAJOR, CRITICAL, MINOR, BLOCKER, INFO;

		public static Map<String, Priority> map = new HashMap<>();

		static {
			Priority.map.put(MAJOR.toString(), MAJOR);
			Priority.map.put(CRITICAL.toString(), CRITICAL);
			Priority.map.put(MINOR.toString(), MINOR);
			Priority.map.put(BLOCKER.toString(), BLOCKER);
			Priority.map.put(INFO.toString(), INFO);
		}
	};

	public enum Status {
		DEPRECATED;

		public static Map<String, Status> map = new HashMap<>();

		static {
			Status.map.put(DEPRECATED.toString(), DEPRECATED);
		}
	}

	@XStreamAlias("key")
	@XStreamAsAttribute
	private String key;
	@XStreamAlias("name")
	private String name;
	@XStreamAlias("priority")
	@XStreamAsAttribute
	private Priority priority;
	@XStreamAlias("cardinality")
	private Cardinality cardinality;
	private String description;
	@XStreamAlias("tag")
	@XStreamImplicit
	private final List<String> tags;
	@XStreamAlias("configKey")
	private String configKey;
	@XStreamAlias("param")
	@XStreamImplicit
	List<Parameter> params;
	@XStreamAlias("status")
	private Status status;

	public Rule() {
		tags = Lists.newArrayList();
		params = Lists.newArrayList();
	}

	public Rule(final String key, final String name) {
		this.key = key;
		this.name = name;
		tags = Lists.newArrayList();
		params = Lists.newArrayList();
	}

	public String key() {
		return key;
	}

	public void key(final String key) {
		this.key = key;
	}

	public String name() {
		return name;
	}

	public void name(final String name) {
		this.name = name;
	}

	public Priority priority() {
		return priority;
	}

	public void priority(final Priority priority) {
		this.priority = priority;
	}

	public Cardinality cardinality() {
		return cardinality;
	}

	public void cardinality(final Cardinality cardinality) {
		this.cardinality = cardinality;
	}

	public String description() {
		return description;
	}

	public void description(final String description) {
		this.description = description;
	}

	public List<String> tags() {
		return tags;
	}

	public void addTag(final String tag) {
		if (tag == null || tag.isEmpty() || tags.contains(tag)) {
			return;
		}
	}

	public String configKey() {
		return configKey;
	}

	public void configKey(final String configKey) {
		this.configKey = configKey;
	}

	public List<Parameter> params() {
		return params;
	}

	public void addParam(final Parameter param) {
		params.add(param);
	}

	public void status(final Status status) {
		this.status = status;
	}

	public Status status() {
		return status;
	}

	/**
	 * Builder - Builder with a fluent interface to create rules using the
	 * method chaining pattern.
	 *
	 * @author Isaac Griffith
	 *
	 */
	public static class Builder {
		private final Rule r;

		public Builder() {
			r = new Rule();
		}

		public Builder(final String key, final String name) {
			r = new Rule(key, name);
		}

		public Builder key(final String key) {
			r.key(key);

			return this;
		}

		public Builder name(final String name) {
			r.name(name);

			return this;
		}

		public Builder priority(final Priority priority) {
			r.priority(priority);

			return this;
		}

		public Builder description(final String description) {
			r.description(description);

			return this;
		}

		public Builder cardinality(final Cardinality cardinality) {
			r.cardinality(cardinality);

			return this;
		}

		public Builder tag(final String tag) {
			r.addTag(tag);

			return this;
		}

		public Builder configKey(final String configKey) {
			r.configKey(configKey);

			return this;
		}

		public Builder status(final Status status) {
			r.status(status);

			return this;
		}

		public Rule build() {
			return r;
		}

		/**
		 * @param key
		 * @param type
		 */
		public Builder param(final Parameter param) {
			r.addParam(param);

			return this;
		}
	}
}
