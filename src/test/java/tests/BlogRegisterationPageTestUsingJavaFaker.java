package tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.BlogPage;
import pages.BlogRegistrationPage;

public class BlogRegisterationPageTestUsingJavaFaker extends TestBase{

	//HomePage homePageObject;
	BlogPage blogPageObject;
	BlogRegistrationPage blogRegistrationPageObject; 
	Faker fakeData = new Faker();
	String test_userNameTxt = fakeData.name().username();
	String test_emailTxt = fakeData.internet().emailAddress();
	String test_password = fakeData.number().digits(10).toString();
	

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
				                                              test_password);
	}

}
