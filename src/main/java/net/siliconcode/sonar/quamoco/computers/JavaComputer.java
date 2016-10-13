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
package net.siliconcode.sonar.quamoco.computers;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;
import com.sparqline.quamoco.distiller.Measure;
import com.sparqline.quamoco.io.MetricPropertiesReader;

import net.siliconcode.sonar.quamoco.QuamocoConstants;
import net.siliconcode.sonar.quamoco.QuamocoMeasureComputer;
import net.siliconcode.sonar.quamoco.detectors.JavaQuamocoDetector;
import net.siliconcode.sonar.quamoco.detectors.QuamocoDetector;

/**
 * JavaDecorator -
 *
 * @author Isaac Griffith
 */
public class JavaComputer extends QuamocoMeasureComputer {

    /**
     * 
     */
    public JavaComputer() {
        super();
    }

    private static final Logger LOG  = LoggerFactory.getLogger(JavaComputer.class);
    private static final String LANG = "java";
    private static final String EXT  = ".java";

    /*
     * (non-Javadoc)
     * 
     * @see net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate#
     * executeQuamocoDetector()
     */
    @Override
    public void executeQuamocoDetector() {
        final QuamocoDetector qd = new JavaQuamocoDetector(graph, metricsContext, projectID);
        qd.execute();
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate#
     * getExtension()
     */
    @Override
    protected String getExtension() {
        return JavaComputer.EXT;
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate#
     * getRepoNames()
     */
    @Override
    protected List<String> getRepoNames() {
        final List<String> list = Lists.newArrayList();
        list.add("findbugs");
        list.add("fb-contrib");
        list.add("pmd");
        return list;
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.siliconcode.sonar.quamoco.decorator.AbstractDecoratorTemplate#
     * getLanguage()
     */
    @Override
    protected String getLanguage() {
        return JavaComputer.LANG;
    }

    /*
     * (non-Javadoc)
     * 
     * @see net.siliconcode.sonar.quamoco.QuamocoMeasureComputer#getOutputMetrics()
     */
    @Override
    protected List<String> getOutputMetrics() {
        List<String> ret = Lists.newLinkedList();
        final String[] map = MetricPropertiesReader.read();
        for (final String key : map) {
            ret.add(QuamocoConstants.PLUGIN_KEY + "." + key.toUpperCase().replaceAll(" ", "_"));
            ret.add(QuamocoConstants.PLUGIN_KEY + "." + key.toUpperCase().replaceAll(" ", "_") + ".GRADE");
        }

        return ret;
    }
}
