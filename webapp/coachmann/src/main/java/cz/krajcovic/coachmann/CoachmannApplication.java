package cz.krajcovic.coachmann;

import org.apache.log4j.Logger;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import cz.krajcovic.coachmann.pages.Hello;
import cz.krajcovic.coachmann.pages.Registration;

public class CoachmannApplication extends WebApplication {

	/**
	 * Logovaci objekt.
	 */
	static Logger log = Logger.getLogger(CoachmannApplication.class.getName());

	@Override
	public Class<? extends Page> getHomePage() {
		return Hello.class;
	}

	@Override
	protected void init() {
		super.init();

		// Registration page
		// getRootRequestMapperAsCompound().add(new
		// MountedMapper("/registration", Registration.class));
		mountPage("/registration", Registration.class); // convenient method
													// doing the same as
													// above
	}

}
