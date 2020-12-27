package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {

	protected WebDriver driver;
	public JavascriptExecutor jse ;
	public  Select selectOptions;


	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	protected static void clickButton(WebElement button) {
		button.click();	
	}

	protected static void setTextElementText(WebElement textElement , String value) {
		textElement.sendKeys(value);

	}
	public static void clearText(WebElement element)
	{
		element.clear();
	}

	public void scrollToBottom() {
		jse.executeScript("scrollBy(0,1000)");	
	}
	public void scrollToUp() {
		jse.executeScript("scrollBy(0,-1000)");	
	}

}
