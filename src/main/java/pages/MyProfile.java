package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MyProfile extends PageBase {

	public MyProfile(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		jse = (JavascriptExecutor) driver;
	}

	@FindBy(name = "firstname")
	WebElement firstName;
	@FindBy(name = "lastname")
	WebElement lastName;
	@FindBy(name = "email")
	WebElement email;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "confirmpassword")
	WebElement confirmPassword;
	@FindBy(name = "address1")
	WebElement address1;
	@FindBy(name = "address2")
	WebElement address2;
	@FindBy(name = "city")
	WebElement city;
	@FindBy(name = "state")
	WebElement state;
	@FindBy(name = "zip")
	WebElement zipCode;
	@FindBy(css = "a.chosen-single")
	WebElement country;
	@FindBy(css = "input.chosen-search-input")
	WebElement country_input;
	@FindBy(css = "ul.chosen-results")
	List<WebElement> countrieslist;
	@FindBy(name="phone")
	WebElement phone;
	@FindBy(css = "button.btn.btn-block.updateprofile.btn-primary")
	WebElement submitBtn;
	public  void editMyProfileData (
			String firstNameTxt,
			String lastNameTxt,
			String emailTxt,
			String passwordTxt,
			String confirmPasswordTxt,
			String adress1Txt,
			String address2Txt,
			String cityTxt,
			String stateTxt,
			String zipCodeTxt,
			String phoneTxt)
	{
		clearText(email);
		setTextElementText(email, emailTxt);
		setTextElementText(password, passwordTxt);
		setTextElementText(confirmPassword, confirmPasswordTxt);
		setTextElementText(address1, adress1Txt);
		setTextElementText(address2, address2Txt);
		setTextElementText(state, stateTxt);
		setTextElementText(city, cityTxt);
		setTextElementText(zipCode, zipCodeTxt);
		clickButton(country);
		setTextElementText(country_input, "Egypt");
		countrieslist.get(0).click();
		clearText(phone);
        setTextElementText(phone, phoneTxt);
		scrollToBottom();
		clickButton(submitBtn);
		scrollToUp();

	}




}
