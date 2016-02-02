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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sonar.api.BatchExtension;

/**
 * JavaMetricsContext -
 *
 * @author Isaac Griffith
 */
public class MetricsContext implements BatchExtension {

	/**
	 *
	 */
	public static final String NOV = "NOV";
	/**
	 *
	 */
	public static final String NOT = "NOT";
	/**
	 *
	 */
	public static final String NOM = "NOM";
	/**
	 *
	 */
	public static final String NOF = "NOF";
	/**
	 *
	 */
	public static final String NOC = "NOC";
	/**
	 *
	 */
	public static final String NOS = "NOS";
	/**
	 *
	 */
	public static final String LOC = "LOC";
	/**
	 *
	 */
	public static final String MAXNESTING = "MAXNESTING";
	/**
	 * Map indexed by qualified class name, containing a map indexed by metric
	 * name of values
	 */
	protected Map<String, Map<String, Double>> classMetrics = new HashMap<>();
	/**
	 * Map indexed by absolute file name, containing a map indexed by metric
	 * name of values
	 */
	protected Map<String, Map<String, Double>> fileMetrics = new HashMap<>();;
	/**
	 * Map indexed by qualified method name, containing a map indexed by metric
	 * name of values
	 */
	protected Map<String, Map<String, Double>> methodMetrics = new HashMap<>();
	/**
	 * Map indexed by metric name, containing the metric value
	 */
	protected Map<String, Double> projectMetrics = new HashMap<>();

	private static final Map<String, String> metricNameLookup = new HashMap<>();

	static {
		MetricsContext.metricNameLookup.put("class/CountDeclInstanceMethod", MetricsContext.NOM);
		MetricsContext.metricNameLookup.put("file/CountDeclClass", MetricsContext.NOC);
		MetricsContext.metricNameLookup.put("file/CountStmt", MetricsContext.NOS);
		MetricsContext.metricNameLookup.put("class/CountDeclInstanceVariable", MetricsContext.NOF);
		MetricsContext.metricNameLookup.put("#Methods", MetricsContext.NOM);
		MetricsContext.metricNameLookup.put("#Fields", MetricsContext.NOF);
		MetricsContext.metricNameLookup.put("#Variables", MetricsContext.NOV);
		MetricsContext.metricNameLookup.put("#Statements", MetricsContext.NOS);
		MetricsContext.metricNameLookup.put("#Classes", MetricsContext.NOC);
		MetricsContext.metricNameLookup.put("#Classes", MetricsContext.NOC);
		MetricsContext.metricNameLookup.put("#Statements", MetricsContext.NOS);
		MetricsContext.metricNameLookup.put("#FieldDeclarations", MetricsContext.NOF);
		MetricsContext.metricNameLookup.put("#LocalVariableDeclarations", MetricsContext.NOV);
		MetricsContext.metricNameLookup.put("#Types", MetricsContext.NOT);
	}

	private static class FactoryHelper {

		private static final MetricsContext INSTANCE = new MetricsContext();
	}

	private MetricsContext() {
		classMetrics = new HashMap<>();
		fileMetrics = new HashMap<>();
		methodMetrics = new HashMap<>();
		projectMetrics = new HashMap<>();
	}

	public static MetricsContext getInstance() {
		return FactoryHelper.INSTANCE;
	}

	public void setMetrics(Map<String, Double> projectMetrics, Map<String, Map<String, Double>> fileMetrics,
			Map<String, Map<String, Double>> typeMetrics, Map<String, Map<String, Double>> methodMetrics) {
		setProjectMetrics(projectMetrics);
		setFileMetrics(fileMetrics);
		setMethodMetrics(methodMetrics);
		setTypeMetrics(typeMetrics);
	}

	public void setFileMetrics(Map<String, Map<String, Double>> fileMetrics) {
		if (fileMetrics == null)
			return;

		this.fileMetrics = fileMetrics;
	}

	public void setMethodMetrics(Map<String, Map<String, Double>> methodMetrics) {
		if (methodMetrics == null)
			return;

		this.methodMetrics = methodMetrics;
	}

	public void setTypeMetrics(Map<String, Map<String, Double>> typeMetrics) {
		if (typeMetrics == null)
			return;

		this.classMetrics = typeMetrics;
	}

	public void setProjectMetrics(Map<String, Double> projectMetrics) {
		if (projectMetrics == null)
			return;

		this.projectMetrics = projectMetrics;
	}

	/**
	 * @param file
	 * @param metric
	 * @return
	 */
	public double getFileMetric(final String file, final String metric) {
		return getMetric(file, metric, fileMetrics);
	}

	/**
	 * @param method
	 * @param metric
	 * @return
	 */
	public double getMethodMetric(final String method, final String metric) {
		return getMetric(method, metric, methodMetrics);
	}

	/**
	 * @param type
	 * @param metric
	 * @return
	 * @throws MetricsContextException
	 */
	public double getTypeMetric(final String type, final String metric) {
		return getMetric(type, metric, classMetrics);
	}

	public double getMetric(final String identifier, final String metric) {
		if (metric == null || metric.isEmpty())
			throw new IllegalArgumentException("Metric name cannot be null or the empty string.");

		if (identifier == null || identifier.isEmpty())
			throw new IllegalArgumentException("Metric name cannot be null or the empty string.");

		if (methodMetrics.containsKey(identifier) && methodMetrics.get(identifier).containsKey(metric)) {
			return getMethodMetric(identifier, metric);
		} else if (classMetrics.containsKey(identifier) && classMetrics.get(identifier).containsKey(metric)) {
			return getTypeMetric(identifier, metric);
		} else if (fileMetrics.containsKey(identifier) && fileMetrics.get(identifier).containsKey(metric)) {
			return getFileMetric(identifier, metric);
		} else {
			throw new IllegalArgumentException(
					"Cannot find value of metric, " + metric + ", for identifier: " + identifier);
		}
	}

	/**
	 * @param metric
	 * @return
	 */
	public double getProjectMetric(final String metric) {
		if (metric == null || metric.isEmpty())
			throw new IllegalArgumentException("Metric name cannot be null or the empty string.");

		if (projectMetrics.containsKey(metric)) {
			return projectMetrics.get(metric).intValue();
		} else if (MetricsContext.metricNameLookup.containsKey(metric)) {
			return projectMetrics.get(MetricsContext.metricNameLookup.get(metric)).intValue();
		}

		return Double.NEGATIVE_INFINITY;
	}

	/**
	 * @param key
	 * @param metric
	 * @param map
	 * @return
	 */
	private double getMetric(final String key, final String metric, final Map<String, Map<String, Double>> map) {
		if (metric == null || metric.isEmpty())
			throw new IllegalArgumentException("Metric name cannot be null or the empty string.");

		if (key == null || key.isEmpty())
			throw new IllegalArgumentException("Location key cannot be null or the empty string.");

		if (map.containsKey(key)) {
			if (map.get(key).containsKey(metric)) {
				return map.get(key).get(metric).intValue();
			} else if (MetricsContext.metricNameLookup.containsKey(metric)) {
				return map.get(key).get(MetricsContext.metricNameLookup.get(metric)).intValue();
			}
		}

		return Double.NEGATIVE_INFINITY;
	}

	/**
	 * @param metric
	 * @return
	 */
	public List<Double> getAllClassValues(final String metric) {
		if (metric == null || metric.isEmpty())
			throw new IllegalArgumentException("Metric name cannot be null or the empty string.");

		final List<Double> list = new ArrayList<>();

		for (final String key : classMetrics.keySet()) {
			if (classMetrics.get(key).containsKey(metric)) {
				list.add(classMetrics.get(key).get(metric).doubleValue());
			}
		}

		return list;
	}

	/**
	 * @param metric
	 * @return
	 */
	public List<Double> getAllFileValues(final String metric) {
		if (metric == null || metric.isEmpty())
			throw new IllegalArgumentException("Metric name cannot be null or the empty string.");

		final List<Double> list = new ArrayList<>();

		for (final String key : fileMetrics.keySet()) {
			if (fileMetrics.get(key).containsKey(metric)) {
				list.add(fileMetrics.get(key).get(metric).doubleValue());
			}
		}

		return list;
	}

	/**
	 * @param metric
	 * @return
	 */
	public List<Double> getAllMethodValues(final String metric) {
		if (metric == null || metric.isEmpty())
			throw new IllegalArgumentException("Metric name cannot be null or the empty string.");

		final List<Double> list = new ArrayList<>();

		for (final String key : methodMetrics.keySet()) {
			if (methodMetrics.get(key).containsKey(metric)) {
				list.add(methodMetrics.get(key).get(metric).doubleValue());
			}
		}

		return list;
	}
}
