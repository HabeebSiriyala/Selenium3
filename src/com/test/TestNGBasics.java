package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	
	/*
	 * setup system property for chrome
       login method
       launch chrome browser
       Enter URL
       Google Title Test
       logOut form app
       close browser
       delete All Cookies
	 * 
	 */

	// Pre-Conditions Annotations-------starting With @Before
	@BeforeSuite//1
	public void setUp(){
		System.out.println("@BeforeSuite----setup system property for chrome");
	}
	
	@BeforeTest//2
	public void launchBrowser(){
		System.out.println("@BeforeTest----launch chrome browser");
	}
	
	@BeforeClass//3
	public void login(){
		System.out.println("@BeforeClass----login to app");
	}
	
	
	
    /*
     *  @BeforeSuite----setup system property for chrome--------I
      	@BeforeTest----launch chrome browser--------II
       	@BeforeClass----login to app--------III
       	
        @BeforeMethod----Enter URL
 		@Test----Google Logo Test
		@AfterMethod----logOut form app
		
        @BeforeMethod----Enter URL
 		@Test----Google Title Test
		@AfterMethod----logOut form app
		
		@BeforeMethod----Enter URL
		@Test----Search Test
		@AfterMethod----logOut form app
		
		@AfterClass----close browser
		@AfterTest----delete All Cookies
     * 
     */
	@BeforeMethod//4
	public void enterURL(){
		System.out.println("@BeforeMethod----Enter URL");
	}
	
	
	// Test Cases--------Starting With @Test
	@Test//5
	public void googleTitleTest(){
		System.out.println("@Test----Google Title Test");
	}
	
	@Test
	public void searchTest(){
		System.out.println("@Test----Search Test");
	}
	
	@Test
	public void googleLogoTest(){
		System.out.println("@Test----google Logo Test");
	}   
	
	
	// Post-Conditions Annotations-------starting With @After
	@AfterMethod//6
	public void logOut(){
		System.out.println("@AfterMethod----logOut form app");
	}
	
	@AfterTest//8
	public void deleteAllCookies(){
		System.out.println("@AfterTest----delete All Cookies");
	}
	
	@AfterClass//7
	public void closeBrowser(){
		System.out.println("@AfterClass----close browser");
	}
	
	@AfterSuite//9
	public void generateTestReport(){
		System.out.println("@AfterSuite----Generate Test Report");
	}

}
