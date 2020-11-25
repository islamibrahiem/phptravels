package tests;

import org.testng.annotations.Test;

import pages.BlogPage;

public class BlogRegisterationPageTest extends TestBase{

	BlogPage blogPageObject;
	String test_userNameTxt = "ahmed";
	String test_emailTxt = "ahmed@test.com";
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
		
	}

}
