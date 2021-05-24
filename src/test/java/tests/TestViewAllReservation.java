package tests;

import org.testng.annotations.Test;

import pages.ViewAllReservation;

public class TestViewAllReservation extends TestBase {
	ViewAllReservation viewAllReservationObject; 

	@Test
	public void test_viewAllReservation () throws InterruptedException 
	{
	

		viewAllReservationObject = new ViewAllReservation(driver);
		viewAllReservationObject.clickOnMyAccountDropDownList();
		viewAllReservationObject.openAccountPage();

	}


}