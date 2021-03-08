package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FlightsReservation extends PageBase{

	public FlightsReservation(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;

	}
    @FindBy(linkText = "FLIGHTS")
    WebElement flightsBtn;
	@FindBy(xpath = "//*[@id=\"flights\"]/div/div/form/div/div/div[1]/div[2]/div/div/a/span")
	WebElement bookingtype; 
//	@FindBy(xpath = "//*[@id=\"flights\"]/div/div/form/div/div/div[1]/div[2]/div/div/div/ul")
//	List<WebElement> bookingtypeList;
	@FindBy(xpath = "//*[@id=\"flights\"]/div/div/form/div/div/div[1]/div[2]/div/div/div/ul/li[1]")
	WebElement firstclass;
	@FindBy(xpath = "//*[@id=\"s2id_location_from\"]/a/span[1]")
	WebElement LHE;
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/div/input")
	WebElement fromField;
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/ul")
	List<WebElement> from_CitiesList;
	@FindBy(xpath = "//*[@id=\"s2id_location_to\"]/a/span[1]")
	WebElement DXB;
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/div/input")
	WebElement toField;
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/ul")
	List<WebElement> to_CitiesList;
	@FindBy(id = "FlightsDateStart")
	WebElement flightsDateStart;
	@FindBy(xpath = "//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[3]/div/div/div[1]/div/div[2]/div/span/button[1]")
	WebElement adultIncreaseBtn;
	@FindBy(xpath = "//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[3]/div/div/div[2]/div/div[2]/div/span/button[1]")
	WebElement childIncreaseBtn;
	@FindBy(xpath = "//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[4]/button")
	WebElement searchBtn;
	@FindBy(xpath = "//*[@id=\"LIST\"]/li[1]/div/div[1]/div[2]/form/div[2]/div/button")
	WebElement bookNowBtn;
	@FindBy(css ="button.btn.btn-success.btn-lg.btn-block.completebook")
    WebElement confirmThisBookingBtn;
	public void reserveFlight (String fromFieldTxt,
			String  ToFieldTxt ) throws InterruptedException

	{
		clickButton(flightsBtn);
		clickButton(bookingtype);
		clickButton(firstclass);
		clickButton(LHE);
		setTextElementText(fromField, fromFieldTxt);
		Thread.sleep(2000);
		from_CitiesList.get(0).click();
		clickButton(DXB);
		setTextElementText(toField, ToFieldTxt);
		Thread.sleep(2000);
		to_CitiesList.get(0).click();
		jse.executeScript("document.getElementById('FlightsDateStart').value = '09/03/2021'");
		clickButton(adultIncreaseBtn);
		clickButton(childIncreaseBtn);
		clickButton(searchBtn);
		clickButton(bookNowBtn);
		scrollToBottom();
		clickButton(confirmThisBookingBtn);
	
	}

}