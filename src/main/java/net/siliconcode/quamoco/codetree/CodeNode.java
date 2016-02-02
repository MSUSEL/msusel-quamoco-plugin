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
package net.siliconcode.quamoco.codetree;

import com.google.common.collect.Range;
import com.google.common.collect.Ranges;

import net.siliconcode.quamoco.distiller.keys.FlyweightKey;
import net.siliconcode.quamoco.distiller.keys.FlyweightKeyFactory;

/**
 * CodeNode -
 *
 * @author Isaac Griffith
 */
public abstract class CodeNode implements Comparable<CodeNode> {

	protected FlyweightKey identifier;
	protected CodeNode owner;
	private int start = 1;
	private int end = Integer.MAX_VALUE;
	private Range<Integer> range;

	public CodeNode(final CodeNode parent, String identifier, final int start, final int end) {
		this.identifier = FlyweightKeyFactory.getInstance().getKey(identifier, identifier);

		setStart(start);
		setEnd(end);
		setOwner(parent);
		setIdentifier(identifier);
		range = Ranges.closed(start, end);
	}

	public CodeNode(final CodeNode parent, String qIdentifier, String identifier, final int start, final int end) {
		if ((qIdentifier == null || qIdentifier.isEmpty()) || (identifier == null || identifier.isEmpty()))
			throw new IllegalArgumentException(
					"Neither identifier or the qualified identifier of an entity can be either null or the empty string.");

		this.identifier = FlyweightKeyFactory.getInstance().getKey(qIdentifier, identifier);

		setStart(start);
		setEnd(end);
		setOwner(parent);
		range = Ranges.closed(start, end);
	}

	/**
	 * @return the identifier
	 */
	public FlyweightKey getIdentifier() {
		return identifier;
	}

	/**
	 * @param identifier
	 *            the identifier to set
	 */
	public void setIdentifier(String identifier) {
		if (identifier == null || identifier.isEmpty())
			throw new IllegalArgumentException();

		this.identifier = FlyweightKeyFactory.getInstance().getKey(identifier, identifier);
		updateKey();
	}

	/**
	 * @return the Qualified Identfier;
	 */
	public String getQIdentifier() {
		return identifier.getKey();
	}

	/**
	 * @return the start
	 */
	public int getStart() {
		return start;
	}

	/**
	 * @param start
	 *            the start to set
	 */
	public void setStart(final int start) {
		if (owner != null && !(owner instanceof FileNode)) {
			if (owner.getStart() > start)
				throw new IllegalArgumentException("Owner start cannot be greater than child start line.");
		}

		if (start > end)
			throw new IllegalArgumentException("Start cannot be greater than end");

		if (start < 1)
			throw new IllegalArgumentException("Start cannot be less than 1.");

		this.start = start;
		updateRange();
	}

	/**
	 * @return the end
	 */
	public int getEnd() {
		return end;
	}

	/**
	 * @param end
	 *            the end to set
	 */
	public void setEnd(final int end) {
		if (owner != null && !(owner instanceof FileNode)) {
			if (owner.getEnd() < end)
				throw new IllegalArgumentException("Owner end cannot be less than child end line.");
		}

		if (end < start)
			throw new IllegalArgumentException("End cannot be less than start");

		this.end = end;
		updateRange();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(final CodeNode o) {
		return Integer.compare(start, o.start);
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
		result = prime * result + end;
		result = prime * result + (identifier == null ? 0 : identifier.hashCode());
		result = prime * result + start;
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		final CodeNode other = (CodeNode) obj;
		if (end != other.end) {
			return false;
		}
		if (identifier == null) {
			if (other.identifier != null) {
				return false;
			}
		} else if (!identifier.equals(other.identifier)) {
			return false;
		}
		if (start != other.start) {
			return false;
		}
		return true;
	}

	/**
	 * @param owner
	 */
	protected void setOwner(final CodeNode owner) {
		if (!(owner instanceof FileNode) && owner != null) {
			if (owner.getStart() > this.start || owner.getEnd() < this.end)
				throw new IllegalArgumentException(
						"Owner start cannot be greater than child start line, or owner end cannot be less than child end line.");
		}

		this.owner = owner;
		updateKey();
	}

	public boolean containsLine(final int line) {
		return range.contains(line);
	}

	public CodeNode getOwner() {
		return owner;
	}

	/**
	 * @return
	 */
	public abstract String getType();

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [identifier=" + identifier + ", start=" + start + ", end=" + end
				+ ", range=" + range + "]";
	}

	protected abstract void updateKey();

	private void updateRange() {
		range = Ranges.closed(start, end);
	}
}
