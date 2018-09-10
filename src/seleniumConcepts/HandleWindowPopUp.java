package seleniumConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {
	

public static void main(String[] args) throws InterruptedException {
		
		// --------The Path of the Google Chrome in WebDriver
	System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");

		// -------------it creates the driver object
		WebDriver driver = new ChromeDriver();

		// --------Maximize the window.
		driver.manage().window().maximize();

		// ------Deleting all the cookies of the domain
		driver.manage().deleteAllCookies();
		
		
		//----------Diff types of popups
		
		// 1.alerts-------javaScript Pop up----Alert API(accept, dismiss)
		// 2.file upload pop up-------browse button---(type= file, senKeys(path)
		// 3.Browser Window PopUp----Advertisement popup----(WindowHandler API - getwindowhandles() )
		

		// -----------it opens the site url
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		
		Set<String> handler= driver.getWindowHandles();
		
		Iterator<String> it = handler.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id:  "+parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("child window id:  "+childWindowId);
		
		driver.switchTo().window(childWindowId);
		
		Thread.sleep(2000);
		
		System.out.println("child window pop up title : "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		Thread.sleep(2000);
		
		System.out.println("parent window  title : "+driver.getTitle());
		
		
		
		

	}
}
