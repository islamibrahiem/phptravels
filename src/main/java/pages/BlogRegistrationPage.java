package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BlogRegistrationPage extends PageBase {

	public BlogRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name = "username")
	WebElement userName;
	@FindBy(name = "email")
	WebElement email;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "confirm_password")
	WebElement confirmPassword;
	@FindBy(css= "i.icon-check")
	WebElement termsandConditions_checkIcon;
	@FindBy(css = "button.btn.btn-block.btn-custom.margin-top-15")
	WebElement registerBtn;
	
	public void inputBlogResgistrationData(
			                               String userNameTxt,
			                               String emailTxt,
			                               String passwordTxt,
			                               String confirmPasswordTxt) 
	{
	setTextElementText(userName, userNameTxt);
	setTextElementText(email, emailTxt);
	setTextElementText(password, passwordTxt);
	setTextElementText(confirmPassword, confirmPasswordTxt);
	clickButton(termsandConditions_checkIcon);
	clickButton(registerBtn);
	}

}
