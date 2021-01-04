package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsTab extends PageBase{

	public HotelsTab(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
    @FindBy(linkText = "HOTELS")
    WebElement hotelsTab;
	@FindBy(css = "input.select2-input")
	WebElement destinatinField;
	

}
