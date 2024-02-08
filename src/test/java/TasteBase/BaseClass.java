package TasteBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@Listeners(utilities.ExtentReportManager.class)
public class BaseClass {
	public WebDriver driver;
	public Logger logger;
	public Properties p;
	//make every method public 
	
	@BeforeClass
	@Parameters({"browser"})
	public void setup(String browser) throws IOException {
		
		
		//loading properties file
		FileReader file = new FileReader(".//src/test/resources/config.properties");
		p = new Properties();
		p.load(file);
		
		//Loadinglog4j file for that we have a LogManager class in which getLogger method we have to use
		
		logger = LogManager.getLogger(this.getClass());
		
		switch(browser.toLowerCase())
		{
		
		case "chrome" : 
			driver = new ChromeDriver();
			logger.info(browser +" "+ "browser opened successfully");
			break;
			
		case "edge" : 
			driver = new EdgeDriver(); 
			logger.info(browser + " "+ "browser opened successfully");

			break;
			
		default: 
			logger.error("No matching browser...." );
			return;
		}
		
		
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(p.getProperty("appURL"));
		logger.info("Base Page loaded sucessfully.......");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		logger.info("browser closed successfully....");
	}
}
