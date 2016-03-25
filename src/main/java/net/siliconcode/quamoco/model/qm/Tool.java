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
package net.siliconcode.quamoco.model.qm;

import java.util.List;

import com.google.common.collect.Lists;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * Tool -
 *
 * @author Isaac Griffith
 */
@XStreamAlias("tools")
public class Tool extends AbstractQMEntity {

	private OriginatesFrom originatesFrom;
	@XStreamImplicit
	private final List<Annotation> annotations;

	/**
	 *
	 */
	public Tool(final String name, final String description, final OriginatesFrom originatesFrom, final String id) {
		if (name == null || name.isEmpty() || id == null || id.isEmpty() || description == null) {
			throw new IllegalArgumentException();
		}

		this.name = name;
		this.description = description;
		this.originatesFrom = originatesFrom;
		this.id = id;
		annotations = Lists.newArrayList();
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Tool other = (Tool) obj;
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (originatesFrom == null) {
			if (other.originatesFrom != null) {
				return false;
			}
		} else if (!originatesFrom.equals(other.originatesFrom)) {
			return false;
		}
		return true;
	}

	/**
	 * @return the annotation
	 */
	public List<Annotation> getAnnotations() {
		return annotations;
	}

	/**
	 * @return the originatesFrom
	 */
	public OriginatesFrom getOriginatesFrom() {
		return originatesFrom;
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
		result = prime * result + (description == null ? 0 : description.hashCode());
		result = prime * result + (name == null ? 0 : name.hashCode());
		result = prime * result + (originatesFrom == null ? 0 : originatesFrom.hashCode());
		return result;
	}

	/**
	 * @param annotation
	 *            the annotation to set
	 */
	public void addAnnotation(final Annotation annotation) {
		if (annotation == null || annotations.contains(annotation)) {
			return;
		}

		annotations.add(annotation);
	}

	public void removeAnnotation(final Annotation annotation) {
		if (annotation == null || !annotations.contains(annotation)) {
			return;
		}

		annotations.add(annotation);
	}

	/**
	 * @param originatesFrom
	 *            the originatesFrom to set
	 */
	public void setOriginatesFrom(final OriginatesFrom originatesFrom) {
		this.originatesFrom = originatesFrom;
	}

}
