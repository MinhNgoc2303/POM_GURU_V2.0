package com.bankguru.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.CommonFunctions;

public class EditCustomerPage extends CommonFunctions{

	public EditCustomerPage(WebDriver driver) {
		super(driver);
	}
	
	//public static String CUSTOMERID_TXT = "//input[@name='cusid']";
	@FindBy(name = "cusid")
	WebElement CUSTOMERID_TXT;
	//public static String CUSTOMERID_LBL = "//label[@id='message14']";
	@FindBy(id = "message14")
	WebElement CUSTOMERID_LBL;
	
	//public static String SUBMIT_BTN = "//input[@name='AccSubmit']";
	@FindBy(name = "AccSubmit")
	WebElement SUBMIT_BTN;
	
//	public static String ADDRESS_TXT = "//textarea[@name='addr']";
	@FindBy(name = "addr")
	WebElement ADDRESS_TXT;
//	public static String ADDRESS_LBL = "//label[@id='message3']";
	@FindBy(id = "message3")
	WebElement ADDRESS_LBL;
//	
//	public static String CITY_TXT = "//input[@name='city']";
	@FindBy(name = "city")
	WebElement CITY_TXT;
//	public static String CITY_LBL = "//label[@id='message4']";
	@FindBy(id = "message4")
	WebElement CITY_LBL;
//	
//	public static String STATE_TXT = "//input[@name='state']";
	@FindBy(name = "state")
	WebElement STATE_TXT;
//	public static String STATE_LBL = "//label[@id='message5']";
	@FindBy(id = "message5")
	WebElement STATE_LBL;
//	
//	public static String PINFIELD_TXT= "//input[@name='pinno']";
	@FindBy(name = "pinno")
	WebElement PINFIELD_TXT;
//	public static String PINFIELD_LBL = "//label[@id='message6']";
	@FindBy(id = "message6")
	WebElement PINFIELD_LBL;
//	
//	public static String TELEPHONEFIELD_TXT = "//input[@name='telephoneno']";
	@FindBy(name = "telephoneno")
	WebElement TELEPHONEFIELD_TXT;
//	public static String TELEPHONEFIELD_LBL = "//label[@id='message7']";
	@FindBy(id = "message7")
	WebElement TELEPHONEFIELD_LBL;
//	
//	public static String EMAILFIELD_TXT = "//input[@name='emailid']";
	@FindBy(css = "input[name=emailid]")
	WebElement EMAILFIELD_TXT;
//	public static String EMAILFIELD_LBL = "//label[@id='message9']";
	@FindBy(css = "label#message9")
	WebElement EMAILFIELD_LBL;
//	
	
	public void inputToCustomerId(String value) {
		waitForElementVisible(CUSTOMERID_TXT);
		inputElement(CUSTOMERID_TXT, value);
	}
	
	public void pressToCustomerId(Keys key) {
		waitForElementVisible( CUSTOMERID_TXT);
		sendKeyPress( CUSTOMERID_TXT, key);
	}
	
	public String getMessageOfCustomerId() {
		waitForElementVisible( CUSTOMERID_LBL);
		return getTextElement( CUSTOMERID_LBL) ;	
	}
	
	public void clickSubmitEditCustomer() {
		waitForElementVisible( SUBMIT_BTN);
		clickToElement( SUBMIT_BTN);
	}
	
	public String getTilelEditPage() {
		return getTitle();
	}
	
	
	public void clearTextToAddressField() {
		waitForElementVisible( ADDRESS_TXT);
		clearElement( ADDRESS_TXT);
	}
	
	public void pressToAddressField(Keys key) {
		waitForElementVisible( ADDRESS_TXT);
		sendKeyPress( ADDRESS_TXT, key);
	}
	
	public String getMessageAddressField() {
		waitForElementVisible( ADDRESS_LBL);
		return getTextElement( ADDRESS_LBL);
	}
	
	
	
	public void clearTextToCityField() {
		waitForElementVisible( CITY_TXT);
		clearElement( CITY_TXT);
	}
	
	public void pressToCityField(Keys key) {
		waitForElementVisible( CITY_TXT);
		sendKeyPress( CITY_TXT, key);
	}
	
	public String getMessageCityField() {
		waitForElementVisible( CITY_LBL);
		return getTextElement( CITY_LBL);
	}
	
	public void inputToCityField(String value) {
		waitForElementVisible( CITY_TXT);
		inputElement( CITY_TXT, value);
	}
	
	
	
	public void clearTextToStateField() {
		waitForElementVisible( STATE_TXT);
		clearElement( STATE_TXT);
	}
	
	public void pressToStateField(Keys key) {
		waitForElementVisible( STATE_TXT);
		sendKeyPress( STATE_TXT, key);
	}
	
	public void inputToStateField(String value) {
		waitForElementVisible( STATE_TXT);
		inputElement( STATE_TXT, value);
	}
	
	public String getMessageStateField() {
		waitForElementVisible( STATE_LBL);
		return getTextElement( STATE_LBL);
	}
	
	
	public void clearTextToPINField() {
		waitForElementVisible( PINFIELD_TXT);
		clearElement( PINFIELD_TXT);
	}
	
	public void pressToPINField(Keys key) {
		waitForElementVisible( PINFIELD_TXT);
		sendKeyPress( PINFIELD_TXT, key);
	}
	
	public void inputToPINField(String value) {
		waitForElementVisible( PINFIELD_TXT);
		inputElement( PINFIELD_TXT, value);
	}
	
	public String getMessagePINField() {
		waitForElementVisible( PINFIELD_LBL);
		return getTextElement( PINFIELD_LBL);
	}
	
	
	public void clearTextToTelephoneField() {
		waitForElementVisible( TELEPHONEFIELD_TXT);
		clearElement( TELEPHONEFIELD_TXT);
	}
	
	public void pressToTelephoneField(Keys key) {
		waitForElementVisible( TELEPHONEFIELD_TXT);
		sendKeyPress( TELEPHONEFIELD_TXT, key);
	}
	
	public void inputToTelephoneField(String value) {
		waitForElementVisible( TELEPHONEFIELD_TXT);
		inputElement( TELEPHONEFIELD_TXT, value);
	}
	
	public String getMessageTelephoneField() {
		waitForElementVisible( TELEPHONEFIELD_LBL);
		return getTextElement( TELEPHONEFIELD_LBL);
	}
	
	
	public void clearTextToEmailField() {
		waitForElementVisible( EMAILFIELD_TXT);
		clearElement( EMAILFIELD_TXT);
	}
	
	public void pressToEmailField(Keys key) {
		waitForElementVisible( EMAILFIELD_TXT);
		sendKeyPress( EMAILFIELD_TXT, key);
	}
	
	public void inputToEmailField(String value) {
		waitForElementVisible( EMAILFIELD_TXT);
		inputElement( EMAILFIELD_TXT, value);
	}
	
	public String getMessageEmailField() {
		waitForElementVisible( EMAILFIELD_LBL);
		return getTextElement( EMAILFIELD_LBL);
	}
	

}
