package com.getFiddler.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.getFiddler.utils.WebDriverBuilder;

public class WebDriverBuilder {

	private static final int IMPLICITLY_WAIT_VALUE = 30;
	private static final int PAGE_LOADOUT_WAIT_VALUE = 180;

	/**
	 * Static method for choosing the web driver Setup of the drivers and browsers
	 */
	public static WebDriver getDriverFor(String browser) {
		DriversEnum specificDriver = DriversEnum.valueOf(browser.toUpperCase());

		WebDriver driver = null;

		switch (specificDriver) {
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case SAFARI:
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case IE:
			driver = new InternetExplorerDriver();
			break;
		}

		// Maximize the browser window
		driver.manage().window().maximize();

		// Set timeouts for web elements and page load
		driver.manage().timeouts().implicitlyWait(IMPLICITLY_WAIT_VALUE, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOADOUT_WAIT_VALUE, TimeUnit.SECONDS);

		return driver;
	}

}
