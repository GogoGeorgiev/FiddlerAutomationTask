package com.getFiddler.tests;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.getFiddler.utils.DriversEnum;
import com.getFiddler.utils.Utils;
import com.getFiddler.utils.WebDriverBuilder;

public class BaseTest {

	private static WebDriver driver;

	@BeforeMethod(alwaysRun = true)
	public void setUp() throws FindFailed {
		Utils.openApplication();
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		Utils.closeApplication();
		if (driver != null) {
			driver.quit();
		}
	}

	public static void openUrl(String url) {
		driver = WebDriverBuilder.getDriverFor(DriversEnum.CHROME.getBrowserName());
		driver.get(url);
	}

}
