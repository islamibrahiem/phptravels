package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.annotations.GwtIncompatible;

public class HomePage extends PageBase	{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(css = "i.bx.bx-user")
	WebElement myAccountDropDownList;
	@FindBy(linkText = "Sign Up")
	WebElement signUpBtn;
	
	public void clickOnMyAccountDropDownList()
	{
		clickButton(myAccountDropDownList);
	}
	public void openTheRegistrationPage()
	{
		clickButton(signUpBtn);
	}

}
