package com.bankguru.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.CommonFunctions;

public class NewCustomerPage extends CommonFunctions {

	public NewCustomerPage(WebDriver driver) {
		super(driver);
	}

	//public static String CUSTOMERNAME_TXT = "//input[@name='name']";
	@FindBy(name = "name")
	WebElement CUSTOMERNAME_TXT;
	//public static String CUSTOMERNAME_MSG = "//label[@id='message']";
	@FindBy(id = "message")
	WebElement CUSTOMERNAME_MSG;
	
	//public static String ADDRESS_TXT = "//textarea[@name='addr']";
	@FindBy(name = "addr")
	WebElement ADDRESS_TXT;
	//public static String ADDRESS_LBL = "//label[@id='message3']";
	@FindBy(id = "message3")
	WebElement ADDRESS_LBL;
	
	//public static String CITYFIELD_TXT= "//input[@name='city']";
	@FindBy(name = "city")
	WebElement CITYFIELD_TXT;
	//public static String CITYFIELD_LBL = "//label[@id='message4']";
	@FindBy(id = "message4")
	WebElement CITYFIELD_LBL;
	
	//public static String STATEFIELD_TXT ="//input[@name='state']";
	@FindBy(name = "state")
	WebElement STATEFIELD_TXT;
	//public static String STATEFIELD_LBL = "//label[@id='message5']";
	@FindBy(id = "message5")
	WebElement STATEFIELD_LBL;
	
	//public static String PINFIELD_TXT= "//input[@name='pinno']";
	@FindBy(name = "pinno")
	WebElement PINFIELD_TXT;
	//public static String PINFIELD_LBL = "//label[@id='message6']";
	@FindBy(id = "message6")
	WebElement PINFIELD_LBL;
	
	//public static String TELEPHONEFIELD_TXT = "//input[@name='telephoneno']";
	@FindBy(name = "telephoneno")
	WebElement TELEPHONEFIELD_TXT;
	//public static String TELEPHONEFIELD_LBL = "//label[@id='message7']";
	@FindBy(id = "message7")
	WebElement TELEPHONEFIELD_LBL;
	
	//public static String EMAILFIELD_TXT = "//input[@name='emailid']";
	@FindBy(name = "emailid")
	WebElement EMAILFIELD_TXT;
	//public static String EMAILFIELD_LBL = "//label[@id='message9']";
	@FindBy(id = "message9")
	WebElement EMAILFIELD_LBL;
	
	//public static String DATEOFBIRTH_TXT = "//input[@name='dob']";
	@FindBy(name = "dob")
	WebElement DATEOFBIRTH_TXT;
	
	//public static String PASSWORDNEWCUSTOMER_TXT ="//input[@name='password']";
	@FindBy(name = "password")
	WebElement PASSWORDNEWCUSTOMER_TXT;
	
	//public static String SUBMITNEWCUSTOMER_BTN="//input[@name='sub']";
	@FindBy(name = "sub")
	WebElement SUBMITNEWCUSTOMER_BTN;
	
	//public static String CUSTOMERID_LBL="//td[contains(text(), 'Customer ID')]/following-sibling::td";
	@FindBy(xpath = "//td[contains(text(), 'Customer ID')]/following-sibling::td")
	WebElement CUSTOMERID_LBL;
	
	
	
	
	public void pressKeysToCustomerName(Keys key) {
		waitForElementVisible(CUSTOMERNAME_TXT);
		sendKeyPress(CUSTOMERNAME_TXT, key);
	}

	public String getMessageCustomerName() {
		waitForElementVisible(CUSTOMERNAME_MSG);
		return getTextElement(CUSTOMERNAME_MSG);

	}

	public void inputCustomerName(String value) {
		waitForElementVisible(CUSTOMERNAME_TXT);
		inputElement(CUSTOMERNAME_TXT, value);
	}
	
	
	public void pressKeyToAddress(Keys key) {
		waitForElementVisible(ADDRESS_TXT);
		sendKeyPress(ADDRESS_TXT, key);
	}

	public String getMessageAdressField() {
		waitForElementVisible(ADDRESS_LBL);
		return getTextElement(ADDRESS_LBL);
	}
	
	public void inputAddress(String value) {
		waitForElementVisible(ADDRESS_TXT);
		inputElement(ADDRESS_TXT, value);
	}
	
	public void pressKeyToCityField(Keys key) {
		waitForElementVisible(CITYFIELD_TXT);
		sendKeyPress(CITYFIELD_TXT, key);
	}
	
	public String getMessageCityField( ) {
		waitForElementVisible(CITYFIELD_LBL);
		return getTextElement(CITYFIELD_LBL);	
	}
	
	public void inputCityField(String value) {
		waitForElementVisible(CITYFIELD_TXT);
		inputElement(CITYFIELD_TXT, value);
	}
	
	
	public void pressKeyToStateField(Keys key) {
		waitForElementVisible(STATEFIELD_TXT);
		sendKeyPress(STATEFIELD_TXT, key);
	}
	
	public String getMessageStateField( ) {
		waitForElementVisible(STATEFIELD_LBL);
		return getTextElement(STATEFIELD_LBL);	
	}
	
	public void inputStateField(String value) {
		waitForElementVisible(STATEFIELD_TXT);
		inputElement(STATEFIELD_TXT, value);
	}
	
	
	public void pressKeyToPINField(Keys key) {
		waitForElementVisible(PINFIELD_TXT);
		sendKeyPress(PINFIELD_TXT, key);
	}
	
	public String getMessagePINField( ) {
		waitForElementVisible(PINFIELD_LBL);
		return getTextElement(PINFIELD_LBL);	
	}
	
	public void inputPINField(String value) {
		waitForElementVisible(PINFIELD_TXT);
		inputElement(PINFIELD_TXT, value);
	}
	
	
	public void pressKeyToTelephoneField(Keys key) {
		waitForElementVisible(TELEPHONEFIELD_TXT);
		sendKeyPress(TELEPHONEFIELD_TXT, key);
	}
	
	public String getMessageTelephoneField( ) {
		waitForElementVisible(TELEPHONEFIELD_LBL);
		return getTextElement(TELEPHONEFIELD_LBL);	
	}
	
	public void inputTelephoneField(String value) {
		waitForElementVisible(TELEPHONEFIELD_TXT);
		inputElement(TELEPHONEFIELD_TXT, value);
	}
	
	
	public void pressKeyToEmailField(Keys key) {
		waitForElementVisible(EMAILFIELD_TXT);
		sendKeyPress(EMAILFIELD_TXT, key);
	}
	
	public String getMessageEmailField( ) {
		waitForElementVisible(EMAILFIELD_LBL);
		return getTextElement(EMAILFIELD_LBL);	
	}
	
	public void inputEmailField(String value) {
		waitForElementVisible(EMAILFIELD_TXT);
		inputElement(EMAILFIELD_TXT, value);
	}
	public void inputDateOfBirth(String value) {
		waitForElementVisible(DATEOFBIRTH_TXT);
		removeAttributeElement(DATEOFBIRTH_TXT, "type");
		inputElement(DATEOFBIRTH_TXT, value);
	}

	public void inputPasswordNewCustomer(String value) {
		waitForElementVisible(PASSWORDNEWCUSTOMER_TXT);
		inputElement(PASSWORDNEWCUSTOMER_TXT, value);
	}
	
	public void clickSubmitNewCustomer() {
		waitForElementVisible(SUBMITNEWCUSTOMER_BTN);
		clickToElement(SUBMITNEWCUSTOMER_BTN);
	}
	
	public String getCustomerId() {
		waitForElementVisible(CUSTOMERID_LBL);
		return getTextElement(CUSTOMERID_LBL);
		
	}
}
