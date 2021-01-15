package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HotelReservationDetails extends PageBase{

	public HotelReservationDetails(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}

	@FindBy(linkText = "FACILITIES")
	WebElement facilities;
	@FindBy (xpath = "//*[@id=\"detail-content-sticky-nav-02\"]/form/div/div[2]/div/div[2]/div/div[2]/h5/div/label")
	WebElement executiveSuite;
	@FindBy( xpath = "//*[@id=\"detail-content-sticky-nav-02\"]/form/div/div[2]/div/div[2]/div/div[2]/div[3]/div/select")
	WebElement roomCount;
	@FindBy(css = "button.book_button.btn.btn-success.btn-block.btn-lg.chk")
	WebElement bookNow;
	@FindBy(name = "logged")
	WebElement confirmThisBooking;
	@FindBy(css = "button.btn.btn-primary")
	WebElement payNow;



	public void reserveHotelWithMoreDetails() throws InterruptedException
	{
		clickButton(facilities);
		Thread.sleep(5000);
		clickButton(executiveSuite);
		selectOptions = new Select(roomCount);
		selectOptions.selectByVisibleText("2");
		scrollToBottom();
		clickButton(bookNow);
		scrollToBottom();
		clickButton(confirmThisBooking);
		Thread.sleep(10000);
		clickButton(payNow);
	}

}
