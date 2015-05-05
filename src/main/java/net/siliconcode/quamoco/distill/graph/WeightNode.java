/**
 *
 */
package net.siliconcode.quamoco.distill.graph;

import edu.uci.ics.jung.graph.DirectedSparseGraph;

/**
 * WeightNode -
 *
 * @author isaac
 */
public class WeightNode extends Node {

    private double weight;
    private double upperBound;
    private double lowerBound;
    private int    rank;

    /**
     *
     */
    public WeightNode(DirectedSparseGraph<Node, String> graph, String name, String owner, double weight)
    {
        super(graph, name, owner);
        this.weight = weight;
    }

    public WeightNode(DirectedSparseGraph<Node, String> graph, String name, String owner, double weight, long id)
    {
        super(graph, name, owner, id);
        this.weight = weight;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.resolve.Node#getValue()
     */
    @Override
    public double getValue()
    {
        if (Double.compare(value, Double.NEGATIVE_INFINITY) == 0)
        {
            double value = weight;

            for (final String edge : graph.getInEdges(this))
            {
                final Node n = graph.getOpposite(this, edge);
                value *= n.getValue();
            }

            this.value = value;
        }
        return value;
    }

    /**
     * @return the weight
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * @param weight
     *            the weight to set
     */
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.resolve.Node#getXMLTag()
     */
    @Override
    public String getXMLTag()
    {
        return String
                .format("<nodes name=\"%s\" weight=\"%f\" id=\"%d\" owner=\"%s\" type=\"WEIGHT\" lowerBound=\"%f\" upperBound=\"%f\" rank=\"%d\" />",
                        this.name, this.weight, this.id, this.ownedBy, this.lowerBound, this.upperBound, this.rank);
    }

    /**
     * @param upperBound
     */
    public void setUpper(double upperBound)
    {
        this.upperBound = upperBound;
    }

    /**
     * @param lowerBound
     */
    public void setLower(double lowerBound)
    {
        this.lowerBound = lowerBound;
    }

    /**
     * @param rank
     */
    public void setRank(int rank)
    {
        this.rank = rank;
    }
}
