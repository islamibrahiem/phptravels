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
	
	
	public void inputTheRegisterationData (String firstNameTxt,String lastNameTxt) {
		setTextElementText(firstName, firstNameTxt);
		setTextElementText(lastName, lastNameTxt);
	}

}
