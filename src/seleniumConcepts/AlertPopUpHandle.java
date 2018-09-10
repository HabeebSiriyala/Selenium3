package seleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Launch Chrome Browser
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  // Enter Url
		
		driver.findElement(By.name("proceed")).click();  // click on go button
		
		Thread.sleep(5000);
		
		Alert alert= driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text= alert.getText();
		
		// validation For Alert
		if(text.equals("Please enter a valid user name")){
			
			System.out.println("Correct Alert Message");
		}
		else{
			System.out.println("In-Correct Alert Message");
		}
		
		alert.accept();   // click on OK Button
		
		//alert.dismiss();  // Click on cancel Button
		
		
		
		
		
	}

}
