package chromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome11 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launch Chrome Browser

		driver.get("http://www.google.com"); // Enter URL

		String title = driver.getTitle(); // Get title

		System.out.println(title);

		// Validation Point:

		if (title.equals("Google")) {

			System.out.println("correct title");
		} else {
			System.out.println("In-correct title");
		}
		
		//driver.findElement(By.linkText("Sign in")).click();
		
		//driver.findElement(By.partialLinkText(" How to Pick")).click();
		
		//driver.findElement(By.cssSelector("#address1")).sendKeys("12 new Strt");
		
		//driver.findElement(By.className("ancAsb")).click();
		
		//Select select = new Select(driver.findElement(By.id("country")));
		         //select.selectByVisibleText("India");
		//Select select1 = new Select(driver.findElement(By.name("city48667607")));
				//select1.selectByVisibleText("Bangalore");
				

		
	}

}
