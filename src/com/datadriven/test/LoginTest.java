package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	  
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();  //launch Chrome
		
		driver.manage().window().maximize();  //maximize the Window
		
		driver.manage().deleteAllCookies();   // delete All Cookies
		
		// dynamic Wait
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com");  //enter URL
	}
	
	@DataProvider
	public void getTestData(){
		
	}
	
	
	
	@Test
	public void loginTest(String username, String password)
	{
		
		
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).clear();
	    driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("fullname");
	    
	    //loginButton
	    WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	    JavascriptExecutor js = ((JavascriptExecutor) loginBtn);
	    js.executeAsyncScript("arguments[0].click();", loginBtn);
	    
	    
	}
	
	@AfterMethod
	public void close(){
	driver.close();
	}

}
