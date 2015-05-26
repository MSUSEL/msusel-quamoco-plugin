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
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import net.siliconcode.parser.CSharp4Lexer;
import net.siliconcode.parser.CSharp4Parser;
import net.siliconcode.parser.CSharp4Parser.Compilation_unitContext;
import net.siliconcode.parser.QuamocoListener;
import net.siliconcode.sonar.quamoco.QuamocoConstants;
import net.siliconcode.sonar.quamoco.code.MetricContext;
import net.siliconcode.sonar.quamoco.metrics.csharp.CSharpLOC;
import net.siliconcode.sonar.quamoco.metrics.csharp.CSharpNumClasses;
import net.siliconcode.sonar.quamoco.metrics.csharp.CSharpNumFields;
import net.siliconcode.sonar.quamoco.metrics.csharp.CSharpNumMethod;
import net.siliconcode.sonar.quamoco.metrics.csharp.CSharpNumStmts;
import net.siliconcode.sonar.quamoco.metrics.csharp.CSharpNumTypes;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.batch.fs.FilePredicates;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile.Type;
import org.sonar.api.component.ResourcePerspectives;
import org.sonar.api.resources.Project;
import org.sonar.api.utils.TimeProfiler;

import com.google.common.collect.Iterables;

/**
 * CSharpSensor -
 *
 * @author Isaac Griffith
 */
public class CSharpSensor implements Sensor {

    private final FileSystem    files;
    private static final Logger LOG = LoggerFactory.getLogger(CSharpSensor.class);

    public CSharpSensor(final FileSystem fs)
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
        TimeProfiler profiler = new TimeProfiler(LOG);
        profiler.start("Sensor - Quamoco CSharp");

        MetricContext metctx = new MetricContext();
        final FilePredicates predicates = files.predicates();
        final Iterable<File> iter = files.files(predicates.and(predicates.hasLanguage(QuamocoConstants.CSHARP_KEY),
                predicates.hasType(Type.MAIN)));
        final Iterator<File> it = iter.iterator();

        while (it.hasNext())
        {
            File f = it.next();
            if (f.getName().endsWith(".cs"))
            {
                try
                {
                    CSharp4Parser parser = loadFile(f.getAbsolutePath());
                    Compilation_unitContext cuctx = parser.compilation_unit();
                    ParseTreeWalker walker = new ParseTreeWalker();
                    QuamocoListener listener = new QuamocoListener();
                    walker.walk(listener, cuctx);

                    Path p = Paths.get(f.getAbsolutePath());
                    p = p.relativize(Paths.get(files.baseDir().getAbsolutePath()));
                    metctx.addCodeTree(org.sonar.api.resources.File.create(p.toString()), listener.getTree());
                }
                catch (RecognitionException | IOException e)
                {
                    LOG.warn(e.getMessage());
                }
            }
        }

        context.saveMeasure(CSharpNumTypes.getTotalNOT(metctx));
        context.saveMeasure(CSharpLOC.getTotalLOC(metctx));
        context.saveMeasure(CSharpNumFields.getTotalNOF(metctx));
        context.saveMeasure(CSharpNumClasses.getTotalNOC(metctx));
        context.saveMeasure(CSharpNumMethod.getTotalNOM(metctx));
        context.saveMeasure(CSharpNumStmts.getTotalNOS(metctx));

        profiler.stop();
    }

    private CSharp4Parser loadFile(final String file) throws IOException
    {
        CSharp4Lexer lexer = new CSharp4Lexer(new ANTLRFileStream(file));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSharp4Parser parser = new CSharp4Parser(tokens);
        return parser;
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
        final Iterable<File> mainFiles = files.files(predicates.and(
                predicates.hasLanguage(QuamocoConstants.CSHARP_KEY), predicates.hasType(Type.MAIN)));
        return !Iterables.isEmpty(mainFiles);
    }
}
