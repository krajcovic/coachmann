package cz.krajcovic.coachmann;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

import cz.krajcovic.coachmann.pages.Hello;


public class CoachmannApplication extends WebApplication{

	@Override
	public Class<? extends Page> getHomePage() {
		return Hello.class;
	}

}
