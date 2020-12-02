package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name = "username")
	WebElement emailField;
	
	@FindBy(name = "password")
	WebElement passwordField;
	
	@FindBy(css = "button.btn.btn-primary.btn-lg.btn-block.loginbtn")
	WebElement loginBtn;
	
	public void login (String emailTxt , String passwordTxt)
	{
		setTextElementText(emailField, emailTxt);
		setTextElementText(passwordField, passwordTxt);
		clickButton(loginBtn);
	}
	

}
