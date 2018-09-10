package selenium_guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class S2Locators {
    public static void main(String[] args) {
    	
    	System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //maximize the Window
		driver.manage().deleteAllCookies();   // delete All Cookies
		driver.get("http://www.facebook.com");
		
//    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
//    	WebDriver driver = new FirefoxDriver();
//        String baseUrl = "http://www.facebook.com";
         String tagName = "";
        
       // driver.get(baseUrl);
		
        tagName = driver.findElement(By.id("email")).getTagName();
        System.out.println(tagName);
        //driver.close();
        //System.exit(0);
}
}
