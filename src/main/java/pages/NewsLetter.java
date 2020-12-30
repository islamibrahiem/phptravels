package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsLetter extends PageBase{

	public NewsLetter(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(css = "span.slider.round")
	WebElement sliderRound;

	public void clickOnSubscribe()
	{
		clickButton(sliderRound);
	}

}
