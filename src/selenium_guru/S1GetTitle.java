package selenium_guru;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;


public class S1GetTitle {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //maximize the Window
		driver.manage().deleteAllCookies();   // delete All Cookies
		driver.get("http://demo.guru99.com/test/newtours/");
    	
		// -----------Get title
		String title = driver.getTitle();
		System.out.println(title);
				
		//Assert.assertEquals(title, "Mercury Tours", "Title is Not Matched");
		
		// Validation Point:

		if (title.equals("Mercury Tours")) {

			System.out.println("Correct Title");
		} else {
			System.out.println("In-correct Title");
		}

        //String expectedTitle = "Welcome: Mercury Tours";
        //String actualTitle = "";
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
//        if (actualTitle.contentEquals(expectedTitle)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }
//       
        //close Fire fox
       // driver.close();
       
    }

}