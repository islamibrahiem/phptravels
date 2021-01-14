package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HotelPayment extends PageBase {

	public HotelPayment(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText = "Select Payment Method")
	WebElement selectPaymentMethodBtn; 
	@FindBy(xpath = "//*[@id=\"gateway_chosen\"]/div/ul/li[4]")
	WebElement creditcard;
	@FindBy(id ="card-holder-firstname")
	WebElement cardHolderFirstname;
	@FindBy(id="card-holder-lastname")
	WebElement cardHolderLastname;
	@FindBy(id="card-number")
	WebElement cardNumber;
	@FindBy(id="expiry-month")
	WebElement expiryMonth;
	@FindBy(id="expiry-year")
	WebElement expiryYear;
	@FindBy(id="cvv")
	WebElement cvv;
	@FindBy(css ="button.btn.btn-success.btn-lg.paynowbtn.go-right")
	WebElement payNow;


	public void paymentMethod (String cardHolderFirstnameTxt, 
			String cardHolderLastnameTxt ,
			String cardNumberTxt,
			String cvvTxt) throws InterruptedException
	{

		clickButton(selectPaymentMethodBtn);
		clickButton(creditcard);
		setTextElementText(cardHolderFirstname, cardHolderFirstnameTxt);
		setTextElementText(cardHolderLastname, cardHolderLastnameTxt);
		setTextElementText(cardNumber, cardNumberTxt);
		selectOptions = new Select(expiryMonth);
		selectOptions.selectByIndex(3);
		selectOptions = new Select(expiryYear);
		selectOptions.selectByIndex(3);
		setTextElementText(cvv, cvvTxt);
		scrollToBottom();
		clickButton(payNow);



	}

}
