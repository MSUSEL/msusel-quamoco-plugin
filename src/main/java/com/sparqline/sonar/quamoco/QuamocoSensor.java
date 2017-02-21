/**
 * The MIT License (MIT)
 *
 * SparQLine Analytics Quamoco Plugin
 * Copyright (c) 2015-2017 Isaac Griffith, SparQLine Analytics, LLC
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
package com.sparqline.sonar.quamoco;

import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.antlr.v4.runtime.RecognitionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.InputFile.Type;
import org.sonar.api.batch.fs.InputModule;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.internal.google.common.collect.Maps;

import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.sparqline.codetree.CodeTree;
import com.sparqline.codetree.INode;
import com.sparqline.codetree.node.FileNode;
import com.sparqline.codetree.node.ProjectNode;
import com.sparqline.sonar.quamoco.metrics.QuamocoMetricsControllerFactory;

/**
 * Superclass for language based metrics and code tree extraction sensors. This
 * class is to be executed as part of a SonarQube Scanner process.
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
public abstract class QuamocoSensor implements Sensor {

    /**
     * Metrics definition class
     */
    protected final QuamocoMetrics metrics;
    /**
     * The Logger used for this class.
     */
    private static final Logger    LOG = LoggerFactory.getLogger(QuamocoSensor.class);

    /**
     * @param metrics
     */
    public QuamocoSensor(final QuamocoMetrics metrics)
    {
        this.metrics = metrics;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void describe(SensorDescriptor descriptor)
    {
        descriptor.onlyOnFileType(InputFile.Type.MAIN);
        descriptor.onlyOnLanguage(getLanguage());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void execute(final SensorContext context)
    {
        FileSystem fs = context.fileSystem();
        InputModule module = context.module();

        ProjectNode root = new ProjectNode(module.key());
        CodeTree tree = new CodeTree();
        tree.setProject(root);

        final Set<InputFile> files = Sets.newConcurrentHashSet(
                fs.inputFiles(
                        fs.predicates().and(
                                fs.predicates().hasLanguage(getLanguage()), fs.predicates().hasType(Type.MAIN))));
        parseStructure(files, root);
        collectMeasures(tree);
        // aggregateMeasures(tree);
        Map<InputFile, String> fileVals = extractFileJson(files, tree);
        saveMeasures(context, fileVals);
    }

    /**
     * Parses the code structure from the provided set of input files, adding
     * this structure to the root project provided.
     * 
     * @param files
     *            Set of input files to be parsed
     * @param root
     *            Project at the root of the code tree
     */
    private void parseStructure(final Set<InputFile> files, ProjectNode root)
    {
        files.parallelStream().forEach((file) -> {
            try
            {
                LOG.info("Parsing: " + file.absolutePath());

                utilizeParser(file.key(), file.absolutePath(), root);
            }
            catch (final RecognitionException e)
            {
                getLogger().warn(e.getMessage(), e);
            }
        });
    }

    /**
     * Saves the extracted code tress for each input file (as provided by the
     * map) into a measure via the provided SensorContext.
     * 
     * @param context
     *            SensorContext which provides a means to save measures to the
     *            SonarQube Db
     * @param fileVals
     *            Map of InputFiles to JSON extracted for that file from the
     *            CodeTree
     */
    private void saveMeasures(final SensorContext context, Map<InputFile, String> fileVals)
    {
        fileVals.forEach((file, json) -> {
            try
            {
                context
                        .newMeasure()
                        .forMetric(metrics.getMetric(QuamocoConstants.PLUGIN_KEY + "." + QuamocoConstants.CODE_TREE))
                        .withValue(json)
                        .on(file)
                        .save();
            }
            catch (IllegalStateException e)
            {
            }
        });
    }

    /**
     * Extracts the JSON data for each file, from the input set of files,
     * representing the slice of the code tree from the root down to that
     * particular file (and its children).
     * 
     * @param tree
     *            Tree to be sliced at each file provided
     * @return A map relating the input files provided to the JSON data
     *         extracted from the code tree
     */
    private Map<InputFile, String> extractFileJson(Set<InputFile> files, CodeTree tree)
    {
        LOG.info("Extracting File JSON data");
        Map<InputFile, String> fileVals = Maps.newConcurrentMap();

        files.forEach((file) -> {
            LOG.info("file: " + file.key());
            FileNode fn = tree.getUtils().findFile(file.key());
            tree.getUtils().extractTree(fn);
            fileVals.put(file, tree.toJSON());
        });

        return fileVals;
    }

    /**
     * For each item in the code tree, this method executes and collects the
     * metrics associated with that item.
     * 
     * @param tree
     *            Tree in which the contained nodes need their metrics
     *            calculated.
     */
    private void collectMeasures(CodeTree tree)
    {
        LOG.info("Collecting Quamoco Base Measures");

        Queue<INode> nodes = Queues.newConcurrentLinkedQueue();
        nodes.addAll(tree.getUtils().getMethods());
        nodes.addAll(tree.getUtils().getTypes());
        nodes.addAll(tree.getUtils().getFiles());
        nodes.addAll(tree.getUtils().getProjects());

        nodes.parallelStream().forEach((node) -> {
            QuamocoMetricsControllerFactory.getController(node).measure(node, tree);
        });
    }

    /**
     * @return The logger associated with this Class
     */
    protected static Logger getLogger()
    {
        return QuamocoSensor.LOG;
    }

    /**
     * Instructs the Sensor to construct a file node with the provided key at
     * the provided location and then parse this file and update the provided
     * ProjectNode
     * 
     * @param key
     *            Key identifier for the file to be parsed
     * @param file
     *            Absolute path of the file to be parsed
     * @param project
     *            ProjectNode to which the generated FileNode will be added.
     */
    protected abstract void utilizeParser(String key, String file, ProjectNode project);

    /**
     * @return The language key, as defined by SonarQube, on which a subclass of
     *         this class is defined to execute on.
     */
    protected abstract String getLanguage();
}
