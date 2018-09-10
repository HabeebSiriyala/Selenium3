package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		// --------The Path of the Google Chrome in WebDriver
		System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// -------------it creates the driver object
		WebDriver driver = new ChromeDriver();

		// -----------it opens the site url
		driver.get("http://spicejet.com/");
		
		// --------Maximize the window.
		driver.manage().window().maximize();

		// ------Deleting all the cookies of the domain
		driver.manage().deleteAllCookies();
		
		Actions action= new Actions(driver);
		
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='header-addons']/ul/li[11]/a")).click();
		
		


	}
}
