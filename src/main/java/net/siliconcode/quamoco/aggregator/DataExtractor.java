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
package net.siliconcode.quamoco.aggregator;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.stream.XMLStreamException;

import net.siliconcode.quamoco.aggregator.io.GradeSchemePropertiesReader;
import net.siliconcode.quamoco.aggregator.io.MetricPropertiesReader;
import net.siliconcode.quamoco.aggregator.qmr.AbstractResult;
import net.siliconcode.quamoco.aggregator.qmr.EvaluationResult;
import net.siliconcode.quamoco.aggregator.qmr.MeasurementResult;
import net.siliconcode.quamoco.aggregator.qmr.QualityModelResult;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DataExtractor -
 *
 * @author Isaac Griffith
 */
public class DataExtractor {

    private static final Logger       LOG = LoggerFactory.getLogger(DataExtractor.class);
    private static final Options      options;
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
    private Path                      resultFile;
    private Path                      graphFile;
    private Path                      metricFile;
    private Path                      gradeFile;

    static
    {
        Option help = Option.builder("h").hasArg(false).required(false).longOpt("help").desc("prints this message")
                .hasArg(false).build();
        Option resultsFile = Option.builder("r").hasArg(true).required(false).longOpt("result-file")
                .desc("the location of the results file").numberOfArgs(1).argName("FILE").build();
        Option graphFile = Option.builder("l").hasArg(true).required(true).longOpt("lang-graph")
                .desc("the location of the language graph file").numberOfArgs(1).argName("FILE").build();
        Option metricFile = Option.builder("m").hasArg(true).required(true).longOpt("metric-file")
                .desc("the location of the metrics properties file").numberOfArgs(1).argName("FILE").build();
        Option gradeFile = Option.builder("g").hasArg(true).required(false).longOpt("grade-file")
                .desc("the location of the grading scheme properties file").numberOfArgs(1).argName("FILE").build();
        options = new Options();
        options.addOption(help);
        options.addOption(resultsFile);
        options.addOption(graphFile);
        options.addOption(metricFile);
        options.addOption(gradeFile);
    }

    public static void main(String args[])
    {
        DataExtractor de = new DataExtractor();
        CommandLineParser parser = new DefaultParser();
        try
        {
            CommandLine line = parser.parse(options, args);
            de.execute(line, options);
        }
        catch (ParseException exp)
        {
            System.err.println("Parsing failed. Reason: " + exp.getMessage());
        }
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

    public void execute(CommandLine line, Options options)
    {
        if (line.getOptions().length == 0 || line.hasOption('h'))
        {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("java -jar QMExtractor", options, true);
            System.exit(0);
        }
        if (line.hasOption('m'))
        {
            metricFile = Paths.get(line.getOptionValue('m'));
            validatePath(metricFile);
        }
        if (line.hasOption('r'))
        {
            resultFile = Paths.get(line.getOptionValue('r'));
            validatePath(resultFile);
        }
        if (line.hasOption('l'))
        {
            graphFile = Paths.get(line.getOptionValue('l'));
            validatePath(graphFile);
        }
        if (line.hasOption('g'))
        {
            gradeFile = Paths.get(line.getOptionValue('g'));
            validatePath(gradeFile);
        }

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
            loadGradeSchema(gradeFile.toRealPath().toString());
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
