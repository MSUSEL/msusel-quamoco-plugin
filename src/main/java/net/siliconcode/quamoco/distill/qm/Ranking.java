/**
 *
 */
package net.siliconcode.quamoco.distill.qm;

/**
 * Ranking -
 *
 * @author isaac
 */
public class Ranking extends AbstractQMEntity {

    private String   factor;
    private String   measure;
    private String   normalizationMeasure;
    private String   range;
    private String   rank;
    private String   weight;
    private Function function;
    private String   id;
    private String   ownerId;

    /**
     *
     */
    public Ranking(String rank, String range, String weight, String measure, String factor,
            String normalizationMeasure, String ownerId, String id)
    {
        this.rank = rank;
        this.range = range;
        this.measure = measure;
        this.weight = weight;
        this.factor = factor;
        this.normalizationMeasure = normalizationMeasure;
        this.id = id;
        this.ownerId = ownerId;
    }

    /**
     * @return the factor
     */
    public String getFactor()
    {
        return factor;
    }

    /**
     * @return the function
     */
    public Function getFunction()
    {
        return function;
    }

    /**
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * @return the measure
     */
    public String getMeasure()
    {
        return measure;
    }

    /**
     * @return the normalizationMeasure
     */
    public String getNormalizationMeasure()
    {
        return normalizationMeasure;
    }

    /**
     * @return the range
     */
    public String getRange()
    {
        return range;
    }

    /**
     * @return the rank
     */
    public String getRank()
    {
        return rank;
    }

    /**
     * @return the weight
     */
    public String getWeight()
    {
        return weight;
    }

    /**
     * @param factor
     *            the factor to set
     */
    public void setFactor(String factor)
    {
        this.factor = factor;
    }

    /**
     * @param function
     *            the function to set
     */
    public void setFunction(Function function)
    {
        this.function = function;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * @param measure
     *            the measure to set
     */
    public void setMeasure(String measure)
    {
        this.measure = measure;
    }

    /**
     * @param normalizationMeasure
     *            the normalizationMeasure to set
     */
    public void setNormalizationMeasure(String normalizationMeasure)
    {
        this.normalizationMeasure = normalizationMeasure;
    }

    /**
     * @param range
     *            the range to set
     */
    public void setRange(String range)
    {
        this.range = range;
    }

    /**
     * @param rank
     *            the rank to set
     */
    public void setRank(String rank)
    {
        this.rank = rank;
    }

    /**
     * @param weight
     *            the weight to set
     */
    public void setWeight(String weight)
    {
        this.weight = weight;
    }

    /**
     * @return the ownerId
     */
    public String getOwnerId()
    {
        return ownerId;
    }

    /**
     * @param ownerId
     *            the ownerId to set
     */
    public void setOwnerId(String ownerId)
    {
        this.ownerId = ownerId;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((factor == null) ? 0 : factor.hashCode());
        result = prime * result + ((function == null) ? 0 : function.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((measure == null) ? 0 : measure.hashCode());
        result = prime * result + ((normalizationMeasure == null) ? 0 : normalizationMeasure.hashCode());
        result = prime * result + ((ownerId == null) ? 0 : ownerId.hashCode());
        result = prime * result + ((range == null) ? 0 : range.hashCode());
        result = prime * result + ((rank == null) ? 0 : rank.hashCode());
        result = prime * result + ((weight == null) ? 0 : weight.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ranking other = (Ranking) obj;
        if (factor == null)
        {
            if (other.factor != null)
                return false;
        }
        else if (!factor.equals(other.factor))
            return false;

        if (function == null)
        {
            if (other.function != null)
                return false;
        }
        else if (!function.equals(other.function))
            return false;
        if (id == null)
        {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (measure == null)
        {
            if (other.measure != null)
                return false;
        }
        else if (!measure.equals(other.measure))
            return false;

        if (normalizationMeasure == null)
        {
            if (other.normalizationMeasure != null)
                return false;
        }
        else if (!normalizationMeasure.equals(other.normalizationMeasure))
            return false;

        if (ownerId == null)
        {
            if (other.ownerId != null)
                return false;
        }
        else if (!ownerId.equals(other.ownerId))
            return false;
        if (range == null)
        {
            if (other.range != null)
                return false;
        }
        else if (!range.equals(other.range))
            return false;
        if (rank == null)
        {
            if (other.rank != null)
                return false;
        }
        else if (!rank.equals(other.rank))
            return false;
        if (weight == null)
        {
            if (other.weight != null)
                return false;
        }
        else if (!weight.equals(other.weight))
            return false;
        return true;
    }

    /*
     * (non-Javadoc)
     * @see net.siliconcode.quamoco.swing.qm.AbstractQMEntity#resolve()
     */
    @Override
    public void resolve()
    {
        // TODO Auto-generated method stub

    }

}
