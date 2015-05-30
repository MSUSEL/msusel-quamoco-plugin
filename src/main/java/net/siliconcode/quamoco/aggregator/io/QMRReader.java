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
package net.siliconcode.quamoco.aggregator.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Stack;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import net.siliconcode.quamoco.aggregator.qmr.EvaluationResult;
import net.siliconcode.quamoco.aggregator.qmr.FindingMessage;
import net.siliconcode.quamoco.aggregator.qmr.MeasurementResult;
import net.siliconcode.quamoco.aggregator.qmr.QualityModelResult;
import net.siliconcode.quamoco.aggregator.qmr.Value;

/**
 * QMRReader -
 *
 * @author Isaac Griffith
 */
public class QMRReader extends AbstractQuamocoReader {

    /**
     * 
     */
    private static final String          MESSAGE = "message";
    /**
     * 
     */
    private static final String          HREF    = "href";
    /**
     * 
     */
    private static final String          ID      = "id";
    /**
     * 
     */
    private static final String          TYPE    = "type";
    transient private QualityModelResult result;

    /**
     *
     */
    public QMRReader()
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param mResult
     * @param eResult
     * @param attrs
     */
    private void extractValue(final MeasurementResult mResult, final EvaluationResult eResult,
            final Map<String, String> attrs)
    {
        double lb = -1.0;
        if (attrs.get("lower") != null)
        {
            lb = Double.parseDouble(attrs.get("lower"));
        }
        double ub = -1.0;
        if (attrs.get("upper") != null)
        {
            ub = Double.parseDouble(attrs.get("upper"));
        }
        final Value value = new Value(lb, ub, attrs.get(ID));

        if (eResult != null)
        {
            eResult.setValue(value);
        }
        if (mResult != null)
        {
            mResult.setValue(value);
        }
    }

    /**
     * @return
     */
    public QualityModelResult getResult()
    {
        return result;
    }

    @Override
    public void read(final String file) throws FileNotFoundException, XMLStreamException
    {
        final XMLInputFactory factory = XMLInputFactory.newInstance();
        final XMLStreamReader reader = factory.createXMLStreamReader(new FileReader(file));

        MeasurementResult mResult = null;
        EvaluationResult eResult = null;
        final Stack<EvaluationResult> eResultStack = new Stack<>();

        while (reader.hasNext())
        {
            final int event = reader.next();
            switch (event)
            {
            case XMLStreamConstants.START_ELEMENT:
                final Map<String, String> attrs = getAttributes(reader);

                switch (reader.getLocalName())
                {
                case "QualityModelResult":
                    result = new QualityModelResult(attrs.get("system"), attrs.get("date"));
                    break;
                case "measurementResults":
                    mResult = new MeasurementResult();
                    updateMeasurmentResult(mResult, attrs);
                    result.addMeasureResult(mResult);
                    break;
                case "evaluationResults":
                    eResult = new EvaluationResult();
                    updateEvaluationResult(eResult, eResultStack, attrs);

                    eResultStack.push(eResult);
                    result.addEvalResult(eResult);
                    break;
                case "resultsFrom":
                    updateResultsFromAndType(mResult, eResult, attrs);
                    break;
                case "value":
                    extractValue(mResult, eResult, attrs);
                    break;
                case "findingMessages":
                    final FindingMessage fm = new FindingMessage(attrs.get(MESSAGE), attrs.get("location"),
                            attrs.get(ID));
                    if (mResult != null)
                    {
                        mResult.addFindingMessage(fm);
                    }
                    break;
                }
                break;
            case XMLStreamConstants.END_ELEMENT:
                switch (reader.getLocalName())
                {
                case "measurementResults":
                    mResult = null;
                    break;
                case "evaluationResults":
                    if (eResultStack.isEmpty())
                    {
                        eResult = null;                        
                    }
                    else
                    {
                        eResult = eResultStack.pop();
                    }
                    break;
                }
            }
        }

    }

    /**
     * @param eResult
     * @param eResultStack
     * @param attrs
     */
    private void updateEvaluationResult(final EvaluationResult eResult, final Stack<EvaluationResult> eResultStack,
            final Map<String, String> attrs)
    {
        eResult.setId(attrs.get(ID));
        eResult.setType(attrs.get(TYPE));
        if (!eResultStack.isEmpty())
        {
            eResultStack.peek().addEvalResult(eResult);
        }
    }

    /**
     * @param mResult
     * @param attrs
     */
    private void updateMeasurmentResult(final MeasurementResult mResult, final Map<String, String> attrs)
    {
        mResult.setId(attrs.get(ID));
        mResult.setType(attrs.get(TYPE));
        mResult.setMessage(attrs.get(MESSAGE));
        int count = 0;
        if (attrs.get("count") != null)
        {
            count = Integer.parseInt(attrs.get("count"));
        }
        mResult.setCount(count);
    }

    /**
     * @param mResult
     * @param eResult
     * @param attrs
     */
    private void updateResultsFromAndType(final MeasurementResult mResult, final EvaluationResult eResult,
            final Map<String, String> attrs)
    {
        if (mResult != null)
        {
            mResult.setResultsType(attrs.get(TYPE));
            mResult.setResultsFrom(attrs.get(HREF));
        }
        else if (eResult != null)
        {
            eResult.setResultsFrom(attrs.get(HREF));
            eResult.setResultsType(attrs.get(TYPE));
        }
    }
}
