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
package net.siliconcode.quamoco.io;

import java.io.IOException;
import java.util.Properties;

import net.siliconcode.quamoco.aggregator.Grade;
import net.siliconcode.quamoco.aggregator.GradeThresholdException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * GradeSchemePropertiesReader -
 *
 * @author Isaac Griffith
 */
public class GradeSchemePropertiesReader {

    private static final Logger LOG = LoggerFactory.getLogger(GradeSchemePropertiesReader.class);

    public GradeSchemePropertiesReader()
    {

    }

    public void read()
    {
        final Properties prop = new Properties();
        try
        {
            prop.load(GradeSchemePropertiesReader.class.getResourceAsStream("grade-default.properties"));

            for (final Grade g : Grade.getGrades())
            {
                final double lower = Double.parseDouble(prop.getProperty(g.getName() + "_GRADE.lower"));
                final double upper = Double.parseDouble(prop.getProperty(g.getName() + "_GRADE.upper"));
                try
                {
                    g.setThresholds(lower, upper);
                }
                catch (final GradeThresholdException e)
                {
                    LOG.warn(e.getMessage(), e);
                }
            }
        }
        catch (final IOException e)
        {
            LOG.warn("A problem occurred while loading the grading scheme properities file.", e);
        }
    }
}