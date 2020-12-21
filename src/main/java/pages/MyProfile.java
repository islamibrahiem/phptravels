package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfile extends PageBase {

	public MyProfile(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/aside/nav/ul/li[2]/a")
	//@FindBy(linkText  = "My Profile")
	WebElement myprofileBtn;

	public void openMyProfile()
	{
		clickButton(myprofileBtn);
	}

}
