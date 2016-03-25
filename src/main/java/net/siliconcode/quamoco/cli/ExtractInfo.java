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
package net.siliconcode.quamoco.cli;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import com.google.common.collect.Lists;

import edu.uci.ics.jung.graph.DirectedSparseGraph;
import net.siliconcode.quamoco.distiller.ModelDistiller;
import net.siliconcode.quamoco.graph.edge.Edge;
import net.siliconcode.quamoco.graph.edge.MeasureToFactorFindingsEdge;
import net.siliconcode.quamoco.graph.edge.MeasureToFactorNumberEdge;
import net.siliconcode.quamoco.graph.node.FactorNode;
import net.siliconcode.quamoco.graph.node.FindingNode;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.Node;
import net.siliconcode.quamoco.graph.node.ValueNode;

/**
 * ExtractInfo -
 * 
 * @author Isaac Griffith
 *
 */
public class ExtractInfo {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        final ModelDistiller dqm = new ModelDistiller();
        dqm.setLanguage("cs");
        dqm.buildGraph(null);
        DirectedSparseGraph<Node, Edge> graph = dqm.getGraph();

        List<FindingNode> findings = Lists.newArrayList();
        List<ValueNode> values = Lists.newArrayList();
        List<MeasureNode> measures = Lists.newArrayList();
        List<FactorNode> factors = Lists.newArrayList();

        for (Node n : graph.getVertices()) {
            if (n instanceof MeasureNode) {
                measures.add((MeasureNode) n);
            }
            else if (n instanceof ValueNode) {
                if (graph.getIncidentEdges(n).isEmpty())
                    values.add((ValueNode) n);
            }
            else if (n instanceof FindingNode) {
                if (graph.getIncidentEdges(n).isEmpty()) {
                    findings.add((FindingNode) n);
                }
            }
            else if (n instanceof FactorNode) {
                for (Edge e : graph.getInEdges(n)) {
                    if (e instanceof MeasureToFactorFindingsEdge || e instanceof MeasureToFactorNumberEdge)
                        factors.add((FactorNode) n);
                }
                if (graph.getInEdges(n).isEmpty())
                    factors.add((FactorNode) n);
            }
        }

        Path findingsPath = Paths.get("/home/fate/test/findings.txt");
        Files.deleteIfExists(findingsPath);
        Files.createFile(findingsPath);
        Path factorsPath = Paths.get("/home/fate/test/factors.txt");
        Files.deleteIfExists(factorsPath);
        Files.createFile(factorsPath);
        Path measuresPath = Paths.get("/home/fate/test/measures.txt");
        Files.deleteIfExists(measuresPath);
        Files.createFile(measuresPath);
        Path valuesPath = Paths.get("/home/fate/test/values.txt");
        Files.deleteIfExists(valuesPath);
        Files.createFile(valuesPath);

        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(findingsPath, StandardOpenOption.WRITE))) {

            for (FindingNode n : findings) {
                pw.println(n.getName());
            }
            pw.flush();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(factorsPath, StandardOpenOption.WRITE))) {

            for (FactorNode n : factors) {
                pw.println(n.getName());
            }
            pw.flush();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(measuresPath, StandardOpenOption.WRITE))) {

            for (MeasureNode n : measures) {
                pw.println(n.getName());
            }
            pw.flush();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(valuesPath, StandardOpenOption.WRITE))) {

            for (ValueNode n : values) {
                pw.println(n.getName());
            }
            pw.flush();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
