package selenium_guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S4SwitchTo {
	  public static void main(String[] args) {
		  
		    System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();  //maximize the Window
			driver.manage().deleteAllCookies();   // delete All Cookies
			
		  
		  	
	        driver.get("http://demo.guru99.com/selenium/deprecated.html");
	        driver.switchTo().frame("packageFrame");
	        driver.findElement(By.linkText("Alert")).click();
	       // driver.close(); 
	    }
}
