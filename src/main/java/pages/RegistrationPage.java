package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase {

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name = "firstname")
	WebElement firstName;
	@FindBy(name = "lastname")
	WebElement lastName;
	@FindBy(name = "phone")
	WebElement phoneNumber;
	@FindBy(name = "email")
	WebElement email;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "confirmpassword")
	WebElement confirmPassword;
	@FindBy(css = "button.signupbtn.btn_full.btn.btn-success.btn-block.btn-lg")
	WebElement signUpBtn;

	public void inputResgistrationData(
			String firstNameTxt,
			String lastNameTxt,
			String phoneNumberTxt,
			String emailTxt,
			String passwordTxt,
			String confirmPasswordTxt) 
	{
		setTextElementText(firstName, firstNameTxt);
		setTextElementText(lastName, lastNameTxt);
		setTextElementText(phoneNumber, phoneNumberTxt);
		setTextElementText(email, emailTxt);
		setTextElementText(password, passwordTxt);
		setTextElementText(confirmPassword, confirmPasswordTxt);
		clickButton(signUpBtn);
	}

}
