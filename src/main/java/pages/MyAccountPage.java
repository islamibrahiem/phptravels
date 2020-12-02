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
	
	public void clickOnMyAccountDropDownList()
	{
		clickButton(userNameDropDownList);
	}
	
	public void logout () {
		clickButton(logoutBtn);
	}
	

}
