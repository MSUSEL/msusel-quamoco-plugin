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
package net.siliconcode.sonar.quamoco.profiles.xml;

import java.util.Set;

import com.google.common.collect.Sets;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * QuamocoProfile -
 *
 * @author Isaac Griffith
 */
@XStreamAlias("profile")
public class QuamocoProfile {

	@XStreamAlias("lang")
	@XStreamAsAttribute
	private final String language;
	@XStreamImplicit
	private final Set<RuleRepo> repos;

	public QuamocoProfile(final String language) {
		this.language = language;
		repos = Sets.newHashSet();
	}

	public RuleRepo addRepo(final String repoKey) {
		if (repoKey == null || repoKey.isEmpty()) {
			return null;
		}

		final RuleRepo repo = new RuleRepo(repoKey);
		repos.add(repo);

		return repo;
	}

	public void removeRepo(final RuleRepo repo) {
		if (repo == null) {
			return;
		}

		repos.remove(repo);
	}

	public String toXml() {
		final XStream xstream = QuamocoProfile.createXStream();
		return xstream.toXML(this);
	}

	public Set<RuleRepo> getRepos() {
		return repos;
	}

	public static XStream createXStream() {
		final XStream xstream = new XStream();
		xstream.setClassLoader(QuamocoProfile.class.getClassLoader());
		xstream.processAnnotations(QuamocoProfile.class);
		xstream.processAnnotations(RuleRepo.class);
		xstream.processAnnotations(RepoRule.class);
		return xstream;
	}
}
