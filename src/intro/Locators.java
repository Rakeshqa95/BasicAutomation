package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		  
		
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\RakeshPatil\\Downloads\\chromedriver_win32\\chromedriver.exe");
	       ChromeDriver driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       
           driver.get("https://rahulshettyacademy.com/locatorspractice/");
           driver.findElement(By.id("inputUsername")).sendKeys("rahul");
           driver.findElement(By.name("inputPassword")).sendKeys("hello123");
           driver.findElement(By.className("signInBtn")).click(); 
           System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
           driver.findElement(By.linkText("Forgot your password?")).click();
           Thread.sleep(1000); 
			
           
           driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
           driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
           driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
	       
           driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
           driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[3]")).sendKeys("9876543231");
           driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
           
           System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
           driver.findElement(By.xpath("//button[normalize-space()='Go to Login']")).click();  
           Thread.sleep(1000);  
          
           driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");  
           driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");  
           driver.findElement(By.id("chkboxOne")).click();  
           driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click(); 
           
           
           
        }
}