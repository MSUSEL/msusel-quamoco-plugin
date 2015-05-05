/**
 * 
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
 * @author isaac
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
