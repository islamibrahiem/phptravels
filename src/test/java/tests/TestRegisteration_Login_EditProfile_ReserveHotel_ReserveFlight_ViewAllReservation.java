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
import pages.ViewAllReservation;

public class TestRegisteration_Login_EditProfile_ReserveHotel_ReserveFlight_ViewAllReservation extends TestBase{

	
	LoginPage loginPageObject;
	MyAccountPage myAccountPageObject;
	MyProfile myprofilepageObject;
	NewsLetter newLetterObject;
	HotelReservation hotelReservationObject;
	HotelReservationDetails hotelReservationDetailsObject;
	HotelPayment hotelPayment;
	FlightsReservation flightsReservationObject;
	ViewAllReservation viewAllReservationObject; 

	@Test
	public void test_inputResgistrationData () throws InterruptedException 
	{
		
		

//		loginPageObject = new LoginPage(driver);
//		loginPageObject.login(test_emailTxt, test_password);
//
//
//		myAccountPageObject.openMyProfilePage();
//
//
//		myprofilepageObject = new MyProfile(driver);
//
//		myprofilepageObject.editMyProfileData(test_firstNameTxt,
//				test_lastNameTxt,
//				test_emailTxt,
//				test_password,
//				test_password,
//				test_adress1, 
//				test_adress2, 
//				test_city,
//				test_state,
//				test_zipcode,
//				test_phoneNumber);
//
//		Thread.sleep(2000);
//
//		myAccountPageObject.openNewsLetterPage();
//
//		newLetterObject = new NewsLetter(driver);
//		newLetterObject.clickOnSubscribe();
//
//		Thread.sleep(1000);
//
//		myAccountPageObject.openHomePage();
//
//		hotelReservationObject = new HotelReservation(driver);
//		hotelReservationObject.reserveHotel();
//
//		hotelReservationDetailsObject = new HotelReservationDetails(driver);
//		hotelReservationDetailsObject.reserveHotelWithMoreDetails();
//
//		hotelPayment = new HotelPayment(driver);
//		hotelPayment.paymentMethod(test_cardHolderFirstnameTxt,
//				test_cardHolderLastnameTxt,
//				test_cardNumber,
//				test_cvv);
//
//		myAccountPageObject.openHomePage();
//		
//		flightsReservationObject = new FlightsReservation(driver);
//		flightsReservationObject.reserveFlight(test_FromCity, test_ToCity);
//		
//		hotelPayment = new HotelPayment(driver);
//		hotelPayment.paymentMethod(test_cardHolderFirstnameTxt,
//				test_cardHolderLastnameTxt,
//				test_cardNumber,
//				test_cvv);
//		
//		viewAllReservationObject = new ViewAllReservation(driver);
//		viewAllReservationObject.clickOnMyAccountDropDownList();
//		viewAllReservationObject.openAccountPage();

	}

}