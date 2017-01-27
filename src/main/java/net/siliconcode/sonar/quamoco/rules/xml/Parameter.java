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
import java.util.Map;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Parameter -
 *
 * @author Isaac Griffith
 *
 */
@XStreamAlias("param")
public class Parameter {

	public enum Type {
		INTEGER, REGULAR_EXPRESSION, BOOLEAN, TEXT, STRING;

		public static Map<String, Type> map = new HashMap<>();

		static {
			Type.map.put(INTEGER.toString(), INTEGER);
			Type.map.put(REGULAR_EXPRESSION.toString(), REGULAR_EXPRESSION);
			Type.map.put(BOOLEAN.toString(), BOOLEAN);
			Type.map.put(TEXT.toString(), TEXT);
			Type.map.put(STRING.toString(), STRING);
		}
	};

	@XStreamAlias("key")
	@XStreamAsAttribute
	private String key;

	@XStreamAlias("type")
	@XStreamAsAttribute
	private Type type;

	@XStreamAlias("defaultValue")
	private String defaultValue;

	public Parameter() {

	}

	public Parameter(final String key, final Type type) {
		this.key = key;
		this.type = type;
	}

	public void setDefaultValue(String value) {
		if (value == null) {
			value = "";
		}
		defaultValue = value;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setKey(final String key) {
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setType(final Type type) {
		this.type = type;
	}

	public Type getType() {
		return type;
	}
}
