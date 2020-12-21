package tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.MyProfile;
import pages.RegistrationPage;

public class TestMyProfile extends TestBase{

	HomePage homePageObject ;
	RegistrationPage registrationPageObject ;
	LoginPage loginPageObject;
	MyAccountPage myAccountPageObject;
	MyProfile myprofilepageObject;

	Faker fakeData = new Faker();
	String test_firstNameTxt = fakeData.name().username();
	String test_lastNameTxt = fakeData.name().lastName();
	String test_phoneNumber = fakeData.number().digits(11).toString();
	String test_emailTxt = fakeData.internet().emailAddress();
	String test_password = fakeData.number().digits(10).toString();

	@Test
	public void test_inputBlogResgistrationData () throws InterruptedException 
	{
		homePageObject = new HomePage(driver);
		homePageObject.clickOnMyAccountDropDownList();
		homePageObject.openTheRegistrationPage();
		registrationPageObject = new RegistrationPage(driver);
		registrationPageObject.inputResgistrationData(
				test_firstNameTxt, 
				test_lastNameTxt,
				test_phoneNumber, 
				test_emailTxt, 
				test_password, 
				test_password);

		Thread.sleep(2000);

		myAccountPageObject = new MyAccountPage(driver);
		myAccountPageObject.clickOnMyAccountDropDownList();
		myAccountPageObject.logout();

		loginPageObject = new LoginPage(driver);
		loginPageObject.login(test_emailTxt, test_password);

		myprofilepageObject = new MyProfile(driver);
		myprofilepageObject.openMyProfile();


	}


}

