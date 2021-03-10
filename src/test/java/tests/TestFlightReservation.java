package tests;

import org.testng.annotations.Test;

import pages.FlightsReservation;
import pages.MyAccountPage;

public class TestFlightReservation extends TestBase {
	MyAccountPage myAccountPageObject;
	FlightsReservation flightsReservationObject;
	
	@Test
	public void test_FlightReservation () throws InterruptedException 
	{

		myAccountPageObject = new MyAccountPage(driver);
		myAccountPageObject.openHomePage();
		
		flightsReservationObject = new FlightsReservation(driver);
		flightsReservationObject.reserveFlight(test_FromCity, test_ToCity);
	
	}

}
