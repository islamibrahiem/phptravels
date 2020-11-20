package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends PageBase {

	public RegisterationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="inputFirstName")
	WebElement firstName;
	@FindBy(id="inputLastName")
	WebElement lastName;
	@FindBy(id="inputEmail")
	WebElement email;
	@FindBy(id="inputCompanyName")
	WebElement companyName;
	@FindBy(id="inputAddress1")
	WebElement addressName1;
	@FindBy(id="inputAddress2")
	WebElement addressName2;
	@FindBy(id="inputCity")
	WebElement city ;
	@FindBy(id="stateinput")
	WebElement state;
	@FindBy(id="inputPostcode")
	WebElement postcode;
	@FindBy(id="customfield2")
	WebElement mobileNumber;
	@FindBy(id="inputNewPassword1")
	WebElement password;
	@FindBy(id="inputNewPassword2")
	WebElement confirmPassword;
	@FindBy(id="recaptcha-anchor-label")
	WebElement recaptcha_checkbox;



	public void inputTheRegisterationData (
			String firstNameTxt,
			String lastNameTxt,
			String emailTxt,
			String companyNameTxt,
			String addressName1Txt,
			String addressName2Txt,
			String cityTxt,
			String stateTxt,
			String postcodeTxt,
			String mobileNumberTxt,
			String passwordTxt,
			String confirmPasswordTxt
			) {
		setTextElementText(firstName, firstNameTxt);
		setTextElementText(lastName, lastNameTxt);
		setTextElementText(email, emailTxt);
		setTextElementText(companyName, companyNameTxt);
		setTextElementText(addressName1, addressName1Txt);
		setTextElementText(addressName2, addressName2Txt);
		setTextElementText(city, cityTxt);
		setTextElementText(state, stateTxt);
		setTextElementText(postcode, postcodeTxt);
		setTextElementText(mobileNumber, mobileNumberTxt);
		setTextElementText(password, passwordTxt);
		setTextElementText(confirmPassword, confirmPasswordTxt);
		clickButton(recaptcha_checkbox);
	}

}
