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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.ServerExtension;
import org.sonar.api.config.Settings;

/**
 * QuamocoSettings -
 *
 * @author Isaac Griffith
 */
public class QSettings implements ServerExtension {

    private static final Logger LOG = LoggerFactory.getLogger(QSettings.class);
    private final Settings      settings;

    private final String        conQATLocation;
    private final String        qmFileLocation;
    private final String        metricFileLocation;

    /**
     * Constructor
     *
     * @param settings
     */
    @Properties({
        @Property(key = QuamocoConstants.CONQAT_LOCATION, name = "ConQAT home", description = "ConQAT Executable Directory Location.", project = true, global = true),
        @Property(key = QuamocoConstants.QUAMOCO_QM_FILE_DIR, name = "QM File Home", description = "Absolute or relative path to the location of quamoco *.qm files.", project = true, global = true),
        @Property(key = QuamocoConstants.QUAMOCO_METRIC_PROP_DIR, name = "Metric Properities Home", description = "Absolute or relative path to the location of metric properties files.", project = true, global = true) })
    public QSettings(final Settings settings)
    {
        this.settings = settings;
        conQATLocation = settings.getString(QuamocoConstants.CONQAT_LOCATION);
        qmFileLocation = settings.getString(QuamocoConstants.QUAMOCO_QM_FILE_DIR);
        metricFileLocation = settings.getString(QuamocoConstants.QUAMOCO_METRIC_PROP_DIR);
    }
}
