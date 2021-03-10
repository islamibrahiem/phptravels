package tests;

import org.testng.annotations.Test;

import pages.MyAccountPage;
import pages.MyProfile;
import pages.NewsLetter;

public class TestEditProfile extends TestBase {
	MyAccountPage myAccountPageObject;
	MyProfile myprofilepageObject;
	NewsLetter newLetterObject;

 
	@Test
	public void test_EditProfile () throws InterruptedException 
	{
		myAccountPageObject = new MyAccountPage(driver);
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



	}
}
