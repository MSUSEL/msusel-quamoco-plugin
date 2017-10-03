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
package edu.montana.gsoc.msusel.sonar.quamoco.util;

/**
 * A small collection class representing a pair of items of different types.
 * 
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class Pair<T1, T2> {

    /**
     * The key item
     */
    private T1 first;
    /**
     * The value item
     */
    private T2 second;

    /**
     * Constructs a new pair object. Note that an IllegalArgumentException will
     * be thrown if either of the parameters is null
     * 
     * @param first
     *            The key item of the pair
     * @param second
     *            The value item of the pair
     */
    public Pair(T1 first, T2 second)
    {
        if (first == null || second == null)
            throw new IllegalArgumentException();

        this.first = first;
        this.second = second;
    }

    /**
     * @return The key item
     */
    public T1 first()
    {
        return first;
    }

    /**
     * @return The value item
     */
    public T2 second()
    {
        return second;
    }
}
