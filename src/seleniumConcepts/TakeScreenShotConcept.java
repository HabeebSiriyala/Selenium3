package seleniumConcepts;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotConcept {

		
		
		public static void main(String[] args) throws IOException {
			
			System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver(); // Launch Chrome Browser
			
			driver.manage().window().maximize();  //  Maximize the window.
			driver.manage().deleteAllCookies(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  // Wait For Page To Load
			
			driver.get("https://www.amazon.com/");
			driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]")).click();
			  //Take Screenshot And Store as a file format
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  //Now Copy the screenshot to desired location using copyFile //method
	         //The below method will save the screen shot in d drive with name "screenshot.png"
	        FileUtils.copyFile(scrFile, new File("E:\\Users\\workspace\\Selenium3\\src\\seleniumConcepts\\amazon12.png"));
			
	       // File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        //FileUtils.copyFile(scr, new File("D:\\screenshot.png"));
			

	}
}
