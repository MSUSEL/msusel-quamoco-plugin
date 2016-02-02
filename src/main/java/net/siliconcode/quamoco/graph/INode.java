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
package net.siliconcode.quamoco.graph;

import java.util.List;

import net.siliconcode.quamoco.model.qm.NormalizationRange;
import net.siliconcode.quamoco.processor.Processor;

/**
 * INode -
 *
 * @author Isaac Griffith
 */
public interface INode {

	/**
	 * @return the description
	 */
	String getDescription();

	/**
	 * @return the id
	 */
	long getId();

	/**
	 * @return the name
	 */
	String getName();

	/**
	 * @return the ownedBy
	 */
	String getOwnedBy();

	/**
	 * @param description
	 *            the description to set
	 */
	void setDescription(String description);

	/**
	 * @param id
	 *            the id to set
	 */
	void setId(long id);

	/**
	 * @param name
	 *            the name to set
	 */
	void setName(String name);

	/**
	 * @param ownedBy
	 *            the ownedBy to set
	 */
	void setOwnedBy(String ownedBy);

	/**
	 * @param metric
	 * @param range
	 * @return
	 */
	double getExtent(String metric, NormalizationRange range);

	/**
	 * @return
	 */
	Processor getProcessor();

	/**
	 * @param processor
	 */
	void setProcessor(Processor processor);

	/**
	 * @return
	 */
	double getLowerResult();

	/**
	 * @return
	 */
	double getUpperResult();

	/**
	 * @return
	 */
	List<Double> getValues();

}