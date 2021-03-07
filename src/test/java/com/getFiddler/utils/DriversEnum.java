package com.getFiddler.utils;

public enum DriversEnum {
	FIREFOX("firefox"), 
	CHROME("chrome"), 
	SAFARI("safari"), 
	IE("ie");

	private String browser;

	DriversEnum(String browser) {
		this.browser = browser;
	}

	public String getBrowserName() {
		return this.browser;
	}

}
