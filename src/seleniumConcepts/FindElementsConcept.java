package seleniumConcepts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {
	
public static void main(String[] args) {
		
		// --------The Path of the Google Chrome in WebDriver
	System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// -------------it creates the driver object
		WebDriver driver = new ChromeDriver();

		// --------Maximize the window.
		driver.manage().window().maximize();

		// ------Deleting all the cookies of the domain
		driver.manage().deleteAllCookies();

		// -----------it opens the site url
		driver.get("http://jqueryui.com/");
		
		//1.get the total count of links on the page 
		//2.get the text of each link on the page
		
		// All the links are represented by <a> html tag
		
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		//size of the linklists
		System.out.println(linkList.size());
		
		for(int i=0; i<linkList.size(); i++){
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}
		
	}
}
