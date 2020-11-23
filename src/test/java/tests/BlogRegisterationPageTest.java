package tests;

import org.testng.annotations.Test;

import pages.BlogPage;

public class BlogRegisterationPageTest extends TestBase{

	//HomePage homePageObject;
	BlogPage blogPageObject;

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
