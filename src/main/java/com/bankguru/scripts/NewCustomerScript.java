package com.bankguru.scripts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bankguru.actions.HomePage;
import com.bankguru.actions.LoginPage;
import com.bankguru.actions.NewCustomerPage;
import com.bankguru.actions.RegisterPage;

import ObjectPageJson.JsonData;
import common.CommonTestCase;

public class NewCustomerScript extends CommonTestCase {
	WebDriver driver;
	LoginPage loginPage;
	RegisterPage registerPage;
	HomePage homePage;
	String email;
	String emailNewCustomer;

	NewCustomerPage newCustomer;
	public static String custmerId;
	JsonData commonData;
	//String customerName, dateOfBirth, address, city, state, pin, mobile, emailNewCustomer, passwordNewCustomer;

	@Parameters({ "browser", "version", "url" })
	@BeforeClass
	public void BeforeClass(String browser, String version, String url) {
		inititalReport("New Account.0.html");
		String userPath = System.getProperty("user.dir");
		String pathFileJson = userPath.concat("/data/").concat("BankGuru.json");

		commonData = getDataJson(pathFileJson);
		
		emailNewCustomer = "mimi" + randomemail() + "@gmail.com";

		driver = openBrowser(browser, version, url);// ham tra ve webdriver
		email = "ngoc" + randomemail() + "@gmail.com";

		loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.inputUserID(RegisterNewAccountScript.username);
		loginPage.inputPassword(RegisterNewAccountScript.password);
		homePage = loginPage.clickLogin();

		String welcomText = homePage.verifyHomePage();

		assertTrue(welcomText.contains("Welcome"));
	}

	@BeforeMethod
	public void BeforeMethod() {
		newCustomer = homePage.clickNewCustomer();
	}

	@Test
	public void NC01_NewCustomer01() {
		logTestCase("NC01_NewCustomer01");
		newCustomer.pressKeysToCustomerName(Keys.TAB);
		String msgcustomernameActual = newCustomer.getMessageCustomerName();
		assertEquals(msgcustomernameActual,commonData.getNewCustomer().getMsgcustomernameExpected());
	}

	@Test
	public void NC02_NumericCase() {
		logTestCase("NC02_NumericCase");
		newCustomer.inputCustomerName(commonData.getNewCustomer().getNumericCase());
		//assertEquals(newCustomer.getMessageCustomerName(), msgNumericCaseExpected);
		assertEquals(newCustomer.getMessageCustomerName(), commonData.getNewCustomer().getMsgNumericCaseExpected());
	}

	@Test
	public void NC03_SpecialCharacters() {
		logTestCase("NC03_SpecialCharactersNgoc");
		newCustomer.inputCustomerName(commonData.getNewCustomer().getSpecialCharacter());
		assertEquals(newCustomer.getMessageCustomerName(), commonData.getNewCustomer().getExpectedSpecialCharactersMsg());
	}

	@Test
	public void NC04_FirstCharacterBlank() {
		logTestCase("NC04_FirstCharacterBlank+Test");
		newCustomer.inputCustomerName(" ");;
//		assertEquals(newCustomer.getMessageCustomerName(), expectedBlankCase);
		assertEquals(newCustomer.getMessageCustomerName(), commonData.getNewCustomer().getExpectedBlankCase());
	}

	@Test
	public void NC05_AddressEmplty() {
		logTestCase("NC05_AddressEmplty");
		newCustomer.pressKeyToAddress(Keys.TAB);
//		assertEquals(newCustomer.getMessageAdressField(), addressEmptyExpected_msg);
		assertEquals(newCustomer.getMessageAdressField(), commonData.getNewCustomer().getAddressEmptyExpectedMsg());
	}

	@Test
	public void NC06_AddressHaveSpace() {
		logTestCase("NC06_AddressHaveSpace");
		newCustomer.inputAddress(" ");
//		assertEquals(newCustomer.getMessageAdressField(), expectedBlankCase);
		assertEquals(newCustomer.getMessageAdressField(), commonData.getNewCustomer().getExpectedBlankCase());

	}

	@Test
	public void NC08_CityFiledEmpty() {
		logTestCase("NC08_CityFiledEmpty");
		newCustomer.pressKeyToCityField(Keys.TAB);
//		asserEqual(newCustomer.getMessageCityField(), cityEmptyExpected);
		asserEqual(newCustomer.getMessageCityField(), commonData.getNewCustomer().getCityEmptyExpected());
	}

	@Test
	public void NC09_CityWithNumberic() {
		logTestCase("NC09_CityWithNumberic");
		newCustomer.inputCityField(commonData.getNewCustomer().getNumericCase());
		asserEqual(newCustomer.getMessageCityField(), commonData.getNewCustomer().getMsgNumericCaseExpected());
	}

	@Test
	public void NC10_CityWithSpecialCharacter() {
		logTestCase("NC10_CityWithSpecialCharacter");
		newCustomer.inputCityField(commonData.getNewCustomer().getSpecialCharacter());
		asserEqual(newCustomer.getMessageCityField(), commonData.getNewCustomer().getExpectedSpecialCharactersMsg());
	}

	@Test
	public void NC11_CityHaveSpace() {
		logTestCase("NC11_CityHaveSpace");
		newCustomer.pressKeyToCityField(Keys.TAB);
//		assertEquals(newCustomer.getMessageCityField(), expectedEmptyCityField_msg);
		assertEquals(newCustomer.getMessageCityField(), commonData.getNewCustomer().getExpectedEmptyCityFieldMsg());
	}

	@Test
	public void NC12_StateFieldEmpty() {
		logTestCase("NC12_StateFieldEmpty");
		newCustomer.pressKeyToStateField(Keys.TAB);
//		assertEquals(newCustomer.getMessageStateField(), stateEmptyExpected);
		assertEquals(newCustomer.getMessageStateField(), commonData.getNewCustomer().getStateEmptyExpected());
	}

	@Test
	public void NC13_StateFieldWithNumberic() {
		logTestCase("NC13_StateFieldWithNumberic");
		newCustomer.inputStateField(commonData.getNewCustomer().getNumericCase());
		assertEquals(newCustomer.getMessageStateField(), commonData.getNewCustomer().getMsgNumericCaseExpected());
	}

	@Test
	public void NC14_StateFieldWithSpecialCharacter() {
		logTestCase("NC14_StateFieldWithSpecialCharacter");
		newCustomer.inputStateField(commonData.getNewCustomer().getSpecialCharacter());
		assertEquals(newCustomer.getMessageStateField(), commonData.getNewCustomer().getExpectedSpecialCharactersMsg());
	}

	@Test
	public void NC15_SateFieldWithSpace() {
		logTestCase("NC15_SateFieldWithSpace");
		newCustomer.inputStateField(" ");
//		assertEquals(newCustomer.getMessageStateField(), expectedBlankCase);
		assertEquals(newCustomer.getMessageStateField(), commonData.getNewCustomer().getExpectedBlankCase());

	}

	@Test
	public void NC16_PINFiledWithNumberic() {
		logTestCase("NC16_PINFiledWithNumberic");
		newCustomer.inputPINField(commonData.getNewCustomer().getInvalidNumberic());
		assertEquals(newCustomer.getMessagePINField(), commonData.getNewCustomer().getInvalidNumbericexpectedInvalidNUmbericMsg());
	}

	@Test
	public void NC17_PinFieldEmpty() {
		logTestCase("NC17_PinFieldEmpty");
		newCustomer.pressKeyToPINField(Keys.TAB);
//		assertEquals(newCustomer.getMessagePINField(), expectedEmptyPIN_msg);
		assertEquals(newCustomer.getMessagePINField(), commonData.getNewCustomer().getExpectedEmptyPINMsg());
	}

	@Test
	public void NC18_PinFieldHave6Digits() {
		logTestCase("NC18_PinFieldHave6Digits");
		newCustomer.inputPINField(commonData.getNewCustomer().getNumericCase());
		asserEqual(newCustomer.getMessagePINField(), commonData.getNewCustomer().getExpectedInvalidPINMsg());
	}

	@Test
	public void NC19_PinFieldWithSpecialCharcter() {
		logTestCase("NC19_PinFieldWithSpecialCharcter");
		newCustomer.inputPINField(commonData.getNewCustomer().getSpecialCharacter());
		assertEquals(newCustomer.getMessagePINField(), commonData.getNewCustomer().getExpectedSpecialCharactersMsg());
	}

	@Test
	public void NC20_PinFieldWithSpace() {
		logTestCase("NC20_PinFieldWithSpace");
		newCustomer.inputPINField(" ");
//		assertEquals(newCustomer.getMessagePINField(), expectedBlankCase);
		assertEquals(newCustomer.getMessagePINField(), commonData.getNewCustomer().getExpectedBlankCase());
	}

	@Test
	public void NC21_TelephoneFieldEmpty() {
		logTestCase("NC21_TelephoneFieldEmpty");
		newCustomer.pressKeyToTelephoneField(Keys.TAB);
		asserEqual(newCustomer.getMessageTelephoneField(), commonData.getNewCustomer().getExpectedEmptyTelephoneMsg());
	}

	@Test
	public void NC22_TelephoneFieldHaveSpace() {
		logTestCase("NC22_TelephoneFieldHaveSpace");
		newCustomer.inputTelephoneField(" ");
		assertEquals(newCustomer.getMessageTelephoneField(), commonData.getNewCustomer().getExpectedBlankCase());
	}

	@Test
	public void NC25_TelephoneFieldWithSpecialCharacter() {
		logTestCase("NC25_TelephoneFieldWithSpecialCharacter");
		newCustomer.inputTelephoneField(commonData.getNewCustomer().getSpecialCharacter());
		assertEquals(newCustomer.getMessageTelephoneField(),commonData.getNewCustomer().getExpectedSpecialCharactersMsg());
	}

	@Test
	public void NC26_EmailFieldEmpty() {
		logTestCase("NC27_EmailFieldWithIncorrectFormat");
		newCustomer.pressKeyToEmailField(Keys.TAB);
		asserEqual(newCustomer.getMessageEmailField(), commonData.getNewCustomer().getExpectedEmptyEmailMsg());

	}

	@Test
	public void NC27_EmailFieldWithIncorrectFormat() {
		logTestCase("NC27_EmailFieldWithIncorrectFormat");
		newCustomer.inputEmailField(commonData.getNewCustomer().getIncorrectEmailFormat());
		assertEquals(newCustomer.getMessageEmailField(), commonData.getNewCustomer().getExpectedIncorrectEmail());

	}

	@Test
	public void NC29_EmailFieldWithSpace() {
		logTestCase("NC29_EmailFieldWithSpace");
		newCustomer.inputEmailField(commonData.getNewCustomer().getEmailHaveSpace());
		asserEqual(newCustomer.getMessageEmailField(), commonData.getNewCustomer().getExpectedIncorrectEmail());
	}

	@Test
	public void NC30_CreateNewCustomer() {
		logTestCase("NC30_CreateNewCustomer");
		newCustomer.inputCustomerName(commonData.getNewCustomer().getCustomerName());
		newCustomer.inputDateOfBirth(commonData.getNewCustomer().getDateOfBirth());
		newCustomer.inputAddress(commonData.getNewCustomer().getAddress());
		newCustomer.inputCityField(commonData.getNewCustomer().getCity());
		newCustomer.inputStateField(commonData.getNewCustomer().getState());
		newCustomer.inputPINField(commonData.getNewCustomer().getPin());
		newCustomer.inputTelephoneField(commonData.getNewCustomer().getMobile());
		newCustomer.inputEmailField(emailNewCustomer);
		newCustomer.inputPasswordNewCustomer(commonData.getNewCustomer().getPasswordNewCustomer());
		newCustomer.clickSubmitNewCustomer();
		custmerId = newCustomer.getCustomerId();
	}
	@AfterMethod
	public void afterMethod(ITestResult result) {
		getResult(result);
	}

	@AfterClass
	public void AfterClass() {
		exportReport();
		closeBrowser();

	}

}
