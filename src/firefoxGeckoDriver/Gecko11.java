package firefoxGeckoDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\habeeb\\Selenium\\geckodriver-v0.20.1-win32 (1)\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver(); // Launch firefox Browser

		driver.get("http://www.google.com"); // Enter URL

		String title = driver.getTitle(); // Get title

		System.out.println(title);

		// Validation Point:

		if (title.equals("Google")) {

			System.out.println("correct title");
		} else {
			System.out.println("In-correct title");
		}

		System.out.println(driver.getCurrentUrl()); // --- Get The Current Url

		//System.out.println(driver.getPageSource()); // ---Get The PageSource

		//driver.quit(); // ---Quit The Browser

	}

}
