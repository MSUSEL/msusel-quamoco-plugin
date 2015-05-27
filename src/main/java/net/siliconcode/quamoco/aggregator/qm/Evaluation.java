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
package net.siliconcode.quamoco.aggregator.qm;

import java.util.ArrayList;
import java.util.List;

/**
 * Evaluation -
 *
 * @author Isaac Griffith
 */
public class Evaluation extends AbstractQMEntity {

    private String              completeness;
    private String              evaluates;
    private double              maximumPoints;
    private String              specification;
    private final String        type;
    private final List<Ranking> rankings;

    /**
     *
     */
    public Evaluation(final String name, final String description, final String specification,
            final double maximumPoints, final String completeness, final String evaluates, final String type,
            final String id)
    {
        rankings = new ArrayList<>();
        this.name = name;
        this.description = description;
        this.specification = specification;
        this.completeness = completeness;
        this.evaluates = evaluates;
        this.maximumPoints = maximumPoints;
        this.type = type;
        this.id = id;
    }

    public void addRanking(final Ranking rank)
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
    public boolean equals(final Object obj)
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
     * @return
     */
    public List<Ranking> getRankings()
    {
        return rankings;
    }

    /**
     * @return the specification
     */
    public String getSpecification()
    {
        return specification;
    }

    /**
     * @return
     */
    public Object getType()
    {
        return type;
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

    public void removeRanking(final Ranking rank)
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
    public void setCompleteness(final String completeness)
    {
        this.completeness = completeness;
    }

    /**
     * @param evaluates
     *            the evaluates to set
     */
    public void setEvaluates(final String evaluates)
    {
        this.evaluates = evaluates;
    }

    /**
     * @param maximumPoints
     *            the maximumPoints to set
     */
    public void setMaximumPoints(final double maximumPoints)
    {
        this.maximumPoints = maximumPoints;
    }

    /**
     * @param specification
     *            the specification to set
     */
    public void setSpecification(final String specification)
    {
        this.specification = specification;
    }

}
