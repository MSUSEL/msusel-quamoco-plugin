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
 * QuamocoBulletsWidget -
 *
 * @author Isaac Griffith
 */
@UserRole(UserRole.USER)
@Description("")
@WidgetProperties({ @WidgetProperty(key = "chartTitle", type = WidgetPropertyType.STRING) })
public class QuamocoBulletsWidget extends AbstractRubyTemplate implements RubyRailsWidget {

    private static final String ID            = "quamoco_bullets_widget";
    private static final String TITLE         = "Sonar Quamoco Bullet Charts";
    private static final String TEMPLATE_PATH = "/net/siliconcode/sonar/quamoco/quamoco_bullets.html.erb";

    /*
     * (non-Javadoc)
     * @see org.sonar.api.web.View#getId()
     */
    @Override
    public String getId()
    {
        return ID;
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

    /*
     * (non-Javadoc)
     * @see org.sonar.api.web.View#getTitle()
     */
    @Override
    public String getTitle()
    {
        return TITLE;
    }

}
