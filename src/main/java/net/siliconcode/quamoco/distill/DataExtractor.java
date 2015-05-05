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
package net.siliconcode.quamoco.distill;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.stream.XMLStreamException;

import net.siliconcode.quamoco.distill.io.GradeSchemePropertiesReader;
import net.siliconcode.quamoco.distill.io.MetricPropertiesReader;
import net.siliconcode.quamoco.distill.io.QMRReader;
import net.siliconcode.quamoco.distill.io.ResolveReader;
import net.siliconcode.quamoco.distill.qmr.AbstractResult;
import net.siliconcode.quamoco.distill.qmr.EvaluationResult;
import net.siliconcode.quamoco.distill.qmr.MeasurementResult;
import net.siliconcode.quamoco.distill.qmr.QualityModelResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DataExtractor -
 *
 * @author Isaac Griffith
 */
public class DataExtractor {

    private static final Logger       LOG = LoggerFactory.getLogger(DataExtractor.class);
    /**
     * Map relating Evaluation or Rank ids to measure instances
     */
    private Map<String, Measure>      metricMap;
    /**
     * Map relating Measure Keys to Grade Values
     */
    private final Map<String, String> gradeMap;
    /**
     * Map relating Measure Keys to Metric Values
     */
    private final Map<String, Double> valueMap;

    /**
     * Constructor
     */
    public DataExtractor()
    {
        gradeMap = new HashMap<>();
        metricMap = new HashMap<>();
        valueMap = new HashMap<>();
    }

    /**
     * Uses the grade schema to assign a grade value to provided metric value.
     * 
     * @param value
     *            metric value compare against the grading schema.
     * @return a grade for the given value, or null if no grading schema has
     *         been specified.
     */
    private String evaluateGrade(final double value)
    {
        for (final Grade g : Grade.getGrades())
        {
            if (g.evaluate(value) == 0)
            {
                return g.getName();
            }
        }
        return null;
    }

    /**
     * @param resultFile
     * @param graphFile
     * @param metricFile
     * @param gradeFile
     * @throws FileNotFoundException
     * @throws XMLStreamException
     */
    public void extract(final Path resultFile, final Path graphFile, final Path metricFile, final Path gradeFile)
            throws FileNotFoundException, XMLStreamException
    {
        final ResolveReader rReader = new ResolveReader();
        rReader.read(graphFile.toString());

        final QMRReader qmrReader = new QMRReader();
        qmrReader.read(resultFile.toString());
        final QualityModelResult qmr = qmrReader.getResult();

        loadMetrics(metricFile.toString());
        loadGradeSchema(gradeFile.toString());
        populateMetricValues(qmr);
        populateGradeMap();
    }

    /**
     * Retrives the measured grade for a given measure key.
     * 
     * @param measureKey
     *            Key for a measure instance of a metric
     * @return the grade value stored for the measure key, or null if no such
     *         grade is available or the grade schema is not available.
     */
    public String getMetricGrade(final String measureKey)
    {
        if (gradeMap.containsKey(measureKey))
        {
            return gradeMap.get(measureKey);
        }

        return null;
    }

    /**
     * Returns a listing of the measurement keys currently available.
     * 
     * @return List of keys for measure instances of metrics.
     */
    public List<String> getMetrics()
    {
        return new ArrayList<String>(metricMap.keySet());
    }

    /**
     * @param measureKey
     * @return
     */
    public double getMetricValue(final String measureKey)
    {
        if (valueMap.containsKey(measureKey))
        {
            return valueMap.get(measureKey);
        }

        return 0;
    }

    /**
     * @param props
     */
    private void loadGradeSchema(final String props)
    {
        final GradeSchemePropertiesReader reader = new GradeSchemePropertiesReader();
        reader.read(props);
    }

    /**
     * Method to setup and load the metrics from the metrics properties file.
     * 
     * @param props
     *            string specifying the path for the metrics properties file.
     */
    private void loadMetrics(final String props)
    {
        final MetricPropertiesReader reader = new MetricPropertiesReader();
        reader.read(props);
        metricMap = reader.getMetricsMap();
    }

    /**
     * Method to grade all metrics based on the current grading scheme.
     */
    private void populateGradeMap()
    {
        for (final String metric : metricMap.keySet())
        {
            gradeMap.put(metric, evaluateGrade(valueMap.get(metric)));
        }
    }

    /**
     * Method to extract Values from the QMR data and assign those values to the
     * measurements.
     * 
     * @param qmr
     *            The root entity of the QMR data model.
     */
    private void populateMetricValues(final QualityModelResult qmr)
    {
        for (final AbstractResult ar : qmr.getContained())
        {
            if (ar instanceof EvaluationResult)
            {
                final EvaluationResult er = (EvaluationResult) ar;
                final String id = er.getResultsFrom();
                final double value = er.getValue().getMean();
                valueMap.put(id, value);

                for (final EvaluationResult subEr : er.getEvalResults())
                {
                    final String subId = subEr.getResultsFrom();
                    final double subValue = subEr.getValue().getMean();
                    valueMap.put(subId, subValue);
                }
            }
            else if (ar instanceof MeasurementResult)
            {
                final MeasurementResult mr = (MeasurementResult) ar;
                final String id = mr.getResultsFrom();
                final double value = mr.getValue().getMean();
                // TODO figure out what the count is used for: int count =
                // mr.getCount();

                valueMap.put(id, value);
            }
        }
    }
}
