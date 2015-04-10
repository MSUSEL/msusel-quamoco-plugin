/**
 * 
 */
package net.siliconcode.sonar.quamoco;

import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.RubyRailsWidget;

/**
 * QuamocoFileDistWidget - 
 * 
 * @author isaac
 *
 */
public class QuamocoFileDistWidget extends AbstractRubyTemplate implements
		RubyRailsWidget {

	private static final String ID = "quamoco_filedist_widget";
	private static final String TITLE = "Sonar Quamoco File Distribution";
	private static final String TEMPLATE_PATH = "/net/siliconcode/sonar/quamoco/quamoco_filedist.html.erb";
	
	/* (non-Javadoc)
	 * @see org.sonar.api.web.View#getId()
	 */
	public String getId() {
		// TODO Auto-generated method stub
		return ID;
	}

	/* (non-Javadoc)
	 * @see org.sonar.api.web.View#getTitle()
	 */
	public String getTitle() {
		// TODO Auto-generated method stub
		return TITLE;
	}

	/* (non-Javadoc)
	 * @see org.sonar.api.web.AbstractRubyTemplate#getTemplatePath()
	 */
	@Override
	protected String getTemplatePath() {
		// TODO Auto-generated method stub
		return TEMPLATE_PATH;
	}

}
