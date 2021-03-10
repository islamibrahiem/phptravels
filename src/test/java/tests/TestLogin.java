package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class TestLogin extends TestBase {
	LoginPage loginPageObject;

	
	@Test
	public void test_Logout () throws InterruptedException 
	{
		loginPageObject = new LoginPage(driver);
		loginPageObject.login(test_emailTxt, test_password);
		Thread.sleep(1000);


	}

}
