package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.driver.chrome","C:\\Users\\RakeshPatil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
	   	
	 	Thread.sleep(2000L);
		
	 	
	 	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	 	int i=1;
	 while(i<5)
	 	{
		    Thread.sleep(1000);
		 	driver.findElement(By.id("hrefIncAdt")).click();
	 	    i++;
	 	    System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	 		 
	 	}
	 	
	 driver.findElement(By.id("btnclosepaxoption")).click();
	 
	}
}
