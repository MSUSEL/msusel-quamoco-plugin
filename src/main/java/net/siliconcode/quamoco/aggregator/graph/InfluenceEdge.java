/**
 * 
 */
package net.siliconcode.quamoco.aggregator.graph;

/**
 * InfluenceEdge -
 * 
 * @author isaac
 */
public class InfluenceEdge extends AbstractEdge {

    /**
     * @param name
     * @param id
     */
    public InfluenceEdge(String name)
    {
        super(name);
    }

    public static final String POS        = "POSITIVE";
    public static final String NEG        = "NEGATIVE";
    private double             weight     = 0;
    private String             inf;
    private double             lowerBound = 0;
    private double             upperBound = 0;
    private int                rank;

    /**
     * @return the lowerBound
     */
    public double getLowerBound()
    {
        return lowerBound;
    }

    /**
     * @param lowerBound
     *            the lowerBound to set
     */
    public void setLowerBound(double lowerBound)
    {
        this.lowerBound = lowerBound;
    }

    /**
     * @return the upperBound
     */
    public double getUpperBound()
    {
        return upperBound;
    }

    /**
     * @param upperBound
     *            the upperBound to set
     */
    public void setUpperBound(double upperBound)
    {
        this.upperBound = upperBound;
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

    /**
     * @return the inf
     */
    public String getInf()
    {
        return inf;
    }

    /**
     * @param inf
     *            the inf to set
     */
    public void setInf(String inf)
    {
        this.inf = inf;
    }

    /**
     * @param rank
     */
    public void setRank(int rank)
    {
        this.rank = rank;
    }
}
