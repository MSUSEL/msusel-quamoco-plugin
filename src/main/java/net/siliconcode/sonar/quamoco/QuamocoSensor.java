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
import java.util.Set;

import org.antlr.v4.runtime.RecognitionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.InputFile.Type;
import org.sonar.api.internal.google.common.collect.Maps;
import org.sonar.api.resources.Project;

import com.google.common.collect.Sets;
import com.sparqline.quamoco.codetree.CodeTree;

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
        final Set<InputFile> files = Sets
                .newConcurrentHashSet(fs.inputFiles(fs.predicates().and(fs.predicates().hasLanguage(getLanguage()), fs.predicates().hasType(Type.MAIN))));

        Map<InputFile, String> fileVals = Maps.newConcurrentMap();
        
        files.parallelStream().forEach((file) -> {
            CodeTree tree = new CodeTree();
            tree.setProject(module.getKey());

            try {
                LOG.info("Parsing: " + file);

                utilizeParser(file.key(), file.absolutePath(), tree);

                final String treeJson = tree.toJSON();
                fileVals.put(file, treeJson);
            }
            catch (final RecognitionException e) {
                getLogger().warn(e.getMessage(), e);
            }
        });
        
        fileVals.forEach((file, json) -> {
            try {
                context.newMeasure()
                        .forMetric(metrics.getMetric(QuamocoConstants.PLUGIN_KEY + "." + QuamocoConstants.CODE_TREE))
                        .withValue(json)
                        .on(file)
                        .save();
                } catch (IllegalStateException e) {};
        });
    }

    /**
     * @return
     */
    protected Logger getLogger() {
        return QuamocoSensor.LOG;
    }

    protected abstract void utilizeParser(String key, String file, CodeTree tree);

    protected abstract String getLanguage();
}
