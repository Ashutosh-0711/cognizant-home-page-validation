package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserValidation extends BasePage{
	
	public UserValidation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}

	@FindBy(id = "meInitialsButton")
	private WebElement button;
	
	
	@FindBy(xpath = "//div[@id='mectrl_currentAccount_primary']")
	private WebElement userName;
	
	@FindBy(xpath = "//div[@id='mectrl_currentAccount_secondary']")
	private WebElement Email;
	
	
	
	//Method to click on the User Details
	public void clickUserDetails() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",button);
 
	}
	//Method to get get user name
	public void getUserName() {
		String s1=userName.getText();
		System.out.println("Account Name:- "+ "" +s1);
		//return s1;
	}
	//Method to get user email
	public void getUserEmail() {
		String s2= Email.getText();
		System.out.println("Account Email:- " + ""+ s2);
		//return s2;
	}
	
}
