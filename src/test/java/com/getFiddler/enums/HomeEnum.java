package com.getFiddler.enums;

import org.sikuli.script.Pattern;

import com.getFiddler.utils.Utils;

public enum HomeEnum {
	X_BUTTON(Utils.getImage("resources/homePage/btnX.png")),
	WELCOME_IMG(Utils.getImage("resources/homePage/imgWelcome.png")),
	PROFILE_BUTTON(Utils.getImage("resources/homePage/btnProfile.png")),
	LOGOUT_BUTTON(Utils.getImage("resources/homePage/btnSignOut.png")),
	REMOVE_ALL_BUTTON(Utils.getImage("resources/homePage/btnRemoveAll.png")),
	LIVE_TRAFFIC_RESULT_IMG(Utils.getImage("resources/homePage/imgLiveTrafficResult.png"));

	private Pattern pattern;

	HomeEnum(Pattern pattern) {
		this.pattern = pattern;
	}

	public Pattern getValue() {
		return this.pattern;
	}

}
