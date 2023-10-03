package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh_Patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
     //   driver.get("https://www.amazon.com/");
        
       // Actions a = new Actions(driver);
        
		//a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		
		
		driver.manage().window().maximize();
       driver.get("https://qamtdmc.com/brands");
        
        Actions a = new Actions(driver);
        WebElement move= driver.findElement(By.xpath("//div[contains(@class,'mar-d_show')]//div[contains(@class,'selected-lang')][normalize-space()='US English']"));
        
        a.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Find brand, location and showroom']"))).click().keyDown(Keys.SHIFT).sendKeys("hello");
        
        //move to specific element
		a.moveToElement(move).contextClick().build().perform();
		
		System.out.println("Done");        
				
	}
}
