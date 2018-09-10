package selenium_guru;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;		

public class S6Login {	
	
    public static void main(String[] args) throws InterruptedException {	
    	
    	// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver", "E:\\habeeb\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  //maximize the Window
		driver.manage().deleteAllCookies();   // delete All Cookies
    
    	driver.get("http://demo.guru99.com/test/login.html");
    		
      
        //String baseUrl = "http://demo.guru99.com/test/login.html";					
        //driver.get(baseUrl);					

        // Get the WebElement corresponding to the Email Address(TextField)		
        WebElement email = driver.findElement(By.id("email"));							

        // Get the WebElement corresponding to the Password Field		
        WebElement password = driver.findElement(By.name("passwd"));							

        email.sendKeys("abcd@gmail.com");					
        password.sendKeys("abcdefghlkjl");					
        System.out.println("Text Field Entered");
        
         Thread.sleep(2000);
         
        // Deleting values in the text box		
        email.clear();			
        password.clear();			
        System.out.println("Text Field Cleared");					

        // Find the submit button		
        WebElement login = driver.findElement(By.id("SubmitLogin"));	
        
        Thread.sleep(2000);
                    		
        // Using click method to submit form		
        email.sendKeys("abcd@gmail.com");					
        password.sendKeys("abcdefghlkjl");
        Thread.sleep(2000);
        login.click();			
        System.out.println("Login Done with Click");					
        		
        //using submit method to submit the form. Submit used on password field		
        driver.get("http://demo.guru99.com/test/login.html");					
        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");							
        driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");
        Thread.sleep(2000);
        driver.findElement(By.id("SubmitLogin")).submit();					
        System.out.println("Login Done with Submit");					
         
        driver.get("http://demo.guru99.com/test/radio.html");					
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        Thread.sleep(2000);		
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));	
        
        Thread.sleep(2000);		
        //Radio Button1 is selected		
        radio1.click();			
        System.out.println("Radio Button Option 1 Selected");					
        
        Thread.sleep(2000);
        //Radio Button1 is de-selected and Radio Button2 is selected		
        radio2.click();			
        System.out.println("Radio Button Option 2 Selected");					
        		
        // Selecting CheckBox		
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));							

        // This will Toggle the Check box 		
        option1.click();			

        // Check whether the Check box is toggled on 		
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		
         
        		
        //Selecting Checkbox and using isSelected Method		
        driver.get("http://demo.guru99.com/test/facebook.html");
        Thread.sleep(2000);		
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
        for (int i=0; i<2; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
        }		
		//driver.close();		
        		
    }		
}
