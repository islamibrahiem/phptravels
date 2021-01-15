
package tests;

import java.util.concurrent.TimeUnit;

//import org.graalvm.compiler.nodes.spi.SwitchFoldable.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Helper;

public class TestBase {
	public static WebDriver driver;

	@BeforeSuite
	@org.testng.annotations.Parameters({"browser"})
	public void openURL(@Optional("chrome") String browserName) {
		if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("chrome"))
		{

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("https://phptravels.net/home");

	}

	@AfterMethod
	public void screenshotOnfailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed!");
			System.out.println("Taking screenshot ...");
			Helper.captureScreenshot(driver, result.getName());
		}
	}

	@AfterSuite
	public void closeBrowser() {
		//driver.quit();
	}
}
