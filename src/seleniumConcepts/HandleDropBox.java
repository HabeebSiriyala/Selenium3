package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launch Chrome Browser
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");  // Enter Url
		
		//Handle Drop Box 
		Select select = new Select(driver.findElement(By.id("country")));
		select.selectByVisibleText("China");
		
		
	}

}
