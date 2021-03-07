package com.getFiddler.utils;

import static org.testng.Assert.fail;

import java.security.SecureRandom;

import org.sikuli.script.App;
import org.sikuli.script.Pattern;

import com.getFiddler.pages.BasePage;

public class Utils {

	private static final String SOURCE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private static SecureRandom secureRnd = new SecureRandom();

	private static ConfigurationProperties config = new ConfigurationProperties();

	public static void openApplication() {
		System.out.println(config.getAppPath());
		// Open the specified application, or switch to it, if it is already open.
		App.open(config.getAppPath());
	}

	public static void closeApplication() {
		App.close("Fiddler Everywhere");
	}

	public static Pattern getImage(String imagePath) {
		try {
			return new Pattern(BasePage.class.getClassLoader().getResource(imagePath)).similar((float) 0.7);
		} catch (Exception e) {
			fail("Image not found!");
			return null;
		}
	}

	/**
	 * Generate a random string.
	 *
	 * @param length of the generated string.
	 * @return
	 */
	public static String randomString(int length) {
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++)
			sb.append(SOURCE.charAt(secureRnd.nextInt(SOURCE.length())));
		return sb.toString();
	}

}
