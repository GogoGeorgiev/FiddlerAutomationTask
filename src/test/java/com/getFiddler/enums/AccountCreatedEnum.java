package com.getFiddler.enums;

import org.sikuli.script.Pattern;

import com.getFiddler.utils.Utils;

public enum AccountCreatedEnum {
	ACCOUNT_CREATED_PAGE(Utils.getImage("resources/accountCreatedPage/pageAccountCreated.png"));

	private Pattern pattern;

	AccountCreatedEnum(Pattern pattern) {
		this.pattern = pattern;
	}

	public Pattern getValue() {
		return this.pattern;
	}

}
