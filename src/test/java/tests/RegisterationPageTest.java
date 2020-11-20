package tests;

import org.testng.annotations.Test;

import pages.RegisterationPage;

public class RegisterationPageTest extends TestBase {

	String test_firstNameTxt = "ibrahiem";
	String test_lastNameTxt = "Ali";
	String test_emailTxt = "ibrahiem@test.com";
	String test_companyNameTxt = "IBM";
	String test_address1Txt = "opera street";
	String test_address2Txt = "metro street";
	String test_cityTxt = "cairo";
	String test_stateTxt = "cairoo";
	String test_postcodeTxt ="123456";
	String test_mobileNumberTxt ="12345678912";
	String test_passwordTxt = "Test_1993";
	String test_confirmPasswordTxt = "Test_1993";

	RegisterationPage registerationPageObject;

	@Test
	public void test_inputTheRegisterationData()
	{
		registerationPageObject = new RegisterationPage(driver);
		registerationPageObject.inputTheRegisterationData(
				test_firstNameTxt,
				test_lastNameTxt,
				test_emailTxt,
				test_companyNameTxt,
				test_address1Txt,
				test_address2Txt,
				test_cityTxt,
				test_stateTxt,
				test_postcodeTxt,
				test_mobileNumberTxt,
				test_passwordTxt,
				test_confirmPasswordTxt
				);
	}

}
