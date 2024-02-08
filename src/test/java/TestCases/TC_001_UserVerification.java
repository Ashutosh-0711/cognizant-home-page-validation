package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.UserValidation;
import TasteBase.BaseClass;

public class TC_001_UserVerification extends BaseClass {

	@Test
	public void UserVerification() throws InterruptedException {
		
		UserValidation uv = new UserValidation(driver);
		uv.clickUserDetails();
		logger.info("*****************Start the TC_002_UserVerification****************");

		logger.info("click on userdetail button..........");

		uv.getUserName();
		logger.info("get the user name ..........");

		uv.getUserEmail();
		logger.info("get the user Email ..........");

		logger.info("*****************End the TC_002_UserVerification****************");

	}
}
