package tests;

import org.testng.annotations.Test;

import pages.BlogPage;
import pages.BlogRegistrationPage;

public class BlogRegisterationPageTest extends TestBase{

	//HomePage homePageObject;
	BlogPage blogPageObject;
	BlogRegistrationPage blogRegistrationPageObject; 
	String test_userNameTxt = "ahmed";
	String test_emailTxt = "ahmed_1996@test.com";
	String test_password = "ahmedalitest";
	String test_confirmPassword = "ahmedalitest";

	@Test(priority = 1)
	public void test_openBlogPage ()
	{

		driver.navigate().to("https://phptravels.com"+"/blog/");
	}
	@Test(priority = 2)
	public void test_openBlogRegistrationPage ()
	{
		blogPageObject = new BlogPage(driver);
		blogPageObject.openBlogRegisterationPage();
		blogRegistrationPageObject = new BlogRegistrationPage(driver);
		blogRegistrationPageObject.inputBlogResgistrationData(test_userNameTxt,
			                                               	  test_emailTxt,
				                                              test_password,
				                                              test_confirmPassword);
	}

}
