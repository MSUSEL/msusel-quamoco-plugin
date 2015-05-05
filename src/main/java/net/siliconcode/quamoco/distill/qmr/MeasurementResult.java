/**
 *
 */
package net.siliconcode.quamoco.distill.qmr;

import java.util.ArrayList;
import java.util.List;

/**
 * MeasurmentResult -
 *
 * @author isaac
 */
public class MeasurementResult extends AbstractResult {

    private String                     message;
    private String                     resultsFrom;
    private String                     resultsType;
    private final List<FindingMessage> fMessages;
    private int                        count;
    /**
     *
     */
    public MeasurementResult()
    {
        fMessages = new ArrayList<>();
    }

    public void addFindingMessage(FindingMessage fm)
    {
        if (fm == null || fMessages.contains(fm))
        {
            return;
        }

        fMessages.add(fm);
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
        final MeasurementResult other = (MeasurementResult) obj;
        if (message == null)
        {
            if (other.message != null)
            {
                return false;
            }
        }
        else if (!message.equals(other.message))
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
     * @return the count
     */
    public int getCount()
    {
        return count;
    }

    /**
     * @return the message
     */
    public String getMessage()
    {
        return message;
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
        result = prime * result + (message == null ? 0 : message.hashCode());
        result = prime * result + (resultsFrom == null ? 0 : resultsFrom.hashCode());
        result = prime * result + (value == null ? 0 : value.hashCode());
        return result;
    }

    public void removeFindingMessage(FindingMessage fm)
    {
        if (fm == null || !fMessages.contains(fm))
        {
            return;
        }

        fMessages.remove(fm);
    }

    /**
     * @param count
     *            the count to set
     */
    public void setCount(int count)
    {
        this.count = count;
    }

    /**
     * @param message
     *            the message to set
     */
    public void setMessage(String message)
    {
        this.message = message;
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
