/**
 * 
 */
package net.siliconcode.sonar.quamoco;

import java.util.Arrays;
import java.util.List;

import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.api.measures.Metrics;

/**
 * QuamocoMetric -
 * 
 * @author Isaac
 *
 */
public class QuamocoMetrics implements Metrics {

	public static final Metric MAINTAINABILITY = new Metric.Builder("Quamoco",
			"Maintainability", Metric.ValueType.FLOAT).setQualitative(false)
			.setDomain(CoreMetrics.DOMAIN_GENERAL).create();
	public static final Metric FUNCTIONAL_SUITABILITY = new Metric.Builder(
			"Quamoco", "Functional Suitability", Metric.ValueType.FLOAT)
			.setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL)
			.create();
	public static final Metric SECURITY = new Metric.Builder("Quamoco",
			"Security", Metric.ValueType.FLOAT).setQualitative(false)
			.setDomain(CoreMetrics.DOMAIN_GENERAL).create();
	public static final Metric PERFORMANCE_EFFICIENCY = new Metric.Builder(
			"Quamoco", "Performance Efficiency", Metric.ValueType.FLOAT)
			.setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL)
			.create();
	public static final Metric PORTABILITY = new Metric.Builder("Quamoco",
			"Portability", Metric.ValueType.FLOAT).setQualitative(false)
			.setDomain(CoreMetrics.DOMAIN_GENERAL).create();
	public static final Metric RELIABILITY = new Metric.Builder("Quamoco",
			"Reliability", Metric.ValueType.FLOAT).setQualitative(false)
			.setDomain(CoreMetrics.DOMAIN_GENERAL).create();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sonar.api.measures.Metrics#getMetrics()
	 */
	public List<Metric> getMetrics() {
		return Arrays.asList(MAINTAINABILITY, FUNCTIONAL_SUITABILITY, SECURITY,
				PERFORMANCE_EFFICIENCY, PORTABILITY, RELIABILITY);
	}

}
