/**
 * 
 */
package net.siliconcode.sonar.quamoco.metrics;

import java.util.List;

import net.siliconcode.sonar.quamoco.QuamocoConstants;

import org.sonar.api.config.Settings;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.measures.Metric;
import org.sonar.api.measures.Metrics;

import com.google.common.collect.ImmutableList;

/**
 * CSharpMetrics -
 * 
 * @author isaac
 */
public class CSharpMetrics implements Metrics {

    private Settings                  settings;

    public static final Metric<Float> NOF = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
                                                  + QuamocoConstants.CSHARP_KEY + "." + "NOF", "Number of Fields",
                                                  Metric.ValueType.FLOAT).setDirection(Metric.DIRECTION_BETTER)
                                                  .setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL).create();

    public static final Metric<Float> NOS = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
                                                  + QuamocoConstants.CSHARP_KEY + "." + "NOS", "Number of Statements",
                                                  Metric.ValueType.FLOAT).setDirection(Metric.DIRECTION_BETTER)
                                                  .setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL).create();

    public static final Metric<Float> NOC = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
                                                  + QuamocoConstants.CSHARP_KEY + "." + "NOC", "Number of Classes",
                                                  Metric.ValueType.FLOAT).setDirection(Metric.DIRECTION_BETTER)
                                                  .setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL).create();

    public static final Metric<Float> LOC = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
                                                  + QuamocoConstants.CSHARP_KEY + "." + "NCLOC",
                                                  "Non Comment Lines of Code", Metric.ValueType.FLOAT)
                                                  .setDirection(Metric.DIRECTION_BETTER).setQualitative(false)
                                                  .setDomain(CoreMetrics.DOMAIN_GENERAL).create();

    public static final Metric<Float> NOM = new Metric.Builder(QuamocoConstants.PLUGIN_KEY + "."
                                                  + QuamocoConstants.CSHARP_KEY + "." + "NOM", "Number of Methods",
                                                  Metric.ValueType.FLOAT).setDirection(Metric.DIRECTION_BETTER)
                                                  .setQualitative(false).setDomain(CoreMetrics.DOMAIN_GENERAL).create();

    /*
     * (non-Javadoc)
     * @see org.sonar.api.measures.Metrics#getMetrics()
     */
    @Override
    public List<Metric> getMetrics()
    {
        ImmutableList.Builder<Metric> builder = ImmutableList.builder();
        builder.add(NOF, NOS, NOC, LOC);
        return builder.build();
    }

}
