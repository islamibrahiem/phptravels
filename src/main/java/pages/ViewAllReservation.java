package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewAllReservation extends PageBase {

	public ViewAllReservation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(css = "i.bx.bx-user")
	WebElement myAccountDropDownList;
	@FindBy(linkText = "Account")
	WebElement accountBtn;
	
	public void clickOnMyAccountDropDownList()
	{
		clickButton(myAccountDropDownList);
	}
	public void openAccountPage()
	{
		clickButton(accountBtn);
	}
	
}
