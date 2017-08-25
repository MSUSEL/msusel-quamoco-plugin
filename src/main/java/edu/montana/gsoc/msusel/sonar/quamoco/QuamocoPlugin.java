/**
 * The MIT License (MIT)
 *
 * MSUSEL Sonar Quamoco Plugin
 * Copyright (c) 2015-2017 Montana State University, Gianforte School of Computing,
 * Software Engineering Laboratory
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
package edu.montana.gsoc.msusel.sonar.quamoco;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import org.sonar.api.Plugin;

import edu.montana.gsoc.msusel.sonar.quamoco.profiles.QuamocoJavaProfile;
import edu.montana.gsoc.msusel.sonar.quamoco.profiles.QuamocoProfileImporter;
import edu.montana.gsoc.msusel.sonar.quamoco.sensor.QuamocoCSharpSensor;
import edu.montana.gsoc.msusel.sonar.quamoco.sensor.QuamocoJavaSensor;

/**
 * SonarQube analysis Plugin metadata class. This class identifies the plugin
 * extension components and defines the context in which this plugin is
 * applicable.
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class QuamocoPlugin implements Plugin {

    /**
     * @return List of extension classes defined in this plugin
     */
    @SuppressWarnings("unchecked")
    public List getExtensions()
    {
        List extensions = new ArrayList();
        extensions.addAll(asList(QuamocoMetrics.class, QuamocoMeasureComputer.class, QuamocoProfileImporter.class,
                QuamocoJavaProfile.class, QuamocoJavaSensor.class, QuamocoCSharpSensor.class));

        return extensions;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void define(Context context)
    {
        context.addExtensions(getExtensions());
    }
}
