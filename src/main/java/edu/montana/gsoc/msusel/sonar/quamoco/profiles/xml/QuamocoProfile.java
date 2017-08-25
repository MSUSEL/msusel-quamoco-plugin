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
package edu.montana.gsoc.msusel.sonar.quamoco.profiles.xml;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

/**
 * Class representing the deserialized Quamoco Rule Profile.
 *
 * @author Isaac Griffith
 * @version 1.1.1
 */
@XStreamAlias("profile")
public class QuamocoProfile {

    /**
     * Language type of this profile
     */
    @XStreamAlias("lang")
    @XStreamAsAttribute
    private final String                language;
    /**
     * Set of rule repositories included in this Rule profile
     */
    @XStreamOmitField
    private final Map<String, RuleRepo> repoMap;
    /**
     * 
     */
    @XStreamImplicit
    private final Set<RuleRepo>         repos;

    /**
     * Constructs a new Quamoco Rule Profile for the given langauge
     * 
     * @param language
     *            Language of this profile
     */
    public QuamocoProfile(final String language)
    {
        this.language = language;
        repoMap = Maps.newHashMap();
        repos = Sets.newHashSet();
    }

    /**
     * @return The language key for which this profile is defined
     */
    public String getLanguage()
    {
        return language;
    }

    /**
     * Addes a new repository key to this profile
     * 
     * @param repoKey
     *            Key of the rule repository to add to this profile
     * @return The RuleRepo object added based on the provide key, or null if
     *         the provided key is null or an empty string.
     */
    public RuleRepo addRepo(final String repoKey)
    {
        if (!repos.isEmpty() && repoMap.isEmpty())
        {
            for (RuleRepo repo : repos)
            {
                repoMap.put(repo.getKey(), repo);
            }
        }

        if (repoKey == null || repoKey.isEmpty())
        {
            return null;
        }

        if (repoMap.containsKey(repoKey))
            return repoMap.get(repoKey);

        final RuleRepo repo = new RuleRepo(repoKey);
        repoMap.put(repoKey, repo);
        repos.add(repo);

        return repo;
    }

    /**
     * @param repo
     *            RuleRepo object to remove from this profile.
     */
    public void removeRepo(final RuleRepo repo)
    {
        if (repo == null || !repoMap.containsKey(repo.getKey()))
        {
            return;
        }

        repoMap.remove(repo.getKey());
        repos.remove(repo);
    }

    /**
     * @return An XML string representation of this object.
     */
    public String toXml()
    {
        final XStream xstream = QuamocoProfile.createXStream();
        return xstream.toXML(this);
    }

    /**
     * @return The set of RuleRepos added to this profile.
     */
    public Set<RuleRepo> getRepos()
    {
        return repos;
    }

    /**
     * Constructs a new XStream object used to serialize/deserialize this object
     * to/from XML.
     * 
     * @return XStream object
     */
    public static XStream createXStream()
    {
        final XStream xstream = new XStream();
        xstream.setClassLoader(QuamocoProfile.class.getClassLoader());
        xstream.processAnnotations(QuamocoProfile.class);
        xstream.processAnnotations(RuleRepo.class);
        xstream.processAnnotations(RepoRule.class);
        return xstream;
    }
}
