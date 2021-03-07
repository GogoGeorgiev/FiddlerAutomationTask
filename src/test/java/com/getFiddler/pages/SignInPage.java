package com.getFiddler.pages;

import org.sikuli.script.FindFailed;

import com.getFiddler.enums.HomeEnum;
import com.getFiddler.enums.SignInEnum;

public class SignInPage extends BasePage {

	public void navigateToSignInPage() throws FindFailed {
		HomePage homePage = new HomePage();
		if (!isElementExists(SignInEnum.SIGNIN_BUTTON.getValue())) {
			homePage.logoutUser();
		}
	}

	public void loginUser() throws FindFailed {
		if (isElementExists(SignInEnum.SIGNIN_BUTTON.getValue())) {

			populateField(SignInEnum.EMAIL_FIELD.getValue(), email);
			populateField(SignInEnum.PASSWORD_FIELD.getValue(), password);
			clickButton(SignInEnum.SIGNIN_BUTTON.getValue());

		} else if (isElementExists(HomeEnum.WELCOME_IMG.getValue())) {
			clickButton(HomeEnum.X_BUTTON.getValue());
		}
	}
}
