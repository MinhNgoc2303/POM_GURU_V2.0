package com.bankguru.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.CommonFunctions;

public class RegisterPage extends CommonFunctions {

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	//public static String EMAIL_TXT = "//input[@name='emailid']";
	@FindBy(name = "emailid")
	WebElement EMAIL_TXT;
	
	//public static String SUBMIT_BTN = "//input[@name='btnLogin']";
	@FindBy(name = "btnLogin")
	WebElement SUBMIT_BTN;
	
	//public static String USERNAME_LBL = "//td[contains(text(),'User ID :')]/following-sibling::td";
	@FindBy(xpath = "//td[contains(text(),'User ID :')]/following-sibling::td")
	WebElement USERNAME_LBL;
	
	//public static String PASSWORD_LBL = "//td[contains(text(),'Password :')]/following-sibling::td";
	@FindBy(xpath = "//td[contains(text(),'Password :')]/following-sibling::td")
	WebElement PASSWORD_LBL;
	
	
	
	public void inputEmail(String value) {
		waitForElementVisible(EMAIL_TXT);
		inputElement(EMAIL_TXT, value);
	}
	public void clickRegister() {
		waitForElementVisible(SUBMIT_BTN);
		clickToElement(SUBMIT_BTN);
	}

	public String getUserName() {
		waitForElementVisible(USERNAME_LBL);
		return getTextElement(USERNAME_LBL);
	}
	
	public String getPassword() {
		waitForElementVisible(PASSWORD_LBL);
		return getTextElement(PASSWORD_LBL);
	}
	public void openLogInBankGuru(String url) {
		navigateToUrl(url);
	}
}
