package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends PageBase {

	public BlogPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="/html/body/header/nav/div/div[2]/div/ul[2]/li[2]/a")
	WebElement blogRegisterbtn;
	
	public void openBlogRegisterationPage ()
	{
	clickButton(blogRegisterbtn);	
	}

}
