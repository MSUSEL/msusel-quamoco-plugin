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
package net.siliconcode.quamoco.processor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Sets;

import net.siliconcode.quamoco.codetree.CodeNode;
import net.siliconcode.quamoco.codetree.FileNode;
import net.siliconcode.quamoco.codetree.MethodNode;
import net.siliconcode.quamoco.codetree.TypeNode;
import net.siliconcode.quamoco.graph.node.Finding;
import net.siliconcode.quamoco.graph.node.MeasureNode;
import net.siliconcode.quamoco.graph.node.MeasureType;
import net.siliconcode.quamoco.model.qm.NormalizationRange;

/**
 * Extent -
 *
 * @author Isaac Griffith
 */
public class Extent {

	/**
	 * Map of project-wide metric extents: key = range, value = (key = metric
	 * name, value = metric) extent value
	 */
	private final Map<NormalizationRange, Map<String, Double>> totalMetricExtents;
	private MetricsContext context;
	private static final Logger LOG = LoggerFactory.getLogger(Extent.class);

	private static class ExtentHelper {

		private static final Extent INSTANCE = new Extent();
	}

	private Extent() {
		context = MetricsContext.getInstance();
		totalMetricExtents = new HashMap<>();
		for (final NormalizationRange range : NormalizationRange.values()) {
			totalMetricExtents.put(range, new HashMap<String, Double>());
		}
	}

	public static Extent getInstance() {
		return ExtentHelper.INSTANCE;
	}

	/**
	 * @param metric
	 * @param range
	 * @param findings
	 * @return
	 */
	public double findFindingExtent(final String metric, final NormalizationRange range, final Finding finding) {
		final CodeNode cnode = finding.getLocation();
		String location = "";
		switch (range) {
		case CLASS:
			if (cnode instanceof TypeNode) {
				location = cnode.getQIdentifier();
			} else if (cnode instanceof FileNode) {
				for (final CodeNode tnode : ((FileNode) cnode).getTypes()) {
					location = tnode.getQIdentifier();
				}
			} else if (cnode instanceof MethodNode) {
				location = cnode.getOwner().getQIdentifier();
			}
			break;
		case FILE:
			if (cnode instanceof TypeNode) {
				location = cnode.getOwner().getQIdentifier();
			} else if (cnode instanceof FileNode) {
				location = cnode.getQIdentifier();
			} else if (cnode instanceof MethodNode) {
				location = cnode.getOwner().getOwner().getQIdentifier();
			}
			break;
		case METHOD:
			if (cnode instanceof TypeNode) {
				for (final CodeNode mnode : ((TypeNode) cnode).getMethods()) {
					location = mnode.getQIdentifier();
				}
			} else if (cnode instanceof FileNode) {
				for (final CodeNode tnode : ((FileNode) cnode).getTypes()) {
					for (final CodeNode mnode : ((TypeNode) tnode).getMethods()) {
						location = mnode.getQIdentifier();
					}
				}
			} else if (cnode instanceof MethodNode) {
				location = cnode.getQIdentifier();
			}
			break;
		case NA:
			location = cnode.getQIdentifier();
			break;
		}

		double affected = context.getMetric(location, metric);

		return affected;
	}

	/**
	 * @param metric
	 * @param range
	 * @param measures
	 * @return
	 */
	public double findMeasureExtent(final String metric, final NormalizationRange range, final MeasureNode measure) {
		final Set<Finding> findingsSet = Sets.newHashSet();
		double valueExtent = 0;
		switch (measure.getType()) {
		case MeasureType.FINDINGS:
			findingsSet.addAll(measure.getFindings());
			break;
		case MeasureType.NUMBER:
			valueExtent += measure.getValue();
		}

		double findingExtent = 0;
		for (final Finding f : findingsSet) {
			findingExtent += f.getExtent(metric, range);
		}

		return findingExtent + valueExtent;
	}

	/**
	 * @param metric
	 * @param range
	 * @return
	 */
	public double findExtent(final String metric, final NormalizationRange range) {
		if (totalMetricExtents.containsKey(range)) {
			if (totalMetricExtents.get(range).containsKey(metric)) {
				return totalMetricExtents.get(range).get(metric);
			}
		}

		double total = 0;
		List<Double> values = null;
		switch (range) {
		case CLASS:
			values = context.getAllClassValues(metric);
			for (final double val : values) {
				total += val;
			}
			totalMetricExtents.get(range).put(metric, total);
			break;
		case FILE:
			values = context.getAllFileValues(metric);
			for (final double val : values) {
				total += val;
			}
			totalMetricExtents.get(range).put(metric, total);
			break;
		case METHOD:
			values = context.getAllMethodValues(metric);
			for (final double val : values) {
				total += val;
			}
			totalMetricExtents.get(range).put(metric, total);
			break;
		case NA:
			totalMetricExtents.get(range).put(metric, context.getProjectMetric(metric));
			break;
		}

		return total;
	}
}
