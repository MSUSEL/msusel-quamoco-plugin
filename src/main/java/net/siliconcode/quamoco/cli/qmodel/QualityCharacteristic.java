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
package net.siliconcode.quamoco.cli.qmodel;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

/**
 * QualityCharacteristic -
 *
 * @author Isaac Griffith
 *
 */
@XStreamAlias("characteristic")
public class QualityCharacteristic {

	@XStreamAlias("name")
	@XStreamAsAttribute
	private String name;
	@XStreamAlias("key")
	@XStreamAsAttribute
	private String key;

	@XStreamImplicit
	private final Set<QualityCharacteristic> subcharacteristics;
	@XStreamImplicit
	private final Set<Repository> ruleRepos;

	@XStreamOmitField
	private final Map<String, Repository> repoMap;

	public QualityCharacteristic() {
		this(null, null);
	}

	public QualityCharacteristic(final String key) {
		this(key, null);
	}

	public QualityCharacteristic(final String key, final String name) {
		this.key = key;
		this.name = name;
		subcharacteristics = Sets.newHashSet();
		ruleRepos = Sets.newHashSet();
		repoMap = Maps.newHashMap();
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(final String key) {
		this.key = key;
	}

	public void addRepo(final Repository repo) {
		if (repo == null) {
			return;
		}

		ruleRepos.add(repo);
		repoMap.put(repo.getName(), repo);
	}

	public void removeRepo(final Repository repo) {
		if (repo == null || !ruleRepos.contains(repo)) {
			return;
		}

		ruleRepos.remove(repo);
		repoMap.remove(repo.getName());
	}

	public void addSubCharacteristic(final QualityCharacteristic qc) {
		if (qc == null) {
			return;
		}

		subcharacteristics.add(qc);
	}

	public void removeSubCharacteristic(final QualityCharacteristic qc) {
		if (qc == null || !subcharacteristics.contains(qc)) {
			return;
		}

		subcharacteristics.remove(qc);
	}

	public Set<QualityCharacteristic> getSubCharacteristics() {
		return subcharacteristics;
	}

	public Set<Repository> getRuleRepos() {
		return ruleRepos;
	}

	/**
	 * @param text
	 * @return
	 */
	public Repository getRuleRepo(final String name) {
		if (repoMap.isEmpty() && !ruleRepos.isEmpty()) {
			initRepoMap();
		}

		if (repoMap.containsKey(name)) {
			return repoMap.get(name);
		}

		final Repository repo = new Repository(name);
		addRepo(repo);

		return repo;
	}

	private void initRepoMap() {
		for (final Repository r : ruleRepos) {
			repoMap.put(r.getName(), r);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (key == null ? 0 : key.hashCode());
		result = prime * result + (name == null ? 0 : name.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof QualityCharacteristic)) {
			return false;
		}
		final QualityCharacteristic other = (QualityCharacteristic) obj;
		if (key == null) {
			if (other.key != null) {
				return false;
			}
		} else if (!key.equals(other.key)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
}
