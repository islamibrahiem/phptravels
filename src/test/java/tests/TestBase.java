//Windows branch
package tests;

import java.util.concurrent.TimeUnit;

//import org.graalvm.compiler.nodes.spi.SwitchFoldable.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;

//import com.beust.jcommander.Parameters;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import utilities.Helper;

//public class TestBase extends AbstractTestNGCucumberTests{

public class TestBase {
	public static WebDriver driver;

	@BeforeSuite
	@org.testng.annotations.Parameters({"browser"})
	public void openURL(@Optional("chrome") String browserName) {
		if(browserName.equalsIgnoreCase("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver");
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("chrome"))
		{

			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver");
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("chrome-headless"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			options.addArguments("--window-size=1920,1080");
			driver = new ChromeDriver(options);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("https://phptravels.com/demo/");

	}

	//	@AfterMethod
	//	public void screenshotOnfailure(ITestResult result) {
	//		if (result.getStatus() == ITestResult.FAILURE) {
	//			System.out.println("Failed!");
	//			System.out.println("Taking screenshot ...");
	//			Helper.captureScreenshot(driver, result.getName());
	//		}
	//	}

	@AfterSuite
	public void closeBrowser() {
		//driver.quit();
	}
}
