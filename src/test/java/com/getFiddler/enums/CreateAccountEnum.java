package com.getFiddler.enums;

import org.sikuli.script.Pattern;

import com.getFiddler.utils.Utils;

public enum CreateAccountEnum {
	FIRST_NAME_FIELD(Utils.getImage("resources/createAccountPage/inputFirstName.png")),
	LAST_NAME_FIELD(Utils.getImage("resources/createAccountPage/inputLastName.png")),
	EMAIL_FIELD(Utils.getImage("resources/createAccountPage/inputEmail.png")),
	USERNAME_FIELD(Utils.getImage("resources/createAccountPage/inputUsername.png")),
	PASSWORD_FIELD(Utils.getImage("resources/createAccountPage/inputPassword.png")),
	CREATE_NEW_ACCOUNT_BUTTON(Utils.getImage("resources/createAccountPage/bntCreateNewAccount.png"));

	private Pattern pattern;

	CreateAccountEnum(Pattern pattern) {
		this.pattern = pattern;
	}

	public Pattern getValue() {
		return this.pattern;
	}

}
