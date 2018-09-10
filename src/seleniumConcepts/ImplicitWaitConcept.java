package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {
	
public static void main(String[] args) {
		
		// --------The Path of the Google Chrome in WebDriver
	System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// -------------it creates the driver object
		WebDriver driver = new ChromeDriver();

		// --------Maximize the window.
		driver.manage().window().maximize();
		
		//------Deleting all the cookies of the domain
		driver.manage().deleteAllCookies(); 

		// -----------it opens the site url
		driver.get("https://www.ebay.com/");
		
		//--------Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		

	}
}
