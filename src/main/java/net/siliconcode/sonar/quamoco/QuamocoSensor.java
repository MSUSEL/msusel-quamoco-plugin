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

import java.io.File;
import java.io.Serializable;

import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.batch.fs.FilePredicates;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile.Type;
import org.sonar.api.measures.Measure;
import org.sonar.api.resources.Project;

import com.google.common.collect.Iterables;

/**
 * QuamocoSensor -
 * 
 * @author Isaac Griffiths
 */
public class QuamocoSensor implements Sensor {

    private FileSystem files;

    public QuamocoSensor(FileSystem fs)
    {
        this.files = fs;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.api.batch.CheckProject#shouldExecuteOnProject(org.sonar.api
     * .resources.Project)
     */
    public boolean shouldExecuteOnProject(Project project)
    {
        FilePredicates predicates = files.predicates();
        Iterable<File> mainFiles = files.files(predicates.and(
                predicates.or(predicates.hasLanguage(QuamocoConstants.JAVA_KEY),
                        predicates.hasLanguage(QuamocoConstants.CSHARP_KEY)), predicates.hasType(Type.MAIN)));
        return !Iterables.isEmpty(mainFiles);
    }

    /*
     * (non-Javadoc)
     * @see org.sonar.api.batch.Sensor#analyse(org.sonar.api.resources.Project,
     * org.sonar.api.batch.SensorContext)
     */
    public void analyse(Project module, SensorContext context)
    {
        QuamocoRunner runner = new QuamocoRunner();
        QuamocoMeasureExtractor extractor = new QuamocoMeasureExtractor();
        
        Measure portability = new Measure<Serializable>(QuamocoMetrics.PORTABILITY, extractor.getValue("Portability"));
        Measure 
    }
}
