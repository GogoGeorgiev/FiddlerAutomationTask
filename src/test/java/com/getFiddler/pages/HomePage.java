package com.getFiddler.pages;

import org.sikuli.script.FindFailed;

import com.getFiddler.enums.HomeEnum;

public class HomePage extends BasePage {

	public void logoutUser() throws FindFailed {
		if (isElementExists(HomeEnum.WELCOME_IMG.getValue())) {
			clickButton(HomeEnum.X_BUTTON.getValue());
		}
		clickButton(HomeEnum.PROFILE_BUTTON.getValue());
		clickButton(HomeEnum.LOGOUT_BUTTON.getValue());
	}

}
