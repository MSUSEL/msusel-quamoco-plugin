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
package net.siliconcode.quamoco.distiller.keys;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * FlyweightKeyFactory -
 *
 * @author Isaac Griffith
 */
public class FlyweightKeyFactory {

    private final Map<String, StringKey> keys;

    private static class SingletonHolder {

        private static final FlyweightKeyFactory INSTANCE = new FlyweightKeyFactory();

        private SingletonHolder() {
        }
    }

    public static FlyweightKeyFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 
     */
    private FlyweightKeyFactory() {
        keys = Maps.newHashMap();
    }

    public StringKey getKey(final String key, final String name) {
        if (key == null || key.isEmpty() || name == null || name.isEmpty()) {
            return null;
        }

        if (keys.containsKey(key)) {
            return keys.get(key);
        }
        else {
            final StringKey fwKey = new StringKey(key, name);
            keys.put(key, fwKey);
            return fwKey;
        }
    }
}