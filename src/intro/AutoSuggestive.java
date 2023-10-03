package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RakeshPatil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.markettimeqa.com/shop");
   
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[@ng-reflect-ng-class='[object Object]']")).click();
         
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@placeholder='Enter MarketTime Username']")).sendKeys("NewBuyer7770");
		 driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Reptime1!");
		 
		 driver.findElement(By.xpath("//span[@class='p-button-label ng-star-inserted']")).click();
		 
		
	}

}
