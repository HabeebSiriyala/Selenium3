package selenium_guru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S3QuitMethod {
    public static void main(String[] args) throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //maximize the Window
		driver.manage().deleteAllCookies();   // delete All Cookies
		

        driver.get("http://www.popuptest.com/popuptest2.html");
        Thread.sleep(5000);
        driver.quit();  // using QUIT all windows will close
    }
}