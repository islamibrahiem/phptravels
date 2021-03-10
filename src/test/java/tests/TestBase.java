
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

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Helper;

public class TestBase {
	public static WebDriver driver;
	protected static  Faker fakeData = new Faker();
	protected static  String test_firstNameTxt = fakeData.name().username();
	protected static  String test_lastNameTxt = fakeData.name().lastName();
	protected static  String test_emailTxt = fakeData.internet().emailAddress();
	protected static  String test_password = fakeData.number().digits(10).toString();
	protected static  String test_adress1 = fakeData.name().title();
	protected static  String test_adress2 = fakeData.name().title();
	protected static  String test_city = "cairo";
	protected static  String test_state = "cairo";
	protected static  String test_zipcode = fakeData.number().digits(5).toString();
	protected static  String test_phoneNumber = fakeData.number().digits(11).toString();
	protected static  String test_cardHolderFirstnameTxt = fakeData.name().username();
	protected static  String test_cardHolderLastnameTxt = fakeData.name().lastName();
	protected static  String test_cardNumber = fakeData.number().digits(16).toString();
	protected static  String test_cvv = fakeData.number().digits(3).toString();
	protected static  String test_FromCity = "Cairo";
	protected static  String test_ToCity = "Rome";
 

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
