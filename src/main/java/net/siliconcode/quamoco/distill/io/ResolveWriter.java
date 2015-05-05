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
package net.siliconcode.quamoco.distill.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import net.siliconcode.quamoco.distill.graph.FactorNode;
import net.siliconcode.quamoco.distill.graph.Node;
import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * ResolveWriter -
 *
 * @author Isaac Griffith
 */
public class ResolveWriter {

    /**
     * 
     */
    public ResolveWriter()
    {
        // TODO Auto-generated constructor stub
    }

    public void write(String name, String file, DirectedSparseGraph<Node, String> graph)
    {
        StringBuilder builder = new StringBuilder();
        builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        builder.append(String.format("<resolutionGraph name=\"%s\">\n", name));
        for (Node n : graph.getVertices())
        {
            builder.append("\t" + n.getXMLTag() + "\n");
        }
        for (String s : graph.getEdges())
        {
            Node src = graph.getSource(s);
            Node dest = graph.getDest(s);
            builder.append(String.format("\t<edges name=\"%s\" src=\"%d\" dest=\"%d\" />\n", s, src.getId(),
                    dest.getId()));
        }
        for (final Node n : graph.getVertices())
        {
            if (n instanceof FactorNode)
            {
                builder.append(String.format("\t<metrics name=\"%s\" nodeID=\"%d\" />\n", n.getName(), n.getId()));
            }
        }
        builder.append("</resolutionGraph>");

        Path path = Paths.get(file);
        try
        {
            Files.deleteIfExists(path);
            path = Files.createFile(path);

            try (PrintWriter pw = new PrintWriter(new FileWriter(path.toFile())))
            {
                pw.print(builder.toString());
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        catch (IOException e)
        {

        }
    }
}
