package cz.krajcovic.coachmann.pages;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class Hello extends WebPage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Hello(final PageParameters parameters) {
		add(new Label("message", "Online coach manager"));
	}
}
