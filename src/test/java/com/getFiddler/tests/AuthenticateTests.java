package com.getFiddler.tests;

import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.getFiddler.enums.SignInEnum;
import com.getFiddler.pages.SignInPage;
import com.getFiddler.pages.HomePage;

public class AuthenticateTests extends BaseTest {

	@Test
	public void AuthenticateTest() throws FindFailed {

		SignInPage signInPage = new SignInPage();
		HomePage homePage = new HomePage();

		signInPage.navigateToSignInPage();
		signInPage.loginUser();

		homePage.logoutUser();

		Assert.assertTrue(signInPage.isElementExists(SignInEnum.SIGNIN_PAGE.getValue()));
	}

}
