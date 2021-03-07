package com.getFiddler.enums;

import org.sikuli.script.Pattern;

import com.getFiddler.utils.Utils;

public enum SignInEnum {
	SIGNIN_PAGE(Utils.getImage("resources/signInPage/pageSignIn.png")),
	EMAIL_FIELD(Utils.getImage("resources/signInPage/inputEmail.png")),
	PASSWORD_FIELD(Utils.getImage("resources/signInPage/inputPass.png")),
	SIGNIN_BUTTON(Utils.getImage("resources/signInPage/btnSignIn.png")),
	CREATE_ACCOUNT_BUTTON(Utils.getImage("resources/signInPage/btnCreateAccount.png"));

	private Pattern pattern;

	SignInEnum(Pattern pattern) {
		this.pattern = pattern;
	}

	public Pattern getValue() {
		return this.pattern;
	}

}
