package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest1 {

	
	WebDriver driver;
	

	@BeforeMethod
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //launch Chrome
		driver.manage().window().maximize();  //maximize the Window
		driver.manage().deleteAllCookies();   // delete All Cookies
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com/");
	}
	
//	@Test
//	public void TitleTest(){
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//	}
	
//	@Test
//	public void googleLogoTest(){
//		boolean b1 = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
//	}

}
	