package tests;

import org.testng.annotations.Test;

import pages.MyAccountPage;
import pages.Payment;

public class TestPayment extends TestBase {

	Payment PaymentObject;
	MyAccountPage myAccountPageObject;

	@Test
	public void test_payment () throws InterruptedException 
	{


		PaymentObject = new Payment(driver);
		PaymentObject.paymentMethod(test_cardHolderFirstnameTxt,
				test_cardHolderLastnameTxt,
				test_cardNumber,
				test_cvv);

		myAccountPageObject.openHomePage();


	}

}
