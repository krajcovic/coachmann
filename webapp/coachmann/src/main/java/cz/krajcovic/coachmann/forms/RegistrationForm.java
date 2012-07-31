package cz.krajcovic.coachmann.forms;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.form.SubmitLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.validation.validator.StringValidator;
import cz.krajcovic.coachmann.common.Account;

public class RegistrationForm extends Form<Serializable> {

	/**
 * 
 */
	private static final long serialVersionUID = 1L;

	private String password;

	private String passwordConfirm;

	private String email;

	private FeedbackPanel feedback;

	public RegistrationForm(String id) {
		super(id);

		setDefaultModel(new CompoundPropertyModel<RegistrationForm>(this));

		// password
		PasswordTextField passwordField = new PasswordTextField("password");
		passwordField.add(StringValidator.maximumLength(20));
		add(passwordField);

		PasswordTextField passwordConfirmField = new PasswordTextField(
				"passwordConfirm");
		passwordConfirmField.add(StringValidator.maximumLength(20));
		add(passwordConfirmField);

		// eamil
		RequiredTextField<String> emailField = new RequiredTextField<String>(
				"email");
		emailField.add(StringValidator.maximumLength(256));
		add(emailField);
		
		add(new SubmitLink("submitLink"));

		// feedback
		feedback = new FeedbackPanel("feedback");
		add(feedback);
	}

	@Override
	protected void onSubmit() {

		if (password != passwordConfirm) {
			Account account = new Account(email, password);
		} else {
			error("Passwords aren't same!");
		}
	}
}