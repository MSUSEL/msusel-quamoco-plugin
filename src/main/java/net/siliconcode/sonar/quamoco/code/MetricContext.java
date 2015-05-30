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
package net.siliconcode.sonar.quamoco.code;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sonar.api.resources.Resource;

import com.google.common.collect.Lists;

/**
 * MetricContext -
 *
 * @author Isaac Griffith
 */
public class MetricContext {

    transient private final Map<Resource, CodeTree> codeTrees;

    public MetricContext()
    {
        codeTrees = new HashMap<>();
    }

    public void addCodeTree(final Resource resource, final CodeTree tree)
    {
        if (resource == null || codeTrees.containsKey(resource))
        {
            return;
        }

        codeTrees.putIfAbsent(resource, tree);
    }

    public CodeTree getTree(final Resource resource)
    {
        return codeTrees.get(resource);
    }

    public List<CodeTree> getTrees()
    {
        return Lists.newArrayList(codeTrees.values());
    }

    public void removeCodeTree(final Resource resource)
    {
        if (resource == null || !codeTrees.containsKey(resource))
        {
            return;
        }

        codeTrees.remove(resource);
    }
}
