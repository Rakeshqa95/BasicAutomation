package intro;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	@SuppressWarnings("deprecation")
	   public static void main(String[] args) {
		   // TODO Auto-generated method stub

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\RakeshPatil\\Downloads\\chromedriver_win32\\chromedriver.exe");

		       ChromeDriver driver = new ChromeDriver();
		
		
		          String baseUrl = "http://demo.guru99.com/test/login.html";
	              driver.get(baseUrl);	

		          System.out.println(driver.getTitle());
	              System.out.println(driver.getCurrentUrl());
	                 
	            //Get the WebElement corresponding to the Email Address(TextField)		
	             WebElement email = driver.findElement(By.id("email"));							
                     
	            //Get the WebElement corresponding to the Password Field		
	             WebElement password = driver.findElement(By.name("passwd")); 							
                      
	             email.sendKeys("abcd@gmail.com");					
	             password.sendKeys("abcdefghlkjl");					
	             System.out.println("Text Field Set"); 	   				
	                                   
	           //Deleting values in the text box 		
	            email.clear();	 		
	            password.clear();                         			
	            System.out.println("Text Field Cleared");            					
                                  
	            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	                     
	                         
	           //Find the submit button		
	            WebElement login = driver.findElement(By.id("SubmitLogin"));							
	                    		
	          //Using click method to submit form		
	            email.sendKeys("abcd@gmail.com");					
	            password.sendKeys("abcdefghlkjl"); 	
	                   
	             
	            login.click();			
	            System.out.println("Login Done with Click"); 
	            driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);    
                driver.close();   
                            
	}    
}