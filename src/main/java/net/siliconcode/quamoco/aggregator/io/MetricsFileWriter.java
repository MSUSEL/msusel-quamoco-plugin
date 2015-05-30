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
package net.siliconcode.quamoco.aggregator.io;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import net.siliconcode.quamoco.aggregator.graph.Edge;
import net.siliconcode.quamoco.aggregator.graph.Node;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * MetricsFileWriter -
 *
 * @author Isaac Griffith
 */
public final class MetricsFileWriter {

    private static final Logger LOG = LoggerFactory.getLogger(MetricsFileWriter.class);

    private MetricsFileWriter()
    {
    }

    public static void getChildren(final DirectedSparseGraph<Node, Edge> graph, final Node current, final PrintWriter pw)
    {
        final List<String> childNames = new ArrayList<>();
        final List<Node> children = new ArrayList<>();
        boolean duplicates = false;
        for (final Edge e : graph.getInEdges(current))
        {
            final Node child = graph.getOpposite(current, e);
            if (childNames.contains(child.getName()))
            {
                duplicates = true;
                break;
            }
            else
            {
                children.add(child);
                childNames.add(child.getName());
            }
        }

        if (!duplicates)
        {
            final StringBuilder builder = new StringBuilder();
            for (final String name : childNames)
            {
                builder.append(name + ",");
            }
            String childs = builder.toString();
            childs = childs.substring(0, childs.length() - 1);
            pw.println(current.getName().replaceAll(" ", "_") + ".children=" + childs);

            for (final Node child : children)
            {
                getChildren(graph, child, pw);
            }
        }
    }

    public static void write(final DirectedSparseGraph<Node, Edge> graph, final String top, final Path file)
            throws RootNotFoundException
    {
        Node root = null;
        for (final Node node : graph.getVertices())
        {
            if (graph.outDegree(node) == 0 && node.getName().equals(top))
            {
                root = node;
                break;
            }
        }

        if (root == null)
        {
            throw new RootNotFoundException("Could not find root node with name: " + top);
        }

        try (PrintWriter pw = new PrintWriter(Files.newOutputStream(file, StandardOpenOption.CREATE,
                StandardOpenOption.WRITE)))
        {
            pw.println("root=" + root.getName());
            getChildren(graph, root, pw);
        }
        catch (final IOException e)
        {
            LOG.warn("Could not write file", e);
        }
    }
}
