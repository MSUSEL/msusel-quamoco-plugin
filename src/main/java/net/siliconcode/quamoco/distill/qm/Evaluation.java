/**
 *
 */
package net.siliconcode.quamoco.distill.qm;

import java.util.ArrayList;
import java.util.List;

/**
 * Evaluation -
 *
 * @author isaac
 */
public class Evaluation extends AbstractQMEntity {

    private String              completeness;
    private String              evaluates;
    private double              maximumPoints;
    private String              specification;
    private final List<Ranking> rankings;

    /**
     *
     */
    public Evaluation(String name, String description, String specification, double maximumPoints, String completeness,
            String evaluates, String id)
    {
        rankings = new ArrayList<>();
        this.name = name;
        this.description = description;
        this.specification = specification;
        this.completeness = completeness;
        this.evaluates = evaluates;
        this.maximumPoints = maximumPoints;
        this.id = id;
    }

    public void addRanking(Ranking rank)
    {
        if (rank == null || rankings.contains(rank))
        {
            return;
        }

        rankings.add(rank);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Evaluation other = (Evaluation) obj;
        if (completeness == null)
        {
            if (other.completeness != null)
            {
                return false;
            }
        }
        else if (!completeness.equals(other.completeness))
        {
            return false;
        }
        if (description == null)
        {
            if (other.description != null)
            {
                return false;
            }
        }
        else if (!description.equals(other.description))
        {
            return false;
        }
        if (evaluates == null)
        {
            if (other.evaluates != null)
            {
                return false;
            }
        }
        else if (!evaluates.equals(other.evaluates))
        {
            return false;
        }
        if (id == null)
        {
            if (other.id != null)
            {
                return false;
            }
        }
        else if (!id.equals(other.id))
        {
            return false;
        }
        if (Double.doubleToLongBits(maximumPoints) != Double.doubleToLongBits(other.maximumPoints))
        {
            return false;
        }
        if (name == null)
        {
            if (other.name != null)
            {
                return false;
            }
        }
        else if (!name.equals(other.name))
        {
            return false;
        }
        if (specification == null)
        {
            if (other.specification != null)
            {
                return false;
            }
        }
        else if (!specification.equals(other.specification))
        {
            return false;
        }
        return true;
    }

    /**
     * @return the completeness
     */
    public String getCompleteness()
    {
        return completeness;
    }

    /**
     * @return the evaluates
     */
    public String getEvaluates()
    {
        return evaluates;
    }

    /**
     * @return the maximumPoints
     */
    public double getMaximumPoints()
    {
        return maximumPoints;
    }

    /**
     * @return the specification
     */
    public String getSpecification()
    {
        return specification;
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
        result = prime * result + (completeness == null ? 0 : completeness.hashCode());
        result = prime * result + (description == null ? 0 : description.hashCode());
        result = prime * result + (evaluates == null ? 0 : evaluates.hashCode());
        result = prime * result + (id == null ? 0 : id.hashCode());
        long temp;
        temp = Double.doubleToLongBits(maximumPoints);
        result = prime * result + (int) (temp ^ temp >>> 32);
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + (specification == null ? 0 : specification.hashCode());
        return result;
    }

    public void removeRanking(Ranking rank)
    {
        if (rank == null || !rankings.contains(rank))
        {
            return;
        }

        rankings.remove(rank);
    }

    /**
     * @param completeness
     *            the completeness to set
     */
    public void setCompleteness(String completeness)
    {
        this.completeness = completeness;
    }

    /**
     * @param evaluates
     *            the evaluates to set
     */
    public void setEvaluates(String evaluates)
    {
        this.evaluates = evaluates;
    }

    /**
     * @param maximumPoints
     *            the maximumPoints to set
     */
    public void setMaximumPoints(double maximumPoints)
    {
        this.maximumPoints = maximumPoints;
    }

    /**
     * @param specification
     *            the specification to set
     */
    public void setSpecification(String specification)
    {
        this.specification = specification;
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

    /**
     * @return
     */
    public List<Ranking> getRankings()
    {
        return rankings;
    }

}
