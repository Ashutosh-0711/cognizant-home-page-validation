package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//we can make every webelement private and achive encapsulation beacause we can access this element only in this class
public class BeCognizantPage extends BasePage{
		WebDriver driver;
		public BeCognizantPage(WebDriver driver) {
			super(driver);
		}
		
		@FindBy(xpath="//*[@id=\"spTopPlaceholder\"]/div/div[2]/div/div/div/div/div")
		private List<WebElement> totalview;
		
		@FindBy(xpath ="(//*[starts-with(@class,'ms-Button-flexContainer flexContainer')])[2]")
		private WebElement company;
		
		@FindBy(xpath ="(//*[starts-with(@class,'ms-Button-flexContainer flexContainer')])[3]")
		private WebElement serviceLines ;
		
		@FindBy(xpath = "(//*[starts-with(@class,'ms-Button-flexContainer flexContainer')])[4]")
		private WebElement SalesResources;
		
		@FindBy(xpath = "(//*[starts-with(@class,'ms-Button-flexContainer flexContainer')])[5]")
		private WebElement MarketandCountries;
		
		@FindBy(xpath ="(//*[starts-with(@class,'ms-Button-flexContainer flexContainer')])[6]")
		private WebElement CorporateFunction;
		
		@FindBy(xpath ="(//*[starts-with(@class,'ms-Button-flexContainer flexContainer')])[7]")
		private WebElement people;
		
		@FindBy(xpath ="//i[@data-icon-name=\"More\"]")
		private WebElement otheroptions ;
		
		@FindBy(xpath = "//ul[@role='presentation']//descendant::a")
		private List<WebElement> options;
		
		
		public void total_view() {
			System.out.println("Page header view conaints the following options :-");
			for(WebElement view : totalview) {
				System.out.println(view.getText());
			}
			System.out.println("The total option in header is :- "+" "+ totalview.size());
			
		}
		

		public void click_company() {
			company.click();
			
			System.out.println("-------------------------------------FIRST DROPDOWN ------------------------------------------");
			System.out.println(company.getText());
			    for(WebElement option : options) {
			    	System.out.println((option.getText()));
			    }
			    
				System.out.println("The total options in dropdown :- " + options.size());
				
			
		}
		
		public void click_serviceLines() {
			serviceLines.click();
			System.out.println("-------------------------------------SECOND DROPDOWN ------------------------------------------");
			System.out.println(serviceLines.getText());

			for(WebElement option : options) {
		    	System.out.println((option.getText()));
		    }
		    
			System.out.println("The total options in dropdown :- " + options.size());
			
			
		}
		
		public void click_SalesResources() {
			SalesResources.click();
			System.out.println("-------------------------------------THIRD DROPDOWN ------------------------------------------");
			System.out.println(SalesResources.getText());

			for(WebElement option : options) {
		    	System.out.println((option.getText()));
		    }
		    
			System.out.println("The total options in dropdown :- " + options.size());
			
			
		}
		
		public void click_marketandcountries() {
			MarketandCountries.click();
			System.out.println("-------------------------------------FOURTH DROPDOWN ------------------------------------------");
			System.out.println(MarketandCountries.getText());

			//List<String> shubham = new ArrayList<>();
			for(WebElement option : options) {
		    	System.out.println((option.getText()));
		    }
		    
			System.out.println("The total options in dropdown :- " + options.size());
			//return shubham;
			
		}
		
		public void click_CorporateFunction() {
			CorporateFunction.click();
			System.out.println("-------------------------------------FIFTH DROPDOWN ------------------------------------------");
			System.out.println(CorporateFunction.getText());

			for(WebElement option : options) {
		    	System.out.println((option.getText()));
		    }
		    
			System.out.println("The total options in dropdown :- " + options.size());
			
			
		}
		
		public void click_people() {
			people.click();
			System.out.println("-------------------------------------SIXTH DROPDOWN ------------------------------------------");
			System.out.println(people.getText());

			for(WebElement option : options) {
		    	System.out.println((option.getText()));
		    }
		    
			System.out.println("The total options in dropdown :- " + options.size());
			
		}
		
		public void click_otheroptions() {
			otheroptions.click();
			System.out.println("-------------------------------------SEVENTH DROPDOWN ------------------------------------------");
			

			for(WebElement option : options) {
		    	System.out.println((option.getText()));
		    }
		    
			System.out.println("The total options in dropdown :- " + options.size());
			
		}
		
		
}
