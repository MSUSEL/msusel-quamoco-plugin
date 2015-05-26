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
package net.siliconcode.sonar.quamoco.metrics;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;

import net.siliconcode.sonar.quamoco.QuamocoConstants;
import net.siliconcode.sonar.quamoco.metrics.java.JavaMemberExtractor;

import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.batch.fs.FilePredicates;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.InputFile.Type;
import org.sonar.api.config.Settings;
import org.sonar.api.resources.Project;
import org.sonar.java.JavaAstScanner;
import org.sonar.java.JavaConfiguration;
import org.sonar.java.ast.AstScanner;
import org.sonar.plugins.java.Java;
import org.sonar.plugins.java.api.JavaResourceLocator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * JavaSensor -
 *
 * @author Isaac Griffith
 */
public class JavaSensor implements Sensor {

    private final FileSystem    files;
    private JavaResourceLocator javaResourceLocator;
    private Settings            settings;

    public JavaSensor(JavaResourceLocator javaResourceLocator, final FileSystem fs, Settings settings)
    {
        files = fs;
        this.javaResourceLocator = javaResourceLocator;
        this.settings = settings;
    }

    /*
     * (non-Javadoc)
     * @see org.sonar.api.batch.Sensor#analyse(org.sonar.api.resources.Project,
     * org.sonar.api.batch.SensorContext)
     */
    @SuppressWarnings("unchecked")
    @Override
    public void analyse(final Project module, final SensorContext context)
    {
        Charset charset = files.encoding();
        JavaConfiguration conf = new JavaConfiguration(charset);
        final JavaMemberExtractor extractor = new JavaMemberExtractor();
        AstScanner scanner = JavaAstScanner.create(conf);
        scanner.withSquidAstVisitor(extractor);
        scanner.scan(getSourceFiles());

        // context.saveMeasure(nof.getTotalNOF());
        // context.saveMeasure(noc.getTotalNOC());
        // context.saveMeasure(nom.getTotalNOM());
        // context.saveMeasure(nos.getTotalNOS());
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.api.batch.CheckProject#shouldExecuteOnProject(org.sonar.api
     * .resources.Project)
     */
    @Override
    public boolean shouldExecuteOnProject(final Project project)
    {
        final FilePredicates predicates = files.predicates();
        final Iterable<File> mainFiles = files.files(predicates.and(predicates.hasLanguage(QuamocoConstants.JAVA_KEY),
                predicates.hasType(Type.MAIN)));
        return !Iterables.isEmpty(mainFiles);
    }

    private Iterable<File> getSourceFiles()
    {
        return toFile(files.inputFiles(files.predicates().and(files.predicates().hasLanguage(Java.KEY),
                files.predicates().hasType(InputFile.Type.MAIN))));
    }

    private Iterable<File> getTestFiles()
    {
        return toFile(files.inputFiles(files.predicates().and(files.predicates().hasLanguage(Java.KEY),
                files.predicates().hasType(InputFile.Type.TEST))));
    }

    private Iterable<File> toFile(Iterable<InputFile> inputFiles)
    {
        List<File> files = Lists.newArrayList();
        for (InputFile inputFile : inputFiles)
        {
            files.add(inputFile.file());
        }
        return files;
    }

}
