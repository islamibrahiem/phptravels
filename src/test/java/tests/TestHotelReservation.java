package tests;

import org.testng.annotations.Test;

import pages.HotelReservation;
import pages.HotelReservationDetails;
import pages.MyAccountPage;

public class TestHotelReservation extends TestBase {
	
	MyAccountPage myAccountPageObject;
	HotelReservation hotelReservationObject;
	HotelReservationDetails hotelReservationDetailsObject;
	@Test
	public void test_hotelReservation () throws InterruptedException 
	{
		myAccountPageObject = new MyAccountPage(driver);
		myAccountPageObject.openHomePage();

		hotelReservationObject = new HotelReservation(driver);
		hotelReservationObject.reserveHotel();

		hotelReservationDetailsObject = new HotelReservationDetails(driver);
		hotelReservationDetailsObject.reserveHotelWithMoreDetails();
	}

}
