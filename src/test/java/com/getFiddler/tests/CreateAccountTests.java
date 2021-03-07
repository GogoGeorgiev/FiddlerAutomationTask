package com.getFiddler.tests;

import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.getFiddler.enums.AccountCreatedEnum;
import com.getFiddler.enums.CreateAccountEnum;
import com.getFiddler.enums.SignInEnum;
import com.getFiddler.pages.CreateAccountPage;
import com.getFiddler.pages.SignInPage;
import com.getFiddler.utils.Utils;

public class CreateAccountTests extends BaseTest {

	@Test
	public void CreateNewAccountTest() throws FindFailed {

		SignInPage signInPage = new SignInPage();
		CreateAccountPage createAccountPage = new CreateAccountPage();

		signInPage.navigateToSignInPage();
		signInPage.clickButton(SignInEnum.CREATE_ACCOUNT_BUTTON.getValue());

		createAccountPage.populateField(CreateAccountEnum.FIRST_NAME_FIELD.getValue(), Utils.randomString(6));
		createAccountPage.populateField(CreateAccountEnum.LAST_NAME_FIELD.getValue(), Utils.randomString(6));
		createAccountPage.populateField(CreateAccountEnum.EMAIL_FIELD.getValue(), Utils.randomString(6) + "@test.test");
		createAccountPage.populateField(CreateAccountEnum.USERNAME_FIELD.getValue(), Utils.randomString(6));
		createAccountPage.populateField(CreateAccountEnum.PASSWORD_FIELD.getValue(), Utils.randomString(8));

		createAccountPage.clickButton(CreateAccountEnum.CREATE_NEW_ACCOUNT_BUTTON.getValue());

		Assert.assertTrue(createAccountPage.isElementExists(AccountCreatedEnum.ACCOUNT_CREATED_PAGE.getValue()));
	}
}
