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
package net.siliconcode.sonar.quamoco;

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
import com.sparqline.metrics.MetricsAggregator;
import com.sparqline.metrics.aggregators.ClassMetricsAggregator;
import com.sparqline.metrics.aggregators.FileMetricsAggregator;
import com.sparqline.metrics.aggregators.MethodMetricsAggregator;
import com.sparqline.metrics.aggregators.SystemMetricsAggregator;
import com.sparqline.quamoco.codetree.CodeNode;
import com.sparqline.quamoco.codetree.CodeTree;
import com.sparqline.quamoco.codetree.FileNode;
import com.sparqline.quamoco.codetree.ProjectNode;

import net.siliconcode.sonar.quamoco.metrics.QuamocoMetricsControllerFactory;

/**
 * QuamocoSensor -
 *
 * @author Isaac Griffith
 */
public abstract class QuamocoSensor implements Sensor {

    protected final QuamocoMetrics metrics;

    private static final Logger LOG = LoggerFactory.getLogger(QuamocoSensor.class);

    public QuamocoSensor(final QuamocoMetrics metrics)
    {
        this.metrics = metrics;
    }

    @Override
    public void describe(SensorDescriptor descriptor)
    {
        descriptor.onlyOnFileType(InputFile.Type.MAIN);
        descriptor.onlyOnLanguage(getLanguage());
    }

    /*
     * (non-Javadoc)
     * @see org.sonar.api.batch.Sensor#analyse(org.sonar.api.resources.Project,
     * org.sonar.api.batch.SensorContext)
     */
    @Override
    public void execute(final SensorContext context)
    {
        FileSystem fs = context.fileSystem();
        InputModule module = context.module();

        ProjectNode root = new ProjectNode(module.key());
        CodeTree tree = new CodeTree();
        tree.setProject(root);

        final Set<InputFile> files = Sets.newConcurrentHashSet(fs.inputFiles(
                fs.predicates().and(fs.predicates().hasLanguage(getLanguage()), fs.predicates().hasType(Type.MAIN))));
        parseStructure(files, root);
        collectMeasures(tree);
        aggregateMeasures(tree);
        Map<InputFile, String> fileVals = extractFileJson(files, tree);
        saveMeasures(context, fileVals);
    }

    /**
     * @param files
     * @param root
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
     * @param context
     * @param fileVals
     */
    private void saveMeasures(final SensorContext context, Map<InputFile, String> fileVals)
    {
        fileVals.forEach((file, json) -> {
            try
            {
                context.newMeasure()
                        .forMetric(metrics.getMetric(QuamocoConstants.PLUGIN_KEY + "." + QuamocoConstants.CODE_TREE))
                        .withValue(json).on(file).save();
            }
            catch (IllegalStateException e)
            {
            }
        });
    }

    /**
     * @param tree
     */
    private Map<InputFile, String> extractFileJson(Set<InputFile> files, CodeTree tree)
    {
        LOG.info("Extracting File JSON data");
        Map<InputFile, String> fileVals = Maps.newConcurrentMap();

        files.forEach((file) -> {
            FileNode fn = tree.findFile(file.key());
            tree.extractTree(fn);
            fileVals.put(file, tree.toJSON());
        });

        return fileVals;
    }

    /**
     * @param tree
     */
    private void collectMeasures(CodeTree tree)
    {
        LOG.info("Collecting Quamoco Base Measures");

        Queue<CodeNode> nodes = Queues.newConcurrentLinkedQueue();
        nodes.addAll(tree.getMethods());
        nodes.addAll(tree.getTypes());
        nodes.addAll(tree.getFiles());
        nodes.addAll(tree.getProjects());

        nodes.parallelStream().forEach((node) -> {
            QuamocoMetricsControllerFactory.getController(node).measure(node, tree);
        });
    }

    private void aggregateMeasures(CodeTree tree)
    {
        LOG.info("Aggregating Quamoco Base Measures");

        MetricsAggregator ma = new MethodMetricsAggregator();
        ma.addExcludedMetric("LOC");
        ma.aggregate(tree);

        ma = new ClassMetricsAggregator();
        ma.addExcludedMetric("LOC");
        ma.aggregate(tree);

        ma = new FileMetricsAggregator();
        ma.addExcludedMetric("LOC");
        ma.aggregate(tree);

        ma = new SystemMetricsAggregator();
        ma.aggregate(tree);
    }

    /**
     * @return
     */
    protected Logger getLogger()
    {
        return QuamocoSensor.LOG;
    }

    protected abstract void utilizeParser(String key, String file, ProjectNode tree);

    protected abstract String getLanguage();
}
