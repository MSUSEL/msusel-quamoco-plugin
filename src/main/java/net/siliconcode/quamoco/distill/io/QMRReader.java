/**
 * 
 */
package net.siliconcode.quamoco.distill.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;
import java.util.Stack;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import net.siliconcode.quamoco.distill.qmr.EvaluationResult;
import net.siliconcode.quamoco.distill.qmr.FindingMessage;
import net.siliconcode.quamoco.distill.qmr.MeasurementResult;
import net.siliconcode.quamoco.distill.qmr.QualityModelResult;
import net.siliconcode.quamoco.distill.qmr.Value;

/**
 * QMRReader -
 *
 * @author isaac
 */
public class QMRReader extends AbstractQuamocoReader {

    private QualityModelResult result;

    /**
	 * 
	 */
    public QMRReader()
    {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void read(String... files) throws FileNotFoundException, XMLStreamException
    {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new FileReader(files[0]));

        MeasurementResult mResult = null;
        EvaluationResult eResult = null;
        Stack<EvaluationResult> eResultStack = new Stack<>();

        while (reader.hasNext())
        {
            int event = reader.next();
            switch (event)
            {
            case XMLStreamConstants.START_ELEMENT:
                Map<String, String> attrs = getAttributes(reader);

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
                        eResultStack.peek().addEvalResult(eResult);

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
                    Value value = new Value(attrs.get("lower") == null ? Double.NEGATIVE_INFINITY
                            : Double.parseDouble(attrs.get("lower")),
                            attrs.get("upper") == null ? Double.NEGATIVE_INFINITY : Double.parseDouble(attrs
                                    .get("upper")), attrs.get("id"));

                    if (eResult != null)
                        eResult.setValue(value);
                    if (mResult != null)
                        mResult.setValue(value);

                    break;
                case "findingMessages":
                    FindingMessage fm = new FindingMessage(attrs.get("message"), attrs.get("location"), attrs.get("id"));
                    if (mResult != null)
                        mResult.addFindingMessage(fm);
                    break;
                }
                break;
            case XMLStreamConstants.END_ELEMENT:
                switch (reader.getLocalName())
                {
                case "QualityModelResult":
                    break;
                case "measurementResults":
                    mResult = null;
                    break;
                case "evaluationResults":
                    if (!eResultStack.isEmpty())
                        eResult = eResultStack.pop();
                    else
                        eResult = null;
                    break;
                case "resultsFrom":
                    break;
                case "value":
                    break;
                case "findingMessages":
                    break;
                }
            case XMLStreamConstants.START_DOCUMENT:
                break;
            case XMLStreamConstants.END_DOCUMENT:
                break;
            }
        }

    }

    /**
     * @return
     */
    public QualityModelResult getResult()
    {
        return result;
    }
}
