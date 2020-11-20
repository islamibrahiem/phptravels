package tests;

import org.testng.annotations.Test;

import pages.RegisterationPage;

public class RegisterationPageTest extends TestBase {
	
	String test_firstNameTxt = "ibrahiem";
	String test_lastNameTxt = "Ali";
	
	RegisterationPage registerationPageObject;
	
	@Test
	public void test_inputTheRegisterationData()
	{
		registerationPageObject = new RegisterationPage(driver);
		registerationPageObject.inputTheRegisterationData(test_firstNameTxt,
				                                          test_lastNameTxt);
	}

}
