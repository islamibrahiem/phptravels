package tests;

import org.testng.annotations.Test;

import pages.MyAccountPage;

public class TestLogout extends TestBase {
	
	MyAccountPage myAccountPageObject;

	
	@Test
	public void test_Logout () throws InterruptedException 
	{
		myAccountPageObject = new MyAccountPage(driver);
		myAccountPageObject.clickOnMyAccountDropDownList();
		myAccountPageObject.logout();
	}

}
