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
package edu.montana.gsoc.msusel.sonar.quamoco.profiles;

import java.io.InputStreamReader;
import java.io.Reader;

import org.sonar.api.profiles.ProfileDefinition;
import org.sonar.api.profiles.RulesProfile;
import org.sonar.api.utils.ValidationMessages;

/**
 * Class used to import C# Quamoco rule profile for SonarQube.
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
public class QuamocoCSharpProfile extends ProfileDefinition {

    /**
     * Constant profile name
     */
    private static final String          PROFILE_NAME = "Quamoco";
    /**
     * Constant profile language
     */
    private static final String          PROFILE_LANG = "cs";
    /**
     * Profile importer
     */
    private final QuamocoProfileImporter importer;

    /**
     * Constructs a new QuamocoCSharpProfile object which uses the provided
     * ProfileImporter
     * 
     * @param importer
     *            Importer used to extract the contents of the profile document.
     */
    public QuamocoCSharpProfile(final QuamocoProfileImporter importer)
    {
        this.importer = importer;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RulesProfile createProfile(final ValidationMessages messages)
    {
        if (importer != null)
        {
            final Reader reader = new InputStreamReader(this.getClass()
                    .getResourceAsStream("/com/sparqline/sonar/quamoco/profiles/quamoco-cs-profile.xml"));
            final RulesProfile profile = importer.importProfile(reader, messages);
            profile.setLanguage(QuamocoCSharpProfile.PROFILE_LANG);
            profile.setName(QuamocoCSharpProfile.PROFILE_NAME);
            return profile;
        }
        
        return RulesProfile.create(QuamocoCSharpProfile.PROFILE_NAME, QuamocoCSharpProfile.PROFILE_LANG);
    }
}
