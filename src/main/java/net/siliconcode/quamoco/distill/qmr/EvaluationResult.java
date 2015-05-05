/**
 *
 */
package net.siliconcode.quamoco.distill.qmr;

import java.util.ArrayList;
import java.util.List;

/**
 * EvaluationResult -
 *
 * @author isaac
 */
public class EvaluationResult extends AbstractResult {

    private String                 ratioAffected;
    private String                 resultsFrom;
    private String                 resultsType;
    private List<EvaluationResult> evalResults;

    /**
     *
     */
    public EvaluationResult()
    {
        evalResults = new ArrayList<>();
    }

    public void addEvalResult(EvaluationResult result)
    {
        if (result == null || evalResults.contains(result))
        {
            return;
        }

        evalResults.add(result);
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
        final EvaluationResult other = (EvaluationResult) obj;
        if (ratioAffected == null)
        {
            if (other.ratioAffected != null)
            {
                return false;
            }
        }
        else if (!ratioAffected.equals(other.ratioAffected))
        {
            return false;
        }
        if (resultsFrom == null)
        {
            if (other.resultsFrom != null)
            {
                return false;
            }
        }
        else if (!resultsFrom.equals(other.resultsFrom))
        {
            return false;
        }
        if (value == null)
        {
            if (other.value != null)
            {
                return false;
            }
        }
        else if (!value.equals(other.value))
        {
            return false;
        }
        return true;
    }

    /**
     * @return the evalResults
     */
    public List<EvaluationResult> getEvalResults()
    {
        return evalResults;
    }

    /**
     * @return the ratioAffected
     */
    public String getRatioAffected()
    {
        return ratioAffected;
    }

    /**
     * @return the resultsFrom
     */
    public String getResultsFrom()
    {
        return resultsFrom;
    }

    /**
     * @return the resultsType
     */
    public String getResultsType()
    {
        return resultsType;
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
        result = prime * result + (ratioAffected == null ? 0 : ratioAffected.hashCode());
        result = prime * result + (resultsFrom == null ? 0 : resultsFrom.hashCode());
        result = prime * result + (value == null ? 0 : value.hashCode());
        return result;
    }

    public void removeEvalResult(EvaluationResult result)
    {
        if (result == null || !evalResults.contains(result))
        {
            return;
        }

        evalResults.remove(result);
    }

    /**
     * @param evalResults
     *            the evalResults to set
     */
    public void setEvalResults(List<EvaluationResult> evalResults)
    {
        this.evalResults = evalResults;
    }

    /**
     * @param ratioAffected
     *            the ratioAffected to set
     */
    public void setRatioAffected(String ratioAffected)
    {
        this.ratioAffected = ratioAffected;
    }

    /**
     * @param resultsFrom
     *            the resultsFrom to set
     */
    public void setResultsFrom(String resultsFrom)
    {
        this.resultsFrom = resultsFrom;
    }

    /**
     * @param resultsType
     *            the resultsType to set
     */
    public void setResultsType(String resultsType)
    {
        this.resultsType = resultsType;
    }

}
