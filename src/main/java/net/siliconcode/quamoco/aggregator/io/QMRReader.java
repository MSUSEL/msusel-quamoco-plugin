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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * QMRReader -
 *
 * @author Isaac Griffith
 */
public class QMRReader extends AbstractQuamocoReader {

    private static final Logger LOG = LoggerFactory.getLogger(QMRReader.class);
    private QualityModelResult  result;

    /**
     *
     */
    public QMRReader()
    {
        // TODO Auto-generated constructor stub
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
                    mResult.setId(attrs.get("id"));
                    mResult.setType(attrs.get("type"));
                    mResult.setMessage(attrs.get("message"));
                    mResult.setCount(attrs.get("count") == null ? 0 : Integer.parseInt(attrs.get("count")));
                    result.addMeasureResult(mResult);
                    break;
                case "evaluationResults":
                    eResult = new EvaluationResult();
                    eResult.setId(attrs.get("id"));
                    eResult.setType(attrs.get("type"));
                    if (!eResultStack.isEmpty())
                    {
                        eResultStack.peek().addEvalResult(eResult);
                    }

                    eResultStack.push(eResult);
                    result.addEvalResult(eResult);
                    break;
                case "resultsFrom":
                    if (mResult != null)
                    {
                        mResult.setResultsType(attrs.get("type"));
                        mResult.setResultsFrom(attrs.get("href"));
                    }
                    else if (eResult != null)
                    {
                        eResult.setResultsFrom(attrs.get("href"));
                        eResult.setResultsType(attrs.get("type"));
                    }
                    break;
                case "value":
                    final Value value = new Value(attrs.get("lower") == null ? -1.0 : Double.parseDouble(attrs
                            .get("lower")), attrs.get("upper") == null ? -1.0 : Double.parseDouble(attrs.get("upper")),
                                    attrs.get("id"));

                    if (eResult != null)
                    {
                        eResult.setValue(value);
                    }
                    if (mResult != null)
                    {
                        mResult.setValue(value);
                    }

                    break;
                case "findingMessages":
                    final FindingMessage fm = new FindingMessage(attrs.get("message"), attrs.get("location"),
                            attrs.get("id"));
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
                    if (!eResultStack.isEmpty())
                    {
                        eResult = eResultStack.pop();
                    }
                    else
                    {
                        eResult = null;
                    }
                    break;
                }
            }
        }

    }
}
