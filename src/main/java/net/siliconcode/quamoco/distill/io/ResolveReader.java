/**
 * 
 */
package net.siliconcode.quamoco.distill.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import net.siliconcode.quamoco.distill.graph.FactorNode;
import net.siliconcode.quamoco.distill.graph.MeanNode;
import net.siliconcode.quamoco.distill.graph.MeasureNode;
import net.siliconcode.quamoco.distill.graph.Node;
import net.siliconcode.quamoco.distill.graph.NormalizationNode;
import net.siliconcode.quamoco.distill.graph.SummationNode;
import net.siliconcode.quamoco.distill.graph.ValueNode;
import net.siliconcode.quamoco.distill.graph.WeightNode;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.util.EdgeType;

/**
 * ResolveReader -
 *
 * @author isaac
 */
public class ResolveReader {

    private DirectedSparseGraph<Node, String> graph;
    private Map<String, Node>                 metricMap;

    /**
     * 
     */
    public ResolveReader()
    {
        metricMap = new HashMap<>();
    }

    public void read(String file) throws FileNotFoundException, XMLStreamException
    {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new FileReader(file));

        Map<Long, Node> nodeMap = new HashMap<>();
        Node node = null;
        while (reader.hasNext())
        {
            int event = reader.next();
            switch (event)
            {
            case XMLStreamConstants.START_ELEMENT:
                Map<String, String> attrs = getAttributes(reader);
                switch (reader.getLocalName())
                {
                case "resolutionGraph":
                    graph = new DirectedSparseGraph<>();
                    break;
                case "nodes":
                    node = null;
                    switch (attrs.get("type"))
                    {
                    case "SUMMATION":
                        node = new SummationNode(graph, attrs.get("name"), attrs.get("owner"), Long.parseLong(attrs
                                .get("id")));
                        break;
                    case "MEAN":
                        node = new MeanNode(graph, attrs.get("name"), attrs.get("owner"), Long.parseLong(attrs
                                .get("id")));
                        break;
                    case "NORMALIZATION":
                        node = new NormalizationNode(graph, attrs.get("name"), attrs.get("owner"), Long.parseLong(attrs
                                .get("id")));
                        break;
                    case "VALUE":
                        node = new ValueNode(graph, attrs.get("name"), attrs.get("owner"), Long.parseLong(attrs
                                .get("id")));
                        break;
                    case "WEIGHT":
                        node = new WeightNode(graph, attrs.get("name"), attrs.get("owner"), Double.parseDouble(attrs
                                .get("weight")), Long.parseLong(attrs.get("id")));
                    case "FACTOR":
                        node = new FactorNode(graph, attrs.get("name"), attrs.get("owner"), Long.parseLong(attrs
                                .get("id")));
                        ((FactorNode) node).setDescription(attrs.get("description"));
                        break;
                    case "MEASURE":
                        node = new MeasureNode(graph, attrs.get("name"), attrs.get("owner"), Long.parseLong(attrs
                                .get("id")));
                        ((MeasureNode) node).setDescription(attrs.get("description"));
                        break;
                    }
                    if (node != null)
                    {
                        graph.addVertex(node);
                        assert Long.parseLong(attrs.get("id")) == node.getId();
                        nodeMap.put(node.getId(), node);
                    }
                    break;
                case "evaluatedBy":
                    String eval = attrs.get("id");
                    if (node != null && node instanceof FactorNode)
                        ((FactorNode) node).addEvaluatedBy(eval);
                    else if (node != null && node instanceof MeasureNode)
                        ((MeasureNode) node).addEvaluatedBy(eval);
                    break;
                case "edges":
                    Node dest = nodeMap.get(Long.parseLong(attrs.get("dest")));
                    Node src = nodeMap.get(Long.parseLong(attrs.get("src")));
                    graph.addEdge(attrs.get("name"), src, dest, EdgeType.DIRECTED);
                    break;
                case "metrics":
                    metricMap.put(attrs.get("name"), nodeMap.get(Long.parseLong(attrs.get("nodeID"))));
                    break;
                }
                break;
            }
        }
    }

    /**
     * @return the metricMap
     */
    public Map<String, Node> getMetricMap()
    {
        return metricMap;
    }

    /**
     * @param metricMap
     *            the metricMap to set
     */
    public void setMetricMap(Map<String, Node> metricMap)
    {
        this.metricMap = metricMap;
    }

    private Map<String, String> getAttributes(XMLStreamReader reader)
    {
        Map<String, String> retVal = new HashMap<>();

        for (int i = 0; i < reader.getAttributeCount(); i++)
        {
            if (!retVal.containsKey(reader.getAttributeLocalName(i)))
                retVal.put(reader.getAttributeLocalName(i), reader.getAttributeValue(i));
        }

        return retVal;
    }

    /**
     * @return
     */
    public DirectedSparseGraph<Node, String> getGraph()
    {
        return graph;
    }

}