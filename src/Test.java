import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","C:\\Users\\RakeshPatil\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https:\\google.com");
     System.out.println("Hello Test Data");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     Thread.sleep(1000);
     driver.findElement(By.xpath("")).click();
     driver.findElement(By.id("")).sendKeys("");
     
     WebElement login = driver.findElement(By.name(""));
     login.click();
     
     
     WebElement submit = driver.findElement(By.cssSelector(""));
     submit.sendKeys("");
     
      driver.quit(); 
   
	}
}
