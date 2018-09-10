package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	
	@Test
	public void loginTest(){
		System.out.println("login test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest(){
		System.out.println("Home Page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest() {
		System.out.println("search Page Test");
	}

	@Test(dependsOnMethods="loginTest")
	public void RegPageTest(){
		System.out.println("login test");
	}
	
}
