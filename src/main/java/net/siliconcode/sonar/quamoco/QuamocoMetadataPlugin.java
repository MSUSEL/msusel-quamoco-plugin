/**
 * 
 */
package net.siliconcode.sonar.quamoco;

import java.util.Arrays;
import java.util.List;

import org.sonar.api.Extension;
import org.sonar.api.SonarPlugin;

/**
 * QuamocoMetadataPlugin - 
 * 
 * @author Isaac Griffith
 *
 */
public class QuamocoMetadataPlugin extends SonarPlugin {

	/* (non-Javadoc)
	 * @see org.sonar.api.Plugin#getExtensions()
	 */
	public List<Class<? extends Extension>> getExtensions() {
		// TODO Auto-generated method stub
		return Arrays.asList(QuamocoMetrics.class, QuamocoSensor.class, QuamocoDashboardWidget.class);
	}

}
