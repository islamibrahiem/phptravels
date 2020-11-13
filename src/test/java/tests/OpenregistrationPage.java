package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class OpenregistrationPage extends TestBase {

	HomePage homepageObject ;
	
	int x;

	@Test
	public void openpage ()
	{
		homepageObject = new HomePage(driver);
		homepageObject.openRegisterPage();
	}

}