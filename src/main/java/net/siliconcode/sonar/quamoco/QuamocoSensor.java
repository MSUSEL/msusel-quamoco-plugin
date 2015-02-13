/**
 * 
 */
package net.siliconcode.sonar.quamoco;

import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.resources.Project;

/**
 * QuamocoSensor - 
 * 
 * @author Isaac
 *
 */
public class QuamocoSensor implements Sensor {

	/* (non-Javadoc)
	 * @see org.sonar.api.batch.CheckProject#shouldExecuteOnProject(org.sonar.api.resources.Project)
	 */
	public boolean shouldExecuteOnProject(Project project) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.sonar.api.batch.Sensor#analyse(org.sonar.api.resources.Project, org.sonar.api.batch.SensorContext)
	 */
	public void analyse(Project module, SensorContext context) {
		// TODO Auto-generated method stub
	}

}
