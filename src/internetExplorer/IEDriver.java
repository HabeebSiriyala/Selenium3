package internetExplorer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver","C:\\habeeb\\Selenium\\IEDriverServer_Win32_3.11.1\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver(); // Launch IE Browser

		driver.navigate().to("http://www.google.com");   //Enter Url
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - " + strPageTitle);
		String title = driver.getTitle(); // Get title

		System.out.println(title);
		
		// Validation Point:

				if (title.equals("Google")) {

					System.out.println("correct title");
				} else {
					System.out.println("In-correct title");
				}


	}

}
