package com.getFiddler.utils;

import static org.testng.Assert.fail;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationProperties {

	private static Properties config;

	public static final String CONFIG_FILE = "config/configuration.properties";

	private String email;
	private String password;
	private String appPath;

	public ConfigurationProperties() {
		config = loadProperties(CONFIG_FILE);

		email = config.getProperty("email");
		password = config.getProperty("password");
		appPath = config.getProperty("appPath");
	}

	// Load the properties file
	private static Properties loadProperties(String file) {
		try {
			Properties prop = new Properties();
			FileInputStream in = new FileInputStream(file);

			prop.load(in);
			in.close();

			return prop;
		} catch (Exception e) {
			fail("Could not load properties");
			return null;
		}
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getAppPath() {
		return appPath;
	}
}
