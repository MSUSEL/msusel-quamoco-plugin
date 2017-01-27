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

import java.util.Set;

import org.sonar.api.BatchExtension;
import org.sonar.api.server.rule.RulesDefinition;

import com.google.common.collect.ImmutableSet;

/**
 * QuamocoRulesDefinition -
 *
 * @author Isaac Griffith
 *
 */
public class QuamocoRulesDefinition implements RulesDefinition, BatchExtension {

	private Set<String> ruleKeys = null;

	@Override
	public void define(final Context context) {
		loadRepositoryRules(context, QuamocoConstants.REPOSITORY_KEY, QuamocoConstants.JAVA_KEY,
				QuamocoConstants.REPO_NAME, "/net/siliconcode/sonar/quamoco/rules_java.xml");

		loadRepositoryRules(context, QuamocoConstants.REPOSITORY_KEY, QuamocoConstants.CSHARP_KEY,
				QuamocoConstants.REPO_NAME, "/net/siliconcode/sonar/quamoco/rules_cs.xml");

	}

	private void loadRepositoryRules(final Context context, final String repoKey, final String language,
			final String repoName, final String xmlFile) {
		final NewRepository repository = context.createRepository(repoKey, language).setName(repoName);

		final ImmutableSet.Builder<String> builder = ImmutableSet.builder();
		for (final NewRule rule : repository.rules()) {
			builder.add(rule.key());
		}
		ruleKeys = builder.build();

		repository.done();
	}
}
