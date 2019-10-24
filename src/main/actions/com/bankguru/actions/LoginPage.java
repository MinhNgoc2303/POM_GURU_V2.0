package com.bankguru.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonFunctions;

public class LoginPage extends CommonFunctions{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//public static String HERE_LBL= "//a[text()='here']";
	
	@FindBy(linkText = "here")
	WebElement HERE_LBL;
	
	//public static String USERID_TXT = "//input[@name='uid']";
	
	@FindBy(name="uid")
	WebElement USERID_TXT;
	
	//public static String PASSWORD_TXT = "//input[@name='password']";
	@FindBy(name="password")
	WebElement PASSWORD_TXT;
	
	//public static String LOGIN_BTN = "//input[@name='btnLogin']";
	@FindBy(name="btnLogin")
	WebElement LOGIN_BTN;
	
	public RegisterPage clickHereLink() {
		waitForElementVisible(HERE_LBL);
		clickToElement(HERE_LBL);
		return PageFactory.initElements(driver, RegisterPage.class);
	}
	public void inputUserID(String value) {
		waitForElementVisible(USERID_TXT);
		inputElement(USERID_TXT, value);
	}
	public void inputPassword(String value) {
		waitForElementVisible(PASSWORD_TXT);
		inputElement(PASSWORD_TXT, value);
	}
	public HomePage clickLogin() {
		waitForElementVisible(LOGIN_BTN);
		clickToElement(LOGIN_BTN);
		return PageFactory.initElements(driver, HomePage.class);
	}

}
