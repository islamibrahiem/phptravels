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

		// TODO Auto-generated constructor stub
	}
	
  @FindBy(linkText = "FACILITIES")
  WebElement facilities;
  @FindBy (xpath = "//*[@id=\"detail-content-sticky-nav-02\"]/form/div/div[2]/div/div[2]/div/div[2]/h5/div/label")
  WebElement executiveSuite;
  @FindBy(name = "roomscount[21]")
  WebElement roomCount;
  @FindBy(css = "button.book_button.btn.btn-success.btn-block.btn-lg.chk")
  WebElement bookNow;
  
  public void reserveHotelWithMoreDetails()
  {
	  clickButton(facilities);
	  clickButton(executiveSuite);
	  selectOptions = new Select(roomCount);
	  selectOptions.selectByVisibleText("2");
	  scrollToBottom();
	  clickButton(bookNow);
	 
  }
  
}
