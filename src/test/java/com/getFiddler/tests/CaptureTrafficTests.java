package com.getFiddler.tests;

import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.getFiddler.enums.HomeEnum;
import com.getFiddler.pages.HomePage;
import com.getFiddler.pages.SignInPage;
import com.getFiddler.utils.Utils;

public class CaptureTrafficTests extends BaseTest {

	@Test
	public void CaptureTrafficTest() throws FindFailed {

		SignInPage signInPage = new SignInPage();
		HomePage homePage = new HomePage();

		signInPage.loginUser();

		homePage.clickButton(HomeEnum.REMOVE_ALL_BUTTON.getValue());

		openUrl("https://getfiddler.com/");
		// Bring back the the focus on the Fiddler application
		Utils.openApplication();

		Assert.assertTrue(signInPage.isElementExists(HomeEnum.LIVE_TRAFFIC_RESULT_IMG.getValue()));
	}
}
