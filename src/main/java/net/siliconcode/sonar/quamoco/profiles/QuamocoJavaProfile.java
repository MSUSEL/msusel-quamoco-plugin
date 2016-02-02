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
package net.siliconcode.sonar.quamoco.profiles;

import java.io.InputStreamReader;
import java.io.Reader;

import org.sonar.api.profiles.ProfileDefinition;
import org.sonar.api.profiles.RulesProfile;
import org.sonar.api.utils.ValidationMessages;

/**
 * QuamocoProfile -
 * 
 * @author Isaac Griffith
 */
public class QuamocoJavaProfile extends ProfileDefinition {

    private static final String          PROFILE_NAME = "Quamoco";
    private final QuamocoProfileImporter importer;

    public QuamocoJavaProfile(QuamocoProfileImporter importer)
    {
        this.importer = importer;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.sonar.api.profiles.ProfileDefinition#createProfile(org.sonar.api.
     * utils.ValidationMessages)
     */
    @Override
    public RulesProfile createProfile(ValidationMessages messages)
    {
        Reader quamocoProfile = new InputStreamReader(this.getClass()
                .getResourceAsStream("/net/siliconcode/sonar/quamoco/profiles/quamoco-java-profile.xml"));
        RulesProfile profile = importer.importProfile(quamocoProfile, messages);
        profile.setLanguage("java");
        profile.setName(PROFILE_NAME);
        return profile;
    }
}
