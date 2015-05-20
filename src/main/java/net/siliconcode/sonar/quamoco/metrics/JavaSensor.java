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
import java.util.Iterator;

import net.siliconcode.sonar.quamoco.QuamocoConstants;
import net.siliconcode.sonar.quamoco.metrics.java.JavaNumFields;
import net.siliconcode.sonar.quamoco.metrics.java.JavaNumLocalVariables;
import net.siliconcode.sonar.quamoco.metrics.java.JavaNumMethod;
import net.siliconcode.sonar.quamoco.metrics.java.JavaNumStmts;
import net.siliconcode.sonar.quamoco.metrics.java.JavaNumTypesClasses;

import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.batch.fs.FilePredicates;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile.Type;
import org.sonar.api.resources.Project;
import org.sonar.java.JavaAstScanner;
import org.sonar.java.JavaConfiguration;
import org.sonar.squidbridge.AstScanner;

import com.google.common.collect.Iterables;
import com.sonar.sslr.api.Grammar;

/**
 * JavaSensor -
 *
 * @author isaac
 */
public class JavaSensor implements Sensor {

    private final FileSystem files;

    public JavaSensor(final FileSystem fs)
    {
        files = fs;
    }

    /*
     * (non-Javadoc)
     * @see org.sonar.api.batch.Sensor#analyse(org.sonar.api.resources.Project,
     * org.sonar.api.batch.SensorContext)
     */
    @Override
    public void analyse(final Project module, final SensorContext context)
    {
        final JavaNumFields nof = new JavaNumFields();
        final JavaNumLocalVariables nov = new JavaNumLocalVariables();
        final JavaNumMethod nom = new JavaNumMethod();
        final JavaNumStmts nos = new JavaNumStmts();
        final JavaNumTypesClasses noc = new JavaNumTypesClasses();

        final JavaConfiguration config = new JavaConfiguration(Charset.defaultCharset());
        final AstScanner<Grammar> scanner = JavaAstScanner.create(config, nof, noc, nos, nom);
        final FilePredicates predicates = files.predicates();
        final Iterable<File> iter = files.files(predicates.and(predicates.hasLanguage(QuamocoConstants.CSHARP_KEY),
                predicates.hasType(Type.MAIN)));
        final Iterator<File> it = iter.iterator();
        while (it.hasNext())
        {
            scanner.scanFile(it.next());
        }

        context.saveMeasure(nof.getTotalNOF());
        context.saveMeasure(noc.getTotalNOC());
        context.saveMeasure(nom.getTotalNOM());
        context.saveMeasure(nos.getTotalNOS());
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

}
