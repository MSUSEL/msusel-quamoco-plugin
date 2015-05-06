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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.stream.XMLStreamException;

import net.siliconcode.quamoco.distill.io.GradeSchemePropertiesReader;
import net.siliconcode.quamoco.distill.io.MetricPropertiesReader;
import net.siliconcode.quamoco.distill.io.QMRReader;
import net.siliconcode.quamoco.distill.io.ResolveReader;
import net.siliconcode.quamoco.distill.qmr.AbstractResult;
import net.siliconcode.quamoco.distill.qmr.EvaluationResult;
import net.siliconcode.quamoco.distill.qmr.MeasurementResult;
import net.siliconcode.quamoco.distill.qmr.QualityModelResult;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;
import org.kohsuke.args4j.spi.BooleanOptionHandler;
import org.kohsuke.args4j.spi.PathOptionHandler;
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
     * Map relating Measure evaluators ids to Measures
     */
    private Map<String, Measure>      evaluatorMap;
    /**
     * Map relating Measure Keys to Metric Values
     */
    private final Map<String, Double> valueMap;
    @Option(name = "-h", help = true, handler = BooleanOptionHandler.class, usage = "Print this help page.")
    private boolean                   printHelp;
    @Option(name = "-rf", required = true, handler = PathOptionHandler.class, usage = "Set the location of the results file.")
    private Path                      resultFile;
    @Option(name = "-g", required = true, handler = PathOptionHandler.class, usage = "Sets the location of the language graph file.")
    private Path                      graphFile;
    @Option(name = "-mf", required = true, handler = PathOptionHandler.class, usage = "Sets the location of the metrics properties file.")
    private Path                      metricFile;
    @Option(name = "-gf", required = true, handler = PathOptionHandler.class, usage = "Sets the location of the grading scheme properties file.")
    private Path                      gradeFile;

    public static void main(String args[])
    {
        DataExtractor de = new DataExtractor();
        de.doMain(args);
    }

    /**
     * Constructor
     */
    public DataExtractor()
    {
        gradeMap = new HashMap<>();
        metricMap = new HashMap<>();
        valueMap = new HashMap<>();
        evaluatorMap = new HashMap<>();
    }

    public void doMain(String args[])
    {
        CmdLineParser parser = new CmdLineParser(this);
        try
        {
            parser.parseArgument(args);
        }
        catch (CmdLineException e)
        {
            System.out.println(e.getMessage() + "\n");
            printHelp();
            System.exit(0);
        }
        if (printHelp)
        {
            printHelp();
            System.exit(0);
        }
        validatePath(metricFile);
        validatePath(resultFile);
        validatePath(graphFile);
        validatePath(gradeFile);

        try
        {
            extract();
        }
        catch (FileNotFoundException | XMLStreamException e)
        {
            LOG.warn("There was a problem processing one or more of the input files.");
        }
    }

    /**
     * 
     */
    private void validatePath(Path path)
    {
        if (path != null)
        {
            try
            {
                path = path.toRealPath();
            }
            catch (IOException e)
            {
                LOG.warn(e.getMessage());
            }
            if (!Files.exists(path) || Files.isDirectory(path) || !Files.isReadable(path))
            {
                LOG.warn("The file " + path.toString() + " does not exist or you do not have sufficient permissions "
                        + "to read that file.");
                System.exit(1);
            }
        }
    }

    private void printHelp()
    {
        System.out.println("Command line utility to extract values and calculate grades for Quamoco QMR.");
        System.out.println("");
        System.out.println("Usage: QMDataExtractor [Options]");
        System.out.println("");
        System.out.println("     -h, Prints this help message.");
        System.out.println("     -r <FILE>, Set the location of the results file.");
        System.out.println("     -g <FILE>, Sets the location of the language graph file.");
        System.out.println("     -gf <FILE>, Sets the location of the grading scheme properties file.");
        System.out.println("     -mf <FILE>, Sets the location of the metrics properties file.");
    }

    public void setParameters(Path resultFile, Path graphFile, Path metricFile, Path gradeFile)
    {
        this.resultFile = resultFile;
        this.graphFile = graphFile;
        this.metricFile = metricFile;
        this.gradeFile = gradeFile;
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
    public void extract() throws FileNotFoundException, XMLStreamException
    {
        try
        {
            final ResolveReader rReader = new ResolveReader();
            rReader.read(graphFile.toRealPath().toString());

            final QMRReader qmrReader = new QMRReader();
            qmrReader.read(resultFile.toRealPath().toString());
            final QualityModelResult qmr = qmrReader.getResult();

            loadMetrics(metricFile.toRealPath().toString());
            loadGradeSchema(gradeFile.toRealPath().toString());
            populateMetricValues(qmr);
            populateGradeMap();
        }
        catch (IOException e)
        {
            LOG.warn(e.getMessage());
        }
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

        return -1.0;
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
        evaluatorMap = reader.getEvaluatorMap();
    }

    /**
     * Method to grade all metrics based on the current grading scheme.
     */
    private void populateGradeMap()
    {
        Set<String> noValues = new HashSet<>();
        for (final String metric : metricMap.keySet())
        {
            Measure m = metricMap.get(metric);
            double value = m.getValue();
            String grade = evaluateGrade(value);
            gradeMap.put(metric, grade);
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
                double value = er.getValue().getMean();
                // if (Double.compare(value, 0.5) < 0 && Double.compare(value,
                // 0) >= 0)
                // value = 1 - value;
                // valueMap.put(id, value);
                if (evaluatorMap.containsKey(id))
                    evaluatorMap.get(id).addValue(value);

                for (final EvaluationResult subEr : er.getEvalResults())
                {
                    final String subId = subEr.getResultsFrom();
                    double subValue = subEr.getValue().getMean();
                    // if (Double.compare(subValue, 0.5) < 0 &&
                    // Double.compare(subValue, 0) >= 0)
                    // subValue = 1 - subValue;
                    // valueMap.put(subId, subValue);
                    if (evaluatorMap.containsKey(subId))
                        evaluatorMap.get(subId).addValue(subValue);
                }
            }
            else if (ar instanceof MeasurementResult)
            {
                final MeasurementResult mr = (MeasurementResult) ar;
                final String id = mr.getResultsFrom();
                final double value = mr.getValue() == null ? -1 : mr.getValue().getMean();
                // TODO figure out what the count is used for: int count =
                // mr.getCount();

                valueMap.put(id, value);
            }
        }
    }
}
