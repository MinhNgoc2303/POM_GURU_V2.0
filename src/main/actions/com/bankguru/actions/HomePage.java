package com.bankguru.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonFunctions;

public class HomePage extends CommonFunctions{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//public static String WELCOME_LBL ="//marquee[contains(text(),'Welcome')]";
	@FindBy(tagName = "marquee")
	WebElement WELCOME_LBL;
	
	//public static String NEWCUSTOMER_LBL ="//a[contains(text(),'New Customer')]";
	@FindBy(linkText = "New Customer")
	WebElement NEWCUSTOMER_LBL;
	
	//public static String EDITCUSTOMER_LBL = "//a[contains(text(),'Edit Customer')]";
	@FindBy(linkText = "Edit Customer")
	WebElement EDITCUSTOMER_LBL;
	
	public String verifyHomePage() {
		waitForElementVisible(WELCOME_LBL);
		return getTextElement(WELCOME_LBL);
	}
	public NewCustomerPage clickNewCustomer() {
		waitForElementVisible(NEWCUSTOMER_LBL);
		clickToElement(NEWCUSTOMER_LBL);
		return PageFactory.initElements(driver, NewCustomerPage.class);
	}
	 public EditCustomerPage clickEditCustomer() {
		 waitForElementVisible(EDITCUSTOMER_LBL);
		 clickToElement(EDITCUSTOMER_LBL);
		 return PageFactory.initElements(driver, EditCustomerPage.class);
	 }

}
