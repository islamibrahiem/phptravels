package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

	}

	@FindBy(css = "i.bx.bx-user")
	WebElement userNameDropDownList;
	@FindBy(linkText = "Logout")
	WebElement logoutBtn;
	@FindBy(linkText = "MY PROFILE")
	WebElement myprofileBtn;
	@FindBy(linkText = "NEWSLETTER")
	WebElement newsLetterBtn;
	@FindBy(linkText = "HOME")
	WebElement homeBtn;



	public void clickOnMyAccountDropDownList()
	{
		clickButton(userNameDropDownList);
	}

	public void logout () {
		clickButton(logoutBtn);
	}
	public void openMyProfilePage()
	{
		clickButton(myprofileBtn);
	}
	public void openNewsLetterPage()
	{
		clickButton(newsLetterBtn);
	}
	public void openHomePage()
	{
		clickButton(homeBtn);
	}


}
