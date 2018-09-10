package selenium_guru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S5PopUpWindow {

    public static void main(String[] args) throws InterruptedException {
    	
    		System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();  //maximize the Window
			driver.manage().deleteAllCookies();   // delete All Cookies
        
        String alertMessage = "";
        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
       
        System.out.println(alertMessage);
        Thread.sleep(5000);
        driver.quit();
       
    }
}