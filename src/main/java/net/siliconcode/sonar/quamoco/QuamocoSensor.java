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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.antlr.v4.runtime.RecognitionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.measures.Measure;
import org.sonar.api.resources.Project;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.siliconcode.quamoco.codetree.CodeTree;

/**
 * QuamocoSensor -
 *
 * @author Isaac Griffith
 *
 */
public abstract class QuamocoSensor implements Sensor {

    protected final FileSystem     fs;
    protected final QuamocoMetrics metrics;

    private static final Logger    LOG = LoggerFactory.getLogger(QuamocoSensor.class);

    public QuamocoSensor(final FileSystem fs, final QuamocoMetrics metrics) {
        this.fs = fs;
        this.metrics = metrics;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.sonar.api.batch.Sensor#analyse(org.sonar.api.resources.Project,
     * org.sonar.api.batch.SensorContext)
     */
    @Override
    public void analyse(final Project module, final SensorContext context) {
        final CodeTree tree = generateProjectTree();

        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        final String treeJson = gson.toJson(tree);

        final Measure<String> projMeasure = new Measure<String>(
                metrics.getMetric(QuamocoConstants.PLUGIN_KEY + "." + QuamocoConstants.CODE_TREE), treeJson);
        context.saveMeasure(projMeasure);
    }

    public CodeTree generateProjectTree() {
        final List<InputFile> files = Lists.newArrayList(fs.inputFiles(fs.predicates().hasLanguage(getLanguage())));
        final List<String> fileNames = Lists.newArrayList();

        files.forEach((file) -> {
            fileNames.add(file.absolutePath());
        });

        final CodeTree tree = new CodeTree();

        process(tree, fileNames);

        return tree;
    }

    public void process(final CodeTree tree, final List<String> fileNames) {
        try {
            final ExecutorService executor = Executors
                    .newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 4);
            final List<Future<?>> futures = new ArrayList<>();
            for (final String file : fileNames) {
                futures.add(executor.submit(() -> {
                    utilizeParser(file, tree);
                    ;
                }));
            }
            executor.shutdown();
            for (final Future<?> f : futures) {
                try {
                    f.get();
                }
                catch (InterruptedException | ExecutionException e) {
                    getLogger().warn(e.getMessage(), e);
                    continue;
                }
            }
        }
        catch (final RecognitionException e) {
            getLogger().warn(e.getMessage(), e);
        }
    }

    /**
     * @return
     */
    protected Logger getLogger() {
        return QuamocoSensor.LOG;
    }

    protected abstract void utilizeParser(String file, CodeTree tree);

    protected abstract String getLanguage();
}
