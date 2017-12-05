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
package edu.montana.gsoc.msusel.codetree.sonar.quamoco.profiles;

import java.io.Reader;

import edu.montana.gsoc.msusel.codetree.sonar.quamoco.QuamocoConstants;
import edu.montana.gsoc.msusel.codetree.sonar.quamoco.profiles.xml.QuamocoProfile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonar.api.profiles.ProfileImporter;
import org.sonar.api.profiles.RulesProfile;
import org.sonar.api.rules.Rule;
import org.sonar.api.rules.RuleFinder;
import org.sonar.api.utils.ValidationMessages;

import edu.montana.gsoc.msusel.codetree.sonar.quamoco.profiles.xml.RuleRepo;
import com.thoughtworks.xstream.XStream;

/**
 * QuamocoProfileImporter -
 *
 * @author Isaac Griffith
 */
public class QuamocoProfileImporter extends ProfileImporter {

    private final RuleFinder    ruleFinder;
    private static final Logger LOG = LoggerFactory.getLogger(QuamocoProfileImporter.class);

    public QuamocoProfileImporter(final RuleFinder ruleFinder) {
        super(QuamocoConstants.REPOSITORY_KEY, QuamocoConstants.PLUGIN_NAME);
        setSupportedLanguages("java", "cs");
        this.ruleFinder = ruleFinder;
    }

    @Override
    public RulesProfile importProfile(final Reader reader, final ValidationMessages messages) {
        final RulesProfile profile = RulesProfile.create();
        try {
            final XStream xStream = QuamocoProfile.createXStream();
            final QuamocoProfile filter = (QuamocoProfile) xStream.fromXML(reader);

            this.activateRulesByPattern(profile, filter, messages);

            return profile;
        }
        catch (final Exception e) {
            final String errorMessage = "The quamoco configuration file is not valid";
            messages.addErrorText(errorMessage + " : " + e.getMessage());
            QuamocoProfileImporter.LOG.error(errorMessage, e);
            return profile;
        }
    }

    private void activateRulesByPattern(final RulesProfile profile, final QuamocoProfile qp,
            final ValidationMessages messages) {
        for (final RuleRepo repo : qp.getRepos()) {
            for (final String ruleKey : repo.getRules()) {
                final Rule rule = ruleFinder.findByKey(repo.getKey(), ruleKey);
                if (rule != null) {
                    profile.activateRule(rule, null);
                }
                else {
                    messages.addWarningText("Unable to activate unknown rule : '" + ruleKey + "'");
                }
            }
        }
    }
}
