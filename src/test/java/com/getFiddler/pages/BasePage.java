package com.getFiddler.pages;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.getFiddler.utils.ConfigurationProperties;

public class BasePage {

	private static ConfigurationProperties config = new ConfigurationProperties();

	protected static final int LOAD_TIME = 15;

	protected static Screen screen = new Screen();

	protected static String email = config.getEmail();
	protected static String password = config.getPassword();

	public void clickButton(Pattern button) throws FindFailed {
		screen.wait(button, LOAD_TIME).click();
	}

	public void populateField(Pattern input, String text) throws FindFailed {
		screen.wait(input, LOAD_TIME).click();
		screen.type("a", KeyModifier.CTRL); // select all text
		screen.type(Key.BACKSPACE); // delete selection
		screen.type(input, text);
	}

	public boolean isElementExists(Pattern element) throws FindFailed {
		if (screen.exists(element, LOAD_TIME) != null) {
			return true;
		} else {
			return false;
		}
	}

}
