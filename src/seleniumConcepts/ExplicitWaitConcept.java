package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launch Chrome Browser
		
		driver.manage().window().maximize();  //  Maximize the window.
		driver.manage().deleteAllCookies(); 
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // Wait For Page To Load
		
		driver.get("https://www.facebook.com/");
		
		clickOn(driver, driver.findElement(By.xpath("//*[@id='u_0_8']")), 20);  // Login button
		
		clickOn(driver, driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a")), 10);   // Create a page Link
		
}
    
	public static void clickOn(WebDriver driver, WebElement locator, int timeout){
        	 new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
        	 locator.click();
		
         }

	
}
