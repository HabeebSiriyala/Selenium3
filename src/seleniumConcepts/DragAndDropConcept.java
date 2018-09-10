package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
	
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
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0); // Switch to Frame if its presents
		
		Actions action= new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
		.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
		.release()
		.build()
		.perform();
		
		
	}
}
