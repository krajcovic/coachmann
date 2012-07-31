package cz.krajcovic.coachmann.pages;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import cz.krajcovic.coachmann.forms.RegistrationForm;

public class Registration extends Layout {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String WICKET_ID_FEEDBACK = "feedback";

	public Registration() {
		add(new FeedbackPanel(WICKET_ID_FEEDBACK));
		// feedback.setOutputMarkupId(true);

		final WebMarkupContainer registrationContainer = new WebMarkupContainer(
				"registrationContainer");
		registrationContainer.setMarkupId("regisration");
		registrationContainer.setOutputMarkupId(true);

		add(registrationContainer);

		RegistrationForm regForm = new RegistrationForm("registrationForm");
		registrationContainer.add(regForm);
	}
}
