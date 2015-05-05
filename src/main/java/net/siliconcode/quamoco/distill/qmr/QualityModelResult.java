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
package net.siliconcode.quamoco.distill.qmr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.siliconcode.quamoco.distill.AbstractEntity;

/**
 * QualityModelResult -
 *
 * @author Isaac Griffith
 */
public class QualityModelResult {

    private String                            date;
    private String                            system;
    private final List<MeasurementResult>     measureResults;
    private final List<EvaluationResult>      evalResults;
    private final Map<String, AbstractResult> contained;

    /**
     *
     */
    public QualityModelResult(String date, String system)
    {
        measureResults = new ArrayList<>();
        evalResults = new ArrayList<>();
        contained = new HashMap<>();
        this.date = date;
        this.system = system;
    }

    public void addEvalResult(EvaluationResult result)
    {
        if (result == null || evalResults.contains(result))
        {
            return;
        }

        evalResults.add(result);
        contained.put(result.getId(), result);
    }

    public void addMeasureResult(MeasurementResult result)
    {
        if (result == null || measureResults.contains(result))
        {
            return;
        }

        measureResults.add(result);
        contained.put(result.getId(), result);
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
        final QualityModelResult other = (QualityModelResult) obj;
        if (date == null)
        {
            if (other.date != null)
            {
                return false;
            }
        }
        else if (!date.equals(other.date))
        {
            return false;
        }
        if (system == null)
        {
            if (other.system != null)
            {
                return false;
            }
        }
        else if (!system.equals(other.system))
        {
            return false;
        }
        return true;
    }

    /**
     * @return the date
     */
    public String getDate()
    {
        return date;
    }

    /**
     * @return the system
     */
    public String getSystem()
    {
        return system;
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
        result = prime * result + (date == null ? 0 : date.hashCode());
        result = prime * result + (system == null ? 0 : system.hashCode());
        return result;
    }

    public void removeEvalResult(EvaluationResult result)
    {
        if (result == null || !evalResults.contains(result))
        {
            return;
        }

        evalResults.remove(result);
        contained.remove(result.getId());
    }

    public void removeMeasureResult(AbstractEntity result)
    {
        if (result == null || !measureResults.contains(result))
        {
            return;
        }

        measureResults.remove(result);
        contained.remove(result.getId());
    }

    /**
     * @param date
     *            the date to set
     */
    public void setDate(String date)
    {
        this.date = date;
    }

    /**
     * @param system
     *            the system to set
     */
    public void setSystem(String system)
    {
        this.system = system;
    }

    /**
     * @return
     */
    public List<AbstractResult> getContained()
    {
        return new ArrayList<>(contained.values());
    }
}
