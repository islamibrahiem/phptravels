package tests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.FlightsReservation;
import pages.HomePage;
import pages.HotelPayment;
import pages.HotelReservation;
import pages.HotelReservationDetails;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.MyProfile;
import pages.NewsLetter;
import pages.RegistrationPage;

public class TestRegisteration_Login_EditProfile_ReserveHotel extends TestBase{

	HomePage homePageObject ;
	RegistrationPage registrationPageObject ;
	LoginPage loginPageObject;
	MyAccountPage myAccountPageObject;
	MyProfile myprofilepageObject;
	NewsLetter newLetterObject;
	HotelReservation hotelReservationObject;
	HotelReservationDetails hotelReservationDetailsObject;
	HotelPayment hotelPayment;
	FlightsReservation flightsReservationObject;

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
	String test_cardHolderFirstnameTxt = fakeData.name().username();
	String test_cardHolderLastnameTxt = fakeData.name().lastName();
	String test_cardNumber = fakeData.number().digits(16).toString();
	String test_cvv = fakeData.number().digits(3).toString();
	String test_FromCity = "Cairo";
	String test_ToCity = "Rome";




	@Test
	public void test_inputResgistrationData () throws InterruptedException 
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


		myAccountPageObject.openMyProfilePage();


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

		Thread.sleep(2000);

		myAccountPageObject.openNewsLetterPage();

		newLetterObject = new NewsLetter(driver);
		newLetterObject.clickOnSubscribe();

		Thread.sleep(1000);

		myAccountPageObject.openHomePage();

		hotelReservationObject = new HotelReservation(driver);
		hotelReservationObject.reserveHotel();

		hotelReservationDetailsObject = new HotelReservationDetails(driver);
		hotelReservationDetailsObject.reserveHotelWithMoreDetails();

		hotelPayment = new HotelPayment(driver);
		hotelPayment.paymentMethod(test_cardHolderFirstnameTxt,
				test_cardHolderLastnameTxt,
				test_cardNumber,
				test_cvv);

		myAccountPageObject.openHomePage();
		
		flightsReservationObject = new FlightsReservation(driver);
		flightsReservationObject.reserveFlight(test_FromCity, test_ToCity);
		
		hotelPayment = new HotelPayment(driver);
		hotelPayment.paymentMethod(test_cardHolderFirstnameTxt,
				test_cardHolderLastnameTxt,
				test_cardNumber,
				test_cvv);

	}

}