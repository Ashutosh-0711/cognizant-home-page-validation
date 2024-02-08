package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import PageObjects.BeCognizantPage;
import PageObjects.UserValidation;
import TasteBase.BaseClass;

public class TC_002_ClickDropdown extends BaseClass{
		
	
	
	
	@Test
	public void Click_Dropdown() {
		BeCognizantPage bp = new BeCognizantPage(driver);
		
		bp.click_company();
		logger.info("*********** Starting the TC_001_ClickDropdown***********");
		logger.info("Clicked on the company dropdown and get options from it");
		
		bp.click_serviceLines();
		logger.info("Clicked on the servicelines dropdown and get options from it");

		bp.click_SalesResources();
		logger.info("Clicked on the salesresources dropdown and get options from it");

		bp.click_marketandcountries();
		logger.info("Clicked on the market and services dropdown and get options from it");

		bp.click_CorporateFunction();
		logger.info("Clicked on the corporate function dropdown and get options from it");

		bp.click_people();
		logger.info("Clicked on the people dropdown and get options from it");

		bp.click_otheroptions();
		logger.info("Clicked on the otheroption dropdown and get options from it");
		
		logger.info("*********End of TC_001_ClickDropdown");

		
		
	}
}
