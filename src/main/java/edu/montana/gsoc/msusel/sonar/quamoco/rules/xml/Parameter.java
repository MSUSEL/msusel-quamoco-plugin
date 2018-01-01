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
import java.util.Map;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * Class used to encode parameters associated with Rules
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
@XStreamAlias("param")
public class Parameter {

    /**
     * Enumeration used to define appropriate values for Parameter Type
     * 
     * @author Isaac Griffith
     * @version 1.1.1
     */
    public enum Type {
        INTEGER, REGULAR_EXPRESSION, BOOLEAN, TEXT, STRING;

        /**
         * String to enum literal mapping
         */
        public static Map<String, Type> map = new HashMap<>();

        static
        {
            Type.map.put(INTEGER.toString(), INTEGER);
            Type.map.put(REGULAR_EXPRESSION.toString(), REGULAR_EXPRESSION);
            Type.map.put(BOOLEAN.toString(), BOOLEAN);
            Type.map.put(TEXT.toString(), TEXT);
            Type.map.put(STRING.toString(), STRING);
        }
    };

    /**
     * The key of this parameter
     */
    @XStreamAlias("key")
    @XStreamAsAttribute
    private String key;

    /**
     * The type of this parameter
     */
    @XStreamAlias("type")
    @XStreamAsAttribute
    private Type type;

    /**
     * The default value of this parameter
     */
    @XStreamAlias("defaultValue")
    private String defaultValue;

    /**
     * Empty constructor used by XStream
     */
    public Parameter()
    {

    }

    /**
     * Constructs a new Parameter with the given key and type
     * 
     * @param key
     *            Key of the new Parameter
     * @param type
     *            Type of the new Parameter
     */
    public Parameter(final String key, final Type type)
    {
        this.key = key;
        this.type = type;
    }

    /**
     * @param value
     *            New default value of this Parameter
     */
    public void setDefaultValue(String value)
    {
        if (value == null)
        {
            value = "";
        }
        defaultValue = value;
    }

    /**
     * @return Default value for this Parameter
     */
    public String getDefaultValue()
    {
        return defaultValue;
    }

    /**
     * @param key
     *            New key for this Parameter
     */
    public void setKey(final String key)
    {
        this.key = key;
    }

    /**
     * @return Key of this Parameter
     */
    public String getKey()
    {
        return key;
    }

    /**
     * @param type
     *            New Type for this Parameter
     */
    public void setType(final Type type)
    {
        this.type = type;
    }

    /**
     * @return The type of this Parameter
     */
    public Type getType()
    {
        return type;
    }
}
