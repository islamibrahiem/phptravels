package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelReservation extends PageBase {

	public HotelReservation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		jse = (JavascriptExecutor) driver;

	}

	@FindBy(css = "span.select2-chosen")
	WebElement destinationField;
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/div/input")
	WebElement destinationInput;
	@FindBy(css = "ul.select2-result-sub")
	List<WebElement> hotelsList;
	@FindBy(id = "checkin")
	WebElement checkinDate;
	
	public void reserveHotel ()
	{
		clickButton(destinationField);
		setTextElementText(destinationInput, "shar");
		hotelsList.get(0).click();
		jse.executeScript("document.getElementById('checkin').value = '09/01/2021'");
		jse.executeScript("document.getElementById('checkout').value = '11/01/2021'");
	}
		
}
