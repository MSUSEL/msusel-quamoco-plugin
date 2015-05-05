/**
 *
 */
package net.siliconcode.quamoco.distill;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.stream.XMLStreamException;

import net.siliconcode.quamoco.distill.io.QMRReader;
import net.siliconcode.quamoco.distill.io.ResolveReader;
import net.siliconcode.quamoco.distill.qmr.AbstractResult;
import net.siliconcode.quamoco.distill.qmr.EvaluationResult;
import net.siliconcode.quamoco.distill.qmr.MeasurementResult;
import net.siliconcode.quamoco.distill.qmr.QualityModelResult;

/**
 * Resolver -
 *
 * @author isaac
 */
public class DataExtractor {

    private Map<String, Measure> metricMap;
    private Map<String, String>  gradeMap;
    private String               name;
    private final Grade[]        grades = { new Grade("A"), new Grade("B"), new Grade("C"), new Grade("D"),
            new Grade("E"), new Grade("F"), new Grade("U") };

    /**
     *
     */
    public DataExtractor()
    {
        valueMap = new HashMap<>();
        gradeMap = new HashMap<>();
        metricMap = new HashMap<>();
    }

    public void distill(Path resultFile, Path graphFile, Path metricFile, Path gradeFile) throws FileNotFoundException,
            XMLStreamException
    {
        ResolveReader rReader = new ResolveReader();
        rReader.read(graphFile.toString());

        QMRReader qmrReader = new QMRReader();
        qmrReader.read(resultFile.toString());
        QualityModelResult qmr = qmrReader.getResult();

        loadMetrics(metricFile.toString());
        loadGradeSchema(gradeFile.toString());
        populateMetricValues(qmr);
        populateGradeMap();
    }

    private void populateMetricValues(QualityModelResult qmr)
    {
        for (AbstractResult ar : qmr.getContained())
        {
            if (ar instanceof EvaluationResult)
            {
                EvaluationResult er = (EvaluationResult) ar;
                String id = er.getResultsFrom();
                double value = er.getValue().getMean();
                valueMap.put(id, value);

                for (EvaluationResult subEr : er.getEvalResults())
                {
                    String subId = subEr.getResultsFrom();
                    double subValue = subEr.getValue().getMean();
                    valueMap.put(subId, subValue);
                }
            }
            else if (ar instanceof MeasurementResult)
            {
                MeasurementResult mr = (MeasurementResult) ar;
                String id = mr.getResultsFrom();
                double value = mr.getValue().getMean();
                int count = mr.getCount();

                valueMap.put(id, value);
            }
        }
    }

    public List<String> getMetrics()
    {
        return new ArrayList<String>(metricMap.keySet());
    }

    public double getMetricValue(String factor)
    {
        if (metricMap.containsKey(factor))
        {
            return metricMap.get(factor).getValue();
        }

        return 0;
    }

    private void populateGradeMap()
    {
        for (String metric : metricMap.keySet())
        {
            gradeMap.put(metric, evaluateGrade(valueMap.get(metric)));
        }
    }

    private String evaluateGrade(double value)
    {
        for (Grade g : grades)
        {
            if (g.compareTo(value) == 0)
                return g.getValue();
        }
        return null;
    }

    public String getMetricGrade(String metric)
    {
        if (gradeMap.containsKey(metric))
            return gradeMap.get(metric);

        return null;
    }

    private void loadMetrics(String props)
    {
        Properties prop = new Properties();
        try
        {
            prop.load(new FileReader(props));

            String temp = prop.getProperty("properties.keynames");
            String[] keys = temp.split(",");
            for (String key : keys)
            {
                String id = prop.getProperty(String.format("%s.id", key));
                String name = prop.getProperty(String.format("%s.name", key));
                String parents = prop.getProperty(String.format("%s.parents", key));
                String valueIDs = prop.getProperty(String.format("%s.values", key));
                String description = prop.getProperty(String.format("%s.description"));
                metricMap.put(id, new Measure(id, name, description, valueIDs.split(","), parents.split(",")));
            }
        }
        catch (IOException e)
        {

        }
    }

    private void loadGradeSchema(String props)
    {
        Properties prop = new Properties();
        try
        {
            prop.load(new FileReader(props));

            for (Grade g : grades)
            {
                double lower = Double.parseDouble(prop.getProperty(g.getValue() + "_GRADE.lower"));
                double upper = Double.parseDouble(prop.getProperty(g.getValue() + "_GRADE.upper"));
                g.setThresholds(lower, upper);
            }
        }
        catch (IOException e)
        {

        }
    }

    private void populateMetricValues()
    {

    }

    private class Grade implements Comparable<Double> {

        private String value;

        /**
         * @return the value
         */
        public String getValue()
        {
            return value;
        }

        private double lower;
        private double upper;

        public Grade(String value)
        {
            this.value = value;
            lower = 0;
            upper = 1;
        }

        public void setUpperThreshold(double upper)
        {
            this.upper = upper;
            this.lower = Double.NEGATIVE_INFINITY;
        }

        public void setThresholds(double lower, double upper)
        {
            if (Double.compare(lower, upper) > 0)
                throw new RuntimeException("In Grade " + value
                        + ", the lower grade threshold cannot exceed the upper grade threshold.");

            this.lower = lower;
            this.upper = upper;
        }

        /*
         * (non-Javadoc)
         * @see java.lang.Comparable#compareTo(java.lang.Object)
         */
        @Override
        public int compareTo(Double o)
        {
            if (Double.compare(o, lower) > 0 && Double.compare(o, upper) <= 0)
                return 0;
            else if (Double.compare(o, lower) <= 0)
                return -1;
            else
                return 1;
        }
    }
}
