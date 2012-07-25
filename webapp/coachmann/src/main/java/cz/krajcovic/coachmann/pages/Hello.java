package cz.krajcovic.coachmann.pages;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class Hello extends WebPage {

	public Hello(final PageParameters parameters) {
		add(new Label("message", "Online coach manager"));
	}
}
