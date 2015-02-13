/**
 * 
 */
package net.siliconcode.sonar.quamoco;

import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.Description;
import org.sonar.api.web.RubyRailsWidget;
import org.sonar.api.web.UserRole;

/**
 * QuamocoDashboardWidget -
 * 
 * @author Isaac
 *
 * 
 */
@UserRole(UserRole.USER)
@Description("Shows a breakdown of the Quamoco quality model values for this project.")
public class QuamocoDashboardWidget extends AbstractRubyTemplate implements
		RubyRailsWidget {

	private static final String ID = "quamoco_dashboard_widget";
	private static final String TITLE = "Sonar Quamoco Quality Display";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sonar.api.web.View#getId()
	 */
	public String getId() {
		return ID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sonar.api.web.View#getTitle()
	 */
	public String getTitle() {
		return TITLE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sonar.api.web.AbstractRubyTemplate#getTemplatePath()
	 */
	@Override
	protected String getTemplatePath() {
		// TODO Auto-generated method stub
		return null;
	}

}
