package tests;

import org.openqa.selenium.support.ui.Select;
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
	String test_emailTxt = fakeData.internet().emailAddress();
	String test_password = fakeData.number().digits(10).toString();
	String test_adress1 = fakeData.name().title();
	String test_adress2 = fakeData.name().title();
	String test_city = "cairo";
	String test_state = "cairo";
	String test_zipcode = fakeData.number().digits(5).toString();
	String test_phoneNumber = fakeData.number().digits(11).toString();



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


		myAccountPageObject.openMyProfile();

		myprofilepageObject = new MyProfile(driver);

		myprofilepageObject.editMyProfileData(test_firstNameTxt,
				test_lastNameTxt,
				test_emailTxt,
				test_password,
				test_password,
				test_adress1, 
				test_adress2, 
				test_city,
				test_state,
				test_zipcode,
				test_phoneNumber);
	}

}
