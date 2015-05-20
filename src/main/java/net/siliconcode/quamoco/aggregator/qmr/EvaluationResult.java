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
package net.siliconcode.quamoco.aggregator.qmr;

import java.util.ArrayList;
import java.util.List;

/**
 * EvaluationResult -
 *
 * @author Isaac Griffith
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

    public void addEvalResult(final EvaluationResult result)
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

    public void removeEvalResult(final EvaluationResult result)
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
    public void setEvalResults(final List<EvaluationResult> evalResults)
    {
        this.evalResults = evalResults;
    }

    /**
     * @param ratioAffected
     *            the ratioAffected to set
     */
    public void setRatioAffected(final String ratioAffected)
    {
        this.ratioAffected = ratioAffected;
    }

    /**
     * @param resultsFrom
     *            the resultsFrom to set
     */
    public void setResultsFrom(final String resultsFrom)
    {
        this.resultsFrom = resultsFrom;
    }

    /**
     * @param resultsType
     *            the resultsType to set
     */
    public void setResultsType(final String resultsType)
    {
        this.resultsType = resultsType;
    }

}
