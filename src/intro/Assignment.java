package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String text = "Rakesh Patil";  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RakeshPatil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmbtn")).click();  
		System.out.println(driver.switchTo().alert().getText());  
		driver.switchTo().alert().dismiss();   
	
	}
}
