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

import java.util.Set;
import java.util.SortedSet;

import com.google.common.collect.Sets;

import net.siliconcode.quamoco.distiller.keys.FlyweightKeyFactory;

/**
 * TypeNode -
 *
 * @author Isaac Griffith
 */
public class TypeNode extends CodeNode {

	private final SortedSet<MethodNode> methods = Sets.newTreeSet();
	private final SortedSet<FieldNode> fields = Sets.newTreeSet();
	private final boolean isClass;
	private String qIdentifier;

	/**
	 * @param identifier
	 * @param start
	 * @param end
	 */
	public TypeNode(final CodeNode owner, final String qIdentifier, final String identifier, final boolean isClass,
			final int start, final int end) {
		super(owner, qIdentifier, identifier, start, end);
		this.isClass = isClass;
		this.qIdentifier = qIdentifier;
	}

	public void removeMethod(final MethodNode method) {
		if (method == null || !methods.contains(method))
			return;

		methods.remove(method);
		method.setOwner(null);
	}

	public MethodNode getMethod(final int line) {
		if (line >= this.getStart() && line <= this.getEnd()) {
			for (final MethodNode node : methods) {
				if (node.containsLine(line)) {
					return node;
				}
			}
		}

		return null;
	}

	public boolean addMethod(final MethodNode child) {
		if (child == null || methods.contains(child)) {
			return false;
		}

		if (child.getStart() < this.getStart() || child.getEnd() > this.getEnd())
			throw new IllegalArgumentException(
					"A method's start cannot be less than the type's start line, and a method's end cannot exceed a type's end line.");

		methods.add(child);
		child.setOwner(this);

		return true;
	}

	public Set<MethodNode> getMethods() {
		return methods;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.siliconcode.quamoco.codetree.CodeNode#getType()
	 */
	@Override
	public String getType() {
		return CodeNodeType.TYPE;
	}

	public void removeField(final FieldNode field) {
		if (field == null || !fields.contains(field))
			return;

		fields.remove(field);
		field.setOwner(null);
	}

	public FieldNode getField(final int line) {
		if (line >= this.getStart() && line <= this.getEnd()) {
			for (final FieldNode node : fields) {
				if (node.containsLine(line)) {
					return node;
				}
			}
		}

		return null;
	}

	protected boolean addField(final FieldNode child) {
		if (child == null || methods.contains(child)) {
			return false;
		}

		if (child.getStart() < this.getStart() || child.getEnd() > this.getEnd())
			throw new IllegalArgumentException(
					"A method's start cannot be less than the type's start line, and a method's end cannot exceed a type's end line.");

		fields.add(child);
		child.setOwner(this);

		return true;
	}

	public Set<FieldNode> getFields() {
		return fields;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.siliconcode.quamoco.codetree.CodeNode#updateKey()
	 */
	@Override
	protected void updateKey() {
		if (identifier != null && qIdentifier != null) {
			String shortName = identifier.getShortKey();
			if (qIdentifier != null && qIdentifier.contains("."))
				qIdentifier = qIdentifier.substring(0, qIdentifier.lastIndexOf(".")) + "." + shortName;
			else
				qIdentifier = shortName;
			identifier = FlyweightKeyFactory.getInstance().getKey(qIdentifier, shortName);
		}
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
		final TypeNode other = (TypeNode) obj;
		if (owner == null) {
			if (other.owner != null) {
				return false;
			}
		} else if (!owner.equals(other.owner)) {
			return false;
		}
		return true && super.equals(obj);
	}
}
