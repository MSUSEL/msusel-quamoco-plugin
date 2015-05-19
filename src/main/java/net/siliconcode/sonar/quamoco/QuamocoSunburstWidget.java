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

import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.Description;
import org.sonar.api.web.RubyRailsWidget;
import org.sonar.api.web.UserRole;
import org.sonar.api.web.WidgetProperties;
import org.sonar.api.web.WidgetProperty;
import org.sonar.api.web.WidgetPropertyType;

/**
 * QuamocoSunburstWidget -
 * 
 * @author Isaac Griffith
 * 
 */
@UserRole(UserRole.USER)
@Description("")
@WidgetProperties({
        @WidgetProperty(key = "chartTitle", type = WidgetPropertyType.STRING, defaultValue = "Quamoco Sunburst"),
        @WidgetProperty(key = "metric1", type = WidgetPropertyType.METRIC, defaultValue = "Quality"),
        @WidgetProperty(key = "metric2", type = WidgetPropertyType.METRIC, defaultValue = "Functional Suitability"),
        @WidgetProperty(key = "metric2.parent", type = WidgetPropertyType.STRING, defaultValue = "metric1"),
        @WidgetProperty(key = "metric3", type = WidgetPropertyType.METRIC, defaultValue = "Functional Completeness"),
        @WidgetProperty(key = "metric3.parent", type = WidgetPropertyType.STRING, defaultValue = "metric2"),
        @WidgetProperty(key = "metric4", type = WidgetPropertyType.METRIC, defaultValue = "Functional Correctness"),
        @WidgetProperty(key = "metric4.parent", type = WidgetPropertyType.STRING, defaultValue = "metric2"),
        @WidgetProperty(key = "metric5", type = WidgetPropertyType.METRIC, defaultValue = "Functional Appropriateness"),
        @WidgetProperty(key = "metric5.parent", type = WidgetPropertyType.STRING, defaultValue = "metric2"),
        @WidgetProperty(key = "metric6", type = WidgetPropertyType.METRIC, defaultValue = "Reliability"),
        @WidgetProperty(key = "metric6.parent", type = WidgetPropertyType.STRING, defaultValue = "metric1"),
        @WidgetProperty(key = "metric7", type = WidgetPropertyType.METRIC, defaultValue = "Maturity"),
        @WidgetProperty(key = "metric7.parent", type = WidgetPropertyType.STRING, defaultValue = "metric6"),
        @WidgetProperty(key = "metric8", type = WidgetPropertyType.METRIC, defaultValue = "Availability"),
        @WidgetProperty(key = "metric8.parent", type = WidgetPropertyType.STRING, defaultValue = "metric6"),
        @WidgetProperty(key = "metric9", type = WidgetPropertyType.METRIC, defaultValue = "Fault Tolerance"),
        @WidgetProperty(key = "metric9.parent", type = WidgetPropertyType.STRING, defaultValue = "metric6"),
        @WidgetProperty(key = "metric10", type = WidgetPropertyType.METRIC, defaultValue = "Recoverability"),
        @WidgetProperty(key = "metric10.parent", type = WidgetPropertyType.STRING, defaultValue = "metric6"),
        @WidgetProperty(key = "metric11", type = WidgetPropertyType.METRIC, defaultValue = "Performance Efficiency"),
        @WidgetProperty(key = "metric11.parent", type = WidgetPropertyType.STRING, defaultValue = "metric1"),
        @WidgetProperty(key = "metric12", type = WidgetPropertyType.METRIC, defaultValue = "Time Behavior"),
        @WidgetProperty(key = "metric12.parent", type = WidgetPropertyType.STRING, defaultValue = "metric11"),
        @WidgetProperty(key = "metric13", type = WidgetPropertyType.METRIC, defaultValue = "Resource Utilization"),
        @WidgetProperty(key = "metric13.parent", type = WidgetPropertyType.STRING, defaultValue = "metric11"),
        @WidgetProperty(key = "metric14", type = WidgetPropertyType.METRIC, defaultValue = "Capacity"),
        @WidgetProperty(key = "metric14.parent", type = WidgetPropertyType.STRING, defaultValue = "metric11"),
        @WidgetProperty(key = "metric15", type = WidgetPropertyType.METRIC, defaultValue = "Usability"),
        @WidgetProperty(key = "metric15.parent", type = WidgetPropertyType.STRING, defaultValue = "metric1"),
        @WidgetProperty(key = "metric16", type = WidgetPropertyType.METRIC, defaultValue = "Appropriateness Recognizability"),
        @WidgetProperty(key = "metric16.parent", type = WidgetPropertyType.STRING, defaultValue = "metric15"),
        @WidgetProperty(key = "metric17", type = WidgetPropertyType.METRIC, defaultValue = "Learnability"),
        @WidgetProperty(key = "metric17.parent", type = WidgetPropertyType.STRING, defaultValue = "metric15"),
        @WidgetProperty(key = "metric18", type = WidgetPropertyType.METRIC, defaultValue = "Operability"),
        @WidgetProperty(key = "metric18arent", type = WidgetPropertyType.METRIC, defaultValue = "metric15"),
        @WidgetProperty(key = "metric19", type = WidgetPropertyType.METRIC, defaultValue = "User Error Protection"),
        @WidgetProperty(key = "metric19.parent", type = WidgetPropertyType.STRING, defaultValue = "metric15"),
        @WidgetProperty(key = "metric20", type = WidgetPropertyType.METRIC, defaultValue = "User Interface Aesthetics"),
        @WidgetProperty(key = "metric20.parent", type = WidgetPropertyType.STRING, defaultValue = "metric15"),
        @WidgetProperty(key = "metric21", type = WidgetPropertyType.METRIC, defaultValue = "Accessibility"),
        @WidgetProperty(key = "metric21.parent", type = WidgetPropertyType.STRING, defaultValue = "metric15"),
        @WidgetProperty(key = "metric22", type = WidgetPropertyType.METRIC, defaultValue = "Maintainability"),
        @WidgetProperty(key = "metric22.parent", type = WidgetPropertyType.STRING, defaultValue = "metric1"),
        @WidgetProperty(key = "metric23", type = WidgetPropertyType.METRIC, defaultValue = "Modularity"),
        @WidgetProperty(key = "metric23.parent", type = WidgetPropertyType.STRING, defaultValue = "metric22"),
        @WidgetProperty(key = "metric24", type = WidgetPropertyType.METRIC, defaultValue = "Reusability"),
        @WidgetProperty(key = "metric24.parent", type = WidgetPropertyType.STRING, defaultValue = "metric22"),
        @WidgetProperty(key = "metric25", type = WidgetPropertyType.METRIC, defaultValue = "Analyzability"),
        @WidgetProperty(key = "metric25.parent", type = WidgetPropertyType.STRING, defaultValue = "metric22"),
        @WidgetProperty(key = "metric26", type = WidgetPropertyType.METRIC, defaultValue = "Modifiability"),
        @WidgetProperty(key = "metric26.parent", type = WidgetPropertyType.STRING, defaultValue = "metric22"),
        @WidgetProperty(key = "metric27", type = WidgetPropertyType.METRIC, defaultValue = "Testability"),
        @WidgetProperty(key = "metric27.parent", type = WidgetPropertyType.STRING, defaultValue = "metric22"),
        @WidgetProperty(key = "metric28", type = WidgetPropertyType.METRIC, defaultValue = "Security"),
        @WidgetProperty(key = "metric28.parent", type = WidgetPropertyType.STRING, defaultValue = "metric1"),
        @WidgetProperty(key = "metric29", type = WidgetPropertyType.METRIC, defaultValue = "Confidentiality"),
        @WidgetProperty(key = "metric29.parent", type = WidgetPropertyType.STRING, defaultValue = "metric28"),
        @WidgetProperty(key = "metric30", type = WidgetPropertyType.METRIC, defaultValue = "Integrity"),
        @WidgetProperty(key = "metric30.parent", type = WidgetPropertyType.STRING, defaultValue = "metric28"),
        @WidgetProperty(key = "metric31", type = WidgetPropertyType.METRIC, defaultValue = "Non-repudiation"),
        @WidgetProperty(key = "metric31.parent", type = WidgetPropertyType.STRING, defaultValue = "metric28"),
        @WidgetProperty(key = "metric32", type = WidgetPropertyType.METRIC, defaultValue = "Accountability"),
        @WidgetProperty(key = "metric32.parent", type = WidgetPropertyType.STRING, defaultValue = "metric28"),
        @WidgetProperty(key = "metric33", type = WidgetPropertyType.METRIC, defaultValue = "Authenticity"),
        @WidgetProperty(key = "metric33.parent", type = WidgetPropertyType.STRING, defaultValue = "metric28"),
        @WidgetProperty(key = "metric34", type = WidgetPropertyType.METRIC, defaultValue = "Compatibility"),
        @WidgetProperty(key = "metric34.parent", type = WidgetPropertyType.STRING, defaultValue = "metric1"),
        @WidgetProperty(key = "metric35", type = WidgetPropertyType.METRIC, defaultValue = "Co-exitence"),
        @WidgetProperty(key = "metric35.parent", type = WidgetPropertyType.STRING, defaultValue = "metric34"),
        @WidgetProperty(key = "metric36", type = WidgetPropertyType.METRIC, defaultValue = "Interoperability"),
        @WidgetProperty(key = "metric36.parent", type = WidgetPropertyType.STRING, defaultValue = "metric34"),
        @WidgetProperty(key = "metric37", type = WidgetPropertyType.METRIC, defaultValue = "Portability"),
        @WidgetProperty(key = "metric37.parent", type = WidgetPropertyType.STRING, defaultValue = "metric1"),
        @WidgetProperty(key = "metric38", type = WidgetPropertyType.METRIC, defaultValue = "Adaptability"),
        @WidgetProperty(key = "metric38.parent", type = WidgetPropertyType.STRING, defaultValue = "metric37"),
        @WidgetProperty(key = "metric39", type = WidgetPropertyType.METRIC, defaultValue = "Installability"),
        @WidgetProperty(key = "metric39.parent", type = WidgetPropertyType.STRING, defaultValue = "metric37"),
        @WidgetProperty(key = "metric40", type = WidgetPropertyType.METRIC, defaultValue = "Replaceability"),
        @WidgetProperty(key = "metric40.parent", type = WidgetPropertyType.STRING, defaultValue = "metric37"), })
public class QuamocoSunburstWidget extends AbstractRubyTemplate implements RubyRailsWidget {

    private static final String ID            = "quamoco_sunburst_widget";
    private static final String TITLE         = "Sonar Quamoco Sunburst";
    private static final String TEMPLATE_PATH = "/net/siliconcode/sonar/quamoco/quamoco_sunburst.html.erb";

    /*
     * (non-Javadoc)
     * @see org.sonar.api.web.View#getId()
     */
    public String getId()
    {
        return ID;
    }

    /*
     * (non-Javadoc)
     * @see org.sonar.api.web.View#getTitle()
     */
    public String getTitle()
    {
        return TITLE;
    }

    /*
     * (non-Javadoc)
     * @see org.sonar.api.web.AbstractRubyTemplate#getTemplatePath()
     */
    @Override
    protected String getTemplatePath()
    {
        return TEMPLATE_PATH;
    }

}
